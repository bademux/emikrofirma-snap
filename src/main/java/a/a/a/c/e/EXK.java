package a.a.a.c.e;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.EMY;
import a.a.a.c.c.b.ENB;
import a.a.a.c.c.b.a.EMF;
import a.a.a.c.c.b.a.EMG;
import a.a.a.c.c.b.a.EMN;
import a.a.a.c.c.b.a.a.EMH;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.c.c.ENG;
import a.a.a.c.e.a.a.EVK;
import a.a.a.c.e.a.e.EWF;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.e.c.EXN;
import a.a.a.c.g.c.FCZ;
import com.github.bademux.emk.utils.LocaleUtils;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import lombok.SneakyThrows;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EXK extends Application implements EMC {
    public static final String GPW = System.getProperty("user.home") + "/AKMF";
    private final ResourceBundle launcherMsgResourceBundle;
    private final ResourceBundle msgResourceBundle;
    private final EMT FJC;
    private final Screen FJK = Screen.getPrimary();
    private Stage stage;
    private double width = -1.0;
    private double height = -1.0;
    private Map<String, EMH> pages;
    private EMH FJJ;

    private void uncaughtExceptionGlobal(Thread thread, Throwable exception) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICA(exception);
        EXF.getInstance().ICE("About to start processing unhandled exception (B)");

        try {
            Alert var3 = new Alert(AlertType.ERROR);
            String var4 = exception.getLocalizedMessage() +
                    System.lineSeparator();
            var3.setContentText(var4);
            var3.setHeaderText(launcherMsgResourceBundle.getString("micro.unhandled.error"));
            var3.setTitle(launcherMsgResourceBundle.getString("micro.dialog.message.title"));
            ButtonType var5 = new ButtonType(launcherMsgResourceBundle.getString("micro.dialog.message.button.report"), ButtonData.OTHER);
            var3.getButtonTypes().add(var5);
            var3.setResultConverter(buttonType -> {
                if (!ButtonData.OTHER.equals(buttonType.getButtonData())) {
                    return ButtonType.OK;
                }
                if (!Desktop.isDesktopSupported()) {
                    EXF.getInstance().ICA("Desktop is NOT Supported");
                    return ButtonType.NO;
                }
                new Thread(() -> uncaughtExceptionGlobalButtonCall(exception)).start();
                return null;
            });
            Optional<?> var6 = var3.showAndWait();
            EXF.getInstance().ICK("optional " + var6);
        } catch (Throwable var10) {
            EXF.getInstance().ICA(var10);
        } finally {
            EXF.getInstance().ICP();
            System.exit(7);
        }
    }

    private static void uncaughtExceptionGlobalButtonCall(Throwable exception) {
        try {
            File var1 = new File(EXK.GPW + "/reports");
            EXF.getInstance().ICK("reportsDir " + var1);
            boolean var2x1 = var1.mkdirs();
            EXF.getInstance().ICK("mkdirs " + var2x1);
            File var31 = new File(var1, "report_" + (new SimpleDateFormat("yyyyMMdd'T'HHmmssS")).format(new Date()) + ".zip");
            EXF.getInstance().ICK("reportFile " + var31);
            EWF.IAB(false, var31, EXF.getInstance().getDefaultOutputLoggerFile(), EXF.getInstance().getDefaultErrorLoggerFile());
            StringBuilder var41 = new StringBuilder();
            var41.append("mailto:").append("jpk.helpdesk@mf.gov.pl");
            var41.append("?cc=").append("support@akmf.pl");
            String var51 = EXN.getInstance().getMessageForKey("micro.launcher.error.mail.subject") + " [" +
                    (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")).format(new Date()) +
                    " ]";
            var41.append("&subject=").append(URLEncoder.encode(var51, StandardCharsets.UTF_8.name()).replace("+", "%20"));
            var41.append("&attachment=").append(var31.toURI().toString().replace("+", "%20"));
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

            var6.append(System.lineSeparator());
            var6.append("#######");
            var6.append(System.lineSeparator());
            var6.append(System.lineSeparator());
            var6.append(exception.getLocalizedMessage());
            var6.append(System.lineSeparator());
            var6.append(System.lineSeparator());
            ByteArrayOutputStream var16 = new ByteArrayOutputStream();
            PrintStream var17 = new PrintStream(var16, true, StandardCharsets.UTF_8.name());
            exception.printStackTrace(var17);
            var6.append(new String(var16.toByteArray(), StandardCharsets.UTF_8));
            var6.append(System.lineSeparator());
            var6.append("#######");
            var6.append(System.lineSeparator());
            var6.append(System.lineSeparator());
            var6.append("#######");
            var6.append(System.lineSeparator());
            var6.append(var31.getAbsolutePath());
            var6.append(System.lineSeparator());
            var6.append("#######");
            var6.append(System.lineSeparator());
            Desktop.getDesktop().open(var1);
            var41.append("&body=").append(URLEncoder.encode(var6.toString(), StandardCharsets.UTF_8.name()).replace("+", "%20"));
            String var18 = var41.toString();
            URI var14 = new URI(var18);
            Desktop.getDesktop().mail(var14);
        } catch (Exception var13) {
            EXF.getInstance().ICA(var13);
        }
    }

    public static void main(String[] args) {
        Security.setProperty("crypto.policy", "unlimited");
        System.setProperty("com.sun.xml.internal.bind.v2.bytecode.ClassTailor.noOptimize", "true");
        launch();
    }

    public EXK() {
        EXF.getInstance().ICO();

        try {
            this.msgResourceBundle = ResourceBundle.getBundle("messages/messages", LocaleUtils.LOCALE);
            this.launcherMsgResourceBundle = ResourceBundle.getBundle("messages/launcher_messages", LocaleUtils.LOCALE);
            this.FJC = new EMW();
            Runtime.getRuntime().addShutdownHook(new Thread(EMY.getInstance()::HMY));
            File homedir = new File(GPW);
            homedir.mkdirs();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void uncaughtException(Thread thread, Throwable e) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICA(e);
        EXF.getInstance().ICE("About to start processing unhandled exception (A)");

        try {
            if (e instanceof ThreadDeath) {
                EXF.getInstance().ICI("Exception skipped");
            } else {
                File var3 = new File(EXK.GPW + "/reports");
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

    public void start(Stage stage) {
        EXF.getInstance().ICO();

        try {
            logSystemInfo();
            Thread.setDefaultUncaughtExceptionHandler(this::uncaughtException);
            Thread.currentThread().setUncaughtExceptionHandler(this::uncaughtExceptionGlobal);
            EXF.getInstance().ICO();


            try {
                EXF.getInstance().ICE("About to initialize main application");


                EXF.getInstance().ICO();
                EXF.getInstance().ICO();

                try {
                    this.stage = stage;
                    Platform.runLater(this::start);
                    pages = getPages();
                } catch (Exception e) {
                    EXF.getInstance().ICA(e);
                    throw new FFI(e);
                } finally {
                    EXF.getInstance().ICP();
                }

                EXF.getInstance().ICE("Main application initialized");

            } catch (Exception var5) {
                EXF.getInstance().ICA(var5);
                throw new RuntimeException(var5);
            } finally {
                EXF.getInstance().ICP();
            }

        } catch (Exception e) {
            EXF.getInstance().ICA(e);
            throw e;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private Map<String, EMH> getPages() {
        return Stream.<Map.Entry<String, String>>concat(
                        Stream.of("login.fxml", "register.fxml", "main.fxml").map(s -> new AbstractMap.SimpleImmutableEntry<>(s, null)),
                        ENG.getInstance().HNI().stream().map(EXK::getDefinition)
                )
                .map(item -> loadFxmlAndGetController(item.getKey(), item.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private void start() {
        try {
            if (EMB.getInstance().HHP().size() == 0) {
                HNC("register.fxml", null);
            } else {
                HNC("login.fxml", null);
            }

            stage.getIcons().add(new Image("/img/app/e_logo.png"));
            stage.widthProperty().addListener((observable, oldValue, newValue) -> {
                if (FJJ != null) {
                    width = widthPropertyListener(newValue);
                }
            });
            stage.heightProperty().addListener((observable, oldValue, newValue) -> {
                if (FJJ != null) {
                    height = heightPropertyListener(newValue);
                }
            });
            stage.show();
        } catch (Exception e) {
            EXF.getInstance().ICA(e);
            throw new RuntimeException(e);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    private double widthPropertyListener(Number newValue) {
        if (FJJ.HHF()) {
            return width < 0.0 ? FJJ.getPrefWidth() : Math.min(newValue.doubleValue(), FJK.getVisualBounds().getWidth());
        }
        return -1.0;
    }

    private double heightPropertyListener(Number newValue) {
        if (FJJ.HHF()) {
            return height < 0.0 ? FJJ.getPrefWidth() : Math.min(newValue.doubleValue(), FJK.getVisualBounds().getHeight() - 23.0);
        }
        return -1.0;
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


    public void stop() {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICE("About to stop the application");
            super.stop();
            EXF.getInstance().ICE("About to clean all live threads");
            EVK.getInstance().HZH();
            EXF.getInstance().ICE("All live threads cleaned");
            EXF.getInstance().ICE("Application stopped");
        } catch (Throwable e) {
            EXF.getInstance().ICA(e);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private static Map.Entry<String, String> getDefinition(String defName) {
        var def = ENG.getInstance().getProcessDefinition(defName);
        String fxmlName = ((ELZ) def.get("definition")).getFXML();
        return Map.entry(fxmlName, defName);
    }

    @SneakyThrows
    private Map.Entry<String, EMH> loadFxmlAndGetController(String fxmlName, String title) {
        try {
            var controller = getController(loadFxml(fxmlName, title));
            controller.HHE();
            return Map.entry(fxmlName, controller);
        } catch (FFK | IOException e) {
            EXF.getInstance().ICA(e);
            throw new FFK(e);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    @SneakyThrows
    private static EMH getController(FXMLLoader loader) {
        var controller = loader.getController();
        if (!(controller instanceof EMG)) {
            throw new IllegalStateException("Unknown controller type: " + controller.getClass());
        }
        return (EMH) controller;
    }

    private FXMLLoader loadFxml(String fxmlName, String title) throws IOException {
        EXF.getInstance().ICE("Adding dynamic process " + fxmlName);
        FXMLLoader loader = new FXMLLoader(EXK.class.getResource("/fxml/" + fxmlName));
        loader.setControllerFactory(new EMF(this, stage, this.FJC, title, fxmlName));
        loader.setResources(this.msgResourceBundle);
        loader.load();
        return loader;
    }

    public void HJD(String var1, String var2) {
        EXF.getInstance().ICO();

        try {
            this.HJE(var1, var2, null);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public <_T extends EMH> void HJE(String var1, String var2, ENB<_T> var3) {
        EXF.getInstance().ICO();

        try {
            EMH var4 = this.pages.get(var1);
            EMH var5 = this.pages.get(var2);
            boolean var6 = true;
            if (var4 != null) {
                var6 = this.HND(var4);
            }

            if (var6) {
                if (var5 == null) {
                    throw FCZ.getInstance().IHH(var1, var2);
                }

                this.HNC(var5, var3);
            }
        } catch (Exception var10) {
            EXF.getInstance().ICA(var10);
            throw new FFI(var10);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private <_T extends EMH> void HNC(String var1, ENB<_T> var2) throws FFK {
        EXF.getInstance().ICO();

        try {
            EMH var3 = this.pages.get(var1);
            if (var3 == null) {
                throw FCZ.getInstance().IHE(var1);
            }

            this.HNC(var3, var2);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private <_T extends EMH> void HNC(EMH var1, ENB<_T> var2) throws FFK {
        EXF.getInstance().ICO();

        try {
            if (var1 == null) {
                throw FCZ.getInstance().IHF();
            }

            this.FJJ = var1;
            if (var2 != null) {
                var2.HNE((_T) var1);
            }

            if (var1.getScene() != null) {
                var1.getScene().setRoot(new Pane());
            }

            Stage var3 = var1.getPrimaryStage();
            if (this.width <= 0.0) {
                this.width = var1.getPrefWidth();
            }

            if (this.height <= 0.0) {
                this.height = var1.getPrefHeight();
            }

            var1.setScene(new Scene(var1.getParent(), this.width, this.height));
            if (!var1.HHF() && var3.isMaximized()) {
                var3.setMaximized(false);
            }

            var3.setResizable(var1.HHF());
            var3.setScene(var1.getScene());
            var3.setMinWidth(var1.getMinWidth());
            var3.setMinHeight(var1.getMinHeight());
            var3.setMaxWidth(var1.getMaxWidth());
            var3.setMaxHeight(var1.getMaxHeight());
            var3.sizeToScene();
            if (!var1.HHF()) {
                Rectangle2D var4 = Screen.getPrimary().getVisualBounds();
                var3.setX(var4.getWidth() / 2.0 - var3.getWidth() / 2.0);
                var3.setY(var4.getHeight() / 2.0 - var3.getHeight() / 2.0);
                if (var3.getX() < 0.0) {
                    var3.setX(0.0);
                }

                if (var3.getY() < 0.0) {
                    var3.setY(0.0);
                }
            } else if (EMB.getInstance().HHO()) {
                EMB.getInstance().setMaximizeWindow(false);
                var3.hide();
                var3.setMaximized(true);
                var3.show();
            }

            var3.setTitle(var1.getTitle());
            var1.HHC();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private boolean HND(EMN var1) throws FFK {
        EXF.getInstance().ICO();

        boolean var2;
        try {
            if (var1 == null) {
                throw FCZ.getInstance().IHF();
            }

            var2 = var1.HHB();
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

}
