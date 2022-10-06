package a.a.a.c.e;

import a.a.a.c.e.a.EXI;
import a.a.a.c.e.a.EXO;
import a.a.a.c.e.a.EXP;
import a.a.a.c.e.a.EXQ;
import a.a.a.c.e.a.EXR;
import a.a.a.c.e.a.a.EVK;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.b.EVP;
import a.a.a.c.e.a.b.EVU;
import a.a.a.c.e.a.b.a.EVR;
import a.a.a.c.e.a.c.EVW;
import a.a.a.c.e.a.d.EWA;
import a.a.a.c.e.a.d.EWD;
import a.a.a.c.e.a.d.EWE;
import a.a.a.c.e.a.e.EWF;
import a.a.a.c.e.a.f.EWH;
import a.a.a.c.e.a.f.EWJ;
import a.a.a.c.e.a.f.EWK;
import a.a.a.c.e.a.f.EWL;
import a.a.a.c.e.a.f.EWP;
import a.a.a.c.e.a.f.EWQ;
import a.a.a.c.e.a.f.EWR;
import a.a.a.c.e.a.g.EWW;
import a.a.a.c.e.a.g.EWX;
import a.a.a.c.e.a.i.EXB;
import a.a.a.c.e.a.j.EXC;
import a.a.a.c.e.a.j.EXD;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.e.b.EXJ;
import a.a.a.c.e.c.EXL;
import a.a.a.c.e.c.EXN;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedAction;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.InvalidKeySpecException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.jar.JarInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.image.Image;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.util.Callback;
import javax.crypto.NoSuchPaddingException;

