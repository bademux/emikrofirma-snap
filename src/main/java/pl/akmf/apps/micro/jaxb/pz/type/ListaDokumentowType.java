package pl.akmf.apps.micro.jaxb.pz.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "ListaDokumentowType",
   propOrder = {"dokument"}
)
public class ListaDokumentowType {
   @XmlElement(
      required = true
   )
   protected List<DokumentZadanieType> dokument;

   public ListaDokumentowType() {
   }

   public List<DokumentZadanieType> getDokument() {
      if (this.dokument == null) {
         this.dokument = new ArrayList();
      }

      return this.dokument;
   }
}
