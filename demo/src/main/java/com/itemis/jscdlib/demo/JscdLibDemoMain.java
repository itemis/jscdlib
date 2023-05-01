package com.itemis.jscdlib.demo;

import static com.itemis.fluffyj.exceptions.ThrowablePrettyfier.pretty;
import static java.nio.charset.StandardCharsets.UTF_8;

import com.itemis.jscdlib.JScdLib;
import com.itemis.jscdlib.ScDaemonHandle;
import com.itemis.jscdlib.problem.JScdException;

import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class JscdLibDemoMain {

    private static final List<String> QUIT_CMDS = List.of("quit", "exit", "");

    public static void main(String[] args) {
        printAvailableReaders();
        try (var scdaemonHandle = JScdLib.constructScDaemonHandle(); var inputSup = new InputSupplier()) {
            var cmd = inputSup.get().trim();
            while (!QUIT_CMDS.contains(cmd.toLowerCase())) {
                trySendCommand(scdaemonHandle, cmd);
                cmd = inputSup.get().trim();
            }
            System.out.println("Exiting..");
        } catch (Exception e) {
            handleError(e);
        }
    }

    private static void trySendCommand(ScDaemonHandle scdaemonHandle, String cmd) {
        try {
            scdaemonHandle.sendCommand(cmd, System.out::println, System.out::println);
        } catch (JScdException e) {
            System.err.println("Error: " + e.problem().description());
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
            scanner = new Scanner(System.in, UTF_8);
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
