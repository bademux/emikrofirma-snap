package a.a.a.c.c.b;

import a.a.a.b.a.a.d.CellTyped;
import a.a.a.b.a.a.d.CellValue;
import a.a.a.b.a.a.d.CellNamed;
import a.a.a.c.e.a.d.ValueContainer1;
import a.a.a.c.f.ModelBase;

import java.util.List;
import java.util.Map;

public interface ENC {
    String FJM = null;
    String FJN = "users";
    String FJO = "preferences";
    String FJP = "preferencesLatestVersion";
    String FJQ = "invoices";
    String FJR = "invoicesTreeBase";
    String FJS = "invoicesTreeFull";
    String RHI = "invoicesother";
    String RHJ = "invoicesotherTreeBase";
    String RHK = "invoicesotherTreeFull";
    String FJT = "settlements";
    String FJU = "settlementsTreeBase";
    String FJV = "settlementsTreeFull";
    String FJW = "settlementsTreeRefLevel";
    String FJX = "settlementsLastChildIdBase";
    String FJY = "settlementsLastChildIdFull";
    String FJZ = "invoicerecords";
    String FKA = "invoicerecordsTreeBase";
    String FKB = "invoicerecordsTreeFull";
    String FKC = "invoicerecordsTreeRefLevel";
    String FKD = "invoicerecordsLatestTypeForPeriod";
    String FKE = "declarations";
    String FKF = "declarationsTreeBase";
    String FKG = "declarationsTreeFull";
    String FKH = "declarationsTreeRefLevel";
    String FKI = "receiptrecords";
    String FKJ = "receiptrecordsTreeBase";
    String FKK = "receiptrecordsTreeFull";
    String FKL = "contacts";
    String FKM = "contactsTreeBase";
    String FKN = "contactsTreeFull";
    String FKO = "sequences";
    String FKP = "dictionaries";
    String FKQ = "a_parent";
    String FKR = "b_select";
    String FKS = "c_child";
    String FKT = "##TABLE_NAME##";
    String FKU = "##VIEW_NAME##";
    String FKV = "select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_id = fact.technical_parentid ) SELECT viewQueryId, 'c_child' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select viewQueryId, viewRefType, viewRefLevel, viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_parentid = fact.technical_id ) SELECT viewQueryId, 'a_parent' viewRefType, viewRefLevel, technical_id viewRefId FROM temp where viewQueryId != technical_id ) union all select technical_id master, 'b_select' type, 0 level, technical_id viewRefId from ##TABLE_NAME## order by 1, 2, 3";
    String FKW = "select t.*, i.* from ##TABLE_NAME## i inner join ##VIEW_NAME## t on i.technical_id = t.viewRefId ";
    String FKX = "select viewQueryId, viewMaxRefLevel from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM temp INNER JOIN ##TABLE_NAME## fact  ON temp.technical_parentid = fact.technical_id ) SELECT viewQueryId, max(viewRefLevel) viewMaxRefLevel FROM temp group by viewQueryId ) ";
    String FKY = "select viewRefId from ( WITH RECURSIVE temp(viewQueryId, technical_id, technical_parentid, viewRefLevel) AS ( select technical_id viewQueryId, technical_id viewRefId, technical_parentid, 0 from ##TABLE_NAME## where technical_parentid is null UNION ALL SELECT temp.viewQueryId, fact.technical_id viewRefId, fact.technical_parentid, viewRefLevel + 1 FROM ##TABLE_NAME## fact INNER JOIN temp ON temp.technical_id = fact.technical_parentid ) SELECT c.technical_id viewRefId FROM temp c inner join ( SELECT a.viewQueryId, max(a.viewRefLevel) maxViewRefLevel FROM temp a group by a.viewQueryId ) b on b.viewQueryId = c.viewQueryId and b.maxViewRefLevel = c.viewRefLevel ) ";
    String FKZ = "select fact.* from ##TABLE_NAME## fact inner join (select business_periodYear, business_periodMonth, technical_type, technical_subType, max(business_documentIndex) maxDocumentIndex from ##TABLE_NAME## group by business_periodYear, business_periodMonth, technical_type, technical_subType) group_ on fact.business_periodYear = group_.business_periodYear and fact.business_periodMonth = group_.business_periodMonth and fact.technical_type = group_.technical_type and coalesce(fact.technical_subType, 'NULL') = coalesce(group_.technical_subType, 'NULL') and fact.business_documentIndex = group_.maxDocumentIndex  ";
    String FLA = "select a.* from preferences a inner join (select technical_username, technical_typeclass, max(business_version) max_ from preferences group by technical_username, technical_typeclass) b on a.technical_username = b.technical_username and a.technical_typeclass = b.technical_typeclass and a.business_version = b.max_ ";
    String FLB = "profiles";
    String FLC = ".db";
    CellTyped FLD = CellType.cell_technical_id.getDefinition();
    CellTyped FLE = CellType.cell_technical_parentid.getDefinition();
    CellTyped FLF = CellType.cell_technical_settlementid.getDefinition();
    CellTyped FLG = CellType.cell_audit_ts_created.getDefinition();
    CellTyped FLH = CellType.cell_technical_version.getDefinition();
    CellTyped FLI = CellType.cell_business_version.getDefinition();
    CellTyped FLJ = CellType.cell_technical_username.getDefinition();
    CellTyped FLK = CellType.cell_technical_salt.getDefinition();
    CellTyped FLL = CellType.cell_technical_password.getDefinition();
    CellTyped FLM = CellType.cell_technical_password_change.getDefinition();
    CellTyped FLN = CellType.cell_technical_type.getDefinition();
    CellTyped FLO = CellType.cell_technical_subType.getDefinition();
    CellTyped FLP = CellType.cell_technical_typeclass.getDefinition();
    CellTyped FLQ = CellType.cell_technical_encrypted.getDefinition();
    CellTyped FLR = CellType.cell_technical_iv.getDefinition();
    CellTyped FLS = CellType.cell_technical_body.getDefinition();
    CellTyped RHL = CellType.cell_business_state.getDefinition();
    CellTyped FLT = CellType.cell_business_issuer_number.getDefinition();
    CellTyped FLU = CellType.cell_business_refid.getDefinition();
    CellTyped FLV = CellType.cell_business_periodYear.getDefinition();
    CellTyped FLW = CellType.cell_business_periodMonth.getDefinition();
    CellTyped FLX = CellType.cell_business_documentIndex.getDefinition();
    CellTyped FLY = CellType.cell_business_numeric_value.getDefinition();
    CellTyped FLZ = CellType.cell_business_name.getDefinition();
    CellTyped FMA = CellType.cell_business_dictionaryName.getDefinition();
    CellTyped FMB = CellType.cell_business_dictionaryEntry.getDefinition();
    CellTyped FMC = CellType.cell_business_invoicingDate.getDefinition();
    CellTyped FMD = CellType.cell_business_creationDate.getDefinition();
    CellTyped QNR = CellType.cell_business_transactionDate.getDefinition();
    CellTyped FME = CellType.cell_business_contractorName.getDefinition();
    CellTyped FMF = CellType.cell_business_contractorNIP.getDefinition();
    CellTyped FMG = CellType.cell_business_netValue.getDefinition();
    CellTyped FMH = CellType.cell_business_grossValue.getDefinition();
    CellTyped FMI = CellType.cell_business_taxValue.getDefinition();
    CellTyped QNS = CellType.cell_business_hash.getDefinition();
    CellTyped FMJ = CellType.cell_viewQueryId.getDefinition();
    CellNamed FMK = CellType.cell_viewRefType.getDefinition();
    CellNamed FML = CellType.cell_viewRefLevel.getDefinition();
    CellNamed FMM = CellType.cell_viewRefId.getDefinition();

    interface ENF<_A extends ValueContainer1<_B>, _B extends ModelBase> {
        _A HNG(List<CellType> var1, String var2, Map<String, Map<Integer, List<CellValue<?>>>> var3) throws Exception;
    }

    interface ENE<_A extends ValueContainer1<_B>, _B extends ModelBase> {
        _A HNF(List<CellValue<?>> var1) throws Exception;
    }

    enum CellType {
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
}
