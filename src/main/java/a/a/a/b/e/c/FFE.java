package a.a.a.b.e.c;

import java.security.Provider;
import java.util.List;
import java.util.Map;

public class FFE extends Provider {
   private static final long serialVersionUID = 1L;

   public FFE() {
      super("tmpPKCS11Provider", 0.0, "temporaryPKCS11Provider");
      this.putService(new Provider.Service(this, "Signature", "SHA256withRSA", FFB.class.getName(), (List)null, (Map)null));
   }
}
