package a.a.a.b.e.a;

import a.a.a.b.e.a.a.FEV;
import a.a.a.b.e.c.NewPrivateKey;
import a.a.a.b.e.c.FFE;
import a.a.a.b.e.c.a.FFD;
import lombok.extern.slf4j.Slf4j;
import org.jcp.xml.dsig.internal.dom.DOMCanonicalizationMethod;
import org.jcp.xml.dsig.internal.dom.DOMTransform;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import pl.akmf.apps.fix.DOMURIDereferencerFix;

import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.*;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;

@Slf4j
public class FEX extends FES {
    private static final String HFD = "";

    public FEX() {
    }

    public static synchronized byte[] IKZ(NewPrivateKey var0, X509Certificate var1, byte[] var2, byte[] var3, String var4, String var5, String var6, String var7) throws FEV {
        byte[] var29;
        try {
            DocumentBuilderFactory var8 = DocumentBuilderFactory.newInstance();
            var8.setNamespaceAware(true);
            InputStreamReader var9 = new InputStreamReader(new ByteArrayInputStream(var2), StandardCharsets.UTF_8);
            Document var10 = var8.newDocumentBuilder().parse(new InputSource(var9));
            InputStreamReader var11 = new InputStreamReader(new ByteArrayInputStream(var3), StandardCharsets.UTF_8);
            Document var12 = var8.newDocumentBuilder().parse(new InputSource(var11));
            DOMStructure var13 = new DOMStructure(var12.getDocumentElement());
            XMLSignatureFactory var14 = XMLSignatureFactory.getInstance("DOM");
            XMLObject var15 = var14.newXMLObject(Collections.singletonList(var13), null, null, null);
            ArrayList var16 = new ArrayList();
            TransformService var17 = TransformService.getInstance("http://www.w3.org/TR/1999/REC-xpath-19991116", "DOM");
            var17.init(new XPathFilterParameterSpec("not(ancestor-or-self::ds:Signature)"));
            DOMTransform var18 = new DOMTransform(var17);
            var16.add(var18);
            var17 = null;
            TransformService var38 = TransformService.getInstance("http://www.w3.org/2001/10/xml-exc-c14n#", "DOM");
            DOMCanonicalizationMethod var37 = new DOMCanonicalizationMethod(var38);
            var16.add(var37);
            DigestMethod var39 = var14.newDigestMethod("http://www.w3.org/2001/04/xmlenc#sha256", null);
            ArrayList var19 = new ArrayList();
            var19.add(var14.newReference("", var39, var16, "", var6));
            var19.add(var14.newReference("#" + var7, var39, Collections.singletonList(var37), "http://uri.etsi.org/01903#SignedProperties", null));
            SignedInfo var20 = var14.newSignedInfo(var37, var14.newSignatureMethod("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", null), var19);
            KeyInfoFactory var21 = var14.getKeyInfoFactory();
            X509Data var22 = var21.newX509Data(Collections.singletonList(var1));
            KeyInfo var23 = var21.newKeyInfo(Collections.singletonList(var22));
            DOMSignContext var24 = new DOMSignContext(var0, var10.getDocumentElement());
            var24.setDefaultNamespacePrefix("ds");
            var24.setURIDereferencer(new DOMURIDereferencerFix());
            var24.setProperty("org.jcp.xml.dsig.internal.dom.SignatureProvider", new FFE());
            XMLSignature var25 = var14.newXMLSignature(var20, var23, Collections.singletonList(var15), var4, var5);
            var25.sign(var24);
            ByteArrayOutputStream var26 = new ByteArrayOutputStream();
            TransformerFactory var27 = TransformerFactory.newInstance();
            Transformer var28 = var27.newTransformer();
            var28.transform(new DOMSource(var10), new StreamResult(var26));
            var29 = var26.toByteArray();
        } catch (FFD e) {
            log.error("Something bad happened", e);
            throw e;
        } catch (Exception e) {
            log.error("Something bad happened", e);
            throw new FEV(e);
        }

        return var29;
    }
}
