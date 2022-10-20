package a.a.a.c.f.a.d;

import a.a.a.b.d.FEP;
import a.a.a.b.e.a.FEQ;
import a.a.a.b.e.a.a.FET;
import a.a.a.b.e.a.a.FEU;
import a.a.a.b.f.FFI;
import a.a.a.b.f.a.FFL;
import a.a.a.b.f.a.FFM;
import a.a.a.c.f.a.c.a.ActionResult;
import a.a.a.c.f.b.c.Bytes;
import a.a.a.c.f.b.c.Text;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.annotation.XmlTransient;
import org.json.simple.JSONObject;
import org.w3c.dom.Node;
import pl.akmf.apps.micro.jaxb.upo.v1_6.Potwierdzenie;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@XmlTransient
public abstract class DeclarationJPK extends Declaration {
    private InitUploadDocumentType AHRP;
    private JPKSchemaType AHRQ;
    private transient File AHRR;
    private Boolean AHRS;
    private Text AHRT;
    private String AHRU;
    private transient File AHRV;
    private transient FFL AHRW;
    private transient FFL AHRX;
    private ActionResult AHRY;
    private Bytes AHRZ;
    private Bytes AHSA;
    private transient File AHSB;
    private String AHSC;
    private List<ZipFileEntry> AHSD;
    private Bytes AHSE;
    private Boolean AHSF;
    private Bytes AHSG;
    private Boolean AHSH;
    private String AHSI;
    private transient JSONObject AHSJ;
    private JSONString AHSK;
    private FinishUploadResponseStatus AHSL;
    private JSONString AHSM;
    private transient JSONObject AHSN;
    private JSONString AHSO;
    private Potwierdzenie AHSP;
    private String AHSQ;
    private transient JSONObject MWB;
    private JSONString MWC;
    private FFM AHSR;

    public DeclarationJPK(DeclarationSubtype var1, Integer var2) {
        super(DeclarationType.JPK, var1, var2);

    }

    public DeclarationJPK() {
        this(null, 0);

    }

    public DeclarationJPK(DeclarationSubtype var1, Integer var2, File var3, JPKSchemaType var4) {
        this(var1, var2);

        this.AHRR = var3;
        if (this.AHRR == null) {
            throw new FFI("DeclarationFile cannot be empty!");
        }

        this.AHRU = this.AHRR.getName();
        this.AHRT = new Text(this.AHRR.getAbsolutePath());
        this.AHRQ = var4;
        this.AHSD = new ArrayList();
        if (this.AHRQ == null) {
            throw new FFI("DeclarationFileSchema cannot be empty!");
        }

        if (!"JPK_VAT".equals(this.AHRQ.getKodFormularza()) && !"JPK_PKPIR".equals(this.AHRQ.getKodFormularza())) {
            this.AHRP = InitUploadDocumentType.JPKAH;
        } else {
            this.AHRP = InitUploadDocumentType.JPK;
        }

    }

    public InitUploadDocumentType getInitUploadDocumentType() {
        return this.AHRP;
    }

    public JPKSchemaType getDeclarationFileSchema() {
        return this.AHRQ;
    }

    public File getDeclarationFile() {
        return this.AHRR;
    }

    public Boolean getDeclarationFileValid() {
        return this.AHRS != null ? this.AHRS : false;
    }

    public void setDeclarationFileValid(Boolean var1) {
        this.AHRS = var1;
    }

    public String getDeclarationFileName() {
        return this.AHRU;
    }

    public Text getDeclarationFilePath() {
        return this.AHRT;
    }

    public File getContextDir() {
        return this.AHRV;
    }

    public void setContextDir(File var1) {
        this.AHRV = var1;
    }

    public FFL getDeclarationFileValidationReportFileContainer() {
        return this.AHRW;
    }

    public void setDeclarationFileValidationReportFileContainer(FFL var1) {
        this.AHRW = var1;
    }

    public FFL getDeclarationFileVerificationReportFileContainer() {
        return this.AHRX;
    }

    public void setDeclarationFileVerificationReportFileContainer(FFL var1) {
        this.AHRX = var1;
    }

    public ActionResult getDeclarationFileVerificationResult() {
        return this.AHRY;
    }

    public void setDeclarationFileVerificationResult(ActionResult var1) {
        this.AHRY = var1;
    }

    public Bytes getDeclarationFileCheckSumMD5() {
        return this.AHRZ;
    }

    public void setDeclarationFileCheckSumMD5(Bytes var1) {
        this.AHRZ = var1;
    }

    public Bytes getDeclarationFileSHA256CheckSum() {
        return this.AHSA;
    }

    public void setDeclarationFileSHA256CheckSum(Bytes var1) {
        this.AHSA = var1;
    }

