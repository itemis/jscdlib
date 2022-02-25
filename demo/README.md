# jScdLib Demo
Demonstration of jScdLib.

# Build
Building with Maven >= 3.8.4 is recommended. Java 17 is required in order for the build to finish successful.  
  
`mvn clean install`

# Run
This demo requires Java 17.  

```
java --add-modules jdk.incubator.foreign --enable-native-access=ALL-UNNAMED -jar target/jscdlib.demo-1.2.0-SNAPSHOT-shaded.jar
```
