package a.a.a.c.c.b.b.a;

import a.a.a.b.a.a.OrderType;
import a.a.a.b.a.a.SqlOperation;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.b.b.EMU;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.ModelBase;
import a.a.a.c.f.LN;
import a.a.a.c.f.a.EntityTypes;
import a.a.a.c.f.a.ModelBusinessPeriodElement;
import a.a.a.c.f.a.ModelBusinessTopElement;
import a.a.a.c.f.a.ModelElementCriteria;
import a.a.a.c.f.a.a.Dictionary;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.d.DeclarationSubtype;
import a.a.a.c.f.a.d.Declaration;
import a.a.a.c.f.a.d.DeclarationType;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.e.a.InvoiceRecordType;
import a.a.a.c.f.a.f.a.ReceiptRecord;
import a.a.a.c.f.a.f.a.RecordType;
import a.a.a.c.f.a.g.*;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.SettlementType;
import a.a.a.c.f.a.n.InvoiceOther;
import a.a.a.c.f.a.n.InvoiceOtherElement;
import a.a.a.c.f.a.n.InvoiceOtherSubtype;
import a.a.a.c.f.a.n.InvoiceOtherType;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.PrivtePerson;
import a.a.a.c.f.b.c.Nip;
import a.a.a.c.f.b.c.RefId;
import a.a.a.c.f.b.c.a.InvoiceState;
import a.a.a.c.f.c.UserModel;
import a.a.a.c.f.c.LW;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.b.UserData;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EMV implements EMU {
    public EMV() {

    }

    private void HKM(ProcessDefinitionBase var1, Class<? extends ModelBase> var2) {

        Iterator var3 = var1.getObjectClasses().iterator();

        LN.StageType var5;
        do {
            if (!var3.hasNext()) {
                throw new FFI("Element [" + var2 + "] not registered for process [" + var1.getName() + "]!");
            }

            LN var4 = (LN) var3.next();
            var5 = var4.getType();
        } while (!this.HKM(var5, var2));

    }

    private boolean HKM(LN.StageType var1, Class<? extends ModelBase> var2) {

        boolean var5;
        boolean var9;
        if (var1.getClazz().equals(var2)) {
            var9 = true;
            return var9;
        }

        Iterator var3 = var1.getChildren().iterator();

        LN.StageType var4;
        do {
            if (!var3.hasNext()) {
                var9 = false;
                return var9;
            }

            var4 = (LN.StageType) var3.next();
        } while (!this.HKM(var4, var2));

        var5 = true;

        return var5;
    }

    public <_T extends LW, _Q extends ModelTechnicalElementCriteria<_T>> _T HJT(ProcessDefinitionBase var1, _Q var2) throws FFK {

        this.HKM(var1, var2.getTypeClass());
        ModelElementCriteria var3 = ModelElementCriteria.getByType(var2.getClass());
        UserModel var4 = UserModel.getByType(var2.getTypeClass());
        Integer var5 = null;
        switch (var3) {
            case ModelTechnicalElementCriteria:
                var5 = var2.getVersion();
            case ModelTechnicalNamedElementCriteria:
                break;
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
        }

        switch (var4) {
            case UserData:
                UserData var10 = EMB.getInstance().HHW(var5);
                return (_T) var10;
            case ConfigurationProperties:
                ConfigurationProperties var6 = EMB.getInstance().HHU();
                return (_T) var6;
            default:
                throw new FFI("Unexpected type [" + var4 + "]!");
        }
    }

    public <_A extends Invoice<_B>, _B extends InvoiceElement> _A HJX(ProcessDefinitionBase var1, Class<_A> var2) throws FFK, FFO {

        try {
            this.HKM(var1, var2);
            EntityTypes var3 = EntityTypes.getByType(var2);
            Invoice var4;
            UserData var5;
            Invoice var6;
            switch (var3) {
                case InvoiceSell:
                    var4 = var2.newInstance();
                    var5 = EMB.getInstance().HHV();
                    var4.DAR().setValue(var5.DFF().getValue());
                    var4.DBC().setValue(var5.DEW().getValue());
                    ((BaseInvoiceSell) var4).setUsingInvoicingDate(new PrivtePerson(true));
                    var6 = var4;
                    return (_A) var6;
                case InvoiceSellCorrection:
                    var4 = var2.newInstance();
                    var5 = EMB.getInstance().HHV();
                    var4.DAR().setValue(var5.DFF().getValue());
                    var4.DBC().setValue(var5.DEW().getValue());
                    ((BaseInvoiceSell) var4).setUsingInvoicingDate(new PrivtePerson(true));
                    var6 = var4;
                    return (_A) var6;
                case InvoicePurchase:
                case AggregatePurchase:
                    var4 = var2.newInstance();
                    var5 = EMB.getInstance().HHV();
                    var4.DBC().setValue(var5.DEW().getValue());
                    var6 = var4;
                    return (_A) var6;
                default:
                    throw new FFI("Unexpected type [" + var3 + "]!");
            }
        } catch (IllegalAccessException | InstantiationException var10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
            throw new FFK(var10);
        }
    }

    public <_A extends InvoiceOther<_B>, _B extends InvoiceOtherElement> _A ROG(ProcessDefinitionBase var1, Class<_A> var2) throws FFK, FFO {

        try {
            this.HKM(var1, var2);
            EntityTypes var3 = EntityTypes.getByType(var2);
            InvoiceOther var4;
            UserData var5;
            InvoiceOther var6;
            switch (var3) {
                case InvoiceOtherSell:
                    var4 = var2.newInstance();
                    var5 = EMB.getInstance().HHV();
                    var4.RIQ().setValue(var5.DFF().getValue());
                    var4.RJC().setValue(var5.DEW().getValue());
                    var6 = var4;
                    return (_A) var6;
                case InvoiceOtherPurchase:
                    var4 = var2.newInstance();
                    var5 = EMB.getInstance().HHV();
                    var4.RIQ().setValue(var5.DFF().getValue());
                    var4.RJC().setValue(var5.DEW().getValue());
                    var6 = var4;
                    return (_A) var6;
                default:
                    throw new FFI("Unexpected type [" + var3 + "]!");
            }
        } catch (IllegalAccessException | InstantiationException var10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
            throw new FFK(var10);
        }
    }

    public <_T extends ModelBusinessTopElement> void ROH(EDF<_T> var1, Class<_T> var2) throws FFK, FFO {

        EntityTypes var3 = EntityTypes.getByType(var2);
        switch (var3) {
            case InvoiceSell:
            case InvoiceSellCorrection:
            case InvoicePurchase:
            case Invoice:
            case InvoiceSellType:
            case InvoiceSellCorrectionType:
            case InvoicePurchaseInvoiceType:
                EMB.getInstance().ROL(var1);
                break;
            case AggregatePurchase:
            case ReceiptRecord:
            case ReceiptRecordVat:
            case Settlement:
            case SettlementVat:
            case Declaration:
            case DeclarationJPK:
            case DeclarationJPK_EWP:
            case DeclarationJPK_FA:
            case DeclarationJPK_KR:
            case DeclarationJPK_MAG:
            case DeclarationJPK_PKPIR:
            case DeclarationJPK_VAT:
            case DeclarationJPK_WB:
            case InvoiceRecord:
            case InvoiceRecordSell:
            case InvoiceRecordPurchase:
            case Contractor:
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
            case InvoiceOtherSell:
            case InvoiceOtherPurchase:
            case InvoiceOther:
            case InvoiceOtherPurchaseInvoiceType:
            case InvoiceOtherSellInvoiceType:
                EMB.getInstance().ROP(var1);
        }

    }

    public <_T extends ModelBusinessTopElement, _Q extends ModelBusinessElementCriteria<_T>, _R extends EDF<_T>, _S extends List<_R>> ValueContainer2<Integer, _S> HJY(ProcessDefinitionBase var1, _Q var2) throws FFK, FFO {

        this.HKM(var1, var2.getTypeClass());
        EntityTypes var3 = EntityTypes.getByType(var2.getTypeClass());
        OrderType var4 = null;
        Integer var5 = null;
        Integer var6 = null;
        Period var7 = null;
        Enum var8 = null;
        Enum var9 = null;
        RefId var10 = null;
        Nip var11 = null;
        Nip var12 = null;
        ValueContainer2 var13 = null;
        ValueContainer2 var14 = null;
        Integer var15 = null;
        String var16 = null;
        InvoiceState var17 = null;
        if (a.a.a.c.f.a.g.ModelElementCriteria.class.isAssignableFrom(var2.getClass())) {
            var4 = var2.getOrderType();
            var5 = var2.getPageSize();
            var6 = var2.getPageOffset();
        }

        if (ModelBusinessPeriodElementCriteria.class.isAssignableFrom(var2.getClass())) {
            ModelBusinessPeriodElementCriteria var18 = (ModelBusinessPeriodElementCriteria) var2;
            var7 = var18.getPeriod();
        }

        if (ModelBusinessPeriodElementTypedCriteria.class.isAssignableFrom(var2.getClass())) {
            ModelBusinessPeriodElementTypedCriteria var22 = (ModelBusinessPeriodElementTypedCriteria) var2;
            var8 = var22.getType();
            var9 = var22.getSubType();
        }

        if (ModelBusinessPeriodElementTypedIdCriteria.class.isAssignableFrom(var2.getClass())) {
            ModelBusinessPeriodElementTypedIdCriteria var23 = (ModelBusinessPeriodElementTypedIdCriteria) var2;
            var10 = var23.getRefId();
        }

        if (InvoiceCriteria.class.isAssignableFrom(var2.getClass())) {
            InvoiceCriteria var24 = (InvoiceCriteria) var2;
            var11 = var24.getIssuerNumber();
            var12 = var24.getContractorNIP();
            var13 = var24.getCreationDate();
            var14 = var24.getTransactionDate();
            var16 = var24.getSearch();
            if (var24.getState() != null) {
                var17 = var24.getState();
            }
        }

        if (InvoiceOtherCriteria.class.isAssignableFrom(var2.getClass())) {
            InvoiceOtherCriteria var25 = (InvoiceOtherCriteria) var2;
            var11 = var25.getIssuerNumber();
            var12 = var25.getContractorNIP();
            var13 = var25.getCreationDate();
            var14 = var25.getTransactionDate();
            var16 = var25.getSearch();
            if (var25.getState() != null) {
                var17 = var25.getState();
            }
        }

        if (ContractorModelCriteria.class.isAssignableFrom(var2.getClass())) {
            ContractorModelCriteria var26 = (ContractorModelCriteria) var2;
            var15 = var26.getHash();
            var16 = var26.getSearch();
        }

        ValueContainer2 var27;
        switch (var3) {
            case InvoiceSell:
            case InvoiceSellCorrection:
            case InvoicePurchase:
            case Invoice:
            case InvoiceSellType:
            case InvoiceSellCorrectionType:
            case InvoicePurchaseInvoiceType:
                var27 = EMB.getInstance().ROM(var17, var4, var5, var6, var7, (InvoiceType) var8, (InvoiceSubtype) var9, var10, var11, var12, var13, var14, var16);
                return var27;
            case AggregatePurchase:
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
            case InvoiceOtherSell:
            case InvoiceOtherPurchase:
            case InvoiceOther:
            case InvoiceOtherPurchaseInvoiceType:
            case InvoiceOtherSellInvoiceType:
                var27 = EMB.getInstance().ROQ(var17, var4, var5, var6, var7, (InvoiceOtherType) var8, (InvoiceOtherSubtype) var9, var10, var11, var12, var13, var14, var16);
                return var27;
            case ReceiptRecord:
            case ReceiptRecordVat:
                var27 = EMB.getInstance().HIG(var4, var5, var6, var7, (RecordType) var8);
                return var27;
            case Settlement:
            case SettlementVat:
                var27 = EMB.getInstance().HIJ(var4, var5, var6, var7, (SettlementType) var8);
                return var27;
            case Declaration:
            case DeclarationJPK:
            case DeclarationJPK_EWP:
            case DeclarationJPK_FA:
            case DeclarationJPK_KR:
            case DeclarationJPK_MAG:
            case DeclarationJPK_PKPIR:
            case DeclarationJPK_VAT:
            case DeclarationJPK_WB:
                var27 = EMB.getInstance().HIM(var4, var5, var6, var7, (DeclarationType) var8, (DeclarationSubtype) var9);
                return var27;
            case InvoiceRecord:
            case InvoiceRecordSell:
            case InvoiceRecordPurchase:
                var27 = EMB.getInstance().HIT(var4, var5, var6, var7, (InvoiceRecordType) var8);
                return var27;
            case Contractor:
                var27 = EMB.getInstance().QQJ(var4, var15, var16);
                return var27;
        }
    }

    public <_T extends ModelBusinessPeriodElement, _I extends Enum<_I>, _L extends Enum<_L>, _Q extends PeriodModelCriteria<_T, _I, _L>, _R extends EDF<_T>, _S extends List<_R>> ValueContainer2<Integer, _S> HKD(ProcessDefinitionBase var1, _Q var2) throws FFK, FFO {

        this.HKM(var1, var2.getTypeClass());
        EntityTypes var3 = EntityTypes.getByType(var2.getTypeClass());
        OrderType var4 = null;
        Integer var5 = null;
        Integer var6 = null;
        Enum var7 = null;
        Enum var8 = null;
        Period var9 = null;
        Settlement var10 = null;
        if (a.a.a.c.f.a.g.ModelElementCriteria.class.isAssignableFrom(var2.getClass())) {
            var4 = var2.getOrderType();
            var5 = var2.getPageSize();
            var6 = var2.getPageOffset();
        }

        if (ModelBusinessPeriodElementCriteria.class.isAssignableFrom(var2.getClass())) {
            var9 = var2.getPeriod();
        }

        if (ModelBusinessPeriodElementTypedCriteria.class.isAssignableFrom(var2.getClass())) {
            var7 = var2.getType();
            var8 = var2.getSubType();
        }

        if (PeriodModelCriteria.class.isAssignableFrom(var2.getClass())) {
            var10 = var2.getSettlement();
        }

        ValueContainer2 var11;
        switch (var3) {
            case Declaration:
            case DeclarationJPK:
            case DeclarationJPK_EWP:
            case DeclarationJPK_FA:
            case DeclarationJPK_KR:
            case DeclarationJPK_MAG:
            case DeclarationJPK_PKPIR:
            case DeclarationJPK_VAT:
            case DeclarationJPK_WB:
                var11 = EMB.getInstance().QQI(var4, var5, var6, var10, var9, (DeclarationType) var7, (DeclarationSubtype) var8);
                return var11;
            case InvoiceRecord:
            case InvoiceRecordSell:
            case InvoiceRecordPurchase:
                var11 = EMB.getInstance().QQK(var4, var5, var6, var10, var9, (InvoiceRecordType) var7);
                return var11;
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
        }
    }

    public <_T extends ModelBusinessTopElement> void HJZ(ProcessDefinitionBase var1, _T var2) throws FFK, FFO {

        this.HKA(var1, var2, null);

    }

    public <_T extends ModelBusinessTopElement> void HKA(ProcessDefinitionBase var1, _T var2, Settlement var3) throws FFK, FFO {

        this.HKM(var1, var2.getClass());
        EntityTypes var4 = EntityTypes.getByType(var2.getClass());
        switch (var4) {
            case InvoiceSell:
            case InvoiceSellCorrection:
            case InvoicePurchase:
            case AggregatePurchase:
                EMB.getInstance().HIA(SqlOperation.insert, (Invoice) var2);
                break;
            case InvoiceOtherSell:
            case InvoiceOtherPurchase:
                EMB.getInstance().RON(SqlOperation.insert, (InvoiceOther) var2);
                break;
            case Invoice:
            case InvoiceSellType:
            case InvoiceSellCorrectionType:
            case InvoicePurchaseInvoiceType:
            case InvoiceOther:
            case InvoiceOtherPurchaseInvoiceType:
            case InvoiceOtherSellInvoiceType:
            case ReceiptRecord:
            case Settlement:
            case Declaration:
            case DeclarationJPK:
            case InvoiceRecord:
            case InvoiceRecordSell:
            case InvoiceRecordPurchase:
            default:
                throw new FFI("Unexpected type [" + var4 + "]!");
            case ReceiptRecordVat:
                EMB.getInstance().HIE(SqlOperation.insert, (ReceiptRecord) var2);
                break;
            case SettlementVat:
                EMB.getInstance().HIH(SqlOperation.insert, (Settlement) var2);
                break;
            case DeclarationJPK_EWP:
            case DeclarationJPK_FA:
            case DeclarationJPK_KR:
            case DeclarationJPK_MAG:
            case DeclarationJPK_PKPIR:
            case DeclarationJPK_VAT:
            case DeclarationJPK_WB:
            case DeclarationJPK_STATUSTRACKER:
                EMB.getInstance().HIK(SqlOperation.insert, (Declaration) var2, var3);
                break;
            case Contractor:
                EMB.getInstance().HIO(SqlOperation.insert, (Contractor) var2);
        }

    }

    public <_T extends LW> void HJU(ProcessDefinitionBase var1, _T var2) throws FFK {

        this.HKM(var1, var2.getClass());
        UserModel var3 = UserModel.getByType(var2.getClass());
        switch (var3) {
            case UserData:
                EMB.getInstance().HHY(SqlOperation.insert, (UserData) var2);
                break;
            case ConfigurationProperties:
                EMB.getInstance().ROK(SqlOperation.insert, (ConfigurationProperties) var2, false);
                break;
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
        }

    }

    public <_T extends ModelBusinessTopElement> void HKB(ProcessDefinitionBase var1, _T var2) throws FFK, FFO {

        this.HKM(var1, var2.getClass());
        EntityTypes var3 = EntityTypes.getByType(var2.getClass());
        switch (var3) {
            case InvoiceSell:
            case InvoiceSellCorrection:
            case InvoicePurchase:
            case AggregatePurchase:
                EMB.getInstance().HIA(SqlOperation.update, (Invoice) var2);
                break;
            case InvoiceOtherSell:
            case InvoiceOtherPurchase:
                EMB.getInstance().RON(SqlOperation.update, (InvoiceOther) var2);
                break;
            case Invoice:
            case InvoiceSellType:
            case InvoiceSellCorrectionType:
            case InvoicePurchaseInvoiceType:
            case InvoiceOther:
            case InvoiceOtherPurchaseInvoiceType:
            case InvoiceOtherSellInvoiceType:
            case ReceiptRecord:
            case Settlement:
            case Declaration:
            case DeclarationJPK:
            case InvoiceRecord:
            case InvoiceRecordSell:
            case InvoiceRecordPurchase:
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
            case ReceiptRecordVat:
                EMB.getInstance().HIE(SqlOperation.update, (ReceiptRecord) var2);
                break;
            case SettlementVat:
                EMB.getInstance().HIH(SqlOperation.update, (Settlement) var2);
                break;
            case DeclarationJPK_EWP:
            case DeclarationJPK_FA:
            case DeclarationJPK_KR:
            case DeclarationJPK_MAG:
            case DeclarationJPK_PKPIR:
            case DeclarationJPK_VAT:
            case DeclarationJPK_WB:
            case DeclarationJPK_STATUSTRACKER:
                EMB.getInstance().HIK(SqlOperation.update, (Declaration) var2, null);
                break;
            case Contractor:
                EMB.getInstance().HIO(SqlOperation.update, (Contractor) var2);
        }

    }

    public <_T extends LW> void HJV(ProcessDefinitionBase var1, _T var2) throws FFK {

        this.HKM(var1, var2.getClass());
        UserModel var3 = UserModel.getByType(var2.getClass());
        switch (var3) {
            case UserData:
                EMB.getInstance().HHY(SqlOperation.update, (UserData) var2);
                break;
            case ConfigurationProperties:
                EMB.getInstance().ROK(SqlOperation.update, (ConfigurationProperties) var2, false);
                break;
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
        }

    }

    public <_T extends ModelBusinessTopElement> void HKC(ProcessDefinitionBase var1, _T var2) throws FFK, FFO {

        this.HKM(var1, var2.getClass());
        EntityTypes var3 = EntityTypes.getByType(var2.getClass());
        switch (var3) {
            case InvoiceSell:
            case InvoiceSellCorrection:
            case InvoicePurchase:
            case AggregatePurchase:
                EMB.getInstance().HIA(SqlOperation.delete, (Invoice) var2);
                break;
            case InvoiceOtherSell:
            case InvoiceOtherPurchase:
                EMB.getInstance().RON(SqlOperation.delete, (InvoiceOther) var2);
                break;
            case Invoice:
            case InvoiceSellType:
            case InvoiceSellCorrectionType:
            case InvoicePurchaseInvoiceType:
            case InvoiceOther:
            case InvoiceOtherPurchaseInvoiceType:
            case InvoiceOtherSellInvoiceType:
            case ReceiptRecord:
            case Settlement:
            case Declaration:
            case DeclarationJPK:
            case InvoiceRecord:
            case InvoiceRecordSell:
            case InvoiceRecordPurchase:
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
            case ReceiptRecordVat:
                EMB.getInstance().HIE(SqlOperation.delete, (ReceiptRecord) var2);
                break;
            case SettlementVat:
                EMB.getInstance().HIH(SqlOperation.delete, (Settlement) var2);
                break;
            case DeclarationJPK_EWP:
            case DeclarationJPK_FA:
            case DeclarationJPK_KR:
            case DeclarationJPK_MAG:
            case DeclarationJPK_PKPIR:
            case DeclarationJPK_VAT:
            case DeclarationJPK_WB:
            case DeclarationJPK_STATUSTRACKER:
                EMB.getInstance().HIK(SqlOperation.delete, (Declaration) var2, null);
                break;
            case Contractor:
                EMB.getInstance().HIO(SqlOperation.delete, (Contractor) var2);
        }

    }

    public <_T extends LW> void HJW(ProcessDefinitionBase var1, _T var2) throws FFK {

        this.HKM(var1, var2.getClass());
        UserModel var3 = UserModel.getByType(var2.getClass());
        switch (var3) {
            case UserData:
                EMB.getInstance().HHY(SqlOperation.delete, (UserData) var2);
                break;
            case ConfigurationProperties:
                EMB.getInstance().ROK(SqlOperation.delete, (ConfigurationProperties) var2, false);
                break;
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
        }

    }

    public <_T extends ModelBusinessTopElement> Integer getMaxDocumentIndex(ProcessDefinitionBase var1, Class<_T> var2, Period var3, Enum<?> var4, Enum<?> var5) throws FFK, FFO {

        this.HKM(var1, var2);
        EntityTypes var6 = EntityTypes.getByType(var2);
        Integer var7;
        switch (var6) {
            case Declaration:
            case DeclarationJPK:
            case DeclarationJPK_EWP:
            case DeclarationJPK_FA:
            case DeclarationJPK_KR:
            case DeclarationJPK_MAG:
            case DeclarationJPK_PKPIR:
            case DeclarationJPK_VAT:
            case DeclarationJPK_WB:
                var7 = EMB.getInstance().getMaxDocumentIndexForDeclarations(var3, (DeclarationType) var4, (DeclarationSubtype) var5);
                return var7;
            case InvoiceRecord:
            case InvoiceRecordSell:
            case InvoiceRecordPurchase:
                var7 = EMB.getInstance().getMaxDocumentIndexForInvoiceRecords(var3, (InvoiceRecordType) var4);
                return var7;
            default:
                throw new FFI("Unexpected type [" + var6 + "]!");
        }
    }

    public <_T extends Dictionary> void HKF(ProcessDefinitionBase var1, _T var2) throws FFK, FFO {

        this.HKM(var1, var2.getClass());
        EMB.getInstance().HIV(SqlOperation.insert, var2);

    }

    public <_T extends Dictionary> void HKG(ProcessDefinitionBase var1, _T var2) throws FFK, FFO {

        this.HKM(var1, var2.getClass());
        EMB.getInstance().HIV(SqlOperation.update, var2);

    }

    public <_T extends Dictionary> void HKH(ProcessDefinitionBase var1, _T var2) throws FFK, FFO {

        this.HKM(var1, var2.getClass());
        EMB.getInstance().HIV(SqlOperation.delete, var2);

    }

    public <_R extends Dictionary, _S extends List<_R>> _S HKI(ProcessDefinitionBase var1, String var2, String var3) throws FFK, FFO {

        List var4;
        this.HKM(var1, Dictionary.class);
        var4 = EMB.getInstance().HIX(var2, var3);

        return (_S) var4;
    }

    public void HKL(ProcessDefinitionBase var1) throws FFK {

        EMB.getInstance().HIY();

    }

    public void resetData(ProcessDefinitionBase var1) throws FFK {

        EMB.getInstance().HIZ();

    }

    public String HKJ(Date var1, String var2) throws FFK {

        String var3;
        var3 = EMB.getInstance().getReferenceByPattern(var1, var2);

        return var3;
    }

    public String ROI(Date var1, String var2, boolean var3) throws FFK {

        String var4;
        var4 = EMB.getInstance().getReferenceByPatternDemo(var1, var2, var3);

        return var4;
    }

    public Map<String, Map<Period, Integer>> getSequences() throws FFK {

        Map var1;
        var1 = EMB.getInstance().getSequences();

        return var1;
    }

    public void ROJ(Period var1, String var2, Integer var3, Integer var4) throws FFK {

        EMB.getInstance().ROR(var1, var2, var3, var4);

    }

    public <_T extends ModelBusinessTopElement, _Q extends ModelBusinessElementCriteria<_T>, _R extends EDF<_T>, _S extends List<_R>> ValueContainer2<Integer, _S> HKE(ProcessDefinitionBase var1, _Q var2) throws FFK, FFO {
        return null;
    }
}
