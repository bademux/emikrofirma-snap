package a.a.a.c.c.b;

import a.a.a.b.a.a.d.CellTyped;
import a.a.a.b.a.a.d.CellValue;
import a.a.a.b.a.a.d.CellType;
import a.a.a.b.a.a.d.CellNamed;
import a.a.a.c.e.a.d.OneValueBox;
import a.a.a.c.f.KU;

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
    CellTyped FLD = END.cell_technical_id.getDefinition();
    CellTyped FLE = END.cell_technical_parentid.getDefinition();
    CellTyped FLF = END.cell_technical_settlementid.getDefinition();
    CellTyped FLG = END.cell_audit_ts_created.getDefinition();
    CellTyped FLH = END.cell_technical_version.getDefinition();
    CellTyped FLI = END.cell_business_version.getDefinition();
    CellTyped FLJ = END.cell_technical_username.getDefinition();
    CellTyped FLK = END.cell_technical_salt.getDefinition();
    CellTyped FLL = END.cell_technical_password.getDefinition();
    CellTyped FLM = END.cell_technical_password_change.getDefinition();
    CellTyped FLN = END.cell_technical_type.getDefinition();
    CellTyped FLO = END.cell_technical_subType.getDefinition();
    CellTyped FLP = END.cell_technical_typeclass.getDefinition();
    CellTyped FLQ = END.cell_technical_encrypted.getDefinition();
    CellTyped FLR = END.cell_technical_iv.getDefinition();
    CellTyped FLS = END.cell_technical_body.getDefinition();
    CellTyped RHL = END.cell_business_state.getDefinition();
    CellTyped FLT = END.cell_business_issuer_number.getDefinition();
    CellTyped FLU = END.cell_business_refid.getDefinition();
    CellTyped FLV = END.cell_business_periodYear.getDefinition();
    CellTyped FLW = END.cell_business_periodMonth.getDefinition();
    CellTyped FLX = END.cell_business_documentIndex.getDefinition();
    CellTyped FLY = END.cell_business_numeric_value.getDefinition();
    CellTyped FLZ = END.cell_business_name.getDefinition();
    CellTyped FMA = END.cell_business_dictionaryName.getDefinition();
    CellTyped FMB = END.cell_business_dictionaryEntry.getDefinition();
    CellTyped FMC = END.cell_business_invoicingDate.getDefinition();
    CellTyped FMD = END.cell_business_creationDate.getDefinition();
    CellTyped QNR = END.cell_business_transactionDate.getDefinition();
    CellTyped FME = END.cell_business_contractorName.getDefinition();
    CellTyped FMF = END.cell_business_contractorNIP.getDefinition();
    CellTyped FMG = END.cell_business_netValue.getDefinition();
    CellTyped FMH = END.cell_business_grossValue.getDefinition();
    CellTyped FMI = END.cell_business_taxValue.getDefinition();
    CellTyped QNS = END.cell_business_hash.getDefinition();
    CellTyped FMJ = END.cell_viewQueryId.getDefinition();
    CellNamed FMK = ENC.END.cell_viewRefType.getDefinition();
    CellNamed FML = ENC.END.cell_viewRefLevel.getDefinition();
    CellNamed FMM = ENC.END.cell_viewRefId.getDefinition();

    interface ENF<_A extends OneValueBox<_B>, _B extends KU> {
        _A HNG(List<END> var1, String var2, Map<String, Map<Integer, List<CellValue<?>>>> var3) throws Exception;
    }

    interface ENE<_A extends OneValueBox<_B>, _B extends KU> {
        _A HNF(List<CellValue<?>> var1) throws Exception;
    }

    enum END {
        cell_technical_id(new CellTyped("technical_id", CellType.TEXT)),
        cell_technical_parentid(new CellTyped("technical_parentid", CellType.TEXT)),
        cell_technical_settlementid(new CellTyped("technical_settlementid", CellType.TEXT)),
        cell_audit_ts_created(new CellTyped("audit_ts_created", CellType.TIMESTAMP)),
        cell_technical_username(new CellTyped("technical_username", CellType.TEXT)),
        cell_technical_salt(new CellTyped("technical_salt", CellType.BLOB)),
        cell_technical_password(new CellTyped("technical_password", CellType.BLOB)),
        cell_technical_password_change(new CellTyped("technical_password_change", CellType.INTEGER)),
        cell_technical_version(new CellTyped("technical_version", CellType.INTEGER)),
        cell_business_version(new CellTyped("business_version", CellType.INTEGER)),
        cell_technical_type(new CellTyped("technical_type", CellType.TEXT)),
        cell_technical_subType(new CellTyped("technical_subType", CellType.TEXT)),
        cell_technical_typeclass(new CellTyped("technical_typeclass", CellType.TEXT)),
        cell_technical_encrypted(new CellTyped("technical_encrypted", CellType.TINYINT)),
        cell_technical_iv(new CellTyped("technical_iv", CellType.BLOB)),
        cell_technical_body(new CellTyped("technical_body", CellType.BLOB)),
        cell_business_state(new CellTyped("business_state", CellType.TEXT)),
        cell_business_issuer_number(new CellTyped("business_issuer_number", CellType.TEXT)),
        cell_business_refid(new CellTyped("business_refid", CellType.TEXT)),
        cell_business_periodYear(new CellTyped("business_periodYear", CellType.INTEGER)),
        cell_business_periodMonth(new CellTyped("business_periodMonth", CellType.INTEGER)),
        cell_business_documentIndex(new CellTyped("business_documentIndex", CellType.INTEGER)),
        cell_business_numeric_value(new CellTyped("business_numericValue", CellType.INTEGER)),
        cell_business_name(new CellTyped("business_name", CellType.TEXT)),
        cell_business_dictionaryName(new CellTyped("business_dictionaryName", CellType.TEXT)),
        cell_business_dictionaryEntry(new CellTyped("business_dictionaryEntry", CellType.TEXT)),
        cell_business_invoicingDate(new CellTyped("business_invoicingDate", CellType.DATE)),
        cell_business_creationDate(new CellTyped("business_creationDate", CellType.DATE)),
        cell_business_transactionDate(new CellTyped("business_transactionDate", CellType.DATE)),
        cell_business_contractorName(new CellTyped("business_contractorName", CellType.TEXT)),
        cell_business_contractorNIP(new CellTyped("business_contractorNIP", CellType.TEXT)),
        cell_business_netValue(new CellTyped("business_netValue", CellType.REAL)),
        cell_business_grossValue(new CellTyped("business_grossValue", CellType.REAL)),
        cell_business_taxValue(new CellTyped("business_taxValue", CellType.REAL)),
        cell_business_hash(new CellTyped("business_hash", CellType.INTEGER)),
        cell_viewQueryId(new CellTyped("viewQueryId", CellType.TEXT)),
        cell_viewRefType(new CellNamed("viewRefType")),
        cell_viewRefLevel(new CellNamed("viewRefLevel")),
        cell_viewRefId(new CellNamed("viewRefId"));

        private final CellNamed FJL;

        END(CellNamed var3) {
            this.FJL = var3;
        }

        public <_T extends CellNamed> _T getDefinition() {
            return (_T) this.FJL;
        }

        public static END getDefinedCellByName(String var0) {
            END[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                END var4 = var1[var3];
                if (var4.getDefinition().getName().equals(var0)) {
                    return var4;
                }
            }

            return null;
        }
    }
}
