package a.a.a.c.c.b;

import a.a.a.b.DateFormat;
import a.a.a.b.a.DbUtils;
import a.a.a.b.a.a.OrderType;
import a.a.a.b.a.a.SqlOperation;
import a.a.a.b.e.FEY;
import a.a.a.b.e.FFF;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.d.EQQ;
import com.github.bademux.emk.Application;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.e.a.e.EWF;
import a.a.a.c.f.a.a.Dictionary;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.d.DeclarationSubtype;
import a.a.a.c.f.a.d.Declaration;
import a.a.a.c.f.a.d.DeclarationType;
import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.a.e.InvoiceSubtype;
import a.a.a.c.f.a.e.InvoiceType;
import a.a.a.c.f.a.e.a.InvoiceRecord;
import a.a.a.c.f.a.e.a.InvoiceRecordType;
import a.a.a.c.f.a.f.a.ReceiptRecord;
import a.a.a.c.f.a.f.a.RecordType;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.SettlementStatus;
import a.a.a.c.f.a.h.SettlementType;
import a.a.a.c.f.a.h.SettlementVat;
import a.a.a.c.f.a.n.InvoiceOther;
import a.a.a.c.f.a.n.InvoiceOtherSubtype;
import a.a.a.c.f.a.n.InvoiceOtherType;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.*;
import a.a.a.c.f.b.c.a.LoginType;
import a.a.a.c.f.b.c.a.InvoiceState;
import a.a.a.c.f.c.LW;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.b.SimpleUserData;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.c.FCZ;

