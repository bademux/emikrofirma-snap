package a.a.a.c.f;

import a.a.a.c.e.a.k.a.EXF;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class LL extends KX<String> {
   @XmlAttribute
   private Integer APZ;
   @XmlTransient
   private StringProperty AQA;

   public LL(String var1) {
      super(var1);
      this.AQA = new LM(this);
      EXF.getInstance().ICO();

      try {
         this.APZ = 2147483647;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public LL() {
      this((String)null);
      EXF.getInstance().ICQ();
   }

   public Integer getMaxLength() {
      return this.APZ;
   }

   public void setMaxLength(Integer var1) {
      this.APZ = var1;
   }

   public int compareTo(KX<String> var1) {
      return var1 != null && var1.getValue() != null ? ((String)var1.getValue()).compareTo((String)this.getValue()) : -1;
   }

   public final StringProperty DDG() {
      return this.AQA;
   }

   public String getValueAsString() {
      return (String)this.getValue();
   }

   public void setValueFromString(String var1) {
      this.setValue(var1);
   }

   private class LM extends SimpleStringProperty {
      private LL APY;

      public LM(LL var2) {
         this.APY = var2;
      }

      public String get() {
         return (String)this.APY.getValue();
      }

      public void set(String var1) {
         this.APY.setValue(var1);
      }
   }
}
