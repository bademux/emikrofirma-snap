package com.github.bademux.emk.utils;

import lombok.experimental.UtilityClass;
import org.w3c.dom.Document;

import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

@UtilityClass
public class XmlUtils {
    public static StreamSource createAndTransformStreamSource(Document document) throws TransformerException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TransformerFactory.newInstance().newTransformer().transform(new DOMSource(document), new StreamResult(bos));
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        return new StreamSource(bis);
    }
}
