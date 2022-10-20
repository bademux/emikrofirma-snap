package a.a.a.c.c.e.n.a;

import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.EMD;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.f.c.c.HyperlinkBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextArea;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class QTF extends EMD {
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

    public QTF(EMC var1, String var2) {
        super(var1, var2);
    }

    public void initialize() {

        StringBuilder var1 = new StringBuilder();

        try {
            var1.append("System operacyjny: ").append(System.getProperty("os.name")).append(System.lineSeparator())
                    .append("Archtektura: ").append(System.getProperty("os.arch")).append(System.lineSeparator())
                    .append("Wersja oprogramowania Java: ").append(System.getProperty("java.version")).append(System.lineSeparator())
                    .append("Nazwa producenta: ").append(System.getProperty("java.vendor")).append(System.lineSeparator())
                    .append("Środowisko uruchomieniowe Java: ").append(System.getProperty("java.vm.name")).append(System.lineSeparator())
                    .append("Kodowanie plików: ").append(System.getProperty("file.encoding")).append(System.lineSeparator())
                    .append(System.lineSeparator());
        } catch (Exception var10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
        }

        var1.append("Moduł uruchomieniowy: ").append(this.getClass().getPackage().getImplementationVersion()).append(System.lineSeparator());

        this.fxml_Label_about.setText(var1.toString());
        this.fxml_Label_about.setEditable(false);
        this.fxml_history.setEditable(false);
        this.fxml_history.setText(this.RKO());
    }

    private String RKO() {

        StringBuilder var1 = new StringBuilder();

        try {
            InputStream var2 = QTF.class.getResourceAsStream("/history/versionHistory.txt");
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2, StandardCharsets.UTF_8));
            String var4;

            while ((var4 = var3.readLine()) != null) {
                var1.append(var4).append("\n");
            }
        } catch (IOException var5) {
            var5.printStackTrace();
        }

        return var1.toString();
    }

    public boolean HHB() {

        boolean var1;
        var1 = true;

        return var1;
    }

    public void HHC() {

    }

    @FXML
    protected void fxml_handleHyperlink(ActionEvent var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Hypelink clicked");
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
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
                    } catch (URISyntaxException var7) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
                    }

                }
            }).start();
        } catch (Exception var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
        }

    }
}
