package a.a.a.c.d.b;

import a.a.a.b.FEK;
import a.a.a.b.c.FEN;
import a.a.a.b.d.FEO;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.d.EWC;
import a.a.a.c.e.a.d.MME;
import a.a.a.c.e.a.f.*;
import a.a.a.c.e.a.g.EWX;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.b.c.JT;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.b.FCW;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import pl.akmf.apps.micro.jaxb.kd.type.DaneAutoryzujace;
import pl.akmf.apps.micro.jaxb.kd.type.JPKMicro;
import pl.akmf.apps.micro.jaxb.kd.type.ObjectFactory;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;

public class EQB {
    private final EWX FVP;
    private final AGWN FVQ;
    private EQC FVR;
    private EQD FVS;
    String MWL = "";

    public EQB(EWX var1, AGWN var2) {
        EXF.getInstance().ICO();

        try {
            this.FVP = var1;
            this.FVQ = var2;
            this.FVQ.setDeclarationStatus(HL.NEW);
            this.FVR = EQB.EQC.INIT;
            this.FVS = EQB.EQD.START;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HPU(EQD var1, Double var2) {
        EXF.getInstance().ICO();

        try {
            this.HPV(var1, var2, null);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HPV(EQD var1, Double var2, String var3) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICK("progress " + var2);
            this.FVS = var1;
            EWX.IBJ(this.FVP, var2, 0L, 0L);
            if (var3 != null) {
                this.MWL = var3;
                EXF.getInstance().ICE(var3);
            } else {
                this.MWL = "";
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public EQC HPW() {
        EXF.getInstance().ICO();

        EQC var43;
        try {
            if (!EQB.EQC.INIT.equals(this.FVR) || !EQB.EQD.START.equals(this.FVS)) {
                throw new FFI("Invalid step [" + this.FVS + "] and status [" + this.FVR + "] to start!");
            }

            this.FVR = EQB.EQC.RUNNING;

            String var39;
            while (EQB.EQC.RUNNING.equals(this.FVR)) {
                JSONObject var36;
                final JSONArray var38;
                JSONObject var53;
                switch (this.FVS) {
                    case START:
                    case INIT_START:
                    case INIT_FAILED_OTHER:
                    case INIT_SERVER_ERROR:
                        try {
                            this.HPU(EQB.EQD.INIT_START, 0.0);
                            JT var37 = this.FVQ.getInitUploadSignedEnvelopedFile();
                            EXF.getInstance().ICE("Processing signed file " + var37);
                            this.HPU(EQB.EQD.INIT_START, 0.03);
                            EWJ var40 = new EWJ(EWP.POST, FEK.HEV, "e-dokumenty.mf.gov.pl", -1, "/api/Storage/InitUploadSigned", EWQ.XML, var37.getValue());
                            this.HPU(EQB.EQD.INIT_START, 0.06);
                            var40.getHeaderFields().put("Accept", EWQ.JSON.getMimeType());
                            EXF.getInstance().ICE("HttpSenderRequest InitUploadSigned " + var40);
                            this.HPU(EQB.EQD.INIT_START, 0.09);
                            EWK var47 = EWH.IBA(var40, null, new EWI());
                            EXF.getInstance().ICE("HttpSenderResult InitUploadSigned " + var47);
                            if (var47.getStatus() == 200) {
                                this.HPU(EQB.EQD.INIT_SUCCESS, 0.12);
                                this.FVQ.setInitUploadSignedResponseJSON((JSONObject) var47.getContent());
                                var53 = (JSONObject) var47.getContent();
                                EXF.getInstance().ICE("InitUploadSignedResult.ReferenceNumber " + var53.get("ReferenceNumber"));
                                EXF.getInstance().ICE("InitUploadSignedResult.TimeoutInSec " + var53.get("TimeoutInSec"));
                                this.FVQ.setReferenceId((String) var53.get("ReferenceNumber"));
                            } else {
                                StringBuilder var54;
                                String var55;
                                if (var47.getStatus() == 400) {
                                    this.FVQ.setInitUploadSignedResponseJSON((JSONObject) var47.getContent());
                                    var53 = (JSONObject) var47.getContent();
                                    var54 = new StringBuilder();
                                    var54.append(var53.get("Code")).append(" ");
                                    var54.append(var53.get("Message")).append(" ");
                                    var54.append(var53.get("RequestId")).append(" ");
                                    if (var53.containsKey("Errors")) {
                                        var54.append(var53.get("Errors"));
                                    }

                                    var55 = var54.toString();
                                    this.HPV(EQB.EQD.INIT_BAD_REQUEST, 0.12, var55);
                                    this.FVR = EQB.EQC.FAIL;
                                    this.FVQ.setDeclarationStatus(HL.FAILURE);
                                    EXF.getInstance().ICA("Initial call for file [" + this.FVQ.getDeclarationFile() + "] failed! " + var55);
                                } else if (var47.getStatus() == 500) {
                                    this.FVQ.setInitUploadSignedResponseJSON((JSONObject) var47.getContent());
                                    var53 = (JSONObject) var47.getContent();
                                    var54 = new StringBuilder();
                                    var54.append(var53.get("Message")).append(" ");
                                    var54.append(var53.get("RequestId")).append(" ");
                                    var55 = var54.toString();
                                    this.HPV(EQB.EQD.INIT_SERVER_ERROR, 0.12, var55);
                                    this.FVR = EQB.EQC.CAN_BE_RESTARTED;
                                    this.FVQ.setDeclarationStatus(HL.RETRY);
                                    EXF.getInstance().ICA("Initial call for file [" + this.FVQ.getDeclarationFile() + "] failed! " + var55);
                                } else {
                                    this.HPV(EQB.EQD.INIT_FAILED_OTHER, 0.12, "Status " + var47.getStatus());
                                    this.FVR = EQB.EQC.CAN_BE_RESTARTED;
                                    this.FVQ.setDeclarationStatus(HL.RETRY);
                                    EXF.getInstance().ICA("Initial call for file [" + this.FVQ.getDeclarationFile() + "] failed!");
                                }
                            }
                        } catch (Exception var30) {
                            EXF.getInstance().ICA(var30);
                            this.HPV(EQB.EQD.INIT_FAILED_OTHER, 0.12, var30.getClass().getName() + " " + var30.getLocalizedMessage());
                            this.FVR = EQB.EQC.CAN_BE_RESTARTED;
                            this.FVQ.setDeclarationStatus(HL.RETRY);
                        }
                        break;
                    case INIT_SUCCESS:
                    case UPLOAD_START:
                    case UPLOAD_FAILED:
                        try {
                            this.HPU(EQB.EQD.UPLOAD_START, 0.15);
                            var36 = this.FVQ.getInitUploadSignedResponseJSONObject();
                            EXF.getInstance().ICE("InitUploadSignedResult.ReferenceNumber " + var36.get("ReferenceNumber"));
                            EXF.getInstance().ICE("InitUploadSignedResult.TimeoutInSec " + var36.get("TimeoutInSec"));
                            this.HPU(EQB.EQD.UPLOAD_START, 0.18);
                            var38 = (JSONArray) var36.get("RequestToUploadFileList");
                            final double var45 = 0.2;
                            double var52 = 0.81;
                            final double var57 = var52 - var45;
                            this.HPU(EQB.EQD.UPLOAD_START, var45);
                            HashMap var9 = new HashMap();
                            Iterator var10 = this.FVQ.getZipFileList().iterator();

                            while (var10.hasNext()) {
                                AGXD var11 = (AGXD) var10.next();
                                if (var9.put(var11.getSplitFileEncryptedName(), var11) != null) {
                                    throw new FFI("Duplicate SplitFileEncryptedName [" + var11.getSplitFileEncryptedName() + "] for zipFileEntry!");
                                }
                            }

                            boolean var58 = true;
                            boolean var59 = true;
                            StringBuilder var12 = new StringBuilder();

                            try {
                                for (int var13 = 0; var13 < var38.size(); ++var13) {
                                    JSONObject var15 = (JSONObject) var38.get(var13);
                                    String var16 = (String) var15.get("FileName");
                                    AGXD var17 = (AGXD) var9.get(var16);
                                    if (var17 == null) {
                                        throw new FFI("Missing zipFileEntry for file [" + var16 + "]!");
                                    }

                                    int finalVar1 = var13;
                                    EVZ var18 = this.HPY(var15, var17, new EWX() {
                                        public void IBI(long var1, double var3, long var5, long var7, long var9, long var11) {
                                            double var13x = var45 + var57 / (double) var38.size() * (double) finalVar1 + var57 / (double) var38.size() * var3;
                                            EWX.IBJ(EQB.this.FVP, var13x, 0L, 0L);
                                        }
                                    });
                                    EQC var19 = (EQC) var18.getFirstValue();
                                    String var20 = (String) var18.getSecondValue();
                                    var12.append(System.lineSeparator());
                                    EXF.getInstance().ICE("Upload [" + var16 + "] finished with status [" + var19 + "].");
                                    switch (var19) {
                                        case SUCCESS:
                                            EXF.getInstance().ICE("Upload process [BlobUpload] [" + var16 + "] [" + var19 + "] succeded.");
                                            break;
                                        case FAIL:
                                            var58 = false;
                                            var59 = false;
                                            EXF.getInstance().ICA("Upload process [BlobUpload] [" + var16 + "] [" + var19 + "] failed! " + var20);
                                            var12.append(var20).append(System.lineSeparator());
                                            break;
                                        case CAN_BE_RESTARTED:
                                            var58 = false;
                                            EXF.getInstance().ICA("Upload process [BlobUpload] [" + var16 + "] [" + var19 + "] failed, but can be restarted. " + var20);
                                            var12.append(var20).append(System.lineSeparator());
                                            break;
                                        case INIT:
                                        case RUNNING:
                                            EXF.getInstance().ICA("Not supposed to happen in this place [" + var16 + "] [" + var19 + "]");
                                    }
                                }
                            } catch (Exception var32) {
                                EXF.getInstance().ICA(var32);
                                String var14 = this.FVQ.getReferenceId() != null ? this.FVQ.getReferenceId() : this.FVQ.getDeclarationType().name() + "_" + this.FVQ.getDeclarationSubType().name() + "_" + this.FVQ.getId();
                                FCR.IGI(FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.status.message.header").replaceFirst("##REFERENCEID##", var14), var32.getLocalizedMessage(), false);
                            }

                            this.HPU(EQB.EQD.UPLOAD_START, var52);
                            if (var58) {
                                this.HPU(EQB.EQD.UPLOAD_SUCCESS, 0.82);
                            } else if (var59) {
                                this.HPV(EQB.EQD.UPLOAD_FAILED, 0.82, var12.toString());
                                this.FVR = EQB.EQC.CAN_BE_RESTARTED;
                            } else {
                                this.HPV(EQB.EQD.UPLOAD_FAILED, 0.82, var12.toString());
                                this.FVR = EQB.EQC.FAIL;
                            }
                        } catch (Exception var33) {
                            EXF.getInstance().ICA(var33);
                            this.HPV(EQB.EQD.UPLOAD_FAILED, 0.82, var33.getClass().getName() + " " + var33.getLocalizedMessage());
                            this.FVR = EQB.EQC.CAN_BE_RESTARTED;
                        }
                        break;
                    case UPLOAD_SUCCESS:
                    case FINISH_START:
                    case FINISH_FAILED_OTHER:
                    case FINISH_SERVER_ERROR:
                        try {
                            this.HPU(EQB.EQD.FINISH_START, 0.83);
                            var36 = this.FVQ.getInitUploadSignedResponseJSONObject();
                            this.HPU(EQB.EQD.FINISH_START, 0.84);
                            var38 = (JSONArray) var36.get("RequestToUploadFileList");
                            ArrayList var44 = new ArrayList();
                            this.HPU(EQB.EQD.FINISH_START, 0.85);

                            for (int var48 = 0; var48 < var38.size(); ++var48) {
                                JSONObject var5 = (JSONObject) var38.get(var48);
                                var44.add(var5.get("BlobName"));
                            }

                            this.HPU(EQB.EQD.FINISH_START, 0.86);
                            var53 = new JSONObject();
                            var53.put("ReferenceNumber", this.FVQ.getReferenceId());
                            var53.put("AzureBlobNameList", var44);
                            this.HPU(EQB.EQD.FINISH_START, 0.87);
                            EWJ var51 = new EWJ(EWP.POST, FEK.HEV, "e-dokumenty.mf.gov.pl", -1, "/api/Storage/FinishUpload", EWQ.JSON, var53.toJSONString().getBytes(StandardCharsets.UTF_8));
                            var51.getHeaderFields().put("Accept", EWQ.JSON.getMimeType());
                            EXF.getInstance().ICE("HttpSenderRequest FinishUpload " + var51);
                            this.HPU(EQB.EQD.FINISH_START, 0.88);
                            EWK var6 = EWH.IBA(var51, null, new EWI());
                            EXF.getInstance().ICE("HttpSenderResult FinishUpload " + var6);
                            this.FVQ.setFinishUploadResponseStatus(new AGWY(var6.getStatus()));
                            if (var6.getStatus() == 200) {
                                this.HPU(EQB.EQD.FINISH_SUCCESS, 0.89);
                            } else {
                                JSONObject var7;
                                StringBuilder var8;
                                if (var6.getStatus() == 400) {
                                    var7 = (JSONObject) var6.getContent();
                                    this.FVQ.setFinishUploadResponseJSON(var7);
                                    var8 = new StringBuilder();
                                    var8.append(var7.get("Message")).append(" ");
                                    var8.append(var7.get("RequestId")).append(" ");
                                    if (var7.containsKey("Errors")) {
                                        var8.append(var7.get("Errors"));
                                    }

                                    this.HPV(EQB.EQD.FINISH_BAD_REQUEST, 0.89, var8.toString());
                                    this.FVR = EQB.EQC.FAIL;
                                    EXF.getInstance().ICA("Finish call for file [" + this.FVQ.getDeclarationFile() + "] failed!");
                                } else if (var6.getStatus() == 500) {
                                    var7 = (JSONObject) var6.getContent();
                                    this.FVQ.setFinishUploadResponseJSON(var7);
                                    var8 = new StringBuilder();
                                    var8.append(var7.get("Message")).append(" ");
                                    var8.append(var7.get("RequestId"));
                                    this.HPV(EQB.EQD.FINISH_SERVER_ERROR, 0.89, var8.toString());
                                    this.FVR = EQB.EQC.CAN_BE_RESTARTED;
                                    EXF.getInstance().ICA("Finish call for file [" + this.FVQ.getDeclarationFile() + "] failed!");
                                } else {
                                    this.HPV(EQB.EQD.FINISH_FAILED_OTHER, 0.89, "Status " + var6.getStatus());
                                    this.FVR = EQB.EQC.CAN_BE_RESTARTED;
                                    EXF.getInstance().ICA("Finish call for file [" + this.FVQ.getDeclarationFile() + "] failed!");
                                }
                            }
                        } catch (Exception var31) {
                            EXF.getInstance().ICA(var31);
                            this.HPV(EQB.EQD.FINISH_FAILED_OTHER, 0.89, var31.getClass().getName() + " " + var31.getLocalizedMessage());
                            this.FVR = EQB.EQC.CAN_BE_RESTARTED;
                        }
                        break;
                    case FINISH_SUCCESS:
                    case STATUS_START:
                    case STATUS_FAILED:
                        try {
                            this.HPU(EQB.EQD.STATUS_START, 0.9);
                            EWJ var1 = new EWJ(EWP.GET, FEK.HEV, "e-dokumenty.mf.gov.pl", -1, "/api/Storage/Status/" + this.FVQ.getReferenceId(), EWQ.JSON, null);
                            var1.getHeaderFields().put("Accept", EWQ.JSON.getMimeType());
                            EXF.getInstance().ICE("HttpSenderRequest Status " + var1);
                            this.HPU(EQB.EQD.STATUS_START, 0.91);
                            EWK var2 = EWH.IBA(var1, null, new EWI());
                            EXF.getInstance().ICE("HttpSenderResult Status " + var2);
                            this.HPU(EQB.EQD.STATUS_START, 0.92);
                            JSONObject var3;
                            if (var2.getStatus() == 200) {
                                this.HPU(EQB.EQD.STATUS_SUCCESS, 1.0);
                                this.FVQ.setStatusResponseJSON((JSONObject) var2.getContent());
                                var3 = (JSONObject) var2.getContent();
                                EXF.getInstance().ICE("StatusResult.Code " + var3.get("Code"));
                                EXF.getInstance().ICE("StatusResult.Description " + var3.get("Description"));
                                EXF.getInstance().ICE("StatusResult.Details " + var3.get("Details"));
                                EXF.getInstance().ICE("StatusResult.Timestamp " + var3.get("Timestamp"));
                                EXF.getInstance().ICE("StatusResult.Upo " + var3.get("Upo"));
                                String var4 = (String) var3.get("Upo");
                                if (var4 != null && var4.length() > 0) {
                                    this.FVQ.setUpo(var4);
                                }

                                this.FVR = EQB.EQC.SUCCESS;
                            } else {
                                StringBuilder var46;
                                if (var2.getStatus() == 400) {
                                    this.FVQ.setStatusResponseJSON((JSONObject) var2.getContent());
                                    var3 = (JSONObject) var2.getContent();
                                    var46 = new StringBuilder();
                                    var46.append(var3.get("Message")).append(" ");
                                    var46.append(var3.get("RequestId")).append(" ");
                                    if (var3.containsKey("Errors")) {
                                        var46.append(var3.get("Errors"));
                                    }

                                    this.HPV(EQB.EQD.STATUS_FAILED, 1.0, var46.toString());
                                    this.FVR = EQB.EQC.FAIL;
                                    EXF.getInstance().ICA("Status call for session entry [" + this.FVQ.getId() + "] failed! " + var46);
                                } else if (var2.getStatus() == 500) {
                                    this.FVQ.setStatusResponseJSON((JSONObject) var2.getContent());
                                    var3 = (JSONObject) var2.getContent();
                                    var46 = new StringBuilder();
                                    var46.append(var3.get("Message")).append(" ");
                                    var46.append(var3.get("RequestId")).append(" ");
                                    this.HPV(EQB.EQD.STATUS_FAILED, 1.0, var46.toString());
                                    this.FVR = EQB.EQC.CAN_BE_RESTARTED;
                                    EXF.getInstance().ICA("Status call for session entry [" + this.FVQ.getId() + "] failed! " + var46);
                                } else {
                                    this.FVR = EQB.EQC.FAIL;
                                    this.HPV(EQB.EQD.STATUS_FAILED, 1.0, "Status " + var2.getStatus());
                                    this.FVR = EQB.EQC.CAN_BE_RESTARTED;
                                    EXF.getInstance().ICA("Status call for session entry [" + this.FVQ.getId() + "] failed!");
                                }
                            }
                        } catch (Exception var29) {
                            EXF.getInstance().ICA(var29);
                            this.HPV(EQB.EQD.STATUS_FAILED, 1.0, var29.getClass().getName() + " " + var29.getLocalizedMessage());
                            this.FVR = EQB.EQC.CAN_BE_RESTARTED;
                        }
                }

                if (EQB.EQC.CAN_BE_RESTARTED.equals(this.FVR)) {
                    var39 = this.FVQ.getReferenceId() != null ? this.FVQ.getReferenceId() : this.FVQ.getDeclarationType().name() + "_" + this.FVQ.getDeclarationSubType().name() + "_" + this.FVQ.getId();
                    File var41 = EXF.getInstance().getDefaultOutputLoggerFile();
                    FCR.IGL(FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.status.message.header").replaceFirst("##REFERENCEID##", var39), this.FVS.getDescription().replaceFirst("##REASON##", this.MWL) + " " + FCW.getInstance().getMessageForKey("micro.sendout.main.step.init_checklogs"), var41, false);
                    FEN var49 = FCR.getConfirmDataDialog(FCW.getInstance().getMessageForKey("micro.dialog.message.title"), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.status.message.header").replaceFirst("##REFERENCEID##", var39), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.retry.confirm"), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.retry.cancel"), 300.0, 200.0, FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.retry.desc"));
                   if (var49 == FEN.Confirm) {
                      this.FVR = EQC.RUNNING;
                   } else {
                      this.FVR = EQC.FAIL;
                   }
                }
            }

            var39 = this.FVQ.getReferenceId() != null ? this.FVQ.getReferenceId() : this.FVQ.getDeclarationType().name() + "_" + this.FVQ.getDeclarationSubType().name() + "_" + this.FVQ.getId();
            switch (this.FVR) {
                case SUCCESS:
                    String var42 = String.valueOf(this.FVQ.getStatusResponseJSONObject().get("Code"));
                    String var50 = (String) this.FVQ.getStatusResponseJSONObject().get("Description");
                    FCR.IGF(FCW.getInstance().getMessageForKey("micro.dialog.message.title"), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.status.message.header").replaceFirst("##REFERENCEID##", var39), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.status.message.body").replaceFirst("##CODE##", var42).replaceFirst("##DESC##", var50), true, 800.0, 300.0);
                    break;
                case FAIL:
                default:
                   if (this.FVS == EQD.INIT_FAILED_OTHER) {
                      File var56 = EXF.getInstance().getDefaultOutputLoggerFile();
                      FCR.IGJ(FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.status.message.header").replaceFirst("##REFERENCEID##", var39), this.FVS.getDescription().replaceFirst("##REASON##", this.MWL) + " " + FCW.getInstance().getMessageForKey("micro.sendout.main.step.init_checklogs"), var56, false);
                   } else {
                      FCR.IGI(FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.status.message.header").replaceFirst("##REFERENCEID##", var39), this.FVS.getDescription().replaceFirst("##REASON##", this.MWL), false);
                   }
            }

            var43 = this.FVR;
        } catch (Exception var34) {
            this.HPV(EQB.EQD.PROCESS_FAILED, 0.0, var34.getLocalizedMessage());
            this.FVR = EQB.EQC.FAIL;
            EXF.getInstance().ICA(var34);
            FCR.IGP("", var34, false);
            throw new FFI(var34);
        } finally {
            EXF.getInstance().ICP();
        }

        return var43;
    }

    public static boolean QIU(AGWN var0) throws FFK, FFO {
        EXF.getInstance().ICO();

        try {
            if (var0 == null || var0.getReferenceId() == null) {
                throw new FFK("Missing declaration or referenceId");
            } else {
                EHK var1 = var0.MWX();
                if (var1 != null && var1 != EHK.Unknown) {
                    EQC var14 = HPX(var0);
                    boolean var16 = true;
                    return var16;
                } else {
                    FFO var2 = null;
                    EQC var3 = null;

                    try {
                        var3 = QIW(var0);
                    } catch (FFO var12) {
                        var2 = var12;
                    }

                    JSONObject var4;
                    Long var5;
                    boolean var6;
                    if (var3 == EQB.EQC.SUCCESS) {
                        var4 = var0.getStatusResponseJSONObject();
                        if (var4 != null) {
                            var5 = (Long) var4.get("Code");
                            if (var5 != 300L) {
                                var0.setSignatureType(EHK.CC);
                                var6 = true;
                                return var6;
                            }
                        }
                    }

                    var3 = null;

                    try {
                        var3 = QIV(var0);
                    } catch (FFO var11) {
                        var2 = var11;
                    }

                    if (var3 == EQB.EQC.SUCCESS) {
                        var4 = var0.getStatusResponseJSONObject();
                        if (var4 != null) {
                            var5 = (Long) var4.get("Code");
                            if (var5 != 300L) {
                                var0.setSignatureType(EHK.KD);
                                var6 = true;
                                return var6;
                            }
                        }
                    }

                    if (var2 != null) {
                        throw var2;
                    } else {
                        boolean var15 = false;
                        return var15;
                    }
                }
            }
        } finally {
            EXF.getInstance().ICP();
        }
    }

    private static EQC QIV(AGWN var0) throws FFK, FFO {
        EXF.getInstance().ICO();

        EQC var19;
        try {
            EQC var1 = EQB.EQC.INIT;
            EWJ var2 = new EWJ(EWP.GET, FEK.MWU, "esb2.mf.gov.pl", 5064, "/jpkmicro/Status/" + var0.getReferenceId(), EWQ.JSON, null);
            var2.getHeaderFields().put("Accept", EWQ.JSON.getMimeType());
            EXF.getInstance().ICE("HttpSenderRequest Status " + var2);
            CertificateFactory var3 = CertificateFactory.getInstance("X.509");
            InputStream var4 = EQK.class.getResourceAsStream("/cert/mf_kd.cer");
            X509Certificate var5 = (X509Certificate) var3.generateCertificate(var4);
            EWK var6 = EWH.MXF(var2, null, new EWI(), var5);
            EXF.getInstance().ICE("HttpSenderResult Status " + var6);
            JSONObject var7;
            if (var6.getStatus() == 200) {
                var0.setStatusResponseJSON((JSONObject) var6.getContent());
                var7 = (JSONObject) var6.getContent();
                EXF.getInstance().ICE("StatusResult.Code " + var7.get("Code"));
                EXF.getInstance().ICE("StatusResult.Description " + var7.get("Description"));
                EXF.getInstance().ICE("StatusResult.Details " + var7.get("Details"));
                EXF.getInstance().ICE("StatusResult.Timestamp " + var7.get("Timestamp"));
                EXF.getInstance().ICE("StatusResult.Upo " + var7.get("Upo"));
                String var8 = (String) var7.get("Upo");
                if (var8 != null && var8.length() > 0) {
                    var0.setUpo(var8);
                }

                Object var9 = var7.get("Code");
                if (var9 != null) {
                    Long var10 = (Long) var7.get("Code");
                    HL var11;
                    if (var10 == 200L) {
                        var11 = HL.SUCCESS;
                    } else if (var10 > 400L) {
                        var11 = HL.FAILURE;
                    } else {
                        var11 = HL.SENT;
                    }

                    var0.setDeclarationStatus(var11);
                }

                var1 = EQB.EQC.SUCCESS;
            } else {
                StringBuilder var20;
                if (var6.getStatus() == 400) {
                    var0.setStatusResponseJSON((JSONObject) var6.getContent());
                    var7 = (JSONObject) var6.getContent();
                    var20 = new StringBuilder();
                    var20.append(var7.get("Message")).append(" ");
                    var20.append(var7.get("RequestId")).append(" ");
                    if (var7.containsKey("Errors")) {
                        var20.append(var7.get("Errors"));
                    }

                    var1 = EQB.EQC.FAIL;
                    EXF.getInstance().ICA("Status call for session entry [" + var0.getId() + "] failed! " + var20);
                } else if (var6.getStatus() == 500) {
                    var0.setStatusResponseJSON((JSONObject) var6.getContent());
                    var7 = (JSONObject) var6.getContent();
                    var20 = new StringBuilder();
                    var20.append(var7.get("Message")).append(" ");
                    var20.append(var7.get("RequestId")).append(" ");
                    var1 = EQB.EQC.FAIL;
                    EXF.getInstance().ICA("Status call for session entry [" + var0.getId() + "] failed! " + var20);
                } else {
                    var1 = EQB.EQC.FAIL;
                    EXF.getInstance().ICA("Status call for session entry [" + var0.getId() + "] failed!");
                }
            }

            if (var1 != EQB.EQC.SUCCESS && var6.getException() != null) {
                throw new FFO(var6.getException());
            }

            var19 = var1;
        } catch (FFO var16) {
            throw var16;
        } catch (Exception var17) {
            EXF.getInstance().ICA(var17);
            throw new FFK(var17);
        } finally {
            EXF.getInstance().ICP();
        }

        return var19;
    }

    private static EQC QIW(AGWN var0) throws FFK, FFO {
        EXF.getInstance().ICO();

        EQC var16;
        try {
            EQC var1 = EQB.EQC.INIT;
            EWJ var2 = new EWJ(EWP.GET, FEK.HEV, "e-dokumenty.mf.gov.pl", -1, "/api/Storage/Status/" + var0.getReferenceId(), EWQ.JSON, null);
            var2.getHeaderFields().put("Accept", EWQ.JSON.getMimeType());
            EXF.getInstance().ICE("HttpSenderRequest Status " + var2);
            EWK var3 = EWH.IBA(var2, null, new EWI());
            EXF.getInstance().ICE("HttpSenderResult Status " + var3);
            JSONObject var4;
            if (var3.getStatus() == 200) {
                var0.setStatusResponseJSON((JSONObject) var3.getContent());
                var4 = (JSONObject) var3.getContent();
                EXF.getInstance().ICE("StatusResult.Code " + var4.get("Code"));
                EXF.getInstance().ICE("StatusResult.Description " + var4.get("Description"));
                EXF.getInstance().ICE("StatusResult.Details " + var4.get("Details"));
                EXF.getInstance().ICE("StatusResult.Timestamp " + var4.get("Timestamp"));
                EXF.getInstance().ICE("StatusResult.Upo " + var4.get("Upo"));
                String var5 = (String) var4.get("Upo");
                if (var5 != null && var5.length() > 0) {
                    var0.setUpo(var5);
                }

                Object var6 = var4.get("Code");
                if (var6 != null) {
                    Long var7 = (Long) var4.get("Code");
                    HL var8;
                    if (var7 == 200L) {
                        var8 = HL.SUCCESS;
                    } else if (var7 > 400L) {
                        var8 = HL.FAILURE;
                    } else {
                        var8 = HL.SENT;
                    }

                    var0.setDeclarationStatus(var8);
                }

                var1 = EQB.EQC.SUCCESS;
            } else {
                StringBuilder var17;
                if (var3.getStatus() == 400) {
                    var0.setStatusResponseJSON((JSONObject) var3.getContent());
                    var4 = (JSONObject) var3.getContent();
                    var17 = new StringBuilder();
                    var17.append(var4.get("Message")).append(" ");
                    var17.append(var4.get("RequestId")).append(" ");
                    if (var4.containsKey("Errors")) {
                        var17.append(var4.get("Errors"));
                    }

                    var1 = EQB.EQC.FAIL;
                    EXF.getInstance().ICA("Status call for session entry [" + var0.getId() + "] failed! " + var17);
                } else if (var3.getStatus() == 500) {
                    var0.setStatusResponseJSON((JSONObject) var3.getContent());
                    var4 = (JSONObject) var3.getContent();
                    var17 = new StringBuilder();
                    var17.append(var4.get("Message")).append(" ");
                    var17.append(var4.get("RequestId")).append(" ");
                    var1 = EQB.EQC.FAIL;
                    EXF.getInstance().ICA("Status call for session entry [" + var0.getId() + "] failed! " + var17);
                } else {
                    var1 = EQB.EQC.FAIL;
                    EXF.getInstance().ICA("Status call for session entry [" + var0.getId() + "] failed!");
                }
            }

            if (var1 != EQB.EQC.SUCCESS && var3.getException() != null) {
                throw new FFO(var3.getException());
            }

            var16 = var1;
        } catch (FFO var13) {
            throw var13;
        } catch (Exception var14) {
            EXF.getInstance().ICA(var14);
            throw new FFK(var14);
        } finally {
            EXF.getInstance().ICP();
        }

        return var16;
    }

    public static EQC HPX(AGWN var0) throws FFK {
        EXF.getInstance().ICO();

        EQC var2;
        try {
            if (var0 == null || var0.getReferenceId() == null) {
                throw new FFK("Missing declaration or referenceId");
            }

            EHK var1 = var0.MWX();
            switch (var1) {
                case KD:
                    var2 = QIV(var0);
                    return var2;
                case CC:
                case PZ:
                default:
                    var2 = QIW(var0);
            }
        } catch (Exception var6) {
            EXF.getInstance().ICA(var6);
            throw new FFK(var6);
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    private EVZ<EQC, String> HPY(JSONObject var1, AGXD var2, EWX var3) throws FFK {
        EXF.getInstance().ICO();

        EVZ var8;
        try {
            EXF.getInstance().ICE("RequestToUploadFile.BlobName " + var1.get("BlobName"));
            EXF.getInstance().ICE("RequestToUploadFile.FileName " + var1.get("FileName"));
            EXF.getInstance().ICE("RequestToUploadFile.Url " + var1.get("Url"));
            EXF.getInstance().ICE("RequestToUploadFile.Method " + var1.get("Method"));
            HashMap var4 = new HashMap();
            JSONArray var14 = (JSONArray) var1.get("HeaderList");

            for (int var6 = 0; var6 < var14.size(); ++var6) {
                JSONObject var7 = (JSONObject) var14.get(var6);
                EXF.getInstance().ICE("RequestToUploadFile.HeaderList[" + var6 + "].Key " + var7.get("Key"));
                EXF.getInstance().ICE("RequestToUploadFile.HeaderList[" + var6 + "].Value " + var7.get("Value"));
                var4.put(var7.get("Key"), var7.get("Value"));
            }

            EWJ var15 = new EWJ(EWP.valueOf((String) var1.get("Method")), new URL((String) var1.get("Url")), EWQ.OCTETSTREAM, var2.getSplitFileEncrypted(), var4);
            EXF.getInstance().ICE("HttpSenderRequest BlobUpload " + var15);
            EWK var16 = EWH.IAX(var15, var3, null, new EWU());
            EXF.getInstance().ICE("HttpSenderResult BlobUpload " + var16);
            var2.setFileUploadResponseStatus(new AGWY(var16.getStatus()));
            if (var16.getStatus() < 200 || var16.getStatus() >= 400) {
                var8 = new EVZ(EQB.EQC.FAIL, "Stauts " + var16.getStatus());
                return var8;
            }

            var8 = new EVZ(EQB.EQC.SUCCESS, null);
        } catch (Exception var12) {
            EXF.getInstance().ICA(var12);
            EVZ var5 = new EVZ(EQB.EQC.CAN_BE_RESTARTED, var12.getLocalizedMessage());
            return var5;
        } finally {
            EXF.getInstance().ICP();
        }

        return var8;
    }

    public EQC MXA() {
        EXF.getInstance().ICO();

        EQC var30;
        try {
            if (!EQB.EQC.INIT.equals(this.FVR)) {
                throw new FFI("Invalid step [" + this.FVS + "] and status [" + this.FVR + "] to start!");
            }

            this.FVR = EQB.EQC.RUNNING;
            boolean var1 = false;

            File var3;
            try {
                this.HPU(EQB.EQD.KD_SEND_START, 0.0);
                MME var2 = this.FVQ.getKdSignatureData();
                var3 = this.FVQ.getDeclarationFile();
                String var4 = this.FVQ.getDeclarationFileName();
                EXF.getInstance().ICE("Processing file " + var4);
                this.HPU(EQB.EQD.KD_SEND_START, 0.02);
                CertificateFactory var5 = CertificateFactory.getInstance("X.509");
                InputStream var6 = EQK.class.getResourceAsStream("/cert/mf_kd.cer");
                X509Certificate var7 = (X509Certificate) var5.generateCertificate(var6);
                this.HPU(EQB.EQD.KD_SEND_START, 0.03);
                ArrayList var8 = new ArrayList();
                byte[] var9 = this.MXB(var2);
                ByteArrayInputStream var10 = new ByteArrayInputStream(var9);
                this.HPU(EQB.EQD.KD_SEND_START, 0.06);
                FileInputStream var11 = new FileInputStream(var3);
                this.HPU(EQB.EQD.KD_SEND_START, 0.09);
                var8.add(new EWC("<JPKMicro>", var10, new Long(var9.length)));
                var8.add(new EWC("<DokumentJPK>", var11, var3.length()));
                double var12 = 0.2;
                double var14 = 0.81;
                this.HPU(EQB.EQD.KD_SEND_START, var12);
                EWK var16 = EWH.MXE(EWP.POST, FEK.MWU, "esb2.mf.gov.pl", 5064, "/jpkmicro/UploadJPK", "jpkmicro", var8, null, null, new MML(), var7);
                EXF.getInstance().ICE("HttpSenderResult " + var16);
                if (var16.getStatus() == 200) {
                    this.HPU(EQB.EQD.KD_SEND_SUCCESS, var14);
                    JSONObject var17 = (JSONObject) var16.getContent();
                    this.FVQ.setKdResponseJSON(var17);
                    EXF.getInstance().ICE("KdResponseJSON.ReferenceNumber " + var17.get("ReferenceNumber"));
                    EXF.getInstance().ICE("KdResponseJSON.ReceiveDateTime " + var17.get("ReceiveDateTime"));
                    EXF.getInstance().ICE("KdResponseJSON.Code " + var17.get("Code"));
                    EXF.getInstance().ICE("KdResponseJSON.Message " + var17.get("Message"));
                    EXF.getInstance().ICE("KdResponseJSON.Errors " + var17.get("Errors"));
                    EXF.getInstance().ICE("KdResponseJSON.RequestId " + var17.get("RequestId"));
                    if (var17.containsKey("ReferenceNumber")) {
                        this.HPU(EQB.EQD.KD_SEND_SUCCESS, 0.85);
                        this.FVR = EQB.EQC.SUCCESS;
                        this.FVQ.setReferenceId((String) var17.get("ReferenceNumber"));
                        this.FVQ.setDeclarationStatus(HL.SENT);
                        String var18 = (String) var17.get("ReceiveDateTime");
                        String var19 = this.FVQ.getReferenceId() != null ? this.FVQ.getReferenceId() : this.FVQ.getDeclarationType().name() + "_" + this.FVQ.getDeclarationSubType().name() + "_" + this.FVQ.getId();
                        FCR.IGF(FCW.getInstance().getMessageForKey("micro.dialog.message.title"), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.status.message.header").replaceFirst("##REFERENCEID##", var19), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.kd_status.message.body").replaceFirst("##TIMESTAMP##", var18), true, 800.0, 300.0);
                        EXF.getInstance().ICA("Initial call for file [" + var4 + "] succeded! " + var19);
                    } else {
                        this.HPU(EQB.EQD.KD_SEND_FAILED, 0.85);
                        this.FVR = EQB.EQC.FAIL;
                        this.FVQ.setDeclarationStatus(HL.FAILURE);
                        File var31 = EXF.getInstance().getDefaultOutputLoggerFile();
                       String var20 = var17.get("Code") + " - " +
                               var17.get("Message") + " - " +
                               var17.get("Errors") + " - " +
                               var17.get("RequestId");
                        String var21 = this.FVQ.getReferenceId() != null ? this.FVQ.getReferenceId() : this.FVQ.getDeclarationType().name() + "_" + this.FVQ.getDeclarationSubType().name() + "_" + this.FVQ.getId();
                        FCR.IGJ(FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.status.message.header").replaceFirst("##REFERENCEID##", var21), var20 + " | " + FCW.getInstance().getMessageForKey("micro.sendout.main.step.init_checklogs"), var31, false);
                        EXF.getInstance().ICA("Initial call for file [" + var4 + "] failed! " + var20);
                    }
                } else {
                    this.HPU(EQB.EQD.KD_SEND_FAILED, var14);
                    this.FVR = EQB.EQC.FAIL;
                    this.FVQ.setDeclarationStatus(HL.FAILURE);
                    EXF.getInstance().ICA("Request status is " + var16.getStatus());
                    var1 = true;
                }
            } catch (Exception var26) {
                EXF.getInstance().ICA(var26);
                this.HPV(EQB.EQD.KD_SEND_FAILED, 0.9, var26.getClass().getName() + " " + var26.getLocalizedMessage());
                this.FVR = EQB.EQC.FAIL;
                this.FVQ.setDeclarationStatus(HL.FAILURE);
                var1 = true;
            }

            if (var1) {
                String var29 = this.FVQ.getReferenceId() != null ? this.FVQ.getReferenceId() : this.FVQ.getDeclarationType().name() + "_" + this.FVQ.getDeclarationSubType().name() + "_" + this.FVQ.getId();
                var3 = EXF.getInstance().getDefaultOutputLoggerFile();
                FCR.IGJ(FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.status.message.header").replaceFirst("##REFERENCEID##", var29), this.FVS.getDescription().replaceFirst("##REASON##", this.MWL) + " " + FCW.getInstance().getMessageForKey("micro.sendout.main.step.init_checklogs"), var3, false);
            }

            var30 = this.FVR;
        } catch (Exception var27) {
            this.HPV(EQB.EQD.PROCESS_FAILED, 0.0, var27.getLocalizedMessage());
            this.FVR = EQB.EQC.FAIL;
            EXF.getInstance().ICA(var27);
            FCR.IGP("", var27, false);
            throw new FFI(var27);
        } finally {
            EXF.getInstance().ICP();
        }

        return var30;
    }

    private byte[] MXB(MME<Boolean, String, String, String, LocalDate, BigDecimal, String> var1) throws FFO, FFK {
        EXF.getInstance().ICO();

        byte[] var7;
        try {
            ObjectFactory var2 = new ObjectFactory();
            JPKMicro var3 = var2.createJPKMicro();
            DaneAutoryzujace var4 = var2.createDaneAutoryzujace();
            var3.setDaneAutoryzujace(var4);
            if (var1.getFirstValue() == null || var1.getSecondValue() == null) {
                throw new FFO("NIP or PESEL must be present!");
            }

            if (var1.getFirstValue()) {
                var4.setPESEL(var1.getSecondValue());
            } else {
                var4.setNIP(var1.getSecondValue());
            }

            var4.setImiePierwsze(var1.getThirdValue());
            var4.setNazwisko(var1.getFourthValue());
            var4.setDataUrodzenia(this.MXC(var1.getFifthValue()));
            var4.setKwota(var1.getSixthValue());
            var3.setEmail(var1.getSeventhValue());
            FEO var5 = new FEO(false, false, StandardCharsets.UTF_8, JPKMicro.class);
            byte[] var6 = var5.IKU(var3);
            var7 = var6;
        } catch (JAXBException | DatatypeConfigurationException var11) {
            EXF.getInstance().ICA(var11);
            throw new FFK(var11);
        } finally {
            EXF.getInstance().ICP();
        }

        return var7;
    }

    private XMLGregorianCalendar MXC(LocalDate var1) throws DatatypeConfigurationException {
        EXF.getInstance().ICO();

        GregorianCalendar var2;
        try {
            if (var1 != null) {
                var2 = GregorianCalendar.from(var1.atStartOfDay(ZoneId.systemDefault()));
                XMLGregorianCalendar var3 = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(var2.get(1), var2.get(2) + 1, var2.get(5), -2147483648);
                return var3;
            }

            return null;
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public enum EQD {
        START(FCW.getInstance().getMessageForKey("micro.sendout.main.step.start")),
        INIT_START(FCW.getInstance().getMessageForKey("micro.sendout.main.step.init_start")),
        INIT_SUCCESS(FCW.getInstance().getMessageForKey("micro.sendout.main.step.init_success")),
        INIT_BAD_REQUEST(FCW.getInstance().getMessageForKey("micro.sendout.main.step.init_bad_request")),
        INIT_SERVER_ERROR(FCW.getInstance().getMessageForKey("micro.sendout.main.step.init_server_error")),
        INIT_FAILED_OTHER(FCW.getInstance().getMessageForKey("micro.sendout.main.step.init_failed_other")),
        UPLOAD_START(FCW.getInstance().getMessageForKey("micro.sendout.main.step.upload_start")),
        UPLOAD_SUCCESS(FCW.getInstance().getMessageForKey("micro.sendout.main.step.upload_success")),
        UPLOAD_FAILED(FCW.getInstance().getMessageForKey("micro.sendout.main.step.upload_failed")),
        FINISH_START(FCW.getInstance().getMessageForKey("micro.sendout.main.step.finish_start")),
        FINISH_SUCCESS(FCW.getInstance().getMessageForKey("micro.sendout.main.step.finish_success")),
        FINISH_BAD_REQUEST(FCW.getInstance().getMessageForKey("micro.sendout.main.step.finish_bad_request")),
        FINISH_SERVER_ERROR(FCW.getInstance().getMessageForKey("micro.sendout.main.step.finish_server_error")),
        FINISH_FAILED_OTHER(FCW.getInstance().getMessageForKey("micro.sendout.main.step.finish_failed_other")),
        STATUS_START(FCW.getInstance().getMessageForKey("micro.sendout.main.step.status_start")),
        STATUS_SUCCESS(FCW.getInstance().getMessageForKey("micro.sendout.main.step.status_success")),
        STATUS_FAILED(FCW.getInstance().getMessageForKey("micro.sendout.main.step.status_failed")),
        PROCESS_FAILED(FCW.getInstance().getMessageForKey("micro.sendout.main.step.process_failed")),
        KD_SEND_START(FCW.getInstance().getMessageForKey("micro.sendout.main.step.kd_send_start")),
        KD_SEND_SUCCESS(FCW.getInstance().getMessageForKey("micro.sendout.main.step.kd_send_success")),
        KD_SEND_FAILED(FCW.getInstance().getMessageForKey("micro.sendout.main.step.kd_send_failed"));

        private final String FVO;

        EQD(String var3) {
            this.FVO = var3;
        }

        public String getDescription() {
            return this.FVO;
        }
    }

    public enum EQC {
        INIT(FCW.getInstance().getMessageForKey("micro.sendout.main.status.INIT")),
        RUNNING(FCW.getInstance().getMessageForKey("micro.sendout.main.status.RUNNING")),
        SUCCESS(FCW.getInstance().getMessageForKey("micro.sendout.main.status.SUCCESS")),
        FAIL(FCW.getInstance().getMessageForKey("micro.sendout.main.status.FAIL")),
        CAN_BE_RESTARTED(FCW.getInstance().getMessageForKey("micro.sendout.main.status.CAN_BE_RESTARTED"));

        private final String MWK;

        EQC(String var3) {
            this.MWK = var3;
        }

        public String getDescription() {
            return this.MWK;
        }
    }
}
