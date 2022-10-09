package pl.akmf.apps.fix;

import org.w3c.dom.*;

import javax.xml.crypto.*;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dom.DOMURIReference;
import javax.xml.xpath.*;
import java.util.ArrayList;
import java.util.List;

public class DOMURIDereferencerFix implements URIDereferencer {
    public DOMURIDereferencerFix() {
    }

    public Data dereference(URIReference var1, XMLCryptoContext var2) throws URIReferenceException {
        throw new UnsupportedOperationException("reimplement without org.jcp.xml.dsig.internal.dom");
    }

    public List<? extends Node> evaluateXPath(Document var1, String var2) throws XPathExpressionException {
        XPathFactory var3 = XPathFactory.newInstance();
        XPath var4 = var3.newXPath();
        XPathExpression var5 = var4.compile(var2);
        NodeList var6 = (NodeList) var5.evaluate(var1, XPathConstants.NODESET);
        ArrayList var7 = new ArrayList();

        for (int var8 = 0; var8 < var6.getLength(); ++var8) {
            var7.add(var6.item(var8));
        }

        return var7;
    }

    public void setAllIds(Document var1, String var2) throws XPathExpressionException {
        List var3 = this.evaluateXPath(var1, "//*/@" + var2);

        for (int var4 = 0; var4 < var3.size(); ++var4) {
            Attr var5 = (Attr) var3.get(var4);
            var5.getOwnerElement().setIdAttributeNode(var5, true);
        }

    }
}
