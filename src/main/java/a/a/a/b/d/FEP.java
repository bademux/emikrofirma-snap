package a.a.a.b.d;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import org.w3c.dom.Node;

public class FEP {
   private final JAXBContext HFA;
   private final Unmarshaller HFB;
   private final XMLInputFactory HFC;

   public FEP(Class<?>... var1) throws JAXBException {
      this.HFA = JAXBContext.newInstance(var1);
      this.HFB = this.HFA.createUnmarshaller();
      this.HFC = XMLInputFactory.newFactory();
      this.HFC.setProperty("javax.xml.stream.isSupportingExternalEntities", false);
      this.HFC.setProperty("javax.xml.stream.supportDTD", false);
   }

   public void setListener(Unmarshaller.Listener var1) {
      this.HFB.setListener(var1);
   }

   public <_T> _T IKV(XMLStreamReader var1, Class<_T> var2) throws JAXBException {
      return this.HFB.unmarshal(var1, var2).getValue();
   }

   public <_T> _T IKV(InputStream var1, Class<_T> var2) throws JAXBException, XMLStreamException {
      XMLStreamReader var3 = this.HFC.createXMLStreamReader(var1, StandardCharsets.UTF_8.name());
      return this.HFB.unmarshal(var3, var2).getValue();
   }

   public <_T> _T IKV(Node var1, Class<_T> var2) throws JAXBException {
      return this.HFB.unmarshal(var1, var2).getValue();
   }
}
