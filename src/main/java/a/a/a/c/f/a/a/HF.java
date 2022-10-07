package a.a.a.c.f.a.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.IJ;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.JV;
import a.a.a.c.f.b.c.KE;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class HF extends IJ {
   private JN AII;
   private JV AIJ;
   private KE AIK;
   private JR AIL;
   private JR AIM;
   private JR AIN;
   private Set<HG> AIO;

   public HF() {
      EXF.getInstance().ICO();

      try {
         this.AIL = new JR(BigDecimal.ZERO);
         this.AIM = new JR(BigDecimal.ZERO);
         this.AIN = new JR(BigDecimal.ZERO);
         this.AIO = new HashSet();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void DAG(HG var1) {
      this.AIO.add(var1);
      this.AIL = new JR(((BigDecimal)this.AIL.getValue()).add((BigDecimal)var1.getNet().getValue()));
      this.AIM = new JR(((BigDecimal)this.AIM.getValue()).add((BigDecimal)var1.getVatAmount().getValue()));
      this.AIN = new JR(((BigDecimal)this.AIN.getValue()).add((BigDecimal)var1.getGross().getValue()));
   }

   public void DAH(HG var1) {
      this.AIO.remove(var1);
      this.AIL = new JR(((BigDecimal)this.AIL.getValue()).subtract((BigDecimal)var1.getNet().getValue()));
      this.AIM = new JR(((BigDecimal)this.AIM.getValue()).subtract((BigDecimal)var1.getVatAmount().getValue()));
      this.AIN = new JR(((BigDecimal)this.AIN.getValue()).subtract((BigDecimal)var1.getGross().getValue()));
   }

   public Set<HG> getItems() {
      return this.AIO;
   }

   public JN getPeriod() {
      return this.AII;
   }

   public void setPeriod(JN var1) {
      this.AII = var1;
   }

   public JV getDate() {
      return this.AIJ;
   }

   public void setDate(JV var1) {
      this.AIJ = var1;
   }

   public KE getRefId() {
      return this.AIK;
   }

   public void setRefId(KE var1) {
      this.AIK = var1;
   }

   public JR getNet() {
      return this.AIL;
   }

   public void setNet(JR var1) {
      this.AIL = var1;
   }

   public JR getVat() {
      return this.AIM;
   }

   public void setVat(JR var1) {
      this.AIM = var1;
   }

   public JR getGross() {
      return this.AIN;
   }

   public void setGross(JR var1) {
      this.AIN = var1;
   }
}
