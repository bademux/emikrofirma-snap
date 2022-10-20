package a.a.a.c.g.a;

import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;
import a.a.a.b.c.FEN;
import a.a.a.b.f.FFI;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.d.EWA;
import a.a.a.c.g.b.FCW;
import com.github.bademux.emk.utils.ReportUtils;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.image.Image;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.*;

@Slf4j
public class FCR {
    private static final Image QGK = new Image("/img/app/e_logo.png");
    private static final int HBD = 10000;

    public FCR() {
    }

    public static <_FIRST, _SECOND, _THIRD, _FOURTH, _T extends EWA<_FIRST, _SECOND, _THIRD, _FOURTH>> _T IGD(final String var0, final String var1, final List<_T> var2, final String var3, final String var4, final String var5, final String var6, final double var7, final double var9) {

        EWA var11;
        var11 = FEL.IKS(new FEM<_T>() {
            public _T IKT() {
                final Dialog var1x = new Dialog();
                var1x.getDialogPane().setMinWidth(var7);
                var1x.getDialogPane().setMinHeight(var9);
                final TableView var2x = new TableView();
                var2x.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
                var2x.setPlaceholder(new Label(FCW.getInstance().getMessageForKey("micro.tableview.emptytable")));
                var2x.getColumns().clear();
                var2x.getColumns().add(FCT.IGY(var3, 50.0, "firstValue"));
                var2x.getColumns().add(FCT.IGY(var4, 50.0, "secondValue"));
                var2x.getColumns().add(FCT.IGY(var5, 50.0, "thirdValue"));
                var2x.getColumns().add(FCT.IGY(var6, 50.0, "fourthValue"));
                var2x.getItems().clear();
                var2x.getItems().addAll(var2);
                var2x.setPrefHeight(var9);
                var2x.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<_T>() {
                    public void changed(ObservableValue<? extends _T> var1xx, _T var2x, _T var3x) {
                        var1x.getDialogPane().lookupButton(ButtonType.OK).setDisable(var3x == null);

                    }
                });
                var1x.setTitle(var0);
                var1x.setHeaderText(var1);
                var1x.getDialogPane().setContent(var2x);
                var1x.getDialogPane().getButtonTypes().add(ButtonType.OK);
                var1x.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
                FCR.IGV(var1x.getDialogPane());
                var1x.setResultConverter(new Callback<ButtonType, _T>() {
                    public _T call(ButtonType var1x) {
                        switch (var1x.getButtonData()) {
                            case OK_DONE:
                                return (_T) var2x.getSelectionModel().getSelectedItem();
                            case CANCEL_CLOSE:
                            default:
                                return null;
                        }
                    }
                });
                var1x.getDialogPane().lookupButton(ButtonType.OK).setDisable(true);
                FCR.QGR(var1x.getDialogPane());
                Optional var3x = var1x.showAndWait();
                return var3x.isPresent() ? (_T) var3x.get() : null;
            }
        });

