package a.a.a.c.f;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.JM;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class LH<_T extends JM> extends KX<_T> {
   @XmlTransient
   private ObjectProperty<_T> APV;

   public LH(_T var1) {
      super(var1);
      this.APV = new LI(this);
      EXF.getInstance().ICQ();
   }

   public LH() {
      this(null);
      EXF.getInstance().ICQ();
   }

   public int compareTo(KX<_T> var1) {
      return var1 != null && var1.getValue() != null ? ((JM)var1.getValue()).DAQ((JM)this.getValue()) : -1;
   }

   public final ObjectProperty<_T> DEI() {
      return this.APV;
   }

   public String getValueAsString() {
      JM var1 = (JM)this.getValue();
      return var1 != null ? var1.getDescription() : "";
   }

   public void setValueFromString(String var1) {
      throw new FFI("Do NOT use!");
   }

   private class LI extends SimpleObjectProperty<_T> {
      private LH<_T> APU;

      public LI(LH<_T> var2) {
         this.APU = var2;
      }

      public _T get() {
         return (_T) this.APU.getValue();
      }

      public void set(_T var1) {
         this.APU.setValue(var1);
      }
   }
}
