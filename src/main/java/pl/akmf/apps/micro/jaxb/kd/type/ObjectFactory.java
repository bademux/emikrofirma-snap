package pl.akmf.apps.micro.jaxb.kd.type;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
   public ObjectFactory() {
   }

   public JPKMicro createJPKMicro() {
      return new JPKMicro();
   }

   public DaneAutoryzujace createDaneAutoryzujace() {
      return new DaneAutoryzujace();
   }
}
