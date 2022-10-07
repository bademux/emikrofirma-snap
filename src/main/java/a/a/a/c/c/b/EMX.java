package a.a.a.c.c.b;

import a.a.a.b.a.FDB;
import a.a.a.b.a.a.*;
import a.a.a.b.a.a.a.*;
import a.a.a.b.a.a.b.FDJ;
import a.a.a.b.a.a.c.FDN;
import a.a.a.b.a.a.d.*;
import a.a.a.b.a.a.e.FEC;
import a.a.a.b.a.a.e.FED;
import a.a.a.b.a.a.e.FEE;
import a.a.a.b.d.FEO;
import a.a.a.b.d.FEP;
import a.a.a.b.e.FFF;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.b.EDE;
import a.a.a.c.b.EDF;
import a.a.a.c.e.a.c.EVW;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.d.EWC;
import a.a.a.c.e.a.d.EWD;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.KU;
import a.a.a.c.f.KV;
import a.a.a.c.f.a.EXM;
import a.a.a.c.f.a.IK;
import a.a.a.c.f.a.IL;
import a.a.a.c.f.a.a.IJE;
import a.a.a.c.f.a.a.IJF;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.e.a.IC;
import a.a.a.c.f.a.e.a.IF;
import a.a.a.c.f.a.e.a.IG;
import a.a.a.c.f.a.e.a.IH;
import a.a.a.c.f.a.f.a.IN;
import a.a.a.c.f.a.f.a.IQ;
import a.a.a.c.f.a.f.a.IR;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.a.h.JI;
import a.a.a.c.f.a.n.*;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.*;
import a.a.a.c.f.b.c.a.*;
import a.a.a.c.f.c.LW;
import a.a.a.c.f.c.a.LP;
import a.a.a.c.f.c.b.LX;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.g.c.FCZ;
import javafx.fxml.FXML;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EMX implements ENC {
    private static final int FIG = 100;
    public static final String FIH = "_OLD";
    public static final String FII = "_NEW";
    private static final String FIJ = "##copycount##";
    private static final String FIK = "##tablename##";
    private static final String FIL = "Copied ##copycount## records from: ##tablename##";
    private static final String FIM = "Updated data in table: preferences";
    private static final String FIN = "New db path: ";
    private static final String FIO = "New db exists";
    private static final String FIP = "Initiating connection to new db";
    private static final String FIQ = "Starting coping records to new db";
    private final Integer FIR = 1;
    private Connection FIS;
    private Connection FIT;
    private final FEO FIU;
    private final FEP FIV;
    private boolean FIW = false;
    private Map<String, FDD> QIN;
    @FXML
    protected ResourceBundle resources;

    public EMX() throws FFK {
        EXF.getInstance().ICO();

        try {
            this.HKO();
            Class[] var1 = new Class[]{LP.class, LY.class, HU.class, HV.class, HR.class, QSF.class, QSN.class, QSK.class, IG.class, IF.class, IR.class, JI.class, AGWO.class, AGWP.class, AGWQ.class, AGWR.class, AGWS.class, HK.class, AGWU.class, QGX.class, IJE.class, IJF.class, KJ.class, KN.class, KL.class, KM.class, KI.class, KK.class, QSV.class};
            this.FIU = new FEO(false, true, StandardCharsets.UTF_8, var1);
            this.FIV = new FEP(var1);
            this.FIV.setListener(new Unmarshaller.Listener() {
                public void afterUnmarshal(Object var1, Object var2) {
                    if (HO.class.isAssignableFrom(var1.getClass())) {
                        HO var3 = (HO) var1;
                        var3.DBI().setAllowNegative(true);
                    }

                }
            });
        } catch (JAXBException var5) {
            EXF.getInstance().ICA(var5);
            throw new FFK(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HKO() throws FFK {
        EXF.getInstance().ICO();

        try {
            File var1 = new File(EVW.GPW);
            this.FIS = FDB.IIG(var1, "profiles.db");
            this.FIS.setAutoCommit(false);
            this.QPO(this.FIS);
        } catch (ClassNotFoundException | SQLException var5) {
            EXF.getInstance().ICA(var5);
            throw new FFK(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void QPO(Connection var1) throws SQLException {
        FDD var2 = new FDD(false, FJM, "users", false);
        var2.getColumns().add(new FDW(FLJ, false, true));
        var2.getColumns().add(new FDW(FLN, true, false));
        var2.getColumns().add(new FDW(FLK, true, false));
        var2.getColumns().add(new FDW(FLL, true, false));
        var2.getColumns().add(new FDW(FLM, true, false));
        FDB.IIH(var1, var2);
        FDB.IIJ(var1, var2);
        var2 = new FDD(false, FJM, "preferences", false);
        var2.getColumns().add(new FDW(FLJ, false, false));
        var2.getColumns().add(new FDW(FLP, false, false));
        var2.getColumns().add(new FDW(FLH, false, false));
        var2.getColumns().add(new FDW(FLI, false, false));
        var2.getColumns().add(new FDW(FLQ, false, false));
        var2.getColumns().add(new FDW(FLK, true, false));
        var2.getColumns().add(new FDW(FLR, true, false));
        var2.getColumns().add(new FDW(FLS, false, false));
        var2.getConstraints().add(new FEC(FLJ, FLP, FLI));
        FDB.IIH(var1, var2);
        FDN var3 = new FDN(false, FJM, "preferencesLatestVersion", false, "select a.* from preferences a inner join (select technical_username, technical_typeclass, max(business_version) max_ from preferences group by technical_username, technical_typeclass) b on a.technical_username = b.technical_username and a.technical_typeclass = b.technical_typeclass and a.business_version = b.max_ ");
        FDB.IIK(var1, var3);
        var1.commit();
    }

    private int HKP(FFF var1, FFF var2, Connection var3, String var4, FDE var5, int var6) throws SQLException, FFK, InvalidKeyException, InvalidAlgorithmParameterException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        FDB.IIO(this.FIT, 100, var6, var5);
        int var7 = 0;

        for (Iterator var8 = var5.getResults().iterator(); var8.hasNext(); ++var7) {
            Map var9 = (Map) var8.next();
            Integer var10 = 0;
            Object var11 = null;
            Object var12 = null;
            byte[] var13 = null;
            if (var9.containsKey(FLS.getName())) {
                var13 = (byte[]) ((FDU) var9.get(FLS.getName())).getValue();
            }

            if (var9.containsKey(FLQ.getName())) {
                byte[] var14 = (byte[]) ((FDU) var9.get(FLK.getName())).getValue();
                byte[] var15 = (byte[]) ((FDU) var9.get(FLR.getName())).getValue();
                var10 = (Integer) ((FDU) var9.get(FLQ.getName())).getValue();
                if (var10 > 0 && var13 != null) {
                    var13 = var1.ILI(var15, var14, var13);
                }

                if (var2 != null) {
                    ((FDU) var9.get(FLK.getName())).setValue(var2.getSalt());
                    ((FDU) var9.get(FLR.getName())).setValue(var2.getInitialisationVector());
                    var13 = var2.ILG(var13);
                    var10 = 1;
                } else {
                    ((FDU) var9.get(FLK.getName())).setValue(null);
                    ((FDU) var9.get(FLR.getName())).setValue(null);
                    var10 = 0;
                }

                ((FDU) var9.get(FLQ.getName())).setValue(var10);
            }

            if (var13 != null) {
                ((FDU) var9.get(FLS.getName())).setValue(var13);
            }

            this.HMR(var3, var4, var9);
        }

        if (var7 > 0) {
            var5.getResults().clear();
            this.HLB(var3);
        }

        return var7;
    }

    private void QPP(FFF var1, FFF var2, String var3, FDE var4, String var5, Connection var6) throws SQLException, FFK, InvalidKeyException, InvalidAlgorithmParameterException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        FDB.IIO(this.FIS, var4);
        int var7 = 0;
        Iterator var8 = var4.getResults().iterator();

        while (true) {
            Map var9;
            ArrayList var14;
            while (true) {
                Integer var10;
                byte[] var13;
                do {
                    if (!var8.hasNext()) {
                        if (var7 > 0) {
                            var4.getResults().clear();
                        }

                        return;
                    }

                    var9 = (Map) var8.next();
                    var10 = 0;
                    Object var11 = null;
                    Object var12 = null;
                    var13 = null;
                    var14 = new ArrayList();
                } while (var9.containsKey(FLJ.getName()) && !((FDU) var9.get(FLJ.getName())).getValue().equals(var5));

                if (var9.containsKey(FLS.getName())) {
                    var13 = (byte[]) ((FDU) var9.get(FLS.getName())).getValue();
                }

                if (!var9.containsKey(FLQ.getName())) {
                    break;
                }

                byte[] var15 = (byte[]) ((FDU) var9.get(FLK.getName())).getValue();
                byte[] var16 = (byte[]) ((FDU) var9.get(FLR.getName())).getValue();
                var10 = (Integer) ((FDU) var9.get(FLQ.getName())).getValue();
                if (var10 > 0 && var13 != null) {
                    var13 = var1.ILI(var16, var15, var13);
                    if (var2 != null) {
                        ((FDU) var9.get(FLK.getName())).setValue(var2.getSalt());
                        ((FDU) var9.get(FLR.getName())).setValue(var2.getInitialisationVector());
                        var13 = var2.ILG(var13);
                    } else {
                        ((FDU) var9.get(FLQ.getName())).setValue(0);
                        ((FDU) var9.get(FLK.getName())).setValue(null);
                        ((FDU) var9.get(FLR.getName())).setValue(null);
                    }

                    ((FDU) var9.get(FLS.getName())).setValue(var13);
                    break;
                }

                if (var6 != null) {
                    ((FDU) var9.get(FLQ.getName())).setValue(0);
                    ((FDU) var9.get(FLK.getName())).setValue(null);
                    ((FDU) var9.get(FLR.getName())).setValue(null);
                    break;
                }
            }

            var14.add(new FDU(FLJ, var5));
            if (var9.containsKey(FLP.getName())) {
                var14.add(new FDU(FLP, ((FDU) var9.get(FLP.getName())).getValue()));
            }

            if (var9.containsKey(FLI.getName())) {
                var14.add(new FDU(FLI, ((FDU) var9.get(FLI.getName())).getValue()));
            }

            if (var6 != null) {
                this.HMS(var6, var3, var14, new ArrayList(var9.values()));
            } else {
                this.HMT(this.FIS, var3, var14, new ArrayList(var9.values()));
            }

            ++var7;
        }
    }

    public Connection QPQ(FFF var1, FFF var2, String var3, String var4, File var5) {
        File var6 = null;
        boolean var7 = false;

        try {
            this.FIW = false;
            if (var5 == null) {
                var6 = Paths.get(EVW.GPW, var4 + ".db").toFile();
            } else {
                var7 = true;
                var6 = Paths.get(var5.getAbsolutePath(), var4 + ".db").toFile();
            }

            EXF.getInstance().ICE("New db path: " + var6.getAbsolutePath());
            if (var6.exists()) {
                EXF.getInstance().ICE("New db exists");
                var6.delete();
            }

            Class var8 = EMX.class;
            synchronized (EMX.class) {
                EXF.getInstance().ICE("Initiating connection to new db");
                Connection var9 = this.QPT(var1, var4, var5);
                EXF.getInstance().ICE("Starting coping records to new db");
                String var10 = "invoices";
                FDE var11 = new FDE(FJM, var10);
                Integer var12 = 0;
                Integer var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                EXF.getInstance().ICE("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", "invoices"));
                var10 = "receiptrecords";
                var11 = new FDE(FJM, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                EXF.getInstance().ICE("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", "receiptrecords"));
                var10 = "settlements";
                var11 = new FDE(FJM, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                EXF.getInstance().ICE("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", "settlements"));
                var10 = "invoicerecords";
                var11 = new FDE(FJM, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                EXF.getInstance().ICE("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", "invoicerecords"));
                var10 = "declarations";
                var11 = new FDE(FJM, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                EXF.getInstance().ICE("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", "declarations"));
                var10 = "contacts";
                var11 = new FDE(FJM, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                EXF.getInstance().ICE("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", "contacts"));
                var10 = "sequences";
                var11 = new FDE(FJM, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                EXF.getInstance().ICE("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", "sequences"));
                var10 = "dictionaries";
                var11 = new FDE(FJM, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                EXF.getInstance().ICE("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", "dictionaries"));
                var10 = "preferences";
                var11 = new FDE(FJM, var10);
                if (var7) {
                    Connection var14 = FDB.IIG(var6.getParentFile(), "profiles.db");
                    var14.setAutoCommit(false);
                    this.QPO(var14);
                    this.QPR(var1, var2, var3, var10, var11, var14, false);
                    this.HLB(var14);
                    var14.close();
                } else {
                    this.QPP(var1, var2, var10, var11, var3, null);
                }

                EXF.getInstance().ICE("Updated data in table: preferences");
                return var9;
            }
        } catch (Exception var17) {
            EXF.getInstance().ICA(var17);
            if (var6 != null && var6.isFile() && var6.exists()) {
                var6.delete();
            }

            return null;
        }
    }

    private void QPR(FFF var1, FFF var2, String var3, String var4, FDE var5, Connection var6, boolean var7) throws ClassNotFoundException, SQLException, FFK, InvalidKeyException, InvalidAlgorithmParameterException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        var5 = new FDE(FJM, var4);
        this.QPP(var1, var2, var4, var5, var3, var6);
        var4 = "users";
        var5 = new FDE(FJM, var4);
        this.QPP(var1, var2, var4, var5, var3, var6);
        Connection var8 = null;
        if (var7) {
            var8 = this.FIS;
            this.FIS = var6;
            LX var9 = EMB.getInstance().getCurrentUser();
            this.HLJ(new LX(var9.getUsername(), var9.getLoginType(), new JS(false), null, null, true));
            this.FIS = var8;
        }

    }

    public String HKS(Connection var1, String var2, String var3) {
        try {
            this.FIW = true;
            File var4 = new File(EVW.GPW);
            String var5 = var4.getAbsolutePath() + "/" + var2 + ".db";
            String var6 = var4.getAbsolutePath() + "/" + var3 + ".db";
            this.FIT.close();
            var1.close();
            File var7 = new File(var5);
            String var8 = var2 + "_OLD";
            if (!var7.renameTo(new File(var5.replace(var2, var8)))) {
                return null;
            } else {
                File var9 = new File(var6);
                if (!var9.renameTo(new File(var5))) {
                    return null;
                } else {
                    this.FIW = false;
                    return var5.replace(var2, var8);
                }
            }
        } catch (SQLException var10) {
            EXF.getInstance().ICA(var10);
            return null;
        }
    }

    public boolean HKT(Connection var1, String var2, String var3) {
        try {
            boolean var4 = var1.isClosed();
            boolean var5 = this.FIT.isClosed();
            if (!var4) {
                if (var5) {
                    this.FIW = false;
                    this.HKW(var2);
                }

                return this.HKV(var3);
            } else {
                return this.HKU(var2, var3, true);
            }
        } catch (Exception var6) {
            EXF.getInstance().ICA(var6);
            return false;
        }
    }

    public boolean HKU(String var1, String var2, boolean var3) throws FFK {
        File var4 = new File(EVW.GPW);
        String var5 = var4.getAbsolutePath() + "/" + var2 + ".db";
        String var6 = var4.getAbsolutePath() + "/" + var1 + ".db";
        String var7 = var1 + "_OLD";
        String var8 = var4.getAbsolutePath() + "/" + var7 + ".db";
        File var9 = new File(var5);
        File var10 = new File(var6);
        File var11 = new File(var8);
        this.FIW = false;
        if (var9.exists()) {
            if (!var10.exists() && !var11.renameTo(new File(var6))) {
                return false;
            } else {
                if (var3) {
                    this.HKW(var1);
                }

                return this.HKV(var2);
            }
        } else {
            var9 = new File(var6);
            if (!var11.exists() && !var3) {
                return true;
            } else if (!var9.renameTo(new File(var5))) {
                return false;
            } else if (var11.renameTo(new File(var6))) {
                return false;
            } else {
                if (var3) {
                    this.HKW(var1);
                }

                return this.HKV(var2);
            }
        }
    }

    public boolean HKV(String var1) {
        try {
            File var2 = new File(EVW.GPW);
            String var3 = var2.getAbsolutePath() + "/" + var1 + ".db";
            File var4 = new File(var3);
            if (var4.exists()) {
                return var4.delete();
            }
        } catch (Exception var5) {
            EXF.getInstance().ICA(var5);
        }

        return false;
    }

    public void HKW(String var1) throws FFK {
        this.FIT = this.QPT(null, var1, null);
    }

    public void QPS(FFF var1, String var2) throws FFK {
        this.FIT = this.QPT(var1, var2, null);
    }

    public Connection QPT(final FFF var1, String var2, File var3) throws FFK {
        EXF.getInstance().ICO();

        Connection var20;
        try {
            if (this.FIW) {
                throw new FFI("Profile database already initiated!");
            }

            if (var2 == null || var2.length() <= 0) {
                throw new FFI("Profile name is empty!");
            }

            if (var3 == null) {
                var3 = new File(EVW.GPW);
            }

            final Connection var4 = FDB.IIG(var3, var2 + ".db");
            var4.setAutoCommit(false);
            this.QIN = new HashMap();
            FDD var5 = new FDD(false, FJM, "ref", "invoices", false);
            var5.getColumns().add(new FDW(FLD, false, true, FDL.ASC));
            var5.getColumns().add(new FDW(FLE, true, true));
            var5.getColumns().add(new FDW(FLH, false, false));
            var5.getColumns().add(new FDW(FLG, false, false, "current_timestamp"));
            var5.getColumns().add(new FDW(FLV, false, false));
            var5.getColumns().add(new FDW(FLW, false, false));
            var5.getColumns().add(new FDW(FLN, false, false));
            var5.getColumns().add(new FDW(FLO, true, false));
            var5.getColumns().add(new FDW(FLP, false, false));
            var5.getColumns().add(new FDW(RHL, false, false, QSW.ACTIVE.getKey()));
            var5.getColumns().add(new FDW(FLT, false, false));
            var5.getColumns().add(new FDW(FLU, false, false));
            var5.getColumns().add(new FDW(FLQ, false, false));
            var5.getColumns().add(new FDW(FLK, true, false));
            var5.getColumns().add(new FDW(FLR, true, false));
            var5.getColumns().add(new FDW(FLS, false, false));
            FDW var6 = new FDW(FMD, false, false);
            var5.getColumns().add(var6);
            var5.getColumns().add(new FDW(FME, false, false));
            var5.getColumns().add(new FDW(FMF, false, false));
            var5.getColumns().add(new FDW(FMG, false, false));
            var5.getColumns().add(new FDW(FMH, false, false));
            var5.getColumns().add(new FDW(FMI, false, false));
            var5.getConstraints().add(new FEE(FLD));
            var5.getConstraints().add(new FEC(FLV, FLW, FLN, FLT, FLU));
            FDB.IIH(var4, var5);
            FDB.QIO(var4, var5);
            FDN var7 = new FDN(false, FJM, "invoicesTreeBase", false, "select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_id = fact.technical_parentid ) SELECT viewQueryId, 'c_child' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_parentid = fact.technical_id ) SELECT viewQueryId, 'a_parent' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select technical_id master, 'b_select' type, 0 level, technical_id viewRefId from ##TABLE_NAME## order by 1, 2, 3".replaceAll("##TABLE_NAME##", "invoices"));
            FDB.IIK(var4, var7);
            FDN var8 = new FDN(false, FJM, "invoicesTreeFull", false, "select t.*, i.* from ##TABLE_NAME## i inner join ##VIEW_NAME## t on i.technical_id = t.viewRefId ".replaceAll("##TABLE_NAME##", "invoices").replaceAll("##VIEW_NAME##", "invoicesTreeBase"));
            FDB.IIK(var4, var8);
            var5.getColumns().remove(var6);
            var5.getColumns().add(new FDS(FMC, true, false, "select i.business_creationDate from invoices i where i.technical_id = ref.technical_id"));
            HashSet var9 = new HashSet();
            var9.add(FLP);
            var9.add(FLQ);
            var9.add(FLK);
            var9.add(FLR);
            var9.add(FLS);
            var5.getColumns().add(new QJR(FMD, true, false, var9, new QJR.QJS<Date>() {
                private final FFF RQC = var1;

                public Date QNW(Set<FDU<?>> var1x) {
                    EXF.getInstance().ICO();

                    Date var3;
                    try {
                        HN var2 = EMX.this.QPU(this.RQC, var1x);
                        if (var2 == null) {
                            return null;
                        }

                        var3 = var2.DAT().getValueDate();
                        return var3;
                    } catch (Exception var7) {
                        EXF.getInstance().ICA(var7);
                        var3 = null;
                    } finally {
                        EXF.getInstance().ICP();
                    }

                    return var3;
                }
            }, null));
            var5.getColumns().add(new QJR(QNR, true, false, var9, new QJR.QJS<Date>() {
                private final FFF RQC = var1;

                public Date QNW(Set<FDU<?>> var1x) {
                    EXF.getInstance().ICO();

                    Date var3;
                    try {
                        HN var2 = EMX.this.QPU(this.RQC, var1x);
                        if (var2 == null) {
                            var3 = null;
                            return var3;
                        }

                        var3 = var2.DAU().getValueDate();
                        return var3;
                    } catch (Exception var7) {
                        EXF.getInstance().ICA(var7);
                        var3 = null;
                    } finally {
                        EXF.getInstance().ICP();
                    }

                    return var3;
                }
            }, new QJR.QJT() {
                public void QNX() {
                    EXF.getInstance().ICO();
                    PreparedStatement var1 = null;

                    try {
                        String var2 = "update invoices set business_transactionDate = (select c.business_transactionDate from invoicesTreeBase b inner join invoices c on c.technical_id = b.viewQueryId and c.technical_subType = 'INVOICE' where b.viewRefId = invoices.technical_id)";
                        var1 = var4.prepareStatement(var2);
                        int var3 = var1.executeUpdate();
                        EXF.getInstance().ICK("result " + var3);
                    } catch (Exception var12) {
                        EXF.getInstance().ICA(var12);
                    } finally {
                        if (var1 != null) {
                            try {
                                var1.close();
                            } catch (SQLException var11) {
                                EXF.getInstance().ICA(var11);
                            }
                        }

                        EXF.getInstance().ICP();
                    }

                }
            }));
            FDB.IIJ(var4, var5);
            FDB.QIQ(var4, var5);
            this.QIN.put("invoices", var5);
            this.QIN.put("invoicesTreeFull", var5);
            var5 = new FDD(false, FJM, "ref", "invoicesother", false);
            var5.getColumns().add(new FDW(FLD, false, true, FDL.ASC));
            var5.getColumns().add(new FDW(FLE, true, true));
            var5.getColumns().add(new FDW(FLH, false, false));
            var5.getColumns().add(new FDW(FLG, false, false, "current_timestamp"));
            var5.getColumns().add(new FDW(FLV, false, false));
            var5.getColumns().add(new FDW(FLW, false, false));
            var5.getColumns().add(new FDW(FLN, false, false));
            var5.getColumns().add(new FDW(FLO, true, false));
            var5.getColumns().add(new FDW(FLP, false, false));
            var5.getColumns().add(new FDW(RHL, false, false, QSW.ACTIVE.getKey()));
            var5.getColumns().add(new FDW(FLT, false, false));
            var5.getColumns().add(new FDW(FLU, false, false));
            var5.getColumns().add(new FDW(FLQ, false, false));
            var5.getColumns().add(new FDW(FLK, true, false));
            var5.getColumns().add(new FDW(FLR, true, false));
            var5.getColumns().add(new FDW(FLS, false, false));
            var5.getColumns().add(new FDW(FMD, true, false));
            var5.getColumns().add(new FDW(FMC, false, false));
            var5.getColumns().add(new FDW(FME, true, false));
            var5.getColumns().add(new FDW(FMF, true, false));
            var5.getColumns().add(new FDW(FMG, false, false));
            var5.getColumns().add(new FDW(FMH, false, false));
            var5.getColumns().add(new FDW(FMI, false, false));
            var5.getConstraints().add(new FEE(FLD));
            FDB.IIH(var4, var5);
            FDB.QIO(var4, var5);
            FDN var18 = new FDN(false, FJM, "invoicesotherTreeBase", false, "select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_id = fact.technical_parentid ) SELECT viewQueryId, 'c_child' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_parentid = fact.technical_id ) SELECT viewQueryId, 'a_parent' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select technical_id master, 'b_select' type, 0 level, technical_id viewRefId from ##TABLE_NAME## order by 1, 2, 3".replaceAll("##TABLE_NAME##", "invoicesother"));
            FDB.IIK(var4, var18);
            var7 = new FDN(false, FJM, "invoicesotherTreeFull", false, "select t.*, i.* from ##TABLE_NAME## i inner join ##VIEW_NAME## t on i.technical_id = t.viewRefId ".replaceAll("##TABLE_NAME##", "invoicesother").replaceAll("##VIEW_NAME##", "invoicesotherTreeBase"));
            FDB.IIK(var4, var7);
            this.QIN.put("invoicesother", var5);
            this.QIN.put("invoicesotherTreeFull", var5);
            var5 = new FDD(false, FJM, "ref", "receiptrecords", false);
            var5.getColumns().add(new FDW(FLD, false, true, FDL.ASC));
            var5.getColumns().add(new FDW(FLE, true, true));
            var5.getColumns().add(new FDW(FLH, false, false));
            var5.getColumns().add(new FDW(FLG, false, false, "current_timestamp"));
            var5.getColumns().add(new FDW(FLV, false, false));
            var5.getColumns().add(new FDW(FLW, false, false));
            var5.getColumns().add(new FDW(FLN, false, false));
            var5.getColumns().add(new FDW(FLO, true, false));
            var5.getColumns().add(new FDW(FLP, false, false));
            var5.getColumns().add(new FDW(FLQ, false, false));
            var5.getColumns().add(new FDW(FLK, true, false));
            var5.getColumns().add(new FDW(FLR, true, false));
            var5.getColumns().add(new FDW(FLS, false, false));
            var5.getConstraints().add(new FEE(FLD));
            var5.getConstraints().add(new FEC(FLV, FLW, FLP));
            FDB.IIH(var4, var5);
            FDB.QIO(var4, var5);
            var18 = new FDN(false, FJM, "receiptrecordsTreeBase", false, "select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_id = fact.technical_parentid ) SELECT viewQueryId, 'c_child' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_parentid = fact.technical_id ) SELECT viewQueryId, 'a_parent' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select technical_id master, 'b_select' type, 0 level, technical_id viewRefId from ##TABLE_NAME## order by 1, 2, 3".replaceAll("##TABLE_NAME##", "receiptrecords"));
            FDB.IIK(var4, var18);
            var7 = new FDN(false, FJM, "receiptrecordsTreeFull", false, "select t.*, i.* from ##TABLE_NAME## i inner join ##VIEW_NAME## t on i.technical_id = t.viewRefId ".replaceAll("##TABLE_NAME##", "receiptrecords").replaceAll("##VIEW_NAME##", "receiptrecordsTreeBase"));
            FDB.IIK(var4, var7);
            this.QIN.put("receiptrecords", var5);
            this.QIN.put("receiptrecordsTreeFull", var5);
            var5 = new FDD(false, FJM, "settlements", false);
            var5.getColumns().add(new FDW(FLD, false, true, FDL.ASC));
            var5.getColumns().add(new FDW(FLE, true, true));
            var5.getColumns().add(new FDW(FLH, false, false));
            var5.getColumns().add(new FDW(FLG, false, false, "current_timestamp"));
            var5.getColumns().add(new FDW(FLV, false, false));
            var5.getColumns().add(new FDW(FLW, false, false));
            var5.getColumns().add(new FDW(FLN, false, false));
            var5.getColumns().add(new FDW(FLO, true, false));
            var5.getColumns().add(new FDW(FLP, false, false));
            var5.getColumns().add(new FDW(FLQ, false, false));
            var5.getColumns().add(new FDW(FLK, true, false));
            var5.getColumns().add(new FDW(FLR, true, false));
            var5.getColumns().add(new FDW(FLS, false, false));
            var5.getConstraints().add(new FEE(FLD));
            FEC var19 = new FEC(FLV, FLW, FLN);
            var5.getConstraints().add(var19);
            FDB.IIH(var4, var5);
            FDB.QIO(var4, var5);
            var7 = new FDN(false, FJM, "settlementsTreeBase", false, "select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_id = fact.technical_parentid ) SELECT viewQueryId, 'c_child' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_parentid = fact.technical_id ) SELECT viewQueryId, 'a_parent' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select technical_id master, 'b_select' type, 0 level, technical_id viewRefId from ##TABLE_NAME## order by 1, 2, 3".replaceAll("##TABLE_NAME##", "settlements"));
            FDB.IIK(var4, var7);
            var8 = new FDN(false, FJM, "settlementsTreeFull", false, "select t.*, i.* from ##TABLE_NAME## i inner join ##VIEW_NAME## t on i.technical_id = t.viewRefId ".replaceAll("##TABLE_NAME##", "settlements").replaceAll("##VIEW_NAME##", "settlementsTreeBase"));
            FDB.IIK(var4, var8);
            FDN var21 = new FDN(false, FJM, "settlementsTreeRefLevel", false, "select viewQueryId, viewMaxRefLevel from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM temp INNER JOIN ##TABLE_NAME## fact  ON temp.technical_parentid = fact.technical_id ) SELECT viewQueryId, max(viewRefLevel) viewMaxRefLevel FROM temp group by viewQueryId ) ".replaceAll("##TABLE_NAME##", "settlements"));
            FDB.IIK(var4, var21);
            var5.getColumns().add(new FDS(FLX, false, false, "select viewMaxRefLevel from settlementsTreeRefLevel where viewQueryId = technical_id"));
            var5.getConstraints().remove(var19);
            FEC var10 = new FEC(FLV, FLW, FLX, FLN);
            var5.getConstraints().add(var10);
            FDB.IIJ(var4, var5);
            FDB.QIQ(var4, var5);
            FDN var11 = new FDN(false, FJM, "settlementsLastChildIdBase", false, "select viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## where technical_parentid is null UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_id = fact.technical_parentid ) SELECT c.technical_id viewRefId FROM temp c inner join ( SELECT a.viewQueryId, max(a.viewRefLevel) maxViewRefLevel FROM temp a group by a.viewQueryId ) b on b.viewQueryId = c.viewQueryId and b.maxViewRefLevel = c.viewRefLevel ) ".replaceAll("##TABLE_NAME##", "settlements"));
            FDB.IIK(var4, var11);
            FDN var12 = new FDN(false, FJM, "settlementsLastChildIdFull", false, "select t.*, i.* from ##TABLE_NAME## i inner join ##VIEW_NAME## t on i.technical_id = t.viewRefId ".replaceAll("##TABLE_NAME##", "settlements").replaceAll("##VIEW_NAME##", "settlementsLastChildIdBase"));
            FDB.IIK(var4, var12);
            this.QIN.put("settlements", var5);
            this.QIN.put("settlementsTreeFull", var5);
            var5 = new FDD(false, FJM, "ref", "invoicerecords", false);
            var5.getColumns().add(new FDW(FLD, false, true, FDL.ASC));
            var5.getColumns().add(new FDW(FLE, true, true));
            var5.getColumns().add(new FDW(FLH, false, false));
            var5.getColumns().add(new FDW(FLG, false, false, "current_timestamp"));
            var5.getColumns().add(new FDW(FLV, false, false));
            var5.getColumns().add(new FDW(FLW, false, false));
            var5.getColumns().add(new FDW(FLN, false, false));
            var5.getColumns().add(new FDW(FLO, true, false));
            var5.getColumns().add(new FDW(FLP, false, false));
            var5.getColumns().add(new FDW(FLQ, false, false));
            var5.getColumns().add(new FDW(FLK, true, false));
            var5.getColumns().add(new FDW(FLR, true, false));
            var5.getColumns().add(new FDW(FLS, false, false));
            var5.getConstraints().add(new FEE(FLD));
            var19 = new FEC(FLV, FLW, FLN);
            var5.getConstraints().add(var19);
            FDB.IIH(var4, var5);
            FDB.QIO(var4, var5);
            var7 = new FDN(false, FJM, "invoicerecordsTreeBase", false, "select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_id = fact.technical_parentid ) SELECT viewQueryId, 'c_child' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_parentid = fact.technical_id ) SELECT viewQueryId, 'a_parent' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select technical_id master, 'b_select' type, 0 level, technical_id viewRefId from ##TABLE_NAME## order by 1, 2, 3".replaceAll("##TABLE_NAME##", "invoicerecords"));
            FDB.IIK(var4, var7);
            var8 = new FDN(false, FJM, "invoicerecordsTreeFull", false, "select t.*, i.* from ##TABLE_NAME## i inner join ##VIEW_NAME## t on i.technical_id = t.viewRefId ".replaceAll("##TABLE_NAME##", "invoicerecords").replaceAll("##VIEW_NAME##", "invoicerecordsTreeBase"));
            FDB.IIK(var4, var8);
            var21 = new FDN(false, FJM, "invoicerecordsTreeRefLevel", false, "select viewQueryId, viewMaxRefLevel from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM temp INNER JOIN ##TABLE_NAME## fact  ON temp.technical_parentid = fact.technical_id ) SELECT viewQueryId, max(viewRefLevel) viewMaxRefLevel FROM temp group by viewQueryId ) ".replaceAll("##TABLE_NAME##", "invoicerecords"));
            FDB.IIK(var4, var21);
            var5.getColumns().add(new FDS(FLF, true, false, "select s.technical_id from settlements s where s.business_periodYear = ref.business_periodYear and s.business_periodMonth = ref.business_periodMonth"));
            var5.getColumns().add(new FDS(FLX, false, false, "select viewMaxRefLevel from invoicerecordsTreeRefLevel where viewQueryId = technical_id"));
            var5.getConstraints().remove(var19);
            var10 = new FEC(FLV, FLW, FLX, FLN);
            var5.getConstraints().add(var10);
            var5.getConstraints().add(new FED("settlements", new FDY[]{FLF}, new FDY[]{FLD}));
            FDB.IIJ(var4, var5);
            FDB.QIQ(var4, var5);
            var11 = new FDN(false, FJM, "invoicerecordsLatestTypeForPeriod", false, "select fact.* from ##TABLE_NAME## fact inner join (select business_periodYear, business_periodMonth, technical_type, technical_subType, max(business_documentIndex) maxDocumentIndex from ##TABLE_NAME## group by business_periodYear, business_periodMonth, technical_type, technical_subType) group_ on fact.business_periodYear = group_.business_periodYear and fact.business_periodMonth = group_.business_periodMonth and fact.technical_type = group_.technical_type and coalesce(fact.technical_subType, 'NULL') = coalesce(group_.technical_subType, 'NULL') and fact.business_documentIndex = group_.maxDocumentIndex  ".replaceAll("##TABLE_NAME##", "invoicerecords"));
            FDB.IIK(var4, var11);
            this.QIN.put("invoicerecords", var5);
            this.QIN.put("invoicerecordsTreeFull", var5);
            var5 = new FDD(false, FJM, "ref", "declarations", false);
            var5.getColumns().add(new FDW(FLD, false, true, FDL.ASC));
            var5.getColumns().add(new FDW(FLE, true, true));
            var5.getColumns().add(new FDW(FLH, false, false));
            var5.getColumns().add(new FDW(FLG, false, false, "current_timestamp"));
            var5.getColumns().add(new FDW(FLV, false, false));
            var5.getColumns().add(new FDW(FLW, false, false));
            var5.getColumns().add(new FDW(FLN, false, false));
            var5.getColumns().add(new FDW(FLO, true, false));
            var5.getColumns().add(new FDW(FLP, false, false));
            var5.getColumns().add(new FDW(FLQ, false, false));
            var5.getColumns().add(new FDW(FLK, true, false));
            var5.getColumns().add(new FDW(FLR, true, false));
            var5.getColumns().add(new FDW(FLS, false, false));
            var5.getConstraints().add(new FEE(FLD));
            var19 = new FEC(FLV, FLW, FLN);
            var5.getConstraints().add(var19);
            FDB.IIH(var4, var5);
            FDB.QIO(var4, var5);
            var7 = new FDN(false, FJM, "declarationsTreeBase", false, "select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_id = fact.technical_parentid ) SELECT viewQueryId, 'c_child' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_parentid = fact.technical_id ) SELECT viewQueryId, 'a_parent' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select technical_id master, 'b_select' type, 0 level, technical_id viewRefId from ##TABLE_NAME## order by 1, 2, 3".replaceAll("##TABLE_NAME##", "declarations"));
            FDB.IIK(var4, var7);
            var8 = new FDN(false, FJM, "declarationsTreeFull", false, "select t.*, i.* from ##TABLE_NAME## i inner join ##VIEW_NAME## t on i.technical_id = t.viewRefId ".replaceAll("##TABLE_NAME##", "declarations").replaceAll("##VIEW_NAME##", "declarationsTreeBase"));
            FDB.IIK(var4, var8);
            var21 = new FDN(false, FJM, "declarationsTreeRefLevel", false, "select viewQueryId, viewMaxRefLevel from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM temp INNER JOIN ##TABLE_NAME## fact  ON temp.technical_parentid = fact.technical_id ) SELECT viewQueryId, max(viewRefLevel) viewMaxRefLevel FROM temp group by viewQueryId ) ".replaceAll("##TABLE_NAME##", "declarations"));
            FDB.IIK(var4, var21);
            var5.getColumns().add(new FDS(FLF, true, false, "select s.technical_id from settlements s where s.business_periodYear = ref.business_periodYear and s.business_periodMonth = ref.business_periodMonth"));
            var5.getColumns().add(new FDS(FLX, false, false, "select viewMaxRefLevel from declarationsTreeRefLevel where viewQueryId = technical_id"));
            var5.getConstraints().remove(var19);
            var10 = new FEC(FLV, FLW, FLX, FLN, FLO);
            var5.getConstraints().add(var10);
            var5.getConstraints().add(new FED("settlements", new FDY[]{FLF}, new FDY[]{FLD}));
            FDB.IIJ(var4, var5);
            FDB.QIQ(var4, var5);
            this.QIN.put("declarations", var5);
            this.QIN.put("declarationsTreeFull", var5);
            var5 = new FDD(false, FJM, "ref", "contacts", false);
            var5.getColumns().add(new FDW(FLD, false, true, FDL.ASC));
            var5.getColumns().add(new FDW(FLE, true, true));
            var5.getColumns().add(new FDW(FLH, false, false));
            var5.getColumns().add(new FDW(FLG, false, false, "current_timestamp"));
            var6 = new FDW(FLZ, false, true);
            var5.getColumns().add(var6);
            var5.getColumns().add(new FDW(FLN, false, false));
            var5.getColumns().add(new FDW(FLO, true, false));
            var5.getColumns().add(new FDW(FLP, false, false));
            var5.getColumns().add(new FDW(FLQ, false, false));
            var5.getColumns().add(new FDW(FLK, true, false));
            var5.getColumns().add(new FDW(FLR, true, false));
            var5.getColumns().add(new FDW(FLS, false, false));
            var5.getConstraints().add(new FEE(FLD));
            FDB.IIH(var4, var5);
            FDB.QIO(var4, var5);
            var7 = new FDN(false, FJM, "contactsTreeBase", false, "select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_id = fact.technical_parentid ) SELECT viewQueryId, 'c_child' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_parentid = fact.technical_id ) SELECT viewQueryId, 'a_parent' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select technical_id master, 'b_select' type, 0 level, technical_id viewRefId from ##TABLE_NAME## order by 1, 2, 3".replaceAll("##TABLE_NAME##", "contacts"));
            FDB.IIK(var4, var7);
            var8 = new FDN(false, FJM, "contactsTreeFull", false, "select t.*, i.* from ##TABLE_NAME## i inner join ##VIEW_NAME## t on i.technical_id = t.viewRefId ".replaceAll("##TABLE_NAME##", "contacts").replaceAll("##VIEW_NAME##", "contactsTreeBase"));
            FDB.IIK(var4, var8);
            var5.getColumns().remove(var6);
            var5.getColumns().add(new FDS(FME, false, false, "select c.business_name from contacts c where c.technical_id = ref.technical_id"));
            var5.getColumns().add(new FDW(FMF, true, true));
            var9 = new HashSet();
            var9.add(FLP);
            var9.add(FLQ);
            var9.add(FLK);
            var9.add(FLR);
            var9.add(FLS);
            var5.getColumns().add(new QJR(QNS, false, false, -1, var9, new QJR.QJS<Integer>() {
                private final FFF TWH = var1;

                public Integer QNW(Set<FDU<?>> var1x) {
                    EXF.getInstance().ICO();

                    Integer var3;
                    try {
                        HI var2 = EMX.this.QPU(this.TWH, var1x);
                        if (var2 == null) {
                            var3 = -2;
                            return var3;
                        }

                        var3 = var2.QON();
                        return var3;
                    } catch (Exception var7) {
                        EXF.getInstance().ICA(var7);
                        var3 = -3;
                    } finally {
                        EXF.getInstance().ICP();
                    }

                    return var3;
                }
            }, null));
            FDB.IIJ(var4, var5);
            FDB.QIQ(var4, var5);
            this.QIN.put("contacts", var5);
            this.QIN.put("contactsTreeFull", var5);
            var5 = new FDD(false, FJM, "sequences", false);
            var5.getColumns().add(new FDW(FLG, false, false, "current_timestamp"));
            var5.getColumns().add(new FDW(FLV, false, false));
            var5.getColumns().add(new FDW(FLW, false, false));
            var5.getColumns().add(new FDW(FLN, false, false));
            var5.getColumns().add(new FDW(FLY, false, false));
            var5.getConstraints().add(new FEC(FLV, FLW, FLN));
            FDB.IIH(var4, var5);
            this.QIN.put("sequences", var5);
            var5 = new FDD(false, FJM, "dictionaries", false);
            var5.getColumns().add(new FDW(FMA, false, false));
            var5.getColumns().add(new FDW(FMB, false, false));
            var5.getColumns().add(new FDW(FLP, false, false));
            var5.getColumns().add(new FDW(FLS, false, false));
            var5.getColumns().add(new FDW(FLG, false, false, "current_timestamp"));
            var5.getColumns().add(new FDW(FLH, false, false));
            var5.getConstraints().add(new FEC(FMA, FMB));
            FDB.IIH(var4, var5);
            this.QIN.put("dictionaries", var5);
            var4.commit();
            this.FIW = true;
            var20 = var4;
        } catch (ClassNotFoundException | SQLException var16) {
            EXF.getInstance().ICA(var16);
            throw new FFK(var16);
        } finally {
            EXF.getInstance().ICP();
        }

        return var20;
    }

    private <_T extends KU> _T QPU(FFF var1, Set<FDU<?>> var2) {
        EXF.getInstance().ICO();

        Short var4;
        try {
            Class var3 = null;
            var4 = null;
            byte[] var5 = null;
            byte[] var6 = null;
            byte[] var7 = null;
            Iterator var8 = var2.iterator();

            while (var8.hasNext()) {
                FDU var9 = (FDU) var8.next();
                String var10 = var9.getName();
                Object var11 = var9.getValue();
                if (FLP.getName().equals(var10)) {
                    var3 = Class.forName((String) var11);
                } else if (FLQ.getName().equals(var10)) {
                    if (var11 instanceof Integer) {
                        var4 = ((Integer) var11).shortValue();
                    } else {
                        if (!(var11 instanceof Short)) {
                            throw new FFK("Invalid cell [" + var10 + "] type [" + var11 + "]!");
                        }

                        var4 = (Short) var11;
                    }
                } else if (FLK.getName().equals(var10)) {
                    var5 = (byte[]) var11;
                } else if (FLR.getName().equals(var10)) {
                    var6 = (byte[]) var11;
                } else if (FLS.getName().equals(var10)) {
                    var7 = (byte[]) var11;
                }
            }

            byte[] var17;
            if (var4 > 0) {
                var17 = var1.ILI(var6, var5, var7);
            } else {
                var17 = var7;
            }

            KU var18 = this.HLA(var17, var3);
            KU var19 = var18;
            return (_T) var19;
        } catch (Exception var15) {
            EXF.getInstance().ICA(var15);
            return null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HKY(String var1) throws FFK {
        EXF.getInstance().ICO();

        try {
            if (var1 == null || var1.length() <= 0) {
                throw new FFI("Profile name is empty!");
            }

            if (this.FIT != null) {
                this.FIT.close();
                this.FIW = false;
            }
        } catch (SQLException var6) {
            EXF.getInstance().ICA(var6);
            this.FIT = null;
            this.FIW = false;
            throw new FFK(var6);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public synchronized <_T extends KU> byte[] HKZ(_T var1) throws FFK {
        EXF.getInstance().ICO();

        byte[] var2;
        try {
            var2 = this.FIU.IKU(var1);
        } catch (JAXBException var6) {
            EXF.getInstance().ICA(var6);
            throw new FFK(var6);
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public synchronized <_T extends KU> _T HLA(byte[] var1, Class<_T> var2) throws FFK {
        EXF.getInstance().ICO();

        KU var3;
        try {
            var3 = this.FIV.IKV(new ByteArrayInputStream(var1), var2);
        } catch (XMLStreamException | JAXBException var7) {
            EXF.getInstance().ICA(var7);
            throw new FFK(var7);
        } finally {
            EXF.getInstance().ICP();
        }

        return (_T) var3;
    }

    private void HLB(Connection var1) throws FFK {
        EXF.getInstance().ICO();

        try {
            if (var1 == null) {
                throw new FFK("Connection cannot be NULL!");
            }

            synchronized (var1) {
                var1.commit();
            }
        } catch (SQLException var9) {
            EXF.getInstance().ICA(var9);
            throw new FFK(var9);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HLC(Connection var1) throws FFK {
        EXF.getInstance().ICO();

        try {
            if (var1 == null) {
                throw new FFK("Connection cannot be NULL!");
            }

            synchronized (var1) {
                var1.rollback();
            }
        } catch (SQLException var9) {
            EXF.getInstance().ICA(var9);
            throw new FFK(var9);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HLD() throws FFK {
        EXF.getInstance().ICO();

        try {
            this.HLB(this.FIS);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HLE() throws FFK {
        EXF.getInstance().ICO();

        try {
            this.HLC(this.FIS);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HLF() throws FFK {
        EXF.getInstance().ICO();

        try {
            this.HLB(this.FIT);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HLG() throws FFK {
        EXF.getInstance().ICO();

        try {
            this.HLC(this.FIT);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public Map<String, LX> HLH() throws FFK {
        EXF.getInstance().ICO();

        try {
            ArrayList var1 = new ArrayList();
            var1.add(new FDX(FLJ));
            var1.add(new FDX(FLN));
            var1.add(new FDX(FLK));
            var1.add(new FDX(FLL));
            var1.add(new FDX(FLM));
            ArrayList var2 = new ArrayList();
            ArrayList var3 = new ArrayList();
            EVZ var4 = this.HMB(this.FIS, "users", var1, var2, var3, null, null, new ENC.ENE<EWD<LX>, LX>() {
                public EWD<LX> HNF(List<FDU<?>> var1) throws Exception {
                    KO var2 = null;
                    JZ var3 = null;
                    JS var4 = null;
                    JT var5 = null;
                    JT var6 = null;
                    Boolean var7 = null;
                    Iterator var8 = var1.iterator();

                    while (true) {
                        while (var8.hasNext()) {
                            FDU var9 = (FDU) var8.next();
                            if (ENC.FLJ.getName().equals(var9.getName())) {
                                var2 = new KO((String) var9.getValue());
                            } else if (ENC.FLN.getName().equals(var9.getName())) {
                                var3 = new JZ(KG.valueOf((String) var9.getValue()));
                            } else if (ENC.FLK.getName().equals(var9.getName())) {
                                var5 = new JT((byte[]) var9.getValue());
                            } else if (ENC.FLL.getName().equals(var9.getName())) {
                                var6 = new JT((byte[]) var9.getValue());
                            } else if (ENC.FLM.getName().equals(var9.getName())) {
                                Integer var10 = (Integer) var9.getValue();
                                var7 = var10 != null && var10 > 0;
                            }
                        }

                        if (var5 != null && var5.getValue() != null && var6 != null && var6.getValue() != null) {
                            var4 = new JS(true);
                        } else {
                            var4 = new JS(false);
                        }

                        return new EWD(new LX(var2, var3, var4, var5, var6, var7));
                    }
                }
            });
            HashMap var5 = new HashMap();
            Iterator var6 = ((List) var4.getSecondValue()).iterator();

            while (var6.hasNext()) {
                EWD var7 = (EWD) var6.next();
                var5.put(((LX) var7.getFirstValue()).getUsername().getValue().toLowerCase(), var7.getFirstValue());
            }

            HashMap var13 = var5;
            return var13;
        } catch (Exception var11) {
            EXF.getInstance().ICA(var11);
            throw new FFK(var11);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public <_T extends LW> void HLI(LX var1) throws FFK {
        EXF.getInstance().ICO();

        try {
            String var2 = "users";
            synchronized ("users") {
                this.HLL(FDO.insert, var1);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public <_T extends LW> void HLJ(LX var1) throws FFK {
        EXF.getInstance().ICO();

        try {
            String var2 = "users";
            synchronized ("users") {
                this.HLL(FDO.update, var1);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public <_T extends LW> void HLK(LX var1) throws FFK {
        EXF.getInstance().ICO();

        try {
            String var2 = "users";
            synchronized ("users") {
                this.HLL(FDO.delete, var1);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private <_T extends LW> void HLL(FDO var1, LX var2) throws FFK {
        EXF.getInstance().ICO();

        try {
            if (var2 == null) {
                throw FCZ.getInstance().IHG();
            }

            String var3 = var2.DEZ().getValue().toLowerCase();
            String var4 = var2.DFA().getValue().name();
            boolean var5 = var2.DFB().getValue();
            byte[] var6 = var5 ? var2.DFC().getValue() : null;
            byte[] var7 = var5 ? var2.DFD().getValue() : null;
            Integer var8 = var5 ? var2.HHA() : null;
            ArrayList var9 = new ArrayList();
            var9.add(new FDU(FLJ, var3));
            ArrayList var10 = null;
            switch (var1) {
                case insert:
                case update:
                    var10 = new ArrayList();
                    var10.add(new FDU(FLN, var4));
                    var10.add(new FDU(FLK, var7));
                    var10.add(new FDU(FLL, var6));
                    var10.add(new FDU(FLM, var8));
                case delete:
                    break;
                default:
                    throw new FFK("Unsupported action type [" + var1 + "]!");
            }

            switch (var1) {
                case insert:
                    this.HMS(this.FIS, "users", var9, var10);
                    break;
                case update:
                    this.HMT(this.FIS, "users", var9, var10);
                    break;
                case delete:
                    this.HMU(this.FIS, "users", var9);
                    break;
                default:
                    throw new FFK("Unsupported action type [" + var1 + "]!");
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public <_T extends LW> _T HLM(FFF var1, String var2, Class<_T> var3) throws FFK {
        EXF.getInstance().ICO();

        LW var4;
        try {
            var4 = this.HLN(var1, var2, var3, null);
        } finally {
            EXF.getInstance().ICP();
        }

        return (_T) var4;
    }

    public <_T extends LW> _T HLN(FFF var1, String var2, Class<_T> var3, Integer var4) throws FFK {
        EXF.getInstance().ICO();

        LW var5;
        try {
            if (var4 == null) {
                var5 = this.HMA(var1, "preferencesLatestVersion", var2, var3, null);
                return (_T) var5;
            }

            var5 = this.HMA(var1, "preferences", var2, var3, var4);
        } finally {
            EXF.getInstance().ICP();
        }

        return (_T) var5;
    }

    public <_T extends HN<?>> EVZ<Integer, List<EDF<_T>>> ROB(FFF var1, QSW var2, FDL var3, Integer var4, Integer var5, JN var6, IB var7, IA var8, KE var9, KA var10, KA var11, EVZ<Date, Date> var12, EVZ<Date, Date> var13, String var14) throws FFK {
        EXF.getInstance().ICO();

        EVZ var25;
        try {
            ArrayList var15 = new ArrayList();
            var15.add(ENC.END.cell_business_refid);
            var15.add(ENC.END.cell_business_issuer_number);
            var15.add(ENC.END.cell_business_invoicingDate);
            var15.add(ENC.END.cell_business_contractorName);
            var15.add(ENC.END.cell_business_contractorNIP);
            var15.add(ENC.END.cell_business_netValue);
            var15.add(ENC.END.cell_business_grossValue);
            var15.add(ENC.END.cell_business_taxValue);
            var15.add(ENC.END.cell_business_creationDate);
            var15.add(ENC.END.cell_business_transactionDate);
            var15.add(ENC.END.cell_business_state);
            ArrayList var16 = new ArrayList();
            String var17 = var9 != null ? var9.getValue() : null;
            if (var17 != null) {
                var16.add(new FDU(FLU, var17));
            }

            String var18 = var10 != null ? var10.getValue() : null;
            if (var18 != null) {
                var16.add(new FDU(FLT, var18));
            }

            String var19 = var11 != null ? var11.getValue() : null;
            if (var19 != null) {
                var16.add(new FDU(FMF, var19));
            }

            if (var12 != null && var12.getFirstValue() != null && var12.getSecondValue() != null) {
                var16.add(new FDU(FMD, var12.getFirstValue(), FDK.GREATER_THAN_OR_EQUALS));
                var16.add(new FDU(FMD, var12.getSecondValue(), FDK.LESS_THAN_OR_EQUALS));
            }

            if (var13 != null && var13.getFirstValue() != null && var13.getSecondValue() != null) {
                var16.add(new FDU(QNR, var13.getFirstValue(), FDK.GREATER_THAN_OR_EQUALS));
                var16.add(new FDU(QNR, var13.getSecondValue(), FDK.LESS_THAN_OR_EQUALS));
            }

            if (var2 != null) {
                var16.add(new FDU(RHL, var2.getKey(), FDK.EQUALS));
            }

            ArrayList var20 = new ArrayList();
            if (var14 != null && var14.length() >= 3) {
                FDJ var21 = new FDJ(FEB.OR);
                var21.IJR(new FDU(FLU, "%" + var14 + "%", FDK.LIKE));
                var21.IJR(new FDU(FME, "%" + var14 + "%", FDK.LIKE));
                var21.IJR(new FDU(FMF, "%" + var14 + "%", FDK.LIKE));
                var21.IJR(new FDU(FMG, "%" + var14 + "%", FDK.LIKE));
                var21.IJR(new FDU(FMH, "%" + var14 + "%", FDK.LIKE));
                var21.IJR(new FDU(FMI, "%" + var14 + "%", FDK.LIKE));
                var20.add(var21);
            }

            var25 = this.HLX(var1, "invoices", "invoicesTreeFull", var15, var16, var20, var3, var4, var5, var6, var7, var8);
        } finally {
            EXF.getInstance().ICP();
        }

        return var25;
    }

    public <_T extends QSG<?>> EVZ<Integer, List<EDF<_T>>> ROC(FFF var1, QSW var2, FDL var3, Integer var4, Integer var5, JN var6, QSR var7, QSQ var8, KE var9, KA var10, KA var11, EVZ<Date, Date> var12, EVZ<Date, Date> var13, String var14) throws FFK {
        EXF.getInstance().ICO();

        EVZ var25;
        try {
            ArrayList var15 = new ArrayList();
            var15.add(ENC.END.cell_business_refid);
            var15.add(ENC.END.cell_business_issuer_number);
            var15.add(ENC.END.cell_business_invoicingDate);
            var15.add(ENC.END.cell_business_contractorName);
            var15.add(ENC.END.cell_business_contractorNIP);
            var15.add(ENC.END.cell_business_netValue);
            var15.add(ENC.END.cell_business_grossValue);
            var15.add(ENC.END.cell_business_taxValue);
            var15.add(ENC.END.cell_business_creationDate);
            var15.add(ENC.END.cell_business_state);
            ArrayList var16 = new ArrayList();
            String var17 = var9 != null ? var9.getValue() : null;
            if (var17 != null) {
                var16.add(new FDU(FLU, var17));
            }

            String var18 = var10 != null ? var10.getValue() : null;
            if (var18 != null) {
                var16.add(new FDU(FLT, var18));
            }

            String var19 = var11 != null ? var11.getValue() : null;
            if (var19 != null) {
                var16.add(new FDU(FMF, var19));
            }

            if (var12 != null && var12.getFirstValue() != null && var12.getSecondValue() != null) {
                var16.add(new FDU(FMD, var12.getFirstValue(), FDK.GREATER_THAN_OR_EQUALS));
                var16.add(new FDU(FMD, var12.getSecondValue(), FDK.LESS_THAN_OR_EQUALS));
            }

            if (var2 != null) {
                var16.add(new FDU(RHL, var2, FDK.EQUALS));
            }

            ArrayList var20 = new ArrayList();
            if (var14 != null && var14.length() >= 3) {
                FDJ var21 = new FDJ(FEB.OR);
                var21.IJR(new FDU(FLU, "%" + var14 + "%", FDK.LIKE));
                var21.IJR(new FDU(FME, "%" + var14 + "%", FDK.LIKE));
                var21.IJR(new FDU(FMF, "%" + var14 + "%", FDK.LIKE));
                var21.IJR(new FDU(FMG, "%" + var14 + "%", FDK.LIKE));
                var21.IJR(new FDU(FMH, "%" + var14 + "%", FDK.LIKE));
                var21.IJR(new FDU(FMI, "%" + var14 + "%", FDK.LIKE));
                var20.add(var21);
            }

            var25 = this.HLX(var1, "invoicesother", "invoicesotherTreeFull", var15, var16, var20, var3, var4, var5, var6, var7, var8);
        } finally {
            EXF.getInstance().ICP();
        }

        return var25;
    }

    public <_T extends IN> EVZ<Integer, List<EDF<_T>>> HLP(FFF var1, FDL var2, Integer var3, Integer var4, JN var5, IQ var6) throws FFK {
        EXF.getInstance().ICO();

        EVZ var7;
        try {
            var7 = this.HLX(var1, "receiptrecords", "receiptrecordsTreeFull", null, null, null, var2, var3, var4, var5, var6, null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var7;
    }

    public <_T extends JF> EVZ<Integer, List<EDF<_T>>> HLQ(FFF var1, FDL var2, Integer var3, Integer var4, JN var5, JH var6) throws FFK {
        EXF.getInstance().ICO();

        EVZ var7;
        try {
            var7 = this.HLX(var1, "settlementsLastChildIdFull", "settlementsTreeFull", null, null, null, var2, var3, var4, var5, var6, null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var7;
    }

    public <_T extends HJ> EVZ<Integer, List<EDF<_T>>> HLR(FFF var1, FDL var2, Integer var3, Integer var4, JN var5, HM var6, AGWW var7) throws FFK {
        EXF.getInstance().ICO();

        EVZ var8;
        try {
            var8 = this.HLX(var1, "declarations", "declarationsTreeFull", null, null, null, var2, var3, var4, var5, var6, var7);
        } finally {
            EXF.getInstance().ICP();
        }

        return var8;
    }

    public <_T extends HJ> EVZ<Integer, List<EDF<_T>>> QPW(FFF var1, FDL var2, Integer var3, Integer var4, JF var5, JN var6, HM var7, AGWW var8) throws FFK {
        EXF.getInstance().ICO();

        EVZ var10;
        try {
            if (var5 == null) {
                throw new FFI("Missing Settlement Id!");
            }

            ArrayList var9 = new ArrayList();
            var9.add(new FDU(FLF, var5.getId()));
            var10 = this.HLX(var1, "declarations", "declarationsTreeFull", null, var9, null, var2, var3, var4, var6, var7, var8);
        } finally {
            EXF.getInstance().ICP();
        }

        return var10;
    }

    public <_T extends HI> EVZ<Integer, List<EDF<_T>>> HLT(FFF var1, FDL var2) throws FFK {
        EXF.getInstance().ICO();

        EVZ var4;
        try {
            ArrayList var3 = new ArrayList();
            var3.add(ENC.END.cell_business_contractorName);
            var3.add(ENC.END.cell_business_contractorNIP);
            var4 = this.HLY(var1, "contacts", "contactsTreeFull", var3, null, null, var2, null, null, null, null, null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }

    public <_T extends HI> EVZ<Integer, List<EDF<_T>>> QPX(FFF var1, FDL var2, Integer var3, String var4) throws FFK {
        EXF.getInstance().ICO();

        EVZ var12;
        try {
            ArrayList var5 = new ArrayList();
            var5.add(ENC.END.cell_business_contractorName);
            var5.add(ENC.END.cell_business_contractorNIP);
            ArrayList var6 = new ArrayList();
            if (var3 != null) {
                var6.add(new FDU(QNS, var3));
            }

            ArrayList var7 = new ArrayList();
            if (var4 != null && var4.length() >= 3) {
                FDJ var8 = new FDJ(FEB.OR);
                var8.IJR(new FDU(FME, "%" + var4 + "%", FDK.LIKE));
                var8.IJR(new FDU(FMF, "%" + var4 + "%", FDK.LIKE));
                var7.add(var8);
            }

            var12 = this.HLY(var1, "contacts", "contactsTreeFull", var5, var6, var7, var2, null, null, null, null, null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var12;
    }

    public <_T extends IC> EVZ<Integer, List<EDF<_T>>> HLV(FFF var1, FDL var2, Integer var3, Integer var4, JN var5, IH var6) throws FFK {
        EXF.getInstance().ICO();

        EVZ var7;
        try {
            var7 = this.HLX(var1, "invoicerecordsLatestTypeForPeriod", "invoicerecordsTreeFull", null, null, null, var2, var3, var4, var5, var6, null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var7;
    }

    public <_T extends IC> EVZ<Integer, List<EDF<_T>>> QPY(FFF var1, FDL var2, Integer var3, Integer var4, JF var5, JN var6, IH var7) throws FFK {
        EXF.getInstance().ICO();

        EVZ var9;
        try {
            if (var5 == null) {
                throw new FFI("Missing Settlement Id!");
            }

            ArrayList var8 = new ArrayList();
            var8.add(new FDU(FLF, var5.getId()));
            var9 = this.HLX(var1, "invoicerecords", "invoicerecordsTreeFull", null, var8, null, var2, var3, var4, var6, var7, null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var9;
    }

    private <_T extends IK> EVZ<Integer, List<EDF<_T>>> HLX(FFF var1, String var2, String var3, List<ENC.END> var4, List<FDU<?>> var5, List<FDJ> var6, FDL var7, Integer var8, Integer var9, JN var10, Enum<?> var11, Enum<?> var12) throws FFK {
        EXF.getInstance().ICO();

        EVZ var17;
        try {
            if (var4 == null) {
                var4 = new ArrayList();
            }

            if (var5 == null) {
                var5 = new ArrayList();
            }

            if (var6 == null) {
                var6 = new ArrayList();
            }

            var4.add(ENC.END.cell_business_periodYear);
            var4.add(ENC.END.cell_business_periodMonth);
            String var13 = var11 != null ? var11.name() : null;
            if (var13 != null) {
                var5.add(new FDU(FLN, var13));
            }

            String var14 = var12 != null ? var12.name() : null;
            if (var14 != null) {
                var5.add(new FDU(FLO, var14));
            }

            if (var10 != null) {
                JN var15 = var10.DDN();
                if (var15.DDJ().getValue() != null) {
                    var5.add(new FDU(FLV, var15.DDJ().getValue()));
                }

                if (var15.DDK().getValue() != null) {
                    var5.add(new FDU(FLW, var15.DDK().getValue()));
                }
            }

            if (var5.isEmpty()) {
                EXF.getInstance().ICK("Query without any predicates.");
            }

            ArrayList var21 = new ArrayList();
            FDL var16 = null;
            if (var7 == null) {
                var16 = FDL.ASC;
            } else {
                var16 = var7;
            }

            if (var16 != FDL.NONE) {
                var21.add(new FEA(FLV, var16));
                var21.add(new FEA(FLW, var16));
                var21.add(new FEA(FLG, var16));
            }

            var17 = this.HLZ(var1, var2, var3, var4, var5, var6, var21, var8, var9);
        } finally {
            EXF.getInstance().ICP();
        }

        return var17;
    }

    private <_T extends KV> EVZ<Integer, List<EDF<_T>>> HLY(FFF var1, String var2, String var3, List<ENC.END> var4, List<FDU<?>> var5, List<FDJ> var6, FDL var7, Integer var8, Integer var9, JN var10, Enum<?> var11, Enum<?> var12) throws FFK {
        EXF.getInstance().ICO();

        EVZ var17;
        try {
            if (var4 == null) {
                var4 = new ArrayList();
            }

            if (var5 == null) {
                var5 = new ArrayList();
            }

            if (var6 == null) {
                var6 = new ArrayList();
            }

            if (var10 != null) {
                JN var13 = var10.DDN();
                if (var13.DDJ().getValue() != null) {
                    var5.add(new FDU(FLV, var13.DDJ().getValue()));
                }

                if (var13.DDK().getValue() != null) {
                    var5.add(new FDU(FLW, var13.DDK().getValue()));
                }
            }

            String var21 = var11 != null ? var11.name() : null;
            if (var21 != null) {
                var5.add(new FDU(FLN, var21));
            }

            String var14 = var12 != null ? var12.name() : null;
            if (var14 != null) {
                var5.add(new FDU(FLO, var14));
            }

            if (var5.isEmpty()) {
                EXF.getInstance().ICK("Query without any predicates.");
            }

            ArrayList var15 = new ArrayList();
            FDL var16 = null;
            if (var7 == null) {
                var16 = FDL.ASC;
            } else {
                var16 = var7;
            }

            if (var16 != FDL.NONE) {
                var15.add(new FEA(FME, var16));
                var15.add(new FEA(FMF, var16));
            }

            var17 = this.HLZ(var1, var2, var3, var4, var5, var6, var15, var8, var9);
        } finally {
            EXF.getInstance().ICP();
        }

        return var17;
    }

    private <_T extends KV> EVZ<Integer, List<EDF<_T>>> HLZ(final FFF var1, String var2, final String var3, List<ENC.END> var4, List<FDU<?>> var5, List<FDJ> var6, List<FEA> var7, Integer var8, Integer var9) throws FFK {
        EXF.getInstance().ICO();

        try {
            final Connection var10 = this.FIT;
            ArrayList var11 = new ArrayList();
            var11.add(new FDX(FLD));
            var11.add(new FDX(FLE));
            var11.add(new FDX(FLN));
            var11.add(new FDX(FLO));
            var11.add(new FDX(FLP));
            if (var4 != null) {
                Iterator var12 = var4.iterator();

                while (var12.hasNext()) {
                    ENC.END var13 = (ENC.END) var12.next();
                    var11.add(new FDX(var13.getDefinition()));
                }
            }

            ArrayList var23 = new ArrayList();
            if (var5 != null && var5.size() > 0) {
                var23.addAll(var5);
            } else {
                EXF.getInstance().ICK("Query without any predicates.");
            }

            ArrayList var24 = new ArrayList();
            if (var7 != null && var7.size() > 0) {
                var24.addAll(var7);
            } else {
                EXF.getInstance().ICK("Query without any order.");
            }

            EVZ var14 = this.HMC(var10, var2, var3, var4, var11, var23, var6, var24, var8, var9, new ENC.ENF<EWD<EDF<_T>>, EDF<_T>>() {
                private final String TCL = "topElementDef";

                public EWD<EDF<_T>> HNG(List<ENC.END> var1x, String var2, Map<String, Map<Integer, List<FDU<?>>>> var3x) throws Exception {
                    EXF.getInstance().ICO();

                    try {
                        HashMap var4 = new HashMap();
                        HashMap var5 = new HashMap();
                        Iterator var6 = var3x.entrySet().iterator();

                        while (var6.hasNext()) {
                            Map.Entry var7 = (Map.Entry) var6.next();
                            Iterator var8 = ((Map) var7.getValue()).entrySet().iterator();

                            while (var8.hasNext()) {
                                Map.Entry var9 = (Map.Entry) var8.next();
                                EWC var10x = this.createWrapper(var1x, (List) var9.getValue());
                                var4.put(var10x.getFirstValue(), var10x.getThirdValue());
                                var5.put(var10x.getSecondValue(), var10x.getFirstValue());
                            }
                        }

                        EDF var14 = null;
                        String var15 = "topElementDef";
                        EDF var16 = null;

                        do {
                            var15 = (String) var5.get(var15);
                            if (var16 == null) {
                                var16 = (EDF) var4.get(var15);
                            } else if (var15 != null) {
                                EDF var17 = (EDF) var4.get(var15);
                                var16.setChild(var17);
                                var17.setParent(var16);
                                var16 = var17;
                            }

                            if (var2.equals(var15)) {
                                var14 = var16;
                            }
                        } while (var15 != null);

                        EWD var18 = new EWD(var14);
                        return var18;
                    } finally {
                        EXF.getInstance().ICP();
                    }
                }

                private EWC<String, String, EDF<_T>> createWrapper(List<ENC.END> var1x, List<FDU<?>> var2) {
                    EXF.getInstance().ICO();

                    try {
                        String var3x = null;
                        String var4 = null;
                        HashMap var5 = new HashMap();
                        Iterator var6 = var2.iterator();

                        while (var6.hasNext()) {
                            FDU var7 = (FDU) var6.next();
                            String var8 = var7.getName();
                            ENC.END var9 = ENC.END.getDefinedCellByName(var8);
                            Object var10x = var7.getValue();
                            switch (var9) {
                                case cell_technical_id:
                                    var3x = (String) var10x;
                                    break;
                                case cell_technical_parentid:
                                    var4 = (String) var10x;
                                    break;
                                case cell_technical_type:
                                case cell_technical_subType:
                                case cell_technical_typeclass:
                                    var5.put(var8, var10x);
                                    break;
                                case cell_business_periodYear:
                                    var5.put(var8, var10x);
                                    break;
                                case cell_business_periodMonth:
                                    var5.put(var8, var10x);
                                    break;
                                default:
                                    if (var1x != null && var1x.contains(var9)) {
                                        FDR var11 = var9.getDefinition();
                                        FDV var12 = var11.getType();
                                        switch (var12) {
                                            case TEXT:
                                                var5.put(var8, var10x);
                                                break;
                                            case INTEGER:
                                                var5.put(var8, var10x);
                                                break;
                                            case TINYINT:
                                                if (var10x instanceof Integer) {
                                                    var5.put(var8, ((Integer) var10x).shortValue());
                                                } else {
                                                    if (!(var10x instanceof Short)) {
                                                        throw new FFI("Invalid cell [" + var8 + "] type [" + var10x + "]!");
                                                    }

                                                    var5.put(var8, var10x);
                                                }
                                                break;
                                            case REAL:
                                                var5.put(var8, BigDecimal.valueOf((Double) var10x));
                                                break;
                                            case BLOB:
                                                var5.put(var8, var10x);
                                                break;
                                            case DATE:
                                                if (var10x != null) {
                                                    var5.put(var8, new Date((Long) var10x));
                                                } else {
                                                    var5.put(var8, null);
                                                }
                                                break;
                                            default:
                                                throw new FFI("Unexpected type [" + var12 + "]!");
                                        }
                                    }
                            }
                        }

                        String var16 = var4 == null ? "topElementDef" : var4;
                        String finalVar3x = var3x;
                        EWC var17 = new EWC(var3x, var16, new EDF(new EDE<_T>() {
                            public _T HGW() throws FFK {
                                ArrayList var1x = new ArrayList();
                                ArrayList var2 = new ArrayList();
                                var2.add(new FDU(ENC.FMJ, finalVar3x));
                                EWD var3xx = EMX.this.HMD(var10, var3, var1x, var2, new ENC.ENF<EWD<_T>, _T>() {
                                    private final FFF RUA = var1;

                                    public EWD<_T> HNG(List<ENC.END> var1x, String var2, Map<String, Map<Integer, List<FDU<?>>>> var3xx) throws Exception {
                                        EXF.getInstance().ICO();

                                        try {
                                            HashMap var4 = new HashMap();
                                            HashMap var5 = new HashMap();
                                            Iterator var6 = var3xx.entrySet().iterator();

                                            while (var6.hasNext()) {
                                                Map.Entry var7 = (Map.Entry) var6.next();
                                                Iterator var8 = ((Map) var7.getValue()).entrySet().iterator();

                                                while (var8.hasNext()) {
                                                    Map.Entry var9 = (Map.Entry) var8.next();
                                                    EWC var10x = this.createElement((List) var9.getValue());
                                                    var4.put(var10x.getFirstValue(), var10x.getThirdValue());
                                                    var5.put(var10x.getSecondValue(), var10x.getFirstValue());
                                                }
                                            }

                                            KV var14 = null;
                                            String var15 = "topElementDef";
                                            KV var16 = null;

                                            do {
                                                var15 = (String) var5.get(var15);
                                                if (var16 == null) {
                                                    var16 = (KV) var4.get(var15);
                                                } else if (var15 != null) {
                                                    KV var17 = (KV) var4.get(var15);
                                                    var16.setChild(var17);
                                                    var17.setParent(var16);
                                                    var16 = var17;
                                                }

                                                if (var2.equals(var15)) {
                                                    var14 = var16;
                                                }
                                            } while (var15 != null);

                                            EWD var18 = new EWD(var14);
                                            return var18;
                                        } finally {
                                            EXF.getInstance().ICQ();
                                        }
                                    }

                                    private EWC<String, String, _T> createElement(List<FDU<?>> var1x) throws Exception {
                                        EXF.getInstance().ICO();

                                        EWC var22;
                                        try {
                                            String var2 = null;
                                            String var3xx = null;
                                            Class var4 = null;
                                            Short var5 = null;
                                            byte[] var6 = null;
                                            byte[] var7 = null;
                                            byte[] var8 = null;
                                            String var9 = null;
                                            Integer var10x = null;
                                            Iterator var11 = var1x.iterator();

                                            while (var11.hasNext()) {
                                                FDU var12 = (FDU) var11.next();
                                                String var13 = var12.getName();
                                                Object var14 = var12.getValue();
                                                if (ENC.FLD.getName().equals(var13)) {
                                                    var2 = (String) var14;
                                                } else if (ENC.FLE.getName().equals(var13)) {
                                                    var3xx = (String) var14;
                                                } else if (ENC.FLP.getName().equals(var13)) {
                                                    var4 = Class.forName((String) var14);
                                                } else if (ENC.FLQ.getName().equals(var13)) {
                                                    if (var14 instanceof Integer) {
                                                        var5 = ((Integer) var14).shortValue();
                                                    } else {
                                                        if (!(var14 instanceof Short)) {
                                                            throw new FFK("Invalid cell [" + var13 + "] type [" + var14 + "]!");
                                                        }

                                                        var5 = (Short) var14;
                                                    }
                                                } else if (ENC.FLK.getName().equals(var13)) {
                                                    var6 = (byte[]) var14;
                                                } else if (ENC.FLR.getName().equals(var13)) {
                                                    var7 = (byte[]) var14;
                                                } else if (ENC.FLS.getName().equals(var13)) {
                                                    var8 = (byte[]) var14;
                                                } else if (ENC.FLX.getName().equals(var13)) {
                                                    var10x = (Integer) var14;
                                                } else if (ENC.RHL.getName().equals(var13)) {
                                                    var9 = (String) var14;
                                                }
                                            }

                                            String var19 = var3xx == null ? "topElementDef" : var3xx;
                                            byte[] var20;
                                            if (var5 > 0) {
                                                var20 = EMX.this.QJP(this.RUA, var6, var7, var8, var3, var2);
                                            } else {
                                                var20 = var8;
                                            }

                                            KV var21 = EMX.this.QJQ(var20, var4, var3, var2);
                                            if (var10x != null && var21 instanceof EXM) {
                                                EXM var15 = (EXM) var21;
                                                var15.FJI().setValue(var10x);
                                            }

                                            if (var9 != null && var21 instanceof KV) {
                                                var21.setState(QSW.getByKey(var9));
                                            }

                                            var22 = new EWC(var2, var19, var21);
                                        } finally {
                                            EXF.getInstance().ICQ();
                                        }

                                        return var22;
                                    }
                                });
                                return (_T) var3xx.getFirstValue();
                            }
                        }, var3x, var5));
                        return var17;
                    } finally {
                        EXF.getInstance().ICP();
                    }
                }
            });
            ArrayList var15 = new ArrayList();
            Iterator var16 = ((List) var14.getSecondValue()).iterator();

            while (var16.hasNext()) {
                EWD var17 = (EWD) var16.next();
                var15.add(var17.getFirstValue());
            }

            EVZ var25 = new EVZ(var14.getFirstValue(), var15);
            return var25;
        } catch (Exception var21) {
            EXF.getInstance().ICA(var21);
            throw new FFK(var21);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    private byte[] QJP(FFF var1, byte[] var2, byte[] var3, byte[] var4, String var5, String var6) throws Exception {
        EXF.getInstance().ICO();

        byte[] var7;
        try {
            var7 = var1.ILI(var3, var2, var4);
        } catch (Exception var14) {
            EXF.getInstance().IBZ("About to move corrupted (encryption) data [" + var5 + " | " + var6 + "] to purgatory.", var14);
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();
            var14.printStackTrace(new PrintStream(var8));
            String var9 = new String(var8.toByteArray(), StandardCharsets.UTF_8);
            Connection var10 = this.FIT;
            this.HLG();
            FDB.QIR(var10, this.QIN.get(var5), FLD, var6, var9);
            this.HLF();
            EXF.getInstance().ICE("Moving corrupted (encryption) data [" + var5 + " | " + var6 + "] to purgatory succeded");
            throw FCZ.getInstance().QIT(var5, var6, var9);
        } finally {
            EXF.getInstance().ICP();
        }

        return var7;
    }

    private <_T extends KV> _T QJQ(byte[] var1, Class<_T> var2, String var3, String var4) throws Exception {
        EXF.getInstance().ICO();

        KV var5;
        try {
            var5 = this.HLA(var1, var2);
        } catch (Exception var12) {
            EXF.getInstance().IBZ("About to move corrupted (unmarshal) data [" + var3 + " | " + var4 + "] to purgatory.", var12);
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            var12.printStackTrace(new PrintStream(var6));
            String var7 = new String(var6.toByteArray(), StandardCharsets.UTF_8);
            Connection var8 = this.FIT;
            this.HLG();
            FDB.QIR(var8, this.QIN.get(var3), FLD, var4, var7);
            this.HLF();
            EXF.getInstance().ICE("Moving corrupted (unmarshal) data [" + var3 + " | " + var4 + "] to purgatory succeded");
            throw FCZ.getInstance().QIT(var3, var4, var7);
        } finally {
            EXF.getInstance().ICP();
        }

        return (_T) var5;
    }

    private <_T extends LW> _T HMA(final FFF var1, final String var2, String var3, Class<_T> var4, Integer var5) throws FFK {
        EXF.getInstance().ICO();

        LW var10;
        try {
            ArrayList var6 = new ArrayList();
            ArrayList var7 = new ArrayList();
            var7.add(new FDU(FLJ, var3));
            var7.add(new FDU(FLP, var4.getName()));
            if (var5 != null) {
                var7.add(new FDU(FLI, var5));
            }

            ArrayList var8 = new ArrayList();
            EVZ var9 = this.HMB(this.FIS, var2, var6, var7, var8, null, null, new ENC.ENE<EWD<_T>, _T>() {
                private final FFF RUB = var1;

                public EWD<_T> HNF(List<FDU<?>> var1x) throws Exception {
                    String var2x = null;
                    Class var3 = null;
                    Short var4 = null;
                    byte[] var5 = null;
                    byte[] var6 = null;
                    byte[] var7 = null;
                    Iterator var8 = var1x.iterator();

                    while (var8.hasNext()) {
                        FDU var9 = (FDU) var8.next();
                        String var10 = var9.getName();
                        Object var11 = var9.getValue();
                        if (ENC.FLD.getName().equals(var10)) {
                            var2x = (String) var11;
                        } else if (ENC.FLP.getName().equals(var10)) {
                            var3 = Class.forName((String) var11);
                        } else if (ENC.FLQ.getName().equals(var10)) {
                            var4 = ((Integer) var11).shortValue();
                        } else if (ENC.FLK.getName().equals(var10)) {
                            var5 = (byte[]) var11;
                        } else if (ENC.FLR.getName().equals(var10)) {
                            var6 = (byte[]) var11;
                        } else if (ENC.FLS.getName().equals(var10)) {
                            var7 = (byte[]) var11;
                        }
                    }

                    byte[] var12;
                    if (var4 > 0) {
                        var12 = EMX.this.QJP(this.RUB, var5, var6, var7, var2, var2x);
                    } else {
                        var12 = var7;
                    }

                    LW var13 = (LW) EMX.this.QJQ(var12, var3, var2, var2x);
                    return new EWD(var13);
                }
            });
            if ((Integer) var9.getFirstValue() != 0 || ((List) var9.getSecondValue()).size() != 0) {
                if ((Integer) var9.getFirstValue() == 1 && ((List) var9.getSecondValue()).size() == 1) {
                    var10 = (LW) ((EWD) ((List) var9.getSecondValue()).iterator().next()).getFirstValue();
                    return (_T) var10;
                }

                throw new FFK("ModelTechnicalElement duplicate! username [" + var3 + "] modelConfigurationElementClass [" + var4 + "]");
            }

            var10 = null;
        } catch (Exception var14) {
            EXF.getInstance().ICA(var14);
            throw new FFK(var14);
        } finally {
            EXF.getInstance().ICP();
        }

        return (_T) var10;
    }

    private <_A extends EWD<_T>, _T extends KU> EVZ<Integer, List<_A>> HMB(Connection var1, String var2, List<FDX> var3, List<FDU<?>> var4, List<FEA> var5, Integer var6, Integer var7, ENC.ENE<_A, _T> var8) throws FFK {
        EXF.getInstance().ICO();

        try {
            if (var8 == null) {
                throw FCZ.getInstance().IHG();
            } else {
                synchronized (var2) {
                    int var10 = -1;
                    FDE var11 = new FDE(FJM, var2);
                    var11.IJH(new FDX("1", "count_", FEI.COUNT));
                    var11.IJC(var4);
                    FDB.IIO(var1, var11);
                    if (var11.getResults().size() == 1) {
                        FDU var12 = (FDU) ((Map) var11.getResults().get(0)).get("count_");
                        if (var12 != null) {
                            var10 = (Integer) var12.getValue();
                        }
                    }

                    FDE var26 = new FDE(FJM, var2);
                    var26.IJI(var3);
                    var26.IJC(var4);
                    var26.IJK(var5);
                    FDB.IIO(var1, var6, var7, var26);
                    EXF.getInstance().ICK("count " + var10);
                    ArrayList var13 = new ArrayList();
                    Iterator var14 = var26.getResults().iterator();

                    while (var14.hasNext()) {
                        Map var15 = (Map) var14.next();
                        ArrayList var16 = new ArrayList();
                        var16.addAll(var15.values());
                        EWD var17 = var8.HNF(var16);
                        var13.add(var17);
                    }

                    EVZ var27 = new EVZ(var10, var13);
                    return var27;
                }
            }
        } catch (Exception var24) {
            EXF.getInstance().ICA(var24);
            throw new FFK(var24);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    private <_A extends EWD<_T>, _T extends KU> EVZ<Integer, List<_A>> HMC(Connection var1, String var2, String var3, List<ENC.END> var4, List<FDX> var5, List<FDU<?>> var6, List<FDJ> var7, List<FEA> var8, Integer var9, Integer var10, ENC.ENF<_A, _T> var11) throws FFK {
        EXF.getInstance().ICO();

        try {
            if (var11 == null) {
                throw FCZ.getInstance().IHG();
            } else {
                synchronized (var2) {
                    ArrayList var13 = new ArrayList();
                    var13.add(new FDX(FMJ));
                    var13.add(new FDX(FMK));
                    var13.add(new FDX(FML));
                    var13.addAll(var5);
                    int var14 = -1;
                    FDE var15 = new FDE(FJM, var2);
                    var15.IJH(new FDX("1", "count_", FEI.COUNT));
                    var15.IJC(var6);
                    var15.IJD(var7);
                    FDB.IIO(var1, var15);
                    if (var15.getResults().size() == 1) {
                        FDU var16 = (FDU) ((Map) var15.getResults().get(0)).get("count_");
                        if (var16 != null) {
                            var14 = (Integer) var16.getValue();
                        }
                    }

                    EXF.getInstance().ICK("count " + var14);
                    FDE var37 = new FDE(FJM, "query_", var2);
                    var37.IJC(var6);
                    var37.IJD(var7);
                    var37.IJK(var8);
                    FDE var17 = new FDE(FJM, "data_", var3);
                    var17.IJI(var13);
                    var17.setJoin("inner join", new FDT(FMJ, var37, FLD, FDK.EQUALS));
                    FDB.IIO(var1, var9, var10, var37, var17);
                    ArrayList var18 = new ArrayList();
                    HashMap var19 = new HashMap();
                    Iterator var20 = var17.getResults().iterator();

                    String var23;
                    String var24;
                    Integer var25;
                    List var46;
                    do {
                        if (!var20.hasNext()) {
                            ArrayList var38 = new ArrayList();
                            Iterator var39 = var18.iterator();

                            while (var39.hasNext()) {
                                EVZ var41 = (EVZ) var39.next();
                                EWD var42 = var11.HNG(var4, (String) var41.getFirstValue(), (Map) var41.getSecondValue());
                                var38.add(var42);
                            }

                            EVZ var40 = new EVZ(var14, var38);
                            return var40;
                        }

                        Map var21 = (Map) var20.next();
                        ArrayList var22 = new ArrayList();
                        var22.addAll(var21.values());
                        var23 = null;
                        var24 = null;
                        var25 = null;
                        Iterator var26 = var22.iterator();

                        while (var26.hasNext()) {
                            FDU var27 = (FDU) var26.next();
                            String var28 = var27.getName();
                            if (FMJ.getName().equals(var28)) {
                                var23 = (String) var27.getValue();
                            } else if (FMK.getName().equals(var28)) {
                                var24 = (String) var27.getValue();
                            } else if (FML.getName().equals(var28)) {
                                var25 = (Integer) var27.getValue();
                            }
                        }

                        if (!var19.containsKey(var23)) {
                            HashMap var43 = new HashMap();
                            var19.put(var23, var43);
                        }

                        Map var44 = (Map) var19.get(var23);
                        if ("b_select".equals(var24)) {
                            var18.add(new EVZ(var23, var44));
                        }

                        if (!var44.containsKey(var24)) {
                            var44.put(var24, new HashMap());
                        }

                        Map var45 = (Map) var44.get(var24);
                        var46 = (List) var45.put(var25, var22);
                    } while (var46 == null);

                    throw new FFI("Data corruption for [" + var23 + "] [" + var24 + "] [" + var25 + "]");
                }
            }
        } catch (Exception var35) {
            EXF.getInstance().ICA(var35);
            throw new FFK(var35);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    private <_A extends EWD<_T>, _T extends KU> _A HMD(Connection var1, String var2, List<FDX> var3, List<FDU<?>> var4, ENC.ENF<_A, _T> var5) throws FFK {
        EXF.getInstance().ICO();

        try {
            if (var5 == null) {
                throw FCZ.getInstance().IHG();
            } else {
                synchronized (var2) {
                    ArrayList var7 = new ArrayList();
                    var7.add(new FDX(FMJ));
                    var7.add(new FDX(FMK));
                    var7.add(new FDX(FML));
                    if (var3 != null && !var3.isEmpty()) {
                        var7.addAll(var3);
                    } else {
                        EXF.getInstance().ICK("Query for all columns.");
                        var7.add(new FDX("*"));
                    }

                    FDE var8 = new FDE(FJM, "data_", var2);
                    var8.IJI(var7);
                    var8.IJC(var4);
                    FDB.IIO(var1, var8);
                    HashMap var9 = new HashMap();
                    String var10 = null;
                    Iterator var11 = var8.getResults().iterator();

                    String var14;
                    String var15;
                    Integer var16;
                    List var31;
                    do {
                        if (!var11.hasNext()) {
                            if (var8.getResults().size() == 0) {
                                throw new FFK("ModelBaseElement does NOT exists!");
                            }

                            if (var10 == null) {
                                throw new FFK("Database corruption, query id not set!");
                            }

                            EWD var28 = var5.HNG(null, var10, var9);
                            EWD var29 = var28;
                            return (_A) var29;
                        }

                        Map var12 = (Map) var11.next();
                        ArrayList var13 = new ArrayList();
                        var13.addAll(var12.values());
                        var14 = null;
                        var15 = null;
                        var16 = null;
                        Iterator var17 = var13.iterator();

                        while (var17.hasNext()) {
                            FDU var18 = (FDU) var17.next();
                            String var19 = var18.getName();
                            if (FMJ.getName().equals(var19)) {
                                var14 = (String) var18.getValue();
                            } else if (FMK.getName().equals(var19)) {
                                var15 = (String) var18.getValue();
                            } else if (FML.getName().equals(var19)) {
                                var16 = (Integer) var18.getValue();
                            }
                        }

                        if (var10 == null) {
                            var10 = var14;
                        }

                        if (!var9.containsKey(var15)) {
                            var9.put(var15, new HashMap());
                        }

                        Map var30 = (Map) var9.get(var15);
                        var31 = (List) var30.put(var16, var13);
                    } while (var31 == null);

                    throw new FFI("Data corruption for [" + var14 + "] [" + var15 + "] [" + var16 + "]");
                }
            }
        } catch (Exception var26) {
            EXF.getInstance().ICA(var26);
            throw new FFK(var26);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public <_T extends LW> void HME(FDO var1, FFF var2, String var3, _T var4) throws FFK {
        EXF.getInstance().ICO();

        try {
            this.HML(var1, var2, var3, "preferences", var4);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private static HU getInvoiceFirstParent(HN<?> var0) {
        EXF.getInstance().ICO();

        try {
            HN var1;
            for (var1 = var0; var1.getParentInvoiceOnlyActive() != null; var1 = var1.getParentInvoiceOnlyActive()) {
            }

            HU var2 = (HU) var1;
            return var2;
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public void ROD(String var1, EDF<?> var2) throws FFK {
        EXF.getInstance().ICO();

        try {
            ArrayList var3 = new ArrayList();
            ArrayList var4 = new ArrayList();
            var4.add(new FDU(FLD, var2.getId()));
            Map var5 = var2.getValuesMap();
            Iterator var6 = var5.entrySet().iterator();

            while (var6.hasNext()) {
                Map.Entry var7 = (Map.Entry) var6.next();
                var3.add(new FDU(END.getDefinedCellByName((String) var7.getKey()).getDefinition(), var7.getValue()));
            }

            this.HMT(this.FIT, var1, var4, var3);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public <_T extends HN<?>> void HMF(FDO var1, FFF var2, _T var3) throws FFK {
        EXF.getInstance().ICO();

        try {
            ArrayList var4 = new ArrayList();
            if (var3.getIssuerNumber() != null && var3.getIssuerNumber().getValue() != null) {
                var4.add(new FDU(FLT, var3.getIssuerNumber().getValue()));
            }

            if (var3.getRefId() != null && var3.getRefId().getValue() != null) {
                var4.add(new FDU(FLU, var3.getRefId().getValue()));
            }

            if (var3.getCreationDate() != null && var3.getCreationDate().getValue() != null) {
                var4.add(new FDU(FMD, var3.getCreationDate().getValueDate()));
            }

            HI var6;
            label319:
            switch (var3.getInvoiceType()) {
                case SELL:
                    if (((HY) var3).getInvoicingDate() != null && ((HY) var3).getInvoicingDate().getValue() != null) {
                        var4.add(new FDU(FMC, ((HY) var3).getInvoicingDate().getValueDate()));
                    }

                    switch (var3.getInvoiceSubType()) {
                        case INVOICE:
                        case AGGREGATE:
                            HU var14 = (HU) var3;
                            if (var14.getAmountSummaryWithoutTax() != null && var14.getAmountSummaryWithoutTax().getValue() != null) {
                                var4.add(new FDU(FMG, var14.getAmountSummaryWithoutTax().getValue()));
                            }

                            if (var14.getAmountSummaryWithTax() != null && var14.getAmountSummaryWithTax().getValue() != null) {
                                var4.add(new FDU(FMH, var14.getAmountSummaryWithTax().getValue()));
                            }

                            if (var14.getAmountTax() != null && var14.getAmountTax().getValue() != null) {
                                var4.add(new FDU(FMI, var14.getAmountTax().getValue()));
                            }

                            if (var3.getTransactionDate() != null && var3.getTransactionDate().getValue() != null) {
                                var4.add(new FDU(QNR, var3.getTransactionDate().getValueDate()));
                            }

                            var6 = var14.getContractor();
                            if (var6 != null && var6.getName() != null && var6.getName().getValue() != null) {
                                var4.add(new FDU(FME, var6.getName().getValue()));
                                var4.add(new FDU(FMF, var6.getNip().getValue()));
                            }
                            break label319;
                        case CORRECTION:
                            HV var13 = (HV) var3;
                            if (var13.getDifferenceAmountSummaryWithoutTax() != null && var13.getDifferenceAmountSummaryWithoutTax().getValue() != null) {
                                var4.add(new FDU(FMG, var13.getDifferenceAmountSummaryWithoutTax().getValue()));
                            }

                            if (var13.getDifferenceAmountSummaryWithTax() != null && var13.getDifferenceAmountSummaryWithTax().getValue() != null) {
                                var4.add(new FDU(FMH, var13.getDifferenceAmountSummaryWithTax().getValue()));
                            }

                            if (var13.getDifferenceAmountTax() != null && var13.getDifferenceAmountTax().getValue() != null) {
                                var4.add(new FDU(FMI, var13.getDifferenceAmountTax().getValue()));
                            }

                            HU var15 = getInvoiceFirstParent(var3);
                            if (var15.getTransactionDate() != null && var15.getTransactionDate().getValue() != null) {
                                var4.add(new FDU(QNR, var15.getTransactionDate().getValueDate()));
                            }

                            Object var7;
                            for (var7 = var13; ((HN) var7).getParentInvoiceOnlyActive() != null; var7 = ((HN) var7).getParentInvoiceOnlyActive()) {
                            }

                            HU var8 = (HU) var7;
                            HI var9 = var8.getContractor();
                            if (var9 != null && var9.getName() != null && var9.getName().getValue() != null) {
                                var4.add(new FDU(FME, var9.getName().getValue()));
                                var4.add(new FDU(FMF, var9.getNip().getValue()));
                            }
                            break label319;
                        default:
                            throw new FFK("Unexpected invoice subtype [" + var3.getInvoiceSubType() + "]!");
                    }
                case PURCHASE:
                    switch (var3.getInvoiceSubType()) {
                        case INVOICE:
                        case AGGREGATE:
                            HR var5 = (HR) var3;
                            if (var5.getInvoicingDate() != null && var5.getInvoicingDate().getValue() != null) {
                                var4.add(new FDU(FMC, var5.getInvoicingDate().getValueDate()));
                            }

                            if (var5.getAmountSummaryWithoutTax() != null && var5.getAmountSummaryWithoutTax().getValue() != null) {
                                var4.add(new FDU(FMG, var5.getAmountSummaryWithoutTax().getValue()));
                            }

                            if (var5.getAmountSummaryWithTax() != null && var5.getAmountSummaryWithTax().getValue() != null) {
                                var4.add(new FDU(FMH, var5.getAmountSummaryWithTax().getValue()));
                            }

                            if (var5.getAmountTax() != null && var5.getAmountTax().getValue() != null) {
                                var4.add(new FDU(FMI, var5.getAmountTax().getValue()));
                            }

                            if (var3.getTransactionDate() != null && var3.getTransactionDate().getValue() != null) {
                                var4.add(new FDU(QNR, var3.getTransactionDate().getValueDate()));
                            }

                            var6 = var5.getContractor();
                            if (var6 != null && var6.getName() != null && var6.getName().getValue() != null) {
                                var4.add(new FDU(FME, var6.getName().getValue()));
                                var4.add(new FDU(FMF, var6.getNip().getValue()));
                            }
                            break label319;
                        default:
                            throw new FFK("Unexpected invoice subtype [" + var3.getInvoiceSubType() + "]!");
                    }
                default:
                    throw new FFK("Unexpected invoice type [" + var3.getInvoiceType() + "]!");
            }

            this.HMN(var1, var2, "invoices", var3, var3.getParentInvoiceWithCanceled(), var3.getInvoiceType().name(), var3.getInvoiceSubType().name(), var4);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public <_T extends QSG<?>> void ROE(FDO var1, FFF var2, _T var3) throws FFK {
        EXF.getInstance().ICO();

        try {
            ArrayList var4 = new ArrayList();
            if (var3.getIssuerNumber() != null && var3.getIssuerNumber().getValue() != null) {
                var4.add(new FDU(FLT, var3.getIssuerNumber().getValue()));
            }

            if (var3.getRefId() != null && var3.getRefId().getValue() != null) {
                var4.add(new FDU(FLU, var3.getRefId().getValue()));
            }

            if (var3.getCreationDate() != null && var3.getCreationDate().getValue() != null) {
                var4.add(new FDU(FMD, var3.getCreationDate().getValueDate()));
            }

            HI var6;
            label201:
            switch (var3.getInvoiceOtherType()) {
                case SELL:
                    if (((QSO) var3).getInvoicingDate() != null && ((QSO) var3).getInvoicingDate().getValue() != null) {
                        var4.add(new FDU(FMC, ((QSO) var3).getInvoicingDate().getValueDate()));
                    }

                    switch (var3.getInvoiceOtherSubType()) {
                        case SELL_REASON_1:
                        case SELL_REASON_2:
                        case SELL_REASON_3:
                        case SELL_REASON_4:
                            QSN var10 = (QSN) var3;
                            if (var10.getAmountSummaryWithoutTax() != null && var10.getAmountSummaryWithoutTax().getValue() != null) {
                                var4.add(new FDU(FMG, var10.getAmountSummaryWithoutTax().getValue()));
                            }

                            if (var10.getAmountSummaryWithTax() != null && var10.getAmountSummaryWithTax().getValue() != null) {
                                var4.add(new FDU(FMH, var10.getAmountSummaryWithTax().getValue()));
                            }

                            if (var10.getAmountTax() != null && var10.getAmountTax().getValue() != null) {
                                var4.add(new FDU(FMI, var10.getAmountTax().getValue()));
                            }

                            var6 = var10.getContractor();
                            if (var6 != null && var6.getName() != null && var6.getName().getValue() != null) {
                                var4.add(new FDU(FME, var6.getName().getValue()));
                                var4.add(new FDU(FMF, var6.getNip().getValue()));
                            }
                            break label201;
                        default:
                            throw new FFK("Unexpected invoice other subtype [" + var3.getInvoiceOtherSubType() + "]!");
                    }
                case PURCHASE:
                    switch (var3.getInvoiceOtherSubType()) {
                        case PURCHASE_REASON_1:
                        case PURCHASE_REASON_2:
                        case PURCHASE_REASON_3:
                        case PURCHASE_REASON_4:
                            QSK var5 = (QSK) var3;
                            if (var5.getInvoicingDate() != null && var5.getInvoicingDate().getValue() != null) {
                                var4.add(new FDU(FMC, var5.getInvoicingDate().getValueDate()));
                            }

                            if (var5.getAmountSummaryWithoutTax() != null && var5.getAmountSummaryWithoutTax().getValue() != null) {
                                var4.add(new FDU(FMG, var5.getAmountSummaryWithoutTax().getValue()));
                            }

                            if (var5.getAmountSummaryWithTax() != null && var5.getAmountSummaryWithTax().getValue() != null) {
                                var4.add(new FDU(FMH, var5.getAmountSummaryWithTax().getValue()));
                            }

                            if (var5.getAmountTax() != null && var5.getAmountTax().getValue() != null) {
                                var4.add(new FDU(FMI, var5.getAmountTax().getValue()));
                            }

                            var6 = var5.getContractor();
                            if (var6 != null && var6.getName() != null && var6.getName().getValue() != null) {
                                var4.add(new FDU(FME, var6.getName().getValue()));
                                var4.add(new FDU(FMF, var6.getNip().getValue()));
                            }
                            break label201;
                        default:
                            throw new FFK("Unexpected invoice other subtype [" + var3.getInvoiceOtherSubType() + "]!");
                    }
                default:
                    throw new FFK("Unexpected invoice other type [" + var3.getInvoiceOtherType() + "]!");
            }

            this.HMN(var1, var2, "invoicesother", var3, var3.getParentInvoiceWithCanceled(), var3.getInvoiceOtherType().name(), var3.getInvoiceOtherSubType().name(), var4);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public <_T extends IN> void HMG(FDO var1, FFF var2, _T var3) throws FFK {
        EXF.getInstance().ICO();

        try {
            this.HMN(var1, var2, "receiptrecords", var3, (IK) null, var3.getReceiptRecordType().name(), null, null);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public <_T extends JF> void HMH(FDO var1, FFF var2, _T var3, _T var4) throws FFK {
        EXF.getInstance().ICO();

        try {
            ArrayList var5 = new ArrayList();
            var5.add(new FDU(FLX, var3.FJI().getValue()));
            this.HMN(var1, var2, "settlements", var3, var4, var3.getSettlementType().name(), null, var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public <_T extends HJ, _Q extends JF> void HMI(FDO var1, FFF var2, _T var3, _Q var4) throws FFK {
        EXF.getInstance().ICO();

        try {
            ArrayList var5 = new ArrayList();
            var5.add(new FDU(FLX, var3.FJI().getValue()));
            if (var4 != null) {
                var5.add(new FDU(FLF, var4.getId()));
            }

            var5.add(new FDU(FLX, var3.FJI().getValue()));
            this.HMN(var1, var2, "declarations", var3, (IK) null, var3.getDeclarationType().name(), var3.getDeclarationSubType().name(), var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public <_T extends IC, _Q extends JF> void HMJ(FDO var1, FFF var2, _T var3, _Q var4) throws FFK {
        EXF.getInstance().ICO();

        try {
            ArrayList var5 = new ArrayList();
            var5.add(new FDU(FLX, var3.FJI().getValue()));
            if (var4 != null) {
                var5.add(new FDU(FLF, var4.getId()));
            }

            this.HMN(var1, var2, "invoicerecords", var3, (IK) null, var3.getInvoiceRecordType().name(), null, var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public <_T extends HI> void HMK(FDO var1, FFF var2, HI var3) throws FFK {
        EXF.getInstance().ICO();

        try {
            ArrayList var4 = new ArrayList();
            this.HMM(var1, var2, "contacts", var3, null, var3.getType(), null, var4);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private <_T extends LW> void HML(FDO var1, FFF var2, String var3, String var4, _T var5) throws FFK {
        EXF.getInstance().ICO();

        try {
            if (var5 == null) {
                throw FCZ.getInstance().IHG();
            }

            Integer var6;
            if (var5.getVersion() != null && var5.getVersion().getValue() != null) {
                var6 = var5.getVersion().getValue();
            } else {
                var6 = 0;
            }

            ArrayList var7 = new ArrayList();
            var7.add(new FDU(FLJ, var3));
            var7.add(new FDU(FLP, var5.getClass().getName()));
            ArrayList var8 = new ArrayList();
            switch (var1) {
                case insert:
                    var8.add(new FDU(FLI, var6));
                    break;
                case update:
                case delete:
                    var7.add(new FDU(FLI, var6));
                    break;
                default:
                    throw new FFK("Unsupported action type [" + var1 + "]!");
            }

            this.HMO(this.FIS, var1, var2, var4, var7, var8, this.HKZ(var5));
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private <_T extends IL> void HMM(FDO var1, FFF var2, String var3, HI var4, _T var5, String var6, String var7, List<FDU<?>> var8) throws FFK {
        EXF.getInstance().ICO();

        try {
            if (var4 == null) {
                throw new FFK("Contractor cannot be NULL!");
            }

            ArrayList var9 = new ArrayList();
            ArrayList var10 = new ArrayList();
            var9.add(new FDU(FLD, var4.getId()));
            HI var11 = var4.AICD();
            if (var11.DAI().getValue() == null) {
                throw new FFK("Name of Contractor cannot be NULL!");
            }

            var10.add(new FDU(FME, var11.DAI().getValue()));
            if (var11.DAJ().getValue().length() == 10) {
                var10.add(new FDU(FMF, var11.DAJ().getValue()));
            } else {
                var10.add(new FDU(FMF, null));
            }

            var10.add(new FDU(FLN, var6));
            var10.add(new FDU(FLO, var7));
            var10.add(new FDU(FLP, var4.getClass().getName()));
            if (var5 != null) {
                var10.add(new FDU(FLE, var5.getId()));
            }

            if (var8 != null) {
                var10.addAll(var8);
            }

            var10.add(new FDU(QNS, var4.QON()));
            this.HMO(this.FIT, var1, var2, var3, var9, var10, this.HKZ(var4));
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private <_T extends IK> void HMN(FDO var1, FFF var2, String var3, _T var4, _T var5, String var6, String var7, List<FDU<?>> var8) throws FFK {
        EXF.getInstance().ICO();

        try {
            ArrayList var9 = new ArrayList();
            var9.add(new FDU(FLD, var4.getId()));
            ArrayList var10 = new ArrayList();
            if (var4.getPeriod() != null) {
                JN var11 = var4.getPeriod().DDN();
                if (var11.DDJ().getValue() == null) {
                    throw new FFK("Period year cannot be NULL!");
                } else {
                    var10.add(new FDU(FLV, var11.DDJ().getValue()));
                    if (var11.DDK().getValue() != null) {
                        var10.add(new FDU(FLW, var11.DDK().getValue()));
                        var10.add(new FDU(FLN, var6));
                        var10.add(new FDU(FLO, var7));
                        var10.add(new FDU(FLP, var4.getClass().getName()));
                        if (var5 != null) {
                            var10.add(new FDU(FLE, var5.getId()));
                        }

                        if (var8 != null) {
                            var10.addAll(var8);
                        }

                        this.HMO(this.FIT, var1, var2, var3, var9, var10, this.HKZ(var4));
                    } else {
                        throw new FFK("Period month cannot be NULL!");
                    }
                }
            } else {
                throw new FFK("Period cannot be NULL!");
            }
        } finally {
            EXF.getInstance().ICP();
        }
    }

    private void HMO(Connection var1, FDO var2, FFF var3, String var4, List<FDU<?>> var5, List<FDU<?>> var6, byte[] var7) throws FFK {
        EXF.getInstance().ICO();

        try {
            ArrayList var12 = null;
            switch (var2) {
                case insert:
                case update:
                    byte var8;
                    byte[] var9;
                    byte[] var10;
                    byte[] var11;
                    if (var3 != null) {
                        var8 = 1;
                        var10 = var3.getInitialisationVector();
                        var9 = var3.getSalt();
                        var11 = var3.ILG(var7);
                    } else {
                        var8 = 0;
                        var10 = null;
                        var9 = null;
                        var11 = var7;
                    }

                    var12 = new ArrayList();
                    var12.addAll(var6);
                    var12.add(new FDU(FLQ, Short.valueOf(var8)));
                    var12.add(new FDU(FLK, var9));
                    var12.add(new FDU(FLR, var10));
                    var12.add(new FDU(FLS, var11));
                case delete:
                    switch (var2) {
                        case insert:
                            var12.add(new FDU(FLH, this.FIR));
                            this.HMS(var1, var4, var5, var12);
                            return;
                        case update:
                            this.HMT(var1, var4, var5, var12);
                            return;
                        case delete:
                            this.HMU(var1, var4, var5);
                            return;
                        default:
                            throw new FFK("Unsupported action type [" + var2 + "]!");
                    }
                default:
                    throw new FFK("Unsupported action type [" + var2 + "]!");
            }
        } catch (InvalidAlgorithmParameterException | IOException | InvalidKeyException var16) {
            EXF.getInstance().ICA(var16);
            throw new FFK(var16);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public <_T extends IJE> void HMP(FDO var1, _T var2) throws FFK {
        EXF.getInstance().ICO();

        try {
            if (var2.IYW().getValue() == null || var2.IYX().getValue() == null) {
                throw new FFK("DictionaryName and dictionaryEntryName must be set!");
            }

            String var3 = var2.IYW().getValue().toUpperCase();
            String var4 = var2.IYX().getValue().toUpperCase();
            ArrayList var5 = new ArrayList();
            ArrayList var6 = new ArrayList();
            switch (var1) {
                case insert:
                    var5.add(new FDU(FLH, this.FIR));
                case update:
                    byte[] var7 = this.HKZ(var2);
                    var5.add(new FDU(FMA, var3));
                    var5.add(new FDU(FMB, var4));
                    var5.add(new FDU(FLP, var2.getClass().getName()));
                    var5.add(new FDU(FLS, var7));
                case delete:
                    break;
                default:
                    throw new FFK("Unsupported action type [" + var1 + "]!");
            }

            switch (var1) {
                case insert:
                    break;
                case update:
                case delete:
                    var6.add(new FDU(FMA, var3));
                    var6.add(new FDU(FMB, var4));
                    break;
                default:
                    throw new FFK("Unsupported action type [" + var1 + "]!");
            }

            switch (var1) {
                case insert:
                    this.HMS(this.FIT, "dictionaries", var6, var5);
                    break;
                case update:
                    this.HMT(this.FIT, "dictionaries", var6, var5);
                    break;
                case delete:
                    this.HMU(this.FIT, "dictionaries", var6);
                    break;
                default:
                    throw new FFK("Unsupported action type [" + var1 + "]!");
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public <_T extends IJE> List<_T> HMQ(String var1, String var2) throws FFK {
        EXF.getInstance().ICO();

        ArrayList var23;
        try {
            if (var1 == null || var2 == null || var2.length() <= 0) {
                throw new FFK("DictionaryName and dictionaryQueryString must be set!");
            }

            String var3 = var1.toUpperCase();
            String var4 = var2.toUpperCase();
            FDE var5 = new FDE(FJM, "dictionaries");
            var5.IJH(new FDX(FLP));
            var5.IJH(new FDX(FLS));
            var5.IJA(new FDU(FMA, var3));
            var5.IJA(new FDU(FMB, "%" + var4 + "%", FDK.LIKE));
            String var6 = "dictionaries";
            synchronized ("dictionaries") {
                FDB.IIO(this.FIT, var5);
                ArrayList var7 = new ArrayList();
                Iterator var8 = var5.getResults().iterator();

                while (var8.hasNext()) {
                    Map var9 = (Map) var8.next();
                    Class var10 = null;
                    byte[] var11 = null;
                    Iterator var12 = var9.values().iterator();

                    while (var12.hasNext()) {
                        FDU var13 = (FDU) var12.next();
                        String var14 = var13.getName();
                        if (FLP.getName().equals(var14)) {
                            var10 = Class.forName((String) var13.getValue());
                        } else if (FLS.getName().equals(var14)) {
                            var11 = (byte[]) var13.getValue();
                        }
                    }

                    if (var11 != null) {
                        IJE var24 = (IJE) this.HLA(var11, var10);
                        var7.add(var24);
                    }
                }

                var23 = var7;
            }
        } catch (ClassNotFoundException | SQLException var21) {
            EXF.getInstance().ICA(var21);
            throw new FFK(var21);
        } finally {
            EXF.getInstance().ICP();
        }

        return var23;
    }

    private <_T extends KU> void HMR(Connection var1, String var2, Map<String, FDU<?>> var3) throws FFK {
        EXF.getInstance().ICO();

        try {
            FDF var4 = new FDF(FJM, var2);
            var4.IJN(new ArrayList(var3.values()));
            var4.IJO(var3);
            synchronized (var1) {
                FDB.IIL(var1, var4);
            }
        } catch (SQLException var12) {
            EXF.getInstance().ICA(var12);
            throw new FFK(var12);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private <_T extends KU> void HMS(Connection var1, String var2, List<FDU<?>> var3, List<FDU<?>> var4) throws FFK {
        EXF.getInstance().ICO();

        try {
            ArrayList var5 = new ArrayList();
            var5.addAll(var3);
            var5.addAll(var4);
            FDF var6 = new FDF(FJM, var2);
            var6.IJN(var5);
            var6.IJO(var5);
            synchronized (var1) {
                FDB.IIL(var1, var6);
            }
        } catch (SQLException var14) {
            EXF.getInstance().ICA(var14);
            throw new FFK(var14);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private <_T extends KU> void HMT(Connection var1, String var2, List<FDU<?>> var3, List<FDU<?>> var4) throws FFK {
        EXF.getInstance().ICO();

        try {
            FDG var5 = new FDG(FJM, var2);
            var5.IJQ(var4);
            var5.IJC(var3);
            synchronized (var1) {
                FDB.IIM(var1, var5);
            }
        } catch (SQLException var13) {
            EXF.getInstance().ICA(var13);
            throw new FFK(var13);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private <_T extends KU> void HMU(Connection var1, String var2, List<FDU<?>> var3) throws FFK {
        EXF.getInstance().ICO();

        try {
            FDC var4 = new FDC(FJM, var2);
            var4.IJC(var3);
            synchronized (var1) {
                FDB.IIN(var1, var4);
            }
        } catch (SQLException var12) {
            EXF.getInstance().ICA(var12);
            throw new FFK(var12);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private int QPZ(int var1) {
        return (var1 - 1) / 3 + 1;
    }

    private int QQA(int var1) {
        return (var1 - 1) / 6 + 1;
    }

    public Integer getSequenceValue(JN var1, String var2) throws FFK {
        EXF.getInstance().ICO();

        Integer var26;
        try {
            if (var1 == null || var2 == null || var2.length() <= 0) {
                throw new FFK("Period and sequenceName cannot be empty!");
            }

            JN var3 = var1.DDN();
            Object var4 = null;
            Object var5 = null;
            Object var6 = null;
            if (var3.DDJ().getValue() == null) {
                throw new FFK("Period year cannot be NULL!");
            }

            Integer var21 = var3.DDJ().getValue();
            if (var3.DDK().getValue() == null) {
                throw new FFK("Period month cannot be NULL!");
            }

            Integer var23 = var3.DDK().getValue();
            Integer var22;
            switch (Character.toUpperCase(var2.charAt(0))) {
                case 'H':
                    var22 = 16 + this.QQA(var23);
                    break;
                case 'Q':
                    var22 = 12 + this.QPZ(var23);
                    break;
                case 'Y':
                    var22 = 19;
                    break;
                default:
                    var22 = var23;
            }

            FDE var7 = new FDE(FJM, "sequences");
            var7.IJH(new FDX(FLY));
            var7.IJA(new FDU(FLV, var21));
            var7.IJA(new FDU(FLW, var22));
            var7.IJA(new FDU(FLN, var2));
            synchronized (this.FIT) {
                FDB.IIO(this.FIT, var7);
                Object var9 = null;
                Integer var24;
                if (var7.getResults().size() == 0) {
                    var24 = new Integer(1);
                    FDF var10 = new FDF(FJM, "sequences");
                    var10.IJM(FLV);
                    var10.IJM(FLW);
                    var10.IJM(FLN);
                    var10.IJM(FLY);
                    var10.IJO(new FDU[]{new FDU(FLV, var21), new FDU(FLW, var22), new FDU(FLN, var2), new FDU(FLY, var24)});
                    FDB.IIL(this.FIT, var10);
                } else {
                    if (var7.getResults().size() != 1) {
                        throw new FFK("Sequence duplicate! [" + var1 + "] [sequenceName " + var2 + "]");
                    }

                    var26 = null;

                    Collection<FDU> values = ((Map) var7.getResults().get(0)).values();
                    for (FDU var12 : values) {
                        if (FLY.getName().equals(var12.getName())) {
                            var26 = (Integer) var12.getValue();
                        }
                    }

                    var24 = var26 + 1;
                    FDG var27 = new FDG(FJM, "sequences");
                    var27.IJQ(new FDU[]{new FDU(FLY, var24)});
                    var27.IJC(new FDP[]{new FDU(FLV, var21), new FDU(FLW, var22), new FDU(FLN, var2)});
                    FDB.IIM(this.FIT, var27);
                }

                var26 = var24;
            }
        } catch (SQLException var19) {
            EXF.getInstance().ICA(var19);
            throw new FFK(var19);
        } finally {
            EXF.getInstance().ICP();
        }

        return var26;
    }

    public Map<String, Map<JN, Integer>> getSequences() throws FFK {
        EXF.getInstance().ICO();

        try {
            FDE var1 = new FDE(FJM, "sequences");
            var1.IJH(new FDX(FLY));
            var1.IJH(new FDX(FLV));
            var1.IJH(new FDX(FLW));
            var1.IJH(new FDX(FLN));
            HashMap var2 = new HashMap();
            synchronized (this.FIT) {
                FDB.IIO(this.FIT, var1);
                Iterator var4 = var1.getResults().iterator();

                while (var4.hasNext()) {
                    Map var5 = (Map) var4.next();
                    Integer var6 = null;
                    Integer var7 = null;
                    Integer var8 = null;
                    String var9 = null;
                    Iterator var10 = var5.values().iterator();

                    while (var10.hasNext()) {
                        FDU var11 = (FDU) var10.next();
                        if (FLY.getName().equals(var11.getName())) {
                            var6 = (Integer) var11.getValue();
                        } else if (FLV.getName().equals(var11.getName())) {
                            var7 = (Integer) var11.getValue();
                        } else if (FLW.getName().equals(var11.getName())) {
                            var8 = (Integer) var11.getValue();
                        } else if (FLN.getName().equals(var11.getName())) {
                            var9 = (String) var11.getValue();
                        }
                    }

                    if (!var2.containsKey(var9)) {
                        var2.put(var9, new HashMap());
                    }

                    Map var20 = (Map) var2.get(var9);
                    var20.put(new JN(var7, var8), var6);
                }

                HashMap var21 = var2;
                return var21;
            }
        } catch (SQLException var18) {
            EXF.getInstance().ICA(var18);
            throw new FFK(var18);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public void ROF(JN var1, String var2, Integer var3, Integer var4) throws FFK {
        EXF.getInstance().ICO();

        try {
            if (var1 == null || var2 == null || var2.length() <= 0 || var3 == null || var4 == null) {
                throw new FFK("Period, sequenceName and numericValue cannot be empty!");
            }

            FDG var5 = new FDG(FJM, "sequences");
            var5.IJQ(new FDU[]{new FDU(FLY, var4)});
            var5.IJC(new FDP[]{new FDU(FLV, var1.DDJ().getValue()), new FDU(FLW, var1.DDK().getValue()), new FDU(FLN, var2), new FDU(FLY, var3)});
            FDB.IIM(this.FIT, var5);
        } catch (SQLException var9) {
            EXF.getInstance().ICA(var9);
            throw new FFK(var9);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public Integer getMaxDocumentIndex_Settlements(JN var1, JH var2) throws FFK {
        EXF.getInstance().ICO();

        Integer var3;
        try {
            var3 = this.getMaxDocumentIndex(var1, var2, null, "settlements");
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public Integer getMaxDocumentIndex_InvoiceRecords(JN var1, IH var2) throws FFK {
        EXF.getInstance().ICO();

        Integer var3;
        try {
            var3 = this.getMaxDocumentIndex(var1, var2, null, "invoicerecords");
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public Integer getMaxDocumentIndex_Declarations(JN var1, HM var2, AGWW var3) throws FFK {
        EXF.getInstance().ICO();

        Integer var4;
        try {
            var4 = this.getMaxDocumentIndex(var1, var2, var3, "declarations");
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }

    private Integer getMaxDocumentIndex(JN var1, Enum<?> var2, Enum<?> var3, String var4) throws FFK {
        EXF.getInstance().ICO();

        try {
            FDE var8;
            label140:
            {
                if (var1 != null) {
                    JN var5 = var1.DDN();
                    Integer var6 = null;
                    Integer var7 = null;
                    if (var5.DDJ().getValue() == null) {
                        throw new FFK("Period year cannot be NULL!");
                    }

                    var6 = var5.DDJ().getValue();
                    if (var5.DDK().getValue() != null) {
                        var7 = var5.DDK().getValue();
                        var8 = new FDE(FJM, var4);
                        var8.IJH(new FDX(FLX, "documentIndex", FEI.COALESCE_0_MAX_PLUS_1));
                        var8.IJA(new FDU(FLV, var6));
                        var8.IJA(new FDU(FLW, var7));
                        String var9 = var2 != null ? var2.name() : null;
                        if (var9 != null) {
                            var8.IJA(new FDU(FLN, var9));
                        }
                        break label140;
                    }

                    throw new FFK("Period month cannot be NULL!");
                }

                throw new FFK("Period year cannot be NULL!");
            }

            String var10 = var3 != null ? var3.name() : null;
            if (var10 != null) {
                var8.IJA(new FDU(FLO, var10));
            }

            synchronized (var4) {
                FDB.IIO(this.FIT, var8);
                Object var12 = null;
                if (var8.getResults().size() != 1) {
                    throw new FFK("DocumentIndex duplicate! [" + var1 + "] [type " + var2 + "] [subType " + var3 + "] [tableName " + var4 + "]");
                } else {
                    Integer var13 = null;
                    Iterator var14 = ((Map) var8.getResults().get(0)).values().iterator();

                    while (true) {
                        if (var14.hasNext()) {
                            FDU var15 = (FDU) var14.next();
                            if (!"documentIndex".equals(var15.getName())) {
                                continue;
                            }

                            var13 = (Integer) var15.getValue();
                        }

                        Integer var24 = var13;
                        return var24;
                    }
                }
            }
        } catch (SQLException var22) {
            EXF.getInstance().ICA(var22);
            throw new FFK(var22);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    protected void finalize() throws Throwable {
        EXF.getInstance().ICO();

        try {
            this.HMV();
            super.finalize();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected void HMV() throws Throwable {
        EXF.getInstance().ICO();

        try {
            if (this.FIS != null && !this.FIS.isClosed()) {
                this.FIS.rollback();
                this.FIS.close();
            }

            if (this.FIT != null && !this.FIT.isClosed()) {
                this.FIT.rollback();
                this.FIT.close();
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void QQB(String var1, boolean var2) {
        try {
            String var3 = this.HMX(var1);
            if (var3 != null) {
                File var4 = new File(var3);
                if (var2) {
                    var4.delete();
                } else {
                    String var5 = (new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss")).format(new Date());
                    var4.renameTo(new File(var3.replace(var1, var1 + "_" + var5)));
                }
            }
        } catch (Exception var6) {
            EXF.getInstance().ICA(var6);
        }

    }

    public String HMX(String var1) {
        File var2 = new File(EVW.GPW);
        String var3 = var1 + "_OLD";
        File var4 = new File(var2.getAbsolutePath() + "/" + var3 + ".db");
        return var4.exists() ? var4.getAbsolutePath() : null;
    }

    public boolean QQC(File var1, FFF var2, String var3) throws ClassNotFoundException, SQLException, InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, InvalidKeySpecException, FFK, IOException {
        Connection var4 = null;

        boolean var16;
        try {
            ArrayList var5 = new ArrayList();
            String var6 = "preferences";
            FDE var7 = new FDE(FJM, var6);
            var4 = this.QQD(var1, "profiles");
            var4.setAutoCommit(false);
            FDB.IIO(var4, var7);
            boolean var8 = false;
            Iterator var9 = var7.getResults().iterator();

            while (var9.hasNext()) {
                Map var10 = (Map) var9.next();
                if (var10.containsKey(FLJ.getName()) && ((FDU) var10.get(FLJ.getName())).getValue().equals(var3)) {
                    var8 = true;
                    break;
                }
            }

            if (!var8) {
                boolean var15 = false;
                return var15;
            }

            var5.add(new FDU(FLJ, var3));
            this.HMU(this.FIS, "users", var5);
            this.HMU(this.FIS, var6, var5);
            Connection var14 = this.FIS;
            this.FIS = var4;
            this.QPR(var2, null, var3, var6, var7, var14, true);
            this.FIS = var14;
            var16 = true;
        } finally {
            if (var4 != null) {
                var4.close();
            }

        }

        return var16;
    }

    public Connection QQD(File var1, String var2) throws ClassNotFoundException, SQLException {
        Connection var3 = FDB.IIG(var1, var2 + ".db");
        var3.setAutoCommit(false);
        return var3;
    }
}
