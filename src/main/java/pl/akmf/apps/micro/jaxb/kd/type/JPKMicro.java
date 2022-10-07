package pl.akmf.apps.micro.jaxb.kd.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "",
   propOrder = {"daneAutoryzujace", "email"}
)
@XmlRootElement(
   name = "JPKMicro",
   namespace = "http://jpk.mf.gov.pl/wzor/2018/01/23/jpkmicro"
)
public class JPKMicro {
   @XmlElement(
      name = "DaneAutoryzujace",
      required = true
   )
   protected DaneAutoryzujace daneAutoryzujace;
   @XmlElement(
      name = "Email",
      namespace = "http://jpk.mf.gov.pl/wzor/2018/01/23/jpkmicro"
   )
   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
   @XmlSchemaType(
      name = "token"
   )
   protected String email;

   public JPKMicro() {
   }

   public DaneAutoryzujace getDaneAutoryzujace() {
      return this.daneAutoryzujace;
   }

   public void setDaneAutoryzujace(DaneAutoryzujace var1) {
      this.daneAutoryzujace = var1;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String var1) {
      this.email = var1;
   }
}
