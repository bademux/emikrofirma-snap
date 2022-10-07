package a.a.a.c.c.e.n.a;

import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.EMD;
import a.a.a.c.e.a.EXO;
import a.a.a.c.e.a.EXQ;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.k.a.EXF;
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
        EXF.getInstance().ICO();

        try {
            StringBuilder var1 = new StringBuilder();

            try {
                var1.append("System operacyjny: " + System.getProperty("os.name")).append(System.lineSeparator());
                var1.append("Archtektura: " + System.getProperty("os.arch")).append(System.lineSeparator());
                var1.append("Wersja oprogramowania Java: " + System.getProperty("java.version")).append(System.lineSeparator());
                var1.append("Nazwa producenta: " + System.getProperty("java.vendor")).append(System.lineSeparator());
                var1.append("Środowisko uruchomieniowe Java: " + System.getProperty("java.vm.name")).append(System.lineSeparator());
                var1.append("Kodowanie plików: " + System.getProperty("file.encoding")).append(System.lineSeparator());
                var1.append(System.lineSeparator());
            } catch (Exception var10) {
                EXF.getInstance().ICA(var10);
            }

            var1.append("Moduł uruchomieniowy: " + this.getClass().getPackage().getImplementationVersion()).append(System.lineSeparator());
            EXO[] var2 = EXO.values();
            int var3 = var2.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                EXO var5 = var2[var4];
                String var6 = (String) EXQ.getInstance().IEO(var5.getImplTitle());
                var1.append(var5.getSpecTitle());
                var1.append(": ");
                var1.append(var6);
                var1.append(System.lineSeparator());
            }

            this.fxml_Label_about.setText(var1.toString());
            this.fxml_Label_about.setEditable(false);
            this.fxml_history.setEditable(false);
            this.fxml_history.setText(this.RKO());
        } finally {
            EXF.getInstance().ICP();
        }
    }

    private String RKO() {
        EXF.getInstance().ICO();
        StringBuffer var1 = new StringBuffer();

        try {
            InputStream var2 = QTF.class.getResourceAsStream("/history/versionHistory.txt");
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2, StandardCharsets.UTF_8));
            String var4 = null;

            while ((var4 = var3.readLine()) != null) {
                var1.append(var4).append("\n");
            }
        } catch (IOException var5) {
            var5.printStackTrace();
        }

        return var1.toString();
    }

    public boolean HHB() {
        EXF.getInstance().ICO();

        boolean var1;
        try {
            var1 = true;
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public void HHC() {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    @FXML
    protected void fxml_handleHyperlink(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICE("Hypelink clicked");
            if (var1.getSource() instanceof HyperlinkBox) {
                this.RAI = ((HyperlinkBox) var1.getSource()).getHref();
            } else if (var1.getSource() instanceof Hyperlink) {
                this.RAI = ((Hyperlink) var1.getSource()).getText();
            } else {
                this.RAI = null;
            }

            (new EVN() {
                public void HZI() {
                    EXF.getInstance().ICO();

                    try {
                        if (QTF.this.RAI != null) {
                            Desktop.getDesktop().browse(new URI(QTF.this.RAI));
                        }
                    } catch (IOException var6) {
                        EXF.getInstance().ICA(var6);
                    } catch (URISyntaxException var7) {
                        EXF.getInstance().ICA(var7);
                    } finally {
                        EXF.getInstance().ICP();
                    }

                }
            }).start();
        } catch (Exception var6) {
            EXF.getInstance().ICA(var6);
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
