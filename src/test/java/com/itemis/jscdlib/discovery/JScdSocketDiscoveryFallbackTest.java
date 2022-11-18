package com.itemis.jscdlib.discovery;

import static com.github.stefanbirkner.systemlambda.SystemLambda.withEnvironmentVariable;
import static com.itemis.fluffyj.exceptions.ThrowablePrettyfier.pretty;
import static com.itemis.jscdlib.problem.JScdProblems.JSCD_GENERAL_ERROR;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.itemis.fluffyj.tests.FluffyTestSystemProperties;
import com.itemis.jscdlib.problem.JScdException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.api.io.TempDir;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JScdSocketDiscoveryFallbackTest {

    private static final String JSCDLIB_SOCKET_FILE_PROP_KEY = "jscdlib.socket.file";
    private static final String GNUPGHOME_ENV_KEY = "GNUPGHOME";
    private static final String SOCKET_FILE_NAME = "S.scdaemon";

    @RegisterExtension
    FluffyTestSystemProperties fluffyProps = new FluffyTestSystemProperties();

    @TempDir
    Path tempDir;

    private Path testSocketFilePath;

    private JScdSocketDiscovery underTest;

    @BeforeEach
    public void setUp() throws Exception {
        testSocketFilePath = Files.createFile(tempDir.resolve(SOCKET_FILE_NAME));
        underTest = new JScdEnvSocketDiscovery();
    }

    @Test
    public void given_no_env_and_no_prop_then_jscdexception() {
        assertThatThrownBy(() -> withEnvironmentVariable(GNUPGHOME_ENV_KEY, null).execute(() -> underTest.discover()))
            .isInstanceOf(JScdException.class)
            .hasFieldOrPropertyWithValue("problem",
                JSCD_GENERAL_ERROR)
            .hasMessageContaining("Could not determine scdaemon socket file");
    }

    @Test
    public void when_only_env_then_return_its_value_plus_filename() throws Exception {
        var envValue = tempDir.toString();
        var expectedResult = Paths.get(envValue, SOCKET_FILE_NAME);
        var actualResult = withEnvironmentVariable(GNUPGHOME_ENV_KEY, envValue).execute(() -> underTest.discover());

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void when_only_prop_then_return_its_value() {
        var propValue = testSocketFilePath.toString();
        var expectedResult = Paths.get(propValue);
        System.setProperty(JSCDLIB_SOCKET_FILE_PROP_KEY, propValue);
        var actualResult = underTest.discover();

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void prop_overrides_env_if_both_exist() throws Exception {
        var propValue = testSocketFilePath.toString();
        var envValue = "envValue";
        var expectedResult = Paths.get(propValue);

        System.setProperty(JSCDLIB_SOCKET_FILE_PROP_KEY, propValue);
        var actualResult = withEnvironmentVariable(GNUPGHOME_ENV_KEY, envValue).execute(() -> underTest.discover());

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void when_file_does_not_exist_then_jscdexception() throws Exception {
        Files.delete(testSocketFilePath);

        var propValue = testSocketFilePath.toString();
        System.setProperty(JSCDLIB_SOCKET_FILE_PROP_KEY, propValue);
        assertThatThrownBy(() -> underTest.discover()).isInstanceOf(JScdException.class)
            .hasFieldOrPropertyWithValue("problem",
                JSCD_GENERAL_ERROR)
            .hasMessageContaining("Converting value '" + propValue + "' to path caused: "
                + pretty(new FileNotFoundException(testSocketFilePath + " is not a valid socket file")));
    }
}
