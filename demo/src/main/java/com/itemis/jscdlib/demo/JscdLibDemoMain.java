package com.itemis.jscdlib.demo;

import static com.itemis.fluffyj.exceptions.ThrowablePrettyfier.pretty;

import com.itemis.jscdlib.JScdLib;

import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class JscdLibDemoMain {

    private static final List<String> QUIT_CMDS = List.of("quit", "exit", "");

    public static void main(String[] args) {
        printAvailableReaders();
        try (var assuanHandle = JScdLib.constructAssuanHandle(); var inputSup = new InputSupplier()) {
            var cmd = inputSup.get().trim();
            while (!QUIT_CMDS.contains(cmd.toLowerCase())) {
                assuanHandle.sendCommand(cmd, System.out::println, System.out::println);
                cmd = inputSup.get().trim();
            }
            System.out.println("Exiting..");
        } catch (Exception e) {
            handleError(e);
        }
    }

    private static void printAvailableReaders() {
        try (var scardHandle = JScdLib.constructSCardHandle()) {
            var availableReaders = scardHandle.listReaders();
            System.out.println("List of available smart card readers:");
            if (availableReaders.isEmpty()) {
                System.out.println("\tNone available");
            } else {
                for (var i = 0; i < availableReaders.size(); i++) {
                    System.out.println("\t" + (i + 1) + ") " + availableReaders.get(i));
                }
            }
        } catch (Exception e) {
            handleError(e);
        }
    }

    private static void handleError(Throwable t) {
        t.printStackTrace();
        System.err.println("Error: " + pretty(t));
    }

    private static class InputSupplier implements Supplier<String>, AutoCloseable {

        private final Scanner scanner;

        public InputSupplier() {
            scanner = new Scanner(System.in);
        }

        @Override
        public String get() {
            System.out.print("> ");
            return scanner.nextLine();
        }

        @Override
        public void close() throws Exception {
            scanner.close();
        }
    }

}
