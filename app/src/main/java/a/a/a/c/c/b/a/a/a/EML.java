package a.a.a.c.c.b.a.a.a;

import a.a.a.b.f.FFK;
import a.a.a.c.c.b.EMB;
import a.a.a.c.f.c.c.PasswordFieldRequired_8;
import a.a.a.c.g.MSX;
import a.a.a.c.g.MTI;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.b.FCW;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

import java.util.ResourceBundle;

@Slf4j
public class EML {
    public static final String FHJ = "changePassword.fxml";
    private boolean FHK;
    @FXML
    private AnchorPane fxml_parent;
    @FXML
    private PasswordFieldRequired_8 fxml_oldPasswordFieldPassword;
    @FXML
    private PasswordFieldRequired_8 fxml_newPasswordFieldPassword;
    @FXML
    private PasswordFieldRequired_8 fxml_newPasswordFieldRepeatedPassword;
    @FXML
    private Button fxml_changePaswordButton;
    @FXML
    private Text fxml_errorMessageText;
    @FXML
    private Text fxml_passwordWarning;
    @FXML
    private Label fxml_oldPasswordLabel;
    @FXML
    private RowConstraints fxml_old_password_row;
    private int MWD = -1;
    private boolean FHL = false;
    private boolean FHM = false;
    private boolean FHN = true;
    private final SimpleBooleanProperty FHO = new SimpleBooleanProperty(true);
    private final SimpleBooleanProperty FHP = new SimpleBooleanProperty(true);
    private final SimpleBooleanProperty FHQ = new SimpleBooleanProperty(true);
    private Stage FHR;
    private ResourceBundle FHS;
    public boolean FHT = false;

    public EML() {
    }

    @FXML
    protected void fxml_handleButton_changePasswordButton(ActionEvent var1) {

        try {
            log.info("Button [changePassword] clicked");
            this.FHQ.setValue(false);
            final MTI var2 = new MTI(null);
            MSX var3 = new MSX(this.FHR, this.fxml_parent.disableProperty()) {
                public void MXI() {
                    try {
                        EML.this.MWD = EMB.getInstance().HJB(EML.this.fxml_oldPasswordFieldPassword.getText(), EML.this.fxml_newPasswordFieldPassword.getText());
                    } catch (FFK var2x) {
                        log.error("Something bad happened", var2x);
                        var2.setObject(var2x);
                    } catch (Exception var3) {
                        log.error("Something bad happened", var3);
                        var2.setObject(var3);
                    }

                }

                @Override
                public void MXJ() {
                    try {
                        if (var2.getObject() == null) {
                            switch (EML.this.MWD) {
                                case 0:
                                    EML.this.FHT = true;
                                    EML.this.FHR.close();
                                    break;
                                case 1:
                                    EML.this.fxml_errorMessageText.setText(EML.this.FHS.getString("micro.changePassword.wrongPassword"));
                                    break;
                                default:
                                    EML.this.fxml_errorMessageText.setText(EML.this.FHS.getString("micro.changePassword.applicationException"));
                            }

                            EML.this.FHQ.setValue(true);
                        } else {
                            log.error("Something bad happened", (Throwable) var2.getObject());
                        }
                    } catch (Exception e) {
                        log.error("Something bad happened", e);
                    }

                }
            };
            var3.MXH();
        } catch (FFK e) {
            log.error("Something bad happened", e);
            FCT.IGX(this.FHS.getString("micro.changePassword.applicationException"), e);
        }

    }

    public void setDialogStage(Stage var1) {
        this.FHR = var1;
    }

    public Stage getDialogStage() {
        return this.FHR;
    }

    public void setDefault() {

        this.fxml_oldPasswordFieldPassword.clear();
        this.fxml_newPasswordFieldPassword.clear();
        this.fxml_newPasswordFieldRepeatedPassword.clear();
        this.fxml_errorMessageText.setText("");

    }

    public void setResources(ResourceBundle var1) {
        this.FHS = var1;
        if (!this.FHK) {
            this.fxml_changePaswordButton.setText(this.FHS.getString("micro.changePassword.addPassword.title"));
        }

    }

