package a.a.a.c.g.a;

import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;
import a.a.a.b.c.FEN;
import a.a.a.b.f.FFI;
import a.a.a.c.e.EXK;
import a.a.a.c.e.a.EXO;
import a.a.a.c.e.a.EXQ;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.d.EWA;
import a.a.a.c.e.a.e.EWF;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.g.b.FCW;
import java.awt.Desktop;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.image.Image;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;

public class FCR {
   private static Image QGK = new Image("/img/app/e_logo.png");
   private static final int HBD = 10000;

   public FCR() {
   }

   public static <_FIRST, _SECOND, _THIRD, _FOURTH, _T extends EWA<_FIRST, _SECOND, _THIRD, _FOURTH>> _T IGD(final String var0, final String var1, final List<_T> var2, final String var3, final String var4, final String var5, final String var6, final double var7, final double var9) {
      EXF.getInstance().ICO();

      EWA var11;
      try {
         var11 = (EWA)FEL.IKS(new FEM<_T>() {
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
                     if (var3x != null) {
                        var1x.getDialogPane().lookupButton(ButtonType.OK).setDisable(false);
                     } else {
                        var1x.getDialogPane().lookupButton(ButtonType.OK).setDisable(true);
                     }

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
      } finally {
         EXF.getInstance().ICP();
      }

      return (_T) var11;
   }

   public static String getPasswordDialog(final String var0, final String var1, final double var2, final double var4) {
      EXF.getInstance().ICO();

      String var6;
      try {
         var6 = (String)FEL.IKS(new FEM<String>() {
            public String IKT() {
               final Dialog var1x = new Dialog();
               var1x.getDialogPane().setMinWidth(var2);
               var1x.getDialogPane().setMinHeight(var4);
               AnchorPane var2x = new AnchorPane();
               final PasswordField var3 = new PasswordField();
               var3.textProperty().addListener(new ChangeListener<String>() {
                  public void changed(ObservableValue<? extends String> var1xx, String var2x, String var3) {
                     if (var3 != null && var3.length() > 0) {
                        var1x.getDialogPane().lookupButton(ButtonType.OK).setDisable(false);
                     } else {
                        var1x.getDialogPane().lookupButton(ButtonType.OK).setDisable(true);
                     }

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
               return var4x.isPresent() ? (String)var4x.get() : null;
            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

      return var6;
   }

   public static boolean getConfirmPZDialog(final String var0, final String var1, final double var2, final double var4, final String var6, final String var7, final String var8) throws URISyntaxException {
      EXF.getInstance().ICO();

      boolean var9;
      try {
         var9 = (Boolean)FEL.IKS(new FEM<Boolean>() {
            public Boolean IKT() {
               try {
                  final Dialog var1x = new Dialog();
                  var1x.getDialogPane().setMinWidth(var2);
                  var1x.getDialogPane().setMinHeight(var4);
                  AnchorPane var2x = new AnchorPane();
                  Hyperlink var3 = FCR.IGQ(var7);
                  var3.setOnMouseClicked(new EventHandler<MouseEvent>() {
                     public void handle(MouseEvent var1xx) {
                        switch (var1xx.getButton()) {
                           case PRIMARY:
                              var1x.getDialogPane().lookupButton(ButtonType.OK).setDisable(false);
                           default:
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
                  return var8x.isPresent() ? (Boolean)var8x.get() : false;
               } catch (URISyntaxException var9) {
                  EXF.getInstance().ICA((Throwable)var9);
                  throw new FFI(var9);
               }
            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

      return var9;
   }

   public static FEN getUnsavedDataDialog(String var0, String var1, String var2, String var3, String var4, boolean var5, double var6, double var8, String var10) {
      EXF.getInstance().ICO();

      FEN var16;
      try {
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
            var16 = (FEN)var15.get();
            return var16;
         }

         var16 = FEN.Unspecified;
      } finally {
         EXF.getInstance().ICP();
      }

      return var16;
   }

   public static FEN getConfirmDataDialog(final String var0, final String var1, final String var2, final String var3, final double var4, final double var6, final String var8) {
      EXF.getInstance().ICO();

      FEN var9;
      try {
         var9 = (FEN)FEL.IKS(new FEM<FEN>() {
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
               return var4x.isPresent() ? (FEN)var4x.get() : FEN.Unspecified;
            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

      return var9;
   }

   public static FCS getSignatureMethodSelector(final String var0, final String var1, final double var2, final double var4, final String var6, final boolean var7) {
      EXF.getInstance().ICO();

      FCS var8;
      try {
         var8 = (FCS)FEL.IKS(new FEM<FCS>() {
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
               FCS var3 = FCR.FCS.CryptCard;
               ButtonType var4x = new ButtonType(var3.getDescription(), ButtonData.APPLY);
               var1x.getDialogPane().getButtonTypes().add(var4x);
               var2x.put(var4x, var3);
               var3 = FCR.FCS.PZ;
               var4x = new ButtonType(var3.getDescription(), ButtonData.APPLY);
               var1x.getDialogPane().getButtonTypes().add(var4x);
               var2x.put(var4x, var3);
               var3 = FCR.FCS.KD;
               var4x = new ButtonType(var3.getDescription(), ButtonData.APPLY);
               var1x.getDialogPane().getButtonTypes().add(var4x);
               var2x.put(var4x, var3);
               var1x.getDialogPane().lookupButton(var4x).setDisable(!var7);
               var1x.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
               var1x.setResultConverter(new Callback<ButtonType, FCS>() {
                  public FCS call(ButtonType var1x) {
                     switch (var1x.getButtonData()) {
                        case CANCEL_CLOSE:
                           return FCR.FCS.Cancel;
                        case APPLY:
                           return (FCS)var2x.get(var1x);
                        default:
                           throw new FFI("Unknown buttonType " + var1x.getButtonData());
                     }
                  }
               });
               FCR.IGV(var1x.getDialogPane());
               FCR.QGR(var1x.getDialogPane());
               Optional var5 = var1x.showAndWait();
               return var5.isPresent() ? (FCS)var5.get() : null;
            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

      return var8;
   }

   public static QGV getJpkStatusDialogResult(final String var0, final String var1, final double var2, final double var4, final String var6, final boolean var7) {
      EXF.getInstance().ICO();

      QGV var8;
      try {
         var8 = (QGV)FEL.IKS(new FEM<QGV>() {
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
               QGV var3 = FCR.QGV.PRINT_UPO;
               ButtonType var4x = new ButtonType(var3.getDescription(), ButtonData.YES);
               var1x.getDialogPane().getButtonTypes().add(var4x);
               var2x.put(var4x, var3);
               var1x.getDialogPane().lookupButton(var4x).setDisable(!var7);
               var3 = FCR.QGV.CLOSE;
               var4x = new ButtonType(var3.getDescription(), ButtonData.CANCEL_CLOSE);
               var1x.getDialogPane().getButtonTypes().add(var4x);
               var2x.put(var4x, var3);
               var1x.setResultConverter(new Callback<ButtonType, QGV>() {
                  public QGV call(ButtonType var1x) {
                     switch (var1x.getButtonData()) {
                        case CANCEL_CLOSE:
                           return FCR.QGV.CLOSE;
                        case YES:
                           return (QGV)var2x.get(var1x);
                        default:
                           throw new FFI("Unknown buttonType " + var1x.getButtonData());
                     }
                  }
               });
               FCR.IGV(var1x.getDialogPane());
               FCR.QGR(var1x.getDialogPane());
               Optional var5 = var1x.showAndWait();
               return var5.isPresent() ? (QGV)var5.get() : null;
            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

      return var8;
   }

   public static QGW getNoCryptCardDialogResult(final String var0, final String var1, final double var2, final double var4, final String var6) {
      EXF.getInstance().ICO();

      QGW var7;
      try {
         var7 = (QGW)FEL.IKS(new FEM<QGW>() {
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
               QGW var3 = FCR.QGW.GO_TO_SETTINGS;
               ButtonType var4x = new ButtonType(var3.getDescription(), ButtonData.BACK_PREVIOUS);
               var1x.getDialogPane().getButtonTypes().add(var4x);
               var2x.put(var4x, var3);
               var3 = FCR.QGW.OK;
               var4x = new ButtonType(var3.getDescription(), ButtonData.FINISH);
               var1x.getDialogPane().getButtonTypes().add(var4x);
               var2x.put(var4x, var3);
               var1x.setResultConverter(new Callback<ButtonType, QGW>() {
                  public QGW call(ButtonType var1x) {
                     switch (var1x.getButtonData()) {
                        case CANCEL_CLOSE:
                           return FCR.QGW.OK;
                        case BACK_PREVIOUS:
                        case FINISH:
                           return (QGW)var2x.get(var1x);
                        default:
                           throw new FFI("Unknown buttonType " + var1x.getButtonData());
                     }
                  }
               });
               FCR.IGV(var1x.getDialogPane());
               FCR.QGR(var1x.getDialogPane());
               Optional var5 = var1x.showAndWait();
               return var5.isPresent() ? (QGW)var5.get() : null;
            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

      return var7;
   }

   public static QJU getAreYouSureDialogResult(final String var0, final String var1, final double var2, final double var4, final String var6) {
      EXF.getInstance().ICO();

      QJU var7;
      try {
         var7 = (QJU)FEL.IKS(new FEM<QJU>() {
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
               QJU var3 = FCR.QJU.YES;
               ButtonType var4x = new ButtonType(var3.getDescription(), ButtonData.FINISH);
               var1x.getDialogPane().getButtonTypes().add(var4x);
               var2x.put(var4x, var3);
               var3 = FCR.QJU.NO;
               var4x = new ButtonType(var3.getDescription(), ButtonData.FINISH);
               var1x.getDialogPane().getButtonTypes().add(var4x);
               var2x.put(var4x, var3);
               var1x.setResultConverter(new Callback<ButtonType, QJU>() {
                  public QJU call(ButtonType var1x) {
                     switch (var1x.getButtonData()) {
                        case CANCEL_CLOSE:
                           return FCR.QJU.Cancel;
                        case BACK_PREVIOUS:
                        case FINISH:
                           return (QJU)var2x.get(var1x);
                        default:
                           throw new FFI("Unknown buttonType " + var1x.getButtonData());
                     }
                  }
               });
               FCR.IGV(var1x.getDialogPane());
               FCR.QGR(var1x.getDialogPane());
               Optional var5 = var1x.showAndWait();
               return var5.isPresent() ? (QJU)var5.get() : null;
            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

      return var7;
   }

   public static void getMessageBoxDialog(String var0, String var1, double var2, double var4, Stage var6) {
      EXF.getInstance().ICO();

      try {
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
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void getMessageBoxDialogWithHyperLink(final String var0, final String var1, final File var2, final double var3, final double var5) {
      EXF.getInstance().ICO();

      try {
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
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IGE(String var0, String var1, String var2, boolean var3) {
      EXF.getInstance().ICO();

      try {
         IGF(var0, var1, var2, var3, 400.0, 200.0);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IGF(String var0, String var1, String var2, boolean var3, double var4, double var6) {
      EXF.getInstance().ICO();
      EXF.getInstance().ICK("title " + var0);
      EXF.getInstance().ICK("header " + var1);
      EXF.getInstance().ICK("content " + var2);
      EXF.getInstance().ICK("scrollable " + var3);
      EXF.getInstance().ICK("width " + var4);
      EXF.getInstance().ICK("height " + var6);

      try {
         IGG(var0, var1, var2, (String)null, var3, var4, var6, false);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IGG(final String var0, final String var1, final String var2, final String var3, final boolean var4, final double var5, final double var7, boolean var9) {
      EXF.getInstance().ICO();
      EXF.getInstance().ICK("title " + var0);
      EXF.getInstance().ICK("header " + var1);
      EXF.getInstance().ICK("content " + var2);
      EXF.getInstance().ICK("link " + var3);
      EXF.getInstance().ICK("scrollable " + var4);
      EXF.getInstance().ICK("width " + var5);
      EXF.getInstance().ICK("height " + var7);
      EXF.getInstance().ICK("synchronous " + var9);

      try {
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
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private static void IGH(final Alert.AlertType var0, final String var1, final String var2, final String var3, final Object var4, final boolean var5, final Double var6, final Double var7) {
      EXF.getInstance().ICO();

      try {
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
                        var9 = FCR.IGQ((String)var4);
                     } else if (var4 instanceof File) {
                        File var5x = (File)var4;
                        var9 = FCR.IGS(var5x.getParentFile(), var5x.getAbsolutePath());
                     }
                  } catch (URISyntaxException var7x) {
                     EXF.getInstance().ICA((Throwable)var7x);
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
               AnchorPane.setLeftAnchor((Node)var10, 5.0);
               AnchorPane.setRightAnchor((Node)var10, 5.0);
               AnchorPane.setTopAnchor((Node)var10, 5.0);
               AnchorPane.setBottomAnchor((Node)var10, 5.0);
               var1x.getDialogPane().setContent(var2x);
               FCR.IGV(var1x.getDialogPane());
               FCR.QGR(var1x.getDialogPane());
               var1x.showAndWait();
               return null;
            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IGI(String var0, String var1, boolean var2) {
      EXF.getInstance().ICO();

      try {
         IGJ(var0, var1, null, var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IGJ(String var0, String var1, Object var2, boolean var3) {
      EXF.getInstance().ICO();

      try {
         IGN(FCW.getInstance().getMessageForKey("micro.dialog.error.technical.title"), var0, var1, var2, var3, (Double)null, (Double)null);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IGK(String var0, String var1, boolean var2) {
      EXF.getInstance().ICO();

      try {
         IGL(var0, var1, null, var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IGL(String var0, String var1, Object var2, boolean var3) {
      EXF.getInstance().ICO();

      try {
         IGN(FCW.getInstance().getMessageForKey("micro.dialog.error.business.title"), var0, var1, var2, var3, (Double)null, (Double)null);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IGM(String var0, String var1, String var2, boolean var3) {
      EXF.getInstance().ICO();

      try {
         IGN(var0, var1, var2, null, var3, (Double)null, (Double)null);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IGN(String var0, String var1, String var2, Object var3, boolean var4, Double var5, Double var6) {
      EXF.getInstance().ICO();

      try {
         IGH(AlertType.ERROR, var0, var1, var2, var3, var4, var5, var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IGO(final String var0, final Throwable var1, final boolean var2) {
      EXF.getInstance().ICO();

      try {
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
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IGP(String var0, Throwable var1, boolean var2) {
      EXF.getInstance().ICO();

      try {
         ArrayList var3 = new ArrayList();
         var3.add(var1);
         IGP(var0, (List)var3, var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IGP(final String var0, final List<Throwable> var1, final boolean var2) {
      EXF.getInstance().ICO();

      try {
         FEL.IKS(new FEM<Void>() {
            public Void IKT() {
               Alert var1x = new Alert(AlertType.ERROR);
               var1x.setResizable(true);
               var1x.setTitle(FCW.getInstance().getMessageForKey("micro.dialog.error.technical.title"));
               var1x.setHeaderText(var0);
               FCR.QGR(var1x.getDialogPane());
               StringBuilder var2x = new StringBuilder();
               Iterator var3 = var1.iterator();

               while(var3.hasNext()) {
                  Throwable var4 = (Throwable)var3.next();
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
                           EXF.getInstance().ICA((Object)"Desktop is NOT Supported");
                           return ButtonType.NO;
                        }
                     } else {
                        return ButtonType.OK;
                     }
                  }
               });
               FCR.IGV(var1x.getDialogPane());
               Optional var5 = var1x.showAndWait();
               EXF.getInstance().ICK("optional " + var5);
               return null;
            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private static Hyperlink IGQ(String var0) throws URISyntaxException {
      EXF.getInstance().ICO();

      Hyperlink var1;
      try {
         var1 = IGR(new URI(var0), var0);
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   private static Hyperlink IGR(URI var0, String var1) {
      EXF.getInstance().ICO();

      Hyperlink var2;
      try {
         var2 = IGT(var0, var1);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private static Hyperlink IGS(File var0, String var1) {
      EXF.getInstance().ICO();

      Hyperlink var2;
      try {
         var2 = IGT(var0, var1);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private static Hyperlink IGT(final Object var0, String var1) {
      EXF.getInstance().ICO();

      Hyperlink var3;
      try {
         Hyperlink var2 = new Hyperlink(var1);
         var2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent var1) {
               (new EVN() {
                  public void HZI() {
                     EXF.getInstance().ICO();

                     try {
                        if (var0 instanceof URI) {
                           Desktop.getDesktop().browse((URI)var0);
                        } else if (var0 instanceof File) {
                           Desktop.getDesktop().open((File)var0);
                        }
                     } catch (IOException var5) {
                        EXF.getInstance().ICA((Throwable)var5);
                     } finally {
                        EXF.getInstance().ICP();
                     }

                  }
               }).start();
            }
         });
         var3 = var2;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   private static void IGU(final List<Throwable> var0) {
      EXF.getInstance().ICO();

      try {
         if (var0 != null && Desktop.isDesktopSupported()) {
            (new EVN() {
               public void HZI() {
                  try {
                     File var1 = new File(EXK.GPW + "/reports");
                     EXF.getInstance().ICK("reportsDir " + var1);
                     boolean var2 = var1.mkdirs();
                     EXF.getInstance().ICK("mkdirs " + var2);
                     File var3 = new File(var1, "report_" + (new SimpleDateFormat("yyyyMMdd'T'HHmmssS")).format(new Date()) + ".zip");
                     EXF.getInstance().ICK("reportFile " + var3);
                     EWF.IAB(false, var3, EXF.getInstance().getDefaultOutputLoggerFile(), EXF.getInstance().getDefaultErrorLoggerFile());
                     StringBuilder var4 = new StringBuilder();
                     var4.append("mailto:").append("jpk.helpdesk@mf.gov.pl");
                     var4.append("?cc=").append("support@akmf.pl");
                     StringBuilder var5 = new StringBuilder(FCW.getInstance().getMessageForKey("micro.error.mail.subject"));
                     var5.append(" [");
                     var5.append((new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz")).format(new Date()));
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

                     EXO[] var14 = EXO.values();
                     int var8 = var14.length;

                     for(int var9 = 0; var9 < var8; ++var9) {
                        EXO var10 = var14[var9];
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
                     Iterator var15 = var0.iterator();

                     while(var15.hasNext()) {
                        Throwable var17 = (Throwable)var15.next();
                        var6.append("####### BEGIN");
                        var6.append(System.lineSeparator());
                        var6.append(var17.getLocalizedMessage());
                        var6.append(System.lineSeparator());
                        var6.append(System.lineSeparator());
                        ByteArrayOutputStream var19 = new ByteArrayOutputStream();
                        PrintStream var20 = new PrintStream(var19, true, StandardCharsets.UTF_8.name());
                        var17.printStackTrace(var20);
                        var6.append(new String(var19.toByteArray(), StandardCharsets.UTF_8));
                        var6.append(System.lineSeparator());
                        var6.append("####### END");
                        var6.append(System.lineSeparator());
                     }

                     var6.append(System.lineSeparator());
                     var6.append("#######");
                     var6.append(System.lineSeparator());
                     var6.append(var3.getAbsolutePath());
                     var6.append(System.lineSeparator());
                     var6.append("#######");
                     var6.append(System.lineSeparator());
                     Desktop.getDesktop().open(var1);
                     var4.append("&body=").append(URLEncoder.encode(var6.toString(), StandardCharsets.UTF_8.name()).replace("+", "%20"));
                     String var16 = var4.toString();
                     URI var18 = new URI(var16);
                     Desktop.getDesktop().mail(var18);
                  } catch (URISyntaxException | IOException var13) {
                     EXF.getInstance().ICA((Throwable)var13);
                  }

               }
            }).start();
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private static void IGV(DialogPane var0) {
      var0.getStylesheets().add("/css/DialogPane.css");
      var0.getStyleClass().add("myDialog");
   }

   private static void QGR(DialogPane var0) {
      Stage var1 = (Stage)var0.getScene().getWindow();
      var1.getIcons().add(QGK);
   }

   public static enum QJU {
      YES(FCW.getInstance().getMessageForKey("micro.dialog.areyousure.button.yes")),
      NO(FCW.getInstance().getMessageForKey("micro.dialog.areyousure.button.no")),
      Cancel("");

      private final String QKX;

      private QJU(String var3) {
         EXF.getInstance().ICO();

         try {
            this.QKX = var3;
         } finally {
            EXF.getInstance().ICP();
         }

      }

      public String getDescription() {
         return this.QKX;
      }
   }

   public static enum QGW {
      GO_TO_SETTINGS(FCW.getInstance().getMessageForKey("micro.dialog.sign.no_cryptcard.description.button.goToSettings")),
      OK(FCW.getInstance().getMessageForKey("micro.dialog.sign.no_cryptcard.description.button.ok"));

      private final String QHK;

      private QGW(String var3) {
         EXF.getInstance().ICO();

         try {
            this.QHK = var3;
         } finally {
            EXF.getInstance().ICP();
         }

      }

      public String getDescription() {
         return this.QHK;
      }
   }

   public static enum QGV {
      PRINT_UPO(FCW.getInstance().getMessageForKey("micro.process.jpk_list.button.printUPO")),
      CLOSE(FCW.getInstance().getMessageForKey("micro.process.jpk_list.checkstatusdialog.Close"));

      private final String QHJ;

      private QGV(String var3) {
         EXF.getInstance().ICO();

         try {
            this.QHJ = var3;
         } finally {
            EXF.getInstance().ICP();
         }

      }

      public String getDescription() {
         return this.QHJ;
      }
   }

   public static enum FCS {
      CryptCard(FCW.getInstance().getMessageForKey("micro.dialog.sign.button.sign.all.cryptcard")),
      PZ(FCW.getInstance().getMessageForKey("micro.dialog.sign.button.sign.all.pz")),
      KD(FCW.getInstance().getMessageForKey("micro.dialog.sign.button.sign.all.kd")),
      Cancel("");

      private final String HBC;

      private FCS(String var3) {
         EXF.getInstance().ICO();

         try {
            this.HBC = var3;
         } finally {
            EXF.getInstance().ICP();
         }

      }

      public String getDescription() {
         return this.HBC;
      }
   }
}
