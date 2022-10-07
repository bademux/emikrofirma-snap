package a.a.a.c.f.a.e;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.JV;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class HY extends HN<HQ> {
   protected JV IVO;
   private JS IVP;
   private JS ROZ;
   @XmlTransient
   private ObjectProperty<ObservableList<HQ>> AKX;

   protected HY(IA var1) {
      super(IB.SELL, var1);
      this.AKX = new HZ(this);
      EXF.getInstance().ICQ();
   }

   protected HY() {
      this((IA)null);
      this.IVO = new JV();
      EXF.getInstance().ICQ();
   }

   public abstract JV getInvoicingDate();

   public void setInvoicingDate(JV var1) {
      this.IVO = var1;
   }

   public JV IYZ() {
      if (this.getInvoicingDate() == null) {
         this.IVO = new JV();
      }

      return this.IVO;
   }

   public JS getUsingInvoicingDate() {
      return this.IVP;
   }

   public void setUsingInvoicingDate(JS var1) {
      this.IVP = var1;
   }

   public JS getMpp() {
      if (this.ROZ == null) {
         this.ROZ = new JS(false);
      }

      return this.ROZ;
   }

   public void setMpp(Boolean var1) {
      this.getMpp().setValue(var1);
   }

   public final ObjectProperty<ObservableList<HQ>> DBU() {
      return this.AKX;
   }

   private class HZ extends SimpleObjectProperty<ObservableList<HQ>> {
      private HY AKW;

      public HZ(HY var2) {
         this.AKW = var2;
      }

      public ObservableList<HQ> get() {
         return FXCollections.observableList(this.AKW.getInvoiceElements());
      }

      public void set(ObservableList<HQ> var1) {
         if (var1 != null) {
            this.AKW.setInvoiceElements(var1);
         }

      }
   }
}
