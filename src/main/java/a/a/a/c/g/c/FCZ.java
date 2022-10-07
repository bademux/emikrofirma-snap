package a.a.a.c.g.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.e.a.j.EXC;
import a.a.a.c.e.a.j.EXD;
import a.a.a.c.e.a.k.a.EXF;
import org.xml.sax.Locator;
import org.xml.sax.SAXParseException;

import java.io.File;
import java.util.ResourceBundle;
import java.util.regex.Matcher;

public class FCZ {
    private static volatile FCZ HBK;
    private final ResourceBundle HBL;

    public static FCZ getInstance() {
        if (HBK == null) {
            Class var0 = FCZ.class;
            synchronized (FCZ.class) {
                if (HBK == null) {
                    HBK = new FCZ();
                }
            }
        }

        return HBK;
    }

    public FCZ() {
        EXF.getInstance().ICO();

        try {
            this.HBL = ResourceBundle.getBundle("messages/exceptions", EXC.getInstance().getCurrentLocaleOrDefault(), new EXD());
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public FFO QNY() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.exceedednumberofusers"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO IGZ() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.invalidusernamelength"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO IHA() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.invalidusernameorpassword"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO IHB(String var1, String var2) {
        EXF.getInstance().ICO();

        FFO var3;
        try {
            var3 = new FFO(this.HBL.getString("micro.exception.passwordcontainsbadcharacters").replaceFirst("##INVALIDCHARS##", Matcher.quoteReplacement(var1)).replaceFirst("##ALLOWEDCHARS##", Matcher.quoteReplacement(var2)));
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public FFO IHC() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.userdoesexist"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFK IHD() {
        EXF.getInstance().ICO();

        FFK var1;
        try {
            var1 = new FFK(this.HBL.getString("micro.controller.exception.parentandprimarystage"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFK IHE(String var1) {
        EXF.getInstance().ICO();

        FFK var2;
        try {
            var2 = new FFK(this.HBL.getString("micro.controller.exception.invalidormissingscene").replaceFirst("##SCENE##", Matcher.quoteReplacement(var1)));
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public FFK IHF() {
        EXF.getInstance().ICO();

        FFK var1;
        try {
            var1 = new FFK(this.HBL.getString("micro.controller.exception.invalidormissingcontroller"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFK IHG() {
        EXF.getInstance().ICO();

        FFK var1;
        try {
            var1 = new FFK(this.HBL.getString("micro.exception.emptyconfiguration"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFK IHH(String var1, String var2) {
        EXF.getInstance().ICO();

        FFK var3;
        try {
            var3 = new FFK(this.HBL.getString("micro.exception.invalidtransition").replaceFirst("##FROM##", Matcher.quoteReplacement(var1)).replaceFirst("##TO##", Matcher.quoteReplacement(var2)));
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public FFK IHI(File var1) {
        EXF.getInstance().ICO();

        FFK var3;
        try {
            String var2 = var1 != null ? var1.getAbsolutePath() : "";
            var3 = new FFK(this.HBL.getString("micro.exception.FileNotFound").replaceFirst("##FILEPATH##", Matcher.quoteReplacement(var2)));
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public FFK IHJ() {
        EXF.getInstance().ICO();

        FFK var1;
        try {
            var1 = new FFK(this.HBL.getString("micro.exception.ImplementationNull"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFK IHK() {
        EXF.getInstance().ICO();

        FFK var1;
        try {
            var1 = new FFK(this.HBL.getString("micro.exception.CorrectionInvoiceNotFound"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFK IHL() {
        EXF.getInstance().ICO();

        FFK var1;
        try {
            var1 = new FFK(this.HBL.getString("micro.exception.PrintError"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFK createMicroTechnicalException_reflection_get_value_error() {
        EXF.getInstance().ICO();

        FFK var1;
        try {
            var1 = new FFK(this.HBL.getString("micro.exception.ReflectionGetValueError"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFK IHM() {
        EXF.getInstance().ICO();

        FFK var1;
        try {
            var1 = new FFK(this.HBL.getString("micro.exception.NullInvoice"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO IHN() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.InvoiceDoesntHaveParent"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO IHO() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.InvoiceValidationFailed"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFI IHP() {
        EXF.getInstance().ICO();

        FFI var1;
        try {
            var1 = new FFI(this.HBL.getString("micro.general.exception.pin.missing"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO IHQ() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.general.exception.pin.invalid"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO IHR(String var1, String var2) {
        EXF.getInstance().ICO();

        FFO var3;
        try {
            var3 = new FFO(this.HBL.getString("micro.sign.pz.exception.sizeExceeded.sum").replaceFirst("##MAXSIZE##", Matcher.quoteReplacement(var1)).replaceFirst("##CURRENTSIZE##", Matcher.quoteReplacement(var2)));
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public FFO IHS(String var1, String var2, String var3) {
        EXF.getInstance().ICO();

        FFO var4;
        try {
            var4 = new FFO(this.HBL.getString("micro.sign.pz.exception.sizeExceeded.single").replaceFirst("##MAXSIZE##", Matcher.quoteReplacement(var1)).replaceFirst("##CURRENTSIZE##", Matcher.quoteReplacement(var2)).replaceFirst("##FILENAME##", Matcher.quoteReplacement(var3)));
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }

    public FFO MXK(String var1, String var2, String var3) {
        EXF.getInstance().ICO();

        FFO var4;
        try {
            var4 = new FFO(this.HBL.getString("micro.sign.kd.exception.sizeExceeded.single").replaceFirst("##MAXSIZE##", Matcher.quoteReplacement(var1)).replaceFirst("##CURRENTSIZE##", Matcher.quoteReplacement(var2)).replaceFirst("##FILENAME##", Matcher.quoteReplacement(var3)));
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }

    public FFO IHT() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.missingpkcs11library"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO IHU() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.notvalidpkcs11driver"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO IHV(String var1, String var2) {
        EXF.getInstance().ICO();

        FFO var3;
        try {
            var3 = new FFO(this.HBL.getString("micro.convert.exception.badinput").replaceFirst("##REQUIRED##", Matcher.quoteReplacement(var1)).replaceFirst("##PROVIDED##", Matcher.quoteReplacement(var2)));
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public FFO IHW(int var1, Throwable var2) {
        EXF.getInstance().ICO();

        FFO var3;
        try {
            var3 = new FFO(this.HBL.getString("micro.convert.exception.processing").replaceFirst("##LINENUMBER##", Matcher.quoteReplacement(String.valueOf(var1))) + " " + var2.getLocalizedMessage(), var2);
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public FFO IHX(String var1) {
        EXF.getInstance().ICO();

        FFO var2;
        try {
            var2 = new FFO(this.HBL.getString("micro.convert.exception.init").replaceFirst("##SCHEMANAME##", Matcher.quoteReplacement(var1)));
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public FFO IHY() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.controller.exception.invalidcsvfilejpk.missing.columns"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO IHZ(String var1) {
        EXF.getInstance().ICO();

        FFO var2;
        try {
            var2 = new FFO(this.HBL.getString("micro.controller.exception.invalidcsvfilejpk").replaceFirst("##DETAILS##", Matcher.quoteReplacement(var1)));
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public FFO IIA(String var1) {
        EXF.getInstance().ICO();

        FFO var2;
        try {
            var2 = new FFO(this.HBL.getString("micro.controller.exception.invalidxmlfilejpk").replaceFirst("##DETAILS##", Matcher.quoteReplacement(var1)));
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public SAXParseException IIB(int var1) {
        EXF.getInstance().ICO();

        SAXParseException var2;
        try {
            var2 = new SAXParseException(this.HBL.getString("micro.parse.exception.expectedelementnotfound").replaceFirst("##NUMOFNODES##", Matcher.quoteReplacement(String.valueOf(var1))), null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public SAXParseException IIC(String var1) {
        EXF.getInstance().ICO();

        SAXParseException var2;
        try {
            var2 = new SAXParseException(this.HBL.getString("micro.parse.exception.unexpectedelement").replaceFirst("##ELEMENTNAME##", Matcher.quoteReplacement(var1)), null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public SAXParseException IID() {
        EXF.getInstance().ICO();

        SAXParseException var1;
        try {
            var1 = new SAXParseException(this.HBL.getString("micro.parse.exception.missingtns"), null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public SAXParseException IIE(String var1) {
        EXF.getInstance().ICO();

        SAXParseException var2;
        try {
            var2 = new SAXParseException(this.HBL.getString("micro.parse.exception.other").replaceFirst("##EXCEPTION##", Matcher.quoteReplacement(var1)), null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public FFO QGS() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.NetworkErrorCheckJPKState"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFK QIS() {
        EXF.getInstance().ICO();

        FFK var1;
        try {
            var1 = new FFK(this.HBL.getString("micro.exception.ConcurrentTask"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFK QIT(String var1, String var2, String var3) {
        EXF.getInstance().ICO();

        FFK var6;
        try {
            String var4 = "";
            short var5 = 200;
            if (var3 != null) {
                if (var3.length() > var5) {
                    var4 = var3.substring(0, var5);
                } else {
                    var4 = var3;
                }
            }

            var6 = new FFK(this.HBL.getString("micro.databasemanager.poisondata.exception").replaceFirst("##TABLE_NAME##", Matcher.quoteReplacement(var1)).replaceFirst("##TABLE_ID##", Matcher.quoteReplacement(var2)).replaceFirst("##REASON##", Matcher.quoteReplacement(var4)));
        } finally {
            EXF.getInstance().ICP();
        }

        return var6;
    }

    public FFK QNZ() {
        EXF.getInstance().ICO();

        FFK var1;
        try {
            var1 = new FFK(this.HBL.getString("micro.exception.ParameterNull"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO QOA() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.CantCancelOtherThanNormalInvoice"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO createMicroBusinessException_cant_cancel_settled_invoice() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.CantCancelSettledInvoice"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO QOB() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.CantCancelCanceledInvoice"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO QOC() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.CantCancelInvoiceWithChildren"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFO createMicroBusinessException_cant_delete_settled_invoice() {
        EXF.getInstance().ICO();

        FFO var1;
        try {
            var1 = new FFO(this.HBL.getString("micro.exception.CantDeleteSettledInvoice"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFI RHM() {
        EXF.getInstance().ICO();

        FFI var1;
        try {
            var1 = new FFI(this.HBL.getString("micro.exception.restoreDatabase.invalidBackupFile"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFI RHN() {
        EXF.getInstance().ICO();

        FFI var1;
        try {
            var1 = new FFI(this.HBL.getString("micro.exception.restoreDatabase.restoreDatabaseWrongUsername"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public FFI RHO() {
        EXF.getInstance().ICO();

        FFI var1;
        try {
            var1 = new FFI(this.HBL.getString("micro.exception.restoreDatabase.restoreDatabaseFailure"));
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }
}
