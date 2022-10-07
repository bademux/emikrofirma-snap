package a.a.a.c.e;

import a.a.a.b.f.FFK;
import a.a.a.c.c.b.EMZ;
import a.a.a.c.e.a.EXO;
import a.a.a.c.e.a.EXQ;
import a.a.a.c.e.a.a.EVK;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.c.EVW;
import a.a.a.c.e.a.d.EWA;
import a.a.a.c.e.a.d.EWD;
import a.a.a.c.e.a.d.EWE;
import a.a.a.c.e.a.e.EWF;
import a.a.a.c.e.a.g.EWX;
import a.a.a.c.e.a.j.EXC;
import a.a.a.c.e.a.j.EXD;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.e.b.EXJ;
import a.a.a.c.e.c.EXN;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Dialog;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.image.Image;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.util.Callback;

import javax.crypto.NoSuchPaddingException;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;
import java.util.concurrent.Semaphore;

public class EXK extends Application implements EVW {
    private final ResourceBundle GTN;
    private final String msgInit;
    private final String msgStopSuccess;
    private final String msgStopFailure;
    private final Rectangle2D GTU = Screen.getPrimary().getVisualBounds();
    private Stage GTV;
    private EXJ GTW;
    private static final Image QLA = new Image("/img/app/e_logo.png");
    private boolean QQO = false;
    private final Thread.UncaughtExceptionHandler GUC = new Thread.UncaughtExceptionHandler() {
        public void uncaughtException(Thread var1, final Throwable var2) {
            EXF.getInstance().ICO();
            EXF.getInstance().ICA(var2);
            EXF.getInstance().ICE("About to start processing unhandled exception (B)");

            try {
                EXK.this.QQO = true;
                Alert var3 = new Alert(AlertType.ERROR);
                String var4 = var2.getLocalizedMessage() +
                        System.lineSeparator();
                var3.setContentText(var4);
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
                                            String var5 = EXN.getInstance().getMessageForKey("micro.launcher.error.mail.subject") + " [" +
                                                    (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")).format(new Date()) +
                                                    " ]";
                                            var4.append("&subject=").append(URLEncoder.encode(var5, StandardCharsets.UTF_8.name()).replace("+", "%20"));
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
                                                EXF.getInstance().ICA(var12);
                                            }

                                            EXO[] var15 = EXO.values();
                                            int var8 = var15.length;

                                            for (int var9 = 0; var9 < var8; ++var9) {
                                                EXO var10 = var15[var9];
                                                String var11 = (String) EXQ.getInstance().IEO(var10.getImplTitle());
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
                                            EXF.getInstance().ICA(var13);
                                        }

                                    }
                                };
                                var2x.start();
                                return null;
                            } else {
                                EXF.getInstance().ICA("Desktop is NOT Supported");
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
    List<EWE<String, String, String, String, String, Integer>> GUE;
    Map<EXO, List<EWE<String, String, String, String, Integer, File>>> GUF;
    Map<String, EWA<RandomAccessFile, RandomAccessFile, Long, File>> GUG;

    public static void main(String[] args) {
        Security.setProperty("crypto.policy", "unlimited");
        System.setProperty("com.sun.xml.internal.bind.v2.bytecode.ClassTailor.noOptimize", "true");
        launch();
    }

    public EXK() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException {
        EXF.getInstance().ICO();

        try {
            File var1 = new File(GPW);
            var1.mkdirs();
            this.GTN = ResourceBundle.getBundle("messages/launcher_messages", EXC.getInstance().getCurrentLocaleOrDefault(), new EXD());
            this.msgInit = this.GTN.getString("micro.launcher.progress.step.init");
            this.msgStopSuccess = this.GTN.getString("micro.launcher.progress.step.stop.success");
            this.msgStopFailure = this.GTN.getString("micro.launcher.progress.step.stop.failure");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void start(Stage stage) throws Exception {
        EXF.getInstance().ICO();

        try {
            logSystemInfo();

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
            this.GTV = stage;
            this.GTV.setOnCloseRequest(new EventHandler<WindowEvent>() {
                public void handle(WindowEvent var1) {
                    EXF.getInstance().ICO();

                    try {
                        boolean var2 = false;
                        boolean var3 = false;
                        if (EXK.this.GUD != null) {
                            var2 = ((EMZ)EXK.this.GUD).QQF();
                            var3 = ((EMZ)EXK.this.GUD).QQG();
                        }

                        if (var2) {
                            ButtonData var12 = EXK.this.QOH(EXK.this.GTN.getString("micro.launcher.exit.confirm.title"), null, EXK.this.GTN.getString("micro.launcher.exit.confirm.button.exit"), EXK.this.GTN.getString("micro.launcher.exit.confirm.button.cancel"), 400.0, 140.0, EXK.this.GTN.getString("micro.launcher.exit.confirm.message"), true);
                            if (ButtonData.OK_DONE.equals(var12)) {
                                if (EXK.this.GUD != null) {
                                    if (!(boolean) (Boolean) ((EMZ)EXK.this.GUD).QQE()) {
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
                    } catch (SecurityException | IllegalArgumentException|  FFK e) {
                        EXF.getInstance().ICA(e);
                    } finally {
                        EXF.getInstance().ICP();
                    }

                }
            });
            FXMLLoader var35 = new FXMLLoader(EXK.class.getResource("/fxml/micro_launcher_main.fxml"));
            var35.setResources(this.GTN);
            Parent var16 = var35.load();
            Scene var17 = new Scene(var16);
            this.GTW = var35.getController();
            this.GTW.IDK();
            this.GTW.IDM();
            this.GTV.setScene(var17);
            Region var18 = (Region) var16;
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
            EVN var21 = new EVN() {
                public void HZI() {
                    try {
                        EXK.this.IEC();
                    } catch (Exception var2) {
                        EXF.getInstance().ICA(var2);
                        throw new RuntimeException(var2);
                    }
                }
            };
            var21.start();
        } catch (Exception var29) {
            EXF.getInstance().ICA(var29);
            throw var29;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private static void logSystemInfo() {
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
            EXF.getInstance().ICA(var28);
        }
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

            ButtonBar.ButtonData var18 = (ButtonBar.ButtonData) var11.getFirstValue();
            return var18;
        } catch (InterruptedException var16) {
            EXF.getInstance().ICA(var16);
            return null;
        } finally {
            EXF.getInstance().ICP();
        }
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

            var14 = (ButtonBar.ButtonData) var13.get();
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
        Stage var1 = (Stage) var0.getScene().getWindow();
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
            EVN var13 = new EVN() {
                public void HZI() {
                    EXF.getInstance().ICO();

                    try {
                        EXK.this.IDS();
                    } catch (Exception var5) {
                        EXF.getInstance().ICA(var5);
                        throw new RuntimeException(var5);
                    } finally {
                        EXF.getInstance().ICP();
                    }

                }
            };
            var13.start();
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
            this.IDZ(var1, this.msgInit, 0.0, -1.0);

            this.IDZ(var1, var2, 0.8, -1.0);
            this.IDZ(var1, var2, 0.85, -1.0);

            EXF.getInstance().ICE("Libraries loaded");
            this.IDZ(var1, var2, 0.9, -1.0);
            EXF.getInstance().ICE("About to initialize main application");
            Class var109 = a.a.a.c.c.b.EMZ.class;
            Constructor var113 = var109.getConstructor(EVW.class);
            this.GUD = (Application) var113.newInstance(this);

            try {
                Class var119 = a.a.a.c.e.a.EXQ.class;
                Method var120 = var119.getDeclaredMethod("getInstance");
                EXQ var123 = (EXQ) var120.invoke(var119);
                EXO[] var127 = EXO.values();
                for (EXO var131 : var127) {
                    String var29 = (String) EXQ.getInstance().IEO(var131.getImplTitle());
                    var123.IEN(var131.getImplTitle(), var29);
                }
            } catch (Exception var98) {
                EXF.getInstance().ICI(var98);
            }

            Platform.runLater(new Runnable() {
                public void run() {
                    EXF.getInstance().ICO();

                    try {
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
                        EXK.this.IDZ(var1, EXK.this.msgStopSuccess, 1.0, 1.0);
                        ((EMZ) EXK.this.GUD).HNA(EXK.this.GTV, var2);
                    } catch (Exception var6) {
                        EXF.getInstance().ICA(var6);
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

    private void IDZ(String var1, String var2, Double var3, Double var4) {
        EXF.getInstance().ICO();

        try {
            String var5 = var1;
            if (var2 != null && var2.length() > 0) {
                StringBuilder var10000 = (new StringBuilder()).append(var1);
                var5 = var10000.append(" | ").append(var2).toString();
            }

            this.GTW.set_progress(var5, var3, var4);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void IEC() throws Exception {
        EXF.getInstance().ICO();
        final String var2 = this.GTN.getString("micro.launcher.progress.update.check");

        try {
            this.GUE = new ArrayList();
            this.GUF = new HashMap();
            this.GUG = new HashMap();
            this.GTW.set_text_info(Color.DARKGREEN, null);
            this.IDZ(var2, this.msgInit, 0.1, -1.0);
            this.IDR();
        } catch (Exception var39) {
            this.IDZ(var2, this.msgStopFailure, 0.0, -1.0);
            EXF.getInstance().IBZ(var39.getLocalizedMessage(), var39);
            this.IDR();
        } finally {
            EXF.getInstance().ICP();
        }

    }

}
