package com.github.bademux.emk;

import com.github.bademux.emk.app.FXApp;

import java.io.IOException;
import java.nio.file.Path;
import java.security.Security;
import java.util.Optional;

import static java.nio.file.Files.createDirectories;
import static java.util.function.Predicate.not;

public class Application {

    private static final Path HOME_DIR = Path.of(System.getProperty("user.home"), "AKMF").toAbsolutePath();
    private static final Path REPORT_LOG = getAndInitReport();

    public static void main(String[] args) throws IOException {
        createDirectories(getHomeDir());
        Security.setProperty("crypto.policy", "unlimited");
        System.setProperty("com.sun.xml.internal.bind.v2.bytecode.ClassTailor.noOptimize", "true");
        javafx.application.Application.launch(FXApp.class, args);
    }

    public static Path getReportLog() {
        return REPORT_LOG;
    }

    public static Path getHomeDir() {
        return HOME_DIR;
    }

    private static Path getAndInitReport() {
        return Optional.ofNullable(System.getProperty("org.slf4j.simpleLogger.logFile"))
                .filter(not(s -> s.startsWith("System.")))
                .map(HOME_DIR::resolve)
                .map(path -> {
                    System.setProperty("org.slf4j.simpleLogger.logFile", path.toString());
                    return path;
                })
                .orElse(null);
    }

}
