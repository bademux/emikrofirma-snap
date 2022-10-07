package a.a.a.c.d.b;

import a.a.a.b.f.FFK;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.AGXA;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

public class EQL {
    private static volatile EQL FWL;
    private final Map<String, AGXA> FWM;
    private final URL FWN;
    public static final String FWO = "kodSystemowy";
    public static final String FWP = "wersjaSchemy";

    public static EQL getInstance() throws FFK {
        if (FWL == null) {
            Class var0 = EQL.class;
            synchronized (EQL.class) {
                if (FWL == null) {
                    FWL = new EQL();
                }
            }
        }

        return FWL;
    }

    public static String getCurrentDateShortString() {
        return (new SimpleDateFormat("yyyyMMddHHmmssS")).format(new Date());
    }

    public static String getCurrentDateSigningTimeString() {
        return (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX")).format(new Date());
    }

    public EQL() throws FFK {
        EXF.getInstance().ICO();

        try {
            this.FWM = new HashMap();
            this.HQK();
            this.FWN = EQL.class.getResource("/xsd/initupload/initupload.xsd");
            EXF.getInstance().ICK("initUploadXsd " + this.FWN);
        } catch (URISyntaxException | XPathExpressionException | ParserConfigurationException | SAXException |
                 IOException var5) {
            EXF.getInstance().ICA(var5);
            throw new FFK(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public Map<String, AGXA> getJpkSchemaFilesMap() {
        return this.FWM;
    }

    public URL getInitUploadXsd() {
        return this.FWN;
    }

    private void HQK() throws IOException, URISyntaxException, ParserConfigurationException, XPathExpressionException, SAXException {
        EXF.getInstance().ICO();

        try {
            String var2 = "//*/complexType[@name='TNaglowek']/sequence/element[@name='KodFormularza']/complexType/simpleContent/extension[@base='tns:TKodFormularza']/attribute[@name='##attributeName##']/@fixed".replaceFirst("##attributeName##", "kodSystemowy");
            String var3 = "//*/complexType[@name='TNaglowek']/sequence/element[@name='KodFormularza']/complexType/simpleContent/extension[@base='tns:TKodFormularza']/attribute[@name='##attributeName##']/@fixed".replaceFirst("##attributeName##", "wersjaSchemy");
            DocumentBuilderFactory var7 = DocumentBuilderFactory.newInstance();
            DocumentBuilder var8 = var7.newDocumentBuilder();
            XPathFactory var9 = XPathFactory.newInstance();
            XPath var10 = var9.newXPath();
            XPathExpression var11 = var10.compile(var2);
            XPathExpression var12 = var10.compile(var3);
            XPathExpression var13 = var10.compile("//*/simpleType[@name='TKodFormularza']/restriction[@base='xsd:string']/enumeration/@value");
            XPathExpression var14 = var10.compile("//*/complexType[@name='TNaglowek']/sequence/element[@name='WariantFormularza']/simpleType/restriction[@base='xsd:byte']/enumeration/@value");
            XPathExpression var15 = var10.compile("/schema/@targetNamespace");
            String var16 = "xsd/jpk/structure/";
            ClassLoader var17 = Thread.currentThread().getContextClassLoader();
            String var25;
            String var26;
            String var27;
            String var28;
            InputStream var36 = var17.getResourceAsStream(var16);
            BufferedReader var37 = new BufferedReader(new InputStreamReader(var36));

            String var38;
            while ((var38 = var37.readLine()) != null) {
                EXF.getInstance().ICK("xsdResource " + var38);
                URL var33 = var17.getResource(var16 + var38);
                EXF.getInstance().ICK("jpkURL[JPK] " + var33);
                EXF.getInstance().ICK("fileName[JPK] " + var38);
                Document var34 = var8.parse(var33.openStream());
                String var35 = (String) var11.evaluate(var34, XPathConstants.STRING);
                var25 = (String) var12.evaluate(var34, XPathConstants.STRING);
                var26 = (String) var13.evaluate(var34, XPathConstants.STRING);
                var27 = (String) var14.evaluate(var34, XPathConstants.STRING);
                var28 = (String) var15.evaluate(var34, XPathConstants.STRING);
                EXF.getInstance().ICK("value_kodSystemowy " + var35);
                EXF.getInstance().ICK("value_wersjaSchemy " + var25);
                EXF.getInstance().ICK("value_symbolWzoru " + var26);
                EXF.getInstance().ICK("value_wariantFormularza " + var27);
                EXF.getInstance().ICK("value_targetNamespace " + var28);
                this.FWM.put(var38, new AGXA(var28, var26, var35, var25, var27, var33));
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
