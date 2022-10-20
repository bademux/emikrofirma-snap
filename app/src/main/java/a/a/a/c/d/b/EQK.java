package a.a.a.c.d.b;

import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;
import a.a.a.b.e.c.FFC;
import a.a.a.b.f.*;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.d.EWD;
import a.a.a.c.e.a.d.MME;
import a.a.a.c.e.a.g.EWX;
import a.a.a.c.f.a.d.*;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.b.FCW;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.ResourceBundle;

@Slf4j
public abstract class EQK {
    public static final int QHR = 1;
    protected final ResourceBundle MWM;
    private final TextArea FWF;
    private final VBox FWG;
    private final Double FWH;
    private final String FWI;
    private final EWD<ProgressBar> FWJ;
    private final EWX FWK;
    private static final long MWN = 5248000L;

    public EQK(ResourceBundle var1, TextArea var2, VBox var3, String var4) throws FFK {
        this.MWM = var1;
        this.FWF = var2;
        this.FWG = var3;
        this.FWI = var4;
        if (this.FWF != null && this.FWG != null) {
            this.FWJ = new EWD();
            this.FWK = new EWX() {
                public void IBI(long var1, double var3, long var5, long var7, long var9, long var11) {
                    EQK.this.setProgress(EQK.this.FWJ.getFirstValue(), var3);
                }
            };
            if (this.FWG != null) {
                this.FWH = this.FWG.getMinWidth();
            } else {
                this.FWH = null;
            }

        } else {
            throw new FFK("Missing fx logging components!");
        }
    }

    public EWD<ProgressBar> getProgressBarContainer() {
        return this.FWJ;
    }

    public EWX getProgressReporter() {
        return this.FWK;
    }

