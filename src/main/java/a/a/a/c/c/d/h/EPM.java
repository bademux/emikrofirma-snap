package a.a.a.c.c.d.h;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class EPM {
   protected Document FQK;
   protected Element FQL;

   public EPM(String var1) throws ParserConfigurationException {
      DocumentBuilderFactory var2 = DocumentBuilderFactory.newInstance();
      DocumentBuilder var3 = var2.newDocumentBuilder();
      this.FQK = var3.newDocument();
      this.FQL = this.FQK.createElement(var1);
      this.FQK.appendChild(this.FQL);
   }

   public Document getDocument() {
      return this.FQK;
   }

   public Element getRoot() {
      return this.FQL;
   }

   protected Element HOQ(String var1, String var2) {
      Element var3 = this.FQK.createElement(var1);
      var3.setTextContent(var2);
      this.FQL.appendChild(var3);
      return var3;
   }

   protected Element HOR(String var1, String var2, Element var3) {
      Element var4 = this.FQK.createElement(var1);
      var4.setTextContent(var2);
      var3.appendChild(var4);
      return var4;
   }
}