    @FXML
    public void initialize() {

        try {
            if (!(Boolean) EMB.getInstance().getCurrentUser().getUsePassword().getValue()) {
                this.fxml_oldPasswordFieldPassword.setManaged(false);
                this.fxml_oldPasswordLabel.setManaged(false);
                this.fxml_old_password_row.setMaxHeight(0.0);
                this.fxml_old_password_row.setMinHeight(0.0);
                this.fxml_old_password_row.setPrefHeight(0.0);
                this.FHK = false;
            } else {
                this.FHK = true;
            }

            this.fxml_oldPasswordFieldPassword.textProperty().addListener(new ChangeListener<String>() {
                public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
                    EML.this.FHL = var3 != null && var3.length() > 0 && !EML.this.fxml_oldPasswordFieldPassword.validProperty().get();

                    String var4 = "";
                    if (EML.this.FHL) {
                        var4 = FCW.getInstance().getMessageForKey("micro.types.old.password.invalid").replaceFirst("##MIN_PASSWORD_LENGTH##", String.valueOf(8));
                    }

                    if (EML.this.FHM || EML.this.FHN) {
                        if (EML.this.FHL) {
                            var4 = var4 + " \n";
                        }

                        if (EML.this.FHN) {
                            var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.empty");
                        } else if (EML.this.FHM) {
                            var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.invalid").replaceFirst("##MIN_PASSWORD_LENGTH##", String.valueOf(8));
                        }
                    }

                    if (!EML.this.fxml_newPasswordFieldPassword.getText().equals(EML.this.fxml_newPasswordFieldRepeatedPassword.getText())) {
                        if (var4.length() > 0) {
                            var4 = var4 + " \n";
                        }

                        EML.this.FHO.set(false);
                        var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.differ.change");
                    } else {
                        EML.this.FHO.set(true);
                    }

                    if (var3 != null && var3.equals(EML.this.fxml_newPasswordFieldPassword.getText())) {
                        if (var4.length() > 0) {
                            var4 = var4 + " \n";
                        }

                        var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.old.new.password.not.differ");
                        EML.this.FHP.setValue(false);
                    } else {
                        EML.this.FHP.setValue(true);
                    }

                    EML.this.fxml_errorMessageText.setText(var4);
                }
            });
            this.fxml_newPasswordFieldPassword.textProperty().addListener(new ChangeListener<String>() {
                public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
                    if (var3 != null && var3.length() > 0) {
                        EML.this.FHN = false;
                        EML.this.FHM = !EML.this.fxml_newPasswordFieldPassword.validProperty().get();
                    } else {
                        EML.this.FHN = true;
                        EML.this.FHM = false;
                    }

                    String var4 = "";
                    if (EML.this.FHL) {
                        var4 = FCW.getInstance().getMessageForKey("micro.types.old.password.invalid").replaceFirst("##MIN_PASSWORD_LENGTH##", String.valueOf(8));
                    }

                    if (!EML.this.FHM && !EML.this.FHN) {
                        if (!EML.this.fxml_newPasswordFieldRepeatedPassword.textProperty().isEmpty().get() && !var3.equals(EML.this.fxml_newPasswordFieldRepeatedPassword.getText())) {
                            if (var4.length() > 0) {
                                var4 = var4 + " \n";
                            }

                            EML.this.FHO.set(false);
                            var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.differ.change");
                        } else {
                            EML.this.FHO.set(true);
                        }
                    } else {
                        if (EML.this.FHL) {
                            var4 = var4 + " \n";
                        }

                        if (EML.this.FHN) {
                            var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.empty");
                        } else if (EML.this.FHM) {
                            var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.invalid").replaceFirst("##MIN_PASSWORD_LENGTH##", String.valueOf(8));
                        }
                    }

                    if (var3 != null && var3.equals(EML.this.fxml_oldPasswordFieldPassword.getText())) {
                        if (var4.length() > 0) {
                            var4 = var4 + " \n";
                        }

                        var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.old.new.password.not.differ");
                        EML.this.FHP.setValue(false);
                    } else {
                        EML.this.FHP.setValue(true);
                    }

                    EML.this.fxml_errorMessageText.setText(var4);
                }
            });
            this.fxml_newPasswordFieldRepeatedPassword.textProperty().addListener(new ChangeListener<String>() {
                public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
                    if (EML.this.fxml_newPasswordFieldPassword.validProperty().get()) {
                        String var4 = "";
                        if (EML.this.FHL) {
                            var4 = FCW.getInstance().getMessageForKey("micro.types.old.password.invalid").replaceFirst("##MIN_PASSWORD_LENGTH##", String.valueOf(8));
                        }

                        if (!EML.this.fxml_newPasswordFieldPassword.getText().equals(var3)) {
                            if (var4.length() > 0) {
                                var4 = var4 + " \n";
                            }

                            var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.password.differ.change");
                            EML.this.FHO.set(false);
                        } else {
                            EML.this.FHO.set(true);
                        }

                        if (EML.this.fxml_newPasswordFieldPassword.getText().equals(EML.this.fxml_oldPasswordFieldPassword.getText())) {
                            if (var4.length() > 0) {
                                var4 = var4 + " \n";
                            }

                            var4 = var4 + FCW.getInstance().getMessageForKey("micro.types.old.new.password.not.differ");
                            EML.this.FHP.setValue(false);
                        } else {
                            EML.this.FHP.setValue(true);
                        }

                        EML.this.fxml_errorMessageText.setText(var4);
                        EML.this.fxml_errorMessageText.setText(var4);
                    }

                }
            });
            this.fxml_newPasswordFieldRepeatedPassword.disableProperty().bind(this.fxml_newPasswordFieldPassword.disableProperty());
            if (this.FHK) {
                this.fxml_changePaswordButton.disableProperty().bind(this.fxml_newPasswordFieldRepeatedPassword.validProperty().and(this.fxml_newPasswordFieldPassword.validProperty().and(this.FHO.and(this.FHP.and(this.fxml_oldPasswordFieldPassword.validProperty().and(this.FHQ))))).not());
            } else {
                this.fxml_changePaswordButton.disableProperty().bind(this.fxml_newPasswordFieldRepeatedPassword.validProperty().and(this.fxml_newPasswordFieldPassword.validProperty().and(this.FHO.and(this.FHP.and(this.FHQ)))).not());
            }

            this.fxml_newPasswordFieldRepeatedPassword.setOnKeyPressed(new EventHandler<KeyEvent>() {
                public void handle(KeyEvent var1) {
                    if (KeyCode.ENTER.equals(var1.getCode())) {
                        EML.this.fxml_handleButton_changePasswordButton(null);
                    }

                }
            });
        } catch (FFK var5) {
            log.error("Something bad happened", var5);
        }

    }
}