    public AGWN HQF(AGWN var1) throws FFK, FFO {
        Object var32;
        try {
            String var3;
            try {
                this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.init.start").replaceFirst("##DECLARATIONTYPE##", var1.getDeclarationFileSchema().AICH()).replaceFirst("##FILENAME##", var1.getDeclarationFileName()));
                boolean var2 = var1.getDeclarationFile().length() <= 5248000L;
                this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.init.generatekey"));
                AGXC var31 = EPW.HOY();
                this.FWJ.setFirstValue(this.HQI(FCW.getInstance().getMessageForKey("micro.jpk.sendout.validation.start")));
                boolean var4 = EPW.HOZ(this.FWK, var1);
                if (!var4) {
                    this.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.validation.failure"));
                } else {
                    this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.validation.success"));
                    boolean var5 = false;
                    if (AGXA.AHSV.getKodFormularza().equals(var1.getDeclarationFileSchema().getKodFormularza()) && AGXA.AHSV.getKodSystemowy().equals(var1.getDeclarationFileSchema().getKodSystemowy()) && AGXA.AHSV.getWersjaSchemy().equals(var1.getDeclarationFileSchema().getWersjaSchemy()) && AGXA.AHSV.getWariantFormularza().equals(var1.getDeclarationFileSchema().getWariantFormularza())) {
                        var5 = true;
                        HK var6 = (HK) var1;
                        if (var6.AICF()) {
                            this.FWJ.setFirstValue(this.HQI(FCW.getInstance().getMessageForKey("micro.jpk.sendout.verification.start")));
                            boolean var7 = EPW.HPA(this.FWK, var1);
                            if (var7) {
                                this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.verification.success"));
                            } else {
                                this.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.verification.failure"));
                            }
                        }
                    } else {
                        var5 = false;
                    }

                    CertificateFactory var33 = CertificateFactory.getInstance("X.509");
                    InputStream var34 = EQK.class.getResourceAsStream("/cert/3af5843ae11db6d94edf0ea502b5cd1a.pem");
                    Certificate var8 = var33.generateCertificate(var34);
                    this.FWJ.setFirstValue(this.HQI(FCW.getInstance().getMessageForKey("micro.jpk.sendout.sha256.checksum.start")));
                    boolean var9 = EPW.HPB(this.FWK, var1);
                    if (!var9) {
                        this.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.sha256.checksum.failure"));
                    } else {
                        this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.sha256.checksum.success"));
                        this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.zip.compress"));
                        EPW.HPC(var1);
                        this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.zip.split"));
                        EPW.HPD(var1);
                        this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.zip.encrypt"));
                        EPW.HPE(var31, var1);
                        this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.initupload.prepare"));
                        EPW.HPG(var31, var1, var8);
                        this.FWJ.setFirstValue(this.HQI(FCW.getInstance().getMessageForKey("micro.jpk.sendout.initupload.validate.start")));
                        boolean var10 = EPW.HPI(this.FWK, var1);
                        if (!var10) {
                            this.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.initupload.validate.failure"));
                        } else {
                            this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.initupload.validate.success"));
                            boolean var11 = false;
                            FCR.FCS var12 = null;

                            label338:
                            while (true) {
                                var12 = FCR.getSignatureMethodSelector(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.method.selector.title"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.method.selector.header"), 800.0, 150.0, FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.method.selector.description"), var5 && var2);
                                switch (var12) {
                                    case CryptCard:
                                        EVZ var13 = this.getPrivateKeyAndCertificateFromSmartCard();
                                        if (var13 != null) {
                                            this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.method.selected.cryptcard"));

                                            try {
                                                EPW.HPK(var1, (FFC) var13.getFirstValue(), (X509Certificate) var13.getSecondValue());
                                                var11 = true;
                                            } catch (FFN var25) {
                                                StringBuilder var37 = new StringBuilder();
                                                var37.append(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.cryptcard.PINfailure"));
                                                Iterator var38 = var25.getTechnicalExceptionList().iterator();

                                                while (var38.hasNext()) {
                                                    Throwable var17 = (Throwable) var38.next();
                                                    var37.append(var17.getLocalizedMessage()).append(System.lineSeparator());
                                                }

                                                FCR.IGM(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.header"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.cryptcard.problem"), var37.toString(), false);
                                            } catch (Throwable var26) {
                                                log.error("Something bad happened", var26);
                                                var12 = null;
                                                String var15 = null;
                                                Throwable var16 = var26;

                                                do {
                                                    var15 = var16.getLocalizedMessage();
                                                    var16 = var16.getCause();
                                                } while (var15 == null && var16 != null);

                                                FCR.IGM(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.header"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.cryptcard.problem"), var15 != null ? var15 : FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.cryptcard.checklogs"), false);
                                            }
                                        } else {
                                            var12 = null;
                                        }
                                        break;
                                    case PZ:
                                        this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.method.selected.pz"));
                                        var11 = EPW.HPL(var1);
                                        break;
                                    case KD:
                                        MME var14 = this.getSignatureValuesForKD();
                                        if (var14 != null) {
                                            this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.method.selected.kd"));
                                            var1.setSignatureType(EHK.KD);
                                            var1.setKdSignatureData(var14);
                                            var11 = true;
                                        } else {
                                            var12 = null;
                                        }
                                    case Cancel:
                                        break;
                                    default:
                                        throw new FFI("Unknown signatureMethod " + var12);
                                }

                                if (var12 != null) {
                                    if (var11) {
                                        EQB.EQC var35;
                                        AGWN var36;
                                        switch (var1.MWX()) {
                                            case KD:
                                                this.FWJ.setFirstValue(this.HQI(FCW.getInstance().getMessageForKey("micro.jpk.sendout.send.start")));
                                                var35 = EPW.MWZ(this.FWK, var1);
                                                if (EQB.EQC.SUCCESS.equals(var35)) {
                                                    this.setProgressAndAlertInfo(FCW.getInstance().getMessageForKey("micro.jpk.sendout.send.title"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.send.status.success"));
                                                    var36 = var1;
                                                    return var36;
                                                }

                                                this.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.send.title"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.send.status").replaceFirst("##STATUS##", var35.getDescription()));
                                                break label338;
                                            case CC:
                                            case PZ:
                                            default:
                                                this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.validate.start"));
                                                EPW.HPN(var1);
                                                if (var1.getInitUploadSignedEnvelopedFileValid()) {
                                                    this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.validate.success"));
                                                    this.FWJ.setFirstValue(this.HQI(FCW.getInstance().getMessageForKey("micro.jpk.sendout.send.start")));
                                                    var35 = EPW.HPO(this.FWK, var1);
                                                    if (EQB.EQC.SUCCESS.equals(var35)) {
                                                        this.setProgressAndAlertInfo(FCW.getInstance().getMessageForKey("micro.jpk.sendout.send.title"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.send.status.success"));
                                                        var36 = var1;
                                                        return var36;
                                                    }

                                                    this.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.send.title"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.send.status").replaceFirst("##STATUS##", var35.getDescription()));
                                                } else {
                                                    this.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.validate.failure"));
                                                }
                                        }
                                    } else {
                                        this.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.header"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.failed"));
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }

                var32 = null;
            } catch (QGU var27) {
                throw var27;
            } catch (FFO var28) {
                log.error("Something bad happened", var28);
                var3 = var28.getLocalizedMessage() != null ? var28.getLocalizedMessage() : "";
                this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.error").replaceFirst("##ERROR##", var3));
                throw var28;
            } catch (Exception var29) {
                log.error("Something bad happened", var29);
                var3 = var29.getLocalizedMessage() != null ? var29.getLocalizedMessage() : "";
                this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.error").replaceFirst("##ERROR##", var3));
                throw new FFK(var29);
            }
        } finally {
            if (var1 != null) {
                this.HQG(var1.getContextDir());
            }

        }

        return (AGWN) var32;
    }

    private void HQG(File var1) {

        if (var1 != null && var1.isDirectory()) {
            File[] var2 = var1.listFiles();
            if (var2 != null) {
                File[] var3 = var2;
                int var4 = var2.length;

                for (int var5 = 0; var5 < var4; ++var5) {
                    File var6 = var3[var5];
                    if (var6.isDirectory()) {
                        this.HQG(var6);
                    } else {
                        log.debug("File " + var6 + " is deleted " + var6.delete());
                    }
                }
            }

            log.debug("Dir " + var1 + " is deleted " + var1.delete());
        }

    }

    private EVZ<FFC, X509Certificate> getPrivateKeyAndCertificateFromSmartCard() throws FFO, FFK {
        throw new UnsupportedOperationException("reimplement without sun.security");
    }

    protected abstract MME<Boolean, String, String, String, LocalDate, BigDecimal, String> getSignatureValuesForKD() throws FFO, FFK;

    private void HQH(String var1) {

        String var2 = var1 + System.lineSeparator();
        this.FWF.appendText(var2);

    }

    public ProgressBar HQI(final String var1) {

        ProgressBar var2;
        var2 = FEL.IKS(new FEM<ProgressBar>() {
            public ProgressBar IKT() {
                return EQK.this.HQJ(var1);
            }
        });

        return var2;
    }

    private ProgressBar HQJ(String var1) {

        ProgressBar var6;
        this.HQH(var1);
        ObservableList var2 = FXCollections.observableArrayList(this.FWG.getChildren());
        VBox var3 = new VBox();
        Text var4 = new Text(var1);
        var3.getChildren().add(var4);
        ProgressBar var5 = new ProgressBar();
        if (this.FWH != null && this.FWH > 50.0) {
            var5.setMinWidth(this.FWH);
            var5.setPrefWidth(this.FWH);
            var5.setMaxWidth(this.FWH);
        }

        var5.setProgress(-1.0);
        var5.setStyle(":progress-bar");
        var3.getChildren().add(var5);
        this.FWG.getChildren().clear();
        this.FWG.getChildren().add(var3);
        this.FWG.getChildren().addAll(var2);
        var6 = var5;

        return var6;
    }

    public void setProgressAndAlertError(String var1) {

        this.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.exception.title"), var1);

    }

    public void setProgressAndAlertError(String var1, String var2) {

        this.setProgress(null, var2, null);
        FCR.IGK(var1, var2, false);

    }

    public void setProgressAndAlertInfo(String var1, String var2) {

        this.setProgress(null, var2, null);
        FCR.IGF(var1, "", var2, false, 400.0, 100.0);

    }

    public void setProgress(String var1) {

        this.setProgress(null, var1, null);

    }

    public void setProgress(ProgressBar var1, Double var2) {

        this.setProgress(var1, null, var2);

    }

    private void setProgress(final ProgressBar var1, final String var2, final Double var3) {

        FEL.IKS(new FEM<Void>() {
            public Void IKT() {
                EQK.this.setProgressInner(var1, var2, var3);
                return null;
            }
        });

    }

    private void setProgressInner(ProgressBar var1, String var2, Double var3) {

        if (var2 != null) {
            this.HQH(var2);
        }

        if (var1 != null && var3 != null) {
            if (var3 < 0.0) {
                var1.setProgress(0.0);
                var1.setDisable(true);
            } else {
                var1.setProgress(var3);
                var1.setDisable(false);
            }
        }

    }
}
