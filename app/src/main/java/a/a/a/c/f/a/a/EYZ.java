package a.a.a.c.f.a.a;

import a.a.a.c.f.a.EXZ;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.ComboBoxRequired;
import a.a.a.c.f.c.c.a.UnaryOperator_Text;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.skin.ComboBoxListViewSkin;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;

public class EYZ extends EXZ<String, RequiredGridPane, ComboBoxRequired<String>> {
    private Stage QVM;
    private final IntegerProperty GWD;
    private EZA GWE;
    private EZB GWF;

    public void setDialogStage(Stage var1) {
        this.QVM = var1;
    }

    public EYZ() {
        this(null);
    }

    public EYZ(String var1) {
        super(var1);
        this.GWD = new SimpleIntegerProperty(this, "valueMaxLength", 2147483647);
    }

    public final Integer getValueMaxLength() {
        return this.GWD.getValue();
    }

    public final void setValueMaxLength(Integer var1) {
        this.GWD.setValue(var1);
    }

    public final IntegerProperty valueMaxLengthProperty() {
        return this.GWD;
    }

    public void initialize() {
        super.initialize();
        this.fxml_component_label_element.textProperty().bind(this.fxml_component_root_element.labelProperty());
        this.fxml_component_main_element.editableProperty().set(true);
        final Tooltip var1 = new Tooltip();
        var1.textProperty().bind(this.fxml_component_main_element.getEditor().textProperty());
        var1.setWrapText(true);
        var1.setMaxWidth(200.0);
        this.fxml_component_main_element.getEditor().textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> var1x, String var2, String var3) {
                if (var3 != null && var3.length() > 30) {
                    var1.show(EYZ.this.QVM);
                } else {
                    var1.hide();
                }

            }
        });
        this.fxml_component_main_element.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent var1x) {
                if (EYZ.this.fxml_component_main_element.getEditor().getText().length() > 30) {
                    var1.show(EYZ.this.QVM);
                }

            }
        });
        this.fxml_component_main_element.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent var1x) {
                var1.hide();
            }
        });
        this.fxml_component_main_element.getEditor().setTextFormatter(new TextFormatter(new UnaryOperator_Text(this.fxml_component_main_element.getEditor(), this.GWD)));
        this.fxml_component_main_element.getEditor().focusedProperty().addListener(new ChangeListener<Boolean>() {
            public void changed(ObservableValue<? extends Boolean> var1x, Boolean var2, Boolean var3) {
                if (!var3) {
                    String var4 = EYZ.this.fxml_component_main_element.getEditor().getText();
                    if (var4 != null) {
                        String var5 = var4.trim();
                        if (var5.length() > 0) {
                            EYZ.this.fxml_component_main_element.getEditor().setText(var5);
                        } else {
                            EYZ.this.fxml_component_main_element.getEditor().setText(null);
                        }
                    }

                    var1.hide();
                }

            }
        });
        this.fxml_component_main_element.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
            public ListCell<String> call(ListView<String> var1) {
                return new ListCell<String>() {
                    private HBox generateView() {
                        Text var1 = new Text();
                        var1.setText(this.getItem());
                        Button var2 = new Button();
                        var2.getStyleClass().add("btn-delete");
                        Image var3 = new Image(this.getClass().getResourceAsStream("/images/if_Close_Icon_1398919.png"));
                        var2.setGraphic(new ImageView(var3));
                        var2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent var1) {
                                String var2 = getItem();
                                if (isSelected()) {
                                    ((ComboBoxRequired) EYZ.this.fxml_component_main_element).getSelectionModel().select(null);
                                }

                                ((ComboBoxRequired) EYZ.this.fxml_component_main_element).getItems().remove(var2);
                                if (EYZ.this.GWE != null) {
                                    EYZ.this.GWE.IFS(var2);
                                }

                            }
                        });
                        HBox var4 = new HBox(var1);
                        var4.setAlignment(Pos.CENTER_LEFT);
                        HBox var5 = new HBox(var4, var2);
                        var5.setAlignment(Pos.CENTER_RIGHT);
                        HBox.setHgrow(var4, Priority.ALWAYS);
                        this.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
                        return var5;
                    }

                    protected void updateItem(String var1, boolean var2) {
                        super.updateItem(var1, var2);
                        if (var2) {
                            this.setGraphic(null);
                        } else {
                            this.setGraphic(this.generateView());
                        }

                    }
                };
            }
        });
        ((ComboBoxRequired) this.fxml_component_main_element).valueProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
                EYZ.this.fxml_component_main_element.hide();
                if (EYZ.this.GWF != null) {
                    EYZ.this.GWF.IFT(var3);
                }

            }
        });
        this.fxml_component_main_element.setSkin(new ComboBoxListViewSkin<String>(this.fxml_component_main_element) {
            private boolean isHideOnClickEnabled() {
                return false;
            }
        });
    }

    public void setDeleteListener(EZA var1) {
        this.GWE = var1;
    }

    public void setChangeListener(EZB var1) {
        this.GWF = var1;
    }

    public interface EZB {
        void IFT(String var1);
    }

    public interface EZA {
        void IFS(String var1);
    }
}
