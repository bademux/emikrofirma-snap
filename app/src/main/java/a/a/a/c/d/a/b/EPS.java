package a.a.a.c.d.a.b;

import a.a.a.c.f.a.b.AHCB;
import a.a.a.c.f.a.c.a.c.AHDS;
import a.a.a.c.f.a.c.a.c.Field;

import java.util.Map;

public class EPS implements AHCB<Map<AHDS, Field>> {
    private final AHDS FTX;
    private final AHDS FTY;
    private final AHDS FTZ;
    private final AHDS FUA;
    private final AHDS FUB;
    private final AHDS FUC;
    private final AHDS FUD;
    private final AHDS FUE;

    public EPS(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8) {

        this.FTX = AHDS.valueOf(var1);
        this.FTY = AHDS.valueOf(var2);
        this.FTZ = AHDS.valueOf(var3);
        this.FUA = AHDS.valueOf(var4);
        this.FUB = AHDS.valueOf(var5);
        this.FUC = AHDS.valueOf(var6);
        this.FUD = AHDS.valueOf(var7);
        this.FUE = AHDS.valueOf(var8);

    }

    public boolean AIBY(Map<AHDS, Field> var1) {

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
        Field var2 = var1.get(this.FTX);
        Field var3 = var1.get(this.FTY);
        Field var4 = var1.get(this.FTZ);
        Field var5 = var1.get(this.FUA);
        Field var6 = var1.get(this.FUB);
        Field var7 = var1.get(this.FUC);
        Field var8 = var1.get(this.FUD);
        Field var9 = var1.get(this.FUE);
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

    public String getContextString(Map<AHDS, Field> var1) {

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
        Field var2 = var1.get(this.FTX);
        Field var3 = var1.get(this.FTY);
        Field var4 = var1.get(this.FTZ);
        Field var5 = var1.get(this.FUA);
        Field var6 = var1.get(this.FUB);
        Field var7 = var1.get(this.FUC);
        Field var8 = var1.get(this.FUD);
        Field var9 = var1.get(this.FUE);
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
