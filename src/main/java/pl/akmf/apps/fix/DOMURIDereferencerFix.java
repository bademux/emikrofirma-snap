package pl.akmf.apps.fix;

import com.sun.org.apache.xml.internal.security.Init;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureInput;
import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import com.sun.org.apache.xml.internal.security.utils.resolver.ResourceResolver;
import java.util.ArrayList;
import java.util.List;
import javax.xml.crypto.Data;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.URIReference;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dom.DOMURIReference;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.jcp.xml.dsig.internal.dom.ApacheNodeSetData;
import org.jcp.xml.dsig.internal.dom.ApacheOctetStreamData;
import org.jcp.xml.dsig.internal.dom.Policy;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMURIDereferencerFix implements URIDereferencer {
   public DOMURIDereferencerFix() {
      Init.init();
   }

   public Data dereference(URIReference var1, XMLCryptoContext var2) throws URIReferenceException {
      if (var1 == null) {
         throw new NullPointerException("uriRef cannot be null");
      } else if (var2 == null) {
         throw new NullPointerException("context cannot be null");
      } else {
         DOMURIReference var3 = (DOMURIReference)var1;
         Attr var4 = (Attr)var3.getHere();
         String var5 = var1.getURI();
         DOMCryptoContext var6 = (DOMCryptoContext)var2;
         String var7 = var2.getBaseURI();
         Boolean var8 = (Boolean)var2.getProperty("org.jcp.xml.dsig.secureValidation");
         boolean var9 = var8 != null && var8;
         if (var9 && Policy.restrictReferenceUriScheme(var5)) {
            throw new URIReferenceException("Uri " + var5 + " is forbidden when secure validation is enabled");
         } else {
            if (var5 != null && var5.length() != 0 && var5.charAt(0) == '#') {
               String var10 = var5.substring(1);
               if (var10.startsWith("xpointer(id(")) {
                  int var11 = var10.indexOf(39);
                  int var12 = var10.indexOf(39, var11 + 1);
                  var10 = var10.substring(var11 + 1, var12);
               }

               Document var18 = var4.getOwnerElement().getOwnerDocument();

               try {
                  this.setAllIds(var18, "Id");
                  this.setAllIds(var18, "ID");
               } catch (XPathExpressionException var16) {
                  throw new RuntimeException(var16);
               }

               Element var20 = var4.getOwnerDocument().getElementById(var10);
               if (var20 == null) {
                  var20 = var6.getElementById(var10);
               }

               if (var20 != null) {
                  if (var9 && Policy.restrictDuplicateIds()) {
                     Element var13 = var20.getOwnerDocument().getDocumentElement();
                     if (!XMLUtils.protectAgainstWrappingAttack(var13, (Element)var20, var10)) {
                        String var14 = "Multiple Elements with the same ID " + var10 + " detected when secure validation is enabled";
                        throw new URIReferenceException(var14);
                     }
                  }

                  XMLSignatureInput var21 = new XMLSignatureInput(var20);
                  if (!var5.substring(1).startsWith("xpointer(id(")) {
                     var21.setExcludeComments(true);
                  }

                  var21.setMIMEType("text/xml");
                  if (var7 != null && var7.length() > 0) {
                     var21.setSourceURI(var7.concat(var4.getNodeValue()));
                  } else {
                     var21.setSourceURI(var4.getNodeValue());
                  }

                  return new ApacheNodeSetData(var21);
               }
            }

            try {
               ResourceResolver var17 = ResourceResolver.getInstance(var4, var7, var9);
               XMLSignatureInput var19 = var17.resolve(var4, var7, true);
               return (Data)(var19.isOctetStream() ? new ApacheOctetStreamData(var19) : new ApacheNodeSetData(var19));
            } catch (Exception var15) {
               throw new URIReferenceException(var15);
            }
         }
      }
   }

   public List<? extends Node> evaluateXPath(Document var1, String var2) throws XPathExpressionException {
      XPathFactory var3 = XPathFactory.newInstance();
      XPath var4 = var3.newXPath();
      XPathExpression var5 = var4.compile(var2);
      NodeList var6 = (NodeList)var5.evaluate(var1, XPathConstants.NODESET);
      ArrayList var7 = new ArrayList();

      for(int var8 = 0; var8 < var6.getLength(); ++var8) {
         var7.add(var6.item(var8));
      }

      return var7;
   }

   public void setAllIds(Document var1, String var2) throws XPathExpressionException {
      List var3 = this.evaluateXPath(var1, "//*/@" + var2);

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         Attr var5 = (Attr)var3.get(var4);
         var5.getOwnerElement().setIdAttributeNode(var5, true);
      }

   }
}
