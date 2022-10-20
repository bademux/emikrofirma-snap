package com.github.bademux.emk.utils;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;

@Slf4j
@UtilityClass
public class ReportUtils {

    public static String createMemoryUsage() {
        StringBuilder body = new StringBuilder();
        body.append("#######");
        body.append(System.lineSeparator());
        try {
            body.append("os.name ").append(System.getProperty("os.name")).append(System.lineSeparator());
            body.append("os.arch ").append(System.getProperty("os.arch")).append(System.lineSeparator());
            body.append("java.version ").append(System.getProperty("java.version")).append(System.lineSeparator());
            body.append("java.vendor ").append(System.getProperty("java.vendor")).append(System.lineSeparator());
            body.append("java.vm.name ").append(System.getProperty("java.vm.name")).append(System.lineSeparator());
            body.append("file.encoding ").append(System.getProperty("file.encoding")).append(System.lineSeparator());
            MemoryUsage memoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
            body.append("memory init ").append(memoryUsage.getInit() / 1024L / 1024L).append(" MB").append(System.lineSeparator());
            body.append("memory max ").append(memoryUsage.getMax() / 1024L / 1024L).append(" MB").append(System.lineSeparator());
            body.append("memory committed ").append(memoryUsage.getCommitted() / 1024L / 1024L).append(" MB").append(System.lineSeparator());
            body.append("memory used ").append(memoryUsage.getUsed() / 1024L / 1024L).append(" MB").append(System.lineSeparator());
            body.append(System.lineSeparator());
        } catch (Exception e) {
            log.error("Something bad happened", e);
        }
        body.append(System.lineSeparator());
        body.append("#######");
        body.append(System.lineSeparator());
        return body.toString();
    }


}
