# jScdLib
A library that may be used to work with [scdaemon](https://www.gnupg.org/documentation/manuals/gnupg/Invoking-SCDAEMON.html#Invoking-SCDAEMON) and [SmartCards](https://en.wikipedia.org/wiki/Smart_card). This may be useful for client software that deals with security keys based on OpenPGP Smart Card standards.

# Build
Building with Maven >= 3.8.4 is recommended. Java 17 is required in order for the build to finish successful.   
  
`mvn clean install`

# Run
This library requires Java 17.

# Demo
See `demo/README.md`

# IDE Setup
Due to the usage of Java 17 incubator code, the following special setup is required:  
* Add the following to the startup JVM options of your IDE (e. g. eclipse.ini):

```
--add-modules=ALL-SYSTEM,jdk.incubator.foreign
--enable-native-access=ALL-UNNAMED
--add-opens=java.base/java.util=ALL-UNNAMED
--add-opens java.base/java.lang=ALL-UNNAMED
```
* Add the following to JVM options to launch configurations in order to be able to run from within the IDE:
```--add-modules jdk.incubator.foreign --enable-native-access=ALL-UNNAMED```

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