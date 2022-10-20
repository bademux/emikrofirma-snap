package a.a.a.c.d.a.b;

import a.a.a.c.f.a.b.CustomActionClass;
import a.a.a.c.f.a.c.a.c.FieldType;
import a.a.a.c.f.a.c.a.c.BaseField;

import java.util.Map;

public class EPS implements CustomActionClass<Map<FieldType, BaseField>> {
    private final FieldType FTX;
    private final FieldType FTY;
    private final FieldType FTZ;
    private final FieldType FUA;
    private final FieldType FUB;
    private final FieldType FUC;
    private final FieldType FUD;
    private final FieldType FUE;

    public EPS(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8) {

        this.FTX = FieldType.valueOf(var1);
        this.FTY = FieldType.valueOf(var2);
        this.FTZ = FieldType.valueOf(var3);
        this.FUA = FieldType.valueOf(var4);
        this.FUB = FieldType.valueOf(var5);
        this.FUC = FieldType.valueOf(var6);
        this.FUD = FieldType.valueOf(var7);
        this.FUE = FieldType.valueOf(var8);

    }

    public boolean AIBY(Map<FieldType, BaseField> var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fields " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_KodKraju " + this.FTX);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_Wojewodztwo " + this.FTY);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_Powiat " + this.FTZ);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_Gmina " + this.FUA);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_Ulica " + this.FUB);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_Miejscowosc " + this.FUC);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_KodPocztowy " + this.FUD);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_Poczta " + this.FUE);

        boolean var10;
        BaseField var2 = var1.get(this.FTX);
        BaseField var3 = var1.get(this.FTY);
        BaseField var4 = var1.get(this.FTZ);
        BaseField var5 = var1.get(this.FUA);
        BaseField var6 = var1.get(this.FUB);
        BaseField var7 = var1.get(this.FUC);
        BaseField var8 = var1.get(this.FUD);
        BaseField var9 = var1.get(this.FUE);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_KodKraju " + var2);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_Wojewodztwo " + var3);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_Powiat " + var4);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_Gmina " + var5);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_Ulica " + var6);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_Miejscowosc " + var7);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_KodPocztowy " + var8);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_Poczta " + var9);
        var10 = false;

        return var10;
    }

    public String getContextString(Map<FieldType, BaseField> var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fields " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_KodKraju " + this.FTX);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_Wojewodztwo " + this.FTY);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_Powiat " + this.FTZ);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_Gmina " + this.FUA);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_Ulica " + this.FUB);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_Miejscowosc " + this.FUC);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_KodPocztowy " + this.FUD);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalFieldName_Poczta " + this.FUE);

        String var11;
        BaseField var2 = var1.get(this.FTX);
        BaseField var3 = var1.get(this.FTY);
        BaseField var4 = var1.get(this.FTZ);
        BaseField var5 = var1.get(this.FUA);
        BaseField var6 = var1.get(this.FUB);
        BaseField var7 = var1.get(this.FUC);
        BaseField var8 = var1.get(this.FUD);
        BaseField var9 = var1.get(this.FUE);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_KodKraju " + var2);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_Wojewodztwo " + var3);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_Powiat " + var4);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_Gmina " + var5);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_Ulica " + var6);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_Miejscowosc " + var7);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_KodPocztowy " + var8);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("postalField_Poczta " + var9);
        String var10 = this.FTX + " (" + var2.getValue() + "), " +
                this.FTY + " (" + var3.getValue() + "), " +
                this.FTZ + " (" + var4.getValue() + "), " +
                this.FUA + " (" + var5.getValue() + "), " +
                this.FUB + " (" + var6.getValue() + "), " +
                this.FUC + " (" + var7.getValue() + "), " +
                this.FUD + " (" + var8.getValue() + "), " +
                this.FUE + " (" + var9.getValue() + ") ";
        var11 = var10;

        return var11;
    }
}
