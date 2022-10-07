package a.a.a.c.c.a;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.f.LN;
import java.util.List;

public abstract class ELZ {
   public ELZ() {
   }

   public abstract String getName();

   public abstract String getTitle(ENH var1) throws FFK;

   public abstract String getFXML();

   public abstract Class<? extends ELV> getProcessImplementationClass();

   public abstract Class<? extends ELU<?>> getProcessControllerWindowClass();

   public abstract List<LN> getObjectClasses();

   public String toString() {
      return "ProcessDefinitionBase " + this.getName() + " | " + this.getFXML();
   }
}