import javax.crypto.NoSuchPaddingException;
import java.io.File;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EMB {
    private final String FGL = " !\"#\\$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
    private final int QNV = 5;
    private static volatile EMB FGM;
    private final EMX FGN;
    private FFF FGO;
    private SimpleUserData FGP;
    private String FGQ;
    private Map<String, SimpleUserData> FGR;
    private final Map<Period, Map<String, Integer>> FGS;
    private boolean FGT;

    public static EMB getInstance() throws FFK {
        if (FGM == null) {
            Class var0 = EMB.class;
            synchronized (EMB.class) {
                if (FGM == null) {
                    FGM = new EMB();
                }
            }
        }

        return FGM;
    }

    private EMB() throws FFK {

        this.FGN = new EMX();
        this.FGS = new HashMap();
        this.FGT = true;

    }

    protected void finalize() throws Throwable {
        if (this.FGN != null) {
            this.FGN.HMV();
        }

        this.FGR = null;
    }

    public void setMaximizeWindow(boolean var1) {
        this.FGT = var1;
    }

    public boolean HHO() {
        return this.FGT;
    }

    public int getMaxAllowedNumberOfUsers() throws FFK {

        byte var1;
        var1 = 5;

        return var1;
    }

    public Set<String> HHP() throws FFK {

        Set var1;
        if (this.FGR == null) {
            this.resetSimpleUserData();
        }

        var1 = this.FGR.keySet();

        return var1;
    }

    public String getName() throws FFK {

        String var2;
        Set var1 = this.HHP();
        if (var1.size() == 0) {
            var2 = null;
            return var2;
        }

        if (var1.size() < 1) {
            throw new FFK("Database corruption! Delete files " + Application.getHomeDir() + "/*." + DbUtils.DB_FILE_EXT);
        }

        var2 = (String) var1.iterator().next();

        return var2;
    }

    public SimpleUserData getSimpleUserDataForUserName(String var1) throws FFK {

        SimpleUserData var3;
        if (this.FGR == null) {
            this.resetSimpleUserData();
        }

        String var2 = var1.toLowerCase();
        var3 = this.FGR.get(var2);

        return var3;
    }

    public synchronized boolean HHQ(String var1, boolean var2, String var3, String var4) throws FFO, FFK {

        boolean var23;
        try {
            if (var1 == null || var1.length() < 3) {
                throw FCZ.getInstance().IGZ();
            }

            if (this.HHP().size() >= 5) {
                throw FCZ.getInstance().QNY();
            }

            if (var2) {
                if (var3 == null || var3.length() < 3 || !var3.equals(var4)) {
                    throw FCZ.getInstance().IHA();
                }

                boolean var5 = true;
                StringBuilder var6 = new StringBuilder();
                char[] var7 = var3.toCharArray();
                int var8 = var7.length;
                int var9 = 0;

                while (true) {
                    if (var9 >= var8) {
                        if (!var5) {
                            throw FCZ.getInstance().IHB(var6.toString(), " !\"#\\$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~");
                        }
                        break;
                    }

                    char var10 = var7[var9];
                    if (var10 < ' ' || var10 > '~') {
                        var5 = false;
                        var6.append(var10);
                    }

                    ++var9;
                }
            }

            if (this.FGR == null) {
                this.resetSimpleUserData();
            }

            String var16 = var1.toLowerCase();
            SimpleUserData var17 = this.FGR.get(var16);
            if (var17 != null) {
                throw FCZ.getInstance().IHC();
            }

            Bytes var18 = null;
            Bytes var19 = null;
            if (var2) {
                byte[] var20 = FEY.getInstance().ILB();
                byte[] var22 = FEY.getInstance().ILC(var3.toCharArray(), var20);
                var18 = new Bytes(var20);
                var19 = new Bytes(var22);
            }

            SimpleUserData var21 = new SimpleUserData(new Text(var16), new JZ(LoginType.NIP), new PrivtePerson(var2), var18, var19, false);
            this.FGN.HLI(var21);
            this.FGR.put(var16, var21);
            this.FGN.HLD();
            var23 = true;
        } catch (InvalidKeySpecException | NoSuchAlgorithmException var14) {
            this.FGR = null;
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var14);
            this.FGN.HLE();
            throw new FFK(var14);
        }

        return var23;
    }

    public synchronized boolean login(String username, String password) throws FFO, FFK {

        try {
            if (username != null && username.length() >= 3) {
                if (this.FGR == null) {
                    this.resetSimpleUserData();
                }

                String lowercaseUserName = username.toLowerCase();
                SimpleUserData var4 = this.FGR.get(lowercaseUserName);
                if (var4 != null) {
                    boolean var5 = false;
                    if (var4.getUsePassword().getValue()) {
                        if (FEY.getInstance().ILA(var4.getPassword().getValue(), password.toCharArray(), var4.getSalt().getValue())) {
                            this.FGO = new FFF(password.toCharArray());
                            var5 = true;
                        }
                    } else {
                        var5 = true;
                    }

                    if (!var5) {
                        this.FGP = null;
                        this.FGQ = null;
                    } else {
                        this.FGP = var4;
                        this.FGQ = this.FGP.getUsername().getValue();
                        if (this.FGP.getPasswordChanged() != null && this.FGP.getPasswordChanged() > 0) {
                            try {
                                this.FGN.QQB(lowercaseUserName, false);
                                var4.setPasswordChanged(false);
                                this.FGN.HLJ(var4);
                                this.FGN.HLD();
                            } catch (Exception var11) {
                                this.FGN.HLE();
                                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var11);
                            }
                        } else if (!this.FGN.HKU(lowercaseUserName, lowercaseUserName + EMX.POSTFIX_NEW, false)) {
                            throw new FFI("Cleanup failed");
                        }

                        this.FGN.initConnection(this.FGO, lowercaseUserName);
                    }

                    boolean var6 = var5;
                    return var6;
                } else {
                    throw FCZ.getInstance().IHA();
                }
            } else {
                throw FCZ.getInstance().IGZ();
            }
        } catch (NoSuchPaddingException | InvalidKeySpecException | NoSuchAlgorithmException var12) {
            this.FGR = null;
            this.FGP = null;
            this.FGQ = null;
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var12);
            throw new FFK(var12);
        }
    }

    public synchronized void HHS() throws FFK {

        this.FGN.HKY(this.FGP.getUsername().getValue().toLowerCase());
        this.FGP = null;
        this.FGQ = null;
        this.FGO = null;
        this.FGT = true;

    }

    public boolean HHT() {

        boolean var1;
        var1 = this.FGP != null;

        return var1;
    }

    public SimpleUserData getCurrentUser() {

        SimpleUserData var1;
        var1 = this.FGP;

        return var1;
    }

    public String getApplicationTitle(String var1) {

        String var3;
        String var2 = "";
        if (this.FGP != null) {
            if (this.FGP.DFA().getValue() != null) {
                var2 = this.FGP.DFA().getValue().getDescription();
            }

            if (this.FGP.DEZ().getValue() != null) {
                if (var2.length() > 0) {
                    var2 = var2 + " ";
                }

                var2 = var2 + this.FGP.DEZ().getValue();
            }
        }

        var3 = var1 + " " + var2;

        return var3;
    }

    private void resetSimpleUserData() throws FFK {

        this.FGR = this.FGN.HLH();

    }

    public ConfigurationProperties HHU() throws FFK {

        ConfigurationProperties var2;
        ConfigurationProperties var1 = this.FGN.HLM(this.FGO, this.FGQ, ConfigurationProperties.class);
        if (var1 == null) {
            var1 = new ConfigurationProperties();
            this.FGN.HME(SqlOperation.insert, this.FGO, this.FGQ, var1);
        }

        var2 = var1;

        return var2;
    }

    public UserData HHV() throws FFK {

        UserData var1;
        var1 = this.HHW(null);

        return var1;
    }

    public UserData HHW(Integer var1) throws FFK {

        UserData var3;
        UserData var2 = this.FGN.HLN(this.FGO, this.FGQ, UserData.class, var1);
        var3 = var2;

        return var3;
    }

    public void ROK(SqlOperation var1, ConfigurationProperties var2, boolean var3) throws FFK {

        this.HHZ(var1, var2);
        if (var3) {
            this.FGN.HLD();
        }

    }

    public void HHY(SqlOperation var1, UserData var2) throws FFK {

        this.HHZ(var1, var2);

    }

    private void HHZ(SqlOperation var1, LW var2) throws FFK {

        this.FGN.HME(var1, this.FGO, this.FGQ, var2);

    }

    public void HIA(SqlOperation var1, Invoice<?> var2) throws FFK, FFO {

        this.HIB(var1, var2);

    }

    private void HIB(SqlOperation var1, Invoice<?> var2) throws FFK, FFO {

        Period var3 = var2.getPeriod();
        SettlementType var4 = SettlementType.VAT;
        if (var3 == null || var3.getYear() == null || var3.getYear().getValue() == null || var3.getMonth() == null || var3.getMonth().getValue() == null) {
            throw new FFO("Period cannot be NULL!");
        }

        this.HIC(var3, var4);
        Period var5 = var2.getPreviousPeriod();
        if (var5 != null && var5.getYear() != null && var5.getYear().getValue() != null && var5.getMonth() != null && var5.getMonth().getValue() != null && !var5.equals(var3)) {
            this.HIC(var5, var4);
        }

        this.FGN.HMF(var1, this.FGO, var2);

    }

    public void ROL(EDF<?> var1) throws FFK, FFO {

        Invoice var2 = (Invoice) var1.getModelBaseElementWithIdObject();
        Period var3 = var2.getPeriod();
        SettlementType var4 = SettlementType.VAT;
        if (var3 == null || var3.getYear() == null || var3.getYear().getValue() == null || var3.getMonth() == null || var3.getMonth().getValue() == null) {
            throw new FFO("Period cannot be NULL!");
        }

        this.HIC(var3, var4);
        Period var5 = var2.getPreviousPeriod();
        if (var5 != null && var5.getYear() != null && var5.getYear().getValue() != null && var5.getMonth() != null && var5.getMonth().getValue() != null && !var5.equals(var3)) {
            this.HIC(var5, var4);
        }

        this.FGN.ROD(EntityName.INVOICES, var1);

    }

    private void HIC(Period var1, SettlementType var2) throws FFK, FFO {

        ValueContainer2 var3 = this.FGN.HLQ(this.FGO, null, null, null, var1.DDN(), var2);
        SettlementVat var4;
        if (var3 != null && var3.getSecondValue() != null && ((List) var3.getSecondValue()).size() != 0) {
            if (var3 == null || var3.getSecondValue() == null || ((List) var3.getSecondValue()).size() != 1) {
                throw new FFK("Settlement duplicate! [" + var1 + "] [SettlementType " + var2 + "]");
            }

            var4 = (SettlementVat) ((EDF) ((List) var3.getSecondValue()).get(0)).getModelBaseElementWithIdObject();
            SettlementStatus var5 = var4.getSettlementStatus();
            switch (var5) {
                case NEW:
                    break;
                case CANCELED_CHANGED:
                case CANCELED_UNCHANGED:
                    SettlementVat var6 = new SettlementVat();
                    var6.setPeriod(var1.DDN());
                    this.HII(SqlOperation.insert, var6, var4);
                    break;
                case SETTLED:
                    throw new FFO("Settlement closed! [" + var1 + "] [SettlementType " + var4.getSettlementType().name() + "] [SettlementStatus " + var5.name() + "]");
                default:
                    throw new FFI("Unimplemented type [SettlementStatus " + var5.name() + "]!");
            }
        } else {
            var4 = new SettlementVat();
            var4.setPeriod(var1.DDN());
            this.HII(SqlOperation.insert, var4, null);
        }

    }

    public ValueContainer2<Integer, List<EDF<Invoice<?>>>> ROM(InvoiceState var1, OrderType var2, Integer var3, Integer var4, Period var5, InvoiceType var6, InvoiceSubtype var7, RefId var8, Nip var9, Nip var10, ValueContainer2<Date, Date> var11, ValueContainer2<Date, Date> var12, String var13) throws FFK, FFO {

        ValueContainer2 var14;
        var14 = this.FGN.ROB(this.FGO, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);

        return var14;
    }

    public void RON(SqlOperation var1, InvoiceOther<?> var2) throws FFK, FFO {

        this.ROO(var1, var2);

    }

    private void ROO(SqlOperation var1, InvoiceOther<?> var2) throws FFK, FFO {

        Period var3 = var2.getPeriod();
        SettlementType var4 = SettlementType.VAT;
        if (var3 == null || var3.getYear() == null || var3.getYear().getValue() == null || var3.getMonth() == null || var3.getMonth().getValue() == null) {
            throw new FFO("Period cannot be NULL!");
        }

        this.HIC(var3, var4);
        Period var5 = var2.getPreviousPeriod();
        if (var5 != null && var5.getYear() != null && var5.getYear().getValue() != null && var5.getMonth() != null && var5.getMonth().getValue() != null && !var5.equals(var3)) {
            this.HIC(var5, var4);
        }

        this.FGN.ROE(var1, this.FGO, var2);

    }

    public void ROP(EDF<?> var1) throws FFK, FFO {

        InvoiceOther var2 = (InvoiceOther) var1.getModelBaseElementWithIdObject();
        Period var3 = var2.getPeriod();
        SettlementType var4 = SettlementType.VAT;
        if (var3 == null || var3.getYear() == null || var3.getYear().getValue() == null || var3.getMonth() == null || var3.getMonth().getValue() == null) {
            throw new FFO("Period cannot be NULL!");
        }

        this.HIC(var3, var4);
        Period var5 = var2.getPreviousPeriod();
        if (var5 != null && var5.getYear() != null && var5.getYear().getValue() != null && var5.getMonth() != null && var5.getMonth().getValue() != null && !var5.equals(var3)) {
            this.HIC(var5, var4);
        }

        this.FGN.ROD(EntityName.INVOICESOTHER, var1);

    }

    public ValueContainer2<Integer, List<EDF<InvoiceOther<?>>>> ROQ(InvoiceState var1, OrderType var2, Integer var3, Integer var4, Period var5, InvoiceOtherType var6, InvoiceOtherSubtype var7, RefId var8, Nip var9, Nip var10, ValueContainer2<Date, Date> var11, ValueContainer2<Date, Date> var12, String var13) throws FFK, FFO {

        ValueContainer2 var14;
        var14 = this.FGN.ROC(this.FGO, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);

        return var14;
    }

    public void HIE(SqlOperation var1, ReceiptRecord var2) throws FFK, FFO {

        this.HIF(var1, var2);

    }

    private void HIF(SqlOperation var1, ReceiptRecord var2) throws FFK, FFO {

        SettlementType var3 = SettlementType.VAT;
        Period var4 = var2.getPeriod();
        if (var4 == null || var4.getYear() == null || var4.getYear().getValue() == null || var4.getMonth() == null || var4.getMonth().getValue() == null) {
            throw new FFO("Period cannot be NULL!");
        }

        this.HIC(var4, SettlementType.VAT);
        Period var5 = var2.getPreviousPeriod();
        if (var5 != null && var5.getYear() != null && var5.getYear().getValue() != null && var5.getMonth() != null && var5.getMonth().getValue() != null && !var5.equals(var4)) {
            this.HIC(var5, var3);
        }

        this.FGN.HMG(var1, this.FGO, var2);

    }

    public ValueContainer2<Integer, List<EDF<ReceiptRecord>>> HIG(OrderType var1, Integer var2, Integer var3, Period var4, RecordType var5) throws FFK, FFO {

        ValueContainer2 var6;
        var6 = this.FGN.HLP(this.FGO, var1, var2, var3, var4, var5);

        return var6;
    }

    public void HIH(SqlOperation var1, Settlement var2) throws FFK {

        this.HII(var1, var2, null);

    }

    private void HII(SqlOperation var1, Settlement var2, Settlement var3) throws FFK {

        Period var4 = var2.getPeriod();
        SettlementType var5 = var2.getSettlementType();
        ValueContainer2 var8;
        switch (var1) {
            case insert:
                Integer var6 = this.FGN.getMaxDocumentIndex_Settlements(var4, var5);
                var2.FJI().setValue(var6);
            case update:
                boolean var7 = var2.DCP();
                var2.DCQ();
                this.FGN.HMH(var1, this.FGO, var2, var3);
                if (var7) {
                    var8 = this.FGN.ROB(this.FGO, InvoiceState.ACTIVE, null, null, null, var4, null, null, null, null, null, null, null, null);
                    ValueContainer2 var20 = this.FGN.HLP(this.FGO, null, null, null, var4, null);
                    ValueContainer2 var19 = this.FGN.ROC(this.FGO, InvoiceState.ACTIVE, null, null, null, var4, null, null, null, null, null, null, null, null);
                    UserData var11 = this.HHV();
                    Set var12 = EQQ.RHZ(var4, var11, (List) var8.getSecondValue(), (List) var20.getSecondValue(), (List) var19.getSecondValue());
                    Iterator var13 = var12.iterator();

                    while (var13.hasNext()) {
                        InvoiceRecord var14 = (InvoiceRecord) var13.next();
                        Integer var15 = this.FGN.getMaxDocumentIndex_InvoiceRecords(var4, var14.getInvoiceRecordType());
                        var14.FJI().setValue(var15);
                        this.HIS(SqlOperation.insert, var14, var2);
                    }
                }
                break;
            case delete:
                var8 = this.FGN.HLV(this.FGO, null, null, null, var4, null);
                Iterator var9 = ((List) var8.getSecondValue()).iterator();

                while (var9.hasNext()) {
                    EDF var10 = (EDF) var9.next();
                    this.HIS(SqlOperation.delete, (InvoiceRecord) var10.getModelBaseElementWithIdObject(), var2);
                }

                this.FGN.HMH(var1, this.FGO, var2, null);
                break;
            default:
                throw new FFK("Unsupported action type [" + var1 + "]!");
        }

    }

    public ValueContainer2<Integer, List<EDF<Settlement>>> HIJ(OrderType var1, Integer var2, Integer var3, Period var4, SettlementType var5) throws FFK, FFO {

        ValueContainer2 var6;
        var6 = this.FGN.HLQ(this.FGO, var1, var2, var3, var4, var5);

        return var6;
    }

    public void HIK(SqlOperation var1, Declaration var2, Settlement var3) throws FFK {

        this.HIL(var1, var2, var3);

    }

    private void HIL(SqlOperation var1, Declaration var2, Settlement var3) throws FFK {

        this.FGN.HMI(var1, this.FGO, var2, var3);

    }

    public ValueContainer2<Integer, List<EDF<Declaration>>> HIM(OrderType var1, Integer var2, Integer var3, Period var4, DeclarationType var5, DeclarationSubtype var6) throws FFK, FFO {

        ValueContainer2 var7;
        var7 = this.FGN.HLR(this.FGO, var1, var2, var3, var4, var5, var6);

        return var7;
    }

    public ValueContainer2<Integer, List<EDF<Declaration>>> QQI(OrderType var1, Integer var2, Integer var3, Settlement var4, Period var5, DeclarationType var6, DeclarationSubtype var7) throws FFK, FFO {

        ValueContainer2 var8;
        var8 = this.FGN.QPW(this.FGO, var1, var2, var3, var4, var5, var6, var7);

        return var8;
    }

    public Integer getMaxDocumentIndexForDeclarations(Period var1, DeclarationType var2, DeclarationSubtype var3) throws FFK {

        Integer var4;
        var4 = this.FGN.getMaxDocumentIndex_Declarations(var1, var2, var3);

        return var4;
    }

    public void HIO(SqlOperation var1, Contractor var2) throws FFK {

        this.HIP(var1, var2);

    }

    private void HIP(SqlOperation var1, Contractor var2) throws FFK {

        this.FGN.HMK(var1, this.FGO, var2);

    }

    public ValueContainer2<Integer, List<EDF<Contractor>>> QQJ(OrderType var1, Integer var2, String var3) throws FFK {

        ValueContainer2 var4;
        var4 = this.FGN.QPX(this.FGO, var1, var2, var3);

        return var4;
    }

    public void HIR(SqlOperation var1, InvoiceRecord var2, Settlement var3) throws FFK {

        this.HIS(SqlOperation.insert, var2, var3);

    }

    private void HIS(SqlOperation var1, InvoiceRecord var2, Settlement var3) throws FFK {

        this.FGN.HMJ(var1, this.FGO, var2, var3);

    }

    public ValueContainer2<Integer, List<EDF<InvoiceRecord>>> HIT(OrderType var1, Integer var2, Integer var3, Period var4, InvoiceRecordType var5) throws FFK, FFO {

        ValueContainer2 var6;
        var6 = this.FGN.HLV(this.FGO, var1, var2, var3, var4, var5);

        return var6;
    }

    public ValueContainer2<Integer, List<EDF<InvoiceRecord>>> QQK(OrderType var1, Integer var2, Integer var3, Settlement var4, Period var5, InvoiceRecordType var6) throws FFK, FFO {

        ValueContainer2 var7;
        var7 = this.FGN.QPY(this.FGO, var1, var2, var3, var4, var5, var6);

        return var7;
    }

    public Integer getMaxDocumentIndexForInvoiceRecords(Period var1, InvoiceRecordType var2) throws FFK {

        Integer var3;
        var3 = this.FGN.getMaxDocumentIndex_InvoiceRecords(var1, var2);

        return var3;
    }

    public void HIV(SqlOperation var1, Dictionary var2) throws FFK {

        this.HIW(var1, var2);

    }

    private void HIW(SqlOperation var1, Dictionary var2) throws FFK {

        this.FGN.HMP(var1, var2);

    }

    public List<Dictionary> HIX(String var1, String var2) throws FFK, FFO {

        List var3;
        var3 = this.FGN.HMQ(var1, var2);

        return var3;
    }

    public void HIY() throws FFK {

        this.FGN.HLD();
        this.FGN.HLF();

    }

    public void HIZ() throws FFK {

        this.FGN.HLE();
        this.FGN.HLG();

    }

    public Map<String, Map<Period, Integer>> getSequences() throws FFK {

        Map var1;
        var1 = this.FGN.getSequences();

        return var1;
    }

    public void ROR(Period var1, String var2, Integer var3, Integer var4) throws FFK {

        this.FGN.ROF(var1, var2, var3, var4);

    }

    public String getReferenceByPattern(Date var1, String var2) throws FFK {

        String var7;
        String var3 = var2;
        Period var4 = new Period(var1);
        Pattern var5 = Pattern.compile("(?<=#%)[^#]+(?=%#)");

        String var8;
        String var9;
        for (Matcher var6 = var5.matcher(var2); var6.find(); var3 = var3.replaceFirst(var8, var9)) {
            var7 = var6.group();
            var8 = "#%" + var7 + "%#";
            var9 = null;
            switch (var7) {
                case "yyyy":
                case "MM":
                case "dd":
                    SimpleDateFormat var12 = new SimpleDateFormat(var7);
                    var9 = var12.format(var1);
                    break;
                default:
                    if (var7.startsWith("string") && var7.endsWith("string")) {
                        var9 = var8.split("string")[1];
                    } else {
                        String var13 = var7.toLowerCase();
                        var9 = String.valueOf(this.FGN.getSequenceValue(var4, var13));
                    }
            }
        }

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("result " + var3);
        var7 = var3;

        return var7;
    }

    public String getReferenceByPatternDemo(Date var1, String var2, boolean var3) throws FFK {

        String var4 = var2;
        Period var5 = new Period(var1);
        if (!this.FGS.containsKey(var5)) {
            this.FGS.put(var5, new HashMap());
        }

        Map var6 = this.FGS.get(var5);
        Pattern var7 = Pattern.compile("(?<=#%)[^#]+(?=%#)");

        String var9;
        String var10;
        String var11;
        for (Matcher var8 = var7.matcher(var2); var8.find(); var4 = var4.replaceFirst(var10, var11)) {
            var9 = var8.group();
            var10 = "#%" + var9 + "%#";
            var11 = null;
            switch (var9) {
                case "yyyy":
                case "MM":
                case "dd":
                    SimpleDateFormat var14 = new SimpleDateFormat(var9);
                    var11 = var14.format(var1);
                    break;
                default:
                    String var15 = var9.toLowerCase();
                    if (var9.startsWith("string") && var9.endsWith("string")) {
                        var11 = var10.split("string")[1];
                    } else {
                        if (!var6.containsKey(var15)) {
                            var6.put(var15, Integer.valueOf(1));
                        }

                        Integer var16 = (Integer) var6.get(var15);
                        var11 = String.valueOf(var16);
                        if (var3) {
                            var16 = var16 + 1;
                            var6.put(var15, var16);
                        }
                    }
            }
        }

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("result " + var4);
        var9 = var4;
        return var9;
    }

    public List<ValueContainer2<String, String>> getReferenceByPatternDemoSequences(Date var1) throws FFK {

        Period var2 = new Period(var1);
        ArrayList var3 = new ArrayList();
        String[] var4 = new String[]{"yyyy", "MM", "dd"};
        String[] var5 = var4;
        int var6 = var4.length;

        for (int var7 = 0; var7 < var6; ++var7) {
            String var8 = var5[var7];
            SimpleDateFormat var9 = new SimpleDateFormat(var8);
            var3.add(new ValueContainer2(var8, var9.format(var1)));
        }

        Map var13 = this.FGS.get(var2);
        if (var13 != null) {
            Iterator var14 = var13.entrySet().iterator();

            while (var14.hasNext()) {
                Map.Entry var16 = (Map.Entry) var14.next();
                var3.add(new ValueContainer2(var16.getKey(), String.valueOf(var16.getValue())));
            }
        }

        ArrayList var15 = var3;
        return var15;
    }

    public String HJA() {
        return this.FGN.HMX(this.FGQ.toLowerCase());
    }

    public int HJB(String var1, String var2) {
        String var3 = this.FGQ.toLowerCase();

        SimpleUserData var4;
        try {
            if (this.FGP.getUsePassword().getValue()) {
                var4 = this.FGR.get(var3);
                if (!FEY.getInstance().ILA(var4.getPassword().getValue(), var1.toCharArray(), var4.getSalt().getValue())) {
                    return 1;
                }
            }
        } catch (Exception var11) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var11);
            return 7;
        }

        if (this.FGN.HMX(var3) != null) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("OldDB was not renamed");
            return 2;
        } else {
            var4 = null;
            String var5 = null;
            Connection var6 = null;
            Object var7 = null;
            Object var8 = null;
            SimpleUserData var9 = null;

            try {
                var5 = var3 + EMX.POSTFIX_NEW;
                FFF var13 = new FFF(var2.toCharArray());
                var6 = this.FGN.QPQ(this.FGO, var13, var3, var5, null);
                if (var6 == null) {
                    this.FGN.HLE();
                    this.FGN.HKV(var5);
                    return 3;
                }

                byte[] var14 = FEY.getInstance().ILB();
                byte[] var15 = FEY.getInstance().ILC(var2.toCharArray(), var14);
                var9 = new SimpleUserData(this.FGP.getUsername(), this.FGP.getLoginType(), new PrivtePerson(true), new Bytes(var14), new Bytes(var15), true);
            } catch (Exception var12) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var12);
                throw new FFI(var12.getMessage());
            }

            return this.QQL(var3, var5, var6, var9, false);
        }
    }

    public int HJC() {
        String var1 = this.FGQ.toLowerCase();
        Object var2 = null;
        String var3 = null;
        Connection var4 = null;
        SimpleUserData var5 = null;
        if (this.FGN.HMX(var1) != null) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("OldDB was not renamed");
            return 2;
        } else {
            try {
                var3 = var1 + EMX.POSTFIX_NEW;
                var4 = this.FGN.QPQ(this.FGO, (FFF) var2, var1, var3, null);
                if (var4 == null) {
                    this.FGN.HLE();
                    this.FGN.HKV(var3);
                    return 3;
                }

                var5 = new SimpleUserData(this.FGP.getUsername(), this.FGP.getLoginType(), new PrivtePerson(false), null, null, true);
            } catch (Exception var10) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
                throw new FFI(var10.getMessage());
            }

            try {
                this.FGN.HLJ(var5);
            } catch (FFK var9) {
                FFK var6 = var9;

                try {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
                    this.FGN.HLE();
                    this.FGN.HKV(var3);
                    return 4;
                } catch (Exception var8) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
                    throw new FFI(var8.getMessage());
                }
            }

            return this.QQL(var1, var3, var4, var5, false);
        }
    }

    private int QQL(String var1, String var2, Connection var3, SimpleUserData var4, boolean var5) {
        try {
            this.FGN.HLJ(var4);
        } catch (FFK var14) {
            FFK var6 = var14;

            try {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
                this.FGN.HLE();
                this.FGN.HKV(var2);
                return 4;
            } catch (Exception var10) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
                throw new FFI(var10.getMessage());
            }
        }

        String var15 = this.FGN.HKS(var3, var1, var2);
        if (var15 == null) {
            try {
                this.FGN.HKT(var3, var1, var2);
                this.FGN.HLE();
                return 5;
            } catch (Exception var11) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var11);
                throw new FFI(var11.getMessage());
            }
        } else {
            try {
                this.FGN.HLD();
            } catch (FFK var13) {
                FFK var7 = var13;

                try {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
                    this.FGN.HKT(var3, var1, var2);
                    this.FGN.HLE();
                    return 6;
                } catch (Exception var9) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
                    throw new FFI(var9.getMessage());
                }
            }

            this.FGP = var4;
            this.FGR = null;

            try {
                this.FGN.QQB(var1, var5);
            } catch (Exception var12) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var12);
            }

            return 0;
        }
    }

    public File QQM(String var1) {
        String var2 = this.FGQ.toLowerCase();
        Object var3 = null;
        Connection var4 = null;

        try {
            String var5 = (new SimpleDateFormat(DateFormat.yyyy_MM_dd_HH_mm_ss.getValue())).format(new Date());
            String var6 = "kopia_zapasowa_" + var5;
            File var7 = Paths.get(var1, var6).toFile();
            if (!var7.mkdirs()) {
                org.slf4j.LoggerFactory.getLogger(getClass()).info("Cant create backup dir");
            }

            var4 = this.FGN.QPQ(this.FGO, (FFF) var3, var2, var2, var7);
            var4.close();
            File var8 = Paths.get(var7.getAbsolutePath(), var2 + DbUtils.DB_FILE_EXT).toFile();
            File profiles = Paths.get(var7.getAbsolutePath(), "profiles.db").toFile();
            File zip = Paths.get(var1, var6 + ".zip").toFile();
            EWF.writeToZip(zip, var8, profiles);
            profiles.delete();
            var8.delete();
            var7.delete();
            return zip;
        } catch (Exception var11) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var11);
            throw new FFI(var11.getMessage());
        }
    }

    public void QQN(File var1) throws FFI {
        File var2 = null;
        boolean var23 = false;

        File[] var4;
        try {
            label228:
            {
                var23 = true;
                if (var1.exists() && var1.getName().endsWith(".zip")) {
                    var2 = Application.getHomeDir().resolve(UUID.randomUUID().toString()).toFile();
                    var4 = EWF.QOF(var1, var2);
                    if (var4 != null && var4.length == 2) {
                        File var5 = var4[0];
                        File var6 = var4[1];
                        if (var5 != null && var5.isFile() && var5.getName().endsWith(DbUtils.DB_FILE_EXT) && var6 != null && var6.isFile() && var6.getName().endsWith(DbUtils.DB_FILE_EXT)) {
                            SimpleUserData var7 = new SimpleUserData(this.FGP.getUsername(), this.FGP.getLoginType(), new PrivtePerson(false), null, null, true);
                            boolean var8 = this.FGN.QQC(var2, this.FGO, this.FGQ);
                            if (var8) {
                                if (var5.getName().startsWith(EntityName.PROFILES)) {
                                    var5.delete();
                                } else {
                                    var6.delete();
                                    var6 = var5;
                                }

                                String var10 = var6.getName().replace(DbUtils.DB_FILE_EXT, "");
                                String var11 = var6.getName().replace(DbUtils.DB_FILE_EXT, "_NEW.db");
                                String var12 = Paths.get(var6.getParentFile().getParent(), var11).toString();
                                EWF.HZZ(var6.getAbsolutePath(), var12);
                                int var13 = this.QQL(var10, var10 + EMX.POSTFIX_NEW, this.FGN.QQD((new File(var12)).getParentFile(), var10), var7, true);
                                this.FGN.initConnection(var10);
                                var2.delete();
                                if (var13 != 0) {
                                    throw FCZ.getInstance().RHO();
                                }

                                var23 = false;
                                break label228;
                            }

                            throw FCZ.getInstance().RHN();
                        }

                        throw FCZ.getInstance().RHM();
                    }

                    throw FCZ.getInstance().RHM();
                }

                throw FCZ.getInstance().RHM();
            }
        } catch (FFI var24) {
            throw var24;
        } catch (Exception var25) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var25);
            throw new FFI(FCZ.getInstance().RHO().getMessage(), var25);
        } finally {
            if (var23) {
                if (var2 != null && var2.isDirectory()) {
                    File[] var15 = var2.listFiles();
                    if (var15 != null) {
                        File[] var16 = var15;
                        int var17 = var15.length;

                        for (int var18 = 0; var18 < var17; ++var18) {
                            File var19 = var16[var18];
                            if (!var19.isDirectory()) {
                                var19.delete();
                            }
                        }
                    }

                    var2.delete();
                }

            }
        }

        if (var2 != null && var2.isDirectory()) {
            File[] var27 = var2.listFiles();
            if (var27 != null) {
                var4 = var27;
                int var28 = var27.length;

                for (int var29 = 0; var29 < var28; ++var29) {
                    File var30 = var4[var29];
                    if (!var30.isDirectory()) {
                        var30.delete();
                    }
                }
            }

            var2.delete();
        }

    }
}
