package com.github.bademux.emk.utils;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.apache.fop.apps.EnvironmentalProfileFactory;
import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FopConfParser;
import org.apache.fop.configuration.ConfigurationException;
import org.apache.xmlgraphics.io.Resource;
import org.apache.xmlgraphics.io.ResourceResolver;
import org.xml.sax.ContentHandler;

import java.io.*;
import java.net.URI;

import static java.util.Objects.requireNonNull;

@UtilityClass
public class FopUtils {

    public static final URI DEFAULT_BASE_URI = URI.create(".");
    public static final ClasspathResourceResolver RESOURCE_RESOLVER = new ClasspathResourceResolver();
    public static final byte[] FONT_CONFIG = readFontConfig();

    @SneakyThrows
    public static ContentHandler createFopHandler(OutputStream fos) throws ConfigurationException, FOPException {
        var fopFactory = new FopConfParser(
                new ByteArrayInputStream(FONT_CONFIG),
                EnvironmentalProfileFactory.createRestrictedIO(DEFAULT_BASE_URI, RESOURCE_RESOLVER))
                .getFopFactoryBuilder()
                .build();
        return fopFactory.newFop("application/pdf", fopFactory.newFOUserAgent(), fos).getDefaultHandler();
    }

    @SneakyThrows
    private static byte[] readFontConfig() {
        try (var is = FopUtils.class.getResourceAsStream("/fop/jpkFont.xsl")) {
            return requireNonNull(is).readAllBytes();
        }
    }

}

final class ClasspathResourceResolver implements ResourceResolver {
    public Resource getResource(URI uri) {
        return new Resource(getClass().getResourceAsStream(uri.getPath()));
    }

    public OutputStream getOutputStream(URI uri) throws IOException {
        return new FileOutputStream(new File(uri));
    }
}