package a.a.a.c.c.b;

import a.a.a.b.a.a.d.CellNamed;
import a.a.a.b.a.a.d.CellTyped;

public enum CellType {
    cell_technical_id(new CellTyped("technical_id", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_technical_parentid(new CellTyped("technical_parentid", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_technical_settlementid(new CellTyped("technical_settlementid", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_audit_ts_created(new CellTyped("audit_ts_created", a.a.a.b.a.a.d.CellType.TIMESTAMP)),
    cell_technical_username(new CellTyped("technical_username", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_technical_salt(new CellTyped("technical_salt", a.a.a.b.a.a.d.CellType.BLOB)),
    cell_technical_password(new CellTyped("technical_password", a.a.a.b.a.a.d.CellType.BLOB)),
    cell_technical_password_change(new CellTyped("technical_password_change", a.a.a.b.a.a.d.CellType.INTEGER)),
    cell_technical_version(new CellTyped("technical_version", a.a.a.b.a.a.d.CellType.INTEGER)),
    cell_business_version(new CellTyped("business_version", a.a.a.b.a.a.d.CellType.INTEGER)),
    cell_technical_type(new CellTyped("technical_type", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_technical_subType(new CellTyped("technical_subType", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_technical_typeclass(new CellTyped("technical_typeclass", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_technical_encrypted(new CellTyped("technical_encrypted", a.a.a.b.a.a.d.CellType.TINYINT)),
    cell_technical_iv(new CellTyped("technical_iv", a.a.a.b.a.a.d.CellType.BLOB)),
    cell_technical_body(new CellTyped("technical_body", a.a.a.b.a.a.d.CellType.BLOB)),
    cell_business_state(new CellTyped("business_state", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_business_issuer_number(new CellTyped("business_issuer_number", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_business_refid(new CellTyped("business_refid", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_business_periodYear(new CellTyped("business_periodYear", a.a.a.b.a.a.d.CellType.INTEGER)),
    cell_business_periodMonth(new CellTyped("business_periodMonth", a.a.a.b.a.a.d.CellType.INTEGER)),
    cell_business_documentIndex(new CellTyped("business_documentIndex", a.a.a.b.a.a.d.CellType.INTEGER)),
    cell_business_numeric_value(new CellTyped("business_numericValue", a.a.a.b.a.a.d.CellType.INTEGER)),
    cell_business_name(new CellTyped("business_name", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_business_dictionaryName(new CellTyped("business_dictionaryName", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_business_dictionaryEntry(new CellTyped("business_dictionaryEntry", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_business_invoicingDate(new CellTyped("business_invoicingDate", a.a.a.b.a.a.d.CellType.DATE)),
    cell_business_creationDate(new CellTyped("business_creationDate", a.a.a.b.a.a.d.CellType.DATE)),
    cell_business_transactionDate(new CellTyped("business_transactionDate", a.a.a.b.a.a.d.CellType.DATE)),
    cell_business_contractorName(new CellTyped("business_contractorName", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_business_contractorNIP(new CellTyped("business_contractorNIP", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_business_netValue(new CellTyped("business_netValue", a.a.a.b.a.a.d.CellType.REAL)),
    cell_business_grossValue(new CellTyped("business_grossValue", a.a.a.b.a.a.d.CellType.REAL)),
    cell_business_taxValue(new CellTyped("business_taxValue", a.a.a.b.a.a.d.CellType.REAL)),
    cell_business_hash(new CellTyped("business_hash", a.a.a.b.a.a.d.CellType.INTEGER)),
    cell_viewQueryId(new CellTyped("viewQueryId", a.a.a.b.a.a.d.CellType.TEXT)),
    cell_viewRefType(new CellNamed("viewRefType")),
    cell_viewRefLevel(new CellNamed("viewRefLevel")),
    cell_viewRefId(new CellNamed("viewRefId"));

    private final CellNamed FJL;

    CellType(CellNamed var3) {
        this.FJL = var3;
    }

    public <_T extends CellNamed> _T getDefinition() {
        return (_T) this.FJL;
    }

    public static CellType getDefinedCellByName(String var0) {
        CellType[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            CellType var4 = var1[var3];
            if (var4.getDefinition().getName().equals(var0)) {
                return var4;
            }
        }

        return null;
    }
}
