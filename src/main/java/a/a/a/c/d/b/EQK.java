package a.a.a.c.d.b;

import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;
import a.a.a.b.e.c.FFC;
import a.a.a.b.f.*;
import a.a.a.c.e.a.d.*;
import a.a.a.c.e.a.g.EWX;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.*;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.b.FCW;
import a.a.a.c.g.c.FCZ;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import sun.security.pkcs11.wrapper.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.LocalDate;
import java.util.*;

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
                                                EXF.getInstance().ICA(var26);
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
                EXF.getInstance().ICA(var28);
                var3 = var28.getLocalizedMessage() != null ? var28.getLocalizedMessage() : "";
                this.setProgress(FCW.getInstance().getMessageForKey("micro.jpk.sendout.error").replaceFirst("##ERROR##", var3));
                throw var28;
            } catch (Exception var29) {
                EXF.getInstance().ICA(var29);
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
        EXF.getInstance().ICO();

        try {
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
                            EXF.getInstance().ICK("File " + var6 + " is deleted " + var6.delete());
                        }
                    }
                }

                EXF.getInstance().ICK("Dir " + var1 + " is deleted " + var1.delete());
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private EVZ<FFC, X509Certificate> getPrivateKeyAndCertificateFromSmartCard() throws FFO, FFK {
        EXF.getInstance().ICO();

        try {
            FCR.QGW var1;
            if (this.FWI != null && this.FWI.length() > 0) {
                PKCS11 var39 = PKCS11.getInstance(this.FWI, "C_GetFunctionList", null, false);
                EXF.getInstance().ICE("pkcs11 " + var39);
                boolean var2 = true;
                long[] var3 = var39.C_GetSlotList(var2);
                EXF.getInstance().ICK("slotList " + var3);
                HashMap var4 = new HashMap();
                long[] var5 = var3;
                int var6 = var3.length;
                int var7 = 0;

                while (true) {
                    if (var7 >= var6) {
                        ArrayList var40 = new ArrayList();
                        Iterator var41 = var4.entrySet().iterator();

                        while (var41.hasNext()) {
                            Map.Entry var43 = (Map.Entry) var41.next();
                            Iterator var45 = ((Map) var43.getValue()).entrySet().iterator();

                            while (var45.hasNext()) {
                                Map.Entry var9 = (Map.Entry) var45.next();
                                byte[] var48 = (byte[]) ((EWC) var9.getValue()).getSecondValue();
                                X509Certificate var50 = (X509Certificate) ((EWC) var9.getValue()).getThirdValue();
                                Date var52 = var50.getNotBefore();
                                Date var53 = var50.getNotAfter();
                                long var55 = (Long) var43.getKey();
                                String var59 = (String) ((EWC) var9.getValue()).getFirstValue();
                                var40.add(new EWB(var59, var50, var52, var53, new EVZ(var55, var48)));
                            }
                        }

                        EWB var42 = (EWB) FCR.IGD(FCW.getInstance().getMessageForKey("micro.dialog.listchooser.title"), FCW.getInstance().getMessageForKey("micro.tableview.cert.header"), var40, FCW.getInstance().getMessageForKey("micro.tableview.column.cert.label"), FCW.getInstance().getMessageForKey("micro.tableview.column.cert.description"), FCW.getInstance().getMessageForKey("micro.tableview.column.cert.notbefore"), FCW.getInstance().getMessageForKey("micro.tableview.column.cert.notafter"), 700.0, 300.0);
                        if (var42 != null) {
                            String var44 = (String) var42.getFirstValue();
                            EXF.getInstance().ICE("Selected Alias Encoded " + var44);
                            Date var46 = (Date) var42.getThirdValue();
                            EXF.getInstance().ICE("Selected Certificate Valid From " + var46);
                            Date var47 = (Date) var42.getFourthValue();
                            EXF.getInstance().ICE("Selected Certificate Valid To " + var47);
                            X509Certificate var49 = (X509Certificate) var42.getSecondValue();
                            EXF.getInstance().ICE("Selected Certificate Subject " + var49.getSubjectDN());
                            long var51 = (Long) ((EVZ) var42.getFifthValue()).getFirstValue();
                            EXF.getInstance().ICE("Selected Slot " + var51);
                            byte[] var54 = (byte[]) ((EVZ) var42.getFifthValue()).getSecondValue();
                            EXF.getInstance().ICE("Selected Certificate Id " + Arrays.toString(var54));
                            FFC var56 = new FFC(var39, var51, var54);
                            EXF.getInstance().ICE("Selected Private Key " + var56);
                            EVZ var57 = new EVZ(var56, var49);
                            return var57;
                        }
                        break;
                    }

                    long var8 = var5[var7];
                    EXF.getInstance().ICE("slot " + var8);
                    CK_TOKEN_INFO var10 = var39.C_GetTokenInfo(var8);
                    EXF.getInstance().ICE("ck_token_info " + var10);
                    EXF.getInstance().ICK("ck_token_info.label " + new String(var10.label));
                    String var11 = Functions.tokenInfoFlagsToString(var10.flags);
                    EXF.getInstance().ICK("ck_token_info.flags " + var11);
                    String[] var12 = var11.split("\\|");
                    boolean var13 = false;
                    boolean var14 = false;
                    boolean var15 = false;
                    String[] var16 = var12;
                    int var17 = var12.length;

                    for (int var18 = 0; var18 < var17; ++var18) {
                        String var19 = var16[var18];
                        EXF.getInstance().ICK("flag " + var19.trim());
                        switch (var19.trim()) {
                            case "CKF_LOGIN_REQUIRED":
                                var13 = true;
                                break;
                            case "CKF_TOKEN_INITIALIZED":
                                var14 = true;
                                break;
                            case "CKF_USER_PIN_INITIALIZED":
                                var15 = true;
                        }
                    }

                    if (var14 && (!var13 || var15)) {
                        HashMap var58 = new HashMap();
                        var4.put(var8, var58);
                        long var60 = var39.C_OpenSession(var8, 4L, null, null);
                        EXF.getInstance().ICK("session " + var60);
                        CK_ATTRIBUTE[] var61 = new CK_ATTRIBUTE[]{new CK_ATTRIBUTE(), null};
                        var61[0].type = 1L;
                        var61[0].pValue = true;
                        var61[1] = new CK_ATTRIBUTE();
                        var61[1].type = 0L;
                        var61[1].pValue = 1L;
                        var39.C_FindObjectsInit(var60, var61);
                        long[] var62 = var39.C_FindObjects(var60, 100L);
                        EXF.getInstance().ICK("objects " + var62);
                        EXF.getInstance().ICK("objects " + var62.length);
                        long[] var63 = var62;
                        int var22 = var62.length;

                        for (int var23 = 0; var23 < var22; ++var23) {
                            long var24 = var63[var23];
                            EXF.getInstance().ICE("object " + var24);
                            CK_ATTRIBUTE[] var26 = new CK_ATTRIBUTE[]{new CK_ATTRIBUTE(), null, null};
                            var26[0].type = 3L;
                            var26[1] = new CK_ATTRIBUTE();
                            var26[1].type = 258L;
                            var26[2] = new CK_ATTRIBUTE();
                            var26[2].type = 17L;
                            var39.C_GetAttributeValue(var60, var24, var26);
                            Object var27 = null;
                            char[] var64;
                            if (var26[0].pValue != null) {
                                var64 = var26[0].getCharArray();
                            } else {
                                if (var26[1].pValue == null) {
                                    throw new FFK("Missing label for certificate!");
                                }

                                var64 = Base64.getEncoder().encodeToString(var26[1].getByteArray()).toCharArray();
                            }

                            EXF.getInstance().ICE("Certificate Label Charaters " + new String(var64));
                            EXF.getInstance().ICE("Certificate Label Charaters Encoded " + new String((new String(var64)).getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
                            Object var28 = null;
                            if (var26[1].pValue != null) {
                                byte[] var65 = var26[1].getByteArray();
                                Object var29 = null;
                                if (var26[2].pValue == null) {
                                    throw new FFK("Missing value for certificate!");
                                }

                                byte[] var66 = var26[2].getByteArray();
                                Certificate var30 = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(var66));
                                X509Certificate var31 = (X509Certificate) var30;
                                EXF.getInstance().ICE("Available Certificate Valid From " + var31.getNotBefore());
                                EXF.getInstance().ICE("Available Certificate Valid To " + var31.getNotAfter());
                                EXF.getInstance().ICE("Available Certificate Subject " + var31.getSubjectDN());
                                EXF.getInstance().ICE("Available Certificate Id " + Arrays.toString(var65));
                                var58.put(var24, new EWC(new String((new String(var64)).getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8), var65, var30));
                            } else {
                                EXF.getInstance().ICI("Missing ID for certificate " + new String(var64));
                            }
                        }

                        var39.C_FindObjectsFinal(var60);
                        var39.C_CloseSession(var60);
                    }

                    ++var7;
                }
            } else {
                var1 = FCR.getNoCryptCardDialogResult(FCW.getInstance().getMessageForKey("micro.dialog.sign.no_cryptcard.title"), FCW.getInstance().getMessageForKey("micro.dialog.sign.no_cryptcard.header"), 800.0, 150.0, FCW.getInstance().getMessageForKey("micro.dialog.sign.no_cryptcard.description"));
                if (var1 == FCR.QGW.GO_TO_SETTINGS) {
                    throw new QGU("go to setting", 1);
                }
            }

            return null;
        } catch (NullPointerException var36) {
            EXF.getInstance().ICA(var36);
            throw FCZ.getInstance().IHQ();
        } catch (PKCS11Exception | CertificateException | IOException var37) {
            EXF.getInstance().ICA(var37);
            throw new FFK(var37);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    protected abstract MME<Boolean, String, String, String, LocalDate, BigDecimal, String> getSignatureValuesForKD() throws FFO, FFK;

    private void HQH(String var1) {
        EXF.getInstance().ICO();

        try {
            String var2 = var1 + System.lineSeparator();
            this.FWF.appendText(var2);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public ProgressBar HQI(final String var1) {
        EXF.getInstance().ICO();

        ProgressBar var2;
        try {
            var2 = FEL.IKS(new FEM<ProgressBar>() {
                public ProgressBar IKT() {
                    return EQK.this.HQJ(var1);
                }
            });
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    private ProgressBar HQJ(String var1) {
        EXF.getInstance().ICO();

        ProgressBar var6;
        try {
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
            var5.setStyle("progress-bar");
            var3.getChildren().add(var5);
            this.FWG.getChildren().clear();
            this.FWG.getChildren().add(var3);
            this.FWG.getChildren().addAll(var2);
            var6 = var5;
        } finally {
            EXF.getInstance().ICP();
        }

        return var6;
    }

    public void setProgressAndAlertError(String var1) {
        EXF.getInstance().ICO();

        try {
            this.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.exception.title"), var1);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setProgressAndAlertError(String var1, String var2) {
        EXF.getInstance().ICO();

        try {
            this.setProgress(null, var2, null);
            FCR.IGK(var1, var2, false);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setProgressAndAlertInfo(String var1, String var2) {
        EXF.getInstance().ICO();

        try {
            this.setProgress(null, var2, null);
            FCR.IGF(var1, "", var2, false, 400.0, 100.0);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setProgress(String var1) {
        EXF.getInstance().ICO();

        try {
            this.setProgress(null, var1, null);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setProgress(ProgressBar var1, Double var2) {
        EXF.getInstance().ICO();

        try {
            this.setProgress(var1, null, var2);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void setProgress(final ProgressBar var1, final String var2, final Double var3) {
        EXF.getInstance().ICO();

        try {
            FEL.IKS(new FEM<Void>() {
                public Void IKT() {
                    EQK.this.setProgressInner(var1, var2, var3);
                    return null;
                }
            });
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void setProgressInner(ProgressBar var1, String var2, Double var3) {
        EXF.getInstance().ICO();

        try {
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
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
