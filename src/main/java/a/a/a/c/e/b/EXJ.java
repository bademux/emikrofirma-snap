package a.a.a.c.e.b;

import a.a.a.c.e.a.k.a.EXF;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

public class EXJ {
    @FXML
    private Text fxml_textVersions;
    @FXML
    private Text fxml_text_info;
    @FXML
    private Text fxml_progress_text;
    @FXML
    private ProgressBar fxml_progress_bar_major;
    @FXML
    private ProgressBar fxml_progress_bar_minor;

    public EXJ() {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public void IDK() {
        EXF.getInstance().ICO();

        try {
            this.fxml_textVersions.setText(this.getVersionFromPackage(this.getClass().getPackage()));
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected String getVersionFromPackage(Package var1) {
        EXF.getInstance().ICO();

        String var3;
        try {
            String var2 = "";
            if (var1 != null) {
                if (var1.getSpecificationTitle() != null) {
                    var2 = var1.getSpecificationTitle();
                }

                if (var1.getImplementationVersion() != null) {
                    if (var2.length() > 0) {
                        var2 = var2 + " - ";
                    }

                    var2 = var2 + var1.getImplementationVersion();
                }
            }

            var3 = var2;
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public void set_progress(final String var1, final Double var2, final Double var3) {
        EXF.getInstance().ICO();

        try {
            Platform.runLater(new Runnable() {
                public void run() {
                    EXJ.this.set_progress_inner(var1, var2, var3);
                }
            });
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void set_progress_inner(String var1, Double var2, Double var3) {
        EXF.getInstance().ICO();

        try {
            if (var1 != null) {
                this.fxml_progress_text.textProperty().setValue("");
                this.fxml_progress_text.textProperty().setValue(var1);
            }

            if (var2 != null) {
                if (var2 < 0.0) {
                    this.fxml_progress_bar_major.setProgress(0.0);
                    this.fxml_progress_bar_major.setDisable(true);
                } else {
                    this.fxml_progress_bar_major.setProgress(var2);
                    this.fxml_progress_bar_major.setDisable(false);
                }
            }

            if (var3 != null) {
                if (var3 < 0.0) {
                    this.fxml_progress_bar_minor.setProgress(0.0);
                    this.fxml_progress_bar_minor.setDisable(true);
                } else {
                    this.fxml_progress_bar_minor.setProgress(var3);
                    this.fxml_progress_bar_minor.setDisable(false);
                }
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void set_text_info(Paint var1, String var2) {
        EXF.getInstance().ICO();

        try {
            this.fxml_text_info.setFill(var1);
            this.fxml_text_info.setText(var2);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public static String getValue(byte[] var0, char[] var1) {
        EXF.getInstance().ICO();

        try {
            StringBuilder var2 = new StringBuilder();

            for (int var3 = 0; var3 < var0.length; ++var3) {
                byte var4 = var0[var3];
                var2.append(var1[(var4 & 240) >> 4]);
                var2.append(var1[var4 & 15]);
            }

            String var8 = var2.toString();
            return var8;
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public void IDL() {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public void IDM() {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }
}
