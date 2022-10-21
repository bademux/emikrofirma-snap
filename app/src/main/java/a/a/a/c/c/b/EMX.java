package a.a.a.c.c.b;

import a.a.a.b.DateFormat;
import a.a.a.b.a.DbUtils;
import a.a.a.b.a.a.*;
import a.a.a.b.a.a.a.*;
import a.a.a.b.a.a.b.Expression;
import a.a.a.b.a.a.c.ViewDef;
import a.a.a.b.a.a.d.*;
import a.a.a.b.a.a.e.ConstraintUNIQUEDef;
import a.a.a.b.a.a.e.ConstraintFOREIGNDef;
import a.a.a.b.a.a.e.ConstraintPRIMARYDef;
import a.a.a.b.d.FEO;
import a.a.a.b.d.FEP;
import a.a.a.b.e.FFF;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.b.ParametrizedModel;
import a.a.a.c.f.a.n.BaseInvoiceSell;
import a.a.a.c.f.b.c.a.TaxRate;
import com.github.bademux.emk.Application;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.e.a.d.ValueContainer3;
import a.a.a.c.e.a.d.ValueContainer1;
import a.a.a.c.f.ModelBase;
import a.a.a.c.f.ModelBaseElementWithId;
import a.a.a.c.f.a.ModelBusinessPeriodAndDocIndexElement;
import a.a.a.c.f.a.ModelBusinessPeriodElement;
import a.a.a.c.f.a.ModelBusinessTopElement;
import a.a.a.c.f.a.a.Dictionary;
import a.a.a.c.f.a.a.DictionaryEntry;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.e.a.InvoiceRecord;
import a.a.a.c.f.a.e.a.InvoiceRecordPurchase;
import a.a.a.c.f.a.e.a.InvoiceRecordSell;
import a.a.a.c.f.a.e.a.InvoiceRecordType;
import a.a.a.c.f.a.f.a.ReceiptRecord;
import a.a.a.c.f.a.f.a.RecordType;
import a.a.a.c.f.a.f.a.ReceiptRecordVat;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.SettlementType;
import a.a.a.c.f.a.h.SettlementVat;
import a.a.a.c.f.a.n.*;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.*;
import a.a.a.c.f.b.c.a.*;
import a.a.a.c.f.c.BaseUserData;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.b.SimpleUserData;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.c.FCZ;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import javafx.fxml.FXML;
import lombok.extern.slf4j.Slf4j;

import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Callable;

import static java.util.Objects.requireNonNullElseGet;

@Slf4j
public class EMX implements EntityName {
    private static final int FIG = 100;
    public static final String POSTFIX_OLD = "_OLD";
    public static final String POSTFIX_NEW = "_NEW";
    private static final String FIJ = "##copycount##";
    private static final String FIK = "##tablename##";
    private static final String FIL = "Copied ##copycount## records from: ##tablename##";
    private static final String FIM = "Updated data in table: preferences";
    private static final String FIN = "New db path: ";
    private static final String FIO = "New db exists";
    private static final String FIP = "Initiating connection to new db";
    private static final String FIQ = "Starting coping records to new db";
    private final Integer FIR = 1;
    private Connection profilesConnection;
    private Connection connection;
    private final FEO FIU;
    private final FEP FIV;
    private boolean isProfileDatabaseInitiated = false;
    private Map<String, TableDef> QIN;
    @FXML
    protected ResourceBundle resources;

    public EMX() throws FFK {

        try {
            this.initProfilesConnection();
            Class[] jaxbClasses = new Class[]{ConfigurationProperties.class, UserData.class, InvoiceSell.class, InvoiceSellCorrection.class, InvoicePurchase.class, AggregatePurchase.class, InvoiceOtherSell.class, InvoiceOtherPurchase.class, InvoiceRecordSell.class, InvoiceRecordPurchase.class, ReceiptRecordVat.class, SettlementVat.class, DeclarationJPK_EWP.class, DeclarationJPK_FA.class, DeclarationJPK_KR.class, DeclarationJPK_MAG.class, DeclarationJPK_PKPIR.class, DeclarationJPK_VAT.class, DeclarationJPK_WB.class, DeclarationJPK_StatusTracker.class, Dictionary.class, DictionaryEntry.class, PeriodType.class, Voivodeship.class, TaxRate.class, TaxReason.class, PaymentMethod.class, TaxOffice.class, CalculationMethodType.class};
            this.FIU = new FEO(false, true, StandardCharsets.UTF_8, jaxbClasses);
            this.FIV = new FEP(jaxbClasses);
            this.FIV.setListener(new Unmarshaller.Listener() {
                public void afterUnmarshal(Object target, Object parent) {
                    if (InvoiceElement.class.isAssignableFrom(target.getClass())) {
                        ((InvoiceElement) target).DBI().setAllowNegative(true);
                    }
                }
            });
        } catch (JAXBException e) {
            log.error("Something bad happened", e);
            throw new FFK(e);
        }

    }

    private void initProfilesConnection() throws FFK {
        try {
            this.profilesConnection = DbUtils.getConnection(Application.getHomeDir().toFile(), "profiles.db");
            this.profilesConnection.setAutoCommit(false);
            this.initProfilesTable(this.profilesConnection);
        } catch (ClassNotFoundException | SQLException var5) {
            log.error("Something bad happened", var5);
            throw new FFK(var5);
        }
    }

    private void initProfilesTable(Connection connection) throws SQLException {
        TableDef var2 = new TableDef(false, null, EntityName.USERS, false);
        var2.getColumns().add(new CellDef(CellType.cell_technical_username.getDefinition(), false, true));
        var2.getColumns().add(new CellDef(CellType.cell_technical_type.getDefinition(), true, false));
        var2.getColumns().add(new CellDef(CellType.cell_technical_salt.getDefinition(), true, false));
        var2.getColumns().add(new CellDef(CellType.cell_technical_password.getDefinition(), true, false));
        var2.getColumns().add(new CellDef(CellType.cell_technical_password_change.getDefinition(), true, false));
        DbUtils.IIH(connection, var2);
        DbUtils.IIJ(connection, var2);
        var2 = new TableDef(false, null, EntityName.PREFERENCES, false);
        var2.getColumns().add(new CellDef(CellType.cell_technical_username.getDefinition(), false, false));
        var2.getColumns().add(new CellDef(CellType.cell_technical_typeclass.getDefinition(), false, false));
        var2.getColumns().add(new CellDef(CellType.cell_technical_version.getDefinition(), false, false));
        var2.getColumns().add(new CellDef(CellType.cell_business_version.getDefinition(), false, false));
        var2.getColumns().add(new CellDef(CellType.cell_technical_encrypted.getDefinition(), false, false));
        var2.getColumns().add(new CellDef(CellType.cell_technical_salt.getDefinition(), true, false));
        var2.getColumns().add(new CellDef(CellType.cell_technical_iv.getDefinition(), true, false));
        var2.getColumns().add(new CellDef(CellType.cell_technical_body.getDefinition(), false, false));
        var2.getConstraints().add(new ConstraintUNIQUEDef(CellType.cell_technical_username.<CellTyped>getDefinition(), CellType.cell_technical_typeclass.<CellTyped>getDefinition(), CellType.cell_business_version.<CellTyped>getDefinition()));
        DbUtils.IIH(connection, var2);
        ViewDef var3 = new ViewDef(false, null, EntityName.PREFERENCES_LATEST_VERSION, false, SqlStatements.PREFERENCES_LATEST_VERSION_SQL);
        DbUtils.IIK(connection, var3);
        connection.commit();
    }

    private int HKP(FFF var1, FFF var2, Connection var3, String var4, TableValuesSelect var5, int var6) throws SQLException, FFK, InvalidKeyException, InvalidAlgorithmParameterException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        DbUtils.IIO(this.connection, 100, var6, var5);
        int var7 = 0;

        for (Iterator var8 = var5.getResults().iterator(); var8.hasNext(); ++var7) {
            Map var9 = (Map) var8.next();
            Integer var10 = 0;
            byte[] var13 = null;
            if (var9.containsKey(CellType.cell_technical_body.<CellTyped>getDefinition().getName())) {
                var13 = (byte[]) ((CellValue) var9.get(CellType.cell_technical_body.<CellTyped>getDefinition().getName())).getValue();
            }

            if (var9.containsKey(CellType.cell_technical_encrypted.<CellTyped>getDefinition().getName())) {
                byte[] var14 = (byte[]) ((CellValue) var9.get(CellType.cell_technical_salt.<CellTyped>getDefinition().getName())).getValue();
                byte[] var15 = (byte[]) ((CellValue) var9.get(CellType.cell_technical_iv.<CellTyped>getDefinition().getName())).getValue();
                var10 = (Integer) ((CellValue) var9.get(CellType.cell_technical_encrypted.<CellTyped>getDefinition().getName())).getValue();
                if (var10 > 0 && var13 != null) {
                    var13 = var1.ILI(var15, var14, var13);
                }

                if (var2 != null) {
                    ((CellValue) var9.get(CellType.cell_technical_salt.<CellTyped>getDefinition().getName())).setValue(var2.getSalt());
                    ((CellValue) var9.get(CellType.cell_technical_iv.<CellTyped>getDefinition().getName())).setValue(var2.getInitialisationVector());
                    var13 = var2.ILG(var13);
                    var10 = 1;
                } else {
                    ((CellValue) var9.get(CellType.cell_technical_salt.<CellTyped>getDefinition().getName())).setValue(null);
                    ((CellValue) var9.get(CellType.cell_technical_iv.<CellTyped>getDefinition().getName())).setValue(null);
                    var10 = 0;
                }

                ((CellValue) var9.get(CellType.cell_technical_encrypted.<CellTyped>getDefinition().getName())).setValue(var10);
            }

            if (var13 != null) {
                ((CellValue) var9.get(CellType.cell_technical_body.<CellTyped>getDefinition().getName())).setValue(var13);
            }

            this.HMR(var3, var4, var9);
        }

        if (var7 > 0) {
            var5.getResults().clear();
            this.HLB(var3);
        }

