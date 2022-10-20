package com.github.bademux.emk.app;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.b.EMY;
import a.a.a.c.c.b.a.ControllerFactory;
import a.a.a.c.c.b.a.FxController;
import a.a.a.c.c.b.a.a.BaseSceneFxController;
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
import javafx.util.Callback;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.github.bademux.emk.utils.ReportUtils.createMemoryUsage;

@Slf4j
public class FXApp extends Application {
    private final ResourceBundle launcherMsgResourceBundle;
    private final ResourceBundle msgResourceBundle;
    private final EMW FJC;
    private final Screen FJK = Screen.getPrimary();
    private Stage stage;
    private double width = -1.0;
    private double height = -1.0;
    private Map<String, BaseSceneFxController> pages;
    private BaseSceneFxController controller;

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

    private Map<String, BaseSceneFxController> getPages() {
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
                initController("register.fxml", null);
            } else {
                initController("login.fxml", null);
            }

            stage.getIcons().add(new Image("/img/app/e_logo.png"));
            stage.widthProperty().addListener((observable, oldValue, newValue) -> {
                if (controller != null) {
                    width = widthPropertyListener(newValue);
                }
            });
            stage.heightProperty().addListener((observable, oldValue, newValue) -> {
                if (controller != null) {
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
        if (controller.HHF()) {
            return width < 0.0 ? controller.getPrefWidth() : Math.min(newValue.doubleValue(), FJK.getVisualBounds().getWidth());
        }
        return -1.0;
    }

    private double heightPropertyListener(Number newValue) {
        if (controller.HHF()) {
            return height < 0.0 ? controller.getPrefWidth() : Math.min(newValue.doubleValue(), FJK.getVisualBounds().getHeight() - 23.0);
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
        String fxmlName = ((ProcessDefinitionBase) def.get("definition")).getFXML();
        return Map.entry(fxmlName, defName);
    }

    @SneakyThrows
    private Map.Entry<String, BaseSceneFxController> loadFxmlAndGetController(String fxmlName, String title) {
        try {
            var controllerFactory = new ControllerFactory(this, stage, FJC, title, fxmlName);
            URL fxmlUrl = getClass().getResource("/fxml/" + fxmlName);
            var controller = loadFxml(controllerFactory, fxmlUrl, msgResourceBundle);
            controller.init();
            return Map.entry(fxmlName, controller);
        } catch (FFK | IOException e) {
            log.error("Something bad happened", e);
            throw new FFK(e);
        }
    }

    private static BaseSceneFxController loadFxml(Callback<Class<?>, Object> controllerFactory, URL fxmlUrl, ResourceBundle resources) throws IOException {
        log.info("Adding dynamic process " + fxmlUrl);
        var loader = new FXMLLoader(fxmlUrl, resources, null, controllerFactory);
        loader.load();
        var controller = loader.getController();
        assert controller instanceof FxController : "Unknown controller type: " + controller.getClass();
        return (BaseSceneFxController) controller;
    }

    public <_T extends FxController> void initController(String fxmlNameOne, String fxmlNameTwo, Consumer<_T> consumer) {

        try {
            BaseSceneFxController controllerOne = this.pages.get(fxmlNameOne);
            BaseSceneFxController controllerTwo = this.pages.get(fxmlNameTwo);
            if (controllerOne != null) {
                if (controllerOne == null) {
                    throw FCZ.getInstance().IHF();
                }
                if (controllerOne.HHB()) {
                    if (controllerTwo == null) {
                        throw FCZ.getInstance().IHH(fxmlNameOne, fxmlNameTwo);
                    }
                    initController(controllerTwo, consumer);
                }
            }

        } catch (Exception e) {
            log.error("Something bad happened", e);
            throw new FFI(e);
        }

    }

    private <_T extends FxController> void initController(String fxmlName, Consumer<_T> consumer) throws FFK {
        BaseSceneFxController controller = this.pages.get(fxmlName);
        if (controller == null) {
            throw FCZ.getInstance().IHE(fxmlName);
        }

        this.initController(controller, consumer);

    }

    private <_T extends FxController> void initController(BaseSceneFxController controller, Consumer<_T> consumer) throws FFK {

        if (controller == null) {
            throw FCZ.getInstance().IHF();
        }

        this.controller = controller;
        if (consumer != null) {
            consumer.accept((_T) controller);
        }

        if (controller.getScene() != null) {
            controller.getScene().setRoot(new Pane());
        }

        Stage stage = controller.getPrimaryStage();
        if (this.width <= 0.0) {
            this.width = controller.getPrefWidth();
        }

        if (this.height <= 0.0) {
            this.height = controller.getPrefHeight();
        }

        controller.setScene(new Scene(controller.getParent(), this.width, this.height));
        if (!controller.HHF() && stage.isMaximized()) {
            stage.setMaximized(false);
        }

        stage.setResizable(controller.HHF());
        stage.setScene(controller.getScene());
        stage.setMinWidth(controller.getMinWidth());
        stage.setMinHeight(controller.getMinHeight());
        stage.setMaxWidth(controller.getMaxWidth());
        stage.setMaxHeight(controller.getMaxHeight());
        stage.sizeToScene();
        if (!controller.HHF()) {
            Rectangle2D var4 = Screen.getPrimary().getVisualBounds();
            stage.setX(var4.getWidth() / 2.0 - stage.getWidth() / 2.0);
            stage.setY(var4.getHeight() / 2.0 - stage.getHeight() / 2.0);
            if (stage.getX() < 0.0) {
                stage.setX(0.0);
            }

            if (stage.getY() < 0.0) {
                stage.setY(0.0);
            }
        } else if (EMB.getInstance().HHO()) {
            EMB.getInstance().setMaximizeWindow(false);
            stage.hide();
            stage.setMaximized(true);
            stage.show();
        }

        stage.setTitle(controller.getTitle());
        controller.HHC();

    }

}
