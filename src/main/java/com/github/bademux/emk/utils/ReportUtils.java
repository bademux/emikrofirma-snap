package com.github.bademux.emk.utils;

import a.a.a.c.e.EXK;
import a.a.a.c.e.a.e.EWF;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.g.b.FCW;
import lombok.experimental.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

@UtilityClass
public class ReportUtils {
    public static URI createEmailUri(File reportFile, List<Throwable> exceptions) throws URISyntaxException {
        return createEmailUri(reportFile, FCW.getInstance().getMessageForKey("micro.error.mail.subject"), exceptions.toArray(Throwable[]::new));
    }

    public static URI createEmailUri(File reportFile, String emailSubject, Throwable... throwables) throws URISyntaxException {
        StringBuilder body = new StringBuilder(createMemoryUsage())
                .append(createThrowableDesc(throwables))
                .append(createReportFileRecord(reportFile));
        String address = new StringBuilder(createAddressAndSubject(emailSubject))
                .append(createBodyParam(body.toString()))
                .append("&attachment=").append(reportFile.toURI().toString().replace("+", "%20"))
                .toString();
        return new URI(address);
    }

    public static StringBuilder createBodyParam(String body) {
        return new StringBuilder("&body=").append(URLEncoder.encode(body, UTF_8).replace("+", "%20"));
    }

    public static CharSequence createReportFileRecord(File reportFile) {
        StringBuilder body = new StringBuilder();
        body.append("#######");
        body.append(System.lineSeparator());
        body.append(reportFile.getAbsolutePath());
        body.append(System.lineSeparator());
        body.append("#######");
        body.append(System.lineSeparator());
        return body;
    }

    public static CharSequence createThrowableDesc(Throwable... exceptions) {
        StringBuilder body = new StringBuilder();
        for (Throwable throwable : exceptions) {
            body.append("####### BEGIN");
            body.append(System.lineSeparator());
            body.append(throwable.getLocalizedMessage());
            body.append(System.lineSeparator());
            body.append(System.lineSeparator());
            var os = new StringWriter();
            throwable.printStackTrace(new PrintWriter(os));
            body.append(os);
            body.append(System.lineSeparator());
            body.append("####### END");
            body.append(System.lineSeparator());
        }
        return body;
    }

    public static CharSequence createMemoryUsage() {
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
        } catch (Exception var12) {
            EXF.getInstance().ICA(var12);
        }
        body.append(System.lineSeparator());
        body.append("#######");
        body.append(System.lineSeparator());
        return body;
    }

    public static CharSequence createAddressAndSubject(String emailSubject) {
        StringBuilder address = new StringBuilder("mailto:").append("bademux+emk@gmail.com");
        String subject = new StringBuilder(emailSubject)
                .append(" [").append((new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz")).format(new Date())).append(" ]").toString();
        address.append("&subject=").append(URLEncoder.encode(subject, UTF_8).replace("+", "%20"));
        return address;
    }

    public static File createReport() throws IOException {
        File reportDir = new File(EXK.GPW + "/reports");
        EXF.getInstance().ICK("reportsDir " + reportDir);
        boolean isCreated = reportDir.mkdirs();
        EXF.getInstance().ICK("mkdirs " + isCreated);
        File reportFile = new File(reportDir, "report_" + (new SimpleDateFormat("yyyyMMdd'T'HHmmssS")).format(new Date()) + ".zip");
        EXF.getInstance().ICK("reportFile " + reportFile);
        EWF.writeToZip(reportFile, EXF.getInstance().getDefaultOutputLoggerFile(), EXF.getInstance().getDefaultErrorLoggerFile());
        return reportFile;
    }
}
