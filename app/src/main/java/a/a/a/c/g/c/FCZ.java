package a.a.a.c.g.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.SqlStatements;
import com.github.bademux.emk.utils.LocaleUtils;
import org.xml.sax.SAXParseException;

import java.io.File;
import java.util.ResourceBundle;
import java.util.regex.Matcher;

public class FCZ {
    private static volatile FCZ HBK;
    private final ResourceBundle HBL;

    public static FCZ getInstance() {
        if (HBK == null) {
            synchronized (FCZ.class) {
                if (HBK == null) {
                    HBK = new FCZ();
                }
            }
        }

        return HBK;
    }

    public FCZ() {

        this.HBL = ResourceBundle.getBundle("messages/exceptions", LocaleUtils.LOCALE);

    }

    public FFO QNY() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.exceedednumberofusers"));

        return var1;
    }

    public FFO IGZ() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.invalidusernamelength"));

        return var1;
    }

    public FFO IHA() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.invalidusernameorpassword"));

        return var1;
    }

    public FFO IHB(String var1, String var2) {

        FFO var3;
        var3 = new FFO(this.HBL.getString("micro.exception.passwordcontainsbadcharacters").replaceFirst("##INVALIDCHARS##", Matcher.quoteReplacement(var1)).replaceFirst("##ALLOWEDCHARS##", Matcher.quoteReplacement(var2)));

        return var3;
    }

    public FFO IHC() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.userdoesexist"));

        return var1;
    }

    public FFK IHD() {

        FFK var1;
        var1 = new FFK(this.HBL.getString("micro.controller.exception.parentandprimarystage"));

        return var1;
    }

    public FFK IHE(String var1) {

        FFK var2;
        var2 = new FFK(this.HBL.getString("micro.controller.exception.invalidormissingscene").replaceFirst("##SCENE##", Matcher.quoteReplacement(var1)));

        return var2;
    }

    public FFK IHF() {

        FFK var1;
        var1 = new FFK(this.HBL.getString("micro.controller.exception.invalidormissingcontroller"));

        return var1;
    }

    public FFK IHG() {

        FFK var1;
        var1 = new FFK(this.HBL.getString("micro.exception.emptyconfiguration"));

        return var1;
    }

    public FFK IHH(String var1, String var2) {

        FFK var3;
        var3 = new FFK(this.HBL.getString("micro.exception.invalidtransition").replaceFirst("##FROM##", Matcher.quoteReplacement(var1)).replaceFirst("##TO##", Matcher.quoteReplacement(var2)));

        return var3;
    }

    public FFK IHI(File var1) {

        FFK var3;
        String var2 = var1 != null ? var1.getAbsolutePath() : "";
        var3 = new FFK(this.HBL.getString("micro.exception.FileNotFound").replaceFirst("##FILEPATH##", Matcher.quoteReplacement(var2)));

        return var3;
    }

    public FFK IHJ() {

        FFK var1;
        var1 = new FFK(this.HBL.getString("micro.exception.ImplementationNull"));

        return var1;
    }

    public FFK IHK() {

        FFK var1;
        var1 = new FFK(this.HBL.getString("micro.exception.CorrectionInvoiceNotFound"));

        return var1;
    }

    public FFK IHL() {

        FFK var1;
        var1 = new FFK(this.HBL.getString("micro.exception.PrintError"));

        return var1;
    }

    public FFK createMicroTechnicalException_reflection_get_value_error() {

        FFK var1;
        var1 = new FFK(this.HBL.getString("micro.exception.ReflectionGetValueError"));

        return var1;
    }

    public FFK IHM() {

        FFK var1;
        var1 = new FFK(this.HBL.getString("micro.exception.NullInvoice"));

        return var1;
    }

    public FFO IHN() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.InvoiceDoesntHaveParent"));

        return var1;
    }

    public FFO IHO() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.InvoiceValidationFailed"));

        return var1;
    }

    public FFI IHP() {

        FFI var1;
        var1 = new FFI(this.HBL.getString("micro.general.exception.pin.missing"));

        return var1;
    }

    public FFO IHQ() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.general.exception.pin.invalid"));

        return var1;
    }

    public FFO IHR(String var1, String var2) {

        FFO var3;
        var3 = new FFO(this.HBL.getString("micro.sign.pz.exception.sizeExceeded.sum").replaceFirst("##MAXSIZE##", Matcher.quoteReplacement(var1)).replaceFirst("##CURRENTSIZE##", Matcher.quoteReplacement(var2)));

        return var3;
    }

    public FFO IHS(String var1, String var2, String var3) {

        FFO var4;
        var4 = new FFO(this.HBL.getString("micro.sign.pz.exception.sizeExceeded.single").replaceFirst("##MAXSIZE##", Matcher.quoteReplacement(var1)).replaceFirst("##CURRENTSIZE##", Matcher.quoteReplacement(var2)).replaceFirst("##FILENAME##", Matcher.quoteReplacement(var3)));

        return var4;
    }

    public FFO MXK(String var1, String var2, String var3) {

        FFO var4;
        var4 = new FFO(this.HBL.getString("micro.sign.kd.exception.sizeExceeded.single").replaceFirst("##MAXSIZE##", Matcher.quoteReplacement(var1)).replaceFirst("##CURRENTSIZE##", Matcher.quoteReplacement(var2)).replaceFirst("##FILENAME##", Matcher.quoteReplacement(var3)));

        return var4;
    }

    public FFO IHT() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.missingpkcs11library"));

        return var1;
    }

    public FFO IHU() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.notvalidpkcs11driver"));

        return var1;
    }

    public FFO IHV(String var1, String var2) {

        FFO var3;
        var3 = new FFO(this.HBL.getString("micro.convert.exception.badinput").replaceFirst("##REQUIRED##", Matcher.quoteReplacement(var1)).replaceFirst("##PROVIDED##", Matcher.quoteReplacement(var2)));

        return var3;
    }

    public FFO IHW(int var1, Throwable var2) {

        FFO var3;
        var3 = new FFO(this.HBL.getString("micro.convert.exception.processing").replaceFirst("##LINENUMBER##", Matcher.quoteReplacement(String.valueOf(var1))) + " " + var2.getLocalizedMessage(), var2);

        return var3;
    }

    public FFO IHX(String var1) {

        FFO var2;
        var2 = new FFO(this.HBL.getString("micro.convert.exception.init").replaceFirst("##SCHEMANAME##", Matcher.quoteReplacement(var1)));

        return var2;
    }

    public FFO IHY() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.controller.exception.invalidcsvfilejpk.missing.columns"));

        return var1;
    }

    public FFO IHZ(String var1) {

        FFO var2;
        var2 = new FFO(this.HBL.getString("micro.controller.exception.invalidcsvfilejpk").replaceFirst("##DETAILS##", Matcher.quoteReplacement(var1)));

        return var2;
    }

    public FFO IIA(String var1) {

        FFO var2;
        var2 = new FFO(this.HBL.getString("micro.controller.exception.invalidxmlfilejpk").replaceFirst("##DETAILS##", Matcher.quoteReplacement(var1)));

        return var2;
    }

    public SAXParseException IIB(int var1) {

        SAXParseException var2;
        var2 = new SAXParseException(this.HBL.getString("micro.parse.exception.expectedelementnotfound").replaceFirst("##NUMOFNODES##", Matcher.quoteReplacement(String.valueOf(var1))), null);

        return var2;
    }

    public SAXParseException IIC(String var1) {

        SAXParseException var2;
        var2 = new SAXParseException(this.HBL.getString("micro.parse.exception.unexpectedelement").replaceFirst("##ELEMENTNAME##", Matcher.quoteReplacement(var1)), null);

        return var2;
    }

    public SAXParseException IID() {

        SAXParseException var1;
        var1 = new SAXParseException(this.HBL.getString("micro.parse.exception.missingtns"), null);

        return var1;
    }

    public SAXParseException IIE(String var1) {

        SAXParseException var2;
        var2 = new SAXParseException(this.HBL.getString("micro.parse.exception.other").replaceFirst("##EXCEPTION##", Matcher.quoteReplacement(var1)), null);

        return var2;
    }

    public FFO QGS() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.NetworkErrorCheckJPKState"));

        return var1;
    }

    public FFK QIS() {

        FFK var1;
        var1 = new FFK(this.HBL.getString("micro.exception.ConcurrentTask"));

        return var1;
    }

    public FFK QIT(String var1, String var2, String var3) {

        FFK var6;
        String var4 = "";
        short var5 = 200;
        if (var3 != null) {
            if (var3.length() > var5) {
                var4 = var3.substring(0, var5);
            } else {
                var4 = var3;
            }
        }

        var6 = new FFK(this.HBL.getString("micro.databasemanager.poisondata.exception").replaceFirst(SqlStatements.TABLE_NAME_PLACEHOLDER, Matcher.quoteReplacement(var1)).replaceFirst("##TABLE_ID##", Matcher.quoteReplacement(var2)).replaceFirst("##REASON##", Matcher.quoteReplacement(var4)));

        return var6;
    }

    public FFK QNZ() {

        FFK var1;
        var1 = new FFK(this.HBL.getString("micro.exception.ParameterNull"));

        return var1;
    }

    public FFO QOA() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.CantCancelOtherThanNormalInvoice"));

        return var1;
    }

    public FFO createMicroBusinessException_cant_cancel_settled_invoice() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.CantCancelSettledInvoice"));

        return var1;
    }

    public FFO QOB() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.CantCancelCanceledInvoice"));

        return var1;
    }

    public FFO QOC() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.CantCancelInvoiceWithChildren"));

        return var1;
    }

    public FFO createMicroBusinessException_cant_delete_settled_invoice() {

        FFO var1;
        var1 = new FFO(this.HBL.getString("micro.exception.CantDeleteSettledInvoice"));

        return var1;
    }

    public FFI RHM() {

        FFI var1;
        var1 = new FFI(this.HBL.getString("micro.exception.restoreDatabase.invalidBackupFile"));

        return var1;
    }

    public FFI RHN() {

        FFI var1;
        var1 = new FFI(this.HBL.getString("micro.exception.restoreDatabase.restoreDatabaseWrongUsername"));

        return var1;
    }

    public FFI RHO() {

        FFI var1;
        var1 = new FFI(this.HBL.getString("micro.exception.restoreDatabase.restoreDatabaseFailure"));

        return var1;
    }
}
