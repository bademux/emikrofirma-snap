package a.a.a.c.c.e.n.a;

import a.a.a.c.c.b.a.BaseFxController;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.f.c.c.HyperlinkBox;
import com.github.bademux.emk.app.FXApp;
import com.github.bademux.emk.utils.ReportUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextArea;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static java.nio.charset.StandardCharsets.UTF_8;

@Slf4j
public class QTF extends BaseFxController {
    @FXML
    private HyperlinkBox fxml_youtube_start_instruction;
    @FXML
    private HyperlinkBox fxml_youtube_createInvoice_instruction;
    @FXML
    private HyperlinkBox fxml_youtube_editInvoice_instruction;
    @FXML
    private HyperlinkBox fxml_youtube_purchaseInvoice_instruction;
    @FXML
    private HyperlinkBox fxml_youtube_setllementAndInvoiceRecord_instruction;
    @FXML
    private HyperlinkBox fxml_youtube_generateAndSendJPK_instruction;
    @FXML
    private Hyperlink fxml_manual_instruction;
    @FXML
    private Hyperlink fxml_QA_instruction;
    @FXML
    private TextArea fxml_Label_about;
    @FXML
    private TextArea fxml_history;
    private final String RAH = "/history/versionHistory.txt";
    String RAI = null;

    public QTF(FXApp var1, String var2) {
        super(var1, var2);
    }

    public void initialize() {
        this.fxml_Label_about.setText(createInfo());
        this.fxml_Label_about.setEditable(false);
        this.fxml_history.setEditable(false);
        this.fxml_history.setText(getVersionHistory());
    }

    private static String createInfo() {

        try {
            return new StringBuilder().append("System operacyjny: ").append(System.getProperty("os.name")).append(System.lineSeparator())
                    .append("Archtektura: ").append(System.getProperty("os.arch")).append(System.lineSeparator())
                    .append("Wersja oprogramowania Java: ").append(System.getProperty("java.version")).append(System.lineSeparator())
                    .append("Nazwa producenta: ").append(System.getProperty("java.vendor")).append(System.lineSeparator())
                    .append("Środowisko uruchomieniowe Java: ").append(System.getProperty("java.vm.name")).append(System.lineSeparator())
                    .append("Kodowanie plików: ").append(System.getProperty("file.encoding")).append(System.lineSeparator())
                    .append(System.lineSeparator())
                    .append(ReportUtils.createMemoryUsage())
                    .toString();
        } catch (Exception e) {
            log.error("Something bad happened", e);
            return e.getMessage();
        }
    }

    private static String getVersionHistory() {
        try (var is = QTF.class.getResourceAsStream("/history/versionHistory.txt");) {
            return new String(is.readAllBytes(), UTF_8);
        } catch (IOException e) {
            log.error("Something bad happened", e);
            return e.getMessage();
        }
    }

    public boolean HHB() {
        return true;
    }

    public void HHC() {
    }

    @FXML
    protected void fxml_handleHyperlink(ActionEvent var1) {

        try {
            log.info("Hypelink clicked");
            if (var1.getSource() instanceof HyperlinkBox) {
                this.RAI = ((HyperlinkBox) var1.getSource()).getHref();
            } else if (var1.getSource() instanceof Hyperlink) {
                this.RAI = ((Hyperlink) var1.getSource()).getText();
            } else {
                this.RAI = null;
            }

            (new EVN() {
                public void HZI() {

                    try {
                        if (QTF.this.RAI != null) {
                            Desktop.getDesktop().browse(new URI(QTF.this.RAI));
                        }
                    } catch (IOException var6) {
                        log.error("Something bad happened", var6);
                    } catch (URISyntaxException var7) {
                        log.error("Something bad happened", var7);
                    }

                }
            }).start();
        } catch (Exception var6) {
            log.error("Something bad happened", var6);
        }

    }
}
