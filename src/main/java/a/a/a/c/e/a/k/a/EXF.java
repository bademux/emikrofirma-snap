package a.a.a.c.e.a.k.a;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.RollingFileAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;

public class EXF implements EXG {
   private static volatile EXG GSY;
   private static final String GSZ = "default";
   private static final String GTA = "_out";
   private static final String GTB = "_err";
   private Logger GTC;
   private Logger GTD;
   private Map<Long, Deque<EXH>> GTE = new HashMap();
   private final Configuration GTF;

   public static EXG getInstance() {
      if (GSY == null) {
         Class var0 = EXF.class;
         synchronized(EXF.class) {
            if (GSY == null) {
               GSY = new EXF();
            }
         }
      }

      return GSY;
   }

   private EXF() {
      this.setDefaultOutputLogger(LogManager.getLogger("default_out"));
      this.setDefaultErrorLogger(LogManager.getLogger("default_err"));
      this.GTF = ((LoggerContext)LogManager.getContext()).getConfiguration();
   }

   private EXH getCurrentLogger() {
      return this.getCurrentLogger(Thread.currentThread());
   }

   private EXH getCurrentLogger(Thread var1) {
      long var2 = var1.getId();
      EXH var4 = null;
      if (this.GTE.containsKey(var2) && ((Deque)this.GTE.get(var2)).size() > 0) {
         var4 = (EXH)((Deque)this.GTE.get(var2)).peek();
      } else {
         var4 = new EXH(this.GTC, this.GTD);
      }

      return var4;
   }

   public void setDefaultOutputLogger(Logger var1) {
      this.GTC = var1;
   }

   public void setDefaultErrorLogger(Logger var1) {
      this.GTD = var1;
   }

   public File getDefaultOutputLoggerFile() {
      return this.getLoggerFile(this.GTC.getName());
   }

   public File getDefaultErrorLoggerFile() {
      return this.getLoggerFile(this.GTD.getName());
   }

   private File getLoggerFile(String var1) {
      LoggerConfig var2 = (LoggerConfig)this.GTF.getLoggers().get(var1);
      Appender var3 = (Appender)var2.getAppenders().values().iterator().next();
      if (var3 != null && var3 instanceof RollingFileAppender) {
         RollingFileAppender var4 = (RollingFileAppender)var3;
         return new File(var4.getFileName());
      } else {
         return null;
      }
   }

   public void IBW(Thread var1, String var2) {
      long var3 = var1.getId();
      if (!this.GTE.containsKey(var3)) {
         this.GTE.put(var3, new ArrayDeque());
      }

      Deque var5 = (Deque)this.GTE.get(var3);
      Logger var6 = LogManager.getLogger(var2 + "_out");
      Logger var7 = LogManager.getLogger(var2 + "_err");
      var5.push(new EXH(var6, var7));
   }

   public void IBV(String var1) {
      this.IBW(Thread.currentThread(), var1);
   }

   public EXH IBY(Thread var1) {
      long var2 = var1.getId();
      if (this.GTE.containsKey(var2) && ((Deque)this.GTE.get(var2)).size() > 0) {
         return (EXH)((Deque)this.GTE.get(var2)).pop();
      } else {
         throw new RuntimeException("NO logger on the stack!");
      }
   }

   public EXH IBX() {
      return this.IBY(Thread.currentThread());
   }

   public void IBZ(Object var1, Throwable var2) {
      this.getCurrentLogger().ICU(this.getCallerClassName() + String.valueOf(var1), var2);
   }

   public void ICA(Object var1) {
      this.getCurrentLogger().ICV((Object)(this.getCallerClassName() + String.valueOf(var1)));
   }

   public void ICA(Throwable var1) {
      if (var1 != null) {
         this.getCurrentLogger().ICU(this.getCallerClassName() + var1.getMessage(), var1);
      } else {
         this.getCurrentLogger().ICV((Object)(this.getCallerClassName() + "null"));
      }

   }

   public void ICB(Object var1, Throwable var2) {
      this.getCurrentLogger().ICW(this.getCallerClassName() + String.valueOf(var1), var2);
   }

   public void ICC(Object var1) {
      this.getCurrentLogger().ICX((Object)(this.getCallerClassName() + String.valueOf(var1)));
   }

   public void ICC(Throwable var1) {
      if (var1 != null) {
         this.getCurrentLogger().ICW(this.getCallerClassName() + var1.getMessage(), var1);
      } else {
         this.getCurrentLogger().ICX((Object)(this.getCallerClassName() + "null"));
      }

   }

   public void ICD(Object var1, Throwable var2) {
      this.getCurrentLogger().ICY(this.getCallerClassName() + String.valueOf(var1), var2);
   }

   public void ICE(Object var1) {
      this.getCurrentLogger().ICZ(this.getCallerClassName() + String.valueOf(var1));
   }

   public void ICF(Object var1, Throwable var2) {
      this.getCurrentLogger().IDA(this.getCallerClassName() + String.valueOf(var1), var2);
   }

   public void ICG(Object var1) {
      this.getCurrentLogger().IDB(this.getCallerClassName() + String.valueOf(var1));
   }

   public void ICH(Object var1, Throwable var2) {
      this.getCurrentLogger().IDC(this.getCallerClassName() + String.valueOf(var1), var2);
   }

   public void ICI(Object var1) {
      this.getCurrentLogger().IDD(this.getCallerClassName() + String.valueOf(var1));
   }

   public void ICJ(Object var1, Throwable var2) {
      this.getCurrentLogger().IDE(this.getCallerClassName() + String.valueOf(var1), var2);
   }

   public void ICK(Object var1) {
      this.getCurrentLogger().IDF(this.getCallerClassName() + String.valueOf(var1));
   }

   public boolean ICL() {
      return this.getCurrentLogger().IDG();
   }

   public boolean ICM() {
      return this.getCurrentLogger().IDH();
   }

   public boolean ICN() {
      return this.getCurrentLogger().IDI();
   }

   public void ICO() {
      if (this.getCurrentLogger().IDI()) {
         StackTraceElement[] var1 = (new Throwable()).getStackTrace();
         this.ICR(var1[1].getClassName(), var1[1].getMethodName());
      }

   }

   public void ICP() {
      if (this.getCurrentLogger().IDI()) {
         StackTraceElement[] var1 = (new Throwable()).getStackTrace();
         this.ICS(var1[1].getClassName(), var1[1].getMethodName());
      }

   }

   public void ICQ() {
      if (this.getCurrentLogger().IDI()) {
         StackTraceElement[] var1 = (new Throwable()).getStackTrace();
         this.ICT(var1[1].getClassName(), var1[1].getMethodName());
      }

   }

   private String getCallerClassName() {
      StackTraceElement var1 = Thread.currentThread().getStackTrace()[3];
      String var2 = "> ";
      if (var1 != null) {
         var2 = var1.getClassName() + ".";
         var2 = var2 + var1.getMethodName() + "():";
         var2 = var2 + var1.getLineNumber() + "> ";
      }

      return var2;
   }

   private void ICR(String var1, String var2) {
      this.getCurrentLogger().IDB("\\" + var1 + "." + var2);
   }

   private void ICS(String var1, String var2) {
      this.getCurrentLogger().IDB("/" + var1 + "." + var2);
   }

   private void ICT(String var1, String var2) {
      this.getCurrentLogger().IDB(")" + var1 + "." + var2);
   }
}
