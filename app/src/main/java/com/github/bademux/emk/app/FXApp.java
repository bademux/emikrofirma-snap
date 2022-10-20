package com.github.bademux.emk.app;

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
import a.a.a.c.g.b.FCW;
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
import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.security.Security;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.github.bademux.emk.utils.ReportUtils.createMemoryUsage;

@Slf4j
public class FXApp extends Application implements EMC {
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

        log.error("Something bad happened", exception);
        log.info("About to start processing unhandled exception (B)");

        try {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setContentText(exception.getLocalizedMessage() + System.lineSeparator());
            alert.setHeaderText(launcherMsgResourceBundle.getString("micro.unhandled.error"));
            alert.setTitle(launcherMsgResourceBundle.getString("micro.dialog.message.title"));
            alert.getButtonTypes().add(new ButtonType(launcherMsgResourceBundle.getString("micro.dialog.message.button.report"), ButtonData.OTHER));
            alert.setResultConverter(buttonType -> {
                if (!ButtonData.OTHER.equals(buttonType.getButtonData())) {
                    return ButtonType.OK;
                }
                if (!Desktop.isDesktopSupported()) {
                    log.error("Desktop is NOT Supported");
                    return ButtonType.NO;
                }
                new Thread(() -> uncaughtExceptionGlobalButtonCall(exception)).start();
                return null;
            });
            Optional<?> ret = alert.showAndWait();
            log.debug("optional " + ret);
        } catch (Throwable var10) {
            log.error("Something bad happened", var10);
        }
        System.exit(7);
    }

    private static void uncaughtExceptionGlobalButtonCall(Throwable throwable) {
        log.error("Something bad happened", throwable);
        try {
            Desktop.getDesktop().browse(URI.create(FCW.getInstance().getMessageForKey("micro.infoProgram.tab.aboutProgram.links.issues")));
            Desktop.getDesktop().open(new File(com.github.bademux.emk.Application.getHomeDir() + "/reports"));
        } catch (Exception e) {
            log.error("Something bad happened", e);
        }
    }

    public FXApp() {

        this.msgResourceBundle = ResourceBundle.getBundle("messages/messages", LocaleUtils.LOCALE);
        this.launcherMsgResourceBundle = ResourceBundle.getBundle("messages/launcher_messages", LocaleUtils.LOCALE);
        this.FJC = new EMW();
        Runtime.getRuntime().addShutdownHook(new Thread(EMY.getInstance()::HMY));
    }

    public void uncaughtException(Thread thread, Throwable e) {

        log.error("Something bad happened", e);
        log.info("About to start processing unhandled exception (A)");

        try {
            if (e instanceof ThreadDeath) {
                log.warn("Exception skipped");
                return;
            }
            Desktop.getDesktop().open(new File(com.github.bademux.emk.Application.getHomeDir() + "/reports"));
        } catch (Throwable ex) {
            log.error("Something bad happened", ex);
        }

    }

    public void start(Stage stage) {

        try {
            log.info(createMemoryUsage());
            Thread.setDefaultUncaughtExceptionHandler(this::uncaughtException);
            Thread.currentThread().setUncaughtExceptionHandler(this::uncaughtExceptionGlobal);


            try {
                log.info("About to initialize main application");


                try {
                    this.stage = stage;
                    Platform.runLater(this::start);
                    pages = getPages();
                } catch (Exception e) {
                    log.error("Something bad happened", e);
                    throw new FFI(e);
                }

                log.info("Main application initialized");

            } catch (Exception var5) {
                log.error("Something bad happened", var5);
                throw new RuntimeException(var5);
            }

        } catch (Exception e) {
            log.error("Something bad happened", e);
            throw e;
        }

    }

    private Map<String, EMH> getPages() {
        return Stream.<Map.Entry<String, String>>concat(
                        Stream.of("login.fxml", "register.fxml", "main.fxml").map(s -> new AbstractMap.SimpleImmutableEntry<>(s, null)),
                        ENG.getInstance().HNI().stream().map(FXApp::getDefinition)
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
            log.error("Something bad happened", e);
            throw new RuntimeException(e);
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

    public void stop() {

        try {
            log.info("About to stop the application");
            super.stop();
            log.info("About to clean all live threads");
            EVK.getInstance().HZH();
            log.info("All live threads cleaned");
            log.info("Application stopped");
        } catch (Throwable e) {
            log.error("Something bad happened", e);
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
            log.error("Something bad happened", e);
            throw new FFK(e);
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
        log.info("Adding dynamic process " + fxmlName);
        FXMLLoader loader = new FXMLLoader(FXApp.class.getResource("/fxml/" + fxmlName));
        loader.setControllerFactory(new EMF(this, stage, this.FJC, title, fxmlName));
        loader.setResources(this.msgResourceBundle);
        loader.load();
        return loader;
    }

    public void HJD(String var1, String var2) {

        this.HJE(var1, var2, null);

    }

    public <_T extends EMH> void HJE(String var1, String var2, ENB<_T> var3) {

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
            log.error("Something bad happened", var10);
            throw new FFI(var10);
        }

    }

    private <_T extends EMH> void HNC(String var1, ENB<_T> var2) throws FFK {

        EMH var3 = this.pages.get(var1);
        if (var3 == null) {
            throw FCZ.getInstance().IHE(var1);
        }

        this.HNC(var3, var2);

    }

    private <_T extends EMH> void HNC(EMH var1, ENB<_T> var2) throws FFK {

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

    }

    private boolean HND(EMN var1) throws FFK {

        boolean var2;
        if (var1 == null) {
            throw FCZ.getInstance().IHF();
        }

        var2 = var1.HHB();

        return var2;
    }

}
