package a.a.a.c.e.a.k.a;

import org.apache.logging.log4j.Logger;

public class EXH {
   private final Logger GTG;
   private final Logger GTH;

   public EXH(Logger var1, Logger var2) {
      this.GTG = var1;
      this.GTH = var2;
   }

   void ICU(Object var1, Throwable var2) {
      this.GTG.error(var1, var2);
      this.GTH.error(var1, var2);
   }

   void ICV(Object var1) {
      this.GTG.error(var1);
      this.GTH.error(var1);
   }

   void ICV(Throwable var1) {
      this.GTG.error(var1);
      this.GTH.error(var1);
   }

   void ICW(Object var1, Throwable var2) {
      this.GTG.fatal(var1, var2);
      this.GTH.fatal(var1, var2);
   }

   void ICX(Object var1) {
      this.GTG.fatal(var1);
      this.GTH.fatal(var1);
   }

   void ICX(Throwable var1) {
      this.GTG.fatal(var1);
      this.GTH.fatal(var1);
   }

   void ICY(Object var1, Throwable var2) {
      this.GTG.info(var1, var2);
      this.GTH.info(var1, var2);
   }

   void ICZ(Object var1) {
      this.GTG.info(var1);
      this.GTH.info(var1);
   }

   void IDA(Object var1, Throwable var2) {
      this.GTG.trace(var1, var2);
      this.GTH.trace(var1, var2);
   }

   void IDB(Object var1) {
      this.GTG.trace(var1);
      this.GTH.trace(var1);
   }

   void IDC(Object var1, Throwable var2) {
      this.GTG.warn(var1, var2);
      this.GTH.warn(var1, var2);
   }

   void IDD(Object var1) {
      this.GTG.warn(var1);
      this.GTH.warn(var1);
   }

   void IDE(Object var1, Throwable var2) {
      this.GTG.debug(var1, var2);
      this.GTH.debug(var1, var2);
   }

   void IDF(Object var1) {
      this.GTG.debug(var1);
      this.GTH.debug(var1);
   }

   boolean IDG() {
      return this.GTG.isInfoEnabled();
   }

   boolean IDH() {
      return this.GTG.isDebugEnabled();
   }

   boolean IDI() {
      return this.GTG.isTraceEnabled();
   }
}
