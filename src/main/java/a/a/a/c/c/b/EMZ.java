package a.a.a.c.c.b;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.b.a.EMF;
import a.a.a.c.c.b.a.EMG;
import a.a.a.c.c.b.a.EMN;
import a.a.a.c.c.b.a.a.EMH;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.c.c.ENG;
import a.a.a.c.e.a.a.EVL;
import a.a.a.c.e.a.c.EVW;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.g.EWX;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.g.c.FCZ;
import com.github.bademux.emk.utils.LocaleUtils;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class EMZ extends Application implements EMC {
    private volatile boolean QNT = false;
    private volatile boolean QNU = false;
    private final ResourceBundle FJB;
    private final EMT FJC;
    private Stage FJD;
    private double FJE = -1.0;
    private double FJF = -1.0;
    private Map<String, EMG> FJG;
    private EWX FJI = null;
    private EMH FJJ;
    private final Screen FJK = Screen.getPrimary();

    public EMZ(EVW var1) {
        EXF.getInstance().ICO();

        try {
            this.FJB = ResourceBundle.getBundle("messages/messages", LocaleUtils.LOCALE);
            this.FJC = new EMW();
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    EMY.getInstance().HMY();
                }
            });
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HNA(Stage var1, EWX var2) {
        EXF.getInstance().ICO();

        try {
            this.FJI = var2;
            EWX.IBJ(this.FJI, 0.0, 0L, 0L);
            this.start(var1);
            EWX.IBJ(this.FJI, 1.0, 0L, 0L);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void start(Stage var1) {
        EXF.getInstance().ICO();

        try {
            this.FJD = var1;
            EVL var2 = new EVL(false, null) {
                public void HZK() {
                    EXF.getInstance().ICO();

                    try {
                        Platform.runLater(new Runnable() {
                            public void run() {
                                EXF.getInstance().ICO();

                                try {
                                    if (EMB.getInstance().HHP().size() == 0) {
                                        EMZ.this.HNC("register.fxml", null);
                                    } else {
                                        EMZ.this.HNC("login.fxml", null);
                                    }

                                    EMZ.this.FJD.getIcons().add(new Image("/img/app/e_logo.png"));
                                    EMZ.this.FJD.widthProperty().addListener(new ChangeListener<Number>() {
                                        public void changed(ObservableValue<? extends Number> var1, Number var2, Number var3) {
                                            if (EMZ.this.FJJ != null) {
                                                if (EMZ.this.FJJ.HHF()) {
                                                    if (EMZ.this.FJE < 0.0) {
                                                        EMZ.this.FJE = EMZ.this.FJJ.getPrefWidth();
                                                    } else {
                                                        double var4 = var3.doubleValue();
                                                        double var6 = EMZ.this.FJK.getVisualBounds().getWidth();
                                                        if (var4 > var6) {
                                                            EMZ.this.FJE = var6;
                                                        } else {
                                                            EMZ.this.FJE = var4;
                                                        }
                                                    }
                                                } else {
                                                    EMZ.this.FJE = -1.0;
                                                }
                                            }

                                        }
                                    });
                                    EMZ.this.FJD.heightProperty().addListener(new ChangeListener<Number>() {
                                        public void changed(ObservableValue<? extends Number> var1, Number var2, Number var3) {
                                            if (EMZ.this.FJJ != null) {
                                                if (EMZ.this.FJJ.HHF()) {
                                                    if (EMZ.this.FJF < 0.0) {
                                                        EMZ.this.FJF = EMZ.this.FJJ.getPrefWidth();
                                                    } else {
                                                        double var4 = var3.doubleValue();
                                                        double var6 = EMZ.this.FJK.getVisualBounds().getHeight();
                                                        double var8 = 23.0;
                                                        if (var4 > var6 - var8) {
                                                            EMZ.this.FJF = var6 - var8;
                                                        } else {
                                                            EMZ.this.FJF = var4;
                                                        }
                                                    }
                                                } else {
                                                    EMZ.this.FJF = -1.0;
                                                }
                                            }

                                        }
                                    });
                                    EMZ.this.FJD.show();
                                    EMZ.this.QNT = true;
                                } catch (Exception var5) {
                                    EXF.getInstance().ICA(var5);
                                    EMZ.this.QNU = true;
                                    throw new RuntimeException(var5);
                                } finally {
                                    EXF.getInstance().ICP();
                                }

                            }
                        });
                    } finally {
                        EXF.getInstance().ICP();
                    }

                }
            };
            (new EVL(true, var2) {
                public void HZK() {
                    EXF.getInstance().ICO();

                    try {
                        EMZ.this.FJG = EMZ.this.HNB(EMZ.this.FJD);
                    } catch (Exception var5) {
                        EXF.getInstance().ICA(var5);
                        throw new FFI(var5);
                    } finally {
                        EXF.getInstance().ICP();
                    }

                }
            }).start();
        } catch (Exception var6) {
            EXF.getInstance().ICA(var6);
            throw new FFI(var6);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private Map<String, EMG> HNB(Stage var1) throws FFK {
        EXF.getInstance().ICO();

        HashMap var18;
        try {
            ArrayList var2 = new ArrayList<EVZ<String, String>>() {
                private static final long serialVersionUID = 1L;

                {
                    this.add(new EVZ("login.fxml", null));
                    this.add(new EVZ("register.fxml", null));
                    this.add(new EVZ("main.fxml", null));
                    Iterator var2 = ENG.getInstance().HNI().iterator();

                    while (var2.hasNext()) {
                        String var3 = (String) var2.next();
                        Map var4 = ENG.getInstance().getProcessDefinition(var3);
                        ELZ var5 = (ELZ) var4.get("definition");
                        String var6 = var5.getFXML();
                        EXF.getInstance().ICE("Adding dynamic process " + var6);
                        this.add(new EVZ(var6, var3));
                    }

                }
            };
            EWX.IBJ(this.FJI, 0.05, 0L, 0L);
            int var3 = 0;
            int var4 = var2.size();
            HashMap var5 = new HashMap();
            Iterator var6 = var2.iterator();

            while (var6.hasNext()) {
                EVZ var7 = (EVZ) var6.next();
                ++var3;
                double var8 = 0.05 + 0.9 * ((double) var3 / (double) var4);
                EWX.IBJ(this.FJI, var8, 0L, 0L);
                FXMLLoader var10 = new FXMLLoader(EMZ.class.getResource("/fxml/" + var7.getFirstValue()));
                var10.setControllerFactory(new EMF(this, var1, this.FJC, (String) var7.getSecondValue(), (String) var7.getFirstValue()));
                var10.setResources(this.FJB);
                var10.load();
                Object var11 = var10.getController();
                if (var11 instanceof EMG) {
                    EMH var12 = (EMH) var11;
                    var12.HHE();
                    var5.put(var7.getFirstValue(), var12);
                }
            }

            EWX.IBJ(this.FJI, 0.95, 0L, 0L);
            var18 = var5;
        } catch (IOException var16) {
            EXF.getInstance().ICA(var16);
            throw new FFK(var16);
        } finally {
            EXF.getInstance().ICP();
        }

        return var18;
    }

    public void stop() throws Exception {
        EXF.getInstance().ICO();

        try {
            super.stop();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void init() throws Exception {
        EXF.getInstance().ICO();

        try {
            super.init();
        } finally {
            EXF.getInstance().ICP();
        }

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
            EMH var4 = (EMH) this.FJG.get(var1);
            EMH var5 = (EMH) this.FJG.get(var2);
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
            EMH var3 = (EMH) this.FJG.get(var1);
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
            if (this.FJE <= 0.0) {
                this.FJE = var1.getPrefWidth();
            }

            if (this.FJF <= 0.0) {
                this.FJF = var1.getPrefHeight();
            }

            var1.setScene(new Scene(var1.getParent(), this.FJE, this.FJF));
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

    public boolean QQE() throws FFK {
        EXF.getInstance().ICO();

        boolean var1;
        try {
            if (this.FJJ == null) {
                throw FCZ.getInstance().IHF();
            }

            var1 = this.FJJ.HHB();
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public boolean QQF() {
        return this.QNT;
    }

    public boolean QQG() {
        return this.QNU;
    }
}
