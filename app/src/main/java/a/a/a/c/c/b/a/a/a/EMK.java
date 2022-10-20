package a.a.a.c.c.b.a.a.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.ENB;
import a.a.a.c.c.b.a.a.EMI;
import a.a.a.c.f.c.c.PasswordFieldRequired_8;
import a.a.a.c.f.c.c.TextFieldValidated_NIP;
import a.a.a.c.g.b.FCW;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class EMK extends EMI {
    public static final String FHF = "register.fxml";
    @FXML
    private TextFieldValidated_NIP fxml_registerTextFieldUserName;
    @FXML
    private CheckBox fxml_checkBoxUsePassword;
    @FXML
    private PasswordFieldRequired_8 fxml_registerPasswordFieldPassword;
    @FXML
    private PasswordFieldRequired_8 fxml_registerPasswordFieldRepeatedPassword;
    @FXML
    private Button fxml_registerButtonRegister;
    @FXML
    private Text fxml_registerText;
    @FXML
    private Text fxml_passwordWarning;
    private boolean FHG = false;
    private boolean FHH = false;
    private boolean FHI = true;

    public EMK(EMC var1, String var2) {
        super(var1, var2);
    }

    public String getTitle() {
        return this.resources.getString("micro.register.title");
    }

    public boolean HHF() {
        return false;
    }

    @FXML
    protected void fxml_handleButton_registerButtonRegister(ActionEvent var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [register] clicked");
            this.fxml_registerText.setText("");
            final String var2 = this.fxml_registerTextFieldUserName.getText().trim();
            if (EMB.getInstance().HHQ(var2, this.fxml_checkBoxUsePassword.isSelected(), this.fxml_registerPasswordFieldPassword.getText(), this.fxml_registerPasswordFieldRepeatedPassword.getText())) {
                this.getApplication().HJE(this.getFxmlName(), "login.fxml", new ENB<EMM>() {
                    public void HNE(EMM var1) {
                        if (var1 != null) {
                            var1.setLastLogin(var2);
                        }

                    }
                });
            }
        } catch (FFO | FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            this.fxml_registerText.setText(var6.getLocalizedMessage());
        }

    }

    public void HHE() throws FFK {

        super.HHE();
        this.fxml_registerTextFieldUserName.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
                EMK.this.FHG = var3 != null && var3.length() > 0 && !EMK.this.fxml_registerTextFieldUserName.IEU().get();

                String var4 = "";
                if (EMK.this.FHG) {
                    var4 = FCW.getInstance().getMessageForKey("micro.types.nip.invalid");
                }

                if (EMK.this.fxml_checkBoxUsePassword.isSelected() && (EMK.this.FHH || EMK.this.FHI)) {
                    if (EMK.this.FHG) {
                        var4 = var4 + " | ";
                    }

                    if (EMK.this.FHI) {
                        var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.empty");
                    } else if (EMK.this.FHH) {
                        var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.invalid").replaceFirst("##MIN_PASSWORD_LENGTH##", String.valueOf(8));
                    }
                }

                EMK.this.fxml_registerText.setText(var4);
            }
        });
        this.fxml_registerPasswordFieldPassword.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
                if (EMK.this.fxml_checkBoxUsePassword.isSelected()) {
                    if (var3 != null && var3.length() > 0) {
                        EMK.this.FHI = false;
                        EMK.this.FHH = !EMK.this.fxml_registerPasswordFieldPassword.validProperty().get();
                    } else {
                        EMK.this.FHI = true;
                        EMK.this.FHH = false;
                    }

                    String var4 = "";
                    if (EMK.this.FHG) {
                        var4 = FCW.getInstance().getMessageForKey("micro.types.nip.invalid");
                    }

                    if (!EMK.this.FHH && !EMK.this.FHI) {
                        if (!EMK.this.fxml_registerPasswordFieldRepeatedPassword.textProperty().isEmpty().get() && !var3.equals(EMK.this.fxml_registerPasswordFieldRepeatedPassword.getText())) {
                            if (EMK.this.FHG) {
                                var4 = var4 + " | ";
                            }

                            var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.differ");
                        }
                    } else {
                        if (EMK.this.FHG) {
                            var4 = var4 + " | ";
                        }

                        if (EMK.this.FHI) {
                            var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.empty");
                        } else if (EMK.this.FHH) {
                            var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.invalid").replaceFirst("##MIN_PASSWORD_LENGTH##", String.valueOf(8));
                        }
                    }

                    EMK.this.fxml_registerText.setText(var4);
                }

            }
        });
        this.fxml_registerPasswordFieldRepeatedPassword.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
                if (EMK.this.fxml_checkBoxUsePassword.isSelected() && EMK.this.fxml_registerPasswordFieldPassword.validProperty().get()) {
                    String var4 = "";
                    if (EMK.this.FHG) {
                        var4 = FCW.getInstance().getMessageForKey("micro.types.nip.invalid");
                    }

                    if (!EMK.this.fxml_registerPasswordFieldPassword.getText().equals(var3)) {
                        if (EMK.this.FHG) {
                            var4 = var4 + " | ";
                        }

                        var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.differ");
                    }

                    EMK.this.fxml_registerText.setText(var4);
                }

            }
        });
        this.fxml_checkBoxUsePassword.selectedProperty().addListener(new ChangeListener<Boolean>() {
            public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
                String var4 = "";
                if (EMK.this.FHG) {
                    var4 = FCW.getInstance().getMessageForKey("micro.types.nip.invalid");
                }

                if (var3 && (EMK.this.FHH || EMK.this.FHI)) {
                    if (EMK.this.FHG) {
                        var4 = var4 + " | ";
                    }

                    if (EMK.this.FHI) {
                        var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.empty");
                    } else if (EMK.this.FHH) {
                        var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.invalid").replaceFirst("##MIN_PASSWORD_LENGTH##", String.valueOf(8));
                    }
                }

                EMK.this.fxml_registerText.setText(var4);
            }
        });
        this.fxml_registerPasswordFieldPassword.disableProperty().bind(this.fxml_checkBoxUsePassword.selectedProperty().not());
        this.fxml_registerPasswordFieldRepeatedPassword.disableProperty().bind(this.fxml_registerPasswordFieldPassword.disableProperty());
        this.fxml_registerButtonRegister.disableProperty().bind(this.fxml_registerTextFieldUserName.IEU().and(this.fxml_checkBoxUsePassword.selectedProperty().and(this.fxml_registerPasswordFieldPassword.validProperty().and(this.fxml_registerPasswordFieldRepeatedPassword.validProperty())).or(this.fxml_checkBoxUsePassword.selectedProperty().not())).not());
        this.fxml_registerPasswordFieldRepeatedPassword.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent var1) {
                if (KeyCode.ENTER.equals(var1.getCode())) {
                    EMK.this.fxml_handleButton_registerButtonRegister(null);
                }

            }
        });
        this.fxml_passwordWarning.visibleProperty().bind(this.fxml_checkBoxUsePassword.selectedProperty());

    }

    public boolean HHB() {

        boolean var1;
        this.fxml_registerTextFieldUserName.clear();
        this.fxml_registerPasswordFieldPassword.clear();
        this.fxml_registerPasswordFieldRepeatedPassword.clear();
        this.fxml_registerText.setText("");
        this.fxml_registerTextFieldUserName.requestFocus();
        var1 = true;

        return var1;
    }

    public void HHC() {

        this.fxml_registerTextFieldUserName.clear();
        this.fxml_registerPasswordFieldPassword.clear();
        this.fxml_registerPasswordFieldRepeatedPassword.clear();
        this.fxml_registerText.setText("");

    }
}