    public void setZipFile(File var1) {
        this.AHSB = var1;
        if (this.AHSB != null) {
            this.AHSC = this.AHSB.getName();
        }

    }

    public File getZipFile() {
        return this.AHSB;
    }

    public String getZipFileName() {
        return this.AHSC;
    }

    public List<ZipFileEntry> getZipFileList() {
        return this.AHSD;
    }

    public Bytes getInitUploadSignedFile() {
        return this.AHSE;
    }

    public void setInitUploadSignedFile(Bytes var1) {
        this.AHSE = var1;
    }

    public Boolean getInitUploadSignedFileValid() {
        return this.AHSF != null ? this.AHSF : false;
    }

    public void setInitUploadSignedFileValid(Boolean var1) {
        this.AHSF = var1;
    }

    public Bytes getInitUploadSignedEnvelopedFile() {
        return this.AHSG;
    }

    public void setInitUploadSignedEnvelopedFile(Bytes var1) {
        this.AHSG = var1;
    }

    public Boolean getInitUploadSignedEnvelopedFileValid() {
        return this.AHSH != null ? this.AHSH : false;
    }

    public void setInitUploadSignedEnvelopedFileValid(Boolean var1) {
        this.AHSH = var1;
    }

    public String getReferenceId() {
        return this.AHSI;
    }

    public void setReferenceId(String var1) {
        this.AHSI = var1;
    }

    public JSONString getInitUploadSignedResponseJSON() {
        return this.AHSK;
    }

    public void setInitUploadSignedResponseJSON(JSONObject var1) {
        this.AHSJ = var1;
        this.AHSK = new JSONString(var1);
    }

    public JSONObject getInitUploadSignedResponseJSONObject() {
        return this.AHSJ;
    }

    public FinishUploadResponseStatus getFinishUploadResponseStatus() {
        return this.AHSL;
    }

    public void setFinishUploadResponseStatus(FinishUploadResponseStatus var1) {
        this.AHSL = var1;
    }

    public JSONString getFinishUploadResponseJSON() {
        return this.AHSM;
    }

    public void setFinishUploadResponseJSON(JSONObject var1) {
        this.AHSM = new JSONString(var1);
    }

    public JSONString getStatusResponseJSON() {
        return this.AHSO;
    }

    public void setStatusResponseJSON(JSONObject var1) {
        this.AHSN = var1;
        this.AHSO = new JSONString(var1);
    }

    public JSONObject getStatusResponseJSONObject() {
        return this.AHSN;
    }

    public Potwierdzenie getUpo() {
        return this.AHSP;
    }

    public void setUpo(String var1) throws FEU, FET, JAXBException {
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("upoString " + var1);
        byte[] var2 = var1.getBytes(StandardCharsets.UTF_8);
        FEQ.IKY(var2);
        Node var3 = FEQ.getObject(var2, "Potwierdzenie");
        FEP var4 = new FEP(Potwierdzenie.class);
        Potwierdzenie var5 = var4.IKV(var3, Potwierdzenie.class);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("potwierdzenie " + var5);
        this.AHSP = var5;
        Node var6 = FEQ.getObject(var2, "xades:QualifyingProperties");

        for (int var7 = 0; var7 < var6.getChildNodes().getLength(); ++var7) {
            Node var8 = var6.getChildNodes().item(var7);
            if ("xades:SignedProperties".equals(var8.getNodeName())) {
                for (int var9 = 0; var9 < var8.getChildNodes().getLength(); ++var9) {
                    Node var10 = var8.getChildNodes().item(var9);
                    if ("xades:SignedSignatureProperties".equals(var10.getNodeName())) {
                        for (int var11 = 0; var11 < var10.getChildNodes().getLength(); ++var11) {
                            Node var12 = var10.getChildNodes().item(var11);
                            if ("xades:SigningTime".equals(var12.getNodeName())) {
                                org.slf4j.LoggerFactory.getLogger(getClass()).debug(var12.getNodeName() + " " + var12.getTextContent());
                                this.AHSQ = var12.getTextContent();
                            }
                        }
                    }
                }
            }
        }

    }

    public void setUpo(Potwierdzenie var1) {
        this.AHSP = var1;
    }

    public String getUpoSigningTime() {
        return this.AHSQ;
    }

    public void setKdResponseJSON(JSONObject var1) {
        this.MWB = var1;
        this.MWC = new JSONString(var1);
    }

    public JSONObject getKdResponseJSONObject() {
        return this.MWB;
    }

    public JSONString getKdResponseJSON() {
        return this.MWC;
    }

    public FFM getExceptions() {
        return this.AHSR;
    }

    public void setExceptions(FFM var1) {
        this.AHSR = var1;
    }

    public String toString() {
        return "DeclarationJPK [toString()=" + super.toString() + "]";
    }
}
