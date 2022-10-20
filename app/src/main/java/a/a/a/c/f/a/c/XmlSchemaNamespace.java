package a.a.a.c.f.a.c;

import a.a.a.b.f.FFI;

public enum XmlSchemaNamespace {
    ETD("http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2016/01/25/eD/DefinicjeTypy/"),
    TNS("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/"),
    XSI("http://www.w3.org/2001/XMLSchema-instance");

    private final String AHXD;

    XmlSchemaNamespace(String var3) {
        this.AHXD = var3;
    }

    public String getNamespace() {
        return this.AHXD;
    }

    public static XmlSchemaNamespace getByValue(String var0) {
        XmlSchemaNamespace[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            XmlSchemaNamespace var4 = var1[var3];
            if (var4.getNamespace().equals(var0)) {
                return var4;
            }
        }

        throw new FFI("Namespace [" + var0 + "] not found!");
    }

    public static boolean AIDW(String var0) {
        XmlSchemaNamespace[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            XmlSchemaNamespace var4 = var1[var3];
            if (var4.getNamespace().equals(var0)) {
                return true;
            }
        }

        return false;
    }
}
