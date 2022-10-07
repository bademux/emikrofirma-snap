package a.a.a.c.f.a.d;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public enum HL implements JM {
   NONE(FCW.getInstance().getMessageForKey("micro.model.type.declarationstatus.none")),
   NEW(FCW.getInstance().getMessageForKey("micro.model.type.declarationstatus.new")),
   SENT(FCW.getInstance().getMessageForKey("micro.model.type.declarationstatus.sent")),
   SUCCESS(FCW.getInstance().getMessageForKey("micro.model.type.declarationstatus.success")),
   FAILURE(FCW.getInstance().getMessageForKey("micro.model.type.declarationstatus.failure")),
   RETRY(FCW.getInstance().getMessageForKey("micro.model.type.declarationstatus.retry"));

   private final String AJD;

   private HL(String var3) {
      EXF.getInstance().ICO();

      try {
         this.AJD = var3;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public String getDescription() {
      return this.AJD;
   }

   public int DAQ(JM var1) {
      return this.compareTo((HL)var1);
   }

   public JM[] getEnumTypeValues() {
      return values();
   }
}
