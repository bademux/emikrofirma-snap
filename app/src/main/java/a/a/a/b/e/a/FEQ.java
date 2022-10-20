package a.a.a.b.e.a;

import a.a.a.b.b.FEJ;
import a.a.a.b.e.a.a.FET;
import a.a.a.b.e.a.a.FEU;
import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.crypto.*;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Iterator;

@Slf4j
public class FEQ extends FES {
    public FEQ() {
    }

    public static void IKY(File var0) throws FEU {

        try {
            byte[] var1 = FEJ.IKP(var0);
            IKY(var1);
        } catch (Exception e) {
            log.error("Something bad happened", e);
            throw new FEU(e);
        }

    }

    public static void IKY(byte[] var0) throws FEU {
        throw new UnsupportedOperationException("reimplement without org.jcp.xml.dsig.internal.dom");
    }

    public static Node getObject(byte[] var0, String var1) throws FET {

        Object var16;
        try {
            DocumentBuilderFactory var2 = DocumentBuilderFactory.newInstance();
            var2.setNamespaceAware(true);
            InputStreamReader var3 = new InputStreamReader(new ByteArrayInputStream(var0), StandardCharsets.UTF_8);
            Document var4 = var2.newDocumentBuilder().parse(new InputSource(var3));
            setAllIds(var4, "Id");
            setAllIds(var4, "ID");
            NodeList var5 = var4.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "Object");
            if (var5.getLength() == 0) {
                throw new Exception("Cannot find Object element");
            }

            for (int var6 = 0; var6 < var5.getLength(); ++var6) {
                Node var7 = var5.item(var6);

                for (int var8 = 0; var8 < var7.getChildNodes().getLength(); ++var8) {
                    Node var9 = var7.getChildNodes().item(var8);
                    System.out.println(var9.getNodeName());
                    if (var1.equals(var9.getNodeName())) {
                        Node var10 = var9;
                        return var10;
                    }
                }
            }

            var16 = null;
        } catch (Exception e) {
            log.error("Something bad happened", e);
            throw new FET(e);
        }

        return (Node) var16;
    }

    public static class FER extends KeySelector {
        public FER() {
        }

        public KeySelectorResult select(KeyInfo var1, KeySelector.Purpose var2, AlgorithmMethod var3, XMLCryptoContext var4) throws KeySelectorException {
            Iterator var5 = var1.getContent().iterator();

            while (true) {
                XMLStructure var6;
                do {
                    if (!var5.hasNext()) {
                        throw new KeySelectorException("No key found!");
                    }

                    var6 = (XMLStructure) var5.next();
                } while (!(var6 instanceof X509Data));

                X509Data var7 = (X509Data) var6;
                Iterator var8 = var7.getContent().iterator();

                while (var8.hasNext()) {
                    Object var9 = var8.next();
                    if (var9 instanceof X509Certificate) {
                        final PublicKey var10 = ((X509Certificate) var9).getPublicKey();
                        if (IKW(var3.getAlgorithm(), var10.getAlgorithm())) {
                            return new KeySelectorResult() {
                                public Key getKey() {
                                    return var10;
                                }
                            };
                        }
                    }
                }
            }
        }

        static boolean IKW(String var0, String var1) {
            return var1.equalsIgnoreCase("DSA") && var0.equalsIgnoreCase("http://www.w3.org/2000/09/xmldsig#dsa-sha1") || var1.equalsIgnoreCase("RSA") && var0.equalsIgnoreCase("http://www.w3.org/2000/09/xmldsig#rsa-sha1") || var1.equalsIgnoreCase("RSA") && var0.equalsIgnoreCase("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
        }
    }
}
