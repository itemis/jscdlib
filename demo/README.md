# jScdLib Demo
Demonstration of jScdLib.

# Build
Building with Maven >= 3.8.4 is recommended. Java 22 is required in order for the build to finish successful.  
  
`mvn clean install`

# Run
This demo requires Java 22.  

```
java --enable-native-access=ALL-UNNAMED -jar target/jscdlib.demo-1.11.0-shaded.jar
```

# Known Issues
## Could not find library libassuan6-0.dll on Windows

* You need a recent installation of [gpg4win](https://gpg4win.de)
* Add `<GPG_HOME>/bin_64` to your system's `PATH` variable
* Make sure the new entry comes before the `<GPG_HOME>/bin` entry.
* Reload your shell or IDE and try again.

# Usage
When running the demo, it displays a command prompt that accepts commands known to scdaemon. Run ```gpg-connect-agent /r "SCD HELP" /bye``` for a list of available commands. Type "exit" to quit the command prompt.
