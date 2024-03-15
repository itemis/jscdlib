# jScdLib Demo
Demonstration of jScdLib.

# Build
Building with Maven >= 3.8.4 is recommended. Java 21 is required in order for the build to finish successful.  
  
`mvn clean install`

# Run
This demo requires Java 21.  

```
java --enable-preview --enable-native-access=ALL-UNNAMED -jar target/jscdlib.demo-1.10.3-SNAPSHOT-shaded.jar
```

# Usage
When running the demo, it displays a command prompt that accepts commands known to scdaemon. Run ```gpg-connect-agent /r "SCD HELP" /bye``` for a list of available commands. Type "exit" to quit the command prompt.
