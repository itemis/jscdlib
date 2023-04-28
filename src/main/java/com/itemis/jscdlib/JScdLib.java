package com.itemis.jscdlib;

import static java.lang.foreign.SymbolLookup.libraryLookup;

import com.itemis.jscdlib.discovery.JScdEnvSocketDiscovery;
import com.itemis.jscdlib.discovery.JScdGpgConfSocketDiscovery;
import com.itemis.jscdlib.internal.OsDetector;
import com.itemis.jscdlib.internal.ScDaemonNativeBridge;
import com.itemis.jscdlib.internal.ScardLibNativeBridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.foreign.SegmentScope;
import java.lang.foreign.SymbolLookup;
import java.util.Set;

/**
 * Entrypoint for the JScdLib.
 */
public final class JScdLib {

    private static final Logger LOG = LoggerFactory.getLogger(JScdLib.class);

    private static final boolean IS_WINDOWS;
    private static final boolean IS_MAC;

    static {
        var osDetector = new OsDetector();
        if (osDetector.isWindows()) {
            LOG.debug("Identified OS type Windows");
            IS_WINDOWS = true;
            IS_MAC = false;
        } else if (osDetector.isMac()) {
            LOG.debug("Identified OS type Mac");
            IS_WINDOWS = false;
            IS_MAC = true;
        } else {
            LOG.debug("Identified OS type other. Assuming Linux or compatible.");
            IS_WINDOWS = false;
            IS_MAC = false;
        }
    }

    private static final Set<String> LINUX_SCDAEMON_LIB_CANDIDATES = Set.of("libassuan6-0", "libassuan.so");
    // See
    // https://github.com/gpg/gnupg/blob/25ae80b8eb6e9011049d76440ad7d250c1d02f7c/scd/scdaemon.c#L210
    private static final Set<String> LINUX_SCARD_LIB_CANDIDATES = Set.of("libpcsclite.so.1", "libpcsclite.so");

    /**
     * <p>
     * Create a new handle. The handle will use the {@link ScardLibNative} implementation
     * appropriate for the current OS.
     * </p>
     * <p>
     * <b>Be aware:</b> The handle does hold resources and should therefore be closed when not
     * needed anymore in order to prevent resource leaks.
     * </p>
     *
     * @return A new instance of {@link SCardLibHandle}.
     */
    public static SCardLibHandle constructSCardHandle() {
        ScardLibNativeBridge bridge = null;

        if (IS_WINDOWS) {
            bridge = new ScardLibNativeBridge(scope -> libraryLookup("winscard", scope));
        } else if (IS_MAC) {
            // See
            // https://github.com/gpg/gnupg/blob/25ae80b8eb6e9011049d76440ad7d250c1d02f7c/scd/scdaemon.c#L208
            bridge = new ScardLibNativeBridge(
                session -> libraryLookup("/System/Library/Frameworks/PCSC.framework/PCSC", session));
        } else {
            bridge = new ScardLibNativeBridge(scope -> loadLinuxLib(LINUX_SCARD_LIB_CANDIDATES, scope));
        }

        return new SCardLibHandle(bridge);
    }

    /**
     * <p>
     * Create a new handle. The handle will use the native implementation appropriate for the
     * current OS.
     * </p>
     * <p>
     * <b>Be aware:</b> The handle does hold resources and should therefore be closed when not
     * needed anymore in order to prevent resource leaks.
     * </p>
     *
     * @return A new instance of {@link ScDaemonHandle}.
     */
    public static ScDaemonHandle constructScDaemonHandle() {
        ScDaemonNativeBridge bridge = null;

        if (IS_WINDOWS) {
            bridge = new ScDaemonNativeBridge(scope -> libraryLookup("libassuan6-0", scope));
        } else if (IS_MAC) {
            bridge = new ScDaemonNativeBridge(scope -> libraryLookup("libassuan", scope));
        } else {
            bridge = new ScDaemonNativeBridge(scope -> loadLinuxLib(LINUX_SCDAEMON_LIB_CANDIDATES, scope));
        }

        return new ScDaemonHandle(bridge, new JScdGpgConfSocketDiscovery(new JScdEnvSocketDiscovery()));
    }

    private static SymbolLookup loadLinuxLib(Iterable<String> libNameCandidates, SegmentScope scope) {
        SymbolLookup result = null;

        var candidateIter = libNameCandidates.iterator();
        while (candidateIter.hasNext()) {
            var candidate = candidateIter.next();
            try {
                result = libraryLookup(candidate, scope);
            } catch (IllegalArgumentException e) {
                var msg = "Could not get a handle on lib.";
                if (candidateIter.hasNext()) {
                    LOG.debug(msg, e);
                } else {
                    LOG.error(msg + " Giving up.", e);
                    throw e;
                }
            }
        }

        return result;
    }
}
