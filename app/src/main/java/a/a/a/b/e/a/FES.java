package a.a.a.b.e.a;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.*;
import java.util.ArrayList;
import java.util.List;

public abstract class FES {
    public FES() {
    }

    public static List<? extends Node> IKX(Document var0, String var1) throws XPathExpressionException {
        XPathFactory var2 = XPathFactory.newInstance();
        XPath var3 = var2.newXPath();
        XPathExpression var4 = var3.compile(var1);
        NodeList var5 = (NodeList) var4.evaluate(var0, XPathConstants.NODESET);
        ArrayList var6 = new ArrayList();

        for (int var7 = 0; var7 < var5.getLength(); ++var7) {
            var6.add(var5.item(var7));
        }

        return var6;
    }

    public static void setAllIds(Document var0, String var1) throws XPathExpressionException {
        List var2 = IKX(var0, "//*/@" + var1);

        for (int var3 = 0; var3 < var2.size(); ++var3) {
            Attr var4 = (Attr) var2.get(var3);
            var4.getOwnerElement().setIdAttributeNode(var4, true);
        }

    }
}
