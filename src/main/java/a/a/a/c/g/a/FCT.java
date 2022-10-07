package a.a.a.c.g.a;

import a.a.a.b.f.FFG;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFN;
import a.a.a.b.f.FFO;
import a.a.a.b.f.a.FFL;
import a.a.a.b.f.a.FFM;
import a.a.a.c.e.a.EXR;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.g.b.FCW;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.cert.X509Certificate;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.util.Callback;

public class FCT {
   public FCT() {
   }

   public static void IGX(String var0, Exception var1) {
      EXF.getInstance().ICO();

      try {
         if (var1 instanceof FFO) {
            FCR.IGO(var0, var1, false);
         } else if (var1 instanceof FFK) {
            FCR.IGP(var0, (Throwable)var1, false);
         } else if (var1 instanceof FFI) {
            FCR.IGP(var0, (Throwable)var1, false);
         } else if (var1 instanceof FFN) {
            FFN var2 = (FFN)var1;
            FCR.IGP(var0, var2.getTechnicalExceptionList(), false);
         } else {
            FCR.IGP(var0, (Throwable)var1, false);
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static <_T> TableColumn<_T, Object> IGY(String var0, double var1, String var3) {
      EXF.getInstance().ICO();

      TableColumn var5;
      try {
         TableColumn var4 = new TableColumn(var0);
         var4.setPrefWidth(var1);
         var4.setCellValueFactory(new PropertyValueFactory(var3));
         var4.setCellFactory(new Callback<TableColumn<_T, Object>, TableCell<_T, Object>>() {
            public TableCell<_T, Object> call(TableColumn<_T, Object> var1) {
               return new TableCell<_T, Object>() {
                  protected void updateItem(Object var1, boolean var2) {
                     super.updateItem(var1, var2);
                     (new FCU<Object>() {
                        Node getGraphicDelegate() {
                           return getGraphic();
                        }

                        void setGraphicDelegate(Node var1) {
                           setGraphic(var1);
                        }

                        void setTextDelegate(String var1) {
                           setText(var1);
                        }

                        void setContextMenuDelegate(ContextMenu var1) {
                           setContextMenu(var1);
                        }

                        void setTooltipDelegate(Tooltip var1) {
                           setTooltip(var1);
                        }

                        void setBackgroundDelegate(Background var1) {
                           setBackground(var1);
                        }

                        Parent getParentDelegate() {
                           return getParent();
                        }

                        Scene getSceneDelegate() {
                           return getScene();
                        }
                     }).IGW(var1, var2);
                  }
               };
            }
         });
         var5 = var4;
      } finally {
         EXF.getInstance().ICP();
      }

      return var5;
   }

   private abstract static class FCU<_T> {
      private final NumberFormat HBE;

      private FCU() {
         this.HBE = NumberFormat.getPercentInstance();
      }

      abstract Node getGraphicDelegate();

      abstract void setGraphicDelegate(Node var1);

      abstract void setTextDelegate(String var1);

      abstract void setContextMenuDelegate(ContextMenu var1);

      abstract void setTooltipDelegate(Tooltip var1);

      abstract void setBackgroundDelegate(Background var1);

      abstract Parent getParentDelegate();

      abstract Scene getSceneDelegate();

      public void IGW(_T var1, boolean var2) {
         this.setGraphicDelegate((Node)null);
         this.setTextDelegate((String)null);
         this.setTooltipDelegate((Tooltip)null);
         this.setBackgroundDelegate((Background)null);
         if (!var2) {
            this.setContextMenuDelegate((ContextMenu)null);
            if (var1 instanceof Double) {
               this.setTextDelegate("");
               Node var4 = this.getGraphicDelegate();
               HBox var5 = null;
               if (var4 instanceof HBox) {
                  var5 = (HBox)var4;
               } else {
                  var5 = new HBox();
                  var5.setSpacing(5.0);
                  var5.getChildren().add(new ProgressBar());
                  var5.getChildren().add(new Text());
                  this.setGraphicDelegate(var5);
               }

               ProgressBar var6 = (ProgressBar)var5.getChildren().get(0);
               Text var7 = (Text)var5.getChildren().get(1);
               double var8 = (Double)var1;
               var6.setProgress(var8);
               var7.setText(this.HBE.format(var8));
            } else if (var1 instanceof Boolean) {
               Boolean var10 = (Boolean)var1;
               if (var10) {
                  this.setBackgroundDelegate(new Background(new BackgroundFill[]{new BackgroundFill(Color.CHARTREUSE, CornerRadii.EMPTY, Insets.EMPTY)}));
                  this.setTextDelegate(FCW.getInstance().getMessageForKey("micro.tableview.true"));
               } else {
                  this.setBackgroundDelegate(new Background(new BackgroundFill[]{new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)}));
                  this.setTextDelegate(FCW.getInstance().getMessageForKey("micro.tableview.false"));
               }
            } else {
               ContextMenu var16;
               MenuItem var17;
               if (var1 instanceof File) {
                  final File var11 = (File)var1;
                  if (var11 != null) {
                     this.setTextDelegate(var11.getName());
                     var16 = new ContextMenu();
                     if (var11.exists()) {
                        var17 = new MenuItem(FCW.getInstance().getMessageForKey("micro.tableview.open"));
                        var17.setOnAction(new EventHandler<ActionEvent>() {
                           public void handle(ActionEvent var1) {
                              if (Desktop.isDesktopSupported()) {
                                 (new EVN() {
                                    public void HZI() {
                                       try {
                                          Desktop.getDesktop().open(var11);
                                       } catch (IOException var2) {
                                          EXF.getInstance().ICA((Throwable)var2);
                                       }

                                    }
                                 }).start();
                              }

                           }
                        });
                        var16.getItems().add(var17);
                     }

                     var17 = new MenuItem(FCW.getInstance().getMessageForKey("micro.tableview.showpath"));
                     var17.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent var1) {
                           FCR.IGE(FCW.getInstance().getMessageForKey("micro.dialog.message.title"), var11.getName(), var11.getAbsolutePath(), false);
                        }
                     });
                     var16.getItems().add(var17);
                     if (var11.isFile()) {
                        var17 = new MenuItem(FCW.getInstance().getMessageForKey("micro.tableview.showparentdir"));
                        var17.setOnAction(new EventHandler<ActionEvent>() {
                           public void handle(ActionEvent var1) {
                              if (Desktop.isDesktopSupported()) {
                                 (new EVN() {
                                    public void HZI() {
                                       try {
                                          Desktop.getDesktop().open(var11.getParentFile());
                                       } catch (IOException var2) {
                                          EXF.getInstance().ICA((Throwable)var2);
                                       }

                                    }
                                 }).start();
                              }

                           }
                        });
                        var16.getItems().add(var17);
                     }

                     this.setContextMenuDelegate(var16);
                  }
               } else if (var1 instanceof byte[]) {
                  byte[] var12 = (byte[])((byte[])var1);
                  if (var12 != null) {
                     this.setTextDelegate(EXR.IEQ(var12));
                  }
               } else if (var1 instanceof Throwable) {
                  final Throwable var13 = (Throwable)var1;
                  if (var13 != null) {
                     this.setTextDelegate(var13.getLocalizedMessage());
                     var16 = new ContextMenu();
                     var17 = new MenuItem(FCW.getInstance().getMessageForKey("micro.tableview.showexception"));
                     var17.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent var1) {
                           if (var13 instanceof FFG) {
                              FCR.IGE(FCW.getInstance().getMessageForKey("micro.dialog.message.title"), "", var13.getLocalizedMessage(), false);
                           } else {
                              ByteArrayOutputStream var2 = new ByteArrayOutputStream();

                              try {
                                 PrintStream var3 = new PrintStream(var2, true, StandardCharsets.UTF_8.name());
                                 var13.printStackTrace(var3);
                              } catch (UnsupportedEncodingException var4) {
                                 EXF.getInstance().ICA((Throwable)var4);
                              }

                              FCR.IGE(FCW.getInstance().getMessageForKey("micro.dialog.message.title"), var13.getLocalizedMessage(), new String(var2.toByteArray(), StandardCharsets.UTF_8), false);
                           }

                        }
                     });
                     var16.getItems().addAll(new MenuItem[]{var17});
                     this.setContextMenuDelegate(var16);
                  }
               } else {
                  MenuItem var21;
                  if (var1 instanceof FFM) {
                     final FFM var14 = (FFM)var1;
                     if (var14 != null) {
                        this.setTextDelegate(FCW.getInstance().getMessageForKey("micro.tableview.exception.list"));
                        var16 = new ContextMenu();
                        var17 = new MenuItem(FCW.getInstance().getMessageForKey("micro.tableview.showexceptions"));
                        var17.setOnAction(new EventHandler<ActionEvent>() {
                           public void handle(ActionEvent var1) {
                              int var2 = 0;
                              StringBuilder var3 = new StringBuilder();
                              Iterator var4 = var14.getThrowables().iterator();

                              while(var4.hasNext()) {
                                 Throwable var5 = (Throwable)var4.next();
                                 ++var2;
                                 var3.append(var5.getLocalizedMessage());
                                 var3.append(System.lineSeparator());
                                 if (var2 > 20) {
                                    break;
                                 }
                              }

                              if (var14.getThrowables().size() > 20) {
                                 var3.append(FCW.getInstance().getMessageForKey("micro.dialog.dialog.someelementsnotdisplayed").replaceFirst("##NUMOFELEMENTS##", String.valueOf(var14.getThrowables().size() - 20)));
                                 var3.append(System.lineSeparator());
                              }

                              FCR.IGE(FCW.getInstance().getMessageForKey("micro.dialog.message.title"), FCW.getInstance().getMessageForKey("micro.tableview.exception.list"), var3.toString(), false);
                           }
                        });
                        var21 = new MenuItem(FCW.getInstance().getMessageForKey("micro.dialog.savetofile"));
                        var21.setOnAction(new EventHandler<ActionEvent>() {
                           public void handle(ActionEvent var1) {
                              FileChooser var2 = new FileChooser();
                              var2.setTitle(FCW.getInstance().getMessageForKey("micro.dialog.savetofile.fileselect"));
                              File var3 = var2.showSaveDialog(FCU.this.getSceneDelegate().getWindow());
                              if (var3 != null) {
                                 FileOutputStream var4 = null;

                                 try {
                                    var4 = new FileOutputStream(var3);
                                    String var5 = ",";
                                    long var6 = 0L;
                                    Iterator var8 = var14.getThrowables().iterator();

                                    while(var8.hasNext()) {
                                       Throwable var9 = (Throwable)var8.next();
                                       StringBuilder var10 = new StringBuilder();
                                       var10.append("V").append(var5).append(String.valueOf(var6++)).append(var5).append(var9.getLocalizedMessage()).append(System.lineSeparator());
                                       var4.write(var10.toString().getBytes(StandardCharsets.UTF_8));
                                       var4.flush();
                                    }

                                    var4.close();
                                    FCR.IGF(FCW.getInstance().getMessageForKey("micro.dialog.message.title"), FCW.getInstance().getMessageForKey("micro.tableview.errorlist"), FCW.getInstance().getMessageForKey("micro.dialog.dialog.success"), false, 200.0, 200.0);
                                 } catch (IOException var19) {
                                    EXF.getInstance().ICA((Throwable)var19);
                                    FCR.IGP(FCW.getInstance().getMessageForKey("micro.dialog.error.title"), (Throwable)var19, false);
                                 } finally {
                                    if (var4 != null) {
                                       try {
                                          var4.close();
                                       } catch (IOException var18) {
                                          EXF.getInstance().ICA((Throwable)var18);
                                       }
                                    }

                                 }
                              }

                           }
                        });
                        var16.getItems().addAll(new MenuItem[]{var17, var21});
                        this.setContextMenuDelegate(var16);
                     }
                  } else if (var1 instanceof FFL) {
                     final FFL var15 = (FFL)var1;
                     if (var15 != null) {
                        this.setTextDelegate(FCW.getInstance().getMessageForKey("micro.tableview.exception.list"));
                        var16 = new ContextMenu();
                        var17 = new MenuItem(FCW.getInstance().getMessageForKey("micro.tableview.showexceptions"));
                        var17.setOnAction(new EventHandler<ActionEvent>() {
                           public void handle(ActionEvent var1) {
                              FileInputStream var2 = null;
                              InputStreamReader var3 = null;
                              BufferedReader var4 = null;

                              try {
                                 int var5 = 0;
                                 StringBuilder var6 = new StringBuilder();
                                 var6.append(var15.getHeader());
                                 var6.append(System.lineSeparator());
                                 var2 = new FileInputStream(var15.getFile());
                                 var3 = new InputStreamReader(var2, StandardCharsets.UTF_8);
                                 var4 = new BufferedReader(var3);
                                 String var7 = null;

                                 while((var7 = var4.readLine()) != null) {
                                    ++var5;
                                    var6.append(var7);
                                    var6.append(System.lineSeparator());
                                    if (var5 > 20) {
                                       break;
                                    }
                                 }

                                 if (var15.getCounter() > 20) {
                                    var6.append(FCW.getInstance().getMessageForKey("micro.dialog.dialog.someelementsnotdisplayed").replaceFirst("##NUMOFELEMENTS##", String.valueOf(var15.getCounter() - 20)));
                                    var6.append(System.lineSeparator());
                                 }

                                 FCR.IGE(FCW.getInstance().getMessageForKey("micro.dialog.message.title"), FCW.getInstance().getMessageForKey("micro.tableview.exception.list"), var6.toString(), false);
                              } catch (IOException var24) {
                                 EXF.getInstance().ICA((Throwable)var24);
                              } finally {
                                 if (var4 != null) {
                                    try {
                                       var4.close();
                                    } catch (IOException var23) {
                                       EXF.getInstance().ICA((Throwable)var23);
                                    }
                                 }

                                 if (var3 != null) {
                                    try {
                                       var3.close();
                                    } catch (IOException var22) {
                                       EXF.getInstance().ICA((Throwable)var22);
                                    }
                                 }

                                 if (var2 != null) {
                                    try {
                                       var2.close();
                                    } catch (IOException var21) {
                                       EXF.getInstance().ICA((Throwable)var21);
                                    }
                                 }

                              }

                           }
                        });
                        var21 = new MenuItem(FCW.getInstance().getMessageForKey("micro.dialog.savetofile"));
                        var21.setOnAction(new EventHandler<ActionEvent>() {
                           public void handle(ActionEvent var1) {
                              FileChooser var2 = new FileChooser();
                              var2.setTitle(FCW.getInstance().getMessageForKey("micro.dialog.savetofile.fileselect"));
                              File var3 = var2.showSaveDialog(FCU.this.getSceneDelegate().getWindow());
                              if (var3 != null) {
                                 FileOutputStream var4 = null;
                                 FileInputStream var5 = null;
                                 InputStreamReader var6 = null;
                                 BufferedReader var7 = null;

                                 try {
                                    var4 = new FileOutputStream(var3);
                                    String var8 = var15.getHeader() + System.lineSeparator();
                                    var4.write(var8.getBytes(StandardCharsets.UTF_8));
                                    var4.flush();
                                    var5 = new FileInputStream(var15.getFile());
                                    var6 = new InputStreamReader(var5, StandardCharsets.UTF_8);
                                    var7 = new BufferedReader(var6);
                                    String var9 = null;

                                    while((var9 = var7.readLine()) != null) {
                                       String var10 = var9 + System.lineSeparator();
                                       var4.write(var10.getBytes(StandardCharsets.UTF_8));
                                       var4.flush();
                                    }

                                    FCR.IGF(FCW.getInstance().getMessageForKey("micro.dialog.message.title"), FCW.getInstance().getMessageForKey("micro.tableview.errorlist"), FCW.getInstance().getMessageForKey("micro.dialog.dialog.success"), false, 200.0, 200.0);
                                 } catch (IOException var31) {
                                    EXF.getInstance().ICA((Throwable)var31);
                                    FCR.IGP(FCW.getInstance().getMessageForKey("micro.dialog.error.title"), (Throwable)var31, false);
                                 } finally {
                                    if (var7 != null) {
                                       try {
                                          var7.close();
                                       } catch (IOException var30) {
                                          EXF.getInstance().ICA((Throwable)var30);
                                       }
                                    }

                                    if (var6 != null) {
                                       try {
                                          var6.close();
                                       } catch (IOException var29) {
                                          EXF.getInstance().ICA((Throwable)var29);
                                       }
                                    }

                                    if (var5 != null) {
                                       try {
                                          var5.close();
                                       } catch (IOException var28) {
                                          EXF.getInstance().ICA((Throwable)var28);
                                       }
                                    }

                                    if (var4 != null) {
                                       try {
                                          var4.close();
                                       } catch (IOException var27) {
                                          EXF.getInstance().ICA((Throwable)var27);
                                       }
                                    }

                                 }
                              }

                           }
                        });
                        var16.getItems().addAll(new MenuItem[]{var17, var21});
                        this.setContextMenuDelegate(var16);
                     }
                  } else if (var1 instanceof X509Certificate) {
                     final X509Certificate var18 = (X509Certificate)var1;
                     if (var18 != null) {
                        this.setTextDelegate(var18.getSubjectDN().getName());
                        var16 = new ContextMenu();
                        var17 = new MenuItem(FCW.getInstance().getMessageForKey("micro.tableview.showcert"));
                        var17.setOnAction(new EventHandler<ActionEvent>() {
                           public void handle(ActionEvent var1) {
                              FCR.IGE(FCW.getInstance().getMessageForKey("micro.dialog.message.title"), var18.getSubjectDN().getName(), var18.toString(), true);
                           }
                        });
                        var16.getItems().addAll(new MenuItem[]{var17});
                        this.setContextMenuDelegate(var16);
                     }
                  } else if (var1 instanceof Date) {
                     Date var19 = (Date)var1;
                     if (var19 != null) {
                        SimpleDateFormat var22 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
                        this.setTextDelegate(var22.format(var19));
                     }
                  } else if (var1 instanceof String) {
                     final String var20 = (String)var1;
                     if (var20 != null && var20.length() > 0) {
                        this.setTextDelegate(var20);
                        this.setTooltipDelegate(new Tooltip(var20));
                        var16 = new ContextMenu();
                        var17 = new MenuItem(FCW.getInstance().getMessageForKey("micro.tableview.showtext"));
                        var17.setOnAction(new EventHandler<ActionEvent>() {
                           public void handle(ActionEvent var1) {
                              FCR.IGE(FCW.getInstance().getMessageForKey("micro.dialog.message.title"), "", var20, true);
                           }
                        });
                        var16.getItems().add(var17);
                        this.setContextMenuDelegate(var16);
                     }
                  } else if (var1 == null) {
                     this.setBackgroundDelegate(new Background(new BackgroundFill[]{new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY)}));
                     this.setTextDelegate(FCW.getInstance().getMessageForKey("micro.tableview.notavailable"));
                  } else {
                     this.setTextDelegate(String.valueOf(var1));
                  }
               }
            }
         }

      }
   }
}