public class EXK extends Application implements EVW, EXP {
   private static final String GTM = "SKIP_UPDATE";
   private final ResourceBundle GTN;
   private final EXB GTO;
   private final String GTP = " | ";
   private final String GTQ;
   private final String GTR;
   private final String GTS;
   private final String GTT;
   private Rectangle2D GTU = Screen.getPrimary().getVisualBounds();
   private Stage GTV;
   private EXJ GTW;
   private final EXI GTX = new EXI(0, 0, 0, 0);
   private final int QHN = 1;
   private final int QHO = 8;
   private final int QHP = 0;
   private final int QHQ = 151;
   private static Image QLA = new Image("/img/app/e_logo.png");
   private boolean QQO = false;
   private Thread.UncaughtExceptionHandler GUC = new Thread.UncaughtExceptionHandler() {
      public void uncaughtException(Thread var1, final Throwable var2) {
         EXF.getInstance().ICO();
         EXF.getInstance().ICA(var2);
         EXF.getInstance().ICE("About to start processing unhandled exception (B)");

         try {
            EXK.this.QQO = true;
            Alert var3 = new Alert(AlertType.ERROR);
            StringBuilder var4 = new StringBuilder();
            var4.append(var2.getLocalizedMessage());
            var4.append(System.lineSeparator());
            var3.setContentText(var4.toString());
            var3.setHeaderText(EXK.this.GTN.getString("micro.unhandled.error"));
            var3.setTitle(EXK.this.GTN.getString("micro.dialog.message.title"));
            ButtonType var5 = new ButtonType(EXK.this.GTN.getString("micro.dialog.message.button.report"), ButtonData.OTHER);
            var3.getButtonTypes().add(var5);
            var3.setResultConverter(new Callback<ButtonType, ButtonType>() {
               public ButtonType call(ButtonType var1) {
                  if (ButtonData.OTHER.equals(var1.getButtonData())) {
                     if (Desktop.isDesktopSupported()) {
                        Thread var2x = new Thread() {
                           public void run() {
                              try {
                                 File var1 = new File(EXK.GPW + "/reports");
                                 EXF.getInstance().ICK("reportsDir " + var1);
                                 boolean var2x = var1.mkdirs();
                                 EXF.getInstance().ICK("mkdirs " + var2x);
                                 File var3 = new File(var1, "report_" + (new SimpleDateFormat("yyyyMMdd'T'HHmmssS")).format(new Date()) + ".zip");
                                 EXF.getInstance().ICK("reportFile " + var3);
                                 EWF.IAB(false, var3, EXF.getInstance().getDefaultOutputLoggerFile(), EXF.getInstance().getDefaultErrorLoggerFile());
                                 StringBuilder var4 = new StringBuilder();
                                 var4.append("mailto:").append("jpk.helpdesk@mf.gov.pl");
                                 var4.append("?cc=").append("support@akmf.pl");
                                 StringBuilder var5 = new StringBuilder(EXN.getInstance().getMessageForKey("micro.launcher.error.mail.subject"));
                                 var5.append(" [");
                                 var5.append((new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")).format(new Date()));
                                 var5.append(" ]");
                                 var4.append("&subject=").append(URLEncoder.encode(var5.toString(), StandardCharsets.UTF_8.name()).replace("+", "%20"));
                                 var4.append("&attachment=").append(var3.toURI().toString().replace("+", "%20"));
                                 StringBuilder var6 = new StringBuilder();
                                 var6.append("#######");
                                 var6.append(System.lineSeparator());

                                 try {
                                    var6.append("os.name " + System.getProperty("os.name")).append(System.lineSeparator());
                                    var6.append("os.arch " + System.getProperty("os.arch")).append(System.lineSeparator());
                                    var6.append("java.version " + System.getProperty("java.version")).append(System.lineSeparator());
                                    var6.append("java.vendor " + System.getProperty("java.vendor")).append(System.lineSeparator());
                                    var6.append("java.vm.name " + System.getProperty("java.vm.name")).append(System.lineSeparator());
                                    var6.append("file.encoding " + System.getProperty("file.encoding")).append(System.lineSeparator());
                                    MemoryUsage var7 = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
                                    var6.append("memory init " + var7.getInit() / 1024L / 1024L + " MB").append(System.lineSeparator());
                                    var6.append("memory max " + var7.getMax() / 1024L / 1024L + " MB").append(System.lineSeparator());
                                    var6.append("memory committed " + var7.getCommitted() / 1024L / 1024L + " MB").append(System.lineSeparator());
                                    var6.append("memory used " + var7.getUsed() / 1024L / 1024L + " MB").append(System.lineSeparator());
                                    var6.append(System.lineSeparator());
                                 } catch (Exception var12) {
                                    EXF.getInstance().ICA((Throwable)var12);
                                 }

                                 EXO[] var15 = EXO.values();
                                 int var8 = var15.length;

                                 for(int var9 = 0; var9 < var8; ++var9) {
                                    EXO var10 = var15[var9];
                                    String var11 = (String)EXQ.getInstance().IEO(var10.getImplTitle());
                                    var6.append(var10.getSpecTitle());
                                    var6.append(" ");
                                    var6.append(var11);
                                    var6.append(System.lineSeparator());
                                 }

                                 var6.append(System.lineSeparator());
                                 var6.append("#######");
                                 var6.append(System.lineSeparator());
                                 var6.append(System.lineSeparator());
                                 var6.append(var2.getLocalizedMessage());
                                 var6.append(System.lineSeparator());
                                 var6.append(System.lineSeparator());
                                 ByteArrayOutputStream var16 = new ByteArrayOutputStream();
                                 PrintStream var17 = new PrintStream(var16, true, StandardCharsets.UTF_8.name());
                                 var2.printStackTrace(var17);
                                 var6.append(new String(var16.toByteArray(), StandardCharsets.UTF_8));
                                 var6.append(System.lineSeparator());
                                 var6.append("#######");
                                 var6.append(System.lineSeparator());
                                 var6.append(System.lineSeparator());
                                 var6.append("#######");
                                 var6.append(System.lineSeparator());
                                 var6.append(var3.getAbsolutePath());
                                 var6.append(System.lineSeparator());
                                 var6.append("#######");
                                 var6.append(System.lineSeparator());
                                 Desktop.getDesktop().open(var1);
                                 var4.append("&body=").append(URLEncoder.encode(var6.toString(), StandardCharsets.UTF_8.name()).replace("+", "%20"));
                                 String var18 = var4.toString();
                                 URI var14 = new URI(var18);
                                 Desktop.getDesktop().mail(var14);
                              } catch (Exception var13) {
                                 EXF.getInstance().ICA((Throwable)var13);
                              }

                           }
                        };
                        var2x.start();
                        return null;
                     } else {
                        EXF.getInstance().ICA((Object)"Desktop is NOT Supported");
                        return ButtonType.NO;
                     }
                  } else {
                     return ButtonType.OK;
                  }
               }
            });
            Optional var6 = var3.showAndWait();
            EXF.getInstance().ICK("optional " + var6);
         } catch (Throwable var10) {
            EXF.getInstance().ICA(var10);
         } finally {
            EXF.getInstance().ICP();
            System.exit(7);
         }

      }
   };
   private Application GUD = null;
   private EXL QWF = null;
   List<EWE<String, String, String, String, String, Integer>> GUE;
   Map<EXO, List<EWE<String, String, String, String, Integer, File>>> GUF;
   Map<String, EWA<RandomAccessFile, RandomAccessFile, Long, File>> GUG;
   final int[][] GUH = new int[][]{{0, 5, 105}, {0, 28, 20}, {0, 12, 41}, {0, 80, 86}, {0, 3, 255}, {0, 28, 66}, {0, 15, 75}, {0, 22, 62}, {8, 0, 39}};

   public static void main(String[] var0) {
      EVW.EVX var1 = EVW.getOS();
      String var2 = null;
      RuntimeMXBean var3 = ManagementFactory.getRuntimeMXBean();
      String var4 = var3.getName();
      if (var4 != null) {
         String[] var5 = var4.split("@");
         if (var5 != null && var5.length > 0) {
            var2 = var5[0];
            EXF.getInstance().ICE("current PID " + var2);
         }
      }

      String var21 = null;
      String var6 = null;
      String var7 = null;
      String var8 = null;
      String[] var9 = var0;
      int var10 = var0.length;

      for(int var11 = 0; var11 < var10; ++var11) {
         String var12 = var9[var11];
         if (var12 != null && var12.startsWith("-oldBootStrapLib=")) {
            var21 = var12.replaceFirst("-oldBootStrapLib=", "");
         }

         if (var12 != null && var12.startsWith("-newBootStrapLib=")) {
            var6 = var12.replaceFirst("-newBootStrapLib=", "");
         }

         if (var12 != null && var12.startsWith("-parentPID=")) {
            var7 = var12.replaceFirst("-parentPID=", "");
         }

         if (var12 != null && var12.startsWith("-skipUpdate=")) {
            var8 = var12.replaceFirst("-skipUpdate=", "");
         }
      }

      boolean var22 = Boolean.parseBoolean(var8);
      if (var22) {
         EXQ.getInstance().IEN("SKIP_UPDATE", "true");
      }

      if (var21 != null) {
         File var23 = new File(var21);

         try {
            boolean var24 = true;
            if (var23.exists()) {
               if (var7 != null && var7.length() > 0 && EVW.EVX.Windows == var1) {
                  try {
                     EXF.getInstance().ICE("about to kill process " + var7);
                     Process var25 = Runtime.getRuntime().exec("taskkill /F /PID " + var7);
                     int var13 = var25.waitFor();
                     EXF.getInstance().ICE("process " + var7 + " killed " + var13);
                  } catch (InterruptedException var19) {
                     EXF.getInstance().ICA((Throwable)var19);
                  }
               }

               EXF.getInstance().ICE("about to delete file " + var23);
               int var26 = 10;
               var24 = false;

               while(!var24 && var26 > 0) {
                  try {
                     EXF.getInstance().ICE("deleting file attemptd counter " + var26);
                     Files.delete(var23.toPath());
                     var24 = true;
                     EXF.getInstance().ICE("file deleted " + var23);
                  } catch (IOException var18) {
                     --var26;
                     EXF.getInstance().ICA((Throwable)var18);

                     try {
                        Thread.sleep(2000L);
                     } catch (InterruptedException var17) {
                     }
                  }
               }

               if (!var24) {
                  EXQ.getInstance().IEN("SKIP_UPDATE", "true");
               }
            }

            if (var6 != null) {
               File var27 = new File(var6);
               if (var27.exists()) {
                  File var28 = new File(EXK.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
                  String var14 = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
                  ArrayList var15 = new ArrayList();
                  var15.add(var14);
                  var15.add("-Xbootclasspath/a:" + var23.getAbsolutePath());
                  var15.add("-jar");
                  var15.add(var28.getName());
                  if (!var23.exists()) {
                     EWF.RHW(var27.getAbsolutePath(), var23.getAbsolutePath());
                  }

                  var15.add("-oldBootStrapLib=" + var27.getAbsolutePath());
                  if (var2 != null) {
                     var15.add("-parentPID=" + var2);
                  }

                  if (!var24) {
                     var15.add("-skipUpdate=true");
                  }

                  ProcessBuilder var16 = new ProcessBuilder(var15);
                  var16.directory(var28.getParentFile());
                  EXF.getInstance().ICE("command " + var15);
                  var16.start();
                  System.exit(0);
               }
            }
         } catch (URISyntaxException | IOException var20) {
            EXF.getInstance().ICA((Throwable)var20);
            System.exit(0);
         }
      }

      Security.setProperty("crypto.policy", "unlimited");
      System.setProperty("com.sun.xml.internal.bind.v2.bytecode.ClassTailor.noOptimize", "true");
      launch(new String[0]);
   }

   public EXK() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException {
      EXF.getInstance().ICO();

      try {
         File var1 = new File(GPW);
         var1.mkdirs();
         this.GTN = ResourceBundle.getBundle("messages/launcher_messages", EXC.getInstance().getCurrentLocaleOrDefault(), new EXD());
         this.GTO = new EXB("qr0w0t0tqwqg0eweq7qhqw0r0eqyqh0u".toCharArray(), "abcdabcd12341234".getBytes(), "abcdabcd12341234abcdabcd12341234".getBytes());
         this.GTQ = this.GTN.getString("micro.launcher.progress.step.init");
         this.GTR = this.GTN.getString("micro.launcher.progress.step.start");
         this.GTS = this.GTN.getString("micro.launcher.progress.step.stop.success");
         this.GTT = this.GTN.getString("micro.launcher.progress.step.stop.failure");
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void start(Stage var1) throws Exception {
      EXF.getInstance().ICO();

      try {
         try {
            EXF.getInstance().ICE("os.name " + System.getProperty("os.name"));
            EXF.getInstance().ICE("os.arch " + System.getProperty("os.arch"));
            EXF.getInstance().ICE("java.version " + System.getProperty("java.version"));
            EXF.getInstance().ICE("java.vendor " + System.getProperty("java.vendor"));
            EXF.getInstance().ICE("java.vm.name " + System.getProperty("java.vm.name"));
            EXF.getInstance().ICE("file.encoding " + System.getProperty("file.encoding"));
            MemoryUsage var2 = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
            EXF.getInstance().ICE("memory init " + var2.getInit() / 1024L / 1024L + " MB");
            EXF.getInstance().ICE("memory max " + var2.getMax() / 1024L / 1024L + " MB");
            EXF.getInstance().ICE("memory committed " + var2.getCommitted() / 1024L / 1024L + " MB");
            EXF.getInstance().ICE("memory used " + var2.getUsed() / 1024L / 1024L + " MB");
         } catch (Exception var28) {
            EXF.getInstance().ICA((Throwable)var28);
         }

         boolean var9;
         label104: {
            String var31 = System.getProperty("java.version");
            EXF.getInstance().ICE("javaVersion " + var31);
            String[] var3 = var31.split("_");
            String var4 = var3[0];
            EXF.getInstance().ICE("javaMainVersion " + var4);
            String[] var5 = var4.split("\\.");
            int var6 = Integer.parseInt(var5[0]);
            int var7 = Integer.parseInt(var5[1]);
            int var8 = Integer.parseInt(var5[2]);
            var9 = false;
            this.getClass();
            if (1 == var6) {
               this.getClass();
               if (8 == var7) {
                  this.getClass();
                  if (0 == var8) {
                     int var10 = Integer.parseInt(var3[1]);
                     EXF.getInstance().ICE("javaUpdateVersion " + var10);
                     this.getClass();
                     if (151 <= var10) {
                        var9 = true;
                     }
                     break label104;
                  }
               }
            }

            this.IDN(this.GTN.getString("micro.launcher.startup.error.system"), this.GTN.getString("micro.launcher.startup.error.java"), this.GTN.getString("micro.launcher.startup.error.java.version").replaceFirst("##VERSION##", "1.8.0"));
         }

         if (var9) {
            boolean var32 = true;
            RandomAccessFile var11 = null;
            FileChannel var12 = null;

            try {
               File var13 = this.IDU();
               File var14 = new File(var13, "lock.file");
               if (!var14.exists()) {
                  var14.createNewFile();
               }

               var11 = new RandomAccessFile(var14, "rw");
               var12 = var11.getChannel();
               FileLock var15 = var12.tryLock();
               if (var15 == null) {
                  var32 = false;
               }
            } catch (Exception var27) {
               EXF.getInstance().ICA((Throwable)var27);
               var32 = false;
            }

            if (var32) {
               Toolkit var33 = Toolkit.getDefaultToolkit();
               EXF.getInstance().ICE("ScreenSize Width " + var33.getScreenSize().getWidth());
               EXF.getInstance().ICE("ScreenSize Height " + var33.getScreenSize().getHeight());
               EXF.getInstance().ICE("ScreenResolution " + var33.getScreenResolution());
               Rectangle2D var34 = Screen.getPrimary().getVisualBounds();
               EXF.getInstance().ICE("Screen Width " + var34.getWidth());
               EXF.getInstance().ICE("Screen Height " + var34.getHeight());
               Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                  public void uncaughtException(Thread var1, Throwable var2) {
                     EXF.getInstance().ICO();
                     EXF.getInstance().ICA(var2);
                     EXF.getInstance().ICE("About to start processing unhandled exception (A)");

                     try {
                        EXK.this.QQO = true;
                        if (var2 instanceof ThreadDeath) {
                           EXF.getInstance().ICI("Exception skipped");
                        } else {
                           File var3 = new File(EVW.GPW + "/reports");
                           var3.mkdirs();
                           File var4 = new File(var3, "report_" + (new SimpleDateFormat("yyyyMMdd'T'HHmmssS")).format(new Date()) + ".zip");
                           EWF.IAB(false, var4, EXF.getInstance().getDefaultOutputLoggerFile(), EXF.getInstance().getDefaultErrorLoggerFile());
                           Desktop.getDesktop().open(var3);
                        }
                     } catch (Throwable var8) {
                        EXF.getInstance().ICA(var8);
                     } finally {
                        EXF.getInstance().ICP();
                     }

                  }
               });
               Thread.currentThread().setUncaughtExceptionHandler(this.GUC);
               this.GTV = var1;
               this.GTV.setOnCloseRequest(new EventHandler<WindowEvent>() {
                  public void handle(WindowEvent var1) {
                     EXF.getInstance().ICO();

                     try {
                        boolean var2 = false;
                        boolean var3 = false;
                        if (EXK.this.GUD != null) {
                           Method var4 = EXK.this.GUD.getClass().getMethod("QQF");
                           var2 = (Boolean)var4.invoke(EXK.this.GUD);
                           var4 = EXK.this.GUD.getClass().getMethod("QQG");
                           var3 = (Boolean)var4.invoke(EXK.this.GUD);
                        }

                        if (var2) {
                           ButtonBar.ButtonData var12 = EXK.this.QOH(EXK.this.GTN.getString("micro.launcher.exit.confirm.title"), (String)null, EXK.this.GTN.getString("micro.launcher.exit.confirm.button.exit"), EXK.this.GTN.getString("micro.launcher.exit.confirm.button.cancel"), 400.0, 140.0, EXK.this.GTN.getString("micro.launcher.exit.confirm.message"), true);
                           if (var12 != null && ButtonData.OK_DONE.equals(var12)) {
                              if (EXK.this.GUD != null) {
                                 Method var5 = EXK.this.GUD.getClass().getMethod("QQE");
                                 boolean var6 = true;
                                 var6 = (Boolean)var5.invoke(EXK.this.GUD);
                                 if (!var6) {
                                    var1.consume();
                                 }
                              }
                           } else {
                              var1.consume();
                           }
                        } else {
                           EXF.getInstance().ICI("Close atempt before applicatrion started!");
                           if (var3) {
                              EXF.getInstance().ICI("Close enabled due to application start exception.");
                           } else if (EXK.this.QQO) {
                              EXF.getInstance().ICI("Close enabled due to launcher start exception.");
                           } else {
                              EXF.getInstance().ICI("Close disabled.");
                              var1.consume();
                           }
                        }
                     } catch (SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException var10) {
                        EXF.getInstance().ICA((Throwable)var10);
                     } finally {
                        EXF.getInstance().ICP();
                     }

                  }
               });
               FXMLLoader var35 = new FXMLLoader(EXK.class.getResource("/fxml/micro_launcher_main.fxml"));
               var35.setResources(this.GTN);
               Parent var16 = (Parent)var35.load();
               Scene var17 = new Scene(var16);
               this.GTW = (EXJ)var35.getController();
               this.GTW.IDK();
               this.GTW.IDM();
               this.GTV.setScene(var17);
               Region var18 = (Region)var16;
               this.GTV.setMinWidth(var18.getMinWidth());
               this.GTV.setMinHeight(var18.getMinHeight());
               this.GTV.setMaxWidth(var18.getMaxWidth());
               this.GTV.setMaxHeight(var18.getMaxHeight());
               this.GTV.setWidth(var18.getWidth());
               this.GTV.setHeight(var18.getHeight());
               this.GTV.setX(this.GTU.getWidth() / 2.0 - var18.getMaxWidth() / 2.0);
               this.GTV.setY(this.GTU.getHeight() / 2.0 - var18.getMaxHeight() / 2.0);
               this.GTV.setTitle(this.GTN.getString("micro.launcher.main.title"));
               this.GTV.getIcons().add(new Image("/img/app/e_logo.png"));
               this.GTV.show();
               String var19 = (String)EXQ.getInstance().IEO("SKIP_UPDATE");
               final boolean var20 = Boolean.parseBoolean(var19);
               EVN var21 = new EVN() {
                  public void HZI() {
                     try {
                        EXK.this.IEC(var20);
                     } catch (Exception var2) {
                        EXF.getInstance().ICA((Throwable)var2);
                        throw new RuntimeException(var2);
                     }
                  }
               };
               var21.start();
            } else {
               this.IDO(this.GTN.getString("micro.launcher.startup.error.system"), this.GTN.getString("micro.launcher.startup.error.duplicate"), this.GTN.getString("micro.launcher.startup.error.duplicate.det"), 550.0, 200.0, true);
            }
         } else {
            this.IDN(this.GTN.getString("micro.launcher.startup.error.system"), this.GTN.getString("micro.launcher.startup.error.java"), this.GTN.getString("micro.launcher.startup.error.java.version").replaceFirst("##VERSION##", "1.8.0_151"));
         }
      } catch (Exception var29) {
         EXF.getInstance().ICA((Throwable)var29);
         throw var29;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void IDN(String var1, String var2, String var3) {
      EXF.getInstance().ICO();

      try {
         this.IDP(var1, var2, var3, (Double)null, (Double)null, (Boolean)null, false);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void IDO(String var1, String var2, String var3, Double var4, Double var5, Boolean var6) {
      EXF.getInstance().ICO();

      try {
         this.IDP(var1, var2, var3, var4, var5, var6, false);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void IDP(final String var1, final String var2, final String var3, final Double var4, final Double var5, final Boolean var6, boolean var7) {
      EXF.getInstance().ICO();

      try {
         if (var7) {
            this.IDQ(var1, var2, var3, var4, var5, var6);
         } else {
            Platform.runLater(new Runnable() {
               public void run() {
                  EXK.this.IDQ(var1, var2, var3, var4, var5, var6);
               }
            });
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void IDQ(String var1, String var2, String var3, Double var4, Double var5, Boolean var6) {
      EXF.getInstance().ICO();

      try {
         this.QOG(AlertType.ERROR, var1, var2, var3, var4, var5, var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private Optional<ButtonType> QOG(Alert.AlertType var1, String var2, String var3, String var4, Double var5, Double var6, Boolean var7) {
      EXF.getInstance().ICO();

      Optional var10;
      try {
         Alert var8 = new Alert(var1);
         if (var5 != null) {
            var8.setWidth(var5);
            var8.getDialogPane().setMinWidth(var5);
         }

         if (var6 != null) {
            var8.setHeight(var6);
            var8.getDialogPane().setMinHeight(var6);
         }

         var8.setResizable(true);
         var8.setTitle(var2);
         var8.setHeaderText(var3);
         var8.setContentText(var4);
         Optional var9 = var8.showAndWait();
         if (var7 != null && var7) {
            System.exit(1);
         }

         var10 = var9;
      } finally {
         EXF.getInstance().ICP();
      }

      return var10;
   }

   private ButtonBar.ButtonData QOH(final String var1, final String var2, final String var3, final String var4, final double var5, final double var7, final String var9, boolean var10) {
      EXF.getInstance().ICO();

      final Semaphore var12;
      try {
         final EWD var11 = new EWD();
         if (var10 && com.sun.javafx.tk.Toolkit.getToolkit().isFxUserThread()) {
            var11.setFirstValue(this.getCloseDialogInner(var1, var2, var3, var4, var5, var7, var9));
         } else {
            var12 = new Semaphore(1);
            var12.acquire();
            Platform.runLater(new Runnable() {
               public void run() {
                  var11.setFirstValue(EXK.this.getCloseDialogInner(var1, var2, var3, var4, var5, var7, var9));
                  var12.release();
               }
            });
            var12.acquire();
         }

         ButtonBar.ButtonData var18 = (ButtonBar.ButtonData)var11.getFirstValue();
         return var18;
      } catch (InterruptedException var16) {
         EXF.getInstance().ICA((Throwable)var16);
         var12 = null;
      } finally {
         EXF.getInstance().ICP();
      }

      return var12;
   }

   private ButtonBar.ButtonData getCloseDialogInner(String var1, String var2, String var3, String var4, double var5, double var7, String var9) {
      EXF.getInstance().ICO();

      ButtonBar.ButtonData var14;
      try {
         Dialog var10 = new Dialog();
         var10.getDialogPane().setMinWidth(var5);
         var10.getDialogPane().setMinHeight(var7);
         var10.setTitle(var1);
         if (var2 != null) {
            var10.setHeaderText(var2);
         }

         var10.setContentText(var9);
         ButtonType var11 = new ButtonType(var3, ButtonData.YES);
         ButtonType var12 = new ButtonType(var4, ButtonData.CANCEL_CLOSE);
         var10.getDialogPane().getButtonTypes().add(var11);
         var10.getDialogPane().getButtonTypes().add(var12);
         var10.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
         var10.getDialogPane().lookupButton(ButtonType.CANCEL).setManaged(false);
         var10.setResultConverter(new Callback<ButtonType, ButtonBar.ButtonData>() {
            public ButtonBar.ButtonData call(ButtonType var1) {
               switch (var1.getButtonData()) {
                  case YES:
                     return ButtonData.OK_DONE;
                  case APPLY:
                  case CANCEL_CLOSE:
                     return ButtonData.CANCEL_CLOSE;
                  default:
                     return ButtonData.OTHER;
               }
            }
         });
         QOI(var10.getDialogPane());
         QOJ(var10.getDialogPane());
         Optional var13 = var10.showAndWait();
         if (!var13.isPresent()) {
            var14 = ButtonData.OTHER;
            return var14;
         }

         var14 = (ButtonBar.ButtonData)var13.get();
      } finally {
         EXF.getInstance().ICP();
      }

      return var14;
   }

   private static void QOI(DialogPane var0) {
      var0.getStylesheets().add("/css/Dialog.css");
      var0.getStyleClass().add("myDialog");
   }

   private static void QOJ(DialogPane var0) {
      Stage var1 = (Stage)var0.getScene().getWindow();
      var1.getIcons().add(QLA);
   }

   public void stop() {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("About to stop the application");
         if (this.GUD != null) {
            this.GUD.stop();
         }

         EXF.getInstance().ICE("About to clean all live threads");
         EVK.getInstance().HZH();
         EXF.getInstance().ICE("All live threads cleaned");
         if (this.QWF != null) {
            EXF.getInstance().ICE("About to close class loader");

            try {
               this.QWF.close();
            } catch (Exception var6) {
               EXF.getInstance().ICA((Throwable)var6);
            }

            EXF.getInstance().ICE("Class loader closed");
         }

         super.stop();
         EXF.getInstance().ICE("Application stopped");
      } catch (Throwable var7) {
         EXF.getInstance().ICA(var7);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void IDR() throws Exception {
      EXF.getInstance().ICO();

      try {
         File var1 = this.IDU();
         File var2 = new File(var1, "msgs");
         var2.mkdirs();
         Map var3 = this.IDY(var2);
         boolean var4 = true;
         EXO[] var5 = EXO.values();
         int var6 = var5.length;
         int var7 = 0;

         while(true) {
            if (var7 < var6) {
               EXO var8 = var5[var7];
               EXI var9 = (EXI)var3.get(var8);
               if (var9 != null && !var9.equals(this.GTX)) {
                  ++var7;
                  continue;
               }

               var4 = false;
            }

            if (var4) {
               EVN var13 = new EVN() {
                  public void HZI() {
                     EXF.getInstance().ICO();

                     try {
                        EXK.this.IDS();
                     } catch (Exception var5) {
                        EXF.getInstance().ICA((Throwable)var5);
                        throw new RuntimeException(var5);
                     } finally {
                        EXF.getInstance().ICP();
                     }

                  }
               };
               var13.start();
            } else {
               this.IDO(this.GTN.getString("micro.launcher.startup.error.system"), this.GTN.getString("micro.launcher.startup.error.library"), this.GTN.getString("micro.launcher.startup.error.library.det"), 550.0, 200.0, true);
            }
            break;
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void IDS() throws Exception {
      EXF.getInstance().ICO();
      final String var1 = this.GTN.getString("micro.launcher.progress.startup");
      String var2 = this.GTN.getString("micro.launcher.progress.startup.init");
      final String var3 = this.GTN.getString("micro.launcher.progress.startup.load");

      try {
         EXF.getInstance().ICE("About to initialize main application");
         this.IDZ(var1, this.GTQ, 0.0, -1.0);
         File var4 = this.IDU();
         File var5 = new File(var4, "msgs");
         File var6 = this.IDV();
         File var7 = var6.getParentFile();
         File var8 = new File(var7, "msgs");
         var8.mkdirs();
         String var9 = "MicroExternalResources.jar";
         String var10 = "MicroExternalLibraries.zip";
         File var11 = new File(var8, var9);
         File var12 = new File(var8, var10);
         EXF.getInstance().ICE("About to verify libraries signatures");
         CertificateFactory var13 = CertificateFactory.getInstance("X.509");
         Certificate var14 = var13.generateCertificate(EXK.class.getResourceAsStream("/cert/akmf_apps.cert.pem"));

         int var19;
         try {
            EVP.HZS(var14, var6);
            if (var11 != null && var11.exists()) {
               EVP.HZS(var14, var11);
            }

            if (var12 != null && var12.exists()) {
               EVP.HZS(var14, var12);
            }

            EXO[] var15 = EXO.values();
            int var16 = var15.length;
            int var17 = 0;

            while(true) {
               if (var17 >= var16) {
                  EXF.getInstance().ICE("Libraries signatures verification passed successfully");
                  break;
               }

               EXO var18 = var15[var17];

               for(var19 = 0; var19 < var18.getLibParts(); ++var19) {
                  String var20 = String.format("%02d", var19 + 1);
                  String var21 = this.IDX(var18.getImplTitle(), var20);
                  EXF.getInstance().ICE("About to verify signatures for [" + var21 + "]");
                  File var22 = new File(var5, var21);
                  if (var22.isFile() && var22.exists()) {
                     byte[] var23 = EWF.IAE(var22);
                     byte[] var24 = Base64.getDecoder().decode(var23);

                     try {
                        byte[] var25 = this.GTO.IBS(var24);
                        byte[] var26 = Base64.getDecoder().decode(var25);
                        EVP.HZS(var14, var26);
                     } catch (InvalidKeyException | InvalidAlgorithmParameterException | IOException var93) {
                        EXF.getInstance().IBZ("!!!", var93);
                     } finally {
                        ;
                     }
                  }
               }

               ++var17;
            }
         } catch (EVR var97) {
            EXF.getInstance().ICA((Object)"Libraries signatures verification failed");
            EXF.getInstance().ICA((Throwable)var97);
            this.IDP(this.GTN.getString("micro.launcher.startup.error.system"), this.GTN.getString("micro.launcher.startup.error.library"), this.GTN.getString("micro.launcher.startup.error.library.signature"), 550.0, 200.0, true, true);
         }

         EXF.getInstance().ICE("About to load libraries");
         final ClassLoader var100 = ClassLoader.getSystemClassLoader();
         final HashMap var101 = new HashMap();
         this.IDZ(var1, this.GTR, 0.05, -1.0);
         final ArrayList var102 = new ArrayList();
         int var27;
         int var126;
         if (var12 != null && var12.exists()) {
            File var103 = new File(var4.getParentFile(), "lib");
            var103.mkdirs();
            Set var105 = this.RHX("", var103);
            FileInputStream var106 = null;

            try {
               var106 = new FileInputStream(var12);
               ZipInputStream var108 = new ZipInputStream(var106);
               ZipEntry var112 = var108.getNextEntry();

               while(true) {
                  if (var112 == null) {
                     var108.closeEntry();
                     var108.close();
                     break;
                  }

                  String var116 = var112.getName();
                  if (var116.endsWith(".jar")) {
                     if (!var105.contains(var116)) {
                        File var121 = new File(var103, var116);
                        EXF.getInstance().ICE("About to add new library " + var121);
                        var121.getParentFile().mkdirs();
                        FileOutputStream var124 = null;

                        try {
                           var102.add(var121.toURI().toURL());
                           var124 = new FileOutputStream(var121);
                           var27 = 1048576;
                           byte[] var28 = new byte[var27];

                           while((var126 = var108.read(var28)) != -1) {
                              var124.write(var28, 0, var126);
                              var124.flush();
                           }
                        } finally {
                           if (var124 != null) {
                              var124.close();
                           }

                        }

                        EXF.getInstance().ICE("Library added");
                     } else {
                        var105.remove(var116);
                        var102.add((new File(var103, var116)).toURI().toURL());
                     }
                  }

                  var112 = var108.getNextEntry();
               }
            } finally {
               if (var106 != null) {
                  var106.close();
               }

               EXF.getInstance().ICP();
            }

            Iterator var110 = var105.iterator();

            while(var110.hasNext()) {
               String var114 = (String)var110.next();

               try {
                  File var117 = new File(var103, var114);
                  EXF.getInstance().ICE("About to remove obsolete library " + var117);
                  Files.delete(var117.toPath());
                  EXF.getInstance().ICE("Obsolete library removed");
               } catch (Exception var92) {
                  EXF.getInstance().ICA((Throwable)var92);
               }
            }
         }

         int var104 = 0;
         var19 = EXO.values().length;
         EXO[] var107 = EXO.values();
         int var111 = var107.length;

         for(int var115 = 0; var115 < var111; ++var115) {
            final EXO var118 = var107[var115];
            ++var104;

            for(int var122 = 0; var122 < var118.getLibParts(); ++var122) {
               String var125 = String.format("%02d", var122 + 1);
               String var128 = this.IDX(var118.getImplTitle(), var125);
               File var129 = new File(var5, var128);
               if (var129.isFile()) {
                  final double var130 = 0.05 + 0.7 * (1.0 * (double)var104 / (double)var19);
                  this.IDZ(var1, var118.getSpecTitle(), var130, -1.0);
                  byte[] var30 = EWF.IAE(var129);
                  byte[] var31 = Base64.getDecoder().decode(var30);

                  try {
                     byte[] var32 = this.GTO.IBS(var31);
                     byte[] var33 = Base64.getDecoder().decode(var32);
                     EWX var34 = new EWX() {
                        public void IBI(long var1x, double var3, long var5, long var7, long var9, long var11) {
                           EXF.getInstance().ICO();

                           try {
                              EXK.this.IDZ(var1, var118.getSpecTitle(), var130, var3);
                           } finally {
                              EXF.getInstance().ICP();
                           }

                        }
                     };
                     JarInputStream var35 = new JarInputStream(new EWW(new ByteArrayInputStream(var33), (long)var33.length, var34));
                     String var36 = EVU.getImplementationVersionStringForJarInputStream(var35);
                     String var37 = EVU.getImplementationTitleForJarInputStream(var35);
                     EXQ.getInstance().IEN(var118.getImplTitle(), var36);
                     var101.put(var37, var33);
                  } catch (InvalidKeyException | InvalidAlgorithmParameterException | IOException var90) {
                     EXF.getInstance().IBZ("!!!", var90);
                  } finally {
                     this.IDZ(var1, var118.getSpecTitle(), var130, 1.0);
                  }
               }
            }
         }

         this.IDZ(var1, var2, 0.8, -1.0);
         this.QWF = (EXL)AccessController.doPrivileged(new PrivilegedAction<EXL>() {
            public EXL run() {
               try {
                  return new EXL((URL[])var102.toArray(new URL[0]), var101, var100);
               } catch (IOException var2) {
                  EXF.getInstance().ICA((Throwable)var2);
                  throw new RuntimeException(var2);
               }
            }
         });
         this.IDZ(var1, var2, 0.85, -1.0);
         URL.setURLStreamHandlerFactory(new URLStreamHandlerFactory() {
            public URLStreamHandler createURLStreamHandler(String var1) {
               return "bytes".equals(var1) ? new URLStreamHandler() {
                  protected URLConnection openConnection(final URL var1) throws IOException {
                     return new URLConnection(var1) {
                        public void connect() throws IOException {
                        }

                        public InputStream getInputStream() throws IOException {
                           return EXK.this.QWF.getResourceAsStream(var1.getFile().split("!")[1].substring(1));
                        }
                     };
                  }
               } : null;
            }
         });
         EXF.getInstance().ICE("Libraries loaded");
         this.IDZ(var1, var2, 0.9, -1.0);
         EXF.getInstance().ICE("About to initialize main application");
         Class var109 = Class.forName("a.a.a.c.c.b.EMZ", true, this.QWF);
         Constructor var113 = var109.getConstructor(EVW.class);
         this.GUD = (Application)var113.newInstance(this);

         try {
            Class var119 = Class.forName("a.a.a.c.e.a.EXQ", true, this.QWF);
            Method var120 = var119.getDeclaredMethod("getInstance");
            EXQ var123 = (EXQ)var120.invoke(var119);
            EXO[] var127 = EXO.values();
            var126 = var127.length;

            for(var27 = 0; var27 < var126; ++var27) {
               EXO var131 = var127[var27];
               String var29 = (String)EXQ.getInstance().IEO(var131.getImplTitle());
               var123.IEN(var131.getImplTitle(), var29);
            }
         } catch (Exception var98) {
            EXF.getInstance().ICI(var98);
         }

         Platform.runLater(new Runnable() {
            public void run() {
               EXF.getInstance().ICO();

               try {
                  Thread.currentThread().setContextClassLoader(EXK.this.QWF);
                  Method var1x = EXK.this.GUD.getClass().getMethod("HNA", Stage.class, EWX.class);
                  EWX var2 = new EWX() {
                     public void IBI(long var1x, double var3x, long var5, long var7, long var9, long var11) {
                        EXF.getInstance().ICO();

                        try {
                           EXK.this.IDZ(var1, var3, 0.95, var3x);
                        } finally {
                           EXF.getInstance().ICP();
                        }

                     }
                  };
                  EXK.this.IDZ(var1, EXK.this.GTS, 1.0, 1.0);
                  var1x.invoke(EXK.this.GUD, EXK.this.GTV, var2);
               } catch (Exception var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  throw new RuntimeException(var6);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
         EXF.getInstance().ICE("Main application initialized");
         this.GTW.IDL();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void IDT() throws Exception {
      EXF.getInstance().ICO();

      try {
         this.GTV.close();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private Set<String> RHX(String var1, File var2) {
      String var3 = var1 != null && var1.length() > 0 ? var1 + "/" : "";
      HashSet var4 = new HashSet();
      if (var2 != null && var2.isDirectory()) {
         File[] var5 = var2.listFiles();
         if (var5 != null) {
            File[] var6 = var5;
            int var7 = var5.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               File var9 = var6[var8];
               if (var9 != null && var9.isDirectory()) {
                  var4.addAll(this.RHX(var9.getName(), var9));
               } else if (var9 != null && var9.isFile()) {
                  var4.add(var3 + var9.getName());
               }
            }
         }
      }

      return var4;
   }

   private File IDU() {
      EXF.getInstance().ICO();

      File var2;
      try {
         File var1;
         try {
            var2 = this.IDV();
            if (var2 == null) {
               Object var3 = null;
               return (File)var3;
            }

            var1 = var2.getParentFile();
         } catch (Exception var7) {
            EXF.getInstance().ICA((Throwable)var7);
            var1 = null;
         }

         var2 = var1;
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private File IDV() {
      EXF.getInstance().ICO();

      File var2;
      try {
         File var1 = new File(EXK.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
         var2 = var1;
         return var2;
      } catch (Exception var6) {
         EXF.getInstance().ICA((Throwable)var6);
         var2 = null;
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private Map<String, EXI> IDW(File var1) throws IOException {
      EXF.getInstance().ICO();

      HashMap var18;
      try {
         HashMap var2 = new HashMap();
         String[] var4 = EVU.getImplementationVersion(EXK.class);
         EXI var3;
         if (var4 != null) {
            var3 = new EXI(var4);
         } else {
            var3 = new EXI(this.GTX);
         }

         var2.put("MicroLauncher." + EVW.EVX.Unix.getSuffix(), var3);
         var2.put("MicroLauncher." + EVW.EVX.Windows.getSuffix(), var3);
         boolean var16 = false;
         String var17 = "MicroExternalResources.jar";
         File var5 = new File(var1, var17);
         byte[] var6;
         JarInputStream var7;
         String[] var8;
         if (var5.isFile()) {
            var6 = EWF.IAE(var5);

            try {
               var7 = new JarInputStream(new ByteArrayInputStream(var6));
               var8 = EVU.getImplementationVersionForJarInputStream(var7);
               var2.put("MicroExternalResources.jar", new EXI(var8));
               var16 = true;
            } catch (IOException var14) {
               EXF.getInstance().IBZ("!!", var14);
            }
         }

         if (!var16) {
            var2.put("MicroExternalResources.jar", new EXI(this.GTX));
         }

         var16 = false;
         var17 = "MicroExternalLibraries.zip";
         var5 = new File(var1, var17);
         if (var5.isFile()) {
            var6 = EWF.IAE(var5);

            try {
               var7 = new JarInputStream(new ByteArrayInputStream(var6));
               var8 = EVU.getImplementationVersionForJarInputStream(var7);
               var2.put("MicroExternalLibraries.zip", new EXI(var8));
               var16 = true;
            } catch (IOException var13) {
               EXF.getInstance().IBZ("!!", var13);
            }
         }

         if (!var16) {
            var2.put("MicroExternalLibraries.zip", new EXI(this.GTX));
         }

         var18 = var2;
      } finally {
         EXF.getInstance().ICP();
      }

      return var18;
   }

   private String IDX(String var1, String var2) {
      EXF.getInstance().ICO();

      String var5;
      try {
         String var3 = var2.concat(".").concat(var1.replaceAll("\\.", "_").replaceAll("\\s", ""));
         String var4 = Base64.getUrlEncoder().encodeToString(var3.getBytes(StandardCharsets.UTF_8)).concat(".lib");
         var5 = var4;
      } finally {
         EXF.getInstance().ICP();
      }

      return var5;
   }

   private Map<EXO, EXI> IDY(File var1) throws Exception {
      EXF.getInstance().ICO();

      HashMap var28;
      try {
         HashMap var2 = new HashMap();
         EXO[] var3 = EXO.values();
         int var4 = var3.length;

         int var5;
         for(var5 = 0; var5 < var4; ++var5) {
            EXO var6 = var3[var5];

            for(int var7 = 0; var7 < var6.getLibParts(); ++var7) {
               String var8 = String.format("%02d", var7 + 1);
               String var9 = this.IDX(var6.getImplTitle(), var8);
               File var10 = new File(var1, var9);
               if (var10.isFile()) {
                  try {
                     byte[] var11 = EWF.IAE(var10);
                     byte[] var12 = Base64.getDecoder().decode(var11);
                     byte[] var13 = this.GTO.IBS(var12);
                     byte[] var14 = Base64.getDecoder().decode(var13);
                     JarInputStream var15 = new JarInputStream(new ByteArrayInputStream(var14));
                     if (var15 != null) {
                        String[] var16 = EVU.getImplementationVersionForJarInputStream(var15);
                        String var17 = EVU.getImplementationTitleForJarInputStream(var15);
                        EXO var18 = EXO.getLibraryByImplTitle(var17);
                        if (var16 != null && var2.put(var18, new EXI(var16)) != null) {
                        }
                     }
                  } catch (RuntimeException var23) {
                     EXF.getInstance().IBZ("!!", var23);
                  } catch (Exception var24) {
                     EXF.getInstance().IBZ("!!", var24);
                  }
               }
            }
         }

         HashMap var26 = new HashMap();
         EXO[] var27 = EXO.values();
         var5 = var27.length;

         for(int var29 = 0; var29 < var5; ++var29) {
            EXO var30 = var27[var29];
            EXI var31 = (EXI)var2.get(var30);
            if (var31 == null) {
               var31 = new EXI(this.GTX);
            }

            var26.put(var30, var31);
         }

         var28 = var26;
      } finally {
         EXF.getInstance().ICP();
      }

      return var28;
   }

   private void IDZ(String var1, String var2, Double var3, Double var4) {
      EXF.getInstance().ICO();

      try {
         String var5 = var1;
         if (var2 != null && var2.length() > 0) {
            StringBuilder var10000 = (new StringBuilder()).append(var1);
            this.getClass();
            var5 = var10000.append(" | ").append(var2).toString();
         }

         this.GTW.set_progress(var5, var3, var4);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void IEA(Double var1) {
      this.GTW.set_progress((String)null, (Double)null, var1);
   }

   private String getWinCpuId() {
      EXF.getInstance().ICO();

      String var2;
      try {
         Process var1 = Runtime.getRuntime().exec(new String[]{"cmd", "/c", "wmic cpu get processorid"});
         InputStream var13 = var1.getInputStream();
         InputStreamReader var3 = new InputStreamReader(var13);
         BufferedReader var4 = new BufferedReader(var3);
         String var5 = null;
         StringBuilder var6 = new StringBuilder();

         while((var5 = var4.readLine()) != null) {
            var6.append(var5.trim());
         }

         String var7 = var6.toString();
         return var7;
      } catch (Exception var11) {
         var2 = this.getFirstMac();
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private String getFirstMac() {
      EXF.getInstance().ICO();

      String var2;
      try {
         Enumeration var1 = NetworkInterface.getNetworkInterfaces();

         while(var1.hasMoreElements()) {
            NetworkInterface var11 = (NetworkInterface)var1.nextElement();
            if (!var11.isLoopback() && var11.isUp() && !this.IEB(var11.getHardwareAddress())) {
               byte[] var3 = var11.getHardwareAddress();
               if (var3 != null) {
                  StringBuilder var4 = new StringBuilder();

                  for(int var5 = 0; var5 < var3.length; ++var5) {
                     var4.append(String.format("%02X%s", var3[var5], var5 < var3.length - 1 ? "-" : ""));
                  }

                  String var12 = var4.toString();
                  return var12;
               }
            }
         }

         var2 = "idv#" + System.nanoTime();
         return var2;
      } catch (Exception var9) {
         var2 = "ide#" + System.nanoTime();
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private boolean IEB(byte[] var1) {
      int[][] var2 = this.GUH;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int[] var5 = var2[var4];
         if (var5[0] == var1[0] && var5[1] == var1[1] && var5[2] == var1[2]) {
            return true;
         }
      }

      return false;
   }

   private void IEC(boolean var1) throws Exception {
      EXF.getInstance().ICO();
      final String var2 = this.GTN.getString("micro.launcher.progress.update.check");

      try {
         this.GUE = new ArrayList();
         this.GUF = new HashMap();
         this.GUG = new HashMap();
         this.GTW.set_text_info(Color.DARKGREEN, (String)null);
         this.IDZ(var2, this.GTQ, 0.1, -1.0);
         if (var1) {
            this.IDR();
         } else {
            String var3 = "id#" + System.nanoTime();
            EVW.EVX var4 = EVW.getOS();
            if (EVW.EVX.Unix == var4) {
               var3 = this.getFirstMac();
            } else if (EVW.EVX.Windows == var4) {
               var3 = this.getWinCpuId();
            }

            CertificateFactory var5 = CertificateFactory.getInstance("X.509");
            Certificate var6 = var5.generateCertificate(EXK.class.getResourceAsStream("/cert/akmf_apps.cert.pem"));
            byte[] var7 = EXR.IER(var3.getBytes(StandardCharsets.UTF_8), var6);
            String var8 = EXR.IEQ(var7);
            EWJ var9 = new EWJ(EWP.GET, new URL(GUV.name(), "www.finanse.mf.gov.pl", -1, "/documents/766655/6211156/RELEASE3.txt"), EWQ.NONE, (Object)null);
            var9.getHeaderFields().put("Request-ID", var8);
            this.IDZ(var2, this.GTR, 0.2, -1.0);
            EWX var10 = new EWX() {
               public void IBI(long var1, double var3, long var5, long var7, long var9, long var11) {
                  EXF.getInstance().ICO();

                  try {
                     EXK.this.IDZ(var2, "", 0.3, var3);
                  } finally {
                     EXF.getInstance().ICP();
                  }

               }
            };
            EWK var11 = EWH.IBA(var9, var10, new EWR());
            this.IDZ(var2, "", 0.5, -1.0);
            if (var11.getStatus() != 200) {
               this.IDZ(var2, this.GTT, 0.0, -1.0);
               throw new Exception("Invalid status [" + var11.getStatus() + "]");
            }

            File var12 = this.IDU();
            File var13 = new File(var12, "msgs");
            var13.mkdirs();
            Map var14 = this.IDW(var13);
            Map var15 = this.IDY(var13);
            this.IDZ(var2, "", 0.7, -1.0);
            BufferedReader var16 = new BufferedReader(new StringReader((String)var11.getContent()));

            while(true) {
               while(true) {
                  String var17;
                  do {
                     if ((var17 = var16.readLine()) == null) {
                        this.IDZ(var2, "", 0.8, -1.0);

                        try {
                           String var41 = "";
                           boolean var42 = false;
                           if (this.GUE != null && this.GUE.size() > 0 || this.GUF != null && this.GUF.size() > 0) {
                              File var43 = new File(var12, "test.file");

                              try {
                                 var43.createNewFile();
                                 var43.delete();
                                 var42 = false;
                              } catch (IOException var37) {
                                 EXF.getInstance().ICA((Throwable)var37);
                                 var42 = true;
                                 if (EVW.EVX.Unix == var4) {
                                    var41 = this.GTN.getString("micro.launcher.update.result.launcher.root");
                                 } else {
                                    if (EVW.EVX.Windows != var4) {
                                       throw new Exception("Unknown OS type " + var4);
                                    }

                                    var41 = this.GTN.getString("micro.launcher.update.result.launcher.admin");
                                 }
                              }
                           }

                           if (this.GUE != null && this.GUE.size() > 0) {
                              EXF.getInstance().ICE("Main application is NOT up to date.");
                              if (!var42) {
                                 this.IED();
                              } else {
                                 this.GTW.set_text_info(Color.DARKRED, var41);
                              }
                           } else {
                              EXF.getInstance().ICE("Main application is up to date.");
                              if (this.GUF != null && this.GUF.size() > 0) {
                                 EXF.getInstance().ICE("Libraries are NOT up to date.");
                                 if (!var42) {
                                    this.IEE();
                                 } else {
                                    this.GTW.set_text_info(Color.DARKRED, var41);
                                 }
                              } else {
                                 EXF.getInstance().ICE("Libraries are up to date.");
                                 this.IDR();
                              }
                           }
                        } catch (Exception var38) {
                           EXF.getInstance().IBZ(var38.getLocalizedMessage(), var38);
                           this.IDR();
                        }

                        this.IDZ(var2, this.GTS, 1.0, 1.0);
                        return;
                     }
                  } while(var17.length() <= 0);

                  String[] var18 = var17.split(" ");
                  String var19 = var18[0];
                  String var20 = var18[1];
                  String var21 = var18[2];
                  EXI var22 = new EXI(var21);
                  String var23 = var18[3];
                  String var24 = var18[4];
                  String var25 = var18[5];
                  String var26 = var18[6];
                  Integer var27 = var26 != null && var26.length() > 0 ? Integer.parseInt(var26) : null;
                  if (!"MicroLauncher".equals(var19) && !"MicroExternalResources".equals(var19) && !"MicroExternalLibraries".equals(var19)) {
                     EXO var44 = EXO.getLibraryByImplTitle(var19);
                     if (var15.containsKey(var44)) {
                        EXI var29 = (EXI)var15.get(var44);
                        String var30 = null;
                        if ("jar".equals(var20)) {
                           var30 = "jar";
                        } else {
                           Integer var31 = Integer.parseInt(var20);
                           var30 = String.format("%02d", var31);
                        }

                        List var45;
                        if (var29.compareTo(var22) < 0) {
                           var15.put(var44, var22);
                           this.GUF.put(var44, new ArrayList());
                           var45 = (List)this.GUF.get(var44);
                           var45.add(new EWE(var30, var23, var24, var25, var27, (Object)null));
                        } else if (var29.compareTo(var22) == 0) {
                           var45 = (List)this.GUF.get(var44);
                           if (var45 != null) {
                              var45.add(new EWE(var30, var23, var24, var25, var27, (Object)null));
                           }
                        }
                     } else {
                        EXF.getInstance().ICI("Invalid library [" + var19 + "]!");
                     }
                  } else {
                     EXI var28 = (EXI)var14.get(var19 + "." + var20);
                     if (var28.compareTo(var22) < 0) {
                        var14.put(var19 + "." + var20, var22);
                        this.GUE.add(new EWE(var19, var20, var23, var24, var25, var27));
                     }
                  }
               }
            }
         }
      } catch (Exception var39) {
         this.IDZ(var2, this.GTT, 0.0, -1.0);
         EXF.getInstance().IBZ(var39.getLocalizedMessage(), var39);
         this.IDR();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void IED() {
      EXF.getInstance().ICO();
      final String var1 = this.GTN.getString("micro.launcher.progress.update.perform");

      try {
         EVN var2 = new EVN() {
            public void HZI() {
               EXF.getInstance().ICO();

               try {
                  EXK.this.IDZ(var1, EXK.this.GTQ, 0.0, -1.0);
                  EXK.this.IDZ(var1, EXK.this.GTR, 0.05, -1.0);
                  EXK.this.IEG();
                  EXK.this.IDZ(var1, EXK.this.GTS, 1.0, 1.0);
               } catch (Exception var5) {
                  EXK.this.IDZ(var1, EXK.this.GTT, 0.0, -1.0);
                  EXF.getInstance().ICA((Throwable)var5);
                  throw new RuntimeException(var5);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         };
         var2.start();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void IEE() {
      EXF.getInstance().ICO();
      final String var1 = this.GTN.getString("micro.launcher.progress.update.perform");

      try {
         EVN var2 = new EVN() {
            public void HZI() {
               EXF.getInstance().ICO();

               try {
                  EXK.this.IDZ(var1, EXK.this.GTQ, 0.0, -1.0);
                  EXK.this.IDZ(var1, EXK.this.GTR, 0.05, -1.0);
                  EXK.this.IEF();
                  EXK.this.IDZ(var1, EXK.this.GTS, 1.0, 1.0);
               } catch (Exception var5) {
                  EXK.this.IDZ(var1, EXK.this.GTT, 0.0, -1.0);
                  EXF.getInstance().ICA((Throwable)var5);
                  throw new RuntimeException(var5);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         };
         var2.start();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void IEF() throws Exception {
      EXF.getInstance().ICO();
      String var1 = this.GTN.getString("micro.launcher.progress.update.library");
      File var2 = null;
      boolean var50 = false;

      try {
         var50 = true;
         if (this.GUF != null) {
            this.IDZ(var1, this.GTQ, 0.05, -1.0);
            File var3 = this.IDU();
            File var4 = new File(var3, "msgs");
            var2 = new File(var4, "tmp");
            var2.mkdirs();
            this.IDZ(var1, this.GTR, 0.1, -1.0);
            boolean var5 = true;
            int var6 = this.GUF.size();
            int var7 = 0;
            Iterator var8 = this.GUF.entrySet().iterator();

            Map.Entry var9;
            EXO var10;
            double var11;
            List var13;
            String var18;
            Integer var20;
            label798:
            while(var8.hasNext()) {
               var9 = (Map.Entry)var8.next();
               ++var7;
               var10 = (EXO)var9.getKey();
               var11 = 0.1 + 0.8 * (1.0 * (double)var7 / (double)var6);
               this.IDZ(var1, var10.getSpecTitle(), var11, -1.0);
               var13 = (List)var9.getValue();
               Iterator var14 = var13.iterator();

               while(true) {
                  String var17;
                  String var19;
                  File var22;
                  File var23;
                  do {
                     do {
                        if (!var14.hasNext()) {
                           continue label798;
                        }

                        EWE var15 = (EWE)var14.next();
                        String var16 = (String)var15.getFirstValue();
                        var17 = (String)var15.getSecondValue();
                        var18 = (String)var15.getThirdValue();
                        var19 = (String)var15.getFourthValue();
                        var20 = (Integer)var15.getFifthValue();
                        String var21 = null;
                        if ("jar".equals(var16)) {
                           var21 = var10.getImplTitle() + "." + var16;
                        } else {
                           var21 = this.IDX(var10.getImplTitle(), var16);
                        }

                        var22 = new File(var4, var21);
                        EXF.getInstance().ICE("About to download update for [" + var19 + "]");
                        var23 = this.IEJ(var19, var20, var2);
                        var15.setSixthValue(var23);
                     } while(var23 == null);
                  } while(!var23.exists());

                  byte[] var24 = EWF.IAE(var23);
                  String var25 = EWF.IAJ(var24);
                  byte[] var26 = Base64.getDecoder().decode(var24);
                  String var27 = EWF.IAJ(var26);
                  if (var25 == null || !var25.equals(var18) || var27 == null || !var27.equals(var17)) {
                     var5 = false;
                     EXF.getInstance().ICA((Object)("Checksum not valid for library [" + var19 + "]!"));
                     break label798;
                  }

                  RandomAccessFile var28 = null;
                  var28 = new RandomAccessFile(var22, "rwd");
                  FileChannel var29 = var28.getChannel();
                  FileLock var30 = var29.tryLock();
                  if (var30 == null) {
                     var5 = false;
                     EXF.getInstance().ICA((Object)("Could not accuire lock for file [" + var22 + "]!"));
                     break label798;
                  }

                  this.GUG.put(var22.getAbsolutePath(), new EWA(var28, (Object)null, (Object)null, (Object)null));
               }
            }

            if (var5) {
               try {
                  var7 = 0;
                  var8 = this.GUF.entrySet().iterator();

                  while(var8.hasNext()) {
                     var9 = (Map.Entry)var8.next();
                     ++var7;
                     var10 = (EXO)var9.getKey();
                     var11 = 0.1 + 0.8 * (1.0 * (double)var7 / (double)var6);
                     this.IDZ(var1, var10.getSpecTitle(), var11, -1.0);
                     var13 = (List)var9.getValue();
                     int var84 = var13.size();
                     int var85 = 0;
                     Iterator var86 = var13.iterator();

                     while(var86.hasNext()) {
                        EWE var87 = (EWE)var86.next();
                        ++var85;
                        var18 = (String)var87.getFirstValue();
                        File var88 = (File)var87.getSixthValue();
                        var20 = null;
                        String var89;
                        if ("jar".equals(var18)) {
                           var89 = var10.getImplTitle() + "." + var18;
                        } else {
                           var89 = this.IDX(var10.getImplTitle(), var18);
                        }

                        double var90 = 0.1 + 0.8 * (1.0 * (double)(var7 * var84 + var85) / (double)(var6 * var84));
                        this.IDZ(var1, var10.getSpecTitle(), var90, 0.0);
                        this.IEI(var88, var89, var4, var2);
                     }
                  }

                  var8 = this.GUG.entrySet().iterator();

                  while(var8.hasNext()) {
                     var9 = (Map.Entry)var8.next();
                     ((RandomAccessFile)((EWA)var9.getValue()).getFirstValue()).close();
                     if (((EWA)var9.getValue()).getSecondValue() != null) {
                        ((RandomAccessFile)((EWA)var9.getValue()).getSecondValue()).close();
                     }
                  }
               } catch (Exception var69) {
                  EXF.getInstance().ICA((Throwable)var69);
                  if (this.GUG != null) {
                     Iterator var77 = this.GUG.entrySet().iterator();

                     while(var77.hasNext()) {
                        Map.Entry var79 = (Map.Entry)var77.next();
                        EWA var81 = (EWA)var79.getValue();
                        if (var81.getSecondValue() != null) {
                           try {
                              EWF.IAC((RandomAccessFile)var81.getSecondValue(), (RandomAccessFile)var81.getFirstValue());
                           } finally {
                              ((RandomAccessFile)var81.getFirstValue()).close();
                              ((RandomAccessFile)var81.getSecondValue()).close();
                           }
                        }
                     }
                  }
               }
            } else {
               var8 = this.GUG.entrySet().iterator();

               while(var8.hasNext()) {
                  var9 = (Map.Entry)var8.next();
                  ((RandomAccessFile)((EWA)var9.getValue()).getFirstValue()).close();
               }

               var8 = this.GUF.entrySet().iterator();

               while(var8.hasNext()) {
                  var9 = (Map.Entry)var8.next();
                  List var80 = (List)var9.getValue();
                  Iterator var82 = var80.iterator();

                  while(var82.hasNext()) {
                     EWE var12 = (EWE)var82.next();
                     File var83 = (File)var12.getSixthValue();
                     if (var83 != null) {
                        try {
                           Files.delete(var83.toPath());
                        } catch (IOException var67) {
                           EXF.getInstance().ICI(var67);
                        }
                     }
                  }
               }
            }

            if (var5) {
               EXF.getInstance().ICE("Libraries update finished with success.");
               this.IDZ(var1, this.GTS, 1.0, -1.0);
            } else {
               EXF.getInstance().ICE("Libraries update finished with error.");
               this.IDZ(var1, this.GTT, 1.0, -1.0);
               Thread.sleep(3000L);
            }
         }

         this.IDR();
         var50 = false;
      } finally {
         if (var50) {
            Iterator var33;
            Map.Entry var34;
            if (this.GUG != null) {
               var33 = this.GUG.entrySet().iterator();

               while(var33.hasNext()) {
                  var34 = (Map.Entry)var33.next();
                  ((RandomAccessFile)((EWA)var34.getValue()).getFirstValue()).close();
                  if (((EWA)var34.getValue()).getSecondValue() != null) {
                     ((RandomAccessFile)((EWA)var34.getValue()).getSecondValue()).close();
                  }

                  File var35 = (File)((EWA)var34.getValue()).getFourthValue();
                  if (var35 != null) {
                     try {
                        Files.delete(var35.toPath());
                     } catch (IOException var63) {
                        EXF.getInstance().ICI(var63);
                     }
                  }
               }
            }

            if (this.GUF != null) {
               var33 = this.GUF.entrySet().iterator();

               while(var33.hasNext()) {
                  var34 = (Map.Entry)var33.next();
                  List var91 = (List)var34.getValue();
                  Iterator var36 = var91.iterator();

                  while(var36.hasNext()) {
                     EWE var37 = (EWE)var36.next();
                     File var38 = (File)var37.getSixthValue();
                     if (var38 != null) {
                        try {
                           Files.delete(var38.toPath());
                        } catch (IOException var62) {
                           EXF.getInstance().ICI(var62);
                        }
                     }
                  }
               }
            }

            if (var2 != null) {
               try {
                  Files.delete(var2.toPath());
               } catch (IOException var61) {
                  EXF.getInstance().ICI(var61);
               }
            }

            EXF.getInstance().ICP();
         }
      }

      Iterator var71;
      Map.Entry var72;
      if (this.GUG != null) {
         var71 = this.GUG.entrySet().iterator();

         while(var71.hasNext()) {
            var72 = (Map.Entry)var71.next();
            ((RandomAccessFile)((EWA)var72.getValue()).getFirstValue()).close();
            if (((EWA)var72.getValue()).getSecondValue() != null) {
               ((RandomAccessFile)((EWA)var72.getValue()).getSecondValue()).close();
            }

            File var73 = (File)((EWA)var72.getValue()).getFourthValue();
            if (var73 != null) {
               try {
                  Files.delete(var73.toPath());
               } catch (IOException var66) {
                  EXF.getInstance().ICI(var66);
               }
            }
         }
      }

      if (this.GUF != null) {
         var71 = this.GUF.entrySet().iterator();

         while(var71.hasNext()) {
            var72 = (Map.Entry)var71.next();
            List var75 = (List)var72.getValue();
            Iterator var74 = var75.iterator();

            while(var74.hasNext()) {
               EWE var76 = (EWE)var74.next();
               File var78 = (File)var76.getSixthValue();
               if (var78 != null) {
                  try {
                     Files.delete(var78.toPath());
                  } catch (IOException var65) {
                     EXF.getInstance().ICI(var65);
                  }
               }
            }
         }
      }

      if (var2 != null) {
         try {
            Files.delete(var2.toPath());
         } catch (IOException var64) {
            EXF.getInstance().ICI(var64);
         }
      }

      EXF.getInstance().ICP();
   }

   private String getFileExtension(File var1) {
      String var2 = "";
      if (var1 != null) {
         String var3 = var1.getName();
         int var4 = var3.lastIndexOf(46);
         if (var4 > 0 && var4 < var3.length()) {
            var2 = var3.substring(var4 + 1);
         }
      }

      return var2;
   }

   private void IEG() throws Exception {
      EXF.getInstance().ICO();
      File var1 = null;

      try {
         if (this.GUE != null && this.GUE.size() > 0) {
            File var2 = this.IDU();
            var1 = new File(var2, "tmp");
            var1.mkdirs();
            File var3 = this.IDV();
            String var4 = this.getFileExtension(var3);
            EWE var5 = null;
            EWE var6 = null;
            EWE var7 = null;
            Iterator var8 = this.GUE.iterator();

            while(var8.hasNext()) {
               EWE var9 = (EWE)var8.next();
               if ("MicroLauncher".equals(var9.getFirstValue())) {
                  if (var4.equals(var9.getSecondValue())) {
                     var5 = var9;
                  }
               } else if ("MicroExternalResources".equals(var9.getFirstValue())) {
                  var6 = var9;
               } else if ("MicroExternalLibraries".equals(var9.getFirstValue())) {
                  var7 = var9;
               }
            }

            this.RHY(var5, var6, var7, var2, var1);
         }
      } finally {
         if (var1 != null) {
            try {
               Files.delete(var1.toPath());
            } catch (IOException var15) {
               EXF.getInstance().ICI(var15);
            }
         }

         EXF.getInstance().ICP();
      }

   }

   private void RHY(EWE<String, String, String, String, String, Integer> var1, EWE<String, String, String, String, String, Integer> var2, EWE<String, String, String, String, String, Integer> var3, File var4, File var5) throws Exception {
      EXF.getInstance().ICO();

      try {
         EVW.EVX var6 = EVW.getOS();
         File var7 = null;
         File var8 = null;
         File var9 = null;
         String var13;
         String var15;
         String var17;
         String var18;
         if (var1 != null) {
            String var10 = (String)var1.getSecondValue();
            String var11 = (String)var1.getThirdValue();
            String var12 = (String)var1.getFourthValue();
            var13 = (String)var1.getFifthValue();
            Integer var14 = (Integer)var1.getSixthValue();
            var15 = "MicroLauncher".replaceAll("\\.", "_").replaceAll("\\s", "").concat(".").concat(var10);
            var7 = this.IEJ(var13, var14, var5);
            byte[] var16 = EWF.IAE(var7);
            var17 = EWF.IAJ(var16);
            var18 = EWF.IAH(var16);
            if (var18 != null && var18.equals(var12) && var17 != null && var17.equals(var11)) {
               var8 = new File(var4, var15);
               var9 = new File(var5, var15 + "_" + System.currentTimeMillis());
            } else {
               try {
                  Files.delete(var7.toPath());
               } catch (IOException var35) {
                  EXF.getInstance().ICI(var35);
               }

               var7 = null;
               EXF.getInstance().ICA((Object)("Checksum not valid for library [" + var13 + "]!"));
            }
         }

         boolean var37 = false;
         File var38 = null;
         File var39 = null;
         String var21;
         String var44;
         if (var2 != null) {
            var13 = (String)var2.getSecondValue();
            String var41 = (String)var2.getThirdValue();
            var15 = (String)var2.getFourthValue();
            var44 = (String)var2.getFifthValue();
            Integer var45 = (Integer)var2.getSixthValue();
            var18 = "MicroExternalResources".replaceAll("\\.", "_").replaceAll("\\s", "").concat(".").concat(var13);
            File var19 = new File(var4, "msgs");
            var19.mkdirs();
            var39 = new File(var19, var18);
            var38 = this.IEJ(var44, var45, var19);
            if (var39.exists()) {
               var37 = false;
            } else {
               var37 = true;
            }

            byte[] var20 = EWF.IAE(var38);
            var21 = EWF.IAJ(var20);
            String var22 = EWF.IAH(var20);
            if (var22 != null && var22.equals(var15) && var21 != null && var21.equals(var41)) {
               if (var39.exists()) {
                  var37 = false;
               } else {
                  var37 = true;
               }
            } else {
               try {
                  Files.delete(var38.toPath());
               } catch (IOException var34) {
                  EXF.getInstance().ICI(var34);
               }

               var38 = null;
               EXF.getInstance().ICA((Object)("Checksum not valid for library [" + var44 + "]!"));
            }
         }

         File var40 = null;
         File var42 = null;
         if (var3 != null) {
            var15 = (String)var3.getSecondValue();
            var44 = (String)var3.getThirdValue();
            var17 = (String)var3.getFourthValue();
            var18 = (String)var3.getFifthValue();
            Integer var48 = (Integer)var3.getSixthValue();
            String var51 = "MicroExternalLibraries".replaceAll("\\.", "_").replaceAll("\\s", "").concat(".").concat(var15);
            File var53 = new File(var4, "msgs");
            var53.mkdirs();
            var42 = new File(var53, var51);
            var40 = this.IEJ(var18, var48, var53);
            byte[] var54 = EWF.IAE(var40);
            String var23 = EWF.IAJ(var54);
            String var24 = EWF.IAH(var54);
            if (var24 == null || !var24.equals(var17) || var23 == null || !var23.equals(var44)) {
               try {
                  Files.delete(var40.toPath());
               } catch (IOException var33) {
                  EXF.getInstance().ICI(var33);
               }

               var40 = null;
               EXF.getInstance().ICA((Object)("Checksum not valid for library [" + var18 + "]!"));
            }
         }

         if ((var7 == null || !var7.exists()) && (var38 == null || !var38.exists()) && (var40 == null || !var40.exists())) {
            if (this.GUF != null && this.GUF.size() > 0) {
               EXF.getInstance().ICE("Main application update failed and libraries are NOT up to date.");
               this.IEE();
            } else {
               EXF.getInstance().ICE("Main application update failed but libraries are up to date.");
               this.IDR();
            }
         } else {
            if (EVW.EVX.Windows == var6) {
               Class.forName("org.apache.logging.log4j.message.ParameterizedMessage");
               Class.forName("org.apache.logging.log4j.message.ParameterFormatter");
               Class.forName("org.apache.logging.log4j.message.ParameterizedNoReferenceMessageFactory$StatusMessage");
               Class.forName("org.apache.logging.log4j.core.util.NameUtil");
               Class.forName("org.apache.logging.log4j.core.impl.ThrowableProxy");
               Class.forName("org.apache.logging.log4j.core.impl.ExtendedStackTraceElement");
               Class.forName("org.apache.logging.log4j.core.impl.ThrowableProxy$CacheEntry");
               Class.forName("org.apache.logging.log4j.core.impl.ExtendedClassInfo");
               Class.forName("a.a.a.c.e.a.e.EWF");
               ((URLClassLoader)ClassLoader.getSystemClassLoader()).close();
            }

            if (var8 != null && var8.exists() && var9 != null) {
               EWF.RHV(var8.getAbsolutePath(), var9.getAbsolutePath());
            }

            if (var8 != null && var7 != null && var7.exists()) {
               EWF.RHV(var7.getAbsolutePath(), var8.getAbsolutePath());
            }

            if (var9 != null && var9.exists()) {
               try {
                  Files.delete(var9.toPath());
               } catch (IOException var32) {
                  EXF.getInstance().ICI(var32);
               }
            }

            if (var37 && var38 != null && var38.exists() && var39 != null) {
               EWF.RHV(var38.getAbsolutePath(), var39.getAbsolutePath());
            }

            if (var40 != null && var40.exists() && var42 != null) {
               EWF.HZZ(var40.getAbsolutePath(), var42.getAbsolutePath());
            }

            File var43 = this.IDV();
            var44 = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
            ArrayList var46 = new ArrayList();
            var46.add(var44);
            if (EVW.EVX.Unix == var6) {
               var46.add("-Xbootclasspath/a:" + var43.getParentFile().getAbsolutePath() + File.separator + "msgs/MicroExternalResources.jar");
            } else if (EVW.EVX.Windows == var6) {
               if (!var37 && var38 != null && var38.exists()) {
                  var46.add("-Xbootclasspath/a:" + var38.getAbsolutePath());
               } else {
                  var46.add("-Xbootclasspath/a:" + var43.getParentFile().getAbsolutePath() + File.separator + "msgs/MicroExternalResources.jar");
               }
            }

            var46.add("-jar");
            var46.add(var43.getName());
            if (EVW.EVX.Windows == var6) {
               if (!var37 && var38 != null && var38.exists()) {
                  var46.add("-oldBootStrapLib=" + var39.getAbsolutePath());
                  var46.add("-newBootStrapLib=" + var38.getAbsolutePath());
               }

               RuntimeMXBean var47 = ManagementFactory.getRuntimeMXBean();
               String var50 = var47.getName();
               if (var50 != null) {
                  String[] var52 = var50.split("@");
                  if (var52 != null && var52.length > 0) {
                     var21 = var52[0];
                     var46.add("-parentPID=" + var21);
                  }
               }
            }

            ProcessBuilder var49 = new ProcessBuilder(var46);
            var49.directory(var43.getParentFile());
            EXF.getInstance().ICE("command " + var46);
            System.gc();
            var49.start();
            System.exit(0);
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void IEI(File var1, String var2, File var3, File var4) throws Exception {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("About to update library [" + var2 + "]");
         File var5 = new File(var3, var2);
         File var6 = new File(var4, var2 + "_" + System.currentTimeMillis());
         if (var1 != null && var1.exists()) {
            if (var5 != null) {
               EWA var7 = (EWA)this.GUG.get(var5.getAbsolutePath());
               if (var7 != null) {
                  RandomAccessFile var8 = (RandomAccessFile)var7.getFirstValue();
                  if (var8 != null) {
                     RandomAccessFile var9 = null;
                     var9 = new RandomAccessFile(var6, "rwd");
                     EWF.IAC(var8, var9);
                     var7.setSecondValue(var9);
                     var7.setThirdValue(var6.length());
                     var7.setFourthValue(var6);
                     RandomAccessFile var10 = null;

                     try {
                        var10 = new RandomAccessFile(var1, "rwd");
                        EWF.IAC(var10, var8);
                     } finally {
                        if (var10 != null) {
                           var10.close();
                        }

                     }

                     if (var1 != null) {
                        try {
                           Files.delete(var1.toPath());
                        } catch (IOException var19) {
                           EXF.getInstance().ICI(var19);
                        }
                     }
                  }
               }
            }
         } else {
            EXF.getInstance().ICI("Update file [" + (var1 != null ? var1.getAbsolutePath() : "") + "] does not exists!");
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private File IEJ(String var1, Integer var2, File var3) throws Exception {
      EXF.getInstance().ICO();

      File var9;
      try {
         Long var4 = var2 != null ? var2.longValue() : null;
         EWJ var5 = new EWJ(EWP.GET, new URL(GUV.name(), "www.finanse.mf.gov.pl", -1, "/documents/766655/6211156/" + var1), EWQ.NONE, (Object)null);
         EWX var6 = new EWX() {
            public void IBI(long var1, double var3, long var5, long var7, long var9, long var11) {
               EXF.getInstance().ICO();

               try {
                  EXK.this.IEA(var3);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         };
         EWK var7 = EWH.IBA(var5, var6, new EWL(new File(var3, var1), var4));
         File var8 = (File)var7.getContent();
         var9 = var8;
      } finally {
         EXF.getInstance().ICP();
      }

      return var9;
   }
}
