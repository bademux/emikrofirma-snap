package a.a.a.c.c.b;

import a.a.a.b.a.a.d.FDR;
import a.a.a.b.a.a.d.FDU;
import a.a.a.b.a.a.d.FDV;
import a.a.a.b.a.a.d.FDY;
import a.a.a.c.e.a.d.EWD;
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
    FDR FLD = END.cell_technical_id.getDefinition();
    FDR FLE = END.cell_technical_parentid.getDefinition();
    FDR FLF = END.cell_technical_settlementid.getDefinition();
    FDR FLG = END.cell_audit_ts_created.getDefinition();
    FDR FLH = END.cell_technical_version.getDefinition();
    FDR FLI = END.cell_business_version.getDefinition();
    FDR FLJ = END.cell_technical_username.getDefinition();
    FDR FLK = END.cell_technical_salt.getDefinition();
    FDR FLL = END.cell_technical_password.getDefinition();
    FDR FLM = END.cell_technical_password_change.getDefinition();
    FDR FLN = END.cell_technical_type.getDefinition();
    FDR FLO = END.cell_technical_subType.getDefinition();
    FDR FLP = END.cell_technical_typeclass.getDefinition();
    FDR FLQ = END.cell_technical_encrypted.getDefinition();
    FDR FLR = END.cell_technical_iv.getDefinition();
    FDR FLS = END.cell_technical_body.getDefinition();
    FDR RHL = END.cell_business_state.getDefinition();
    FDR FLT = END.cell_business_issuer_number.getDefinition();
    FDR FLU = END.cell_business_refid.getDefinition();
    FDR FLV = END.cell_business_periodYear.getDefinition();
    FDR FLW = END.cell_business_periodMonth.getDefinition();
    FDR FLX = END.cell_business_documentIndex.getDefinition();
    FDR FLY = END.cell_business_numeric_value.getDefinition();
    FDR FLZ = END.cell_business_name.getDefinition();
    FDR FMA = END.cell_business_dictionaryName.getDefinition();
    FDR FMB = END.cell_business_dictionaryEntry.getDefinition();
    FDR FMC = END.cell_business_invoicingDate.getDefinition();
    FDR FMD = END.cell_business_creationDate.getDefinition();
    FDR QNR = END.cell_business_transactionDate.getDefinition();
    FDR FME = END.cell_business_contractorName.getDefinition();
    FDR FMF = END.cell_business_contractorNIP.getDefinition();
    FDR FMG = END.cell_business_netValue.getDefinition();
    FDR FMH = END.cell_business_grossValue.getDefinition();
    FDR FMI = END.cell_business_taxValue.getDefinition();
    FDR QNS = END.cell_business_hash.getDefinition();
    FDR FMJ = END.cell_viewQueryId.getDefinition();
    FDY FMK = ENC.END.cell_viewRefType.getDefinition();
    FDY FML = ENC.END.cell_viewRefLevel.getDefinition();
    FDY FMM = ENC.END.cell_viewRefId.getDefinition();

    interface ENF<_A extends EWD<_B>, _B extends KU> {
        _A HNG(List<END> var1, String var2, Map<String, Map<Integer, List<FDU<?>>>> var3) throws Exception;
    }

    interface ENE<_A extends EWD<_B>, _B extends KU> {
        _A HNF(List<FDU<?>> var1) throws Exception;
    }

    enum END {
        cell_technical_id(new FDR("technical_id", FDV.TEXT)),
        cell_technical_parentid(new FDR("technical_parentid", FDV.TEXT)),
        cell_technical_settlementid(new FDR("technical_settlementid", FDV.TEXT)),
        cell_audit_ts_created(new FDR("audit_ts_created", FDV.TIMESTAMP)),
        cell_technical_username(new FDR("technical_username", FDV.TEXT)),
        cell_technical_salt(new FDR("technical_salt", FDV.BLOB)),
        cell_technical_password(new FDR("technical_password", FDV.BLOB)),
        cell_technical_password_change(new FDR("technical_password_change", FDV.INTEGER)),
        cell_technical_version(new FDR("technical_version", FDV.INTEGER)),
        cell_business_version(new FDR("business_version", FDV.INTEGER)),
        cell_technical_type(new FDR("technical_type", FDV.TEXT)),
        cell_technical_subType(new FDR("technical_subType", FDV.TEXT)),
        cell_technical_typeclass(new FDR("technical_typeclass", FDV.TEXT)),
        cell_technical_encrypted(new FDR("technical_encrypted", FDV.TINYINT)),
        cell_technical_iv(new FDR("technical_iv", FDV.BLOB)),
        cell_technical_body(new FDR("technical_body", FDV.BLOB)),
        cell_business_state(new FDR("business_state", FDV.TEXT)),
        cell_business_issuer_number(new FDR("business_issuer_number", FDV.TEXT)),
        cell_business_refid(new FDR("business_refid", FDV.TEXT)),
        cell_business_periodYear(new FDR("business_periodYear", FDV.INTEGER)),
        cell_business_periodMonth(new FDR("business_periodMonth", FDV.INTEGER)),
        cell_business_documentIndex(new FDR("business_documentIndex", FDV.INTEGER)),
        cell_business_numeric_value(new FDR("business_numericValue", FDV.INTEGER)),
        cell_business_name(new FDR("business_name", FDV.TEXT)),
        cell_business_dictionaryName(new FDR("business_dictionaryName", FDV.TEXT)),
        cell_business_dictionaryEntry(new FDR("business_dictionaryEntry", FDV.TEXT)),
        cell_business_invoicingDate(new FDR("business_invoicingDate", FDV.DATE)),
        cell_business_creationDate(new FDR("business_creationDate", FDV.DATE)),
        cell_business_transactionDate(new FDR("business_transactionDate", FDV.DATE)),
        cell_business_contractorName(new FDR("business_contractorName", FDV.TEXT)),
        cell_business_contractorNIP(new FDR("business_contractorNIP", FDV.TEXT)),
        cell_business_netValue(new FDR("business_netValue", FDV.REAL)),
        cell_business_grossValue(new FDR("business_grossValue", FDV.REAL)),
        cell_business_taxValue(new FDR("business_taxValue", FDV.REAL)),
        cell_business_hash(new FDR("business_hash", FDV.INTEGER)),
        cell_viewQueryId(new FDR("viewQueryId", FDV.TEXT)),
        cell_viewRefType(new FDY("viewRefType")),
        cell_viewRefLevel(new FDY("viewRefLevel")),
        cell_viewRefId(new FDY("viewRefId"));

        private final FDY FJL;

        END(FDY var3) {
            this.FJL = var3;
        }

        public <_T extends FDY> _T getDefinition() {
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
