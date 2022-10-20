package a.a.a.c.c.b.a.a.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.a.EMI;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.b.LX;
import a.a.a.c.f.c.c.PasswordFieldRequired_8;
import a.a.a.c.g.b.FCW;
import a.a.a.c.g.c.FCZ;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

import java.util.Comparator;

public class EMM extends EMI {
    public static final String FHU = "login.fxml";
    @FXML
    private ComboBox<String> fxml_userName;
    @FXML
    private PasswordFieldRequired_8 fxml_passwordField;
    @FXML
    private Text fxml_loginText;
    @FXML
    private Button fxml_button_login;
    @FXML
    private Button fxml_button_register;
    private final BooleanProperty FHV = new SimpleBooleanProperty(this, "usePassword", true);
    private final BooleanProperty QNQ = new SimpleBooleanProperty(this, "canRegister", true);
    private boolean FHW = false;
    private String RHG = null;

    public EMM(EMC var1, String var2) {
        super(var1, var2);
    }

    public String getTitle() {
        return this.resources.getString("micro.login.title");
    }

    public boolean HHF() {
        return false;
    }

    @FXML
    protected void fxml_handleButton_login(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICE("Button [login] clicked");
            this.fxml_loginText.setText("");
            if (!EMB.getInstance().HHR(this.fxml_userName.getValue(), this.fxml_passwordField.getText())) {
                throw FCZ.getInstance().IHA();
            }

            this.RHG = this.fxml_userName.getValue();
            this.getApplication().HJD(this.getFxmlName(), "main.fxml");
        } catch (FFO | FFK var6) {
            EXF.getInstance().ICA(var6);
            this.fxml_loginText.setText(var6.getLocalizedMessage());
        } finally {
            EXF.getInstance().ICP();
        }

    }

    @FXML
    protected void fxml_handleButton_register(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICE("Button [register] clicked");
            this.getApplication().HJD(this.getFxmlName(), "register.fxml");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    @FXML
    protected void fxml_handleComboBox_action(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICE("ComboBox [userName] changed");
            String var2 = this.fxml_userName.getValue();
            if (var2 == null) {
                return;
            }

            LX var3 = EMB.getInstance().getSimpleUserDataForUserName(var2);
            this.FHV.set(var3.DFB().getValue());
        } catch (FFK var7) {
            EXF.getInstance().ICA(var7);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HHE() throws FFK {
        EXF.getInstance().ICO();

        try {
            super.HHE();
            this.fxml_passwordField.textProperty().addListener(new ChangeListener<String>() {
                public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
                    if (EMM.this.FHV.get()) {
                        if (var3 != null && var3.length() > 0) {
                            if (!EMM.this.fxml_passwordField.validProperty().get()) {
                                EMM.this.fxml_loginText.setText(FCW.getInstance().getMessageForKey("micro.types.password.invalid").replaceFirst("##MIN_PASSWORD_LENGTH##", String.valueOf(8)));
                            } else {
                                EMM.this.fxml_loginText.setText("");
                            }
                        } else {
                            EMM.this.fxml_loginText.setText(FCW.getInstance().getMessageForKey("micro.types.password.empty"));
                        }
                    }

                }
            });
            this.fxml_passwordField.disableProperty().bind(this.FHV.not());
            this.fxml_button_login.disableProperty().bind(this.FHV.and(this.fxml_passwordField.validProperty()).or(this.FHV.not()).not());
            this.fxml_button_register.disableProperty().bind(this.QNQ.not());
            this.fxml_passwordField.setOnKeyPressed(new EventHandler<KeyEvent>() {
                public void handle(KeyEvent var1) {
                    if (KeyCode.ENTER.equals(var1.getCode())) {
                        EMM.this.fxml_handleButton_login(null);
                    }

                }
            });
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public boolean HHB() {
        EXF.getInstance().ICO();

        boolean var1;
        try {
            this.fxml_passwordField.clear();
            this.fxml_loginText.setText("");
            var1 = true;
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public void setLogout(boolean var1) {
        this.FHW = var1;
    }

    public void setLastLogin(String var1) {
        this.RHG = var1;
    }

    public void HHC() {
        EXF.getInstance().ICO();

        try {
            if (this.FHW) {
                this.FHW = false;
                EMB.getInstance().HHS();
            }

            this.fxml_userName.getItems().clear();
            ObservableList var1 = FXCollections.observableArrayList(EMB.getInstance().HHP());
            if (var1 == null) {
                this.getApplication().HJD(this.getFxmlName(), "register.fxml");
            } else {
                var1.sort(new Comparator<String>() {
                    public int compare(String var1, String var2) {
                        if (var1 != null && var2 != null) {
                            return var1.compareTo(var2);
                        } else if (var1 != null && var2 == null) {
                            return 1;
                        } else {
                            return var1 == null && var2 != null ? -1 : 0;
                        }
                    }
                });
                this.fxml_userName.setItems(var1);
                this.FHV.set(true);
            }

            if (EMB.getInstance().HHP().size() >= EMB.getInstance().getMaxAllowedNumberOfUsers()) {
                this.QNQ.set(false);
            }

            if (this.RHG != null && this.fxml_userName.getItems().contains(this.RHG)) {
                this.fxml_userName.getSelectionModel().select(this.RHG);
            } else {
                this.fxml_userName.getSelectionModel().selectFirst();
            }

            this.fxml_passwordField.clear();
            this.fxml_loginText.setText("");
            this.fxml_button_login.requestFocus();
        } catch (FFK var5) {
            EXF.getInstance().ICA(var5);
            throw new FFI(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
