# jScdLib
A library that may be used to work with [scdaemon](https://www.gnupg.org/documentation/manuals/gnupg/Invoking-SCDAEMON.html#Invoking-SCDAEMON) and [SmartCards](https://en.wikipedia.org/wiki/Smart_card). This may be useful for client software that deals with security keys based on OpenPGP Smart Card standards.

# Build
Building with Maven >= 3.9.x is recommended. Java 20 is required in order for the build to finish successful.   
  
`mvn clean install`

# Run
This library requires Java 20.

# Demo
See `demo/README.md`

# Eclipse IDE Setup
Due to the usage of Java 20 preview code, the following special setup is required:  
  
* Add the following JVM options to launch configurations of tests in order to be able to run JUnit tests from within the IDE:

```
-ea --enable-preview --enable-native-access=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
--add-opens java.base/java.lang=ALL-UNNAMED
```
  
* Add the following JVM options to launch configurations of Main classes in order to be able to run from within the IDE:

```
--enable-preview
```

# Usage
## List available SmartCard readers
```
try (var scardHandle = JScdLib.constructSCardHandle()) {
    scardHandle.listReaders().forEach(System.out::println);
}
```

## Send command to scdaemon
```
try (var assuanHandle = JScdLib.constructAssuanHandle()) {
    // SmartCard must be attached in order for this to show output.
    assuanHandle.sendCommand("SERIALNO", System.out::println, System.out::println);
}
```