        return var7;
    }

    private void QPP(FFF var1, FFF var2, String var3, TableValuesSelect var4, String var5, Connection var6) throws SQLException, FFK, InvalidKeyException, InvalidAlgorithmParameterException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        DbUtils.IIO(this.profilesConnection, var4);
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
                    var13 = null;
                    var14 = new ArrayList();
                } while (var9.containsKey(CellType.cell_technical_username.<CellTyped>getDefinition().getName()) && !((CellValue) var9.get(CellType.cell_technical_username.<CellTyped>getDefinition().getName())).getValue().equals(var5));

                if (var9.containsKey(CellType.cell_technical_body.<CellTyped>getDefinition().getName())) {
                    var13 = (byte[]) ((CellValue) var9.get(CellType.cell_technical_body.<CellTyped>getDefinition().getName())).getValue();
                }

                if (!var9.containsKey(CellType.cell_technical_encrypted.<CellTyped>getDefinition().getName())) {
                    break;
                }

                byte[] var15 = (byte[]) ((CellValue) var9.get(CellType.cell_technical_salt.<CellTyped>getDefinition().getName())).getValue();
                byte[] var16 = (byte[]) ((CellValue) var9.get(CellType.cell_technical_iv.<CellTyped>getDefinition().getName())).getValue();
                var10 = (Integer) ((CellValue) var9.get(CellType.cell_technical_encrypted.<CellTyped>getDefinition().getName())).getValue();
                if (var10 > 0 && var13 != null) {
                    var13 = var1.ILI(var16, var15, var13);
                    if (var2 != null) {
                        ((CellValue) var9.get(CellType.cell_technical_salt.<CellTyped>getDefinition().getName())).setValue(var2.getSalt());
                        ((CellValue) var9.get(CellType.cell_technical_iv.<CellTyped>getDefinition().getName())).setValue(var2.getInitialisationVector());
                        var13 = var2.ILG(var13);
                    } else {
                        ((CellValue) var9.get(CellType.cell_technical_encrypted.<CellTyped>getDefinition().getName())).setValue(0);
                        ((CellValue) var9.get(CellType.cell_technical_salt.<CellTyped>getDefinition().getName())).setValue(null);
                        ((CellValue) var9.get(CellType.cell_technical_iv.<CellTyped>getDefinition().getName())).setValue(null);
                    }

                    ((CellValue) var9.get(CellType.cell_technical_body.<CellTyped>getDefinition().getName())).setValue(var13);
                    break;
                }

                if (var6 != null) {
                    ((CellValue) var9.get(CellType.cell_technical_encrypted.<CellTyped>getDefinition().getName())).setValue(0);
                    ((CellValue) var9.get(CellType.cell_technical_salt.<CellTyped>getDefinition().getName())).setValue(null);
                    ((CellValue) var9.get(CellType.cell_technical_iv.<CellTyped>getDefinition().getName())).setValue(null);
                    break;
                }
            }

            var14.add(new CellValue(CellType.cell_technical_username.getDefinition(), var5));
            if (var9.containsKey(CellType.cell_technical_typeclass.<CellTyped>getDefinition().getName())) {
                var14.add(new CellValue(CellType.cell_technical_typeclass.getDefinition(), ((CellValue) var9.get(CellType.cell_technical_typeclass.<CellTyped>getDefinition().getName())).getValue()));
            }

            if (var9.containsKey(CellType.cell_business_version.<CellTyped>getDefinition().getName())) {
                var14.add(new CellValue(CellType.cell_business_version.getDefinition(), ((CellValue) var9.get(CellType.cell_business_version.<CellTyped>getDefinition().getName())).getValue()));
            }

            if (var6 != null) {
                this.HMS(var6, var3, var14, new ArrayList(var9.values()));
            } else {
                this.HMT(this.profilesConnection, var3, var14, new ArrayList(var9.values()));
            }

            ++var7;
        }
    }

    public Connection QPQ(FFF var1, FFF var2, String var3, String var4, File var5) {
        File var6 = null;
        boolean var7 = false;

        try {
            this.isProfileDatabaseInitiated = false;
            if (var5 == null) {
                var6 = Application.getHomeDir().resolve(var4 + DbUtils.DB_FILE_EXT).toFile();
            } else {
                var7 = true;
                var6 = Application.getHomeDir().resolve( var4 + DbUtils.DB_FILE_EXT).toFile();
            }

            log.info("New db path: " + var6.getAbsolutePath());
            if (var6.exists()) {
                log.info("New db exists");
                var6.delete();
            }

            synchronized (EMX.class) {
                log.info("Initiating connection to new db");
                Connection var9 = this.getConnection(var1, var4, var5);
                log.info("Starting coping records to new db");
                String var10 = EntityName.INVOICES;
                TableValuesSelect var11 = new TableValuesSelect(null, var10);
                Integer var12 = 0;
                Integer var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                log.info("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", EntityName.INVOICES));
                var10 = EntityName.RECEIPTRECORDS;
                var11 = new TableValuesSelect(null, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                log.info("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", EntityName.RECEIPTRECORDS));
                var10 = EntityName.SETTLEMENTS;
                var11 = new TableValuesSelect(null, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                log.info("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", EntityName.SETTLEMENTS));
                var10 = EntityName.INVOICERECORDS;
                var11 = new TableValuesSelect(null, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                log.info("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", EntityName.INVOICERECORDS));
                var10 = EntityName.DECLARATIONS;
                var11 = new TableValuesSelect(null, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                log.info("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", EntityName.DECLARATIONS));
                var10 = EntityName.CONTACTS;
                var11 = new TableValuesSelect(null, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                log.info("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", EntityName.CONTACTS));
                var10 = EntityName.SEQUENCES;
                var11 = new TableValuesSelect(null, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                log.info("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", EntityName.SEQUENCES));
                var10 = EntityName.DICTIONARIES;
                var11 = new TableValuesSelect(null, var10);
                var12 = 0;
                var13 = 0;

                do {
                    var12 = this.HKP(var1, var2, var9, var10, var11, var13);
                    var13 = var13 + var12;
                } while (var12 > 0);

                log.info("Copied ##copycount## records from: ##tablename##".replaceFirst("##copycount##", var13.toString()).replace("##tablename##", EntityName.DICTIONARIES));
                var10 = EntityName.PREFERENCES;
                var11 = new TableValuesSelect(null, var10);
                if (var7) {
                    Connection var14 = DbUtils.getConnection(var6.getParentFile(), "profiles.db");
                    var14.setAutoCommit(false);
                    this.initProfilesTable(var14);
                    this.QPR(var1, var2, var3, var10, var11, var14, false);
                    this.HLB(var14);
                    var14.close();
                } else {
                    this.QPP(var1, var2, var10, var11, var3, null);
                }

                log.info("Updated data in table: preferences");
                return var9;
            }
        } catch (Exception var17) {
            log.error("Something bad happened", var17);
            if (var6 != null && var6.isFile() && var6.exists()) {
                var6.delete();
            }

            return null;
        }
    }

    private void QPR(FFF var1, FFF var2, String var3, String var4, TableValuesSelect var5, Connection var6, boolean var7) throws ClassNotFoundException, SQLException, FFK, InvalidKeyException, InvalidAlgorithmParameterException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        var5 = new TableValuesSelect(null, var4);
        this.QPP(var1, var2, var4, var5, var3, var6);
        var4 = EntityName.USERS;
        var5 = new TableValuesSelect(null, var4);
        this.QPP(var1, var2, var4, var5, var3, var6);
        Connection var8 = null;
        if (var7) {
            var8 = this.profilesConnection;
            this.profilesConnection = var6;
            SimpleUserData var9 = EMB.getInstance().getCurrentUser();
            this.HLJ(new SimpleUserData(var9.getUsername(), var9.getLoginType(), new PrivtePerson(false), null, null, true));
            this.profilesConnection = var8;
        }

    }

    public String HKS(Connection var1, String var2, String var3) {
        try {
            this.isProfileDatabaseInitiated = true;
            File var4 =Application.getHomeDir().toFile();
            String var5 = var4.getAbsolutePath() + "/" + var2 + DbUtils.DB_FILE_EXT;
            String var6 = var4.getAbsolutePath() + "/" + var3 + DbUtils.DB_FILE_EXT;
            this.connection.close();
            var1.close();
            File var7 = new File(var5);
            String var8 = var2 + POSTFIX_OLD;
            if (!var7.renameTo(new File(var5.replace(var2, var8)))) {
                return null;
            } else {
                File var9 = new File(var6);
                if (!var9.renameTo(new File(var5))) {
                    return null;
                } else {
                    this.isProfileDatabaseInitiated = false;
                    return var5.replace(var2, var8);
                }
            }
        } catch (SQLException var10) {
            log.error("Something bad happened", var10);
            return null;
        }
    }

    public boolean HKT(Connection var1, String var2, String var3) {
        try {
            boolean var4 = var1.isClosed();
            boolean var5 = this.connection.isClosed();
            if (!var4) {
                if (var5) {
                    this.isProfileDatabaseInitiated = false;
                    this.initConnection(var2);
                }

                return this.HKV(var3);
            } else {
                return this.HKU(var2, var3, true);
            }
        } catch (Exception var6) {
            log.error("Something bad happened", var6);
            return false;
        }
    }

    public boolean HKU(String var1, String var2, boolean var3) throws FFK {
        File var4 = Application.getHomeDir().toFile();
        String var5 = var4.getAbsolutePath() + "/" + var2 + DbUtils.DB_FILE_EXT;
        String var6 = var4.getAbsolutePath() + "/" + var1 + DbUtils.DB_FILE_EXT;
        String var7 = var1 + POSTFIX_OLD;
        String var8 = var4.getAbsolutePath() + "/" + var7 + DbUtils.DB_FILE_EXT;
        File var9 = new File(var5);
        File var10 = new File(var6);
        File var11 = new File(var8);
        this.isProfileDatabaseInitiated = false;
        if (var9.exists()) {
            if (!var10.exists() && !var11.renameTo(new File(var6))) {
                return false;
            } else {
                if (var3) {
                    this.initConnection(var1);
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
                    this.initConnection(var1);
                }

                return this.HKV(var2);
            }
        }
    }

    public boolean HKV(String var1) {
        try {
            File var2 = Application.getHomeDir().toFile();
            String var3 = var2.getAbsolutePath() + "/" + var1 + DbUtils.DB_FILE_EXT;
            File var4 = new File(var3);
            if (var4.exists()) {
                return var4.delete();
            }
        } catch (Exception var5) {
            log.error("Something bad happened", var5);
        }

        return false;
    }

    public void initConnection(String dbName) throws FFK {
        this.connection = this.getConnection(null, dbName, null);
    }

    public void initConnection(FFF var1, String dbName) throws FFK {
        this.connection = this.getConnection(var1, dbName, null);
    }

    public Connection getConnection(final FFF var1, String dbName, File homeDir) throws FFK {

        try {
            if (this.isProfileDatabaseInitiated) {
                throw new FFI("Profile database already initiated!");
            }

            if (dbName == null || dbName.length() <= 0) {
                throw new FFI("Profile name is empty!");
            }
            final Connection connection = DbUtils.getConnection(requireNonNullElseGet(homeDir, Application.getHomeDir()::toFile), dbName + DbUtils.DB_FILE_EXT);
            connection.setAutoCommit(false);
            this.QIN = new HashMap();
            var invoicesTableDef = new TableDef(false, null, "ref", EntityName.INVOICES, false);
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_id.getDefinition(), false, true, OrderType.ASC));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_parentid.getDefinition(), true, true));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_version.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_audit_ts_created.getDefinition(), false, false, "current_timestamp"));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodYear.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodMonth.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_type.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_subType.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_typeclass.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_state.getDefinition(), false, false, InvoiceState.ACTIVE.getKey()));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_issuer_number.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_refid.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_encrypted.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_salt.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_iv.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_body.getDefinition(), false, false));
            CellDef var6 = new CellDef(CellType.cell_business_creationDate.getDefinition(), false, false);
            invoicesTableDef.getColumns().add(var6);
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_contractorName.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_contractorNIP.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_netValue.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_grossValue.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_taxValue.getDefinition(), false, false));
            invoicesTableDef.getConstraints().add(new ConstraintPRIMARYDef(CellType.cell_technical_id.<CellTyped>getDefinition()));
            invoicesTableDef.getConstraints().add(new ConstraintUNIQUEDef(CellType.cell_business_periodYear.<CellTyped>getDefinition(), CellType.cell_business_periodMonth.<CellTyped>getDefinition(), CellType.cell_technical_type.<CellTyped>getDefinition(), CellType.cell_business_issuer_number.<CellTyped>getDefinition(), CellType.cell_business_refid.<CellTyped>getDefinition()));
            DbUtils.IIH(connection, invoicesTableDef);
            DbUtils.createTable(connection, invoicesTableDef);
            ViewDef var7 = new ViewDef(false, null, EntityName.INVOICES_TREE_BASE, false, SqlStatements.TREE_BASE_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.INVOICES));
            DbUtils.IIK(connection, var7);
            ViewDef var8 = new ViewDef(false, null, EntityName.INVOICES_TREE_FULL, false, SqlStatements.TREE_FULL_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.INVOICES).replaceAll(SqlStatements.VIEW_NAME_PLACEHOLDER, EntityName.INVOICES_TREE_BASE));
            DbUtils.IIK(connection, var8);
            invoicesTableDef.getColumns().remove(var6);
            invoicesTableDef.getColumns().add(new InitScriptCell(CellType.cell_business_invoicingDate.getDefinition(), true, false, "select i.business_creationDate from invoices i where i.technical_id = ref.technical_id"));
            HashSet var9 = new HashSet();
            var9.add(CellType.cell_technical_typeclass.<CellTyped>getDefinition());
            var9.add(CellType.cell_technical_encrypted.<CellTyped>getDefinition());
            var9.add(CellType.cell_technical_salt.<CellTyped>getDefinition());
            var9.add(CellType.cell_technical_iv.<CellTyped>getDefinition());
            var9.add(CellType.cell_technical_body.<CellTyped>getDefinition());
            invoicesTableDef.getColumns().add(new MigrationCell(CellType.cell_business_creationDate.getDefinition(), true, false, var9, new MigrationCell.MigrationAction<Date>() {
                private final FFF RQC = var1;

                public Date action(Set<CellValue<?>> contextColumns) {
                    try {
                        Invoice var2 = QPU(this.RQC, contextColumns);
                        if (var2 == null) {
                            return null;
                        }
                        return var2.DAT().getValueDate();
                    } catch (Exception e) {
                        log.error("Something bad happened", e);
                        return null;
                    }
                }
            }, null));
            invoicesTableDef.getColumns().add(new MigrationCell(CellType.cell_business_transactionDate.getDefinition(), true, false, var9, new MigrationCell.MigrationAction<Date>() {
                private final FFF RQC = var1;

                public Date action(Set<CellValue<?>> contextColumns) {
                    try {
                        Invoice var2 = QPU(this.RQC, contextColumns);
                        if (var2 == null) {
                            return null;
                        }
                        return var2.DAU().getValueDate();
                    } catch (Exception e) {
                        log.error("Something bad happened", e);
                        return null;
                    }
                }
            }, new Runnable() {
                public void run() {
                    try(var pstmt = connection.prepareStatement("update invoices set business_transactionDate = (select c.business_transactionDate from invoicesTreeBase b inner join invoices c on c.technical_id = b.viewQueryId and c.technical_subType = 'INVOICE' where b.viewRefId = invoices.technical_id)");) {
                        log.debug("result {}", pstmt.executeUpdate());
                    } catch (Exception e) {
                        log.error("Something bad happened", e);
                    }
                }
            }));
            DbUtils.IIJ(connection, invoicesTableDef);
            DbUtils.QIQ(connection, invoicesTableDef);
            this.QIN.put(EntityName.INVOICES, invoicesTableDef);
            this.QIN.put(EntityName.INVOICES_TREE_FULL, invoicesTableDef);
            invoicesTableDef = new TableDef(false, null, "ref", EntityName.INVOICESOTHER, false);
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_id.getDefinition(), false, true, OrderType.ASC));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_parentid.getDefinition(), true, true));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_version.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_audit_ts_created.getDefinition(), false, false, "current_timestamp"));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodYear.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodMonth.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_type.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_subType.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_typeclass.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_state.getDefinition(), false, false, InvoiceState.ACTIVE.getKey()));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_issuer_number.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_refid.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_encrypted.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_salt.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_iv.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_body.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_creationDate.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_invoicingDate.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_contractorName.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_contractorNIP.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_netValue.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_grossValue.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_taxValue.getDefinition(), false, false));
            invoicesTableDef.getConstraints().add(new ConstraintPRIMARYDef(CellType.cell_technical_id.<CellTyped>getDefinition()));
            DbUtils.IIH(connection, invoicesTableDef);
            DbUtils.createTable(connection, invoicesTableDef);
            ViewDef var18 = new ViewDef(false, null, EntityName.INVOICESOTHER_TREE_BASE, false, SqlStatements.TREE_BASE_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.INVOICESOTHER));
            DbUtils.IIK(connection, var18);
            var7 = new ViewDef(false, null, EntityName.INVOICESOTHER_TREE_FULL, false, SqlStatements.TREE_FULL_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.INVOICESOTHER).replaceAll(SqlStatements.VIEW_NAME_PLACEHOLDER, EntityName.INVOICESOTHER_TREE_BASE));
            DbUtils.IIK(connection, var7);
            this.QIN.put(EntityName.INVOICESOTHER, invoicesTableDef);
            this.QIN.put(EntityName.INVOICESOTHER_TREE_FULL, invoicesTableDef);
            invoicesTableDef = new TableDef(false, null, "ref", EntityName.RECEIPTRECORDS, false);
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_id.getDefinition(), false, true, OrderType.ASC));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_parentid.getDefinition(), true, true));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_version.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_audit_ts_created.getDefinition(), false, false, "current_timestamp"));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodYear.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodMonth.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_type.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_subType.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_typeclass.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_encrypted.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_salt.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_iv.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_body.getDefinition(), false, false));
            invoicesTableDef.getConstraints().add(new ConstraintPRIMARYDef(CellType.cell_technical_id.<CellTyped>getDefinition()));
            invoicesTableDef.getConstraints().add(new ConstraintUNIQUEDef(CellType.cell_business_periodYear.<CellTyped>getDefinition(), CellType.cell_business_periodMonth.<CellTyped>getDefinition(), CellType.cell_technical_typeclass.<CellTyped>getDefinition()));
            DbUtils.IIH(connection, invoicesTableDef);
            DbUtils.createTable(connection, invoicesTableDef);
            var18 = new ViewDef(false, null, EntityName.RECEIPTRECORDS_TREE_BASE, false, SqlStatements.TREE_BASE_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.RECEIPTRECORDS));
            DbUtils.IIK(connection, var18);
            var7 = new ViewDef(false, null, EntityName.RECEIPTRECORDS_TREE_FULL, false, SqlStatements.TREE_FULL_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.RECEIPTRECORDS).replaceAll(SqlStatements.VIEW_NAME_PLACEHOLDER, EntityName.RECEIPTRECORDS_TREE_BASE));
            DbUtils.IIK(connection, var7);
            this.QIN.put(EntityName.RECEIPTRECORDS, invoicesTableDef);
            this.QIN.put(EntityName.RECEIPTRECORDS_TREE_FULL, invoicesTableDef);
            invoicesTableDef = new TableDef(false, null, EntityName.SETTLEMENTS, false);
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_id.getDefinition(), false, true, OrderType.ASC));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_parentid.getDefinition(), true, true));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_version.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_audit_ts_created.getDefinition(), false, false, "current_timestamp"));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodYear.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodMonth.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_type.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_subType.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_typeclass.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_encrypted.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_salt.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_iv.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_body.getDefinition(), false, false));
            invoicesTableDef.getConstraints().add(new ConstraintPRIMARYDef(CellType.cell_technical_id.<CellTyped>getDefinition()));
            ConstraintUNIQUEDef var19 = new ConstraintUNIQUEDef(CellType.cell_business_periodYear.<CellTyped>getDefinition(), CellType.cell_business_periodMonth.<CellTyped>getDefinition(), CellType.cell_technical_type.<CellTyped>getDefinition());
            invoicesTableDef.getConstraints().add(var19);
            DbUtils.IIH(connection, invoicesTableDef);
            DbUtils.createTable(connection, invoicesTableDef);
            var7 = new ViewDef(false, null, EntityName.SETTLEMENTS_TREE_BASE, false, SqlStatements.TREE_BASE_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.SETTLEMENTS));
            DbUtils.IIK(connection, var7);
            var8 = new ViewDef(false, null, EntityName.SETTLEMENTS_TREE_FULL, false, SqlStatements.TREE_FULL_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.SETTLEMENTS).replaceAll(SqlStatements.VIEW_NAME_PLACEHOLDER, EntityName.SETTLEMENTS_TREE_BASE));
            DbUtils.IIK(connection, var8);
            ViewDef var21 = new ViewDef(false, null, EntityName.SETTLEMENTS_TREE_REF_LEVEL, false, SqlStatements.TREE_REF_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.SETTLEMENTS));
            DbUtils.IIK(connection, var21);
            invoicesTableDef.getColumns().add(new InitScriptCell(CellType.cell_business_documentIndex.getDefinition(), false, false, "select viewMaxRefLevel from settlementsTreeRefLevel where viewQueryId = technical_id"));
            invoicesTableDef.getConstraints().remove(var19);
            ConstraintUNIQUEDef var10 = new ConstraintUNIQUEDef(CellType.cell_business_periodYear.<CellTyped>getDefinition(), CellType.cell_business_periodMonth.<CellTyped>getDefinition(), CellType.cell_business_documentIndex.<CellTyped>getDefinition(), CellType.cell_technical_type.<CellTyped>getDefinition());
            invoicesTableDef.getConstraints().add(var10);
            DbUtils.IIJ(connection, invoicesTableDef);
            DbUtils.QIQ(connection, invoicesTableDef);
            ViewDef var11 = new ViewDef(false, null, EntityName.SETTLEMENTS_LAST_CHILD_ID_BASE, false, SqlStatements.SETTLEMENTS_LAST_CHILD_ID_BASE_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.SETTLEMENTS));
            DbUtils.IIK(connection, var11);
            ViewDef var12 = new ViewDef(false, null, EntityName.SETTLEMENTS_LAST_CHILD_ID_FULL, false, SqlStatements.TREE_FULL_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.SETTLEMENTS).replaceAll(SqlStatements.VIEW_NAME_PLACEHOLDER, EntityName.SETTLEMENTS_LAST_CHILD_ID_BASE));
            DbUtils.IIK(connection, var12);
            this.QIN.put(EntityName.SETTLEMENTS, invoicesTableDef);
            this.QIN.put(EntityName.SETTLEMENTS_TREE_FULL, invoicesTableDef);
            invoicesTableDef = new TableDef(false, null, "ref", EntityName.INVOICERECORDS, false);
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_id.getDefinition(), false, true, OrderType.ASC));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_parentid.getDefinition(), true, true));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_version.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_audit_ts_created.getDefinition(), false, false, "current_timestamp"));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodYear.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodMonth.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_type.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_subType.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_typeclass.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_encrypted.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_salt.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_iv.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_body.getDefinition(), false, false));
            invoicesTableDef.getConstraints().add(new ConstraintPRIMARYDef(CellType.cell_technical_id.<CellTyped>getDefinition()));
            var19 = new ConstraintUNIQUEDef(CellType.cell_business_periodYear.<CellTyped>getDefinition(), CellType.cell_business_periodMonth.<CellTyped>getDefinition(), CellType.cell_technical_type.<CellTyped>getDefinition());
            invoicesTableDef.getConstraints().add(var19);
            DbUtils.IIH(connection, invoicesTableDef);
            DbUtils.createTable(connection, invoicesTableDef);
            var7 = new ViewDef(false, null, EntityName.INVOICERECORDS_TREE_BASE, false, SqlStatements.TREE_BASE_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.INVOICERECORDS));
            DbUtils.IIK(connection, var7);
            var8 = new ViewDef(false, null, EntityName.INVOICERECORDS_TREE_FULL, false, SqlStatements.TREE_FULL_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.INVOICERECORDS).replaceAll(SqlStatements.VIEW_NAME_PLACEHOLDER, EntityName.INVOICERECORDS_TREE_BASE));
            DbUtils.IIK(connection, var8);
            var21 = new ViewDef(false, null, EntityName.INVOICERECORDS_TREE_REF_LEVEL, false, SqlStatements.TREE_REF_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.INVOICERECORDS));
            DbUtils.IIK(connection, var21);
            invoicesTableDef.getColumns().add(new InitScriptCell(CellType.cell_technical_settlementid.getDefinition(), true, false, "select s.technical_id from settlements s where s.business_periodYear = ref.business_periodYear and s.business_periodMonth = ref.business_periodMonth"));
            invoicesTableDef.getColumns().add(new InitScriptCell(CellType.cell_business_documentIndex.getDefinition(), false, false, "select viewMaxRefLevel from invoicerecordsTreeRefLevel where viewQueryId = technical_id"));
            invoicesTableDef.getConstraints().remove(var19);
            var10 = new ConstraintUNIQUEDef(CellType.cell_business_periodYear.<CellTyped>getDefinition(), CellType.cell_business_periodMonth.<CellTyped>getDefinition(), CellType.cell_business_documentIndex.<CellTyped>getDefinition(), CellType.cell_technical_type.<CellTyped>getDefinition());
            invoicesTableDef.getConstraints().add(var10);
            invoicesTableDef.getConstraints().add(new ConstraintFOREIGNDef(EntityName.SETTLEMENTS, new CellNamed[]{CellType.cell_technical_settlementid.<CellTyped>getDefinition()}, new CellNamed[]{CellType.cell_technical_id.<CellTyped>getDefinition()}));
            DbUtils.IIJ(connection, invoicesTableDef);
            DbUtils.QIQ(connection, invoicesTableDef);
            var11 = new ViewDef(false, null, EntityName.INVOICERECORDS_LATEST_TYPE_FOR_PERIOD, false, SqlStatements.INVOICERECORDS_LATEST_TYPE_FOR_PERIOD_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.INVOICERECORDS));
            DbUtils.IIK(connection, var11);
            this.QIN.put(EntityName.INVOICERECORDS, invoicesTableDef);
            this.QIN.put(EntityName.INVOICERECORDS_TREE_FULL, invoicesTableDef);
            invoicesTableDef = new TableDef(false, null, "ref", EntityName.DECLARATIONS, false);
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_id.getDefinition(), false, true, OrderType.ASC));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_parentid.getDefinition(), true, true));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_version.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_audit_ts_created.getDefinition(), false, false, "current_timestamp"));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodYear.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodMonth.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_type.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_subType.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_typeclass.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_encrypted.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_salt.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_iv.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_body.getDefinition(), false, false));
            invoicesTableDef.getConstraints().add(new ConstraintPRIMARYDef(CellType.cell_technical_id.<CellTyped>getDefinition()));
            var19 = new ConstraintUNIQUEDef(CellType.cell_business_periodYear.<CellTyped>getDefinition(), CellType.cell_business_periodMonth.<CellTyped>getDefinition(), CellType.cell_technical_type.<CellTyped>getDefinition());
            invoicesTableDef.getConstraints().add(var19);
            DbUtils.IIH(connection, invoicesTableDef);
            DbUtils.createTable(connection, invoicesTableDef);
            var7 = new ViewDef(false, null, EntityName.DECLARATIONS_TREE_BASE, false, SqlStatements.TREE_BASE_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.DECLARATIONS));
            DbUtils.IIK(connection, var7);
            var8 = new ViewDef(false, null, EntityName.DECLARATIONS_TREE_FULL, false, SqlStatements.TREE_FULL_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.DECLARATIONS).replaceAll(SqlStatements.VIEW_NAME_PLACEHOLDER, EntityName.DECLARATIONS_TREE_BASE));
            DbUtils.IIK(connection, var8);
            var21 = new ViewDef(false, null, EntityName.DECLARATIONS_TREE_REF_LEVEL, false, SqlStatements.TREE_REF_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.DECLARATIONS));
            DbUtils.IIK(connection, var21);
            invoicesTableDef.getColumns().add(new InitScriptCell(CellType.cell_technical_settlementid.getDefinition(), true, false, "select s.technical_id from settlements s where s.business_periodYear = ref.business_periodYear and s.business_periodMonth = ref.business_periodMonth"));
            invoicesTableDef.getColumns().add(new InitScriptCell(CellType.cell_business_documentIndex.getDefinition(), false, false, "select viewMaxRefLevel from declarationsTreeRefLevel where viewQueryId = technical_id"));
            invoicesTableDef.getConstraints().remove(var19);
            var10 = new ConstraintUNIQUEDef(CellType.cell_business_periodYear.<CellTyped>getDefinition(), CellType.cell_business_periodMonth.<CellTyped>getDefinition(), CellType.cell_business_documentIndex.<CellTyped>getDefinition(), CellType.cell_technical_type.<CellTyped>getDefinition(), CellType.cell_technical_subType.<CellTyped>getDefinition());
            invoicesTableDef.getConstraints().add(var10);
            invoicesTableDef.getConstraints().add(new ConstraintFOREIGNDef(EntityName.SETTLEMENTS, new CellNamed[]{CellType.cell_technical_settlementid.<CellTyped>getDefinition()}, new CellNamed[]{CellType.cell_technical_id.<CellTyped>getDefinition()}));
            DbUtils.IIJ(connection, invoicesTableDef);
            DbUtils.QIQ(connection, invoicesTableDef);
            this.QIN.put(EntityName.DECLARATIONS, invoicesTableDef);
            this.QIN.put(EntityName.DECLARATIONS_TREE_FULL, invoicesTableDef);
            invoicesTableDef = new TableDef(false, null, "ref", EntityName.CONTACTS, false);
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_id.getDefinition(), false, true, OrderType.ASC));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_parentid.getDefinition(), true, true));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_version.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_audit_ts_created.getDefinition(), false, false, "current_timestamp"));
            var6 = new CellDef(CellType.cell_business_name.getDefinition(), false, true);
            invoicesTableDef.getColumns().add(var6);
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_type.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_subType.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_typeclass.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_encrypted.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_salt.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_iv.getDefinition(), true, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_body.getDefinition(), false, false));
            invoicesTableDef.getConstraints().add(new ConstraintPRIMARYDef(CellType.cell_technical_id.<CellTyped>getDefinition()));
            DbUtils.IIH(connection, invoicesTableDef);
            DbUtils.createTable(connection, invoicesTableDef);
            var7 = new ViewDef(false, null, EntityName.CONTACTS_TREE_BASE, false, SqlStatements.TREE_BASE_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.CONTACTS));
            DbUtils.IIK(connection, var7);
            var8 = new ViewDef(false, null, EntityName.CONTACTS_TREE_FULL, false, SqlStatements.TREE_FULL_SQL.replaceAll(SqlStatements.TABLE_NAME_PLACEHOLDER, EntityName.CONTACTS).replaceAll(SqlStatements.VIEW_NAME_PLACEHOLDER, EntityName.CONTACTS_TREE_BASE));
            DbUtils.IIK(connection, var8);
            invoicesTableDef.getColumns().remove(var6);
            invoicesTableDef.getColumns().add(new InitScriptCell(CellType.cell_business_contractorName.getDefinition(), false, false, "select c.business_name from contacts c where c.technical_id = ref.technical_id"));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_contractorNIP.getDefinition(), true, true));
            var9 = new HashSet();
            var9.add(CellType.cell_technical_typeclass.<CellTyped>getDefinition());
            var9.add(CellType.cell_technical_encrypted.<CellTyped>getDefinition());
            var9.add(CellType.cell_technical_salt.<CellTyped>getDefinition());
            var9.add(CellType.cell_technical_iv.<CellTyped>getDefinition());
            var9.add(CellType.cell_technical_body.<CellTyped>getDefinition());
            invoicesTableDef.getColumns().add(new MigrationCell(CellType.cell_business_hash.getDefinition(), false, false, -1, var9, new MigrationCell.MigrationAction<Integer>() {
                private final FFF TWH = var1;

                public Integer action(Set<CellValue<?>> contextColumns) {

                    Integer var3;
                    try {
                        Contractor var2 = EMX.this.QPU(this.TWH, contextColumns);
                        if (var2 == null) {
                            var3 = -2;
                            return var3;
                        }

                        var3 = var2.QON();
                        return var3;
                    } catch (Exception var7) {
                        log.error("Something bad happened", var7);
                        var3 = -3;
                    }

                    return var3;
                }
            }, null));
            DbUtils.IIJ(connection, invoicesTableDef);
            DbUtils.QIQ(connection, invoicesTableDef);
            this.QIN.put(EntityName.CONTACTS, invoicesTableDef);
            this.QIN.put(EntityName.CONTACTS_TREE_FULL, invoicesTableDef);
            invoicesTableDef = new TableDef(false, null, EntityName.SEQUENCES, false);
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_audit_ts_created.getDefinition(), false, false, "current_timestamp"));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodYear.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_periodMonth.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_type.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_numeric_value.getDefinition(), false, false));
            invoicesTableDef.getConstraints().add(new ConstraintUNIQUEDef(CellType.cell_business_periodYear.<CellTyped>getDefinition(), CellType.cell_business_periodMonth.<CellTyped>getDefinition(), CellType.cell_technical_type.<CellTyped>getDefinition()));
            DbUtils.IIH(connection, invoicesTableDef);
            this.QIN.put(EntityName.SEQUENCES, invoicesTableDef);
            invoicesTableDef = new TableDef(false, null, EntityName.DICTIONARIES, false);
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_dictionaryName.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_business_dictionaryEntry.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_typeclass.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_body.getDefinition(), false, false));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_audit_ts_created.getDefinition(), false, false, "current_timestamp"));
            invoicesTableDef.getColumns().add(new CellDef(CellType.cell_technical_version.getDefinition(), false, false));
            invoicesTableDef.getConstraints().add(new ConstraintUNIQUEDef(CellType.cell_business_dictionaryName.<CellTyped>getDefinition(), CellType.cell_business_dictionaryEntry.<CellTyped>getDefinition()));
            DbUtils.IIH(connection, invoicesTableDef);
            this.QIN.put(EntityName.DICTIONARIES, invoicesTableDef);
            connection.commit();
            this.isProfileDatabaseInitiated = true;
            return connection;
        } catch (ClassNotFoundException | SQLException var16) {
            log.error("Something bad happened", var16);
            throw new FFK(var16);
        }
    }

    private <_T extends ModelBase> _T QPU(FFF var1, Set<CellValue<?>> var2) {

        Short var4;
        try {
            Class var3 = null;
            var4 = null;
            byte[] var5 = null;
            byte[] var6 = null;
            byte[] var7 = null;
            Iterator var8 = var2.iterator();

            while (var8.hasNext()) {
                CellValue var9 = (CellValue) var8.next();
                String var10 = var9.getName();
                Object var11 = var9.getValue();
                if (CellType.cell_technical_typeclass.<CellTyped>getDefinition().getName().equals(var10)) {
                    var3 = Class.forName((String) var11);
                } else if (CellType.cell_technical_encrypted.<CellTyped>getDefinition().getName().equals(var10)) {
                    if (var11 instanceof Integer) {
                        var4 = ((Integer) var11).shortValue();
                    } else {
                        if (!(var11 instanceof Short)) {
                            throw new FFK("Invalid cell [" + var10 + "] type [" + var11 + "]!");
                        }

                        var4 = (Short) var11;
                    }
                } else if (CellType.cell_technical_salt.<CellTyped>getDefinition().getName().equals(var10)) {
                    var5 = (byte[]) var11;
                } else if (CellType.cell_technical_iv.<CellTyped>getDefinition().getName().equals(var10)) {
                    var6 = (byte[]) var11;
                } else if (CellType.cell_technical_body.<CellTyped>getDefinition().getName().equals(var10)) {
                    var7 = (byte[]) var11;
                }
            }

            byte[] var17;
            if (var4 > 0) {
                var17 = var1.ILI(var6, var5, var7);
            } else {
                var17 = var7;
            }

            ModelBase var18 = this.HLA(var17, var3);
            ModelBase var19 = var18;
            return (_T) var19;
        } catch (Exception var15) {
            log.error("Something bad happened", var15);
            return null;
        }

    }

    public void HKY(String var1) throws FFK {

        try {
            if (var1 == null || var1.length() <= 0) {
                throw new FFI("Profile name is empty!");
            }

            if (this.connection != null) {
                this.connection.close();
                this.isProfileDatabaseInitiated = false;
            }
        } catch (SQLException var6) {
            log.error("Something bad happened", var6);
            this.connection = null;
            this.isProfileDatabaseInitiated = false;
            throw new FFK(var6);
        }

    }

    public synchronized <_T extends ModelBase> byte[] HKZ(_T var1) throws FFK {

        byte[] var2;
        try {
            var2 = this.FIU.IKU(var1);
        } catch (JAXBException var6) {
            log.error("Something bad happened", var6);
            throw new FFK(var6);
        }

        return var2;
    }

    public synchronized <_T extends ModelBase> _T HLA(byte[] var1, Class<_T> var2) throws FFK {

        ModelBase var3;
        try {
            var3 = this.FIV.IKV(new ByteArrayInputStream(var1), var2);
        } catch (XMLStreamException | JAXBException var7) {
            log.error("Something bad happened", var7);
            throw new FFK(var7);
        }

        return (_T) var3;
    }

    private void HLB(Connection var1) throws FFK {

        try {
            if (var1 == null) {
                throw new FFK("Connection cannot be NULL!");
            }

            synchronized (var1) {
                var1.commit();
            }
        } catch (SQLException var9) {
            log.error("Something bad happened", var9);
            throw new FFK(var9);
        }

    }

    private void HLC(Connection var1) throws FFK {

        try {
            if (var1 == null) {
                throw new FFK("Connection cannot be NULL!");
            }

            synchronized (var1) {
                var1.rollback();
            }
        } catch (SQLException var9) {
            log.error("Something bad happened", var9);
            throw new FFK(var9);
        }

    }

    public void HLD() throws FFK {

        this.HLB(this.profilesConnection);

    }

    public void HLE() throws FFK {

        this.HLC(this.profilesConnection);

    }

    public void HLF() throws FFK {

        this.HLB(this.connection);

    }

    public void HLG() throws FFK {

        this.HLC(this.connection);

    }

    public Map<String, SimpleUserData> HLH() throws FFK {

        try {
            ArrayList var1 = new ArrayList();
            var1.add(new CellQuery(CellType.cell_technical_username.<CellTyped>getDefinition()));
            var1.add(new CellQuery(CellType.cell_technical_type.<CellTyped>getDefinition()));
            var1.add(new CellQuery(CellType.cell_technical_salt.<CellTyped>getDefinition()));
            var1.add(new CellQuery(CellType.cell_technical_password.<CellTyped>getDefinition()));
            var1.add(new CellQuery(CellType.cell_technical_password_change.<CellTyped>getDefinition()));
            ArrayList var2 = new ArrayList();
            ArrayList var3 = new ArrayList();
            ValueContainer2 var4 = this.HMB(this.profilesConnection, EntityName.USERS, var1, var2, var3, null, null, new ENE<ValueContainer1<SimpleUserData>, SimpleUserData>() {
                public ValueContainer1<SimpleUserData> HNF(List<CellValue<?>> var1) throws Exception {
                    Text var2 = null;
                    JZ var3 = null;
                    PrivtePerson var4 = null;
                    Bytes var5 = null;
                    Bytes var6 = null;
                    Boolean var7 = null;
                    Iterator var8 = var1.iterator();

                    while (true) {
                        while (var8.hasNext()) {
                            CellValue var9 = (CellValue) var8.next();
                            if (CellType.cell_technical_username.<CellTyped>getDefinition().getName().equals(var9.getName())) {
                                var2 = new Text((String) var9.getValue());
                            } else if (CellType.cell_technical_type.<CellTyped>getDefinition().getName().equals(var9.getName())) {
                                var3 = new JZ(LoginType.valueOf((String) var9.getValue()));
                            } else if (CellType.cell_technical_salt.<CellTyped>getDefinition().getName().equals(var9.getName())) {
                                var5 = new Bytes((byte[]) var9.getValue());
                            } else if (CellType.cell_technical_password.<CellTyped>getDefinition().getName().equals(var9.getName())) {
                                var6 = new Bytes((byte[]) var9.getValue());
                            } else if (CellType.cell_technical_password_change.<CellTyped>getDefinition().getName().equals(var9.getName())) {
                                Integer var10 = (Integer) var9.getValue();
                                var7 = var10 != null && var10 > 0;
                            }
                        }

                        if (var5 != null && var5.getValue() != null && var6 != null && var6.getValue() != null) {
                            var4 = new PrivtePerson(true);
                        } else {
                            var4 = new PrivtePerson(false);
                        }

                        return new ValueContainer1(new SimpleUserData(var2, var3, var4, var5, var6, var7));
                    }
                }
            });
            HashMap var5 = new HashMap();
            Iterator var6 = ((List) var4.getSecondValue()).iterator();

            while (var6.hasNext()) {
                ValueContainer1 var7 = (ValueContainer1) var6.next();
                var5.put(((SimpleUserData) var7.getFirstValue()).getUsername().getValue().toLowerCase(), var7.getFirstValue());
            }

            HashMap var13 = var5;
            return var13;
        } catch (Exception var11) {
            log.error("Something bad happened", var11);
            throw new FFK(var11);
        }
    }

    public <_T extends BaseUserData> void HLI(SimpleUserData var1) throws FFK {

        String var2 = EntityName.USERS;
        synchronized (EntityName.USERS) {
            this.HLL(SqlOperation.insert, var1);
        }

    }

    public <_T extends BaseUserData> void HLJ(SimpleUserData var1) throws FFK {

        String var2 = EntityName.USERS;
        synchronized (EntityName.USERS) {
            this.HLL(SqlOperation.update, var1);
        }

    }

    public <_T extends BaseUserData> void HLK(SimpleUserData var1) throws FFK {

        String var2 = EntityName.USERS;
        synchronized (EntityName.USERS) {
            this.HLL(SqlOperation.delete, var1);
        }

    }

    private <_T extends BaseUserData> void HLL(SqlOperation var1, SimpleUserData var2) throws FFK {

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
        var9.add(new CellValue(CellType.cell_technical_username.getDefinition(), var3));
        ArrayList var10 = null;
        switch (var1) {
            case insert:
            case update:
                var10 = new ArrayList();
                var10.add(new CellValue(CellType.cell_technical_type.getDefinition(), var4));
                var10.add(new CellValue(CellType.cell_technical_salt.getDefinition(), var7));
                var10.add(new CellValue(CellType.cell_technical_password.getDefinition(), var6));
                var10.add(new CellValue(CellType.cell_technical_password_change.getDefinition(), var8));
            case delete:
                break;
            default:
                throw new FFK("Unsupported action type [" + var1 + "]!");
        }

        switch (var1) {
            case insert:
                this.HMS(this.profilesConnection, EntityName.USERS, var9, var10);
                break;
            case update:
                this.HMT(this.profilesConnection, EntityName.USERS, var9, var10);
                break;
            case delete:
                this.HMU(this.profilesConnection, EntityName.USERS, var9);
                break;
            default:
                throw new FFK("Unsupported action type [" + var1 + "]!");
        }

    }

    public <_T extends BaseUserData> _T HLM(FFF var1, String var2, Class<_T> var3) throws FFK {

        BaseUserData var4;
        var4 = this.HLN(var1, var2, var3, null);

        return (_T) var4;
    }

    public <_T extends BaseUserData> _T HLN(FFF var1, String var2, Class<_T> var3, Integer var4) throws FFK {

        BaseUserData var5;
        if (var4 == null) {
            var5 = this.HMA(var1, EntityName.PREFERENCES_LATEST_VERSION, var2, var3, null);
            return (_T) var5;
        }

        var5 = this.HMA(var1, EntityName.PREFERENCES, var2, var3, var4);

        return (_T) var5;
    }

    public <_T extends Invoice<?>> ValueContainer2<Integer, List<ParametrizedModel<_T>>> ROB(FFF var1, InvoiceState var2, OrderType var3, Integer var4, Integer var5, Period var6, InvoiceType var7, InvoiceSubtype var8, RefId var9, Nip var10, Nip var11, ValueContainer2<Date, Date> var12, ValueContainer2<Date, Date> var13, String var14) throws FFK {

        ValueContainer2 var25;
        ArrayList var15 = new ArrayList();
        var15.add(CellType.cell_business_refid);
        var15.add(CellType.cell_business_issuer_number);
        var15.add(CellType.cell_business_invoicingDate);
        var15.add(CellType.cell_business_contractorName);
        var15.add(CellType.cell_business_contractorNIP);
        var15.add(CellType.cell_business_netValue);
        var15.add(CellType.cell_business_grossValue);
        var15.add(CellType.cell_business_taxValue);
        var15.add(CellType.cell_business_creationDate);
        var15.add(CellType.cell_business_transactionDate);
        var15.add(CellType.cell_business_state);
        ArrayList var16 = new ArrayList();
        String var17 = var9 != null ? var9.getValue() : null;
        if (var17 != null) {
            var16.add(new CellValue(CellType.cell_business_refid.getDefinition(), var17));
        }

        String var18 = var10 != null ? var10.getValue() : null;
        if (var18 != null) {
            var16.add(new CellValue(CellType.cell_business_issuer_number.getDefinition(), var18));
        }

        String var19 = var11 != null ? var11.getValue() : null;
        if (var19 != null) {
            var16.add(new CellValue(CellType.cell_business_contractorNIP.getDefinition(), var19));
        }

        if (var12 != null && var12.getFirstValue() != null && var12.getSecondValue() != null) {
            var16.add(new CellValue(CellType.cell_business_creationDate.getDefinition(), var12.getFirstValue(), Condition.GREATER_THAN_OR_EQUALS));
            var16.add(new CellValue(CellType.cell_business_creationDate.getDefinition(), var12.getSecondValue(), Condition.LESS_THAN_OR_EQUALS));
        }

        if (var13 != null && var13.getFirstValue() != null && var13.getSecondValue() != null) {
            var16.add(new CellValue(CellType.cell_business_transactionDate.getDefinition(), var13.getFirstValue(), Condition.GREATER_THAN_OR_EQUALS));
            var16.add(new CellValue(CellType.cell_business_transactionDate.getDefinition(), var13.getSecondValue(), Condition.LESS_THAN_OR_EQUALS));
        }

        if (var2 != null) {
            var16.add(new CellValue(CellType.cell_business_state.getDefinition(), var2.getKey(), Condition.EQUALS));
        }

        ArrayList var20 = new ArrayList();
        if (var14 != null && var14.length() >= 3) {
            Expression var21 = new Expression(SqlOperator.OR);
            var21.IJR(new CellValue(CellType.cell_business_refid.getDefinition(), "%" + var14 + "%", Condition.LIKE));
            var21.IJR(new CellValue(CellType.cell_business_contractorName.getDefinition(), "%" + var14 + "%", Condition.LIKE));
            var21.IJR(new CellValue(CellType.cell_business_contractorNIP.getDefinition(), "%" + var14 + "%", Condition.LIKE));
            var21.IJR(new CellValue(CellType.cell_business_netValue.getDefinition(), "%" + var14 + "%", Condition.LIKE));
            var21.IJR(new CellValue(CellType.cell_business_grossValue.getDefinition(), "%" + var14 + "%", Condition.LIKE));
            var21.IJR(new CellValue(CellType.cell_business_taxValue.getDefinition(), "%" + var14 + "%", Condition.LIKE));
            var20.add(var21);
        }

        var25 = this.HLX(var1, EntityName.INVOICES, EntityName.INVOICES_TREE_FULL, var15, var16, var20, var3, var4, var5, var6, var7, var8);

        return var25;
    }

    public <_T extends InvoiceOther<?>> ValueContainer2<Integer, List<ParametrizedModel<_T>>> ROC(FFF var1, InvoiceState var2, OrderType var3, Integer var4, Integer var5, Period var6, InvoiceOtherType var7, InvoiceOtherSubtype var8, RefId var9, Nip var10, Nip var11, ValueContainer2<Date, Date> var12, ValueContainer2<Date, Date> var13, String var14) throws FFK {

        ValueContainer2 var25;
        ArrayList var15 = new ArrayList();
        var15.add(CellType.cell_business_refid);
        var15.add(CellType.cell_business_issuer_number);
        var15.add(CellType.cell_business_invoicingDate);
        var15.add(CellType.cell_business_contractorName);
        var15.add(CellType.cell_business_contractorNIP);
        var15.add(CellType.cell_business_netValue);
        var15.add(CellType.cell_business_grossValue);
        var15.add(CellType.cell_business_taxValue);
        var15.add(CellType.cell_business_creationDate);
        var15.add(CellType.cell_business_state);
        ArrayList var16 = new ArrayList();
        String var17 = var9 != null ? var9.getValue() : null;
        if (var17 != null) {
            var16.add(new CellValue(CellType.cell_business_refid.getDefinition(), var17));
        }

        String var18 = var10 != null ? var10.getValue() : null;
        if (var18 != null) {
            var16.add(new CellValue(CellType.cell_business_issuer_number.getDefinition(), var18));
        }

        String var19 = var11 != null ? var11.getValue() : null;
        if (var19 != null) {
            var16.add(new CellValue(CellType.cell_business_contractorNIP.getDefinition(), var19));
        }

        if (var12 != null && var12.getFirstValue() != null && var12.getSecondValue() != null) {
            var16.add(new CellValue(CellType.cell_business_creationDate.getDefinition(), var12.getFirstValue(), Condition.GREATER_THAN_OR_EQUALS));
            var16.add(new CellValue(CellType.cell_business_creationDate.getDefinition(), var12.getSecondValue(), Condition.LESS_THAN_OR_EQUALS));
        }

        if (var2 != null) {
            var16.add(new CellValue(CellType.cell_business_state.getDefinition(), var2, Condition.EQUALS));
        }

        ArrayList var20 = new ArrayList();
        if (var14 != null && var14.length() >= 3) {
            Expression var21 = new Expression(SqlOperator.OR);
            var21.IJR(new CellValue(CellType.cell_business_refid.getDefinition(), "%" + var14 + "%", Condition.LIKE));
            var21.IJR(new CellValue(CellType.cell_business_contractorName.getDefinition(), "%" + var14 + "%", Condition.LIKE));
            var21.IJR(new CellValue(CellType.cell_business_contractorNIP.getDefinition(), "%" + var14 + "%", Condition.LIKE));
            var21.IJR(new CellValue(CellType.cell_business_netValue.getDefinition(), "%" + var14 + "%", Condition.LIKE));
            var21.IJR(new CellValue(CellType.cell_business_grossValue.getDefinition(), "%" + var14 + "%", Condition.LIKE));
            var21.IJR(new CellValue(CellType.cell_business_taxValue.getDefinition(), "%" + var14 + "%", Condition.LIKE));
            var20.add(var21);
        }

        var25 = this.HLX(var1, EntityName.INVOICESOTHER, EntityName.INVOICESOTHER_TREE_FULL, var15, var16, var20, var3, var4, var5, var6, var7, var8);

        return var25;
    }

    public <_T extends ReceiptRecord> ValueContainer2<Integer, List<ParametrizedModel<_T>>> HLP(FFF var1, OrderType var2, Integer var3, Integer var4, Period var5, RecordType var6) throws FFK {

        ValueContainer2 var7;
        var7 = this.HLX(var1, EntityName.RECEIPTRECORDS, EntityName.RECEIPTRECORDS_TREE_FULL, null, null, null, var2, var3, var4, var5, var6, null);

        return var7;
    }

    public <_T extends Settlement> ValueContainer2<Integer, List<ParametrizedModel<_T>>> HLQ(FFF var1, OrderType var2, Integer var3, Integer var4, Period var5, SettlementType var6) throws FFK {

        ValueContainer2 var7;
        var7 = this.HLX(var1, EntityName.SETTLEMENTS_LAST_CHILD_ID_FULL, EntityName.SETTLEMENTS_TREE_FULL, null, null, null, var2, var3, var4, var5, var6, null);

        return var7;
    }

    public <_T extends Declaration> ValueContainer2<Integer, List<ParametrizedModel<_T>>> HLR(FFF var1, OrderType var2, Integer var3, Integer var4, Period var5, DeclarationType var6, DeclarationSubtype var7) throws FFK {

        ValueContainer2 var8;
        var8 = this.HLX(var1, EntityName.DECLARATIONS, EntityName.DECLARATIONS_TREE_FULL, null, null, null, var2, var3, var4, var5, var6, var7);

        return var8;
    }

    public <_T extends Declaration> ValueContainer2<Integer, List<ParametrizedModel<_T>>> QPW(FFF var1, OrderType var2, Integer var3, Integer var4, Settlement var5, Period var6, DeclarationType var7, DeclarationSubtype var8) throws FFK {

        ValueContainer2 var10;
        if (var5 == null) {
            throw new FFI("Missing Settlement Id!");
        }

        ArrayList var9 = new ArrayList();
        var9.add(new CellValue(CellType.cell_technical_settlementid.getDefinition(), var5.getId()));
        var10 = this.HLX(var1, EntityName.DECLARATIONS, EntityName.DECLARATIONS_TREE_FULL, null, var9, null, var2, var3, var4, var6, var7, var8);

        return var10;
    }

    public <_T extends Contractor> ValueContainer2<Integer, List<ParametrizedModel<_T>>> HLT(FFF var1, OrderType var2) throws FFK {

        ValueContainer2 var4;
        ArrayList var3 = new ArrayList();
        var3.add(CellType.cell_business_contractorName);
        var3.add(CellType.cell_business_contractorNIP);
        var4 = this.HLY(var1, EntityName.CONTACTS, EntityName.CONTACTS_TREE_FULL, var3, null, null, var2, null, null, null, null, null);

        return var4;
    }

    public <_T extends Contractor> ValueContainer2<Integer, List<ParametrizedModel<_T>>> QPX(FFF var1, OrderType var2, Integer var3, String var4) throws FFK {

        ValueContainer2 var12;
        ArrayList var5 = new ArrayList();
        var5.add(CellType.cell_business_contractorName);
        var5.add(CellType.cell_business_contractorNIP);
        ArrayList var6 = new ArrayList();
        if (var3 != null) {
            var6.add(new CellValue(CellType.cell_business_hash.getDefinition(), var3));
        }

        ArrayList var7 = new ArrayList();
        if (var4 != null && var4.length() >= 3) {
            Expression var8 = new Expression(SqlOperator.OR);
            var8.IJR(new CellValue(CellType.cell_business_contractorName.getDefinition(), "%" + var4 + "%", Condition.LIKE));
            var8.IJR(new CellValue(CellType.cell_business_contractorNIP.getDefinition(), "%" + var4 + "%", Condition.LIKE));
            var7.add(var8);
        }

        var12 = this.HLY(var1, EntityName.CONTACTS, EntityName.CONTACTS_TREE_FULL, var5, var6, var7, var2, null, null, null, null, null);

        return var12;
    }

    public <_T extends InvoiceRecord> ValueContainer2<Integer, List<ParametrizedModel<_T>>> HLV(FFF var1, OrderType var2, Integer var3, Integer var4, Period var5, InvoiceRecordType var6) throws FFK {

        ValueContainer2 var7;
        var7 = this.HLX(var1, EntityName.INVOICERECORDS_LATEST_TYPE_FOR_PERIOD, EntityName.INVOICERECORDS_TREE_FULL, null, null, null, var2, var3, var4, var5, var6, null);

        return var7;
    }

    public <_T extends InvoiceRecord> ValueContainer2<Integer, List<ParametrizedModel<_T>>> QPY(FFF var1, OrderType var2, Integer var3, Integer var4, Settlement var5, Period var6, InvoiceRecordType var7) throws FFK {

        ValueContainer2 var9;
        if (var5 == null) {
            throw new FFI("Missing Settlement Id!");
        }

        ArrayList var8 = new ArrayList();
        var8.add(new CellValue(CellType.cell_technical_settlementid.getDefinition(), var5.getId()));
        var9 = this.HLX(var1, EntityName.INVOICERECORDS, EntityName.INVOICERECORDS_TREE_FULL, null, var8, null, var2, var3, var4, var6, var7, null);

        return var9;
    }

    private <_T extends ModelBusinessPeriodElement> ValueContainer2<Integer, List<ParametrizedModel<_T>>> HLX(FFF var1, String var2, String var3, List<CellType> var4, List<CellValue<?>> var5, List<Expression> var6, OrderType var7, Integer var8, Integer var9, Period var10, Enum<?> var11, Enum<?> var12) throws FFK {

        ValueContainer2 var17;
        if (var4 == null) {
            var4 = new ArrayList();
        }

        if (var5 == null) {
            var5 = new ArrayList();
        }

        if (var6 == null) {
            var6 = new ArrayList();
        }

        var4.add(CellType.cell_business_periodYear);
        var4.add(CellType.cell_business_periodMonth);
        String var13 = var11 != null ? var11.name() : null;
        if (var13 != null) {
            var5.add(new CellValue(CellType.cell_technical_type.getDefinition(), var13));
        }

        String var14 = var12 != null ? var12.name() : null;
        if (var14 != null) {
            var5.add(new CellValue(CellType.cell_technical_subType.getDefinition(), var14));
        }

        if (var10 != null) {
            Period var15 = var10.DDN();
            if (var15.DDJ().getValue() != null) {
                var5.add(new CellValue(CellType.cell_business_periodYear.getDefinition(), var15.DDJ().getValue()));
            }

            if (var15.DDK().getValue() != null) {
                var5.add(new CellValue(CellType.cell_business_periodMonth.getDefinition(), var15.DDK().getValue()));
            }
        }

        if (var5.isEmpty()) {
            log.debug("Query without any predicates.");
        }

        ArrayList var21 = new ArrayList();
        OrderType var16 = null;
        if (var7 == null) {
            var16 = OrderType.ASC;
        } else {
            var16 = var7;
        }

        if (var16 != OrderType.NONE) {
            var21.add(new CellOrder(CellType.cell_business_periodYear.<CellTyped>getDefinition(), var16));
            var21.add(new CellOrder(CellType.cell_business_periodMonth.<CellTyped>getDefinition(), var16));
            var21.add(new CellOrder(CellType.cell_audit_ts_created.<CellTyped>getDefinition(), var16));
        }

        var17 = this.HLZ(var1, var2, var3, var4, var5, var6, var21, var8, var9);

        return var17;
    }

    private <_T extends ModelBaseElementWithId> ValueContainer2<Integer, List<ParametrizedModel<_T>>> HLY(FFF var1, String var2, String var3, List<CellType> var4, List<CellValue<?>> var5, List<Expression> var6, OrderType var7, Integer var8, Integer var9, Period var10, Enum<?> var11, Enum<?> var12) throws FFK {

        ValueContainer2 var17;
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
            Period var13 = var10.DDN();
            if (var13.DDJ().getValue() != null) {
                var5.add(new CellValue(CellType.cell_business_periodYear.getDefinition(), var13.DDJ().getValue()));
            }

            if (var13.DDK().getValue() != null) {
                var5.add(new CellValue(CellType.cell_business_periodMonth.getDefinition(), var13.DDK().getValue()));
            }
        }

        String var21 = var11 != null ? var11.name() : null;
        if (var21 != null) {
            var5.add(new CellValue(CellType.cell_technical_type.getDefinition(), var21));
        }

        String var14 = var12 != null ? var12.name() : null;
        if (var14 != null) {
            var5.add(new CellValue(CellType.cell_technical_subType.getDefinition(), var14));
        }

        if (var5.isEmpty()) {
            log.debug("Query without any predicates.");
        }

        ArrayList var15 = new ArrayList();
        OrderType var16 = null;
        if (var7 == null) {
            var16 = OrderType.ASC;
        } else {
            var16 = var7;
        }

        if (var16 != OrderType.NONE) {
            var15.add(new CellOrder(CellType.cell_business_contractorName.<CellTyped>getDefinition(), var16));
            var15.add(new CellOrder(CellType.cell_business_contractorNIP.<CellTyped>getDefinition(), var16));
        }

        var17 = this.HLZ(var1, var2, var3, var4, var5, var6, var15, var8, var9);

        return var17;
    }

    private <_T extends ModelBaseElementWithId> ValueContainer2<Integer, List<ParametrizedModel<_T>>> HLZ(final FFF var1, String var2, final String var3, List<CellType> var4, List<CellValue<?>> var5, List<Expression> var6, List<CellOrder> var7, Integer var8, Integer var9) throws FFK {

        try {
            final Connection var10 = this.connection;
            ArrayList var11 = new ArrayList();
            var11.add(new CellQuery(CellType.cell_technical_id.<CellTyped>getDefinition()));
            var11.add(new CellQuery(CellType.cell_technical_parentid.<CellTyped>getDefinition()));
            var11.add(new CellQuery(CellType.cell_technical_type.<CellTyped>getDefinition()));
            var11.add(new CellQuery(CellType.cell_technical_subType.<CellTyped>getDefinition()));
            var11.add(new CellQuery(CellType.cell_technical_typeclass.<CellTyped>getDefinition()));
            if (var4 != null) {
                Iterator var12 = var4.iterator();

                while (var12.hasNext()) {
                    CellType var13 = (CellType) var12.next();
                    var11.add(new CellQuery(var13.getDefinition()));
                }
            }

            ArrayList var23 = new ArrayList();
            if (var5 != null && var5.size() > 0) {
                var23.addAll(var5);
            } else {
                log.debug("Query without any predicates.");
            }

            ArrayList var24 = new ArrayList();
            if (var7 != null && var7.size() > 0) {
                var24.addAll(var7);
            } else {
                log.debug("Query without any order.");
            }

            ValueContainer2 var14 = this.HMC(var10, var2, var3, var4, var11, var23, var6, var24, var8, var9, new ENF<ValueContainer1<ParametrizedModel<_T>>, ParametrizedModel<_T>>() {
                private final String TCL = "topElementDef";

                public ValueContainer1<ParametrizedModel<_T>> HNG(List<CellType> var1x, String var2, Map<String, Map<Integer, List<CellValue<?>>>> var3x) throws Exception {

                    HashMap var4 = new HashMap();
                    HashMap var5 = new HashMap();
                    Iterator var6 = var3x.entrySet().iterator();

                    while (var6.hasNext()) {
                        Map.Entry var7 = (Map.Entry) var6.next();
                        Iterator var8 = ((Map) var7.getValue()).entrySet().iterator();

                        while (var8.hasNext()) {
                            Map.Entry var9 = (Map.Entry) var8.next();
                            ValueContainer3 var10x = this.createWrapper(var1x, (List) var9.getValue());
                            var4.put(var10x.getFirstValue(), var10x.getThirdValue());
                            var5.put(var10x.getSecondValue(), var10x.getFirstValue());
                        }
                    }

                    ParametrizedModel var14 = null;
                    String var15 = "topElementDef";
                    ParametrizedModel var16 = null;

                    do {
                        var15 = (String) var5.get(var15);
                        if (var16 == null) {
                            var16 = (ParametrizedModel) var4.get(var15);
                        } else if (var15 != null) {
                            ParametrizedModel var17 = (ParametrizedModel) var4.get(var15);
                            var16.setChild(var17);
                            var17.setParent(var16);
                            var16 = var17;
                        }

                        if (var2.equals(var15)) {
                            var14 = var16;
                        }
                    } while (var15 != null);

                    ValueContainer1 var18 = new ValueContainer1(var14);
                    return var18;
                }

                private ValueContainer3<String, String, ParametrizedModel<_T>> createWrapper(List<CellType> var1x, List<CellValue<?>> var2) {

                    String var3x = null;
                    String var4 = null;
                    HashMap var5 = new HashMap();
                    Iterator var6 = var2.iterator();

                    while (var6.hasNext()) {
                        CellValue var7 = (CellValue) var6.next();
                        String var8 = var7.getName();
                        CellType var9 = CellType.getDefinedCellByName(var8);
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
                                    CellTyped var11 = var9.getDefinition();
                                    a.a.a.b.a.a.d.CellType var12 = var11.getType();
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
                    ValueContainer3 var17 = new ValueContainer3(var3x, var16, new ParametrizedModel(new Callable<_T>() {
                        public _T call() throws FFK {
                            ArrayList var1x = new ArrayList();
                            ArrayList var2 = new ArrayList();
                            var2.add(new CellValue(CellType.cell_viewQueryId.getDefinition(), finalVar3x));
                            ValueContainer1 var3xx = EMX.this.HMD(var10, var3, var1x, var2, new ENF<ValueContainer1<_T>, _T>() {
                                private final FFF RUA = var1;

                                public ValueContainer1<_T> HNG(List<CellType> var1x, String var2, Map<String, Map<Integer, List<CellValue<?>>>> var3xx) throws Exception {

                                    HashMap var4 = new HashMap();
                                    HashMap var5 = new HashMap();
                                    Iterator var6 = var3xx.entrySet().iterator();

                                    while (var6.hasNext()) {
                                        Map.Entry var7 = (Map.Entry) var6.next();
                                        Iterator var8 = ((Map) var7.getValue()).entrySet().iterator();

                                        while (var8.hasNext()) {
                                            Map.Entry var9 = (Map.Entry) var8.next();
                                            ValueContainer3 var10x = this.createElement((List) var9.getValue());
                                            var4.put(var10x.getFirstValue(), var10x.getThirdValue());
                                            var5.put(var10x.getSecondValue(), var10x.getFirstValue());
                                        }
                                    }

                                    ModelBaseElementWithId var14 = null;
                                    String var15 = "topElementDef";
                                    ModelBaseElementWithId var16 = null;

                                    do {
                                        var15 = (String) var5.get(var15);
                                        if (var16 == null) {
                                            var16 = (ModelBaseElementWithId) var4.get(var15);
                                        } else if (var15 != null) {
                                            ModelBaseElementWithId var17 = (ModelBaseElementWithId) var4.get(var15);
                                            var16.setChild(var17);
                                            var17.setParent(var16);
                                            var16 = var17;
                                        }

                                        if (var2.equals(var15)) {
                                            var14 = var16;
                                        }
                                    } while (var15 != null);

                                    ValueContainer1 var18 = new ValueContainer1(var14);
                                    return var18;
                                }

                                private ValueContainer3<String, String, _T> createElement(List<CellValue<?>> var1x) throws Exception {

                                    ValueContainer3 var22;
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
                                        CellValue var12 = (CellValue) var11.next();
                                        String var13 = var12.getName();
                                        Object var14 = var12.getValue();
                                        if (CellType.cell_technical_id.<CellTyped>getDefinition().getName().equals(var13)) {
                                            var2 = (String) var14;
                                        } else if (CellType.cell_technical_parentid.<CellTyped>getDefinition().getName().equals(var13)) {
                                            var3xx = (String) var14;
                                        } else if (CellType.cell_technical_typeclass.<CellTyped>getDefinition().getName().equals(var13)) {
                                            var4 = Class.forName((String) var14);
                                        } else if (CellType.cell_technical_encrypted.<CellTyped>getDefinition().getName().equals(var13)) {
                                            if (var14 instanceof Integer) {
                                                var5 = ((Integer) var14).shortValue();
                                            } else {
                                                if (!(var14 instanceof Short)) {
                                                    throw new FFK("Invalid cell [" + var13 + "] type [" + var14 + "]!");
                                                }

                                                var5 = (Short) var14;
                                            }
                                        } else if (CellType.cell_technical_salt.<CellTyped>getDefinition().getName().equals(var13)) {
                                            var6 = (byte[]) var14;
                                        } else if (CellType.cell_technical_iv.<CellTyped>getDefinition().getName().equals(var13)) {
                                            var7 = (byte[]) var14;
                                        } else if (CellType.cell_technical_body.<CellTyped>getDefinition().getName().equals(var13)) {
                                            var8 = (byte[]) var14;
                                        } else if (CellType.cell_business_documentIndex.<CellTyped>getDefinition().getName().equals(var13)) {
                                            var10x = (Integer) var14;
                                        } else if (CellType.cell_business_state.<CellTyped>getDefinition().getName().equals(var13)) {
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

                                    ModelBaseElementWithId var21 = EMX.this.QJQ(var20, var4, var3, var2);
                                    if (var10x != null && var21 instanceof ModelBusinessPeriodAndDocIndexElement) {
                                        ModelBusinessPeriodAndDocIndexElement var15 = (ModelBusinessPeriodAndDocIndexElement) var21;
                                        var15.FJI().setValue(var10x);
                                    }

                                    if (var9 != null && var21 instanceof ModelBaseElementWithId) {
                                        var21.setState(InvoiceState.getByKey(var9));
                                    }

                                    var22 = new ValueContainer3(var2, var19, var21);

                                    return var22;
                                }
                            });
                            return (_T) var3xx.getFirstValue();
                        }
                    }, var3x, var5));
                    return var17;
                }
            });
            ArrayList var15 = new ArrayList();
            Iterator var16 = ((List) var14.getSecondValue()).iterator();

            while (var16.hasNext()) {
                ValueContainer1 var17 = (ValueContainer1) var16.next();
                var15.add(var17.getFirstValue());
            }

            ValueContainer2 var25 = new ValueContainer2(var14.getFirstValue(), var15);
            return var25;
        } catch (Exception var21) {
            log.error("Something bad happened", var21);
            throw new FFK(var21);
        }
    }

    private byte[] QJP(FFF var1, byte[] var2, byte[] var3, byte[] var4, String var5, String var6) throws Exception {

        byte[] var7;
        try {
            var7 = var1.ILI(var3, var2, var4);
        } catch (Exception var14) {
            log.error("About to move corrupted (encryption) data [" + var5 + " | " + var6 + "] to purgatory.", var14);
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();
            var14.printStackTrace(new PrintStream(var8));
            String var9 = var8.toString(StandardCharsets.UTF_8);
            Connection var10 = this.connection;
            this.HLG();
            DbUtils.QIR(var10, this.QIN.get(var5), CellType.cell_technical_id.getDefinition(), var6, var9);
            this.HLF();
            log.info("Moving corrupted (encryption) data [" + var5 + " | " + var6 + "] to purgatory succeded");
            throw FCZ.getInstance().QIT(var5, var6, var9);
        }

        return var7;
    }

    private <_T extends ModelBaseElementWithId> _T QJQ(byte[] var1, Class<_T> var2, String var3, String var4) throws Exception {

        ModelBaseElementWithId var5;
        try {
            var5 = this.HLA(var1, var2);
        } catch (Exception var12) {
            log.error("About to move corrupted (unmarshal) data [" + var3 + " | " + var4 + "] to purgatory.", var12);
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            var12.printStackTrace(new PrintStream(var6));
            String var7 = var6.toString(StandardCharsets.UTF_8);
            Connection var8 = this.connection;
            this.HLG();
            DbUtils.QIR(var8, this.QIN.get(var3), CellType.cell_technical_id.getDefinition(), var4, var7);
            this.HLF();
            log.info("Moving corrupted (unmarshal) data [" + var3 + " | " + var4 + "] to purgatory succeded");
            throw FCZ.getInstance().QIT(var3, var4, var7);
        }

        return (_T) var5;
    }

    private <_T extends BaseUserData> _T HMA(final FFF var1, final String var2, String var3, Class<_T> var4, Integer var5) throws FFK {

        BaseUserData var10;
        try {
            ArrayList var6 = new ArrayList();
            ArrayList var7 = new ArrayList();
            var7.add(new CellValue(CellType.cell_technical_username.getDefinition(), var3));
            var7.add(new CellValue(CellType.cell_technical_typeclass.getDefinition(), var4.getName()));
            if (var5 != null) {
                var7.add(new CellValue(CellType.cell_business_version.getDefinition(), var5));
            }

            ArrayList var8 = new ArrayList();
            ValueContainer2 var9 = this.HMB(this.profilesConnection, var2, var6, var7, var8, null, null, new ENE<ValueContainer1<_T>, _T>() {
                private final FFF RUB = var1;

                public ValueContainer1<_T> HNF(List<CellValue<?>> var1x) throws Exception {
                    String var2x = null;
                    Class var3 = null;
                    Short var4 = null;
                    byte[] var5 = null;
                    byte[] var6 = null;
                    byte[] var7 = null;
                    Iterator var8 = var1x.iterator();

                    while (var8.hasNext()) {
                        CellValue var9 = (CellValue) var8.next();
                        String var10 = var9.getName();
                        Object var11 = var9.getValue();
                        if (CellType.cell_technical_id.<CellTyped>getDefinition().getName().equals(var10)) {
                            var2x = (String) var11;
                        } else if (CellType.cell_technical_typeclass.<CellTyped>getDefinition().getName().equals(var10)) {
                            var3 = Class.forName((String) var11);
                        } else if (CellType.cell_technical_encrypted.<CellTyped>getDefinition().getName().equals(var10)) {
                            var4 = ((Integer) var11).shortValue();
                        } else if (CellType.cell_technical_salt.<CellTyped>getDefinition().getName().equals(var10)) {
                            var5 = (byte[]) var11;
                        } else if (CellType.cell_technical_iv.<CellTyped>getDefinition().getName().equals(var10)) {
                            var6 = (byte[]) var11;
                        } else if (CellType.cell_technical_body.<CellTyped>getDefinition().getName().equals(var10)) {
                            var7 = (byte[]) var11;
                        }
                    }

                    byte[] var12;
                    if (var4 > 0) {
                        var12 = EMX.this.QJP(this.RUB, var5, var6, var7, var2, var2x);
                    } else {
                        var12 = var7;
                    }

                    BaseUserData var13 = (BaseUserData) EMX.this.QJQ(var12, var3, var2, var2x);
                    return new ValueContainer1(var13);
                }
            });
            if ((Integer) var9.getFirstValue() != 0 || ((List) var9.getSecondValue()).size() != 0) {
                if ((Integer) var9.getFirstValue() == 1 && ((List) var9.getSecondValue()).size() == 1) {
                    var10 = (BaseUserData) ((ValueContainer1) ((List) var9.getSecondValue()).iterator().next()).getFirstValue();
                    return (_T) var10;
                }

                throw new FFK("ModelTechnicalElement duplicate! username [" + var3 + "] modelConfigurationElementClass [" + var4 + "]");
            }

            var10 = null;
        } catch (Exception var14) {
            log.error("Something bad happened", var14);
            throw new FFK(var14);
        }

        return (_T) var10;
    }

    private <_A extends ValueContainer1<_T>, _T extends ModelBase> ValueContainer2<Integer, List<_A>> HMB(Connection var1, String var2, List<CellQuery> var3, List<CellValue<?>> var4, List<CellOrder> var5, Integer var6, Integer var7, ENE<_A, _T> var8) throws FFK {

        try {
            if (var8 == null) {
                throw FCZ.getInstance().IHG();
            } else {
                synchronized (var2) {
                    int var10 = -1;
                    TableValuesSelect var11 = new TableValuesSelect(null, var2);
                    var11.IJH(new CellQuery("1", "count_", AggregateType.COUNT));
                    var11.IJC(var4);
                    DbUtils.IIO(var1, var11);
                    if (var11.getResults().size() == 1) {
                        CellValue var12 = (CellValue) ((Map) var11.getResults().get(0)).get("count_");
                        if (var12 != null) {
                            var10 = (Integer) var12.getValue();
                        }
                    }

                    TableValuesSelect var26 = new TableValuesSelect(null, var2);
                    var26.IJI(var3);
                    var26.IJC(var4);
                    var26.IJK(var5);
                    DbUtils.IIO(var1, var6, var7, var26);
                    log.debug("count " + var10);
                    ArrayList var13 = new ArrayList();
                    Iterator var14 = var26.getResults().iterator();

                    while (var14.hasNext()) {
                        Map var15 = (Map) var14.next();
                        ArrayList var16 = new ArrayList();
                        var16.addAll(var15.values());
                        ValueContainer1 var17 = var8.HNF(var16);
                        var13.add(var17);
                    }

                    ValueContainer2 var27 = new ValueContainer2(var10, var13);
                    return var27;
                }
            }
        } catch (Exception var24) {
            log.error("Something bad happened", var24);
            throw new FFK(var24);
        }
    }

    private <_A extends ValueContainer1<_T>, _T extends ModelBase> ValueContainer2<Integer, List<_A>> HMC(Connection var1, String var2, String var3, List<CellType> var4, List<CellQuery> var5, List<CellValue<?>> var6, List<Expression> var7, List<CellOrder> var8, Integer var9, Integer var10, ENF<_A, _T> var11) throws FFK {

        try {
            if (var11 == null) {
                throw FCZ.getInstance().IHG();
            } else {
                synchronized (var2) {
                    ArrayList var13 = new ArrayList();
                    var13.add(new CellQuery(CellType.cell_viewQueryId.<CellTyped>getDefinition()));
                    var13.add(new CellQuery(CellType.cell_viewRefType.getDefinition()));
                    var13.add(new CellQuery(CellType.cell_viewRefLevel.getDefinition()));
                    var13.addAll(var5);
                    int var14 = -1;
                    TableValuesSelect var15 = new TableValuesSelect(null, var2);
                    var15.IJH(new CellQuery("1", "count_", AggregateType.COUNT));
                    var15.IJC(var6);
                    var15.IJD(var7);
                    DbUtils.IIO(var1, var15);
                    if (var15.getResults().size() == 1) {
                        CellValue var16 = (CellValue) ((Map) var15.getResults().get(0)).get("count_");
                        if (var16 != null) {
                            var14 = (Integer) var16.getValue();
                        }
                    }

                    log.debug("count " + var14);
                    TableValuesSelect var37 = new TableValuesSelect(null, "query_", var2);
                    var37.IJC(var6);
                    var37.IJD(var7);
                    var37.IJK(var8);
                    TableValuesSelect var17 = new TableValuesSelect(null, "data_", var3);
                    var17.IJI(var13);
                    var17.setJoin("inner join", new CellJoin(CellType.cell_viewQueryId.<CellTyped>getDefinition(), var37, CellType.cell_technical_id.<CellTyped>getDefinition(), Condition.EQUALS));
                    DbUtils.IIO(var1, var9, var10, var37, var17);
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
                                ValueContainer2 var41 = (ValueContainer2) var39.next();
                                ValueContainer1 var42 = var11.HNG(var4, (String) var41.getFirstValue(), (Map) var41.getSecondValue());
                                var38.add(var42);
                            }

                            ValueContainer2 var40 = new ValueContainer2(var14, var38);
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
                            CellValue var27 = (CellValue) var26.next();
                            String var28 = var27.getName();
                            if (CellType.cell_viewQueryId.<CellTyped>getDefinition().getName().equals(var28)) {
                                var23 = (String) var27.getValue();
                            } else if (CellType.cell_viewRefType.getDefinition().getName().equals(var28)) {
                                var24 = (String) var27.getValue();
                            } else if (CellType.cell_viewRefLevel.getDefinition().getName().equals(var28)) {
                                var25 = (Integer) var27.getValue();
                            }
                        }

                        if (!var19.containsKey(var23)) {
                            HashMap var43 = new HashMap();
                            var19.put(var23, var43);
                        }

                        Map var44 = (Map) var19.get(var23);
                        if (EntityName.B_SELECT.equals(var24)) {
                            var18.add(new ValueContainer2(var23, var44));
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
            log.error("Something bad happened", var35);
            throw new FFK(var35);
        }
    }

    private <_A extends ValueContainer1<_T>, _T extends ModelBase> _A HMD(Connection var1, String var2, List<CellQuery> var3, List<CellValue<?>> var4, ENF<_A, _T> var5) throws FFK {

        try {
            if (var5 == null) {
                throw FCZ.getInstance().IHG();
            } else {
                synchronized (var2) {
                    ArrayList var7 = new ArrayList();
                    var7.add(new CellQuery(CellType.cell_viewQueryId.<CellTyped>getDefinition()));
                    var7.add(new CellQuery(CellType.cell_viewRefType.getDefinition()));
                    var7.add(new CellQuery(CellType.cell_viewRefLevel.getDefinition()));
                    if (var3 != null && !var3.isEmpty()) {
                        var7.addAll(var3);
                    } else {
                        log.debug("Query for all columns.");
                        var7.add(new CellQuery("*"));
                    }

                    TableValuesSelect var8 = new TableValuesSelect(null, "data_", var2);
                    var8.IJI(var7);
                    var8.IJC(var4);
                    DbUtils.IIO(var1, var8);
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

                            ValueContainer1 var28 = var5.HNG(null, var10, var9);
                            ValueContainer1 var29 = var28;
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
                            CellValue var18 = (CellValue) var17.next();
                            String var19 = var18.getName();
                            if (CellType.cell_viewQueryId.<CellTyped>getDefinition().getName().equals(var19)) {
                                var14 = (String) var18.getValue();
                            } else if (CellType.cell_viewRefType.getDefinition().getName().equals(var19)) {
                                var15 = (String) var18.getValue();
                            } else if (CellType.cell_viewRefLevel.getDefinition().getName().equals(var19)) {
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
            log.error("Something bad happened", var26);
            throw new FFK(var26);
        }
    }

    public <_T extends BaseUserData> void HME(SqlOperation var1, FFF var2, String var3, _T var4) throws FFK {

        this.HML(var1, var2, var3, EntityName.PREFERENCES, var4);

    }

    private static InvoiceSell getInvoiceFirstParent(Invoice<?> var0) {

        Invoice var1;
        for (var1 = var0; var1.getParentInvoiceOnlyActive() != null; var1 = var1.getParentInvoiceOnlyActive()) {
        }

        InvoiceSell var2 = (InvoiceSell) var1;
        return var2;
    }

    public void ROD(String var1, ParametrizedModel<?> var2) throws FFK {

        ArrayList var3 = new ArrayList();
        ArrayList var4 = new ArrayList();
        var4.add(new CellValue(CellType.cell_technical_id.getDefinition(), var2.getId()));
        Map var5 = var2.getValuesMap();
        Iterator var6 = var5.entrySet().iterator();

        while (var6.hasNext()) {
            Map.Entry var7 = (Map.Entry) var6.next();
            var3.add(new CellValue(CellType.getDefinedCellByName((String) var7.getKey()).getDefinition(), var7.getValue()));
        }

        this.HMT(this.connection, var1, var4, var3);
    }

    public <_T extends Invoice<?>> void HMF(SqlOperation var1, FFF var2, _T var3) throws FFK {

        ArrayList var4 = new ArrayList();
        if (var3.getIssuerNumber() != null && var3.getIssuerNumber().getValue() != null) {
            var4.add(new CellValue(CellType.cell_business_issuer_number.getDefinition(), var3.getIssuerNumber().getValue()));
        }

        if (var3.getRefId() != null && var3.getRefId().getValue() != null) {
            var4.add(new CellValue(CellType.cell_business_refid.getDefinition(), var3.getRefId().getValue()));
        }

        if (var3.getCreationDate() != null && var3.getCreationDate().getValue() != null) {
            var4.add(new CellValue(CellType.cell_business_creationDate.getDefinition(), var3.getCreationDate().getValueDate()));
        }

        Contractor var6;
        label319:
        switch (var3.getInvoiceType()) {
            case SELL:
                if (((a.a.a.c.f.a.e.BaseInvoiceSell) var3).getInvoicingDate() != null && ((a.a.a.c.f.a.e.BaseInvoiceSell) var3).getInvoicingDate().getValue() != null) {
                    var4.add(new CellValue(CellType.cell_business_invoicingDate.getDefinition(), ((a.a.a.c.f.a.e.BaseInvoiceSell) var3).getInvoicingDate().getValueDate()));
                }

                switch (var3.getInvoiceSubType()) {
                    case INVOICE:
                    case AGGREGATE:
                        InvoiceSell var14 = (InvoiceSell) var3;
                        if (var14.getAmountSummaryWithoutTax() != null && var14.getAmountSummaryWithoutTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_netValue.getDefinition(), var14.getAmountSummaryWithoutTax().getValue()));
                        }

                        if (var14.getAmountSummaryWithTax() != null && var14.getAmountSummaryWithTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_grossValue.getDefinition(), var14.getAmountSummaryWithTax().getValue()));
                        }

                        if (var14.getAmountTax() != null && var14.getAmountTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_taxValue.getDefinition(), var14.getAmountTax().getValue()));
                        }

                        if (var3.getTransactionDate() != null && var3.getTransactionDate().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_transactionDate.getDefinition(), var3.getTransactionDate().getValueDate()));
                        }

                        var6 = var14.getContractor();
                        if (var6 != null && var6.getName() != null && var6.getName().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_contractorName.getDefinition(), var6.getName().getValue()));
                            var4.add(new CellValue(CellType.cell_business_contractorNIP.getDefinition(), var6.getNip().getValue()));
                        }
                        break label319;
                    case CORRECTION:
                        InvoiceSellCorrection var13 = (InvoiceSellCorrection) var3;
                        if (var13.getDifferenceAmountSummaryWithoutTax() != null && var13.getDifferenceAmountSummaryWithoutTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_netValue.getDefinition(), var13.getDifferenceAmountSummaryWithoutTax().getValue()));
                        }

                        if (var13.getDifferenceAmountSummaryWithTax() != null && var13.getDifferenceAmountSummaryWithTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_grossValue.getDefinition(), var13.getDifferenceAmountSummaryWithTax().getValue()));
                        }

                        if (var13.getDifferenceAmountTax() != null && var13.getDifferenceAmountTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_taxValue.getDefinition(), var13.getDifferenceAmountTax().getValue()));
                        }

                        InvoiceSell var15 = getInvoiceFirstParent(var3);
                        if (var15.getTransactionDate() != null && var15.getTransactionDate().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_transactionDate.getDefinition(), var15.getTransactionDate().getValueDate()));
                        }

                        Object var7;
                        for (var7 = var13; ((Invoice) var7).getParentInvoiceOnlyActive() != null; var7 = ((Invoice) var7).getParentInvoiceOnlyActive()) {
                        }

                        InvoiceSell var8 = (InvoiceSell) var7;
                        Contractor var9 = var8.getContractor();
                        if (var9 != null && var9.getName() != null && var9.getName().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_contractorName.getDefinition(), var9.getName().getValue()));
                            var4.add(new CellValue(CellType.cell_business_contractorNIP.getDefinition(), var9.getNip().getValue()));
                        }
                        break label319;
                    default:
                        throw new FFK("Unexpected invoice subtype [" + var3.getInvoiceSubType() + "]!");
                }
            case PURCHASE:
                switch (var3.getInvoiceSubType()) {
                    case INVOICE:
                    case AGGREGATE:
                        InvoicePurchase var5 = (InvoicePurchase) var3;
                        if (var5.getInvoicingDate() != null && var5.getInvoicingDate().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_invoicingDate.getDefinition(), var5.getInvoicingDate().getValueDate()));
                        }

                        if (var5.getAmountSummaryWithoutTax() != null && var5.getAmountSummaryWithoutTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_netValue.getDefinition(), var5.getAmountSummaryWithoutTax().getValue()));
                        }

                        if (var5.getAmountSummaryWithTax() != null && var5.getAmountSummaryWithTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_grossValue.getDefinition(), var5.getAmountSummaryWithTax().getValue()));
                        }

                        if (var5.getAmountTax() != null && var5.getAmountTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_taxValue.getDefinition(), var5.getAmountTax().getValue()));
                        }

                        if (var3.getTransactionDate() != null && var3.getTransactionDate().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_transactionDate.getDefinition(), var3.getTransactionDate().getValueDate()));
                        }

                        var6 = var5.getContractor();
                        if (var6 != null && var6.getName() != null && var6.getName().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_contractorName.getDefinition(), var6.getName().getValue()));
                            var4.add(new CellValue(CellType.cell_business_contractorNIP.getDefinition(), var6.getNip().getValue()));
                        }
                        break label319;
                    default:
                        throw new FFK("Unexpected invoice subtype [" + var3.getInvoiceSubType() + "]!");
                }
            default:
                throw new FFK("Unexpected invoice type [" + var3.getInvoiceType() + "]!");
        }

        this.HMN(var1, var2, EntityName.INVOICES, var3, var3.getParentInvoiceWithCanceled(), var3.getInvoiceType().name(), var3.getInvoiceSubType().name(), var4);

    }

    public <_T extends InvoiceOther<?>> void ROE(SqlOperation var1, FFF var2, _T var3) throws FFK {

        ArrayList var4 = new ArrayList();
        if (var3.getIssuerNumber() != null && var3.getIssuerNumber().getValue() != null) {
            var4.add(new CellValue(CellType.cell_business_issuer_number.getDefinition(), var3.getIssuerNumber().getValue()));
        }

        if (var3.getRefId() != null && var3.getRefId().getValue() != null) {
            var4.add(new CellValue(CellType.cell_business_refid.getDefinition(), var3.getRefId().getValue()));
        }

        if (var3.getCreationDate() != null && var3.getCreationDate().getValue() != null) {
            var4.add(new CellValue(CellType.cell_business_creationDate.getDefinition(), var3.getCreationDate().getValueDate()));
        }

        Contractor var6;
        label201:
        switch (var3.getInvoiceOtherType()) {
            case SELL:
                if (((BaseInvoiceSell) var3).getInvoicingDate() != null && ((BaseInvoiceSell) var3).getInvoicingDate().getValue() != null) {
                    var4.add(new CellValue(CellType.cell_business_invoicingDate.getDefinition(), ((BaseInvoiceSell) var3).getInvoicingDate().getValueDate()));
                }

                switch (var3.getInvoiceOtherSubType()) {
                    case SELL_REASON_1:
                    case SELL_REASON_2:
                    case SELL_REASON_3:
                    case SELL_REASON_4:
                        InvoiceOtherSell var10 = (InvoiceOtherSell) var3;
                        if (var10.getAmountSummaryWithoutTax() != null && var10.getAmountSummaryWithoutTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_netValue.getDefinition(), var10.getAmountSummaryWithoutTax().getValue()));
                        }

                        if (var10.getAmountSummaryWithTax() != null && var10.getAmountSummaryWithTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_grossValue.getDefinition(), var10.getAmountSummaryWithTax().getValue()));
                        }

                        if (var10.getAmountTax() != null && var10.getAmountTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_taxValue.getDefinition(), var10.getAmountTax().getValue()));
                        }

                        var6 = var10.getContractor();
                        if (var6 != null && var6.getName() != null && var6.getName().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_contractorName.getDefinition(), var6.getName().getValue()));
                            var4.add(new CellValue(CellType.cell_business_contractorNIP.getDefinition(), var6.getNip().getValue()));
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
                        InvoiceOtherPurchase var5 = (InvoiceOtherPurchase) var3;
                        if (var5.getInvoicingDate() != null && var5.getInvoicingDate().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_invoicingDate.getDefinition(), var5.getInvoicingDate().getValueDate()));
                        }

                        if (var5.getAmountSummaryWithoutTax() != null && var5.getAmountSummaryWithoutTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_netValue.getDefinition(), var5.getAmountSummaryWithoutTax().getValue()));
                        }

                        if (var5.getAmountSummaryWithTax() != null && var5.getAmountSummaryWithTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_grossValue.getDefinition(), var5.getAmountSummaryWithTax().getValue()));
                        }

                        if (var5.getAmountTax() != null && var5.getAmountTax().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_taxValue.getDefinition(), var5.getAmountTax().getValue()));
                        }

                        var6 = var5.getContractor();
                        if (var6 != null && var6.getName() != null && var6.getName().getValue() != null) {
                            var4.add(new CellValue(CellType.cell_business_contractorName.getDefinition(), var6.getName().getValue()));
                            var4.add(new CellValue(CellType.cell_business_contractorNIP.getDefinition(), var6.getNip().getValue()));
                        }
                        break label201;
                    default:
                        throw new FFK("Unexpected invoice other subtype [" + var3.getInvoiceOtherSubType() + "]!");
                }
            default:
                throw new FFK("Unexpected invoice other type [" + var3.getInvoiceOtherType() + "]!");
        }

        this.HMN(var1, var2, EntityName.INVOICESOTHER, var3, var3.getParentInvoiceWithCanceled(), var3.getInvoiceOtherType().name(), var3.getInvoiceOtherSubType().name(), var4);

    }

    public <_T extends ReceiptRecord> void HMG(SqlOperation var1, FFF var2, _T var3) throws FFK {

        this.HMN(var1, var2, EntityName.RECEIPTRECORDS, var3, (ModelBusinessPeriodElement) null, var3.getReceiptRecordType().name(), null, null);

    }

    public <_T extends Settlement> void HMH(SqlOperation var1, FFF var2, _T var3, _T var4) throws FFK {

        ArrayList var5 = new ArrayList();
        var5.add(new CellValue(CellType.cell_business_documentIndex.getDefinition(), var3.FJI().getValue()));
        this.HMN(var1, var2, EntityName.SETTLEMENTS, var3, var4, var3.getSettlementType().name(), null, var5);

    }

    public <_T extends Declaration, _Q extends Settlement> void HMI(SqlOperation var1, FFF var2, _T var3, _Q var4) throws FFK {

        ArrayList var5 = new ArrayList();
        var5.add(new CellValue(CellType.cell_business_documentIndex.getDefinition(), var3.FJI().getValue()));
        if (var4 != null) {
            var5.add(new CellValue(CellType.cell_technical_settlementid.getDefinition(), var4.getId()));
        }

        var5.add(new CellValue(CellType.cell_business_documentIndex.getDefinition(), var3.FJI().getValue()));
        this.HMN(var1, var2, EntityName.DECLARATIONS, var3, (ModelBusinessPeriodElement) null, var3.getDeclarationType().name(), var3.getDeclarationSubType().name(), var5);

    }

    public <_T extends InvoiceRecord, _Q extends Settlement> void HMJ(SqlOperation var1, FFF var2, _T var3, _Q var4) throws FFK {

        ArrayList var5 = new ArrayList();
        var5.add(new CellValue(CellType.cell_business_documentIndex.getDefinition(), var3.FJI().getValue()));
        if (var4 != null) {
            var5.add(new CellValue(CellType.cell_technical_settlementid.getDefinition(), var4.getId()));
        }

        this.HMN(var1, var2, EntityName.INVOICERECORDS, var3, (ModelBusinessPeriodElement) null, var3.getInvoiceRecordType().name(), null, var5);

    }

    public <_T extends Contractor> void HMK(SqlOperation var1, FFF var2, Contractor var3) throws FFK {

        ArrayList var4 = new ArrayList();
        this.HMM(var1, var2, EntityName.CONTACTS, var3, null, var3.getType(), null, var4);

    }

    private <_T extends BaseUserData> void HML(SqlOperation var1, FFF var2, String var3, String var4, _T var5) throws FFK {

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
        var7.add(new CellValue(CellType.cell_technical_username.getDefinition(), var3));
        var7.add(new CellValue(CellType.cell_technical_typeclass.getDefinition(), var5.getClass().getName()));
        ArrayList var8 = new ArrayList();
        switch (var1) {
            case insert:
                var8.add(new CellValue(CellType.cell_business_version.getDefinition(), var6));
                break;
            case update:
            case delete:
                var7.add(new CellValue(CellType.cell_business_version.getDefinition(), var6));
                break;
            default:
                throw new FFK("Unsupported action type [" + var1 + "]!");
        }

        this.HMO(this.profilesConnection, var1, var2, var4, var7, var8, this.HKZ(var5));

    }

    private <_T extends ModelBusinessTopElement> void HMM(SqlOperation var1, FFF var2, String var3, Contractor var4, _T var5, String var6, String var7, List<CellValue<?>> var8) throws FFK {

        if (var4 == null) {
            throw new FFK("Contractor cannot be NULL!");
        }

        ArrayList var9 = new ArrayList();
        ArrayList var10 = new ArrayList();
        var9.add(new CellValue(CellType.cell_technical_id.getDefinition(), var4.getId()));
        Contractor var11 = var4.AICD();
        if (var11.DAI().getValue() == null) {
            throw new FFK("Name of Contractor cannot be NULL!");
        }

        var10.add(new CellValue(CellType.cell_business_contractorName.getDefinition(), var11.DAI().getValue()));
        if (var11.DAJ().getValue().length() == 10) {
            var10.add(new CellValue(CellType.cell_business_contractorNIP.getDefinition(), var11.DAJ().getValue()));
        } else {
            var10.add(new CellValue(CellType.cell_business_contractorNIP.getDefinition(), null));
        }

        var10.add(new CellValue(CellType.cell_technical_type.getDefinition(), var6));
        var10.add(new CellValue(CellType.cell_technical_subType.getDefinition(), var7));
        var10.add(new CellValue(CellType.cell_technical_typeclass.getDefinition(), var4.getClass().getName()));
        if (var5 != null) {
            var10.add(new CellValue(CellType.cell_technical_parentid.getDefinition(), var5.getId()));
        }

        if (var8 != null) {
            var10.addAll(var8);
        }

        var10.add(new CellValue(CellType.cell_business_hash.getDefinition(), var4.QON()));
        this.HMO(this.connection, var1, var2, var3, var9, var10, this.HKZ(var4));

    }

    private <_T extends ModelBusinessPeriodElement> void HMN(SqlOperation var1, FFF var2, String var3, _T var4, _T var5, String var6, String var7, List<CellValue<?>> var8) throws FFK {

        ArrayList var9 = new ArrayList();
        var9.add(new CellValue(CellType.cell_technical_id.getDefinition(), var4.getId()));
        ArrayList var10 = new ArrayList();
        if (var4.getPeriod() != null) {
            Period var11 = var4.getPeriod().DDN();
            if (var11.DDJ().getValue() == null) {
                throw new FFK("Period year cannot be NULL!");
            } else {
                var10.add(new CellValue(CellType.cell_business_periodYear.getDefinition(), var11.DDJ().getValue()));
                if (var11.DDK().getValue() != null) {
                    var10.add(new CellValue(CellType.cell_business_periodMonth.getDefinition(), var11.DDK().getValue()));
                    var10.add(new CellValue(CellType.cell_technical_type.getDefinition(), var6));
                    var10.add(new CellValue(CellType.cell_technical_subType.getDefinition(), var7));
                    var10.add(new CellValue(CellType.cell_technical_typeclass.getDefinition(), var4.getClass().getName()));
                    if (var5 != null) {
                        var10.add(new CellValue(CellType.cell_technical_parentid.getDefinition(), var5.getId()));
                    }

                    if (var8 != null) {
                        var10.addAll(var8);
                    }

                    this.HMO(this.connection, var1, var2, var3, var9, var10, this.HKZ(var4));
                } else {
                    throw new FFK("Period month cannot be NULL!");
                }
            }
        } else {
            throw new FFK("Period cannot be NULL!");
        }
    }

    private void HMO(Connection var1, SqlOperation var2, FFF var3, String var4, List<CellValue<?>> var5, List<CellValue<?>> var6, byte[] var7) throws FFK {

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
                    var12.add(new CellValue(CellType.cell_technical_encrypted.getDefinition(), Short.valueOf(var8)));
                    var12.add(new CellValue(CellType.cell_technical_salt.getDefinition(), var9));
                    var12.add(new CellValue(CellType.cell_technical_iv.getDefinition(), var10));
                    var12.add(new CellValue(CellType.cell_technical_body.getDefinition(), var11));
                case delete:
                    switch (var2) {
                        case insert:
                            var12.add(new CellValue(CellType.cell_technical_version.getDefinition(), this.FIR));
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
            log.error("Something bad happened", var16);
            throw new FFK(var16);
        }
    }

    public <_T extends Dictionary> void HMP(SqlOperation var1, _T var2) throws FFK {

        if (var2.IYW().getValue() == null || var2.IYX().getValue() == null) {
            throw new FFK("DictionaryName and dictionaryEntryName must be set!");
        }

        String var3 = var2.IYW().getValue().toUpperCase();
        String var4 = var2.IYX().getValue().toUpperCase();
        ArrayList var5 = new ArrayList();
        ArrayList var6 = new ArrayList();
        switch (var1) {
            case insert:
                var5.add(new CellValue(CellType.cell_technical_version.getDefinition(), this.FIR));
            case update:
                byte[] var7 = this.HKZ(var2);
                var5.add(new CellValue(CellType.cell_business_dictionaryName.getDefinition(), var3));
                var5.add(new CellValue(CellType.cell_business_dictionaryEntry.getDefinition(), var4));
                var5.add(new CellValue(CellType.cell_technical_typeclass.getDefinition(), var2.getClass().getName()));
                var5.add(new CellValue(CellType.cell_technical_body.getDefinition(), var7));
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
                var6.add(new CellValue(CellType.cell_business_dictionaryName.getDefinition(), var3));
                var6.add(new CellValue(CellType.cell_business_dictionaryEntry.getDefinition(), var4));
                break;
            default:
                throw new FFK("Unsupported action type [" + var1 + "]!");
        }

        switch (var1) {
            case insert:
                this.HMS(this.connection, EntityName.DICTIONARIES, var6, var5);
                break;
            case update:
                this.HMT(this.connection, EntityName.DICTIONARIES, var6, var5);
                break;
            case delete:
                this.HMU(this.connection, EntityName.DICTIONARIES, var6);
                break;
            default:
                throw new FFK("Unsupported action type [" + var1 + "]!");
        }

    }

    public <_T extends Dictionary> List<_T> HMQ(String var1, String var2) throws FFK {

        ArrayList var23;
        try {
            if (var1 == null || var2 == null || var2.length() <= 0) {
                throw new FFK("DictionaryName and dictionaryQueryString must be set!");
            }

            String var3 = var1.toUpperCase();
            String var4 = var2.toUpperCase();
            TableValuesSelect var5 = new TableValuesSelect(null, EntityName.DICTIONARIES);
            var5.IJH(new CellQuery(CellType.cell_technical_typeclass.<CellTyped>getDefinition()));
            var5.IJH(new CellQuery(CellType.cell_technical_body.<CellTyped>getDefinition()));
            var5.IJA(new CellValue(CellType.cell_business_dictionaryName.getDefinition(), var3));
            var5.IJA(new CellValue(CellType.cell_business_dictionaryEntry.getDefinition(), "%" + var4 + "%", Condition.LIKE));
            String var6 = EntityName.DICTIONARIES;

            synchronized (EntityName.DICTIONARIES) {

                DbUtils.IIO(this.connection, var5);
                ArrayList var7 = new ArrayList();
                Iterator var8 = var5.getResults().iterator();

                while (var8.hasNext()) {
                    Map var9 = (Map) var8.next();
                    Class var10 = null;
                    byte[] var11 = null;
                    Iterator var12 = var9.values().iterator();

                    while (var12.hasNext()) {
                        CellValue var13 = (CellValue) var12.next();
                        String var14 = var13.getName();
                        if (CellType.cell_technical_typeclass.<CellTyped>getDefinition().getName().equals(var14)) {
                            var10 = Class.forName((String) var13.getValue());
                        } else if (CellType.cell_technical_body.<CellTyped>getDefinition().getName().equals(var14)) {
                            var11 = (byte[]) var13.getValue();
                        }
                    }

                    if (var11 != null) {
                        Dictionary var24 = (Dictionary) this.HLA(var11, var10);
                        var7.add(var24);
                    }
                }

                var23 = var7;
            }
        } catch (ClassNotFoundException | SQLException var21) {
            log.error("Something bad happened", var21);
            throw new FFK(var21);
        }

        return var23;
    }

    private <_T extends ModelBase> void HMR(Connection var1, String var2, Map<String, CellValue<?>> var3) throws FFK {

        try {
            TableValuesInsert var4 = new TableValuesInsert(null, var2);
            var4.IJN(new ArrayList(var3.values()));
            var4.IJO(var3);
            synchronized (var1) {
                DbUtils.IIL(var1, var4);
            }
        } catch (SQLException var12) {
            log.error("Something bad happened", var12);
            throw new FFK(var12);
        }

    }

    private <_T extends ModelBase> void HMS(Connection var1, String var2, List<CellValue<?>> var3, List<CellValue<?>> var4) throws FFK {

        try {
            ArrayList var5 = new ArrayList();
            var5.addAll(var3);
            var5.addAll(var4);
            TableValuesInsert var6 = new TableValuesInsert(null, var2);
            var6.IJN(var5);
            var6.IJO(var5);
            synchronized (var1) {
                DbUtils.IIL(var1, var6);
            }
        } catch (SQLException var14) {
            log.error("Something bad happened", var14);
            throw new FFK(var14);
        }

    }

    private <_T extends ModelBase> void HMT(Connection var1, String var2, List<CellValue<?>> var3, List<CellValue<?>> var4) throws FFK {

        try {
            TableValuesUpdate var5 = new TableValuesUpdate(null, var2);
            var5.IJQ(var4);
            var5.IJC(var3);
            synchronized (var1) {
                DbUtils.IIM(var1, var5);
            }
        } catch (SQLException var13) {
            log.error("Something bad happened", var13);
            throw new FFK(var13);
        }

    }

    private <_T extends ModelBase> void HMU(Connection var1, String var2, List<CellValue<?>> var3) throws FFK {

        try {
            TableValuesDelete var4 = new TableValuesDelete(null, var2);
            var4.IJC(var3);
            synchronized (var1) {
                DbUtils.IIN(var1, var4);
            }
        } catch (SQLException var12) {
            log.error("Something bad happened", var12);
            throw new FFK(var12);
        }

    }

    private int QPZ(int var1) {
        return (var1 - 1) / 3 + 1;
    }

    private int QQA(int var1) {
        return (var1 - 1) / 6 + 1;
    }

    public Integer getSequenceValue(Period var1, String var2) throws FFK {

        Integer var26;
        try {
            if (var1 == null || var2 == null || var2.length() <= 0) {
                throw new FFK("Period and sequenceName cannot be empty!");
            }

            Period var3 = var1.DDN();
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

            TableValuesSelect var7 = new TableValuesSelect(null, EntityName.SEQUENCES);
            var7.IJH(new CellQuery(CellType.cell_business_numeric_value.<CellTyped>getDefinition()));
            var7.IJA(new CellValue(CellType.cell_business_periodYear.getDefinition(), var21));
            var7.IJA(new CellValue(CellType.cell_business_periodMonth.getDefinition(), var22));
            var7.IJA(new CellValue(CellType.cell_technical_type.getDefinition(), var2));
            synchronized (this.connection) {
                DbUtils.IIO(this.connection, var7);
                Object var9 = null;
                Integer var24;
                if (var7.getResults().size() == 0) {
                    var24 = Integer.valueOf(1);
                    TableValuesInsert var10 = new TableValuesInsert(null, EntityName.SEQUENCES);
                    var10.IJM(CellType.cell_business_periodYear.<CellTyped>getDefinition());
                    var10.IJM(CellType.cell_business_periodMonth.<CellTyped>getDefinition());
                    var10.IJM(CellType.cell_technical_type.<CellTyped>getDefinition());
                    var10.IJM(CellType.cell_business_numeric_value.<CellTyped>getDefinition());
                    var10.IJO(new CellValue[]{new CellValue(CellType.cell_business_periodYear.getDefinition(), var21), new CellValue(CellType.cell_business_periodMonth.getDefinition(), var22), new CellValue(CellType.cell_technical_type.getDefinition(), var2), new CellValue(CellType.cell_business_numeric_value.getDefinition(), var24)});
                    DbUtils.IIL(this.connection, var10);
                } else {
                    if (var7.getResults().size() != 1) {
                        throw new FFK("Sequence duplicate! [" + var1 + "] [sequenceName " + var2 + "]");
                    }

                    var26 = null;

                    Collection<CellValue> values = ((Map) var7.getResults().get(0)).values();
                    for (CellValue var12 : values) {
                        if (CellType.cell_business_numeric_value.<CellTyped>getDefinition().getName().equals(var12.getName())) {
                            var26 = (Integer) var12.getValue();
                        }
                    }

                    var24 = var26 + 1;
                    TableValuesUpdate var27 = new TableValuesUpdate(null, EntityName.SEQUENCES);
                    var27.IJQ(new CellValue[]{new CellValue(CellType.cell_business_numeric_value.getDefinition(), var24)});
                    var27.IJC(new CellConditioned[]{new CellValue(CellType.cell_business_periodYear.getDefinition(), var21), new CellValue(CellType.cell_business_periodMonth.getDefinition(), var22), new CellValue(CellType.cell_technical_type.getDefinition(), var2)});
                    DbUtils.IIM(this.connection, var27);
                }

                var26 = var24;
            }
        } catch (SQLException var19) {
            log.error("Something bad happened", var19);
            throw new FFK(var19);
        }

        return var26;
    }

    public Map<String, Map<Period, Integer>> getSequences() throws FFK {

        try {
            TableValuesSelect var1 = new TableValuesSelect(null, EntityName.SEQUENCES);
            var1.IJH(new CellQuery(CellType.cell_business_numeric_value.<CellTyped>getDefinition()));
            var1.IJH(new CellQuery(CellType.cell_business_periodYear.<CellTyped>getDefinition()));
            var1.IJH(new CellQuery(CellType.cell_business_periodMonth.<CellTyped>getDefinition()));
            var1.IJH(new CellQuery(CellType.cell_technical_type.<CellTyped>getDefinition()));
            HashMap var2 = new HashMap();
            synchronized (this.connection) {
                DbUtils.IIO(this.connection, var1);
                Iterator var4 = var1.getResults().iterator();

                while (var4.hasNext()) {
                    Map var5 = (Map) var4.next();
                    Integer var6 = null;
                    Integer var7 = null;
                    Integer var8 = null;
                    String var9 = null;
                    Iterator var10 = var5.values().iterator();

                    while (var10.hasNext()) {
                        CellValue var11 = (CellValue) var10.next();
                        if (CellType.cell_business_numeric_value.<CellTyped>getDefinition().getName().equals(var11.getName())) {
                            var6 = (Integer) var11.getValue();
                        } else if (CellType.cell_business_periodYear.<CellTyped>getDefinition().getName().equals(var11.getName())) {
                            var7 = (Integer) var11.getValue();
                        } else if (CellType.cell_business_periodMonth.<CellTyped>getDefinition().getName().equals(var11.getName())) {
                            var8 = (Integer) var11.getValue();
                        } else if (CellType.cell_technical_type.<CellTyped>getDefinition().getName().equals(var11.getName())) {
                            var9 = (String) var11.getValue();
                        }
                    }

                    if (!var2.containsKey(var9)) {
                        var2.put(var9, new HashMap());
                    }

                    Map var20 = (Map) var2.get(var9);
                    var20.put(new Period(var7, var8), var6);
                }

                HashMap var21 = var2;
                return var21;
            }
        } catch (SQLException var18) {
            log.error("Something bad happened", var18);
            throw new FFK(var18);
        }
    }

    public void ROF(Period var1, String var2, Integer var3, Integer var4) throws FFK {

        try {
            if (var1 == null || var2 == null || var2.length() <= 0 || var3 == null || var4 == null) {
                throw new FFK("Period, sequenceName and numericValue cannot be empty!");
            }

            TableValuesUpdate var5 = new TableValuesUpdate(null, EntityName.SEQUENCES);
            var5.IJQ(new CellValue[]{new CellValue(CellType.cell_business_numeric_value.getDefinition(), var4)});
            var5.IJC(new CellConditioned[]{new CellValue(CellType.cell_business_periodYear.getDefinition(), var1.DDJ().getValue()), new CellValue(CellType.cell_business_periodMonth.getDefinition(), var1.DDK().getValue()), new CellValue(CellType.cell_technical_type.getDefinition(), var2), new CellValue(CellType.cell_business_numeric_value.getDefinition(), var3)});
            DbUtils.IIM(this.connection, var5);
        } catch (SQLException var9) {
            log.error("Something bad happened", var9);
            throw new FFK(var9);
        }

    }

    public Integer getMaxDocumentIndex_Settlements(Period var1, SettlementType var2) throws FFK {

        Integer var3;
        var3 = this.getMaxDocumentIndex(var1, var2, null, EntityName.SETTLEMENTS);

        return var3;
    }

    public Integer getMaxDocumentIndex_InvoiceRecords(Period var1, InvoiceRecordType var2) throws FFK {

        Integer var3;
        var3 = this.getMaxDocumentIndex(var1, var2, null, EntityName.INVOICERECORDS);

        return var3;
    }

    public Integer getMaxDocumentIndex_Declarations(Period var1, DeclarationType var2, DeclarationSubtype var3) throws FFK {

        Integer var4;
        var4 = this.getMaxDocumentIndex(var1, var2, var3, EntityName.DECLARATIONS);

        return var4;
    }

    private Integer getMaxDocumentIndex(Period var1, Enum<?> var2, Enum<?> var3, String var4) throws FFK {

        try {
            TableValuesSelect var8;
            label140:
            {
                if (var1 != null) {
                    Period var5 = var1.DDN();
                    Integer var6 = null;
                    Integer var7 = null;
                    if (var5.DDJ().getValue() == null) {
                        throw new FFK("Period year cannot be NULL!");
                    }

                    var6 = var5.DDJ().getValue();
                    if (var5.DDK().getValue() != null) {
                        var7 = var5.DDK().getValue();
                        var8 = new TableValuesSelect(null, var4);
                        var8.IJH(new CellQuery(CellType.cell_business_documentIndex.<CellTyped>getDefinition(), "documentIndex", AggregateType.COALESCE_0_MAX_PLUS_1));
                        var8.IJA(new CellValue(CellType.cell_business_periodYear.getDefinition(), var6));
                        var8.IJA(new CellValue(CellType.cell_business_periodMonth.getDefinition(), var7));
                        String var9 = var2 != null ? var2.name() : null;
                        if (var9 != null) {
                            var8.IJA(new CellValue(CellType.cell_technical_type.getDefinition(), var9));
                        }
                        break label140;
                    }

                    throw new FFK("Period month cannot be NULL!");
                }

                throw new FFK("Period year cannot be NULL!");
            }

            String var10 = var3 != null ? var3.name() : null;
            if (var10 != null) {
                var8.IJA(new CellValue(CellType.cell_technical_subType.getDefinition(), var10));
            }

            synchronized (var4) {
                DbUtils.IIO(this.connection, var8);
                Object var12 = null;
                if (var8.getResults().size() != 1) {
                    throw new FFK("DocumentIndex duplicate! [" + var1 + "] [type " + var2 + "] [subType " + var3 + "] [tableName " + var4 + "]");
                } else {
                    Integer var13 = null;
                    Iterator var14 = ((Map) var8.getResults().get(0)).values().iterator();

                    while (true) {
                        if (var14.hasNext()) {
                            CellValue var15 = (CellValue) var14.next();
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
            log.error("Something bad happened", var22);
            throw new FFK(var22);
        }
    }

    protected void finalize() throws Throwable {

        this.HMV();
        super.finalize();

    }

    protected void HMV() throws Throwable {

        if (this.profilesConnection != null && !this.profilesConnection.isClosed()) {
            this.profilesConnection.rollback();
            this.profilesConnection.close();
        }

        if (this.connection != null && !this.connection.isClosed()) {
            this.connection.rollback();
            this.connection.close();
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
                    String var5 = (new SimpleDateFormat(DateFormat.yyyy_MM_dd_HH_mm_ss.getValue())).format(new Date());
                    var4.renameTo(new File(var3.replace(var1, var1 + "_" + var5)));
                }
            }
        } catch (Exception var6) {
            log.error("Something bad happened", var6);
        }

    }

    public String HMX(String var1) {
        File var2 = Application.getHomeDir().toFile();
        String var3 = var1 + POSTFIX_OLD;
        File var4 = new File(var2.getAbsolutePath() + "/" + var3 + DbUtils.DB_FILE_EXT);
        return var4.exists() ? var4.getAbsolutePath() : null;
    }

    public boolean QQC(File var1, FFF var2, String var3) throws ClassNotFoundException, SQLException, InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, InvalidKeySpecException, FFK, IOException {
        Connection var4 = null;

        boolean var16;
        try {
            ArrayList var5 = new ArrayList();
            String var6 = EntityName.PREFERENCES;
            TableValuesSelect var7 = new TableValuesSelect(null, var6);
            var4 = this.QQD(var1, EntityName.PROFILES);
            var4.setAutoCommit(false);
            DbUtils.IIO(var4, var7);
            boolean var8 = false;
            Iterator var9 = var7.getResults().iterator();

            while (var9.hasNext()) {
                Map var10 = (Map) var9.next();
                if (var10.containsKey(CellType.cell_technical_username.<CellTyped>getDefinition().getName()) && ((CellValue) var10.get(CellType.cell_technical_username.<CellTyped>getDefinition().getName())).getValue().equals(var3)) {
                    var8 = true;
                    break;
                }
            }

            if (!var8) {
                boolean var15 = false;
                return var15;
            }

            var5.add(new CellValue(CellType.cell_technical_username.getDefinition(), var3));
            this.HMU(this.profilesConnection, EntityName.USERS, var5);
            this.HMU(this.profilesConnection, var6, var5);
            Connection var14 = this.profilesConnection;
            this.profilesConnection = var4;
            this.QPR(var2, null, var3, var6, var7, var14, true);
            this.profilesConnection = var14;
            var16 = true;
        } finally {
            if (var4 != null) {
                var4.close();
            }

        }

        return var16;
    }

    public Connection QQD(File var1, String var2) throws ClassNotFoundException, SQLException {
        Connection var3 = DbUtils.getConnection(var1, var2 + DbUtils.DB_FILE_EXT);
        var3.setAutoCommit(false);
        return var3;
    }
}
