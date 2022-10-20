package a.a.a.c.f.a.a;

import a.a.a.c.f.a.EXX;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.ImageViewRequired;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class EYY extends EXX {
    @FXML
    public RequiredGridPane fxml_component_root_element;
    @FXML
    public Label fxml_component_label_element;
    @FXML
    public Label fxml_component_label_required_flag;
    @FXML
    public ImageViewRequired fxml_component_main_element;
    @FXML
    public Button fxml_field_box_required_button_open;
    @FXML
    public Button fxml_field_box_required_button_clear;
    @FXML
    public Text fxml_component_required_element;

    public EYY() {
        this(null);
    }

    public EYY(String var1) {
        super(var1);
    }

    @FXML
    protected void fxml_handleButton_open_button(ActionEvent var1) {

        FileChooser var2 = new FileChooser();
        var2.setTitle(this.resources.getString("micro.types.img.fileselect"));
        FileChooser.ExtensionFilter var3 = new FileChooser.ExtensionFilter(this.resources.getString("micro.types.img.filetype.image") + " (*.jpg, *.png)", "*.jpg", "*.png");
        FileChooser.ExtensionFilter var4 = new FileChooser.ExtensionFilter(this.resources.getString("micro.types.img.filetype.all"), "*.*");
        var2.getExtensionFilters().add(var3);
        var2.getExtensionFilters().add(var4);
        File var5 = var2.showOpenDialog(this.getStageToHandle());
        if (var5 != null) {
            Image var6 = null;

            try {
                boolean var7 = false;
                FileInputStream var8;
                if (this.fxml_component_root_element.maxLengthProperty() != null && this.fxml_component_root_element.maxLengthProperty().longValue() > 0L) {
                    var8 = new FileInputStream(var5);
                    int var9 = 1048576;
                    Long var11 = this.fxml_component_root_element.maxLengthProperty().longValue();

                    int var10;
                    for (byte[] var12 = new byte[var9]; (var10 = var8.read(var12)) != -1; var11 = var11 - (long) var10) {
                        if ((long) var10 > var11) {
                            var7 = true;
                            break;
                        }
                    }

                    var8.close();
                }

                if (var7) {
                    this.IES(this.resources.getString("micro.types.exception.title"), this.resources.getString("micro.types.img.exception.header"), this.resources.getString("micro.types.img.exception.size").replaceFirst("##MAX_SIZE##", this.fxml_component_root_element.maxLengthProperty().longValue() / 1024L + "KB"));
                } else {
                    var8 = new FileInputStream(var5);
                    Image var18 = new Image(var8);
                    BufferedImage var19 = SwingFXUtils.fromFXImage(var18, null);
                    ByteArrayOutputStream var20 = new ByteArrayOutputStream();
                    ImageIO.write(var19, "png", var20);
                    var6 = new Image(new ByteArrayInputStream(var20.toByteArray()));
                    var8.close();
                }
            } catch (IllegalArgumentException | IOException var16) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var16);
                this.IES(this.resources.getString("micro.types.exception.title"), this.resources.getString("micro.types.img.exception.header"), this.resources.getString("micro.types.img.exception.type").replaceFirst("##FILE_PATH##", var5.getAbsolutePath()));
            }

            if (var6 != null) {
                this.fxml_component_main_element.setImage(var6);
            }
        }

    }

    @FXML
    protected void fxml_handleButton_clear_button(ActionEvent var1) {

        this.fxml_component_main_element.setImage(null);

    }

    public void initialize() {
        this.fxml_component_label_element.textProperty().bind(this.fxml_component_root_element.labelProperty());
        this.fxml_component_main_element.requiredProperty().bind(this.fxml_component_root_element.requiredProperty());
        this.GVR.bind(this.fxml_component_main_element.validProperty());
        this.GVH.bind(this.fxml_component_main_element.changedProperty());
        this.GVM.bind(this.fxml_component_main_element.requiredProperty());
        this.GVN.bind(this.fxml_component_main_element.requiredAndValidProperty());
        this.fxml_component_required_element.managedProperty().bindBidirectional(this.fxml_component_required_element.visibleProperty());
        this.fxml_component_required_element.managedProperty().bind(this.fxml_component_main_element.changedProperty().and(this.fxml_component_main_element.requiredProperty().and(this.fxml_component_main_element.imageProperty().isNull())));
        if (this.fxml_component_label_required_flag != null) {
            this.fxml_component_label_required_flag.visibleProperty().bind(this.fxml_component_label_required_flag.managedProperty());
            this.fxml_component_label_required_flag.managedProperty().bind(this.GVM);
        }

    }

    public void clearChangedProperty() {
        this.fxml_component_main_element.changedProperty().set(false);
    }
}