        return (_T) var11;
    }

    public static String getPasswordDialog(final String var0, final String var1, final double var2, final double var4) {

        String var6;
        var6 = FEL.IKS(new FEM<String>() {
            public String IKT() {
                final Dialog var1x = new Dialog();
                var1x.getDialogPane().setMinWidth(var2);
                var1x.getDialogPane().setMinHeight(var4);
                AnchorPane var2x = new AnchorPane();
                final PasswordField var3 = new PasswordField();
                var3.textProperty().addListener(new ChangeListener<String>() {
                    public void changed(ObservableValue<? extends String> var1xx, String var2x, String var3) {
                        var1x.getDialogPane().lookupButton(ButtonType.OK).setDisable(var3 == null || var3.length() <= 0);

                    }
                });
                var2x.getChildren().add(var3);
                AnchorPane.setLeftAnchor(var3, 5.0);
                AnchorPane.setRightAnchor(var3, 5.0);
                AnchorPane.setTopAnchor(var3, 5.0);
                AnchorPane.setBottomAnchor(var3, 5.0);
                var1x.setTitle(var0);
                var1x.setHeaderText(var1);
                var1x.getDialogPane().setContent(var2x);
                var1x.getDialogPane().getButtonTypes().add(ButtonType.OK);
                var1x.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
                var1x.setResultConverter(new Callback<ButtonType, String>() {
                    public String call(ButtonType var1x) {
                        switch (var1x.getButtonData()) {
                            case OK_DONE:
                                return var3.getText();
                            case CANCEL_CLOSE:
                                return null;
                            default:
                                throw new RuntimeException("zzz");
                        }
                    }
                });
                var1x.getDialogPane().lookupButton(ButtonType.OK).setDisable(true);
                var3.requestFocus();
                FCR.IGV(var1x.getDialogPane());
                FCR.QGR(var1x.getDialogPane());
                Optional var4x = var1x.showAndWait();
                return var4x.isPresent() ? (String) var4x.get() : null;
            }
        });

        return var6;
    }

    public static boolean getConfirmPZDialog(final String var0, final String var1, final double var2, final double var4, final String var6, final String var7, final String var8) throws URISyntaxException {

        boolean var9;
        var9 = FEL.IKS(new FEM<Boolean>() {
            public Boolean IKT() {
                try {
                    final Dialog var1x = new Dialog();
                    var1x.getDialogPane().setMinWidth(var2);
                    var1x.getDialogPane().setMinHeight(var4);
                    AnchorPane var2x = new AnchorPane();
                    Hyperlink var3 = FCR.IGQ(var7);
                    var3.setOnMouseClicked(new EventHandler<MouseEvent>() {
                        public void handle(MouseEvent var1xx) {
                            if (var1xx.getButton() == MouseButton.PRIMARY) {
                                var1x.getDialogPane().lookupButton(ButtonType.OK).setDisable(false);
                            }
                        }
                    });
                    ContextMenu var4x = new ContextMenu();
                    MenuItem var5 = new MenuItem(var8);
                    var5.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent var1xx) {
                            Clipboard var2x = Clipboard.getSystemClipboard();
                            ClipboardContent var3 = new ClipboardContent();
                            var3.putString(var7);
                            var2x.setContent(var3);
                            var1x.getDialogPane().lookupButton(ButtonType.OK).setDisable(false);
                        }
                    });
                    var4x.getItems().add(var5);
                    var3.setContextMenu(var4x);
                    Text var6x = new Text(var6);
                    VBox var7x = new VBox(5.0);
                    var7x.getChildren().add(var3);
                    var7x.getChildren().add(var6x);
                    var2x.getChildren().add(var7x);
                    AnchorPane.setLeftAnchor(var7x, 5.0);
                    AnchorPane.setRightAnchor(var7x, 5.0);
                    AnchorPane.setTopAnchor(var7x, 5.0);
                    AnchorPane.setBottomAnchor(var7x, 5.0);
                    var1x.setTitle(var0);
                    var1x.setHeaderText(var1);
                    var1x.getDialogPane().setContent(var2x);
                    var1x.getDialogPane().getButtonTypes().add(ButtonType.OK);
                    var1x.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
                    var1x.setResultConverter(new Callback<ButtonType, Boolean>() {
                        public Boolean call(ButtonType var1x) {
                            switch (var1x.getButtonData()) {
                                case OK_DONE:
                                    return true;
                                case CANCEL_CLOSE:
                                default:
                                    return false;
                            }
                        }
                    });
                    var1x.getDialogPane().lookupButton(ButtonType.OK).setDisable(true);
                    var3.requestFocus();
                    FCR.IGV(var1x.getDialogPane());
                    FCR.QGR(var1x.getDialogPane());
                    Optional var8x = var1x.showAndWait();
                    return var8x.isPresent() ? (Boolean) var8x.get() : false;
                } catch (URISyntaxException var9) {
                    log.error("Something bad happened", var9);
                    throw new FFI(var9);
                }
            }
        });

        return var9;
    }

    public static FEN getUnsavedDataDialog(String var0, String var1, String var2, String var3, String var4, boolean var5, double var6, double var8, String var10) {

        FEN var16;
        Dialog var11 = new Dialog();
        var11.getDialogPane().setMinWidth(var6);
        var11.getDialogPane().setMinHeight(var8);
        var11.setTitle(var0);
        if (var1 != null) {
            var11.setHeaderText(var1);
        }

        var11.setContentText(var10);
        ButtonType var12 = new ButtonType(var2, ButtonData.YES);
        ButtonType var13 = new ButtonType(var3, ButtonData.NO);
        ButtonType var14 = new ButtonType(var4, ButtonData.APPLY);
        var11.getDialogPane().getButtonTypes().add(var12);
        var11.getDialogPane().getButtonTypes().add(var13);
        var11.getDialogPane().getButtonTypes().add(var14);
        var11.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        var11.getDialogPane().lookupButton(ButtonType.CANCEL).setManaged(false);
        if (var5) {
            var11.getDialogPane().lookupButton(var12).setDisable(true);
        }

        var11.setResultConverter(new Callback<ButtonType, FEN>() {
            public FEN call(ButtonType var1) {
                switch (var1.getButtonData()) {
                    case CANCEL_CLOSE:
                    case APPLY:
                        return FEN.CancelExit;
                    case YES:
                        return FEN.ExitAndSave;
                    case NO:
                        return FEN.ExitWithoutSave;
                    default:
                        return FEN.Unspecified;
                }
            }
        });
        IGV(var11.getDialogPane());
        QGR(var11.getDialogPane());
        Optional var15 = var11.showAndWait();
        if (var15.isPresent()) {
            var16 = (FEN) var15.get();
            return var16;
        }

        var16 = FEN.Unspecified;

        return var16;
    }

    public static FEN getConfirmDataDialog(final String var0, final String var1, final String var2, final String var3, final double var4, final double var6, final String var8) {

        FEN var9;
        var9 = FEL.IKS(new FEM<FEN>() {
            public FEN IKT() {
                Dialog var1x = new Dialog();
                var1x.getDialogPane().setMinWidth(var4);
                var1x.getDialogPane().setMinHeight(var6);
                var1x.setTitle(var0);
                if (var1 != null) {
                    var1x.setHeaderText(var1);
                }

                var1x.setContentText(var8);
                ButtonType var2x = new ButtonType(var2, ButtonData.YES);
                ButtonType var3x = new ButtonType(var3, ButtonData.CANCEL_CLOSE);
                var1x.getDialogPane().getButtonTypes().add(var2x);
                var1x.getDialogPane().getButtonTypes().add(var3x);
                var1x.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
                var1x.getDialogPane().lookupButton(ButtonType.CANCEL).setManaged(false);
                var1x.setResultConverter(new Callback<ButtonType, FEN>() {
                    public FEN call(ButtonType var1x) {
                        switch (var1x.getButtonData()) {
                            case CANCEL_CLOSE:
                            case APPLY:
                                return FEN.Reject;
                            case YES:
                                return FEN.Confirm;
                            case NO:
                            default:
                                return FEN.Unspecified;
                        }
                    }
                });
                FCR.IGV(var1x.getDialogPane());
                FCR.QGR(var1x.getDialogPane());
                Optional var4x = var1x.showAndWait();
                return var4x.isPresent() ? (FEN) var4x.get() : FEN.Unspecified;
            }
        });

        return var9;
    }

    public static FCS getSignatureMethodSelector(final String var0, final String var1, final double var2, final double var4, final String var6, final boolean var7) {

        FCS var8;
        var8 = FEL.IKS(new FEM<FCS>() {
            public FCS IKT() {
                Dialog var1x = new Dialog();
                var1x.getDialogPane().setMinWidth(var2);
                var1x.getDialogPane().setMinHeight(var4);
                var1x.setTitle(var0);
                if (var1 != null) {
                    var1x.setHeaderText(var1);
                }

                var1x.setContentText(var6);
                final HashMap var2x = new HashMap();
                FCS var3 = FCS.CryptCard;
                ButtonType var4x = new ButtonType(var3.getDescription(), ButtonData.APPLY);
                var1x.getDialogPane().getButtonTypes().add(var4x);
                var2x.put(var4x, var3);
                var3 = FCS.PZ;
                var4x = new ButtonType(var3.getDescription(), ButtonData.APPLY);
                var1x.getDialogPane().getButtonTypes().add(var4x);
                var2x.put(var4x, var3);
                var3 = FCS.KD;
                var4x = new ButtonType(var3.getDescription(), ButtonData.APPLY);
                var1x.getDialogPane().getButtonTypes().add(var4x);
                var2x.put(var4x, var3);
                var1x.getDialogPane().lookupButton(var4x).setDisable(!var7);
                var1x.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
                var1x.setResultConverter(new Callback<ButtonType, FCS>() {
                    public FCS call(ButtonType var1x) {
                        switch (var1x.getButtonData()) {
                            case CANCEL_CLOSE:
                                return FCS.Cancel;
                            case APPLY:
                                return (FCS) var2x.get(var1x);
                            default:
                                throw new FFI("Unknown buttonType " + var1x.getButtonData());
                        }
                    }
                });
                FCR.IGV(var1x.getDialogPane());
                FCR.QGR(var1x.getDialogPane());
                Optional var5 = var1x.showAndWait();
                return var5.isPresent() ? (FCS) var5.get() : null;
            }
        });

        return var8;
    }

    public static QGV getJpkStatusDialogResult(final String var0, final String var1, final double var2, final double var4, final String var6, final boolean var7) {

        QGV var8;
        var8 = FEL.IKS(new FEM<QGV>() {
            public QGV IKT() {
                Dialog var1x = new Dialog();
                var1x.getDialogPane().setMinWidth(var2);
                var1x.getDialogPane().setMinHeight(var4);
                var1x.setTitle(var0);
                if (var1 != null) {
                    var1x.setHeaderText(var1);
                }

                var1x.setContentText(var6);
                final HashMap var2x = new HashMap();
                QGV var3 = QGV.PRINT_UPO;
                ButtonType var4x = new ButtonType(var3.getDescription(), ButtonData.YES);
                var1x.getDialogPane().getButtonTypes().add(var4x);
                var2x.put(var4x, var3);
                var1x.getDialogPane().lookupButton(var4x).setDisable(!var7);
                var3 = QGV.CLOSE;
                var4x = new ButtonType(var3.getDescription(), ButtonData.CANCEL_CLOSE);
                var1x.getDialogPane().getButtonTypes().add(var4x);
                var2x.put(var4x, var3);
                var1x.setResultConverter(new Callback<ButtonType, QGV>() {
                    public QGV call(ButtonType var1x) {
                        switch (var1x.getButtonData()) {
                            case CANCEL_CLOSE:
                                return QGV.CLOSE;
                            case YES:
                                return (QGV) var2x.get(var1x);
                            default:
                                throw new FFI("Unknown buttonType " + var1x.getButtonData());
                        }
                    }
                });
                FCR.IGV(var1x.getDialogPane());
                FCR.QGR(var1x.getDialogPane());
                Optional var5 = var1x.showAndWait();
                return var5.isPresent() ? (QGV) var5.get() : null;
            }
        });

        return var8;
    }

    public static QGW getNoCryptCardDialogResult(final String var0, final String var1, final double var2, final double var4, final String var6) {

        QGW var7;
        var7 = FEL.IKS(new FEM<QGW>() {
            public QGW IKT() {
                Dialog var1x = new Dialog();
                var1x.getDialogPane().setMinWidth(var2);
                var1x.getDialogPane().setMinHeight(var4);
                var1x.setTitle(var0);
                if (var1 != null) {
                    var1x.setHeaderText(var1);
                }

                var1x.setContentText(var6);
                final HashMap var2x = new HashMap();
                QGW var3 = QGW.GO_TO_SETTINGS;
                ButtonType var4x = new ButtonType(var3.getDescription(), ButtonData.BACK_PREVIOUS);
                var1x.getDialogPane().getButtonTypes().add(var4x);
                var2x.put(var4x, var3);
                var3 = QGW.OK;
                var4x = new ButtonType(var3.getDescription(), ButtonData.FINISH);
                var1x.getDialogPane().getButtonTypes().add(var4x);
                var2x.put(var4x, var3);
                var1x.setResultConverter(new Callback<ButtonType, QGW>() {
                    public QGW call(ButtonType var1x) {
                        switch (var1x.getButtonData()) {
                            case CANCEL_CLOSE:
                                return QGW.OK;
                            case BACK_PREVIOUS:
                            case FINISH:
                                return (QGW) var2x.get(var1x);
                            default:
                                throw new FFI("Unknown buttonType " + var1x.getButtonData());
                        }
                    }
                });
                FCR.IGV(var1x.getDialogPane());
                FCR.QGR(var1x.getDialogPane());
                Optional var5 = var1x.showAndWait();
                return var5.isPresent() ? (QGW) var5.get() : null;
            }
        });

        return var7;
    }

    public static QJU getAreYouSureDialogResult(final String var0, final String var1, final double var2, final double var4, final String var6) {

        QJU var7;
        var7 = FEL.IKS(new FEM<QJU>() {
            public QJU IKT() {
                Dialog var1x = new Dialog();
                var1x.getDialogPane().setMinWidth(var2);
                var1x.getDialogPane().setMinHeight(var4);
                var1x.setTitle(var0);
                if (var1 != null) {
                    var1x.setHeaderText(var1);
                }

                var1x.setContentText(var6);
                final HashMap var2x = new HashMap();
                QJU var3 = QJU.YES;
                ButtonType var4x = new ButtonType(var3.getDescription(), ButtonData.FINISH);
                var1x.getDialogPane().getButtonTypes().add(var4x);
                var2x.put(var4x, var3);
                var3 = QJU.NO;
                var4x = new ButtonType(var3.getDescription(), ButtonData.FINISH);
                var1x.getDialogPane().getButtonTypes().add(var4x);
                var2x.put(var4x, var3);
                var1x.setResultConverter(new Callback<ButtonType, QJU>() {
                    public QJU call(ButtonType var1x) {
                        switch (var1x.getButtonData()) {
                            case CANCEL_CLOSE:
                                return QJU.Cancel;
                            case BACK_PREVIOUS:
                            case FINISH:
                                return (QJU) var2x.get(var1x);
                            default:
                                throw new FFI("Unknown buttonType " + var1x.getButtonData());
                        }
                    }
                });
                FCR.IGV(var1x.getDialogPane());
                FCR.QGR(var1x.getDialogPane());
                Optional var5 = var1x.showAndWait();
                return var5.isPresent() ? (QJU) var5.get() : null;
            }
        });

        return var7;
    }

    public static void getMessageBoxDialog(String var0, String var1, double var2, double var4, Stage var6) {

        Dialog var7 = new Dialog();
        var7.initOwner(var6);
        var7.getDialogPane().setMinWidth(var2);
        var7.getDialogPane().setMinHeight(var4);
        var7.setTitle(var0);
        if (var1 != null) {
            var7.setContentText(var1);
        }

        var7.getDialogPane().getButtonTypes().add(ButtonType.OK);
        IGV(var7.getDialogPane());
        QGR(var7.getDialogPane());
        var7.showAndWait();

    }

    public static void getMessageBoxDialogWithHyperLink(final String var0, final String var1, final File var2, final double var3, final double var5) {

        FEL.IKS(new FEM<Void>() {
            public Void IKT() {
                Alert var1x = new Alert(AlertType.WARNING);
                var1x.getDialogPane().setMinWidth(var3);
                var1x.getDialogPane().setMinHeight(var5);
                var1x.setTitle(var0);
                var1x.setHeaderText("Uwaga!");
                Text var2x = new Text();
                var2x.setText(var1);
                AnchorPane var3x = new AnchorPane();
                Hyperlink var4 = null;
                if (var2 != null) {
                    var4 = FCR.IGS(new File(var2.getParent()), var2.getAbsolutePath());
                }

                VBox var5x = null;
                if (var4 != null) {
                    VBox var6 = new VBox();
                    var6.getChildren().add(var2x);
                    var6.getChildren().add(var4);
                    var5x = var6;
                }

                var3x.getChildren().add(var5x);
                AnchorPane.setLeftAnchor(var5x, 5.0);
                AnchorPane.setRightAnchor(var5x, 5.0);
                AnchorPane.setTopAnchor(var5x, 5.0);
                AnchorPane.setBottomAnchor(var5x, 5.0);
                var1x.getDialogPane().setContent(var3x);
                FCR.IGV(var1x.getDialogPane());
                FCR.QGR(var1x.getDialogPane());
                var1x.showAndWait();
                return null;
            }
        });

    }

    public static void IGE(String var0, String var1, String var2, boolean var3) {

        IGF(var0, var1, var2, var3, 400.0, 200.0);

    }

    public static void IGF(String var0, String var1, String var2, boolean var3, double var4, double var6) {

        log.debug("title " + var0);
        log.debug("header " + var1);
        log.debug("content " + var2);
        log.debug("scrollable " + var3);
        log.debug("width " + var4);
        log.debug("height " + var6);

        IGG(var0, var1, var2, null, var3, var4, var6, false);

    }

    public static void IGG(final String var0, final String var1, final String var2, final String var3, final boolean var4, final double var5, final double var7, boolean var9) {

        log.debug("title " + var0);
        log.debug("header " + var1);
        log.debug("content " + var2);
        log.debug("link " + var3);
        log.debug("scrollable " + var4);
        log.debug("width " + var5);
        log.debug("height " + var7);
        log.debug("synchronous " + var9);

        final Alert.AlertType var10 = AlertType.INFORMATION;
        if (var9) {
            IGH(var10, var0, var1, var2, var3, var4, var5, var7);
        } else {
            FEL.IKS(new FEM<Void>() {
                public Void IKT() {
                    FCR.IGH(var10, var0, var1, var2, var3, var4, var5, var7);
                    return null;
                }
            });
        }

    }

    private static void IGH(final Alert.AlertType var0, final String var1, final String var2, final String var3, final Object var4, final boolean var5, final Double var6, final Double var7) {

        FEL.IKS(new FEM<Void>() {
            public Void IKT() {
                Alert var1x = new Alert(var0);
                if (var6 != null) {
                    var1x.getDialogPane().setMinWidth(var6);
                }

                if (var7 != null) {
                    var1x.getDialogPane().setMinHeight(var7);
                }

                var1x.setTitle(var1);
                var1x.setHeaderText(var2);
                AnchorPane var2x = new AnchorPane();
                Object var3x;
                if (var5) {
                    TextArea var4x = new TextArea();
                    var4x.setText(var3 != null ? var3.substring(0, var3.length() > 10000 ? 10000 : var3.length()) : FCW.getInstance().getMessageForKey("micro.tableview.notavailable"));
                    var3x = var4x;
                } else {
                    Text var8 = new Text();
                    var8.setText(var3 != null ? var3.substring(0, var3.length() > 10000 ? 10000 : var3.length()) : FCW.getInstance().getMessageForKey("micro.tableview.notavailable"));
                    if (var6 != null) {
                        var8.setWrappingWidth(var6);
                    }

                    var3x = var8;
                }

                Hyperlink var9 = null;
                if (var4 != null) {
                    try {
                        if (var4 instanceof String) {
                            var9 = FCR.IGQ((String) var4);
                        } else if (var4 instanceof File var5x) {
                            var9 = FCR.IGS(var5x.getParentFile(), var5x.getAbsolutePath());
                        }
                    } catch (URISyntaxException var7x) {
                        log.error("Something bad happened", var7x);
                    }
                }

                Object var10;
                if (var9 != null) {
                    VBox var6x = new VBox();
                    var6x.setSpacing(5.0);
                    var6x.getChildren().add((Node) var3x);
                    var6x.getChildren().add(var9);
                    var10 = var6x;
                } else {
                    var10 = var3x;
                }

                var2x.getChildren().add((Node) var10);
                AnchorPane.setLeftAnchor((Node) var10, 5.0);
                AnchorPane.setRightAnchor((Node) var10, 5.0);
                AnchorPane.setTopAnchor((Node) var10, 5.0);
                AnchorPane.setBottomAnchor((Node) var10, 5.0);
                var1x.getDialogPane().setContent(var2x);
                FCR.IGV(var1x.getDialogPane());
                FCR.QGR(var1x.getDialogPane());
                var1x.showAndWait();
                return null;
            }
        });

    }

    public static void IGI(String var0, String var1, boolean var2) {

        IGJ(var0, var1, null, var2);

    }

    public static void IGJ(String var0, String var1, Object var2, boolean var3) {

        IGN(FCW.getInstance().getMessageForKey("micro.dialog.error.technical.title"), var0, var1, var2, var3, null, null);

    }

    public static void IGK(String var0, String var1, boolean var2) {

        IGL(var0, var1, null, var2);

    }

    public static void IGL(String var0, String var1, Object var2, boolean var3) {

        IGN(FCW.getInstance().getMessageForKey("micro.dialog.error.business.title"), var0, var1, var2, var3, null, null);

    }

    public static void IGM(String var0, String var1, String var2, boolean var3) {

        IGN(var0, var1, var2, null, var3, null, null);

    }

    public static void IGN(String var0, String var1, String var2, Object var3, boolean var4, Double var5, Double var6) {

        IGH(AlertType.ERROR, var0, var1, var2, var3, var4, var5, var6);

    }

    public static void IGO(final String var0, final Throwable var1, final boolean var2) {

        FEL.IKS(new FEM<Void>() {
            public Void IKT() {
                Alert var1x = new Alert(AlertType.ERROR);
                var1x.setResizable(true);
                var1x.setTitle(FCW.getInstance().getMessageForKey("micro.dialog.error.technical.title"));
                var1x.setHeaderText(var0);
                FCR.QGR(var1x.getDialogPane());
                String var2x = var1.getLocalizedMessage();
                if (var2) {
                    TextArea var3 = new TextArea();
                    var3.setText(var2x != null ? var2x.substring(0, var2x.length() > 10000 ? 10000 : var2x.length()) : FCW.getInstance().getMessageForKey("micro.tableview.notavailable"));
                    var1x.getDialogPane().setContent(var3);
                } else {
                    var1x.setContentText(var2x);
                }

                FCR.IGV(var1x.getDialogPane());
                var1x.showAndWait();
                return null;
            }
        });

    }

    public static void IGP(String var0, Throwable var1, boolean var2) {

        ArrayList var3 = new ArrayList();
        var3.add(var1);
        IGP(var0, var3, var2);

    }

    public static void IGP(final String var0, final List<Throwable> var1, final boolean var2) {

        FEL.IKS(new FEM<Void>() {
            public Void IKT() {
                Alert var1x = new Alert(AlertType.ERROR);
                var1x.setResizable(true);
                var1x.setTitle(FCW.getInstance().getMessageForKey("micro.dialog.error.technical.title"));
                var1x.setHeaderText(var0);
                FCR.QGR(var1x.getDialogPane());
                StringBuilder var2x = new StringBuilder();
                Iterator var3 = var1.iterator();

                while (var3.hasNext()) {
                    Throwable var4 = (Throwable) var3.next();
                    var2x.append(var4.getLocalizedMessage());
                    var2x.append(System.lineSeparator());
                }

                String var6 = var2x.toString();
                if (var2) {
                    TextArea var7 = new TextArea();
                    var7.setText(var6 != null ? var6.substring(0, var6.length() > 10000 ? 10000 : var6.length()) : FCW.getInstance().getMessageForKey("micro.tableview.notavailable"));
                    var1x.getDialogPane().setContent(var7);
                } else {
                    var1x.setContentText(var6);
                }

                ButtonType var8 = new ButtonType(FCW.getInstance().getMessageForKey("micro.dialog.message.button.report"), ButtonData.OTHER);
                var1x.getButtonTypes().add(var8);
                var1x.setResultConverter(new Callback<ButtonType, ButtonType>() {
                    public ButtonType call(ButtonType var1x) {
                        if (ButtonData.OTHER.equals(var1x.getButtonData())) {
                            if (Desktop.isDesktopSupported()) {
                                EVN var2x = new EVN() {
                                    public void HZI() {
                                        FCR.IGU(var1);
                                    }
                                };
                                var2x.start();
                                return null;
                            } else {
                                log.error("Desktop is NOT Supported");
                                return ButtonType.NO;
                            }
                        } else {
                            return ButtonType.OK;
                        }
                    }
                });
                FCR.IGV(var1x.getDialogPane());
                Optional var5 = var1x.showAndWait();
                log.debug("optional " + var5);
                return null;
            }
        });

    }

    private static Hyperlink IGQ(String var0) throws URISyntaxException {

        Hyperlink var1;
        var1 = IGR(new URI(var0), var0);

        return var1;
    }

    private static Hyperlink IGR(URI var0, String var1) {

        Hyperlink var2;
        var2 = IGT(var0, var1);

        return var2;
    }

    private static Hyperlink IGS(File var0, String var1) {

        Hyperlink var2;
        var2 = IGT(var0, var1);

        return var2;
    }

    private static Hyperlink IGT(final Object var0, String var1) {

        Hyperlink var3;
        Hyperlink var2 = new Hyperlink(var1);
        var2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent var1) {
                (new EVN() {
                    public void HZI() {

                        try {
                            if (var0 instanceof URI) {
                                Desktop.getDesktop().browse((URI) var0);
                            } else if (var0 instanceof File) {
                                Desktop.getDesktop().open((File) var0);
                            }
                        } catch (IOException var5) {
                            log.error("Something bad happened", var5);
                        }

                    }
                }).start();
            }
        });
        var3 = var2;

        return var3;
    }

    private static void IGU(final List<Throwable> exceptions) {

        if (exceptions != null && Desktop.isDesktopSupported()) {
            (new EVN() {
                public void HZI() {
                    try {
                        File reportFile = ReportUtils.createReport();
                        URI mailtoURI = ReportUtils.createEmailUri(reportFile, exceptions);
                        Desktop.getDesktop().open(reportFile.getParentFile());
                        Desktop.getDesktop().mail(mailtoURI);
                    } catch (URISyntaxException | IOException var13) {
                        log.error("Something bad happened", var13);
                    }

                }
            }).start();
        }

    }

    private static void IGV(DialogPane var0) {
        var0.getStylesheets().add("/css/DialogPane.css");
        var0.getStyleClass().add("myDialog");
    }

    private static void QGR(DialogPane var0) {
        Stage var1 = (Stage) var0.getScene().getWindow();
        var1.getIcons().add(QGK);
    }

    public enum QJU {
        YES(FCW.getInstance().getMessageForKey("micro.dialog.areyousure.button.yes")),
        NO(FCW.getInstance().getMessageForKey("micro.dialog.areyousure.button.no")),
        Cancel("");

        private final String QKX;

        QJU(String var3) {

            this.QKX = var3;

        }

        public String getDescription() {
            return this.QKX;
        }
    }

    public enum QGW {
        GO_TO_SETTINGS(FCW.getInstance().getMessageForKey("micro.dialog.sign.no_cryptcard.description.button.goToSettings")),
        OK(FCW.getInstance().getMessageForKey("micro.dialog.sign.no_cryptcard.description.button.ok"));

        private final String QHK;

        QGW(String var3) {

            this.QHK = var3;

        }

        public String getDescription() {
            return this.QHK;
        }
    }

    public enum QGV {
        PRINT_UPO(FCW.getInstance().getMessageForKey("micro.process.jpk_list.button.printUPO")),
        CLOSE(FCW.getInstance().getMessageForKey("micro.process.jpk_list.checkstatusdialog.Close"));

        private final String QHJ;

        QGV(String var3) {

            this.QHJ = var3;

        }

        public String getDescription() {
            return this.QHJ;
        }
    }

    public enum FCS {
        CryptCard(FCW.getInstance().getMessageForKey("micro.dialog.sign.button.sign.all.cryptcard")),
        PZ(FCW.getInstance().getMessageForKey("micro.dialog.sign.button.sign.all.pz")),
        KD(FCW.getInstance().getMessageForKey("micro.dialog.sign.button.sign.all.kd")),
        Cancel("");

        private final String HBC;

        FCS(String var3) {

            this.HBC = var3;

        }

        public String getDescription() {
            return this.HBC;
        }
    }
}
