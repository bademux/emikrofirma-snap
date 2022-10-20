package a.a.a.c.c.b.b.a;

import a.a.a.b.a.a.OrderType;
import a.a.a.b.a.a.FDO;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.b.b.EMU;
import a.a.a.c.e.a.d.TwoValueBox;
import a.a.a.c.f.KU;
import a.a.a.c.f.LN;
import a.a.a.c.f.a.II;
import a.a.a.c.f.a.IK;
import a.a.a.c.f.a.IL;
import a.a.a.c.f.a.IM;
import a.a.a.c.f.a.a.IJE;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.d.AGWW;
import a.a.a.c.f.a.d.HJ;
import a.a.a.c.f.a.d.HM;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.e.a.IH;
import a.a.a.c.f.a.f.a.IN;
import a.a.a.c.f.a.f.a.IQ;
import a.a.a.c.f.a.g.*;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.a.n.QSG;
import a.a.a.c.f.a.n.QSH;
import a.a.a.c.f.a.n.QSQ;
import a.a.a.c.f.a.n.QSR;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.f.c.LU;
import a.a.a.c.f.c.LW;
import a.a.a.c.f.c.a.LP;
import a.a.a.c.f.c.b.LY;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EMV implements EMU {
    public EMV() {

    }

    private void HKM(ELZ var1, Class<? extends KU> var2) {

        Iterator var3 = var1.getObjectClasses().iterator();

        LN.LO var5;
        do {
            if (!var3.hasNext()) {
                throw new FFI("Element [" + var2 + "] not registered for process [" + var1.getName() + "]!");
            }

            LN var4 = (LN) var3.next();
            var5 = var4.getType();
        } while (!this.HKM(var5, var2));

    }

    private boolean HKM(LN.LO var1, Class<? extends KU> var2) {

        boolean var5;
        boolean var9;
        if (var1.getClazz().equals(var2)) {
            var9 = true;
            return var9;
        }

        Iterator var3 = var1.getChildren().iterator();

        LN.LO var4;
        do {
            if (!var3.hasNext()) {
                var9 = false;
                return var9;
            }

            var4 = (LN.LO) var3.next();
        } while (!this.HKM(var4, var2));

        var5 = true;

        return var5;
    }

    public <_T extends LW, _Q extends JB<_T>> _T HJT(ELZ var1, _Q var2) throws FFK {

        this.HKM(var1, var2.getTypeClass());
        IM var3 = IM.getByType(var2.getClass());
        LU var4 = LU.getByType(var2.getTypeClass());
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
                LY var10 = EMB.getInstance().HHW(var5);
                return (_T) var10;
            case ConfigurationProperties:
                LP var6 = EMB.getInstance().HHU();
                return (_T) var6;
            default:
                throw new FFI("Unexpected type [" + var4 + "]!");
        }
    }

    public <_A extends HN<_B>, _B extends HO> _A HJX(ELZ var1, Class<_A> var2) throws FFK, FFO {

        try {
            this.HKM(var1, var2);
            II var3 = II.getByType(var2);
            HN var4;
            LY var5;
            HN var6;
            switch (var3) {
                case InvoiceSell:
                    var4 = var2.newInstance();
                    var5 = EMB.getInstance().HHV();
                    var4.DAR().setValue(var5.DFF().getValue());
                    var4.DBC().setValue(var5.DEW().getValue());
                    ((HY) var4).setUsingInvoicingDate(new JS(true));
                    var6 = var4;
                    return (_A) var6;
                case InvoiceSellCorrection:
                    var4 = var2.newInstance();
                    var5 = EMB.getInstance().HHV();
                    var4.DAR().setValue(var5.DFF().getValue());
                    var4.DBC().setValue(var5.DEW().getValue());
                    ((HY) var4).setUsingInvoicingDate(new JS(true));
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

    public <_A extends QSG<_B>, _B extends QSH> _A ROG(ELZ var1, Class<_A> var2) throws FFK, FFO {

        try {
            this.HKM(var1, var2);
            II var3 = II.getByType(var2);
            QSG var4;
            LY var5;
            QSG var6;
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

    public <_T extends IL> void ROH(EDF<_T> var1, Class<_T> var2) throws FFK, FFO {

        II var3 = II.getByType(var2);
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

    public <_T extends IL, _Q extends IW<_T>, _R extends EDF<_T>, _S extends List<_R>> TwoValueBox<Integer, _S> HJY(ELZ var1, _Q var2) throws FFK, FFO {

        this.HKM(var1, var2.getTypeClass());
        II var3 = II.getByType(var2.getTypeClass());
        OrderType var4 = null;
        Integer var5 = null;
        Integer var6 = null;
        JN var7 = null;
        Enum var8 = null;
        Enum var9 = null;
        KE var10 = null;
        KA var11 = null;
        KA var12 = null;
        TwoValueBox var13 = null;
        TwoValueBox var14 = null;
        Integer var15 = null;
        String var16 = null;
        QSW var17 = null;
        if (JA.class.isAssignableFrom(var2.getClass())) {
            var4 = var2.getOrderType();
            var5 = var2.getPageSize();
            var6 = var2.getPageOffset();
        }

        if (IX.class.isAssignableFrom(var2.getClass())) {
            IX var18 = (IX) var2;
            var7 = var18.getPeriod();
        }

        if (IY.class.isAssignableFrom(var2.getClass())) {
            IY var22 = (IY) var2;
            var8 = var22.getType();
            var9 = var22.getSubType();
        }

        if (IZ.class.isAssignableFrom(var2.getClass())) {
            IZ var23 = (IZ) var2;
            var10 = var23.getRefId();
        }

        if (IU.class.isAssignableFrom(var2.getClass())) {
            IU var24 = (IU) var2;
            var11 = var24.getIssuerNumber();
            var12 = var24.getContractorNIP();
            var13 = var24.getCreationDate();
            var14 = var24.getTransactionDate();
            var16 = var24.getSearch();
            if (var24.getState() != null) {
                var17 = var24.getState();
            }
        }

        if (QSS.class.isAssignableFrom(var2.getClass())) {
            QSS var25 = (QSS) var2;
            var11 = var25.getIssuerNumber();
            var12 = var25.getContractorNIP();
            var13 = var25.getCreationDate();
            var14 = var25.getTransactionDate();
            var16 = var25.getSearch();
            if (var25.getState() != null) {
                var17 = var25.getState();
            }
        }

        if (AGYN.class.isAssignableFrom(var2.getClass())) {
            AGYN var26 = (AGYN) var2;
            var15 = var26.getHash();
            var16 = var26.getSearch();
        }

        TwoValueBox var27;
        switch (var3) {
            case InvoiceSell:
            case InvoiceSellCorrection:
            case InvoicePurchase:
            case Invoice:
            case InvoiceSellType:
            case InvoiceSellCorrectionType:
            case InvoicePurchaseInvoiceType:
                var27 = EMB.getInstance().ROM(var17, var4, var5, var6, var7, (IB) var8, (IA) var9, var10, var11, var12, var13, var14, var16);
                return var27;
            case AggregatePurchase:
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
            case InvoiceOtherSell:
            case InvoiceOtherPurchase:
            case InvoiceOther:
            case InvoiceOtherPurchaseInvoiceType:
            case InvoiceOtherSellInvoiceType:
                var27 = EMB.getInstance().ROQ(var17, var4, var5, var6, var7, (QSR) var8, (QSQ) var9, var10, var11, var12, var13, var14, var16);
                return var27;
            case ReceiptRecord:
            case ReceiptRecordVat:
                var27 = EMB.getInstance().HIG(var4, var5, var6, var7, (IQ) var8);
                return var27;
            case Settlement:
            case SettlementVat:
                var27 = EMB.getInstance().HIJ(var4, var5, var6, var7, (JH) var8);
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
                var27 = EMB.getInstance().HIM(var4, var5, var6, var7, (HM) var8, (AGWW) var9);
                return var27;
            case InvoiceRecord:
            case InvoiceRecordSell:
            case InvoiceRecordPurchase:
                var27 = EMB.getInstance().HIT(var4, var5, var6, var7, (IH) var8);
                return var27;
            case Contractor:
                var27 = EMB.getInstance().QQJ(var4, var15, var16);
                return var27;
        }
    }

    public <_T extends IK, _I extends Enum<_I>, _L extends Enum<_L>, _Q extends EYD<_T, _I, _L>, _R extends EDF<_T>, _S extends List<_R>> TwoValueBox<Integer, _S> HKD(ELZ var1, _Q var2) throws FFK, FFO {

        this.HKM(var1, var2.getTypeClass());
        II var3 = II.getByType(var2.getTypeClass());
        OrderType var4 = null;
        Integer var5 = null;
        Integer var6 = null;
        Enum var7 = null;
        Enum var8 = null;
        JN var9 = null;
        JF var10 = null;
        if (JA.class.isAssignableFrom(var2.getClass())) {
            var4 = var2.getOrderType();
            var5 = var2.getPageSize();
            var6 = var2.getPageOffset();
        }

        if (IX.class.isAssignableFrom(var2.getClass())) {
            var9 = var2.getPeriod();
        }

        if (IY.class.isAssignableFrom(var2.getClass())) {
            var7 = var2.getType();
            var8 = var2.getSubType();
        }

        if (EYD.class.isAssignableFrom(var2.getClass())) {
            var10 = var2.getSettlement();
        }

        TwoValueBox var11;
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
                var11 = EMB.getInstance().QQI(var4, var5, var6, var10, var9, (HM) var7, (AGWW) var8);
                return var11;
            case InvoiceRecord:
            case InvoiceRecordSell:
            case InvoiceRecordPurchase:
                var11 = EMB.getInstance().QQK(var4, var5, var6, var10, var9, (IH) var7);
                return var11;
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
        }
    }

    public <_T extends IL> void HJZ(ELZ var1, _T var2) throws FFK, FFO {

        this.HKA(var1, var2, null);

    }

    public <_T extends IL> void HKA(ELZ var1, _T var2, JF var3) throws FFK, FFO {

        this.HKM(var1, var2.getClass());
        II var4 = II.getByType(var2.getClass());
        switch (var4) {
            case InvoiceSell:
            case InvoiceSellCorrection:
            case InvoicePurchase:
            case AggregatePurchase:
                EMB.getInstance().HIA(FDO.insert, (HN) var2);
                break;
            case InvoiceOtherSell:
            case InvoiceOtherPurchase:
                EMB.getInstance().RON(FDO.insert, (QSG) var2);
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
                EMB.getInstance().HIE(FDO.insert, (IN) var2);
                break;
            case SettlementVat:
                EMB.getInstance().HIH(FDO.insert, (JF) var2);
                break;
            case DeclarationJPK_EWP:
            case DeclarationJPK_FA:
            case DeclarationJPK_KR:
            case DeclarationJPK_MAG:
            case DeclarationJPK_PKPIR:
            case DeclarationJPK_VAT:
            case DeclarationJPK_WB:
            case DeclarationJPK_STATUSTRACKER:
                EMB.getInstance().HIK(FDO.insert, (HJ) var2, var3);
                break;
            case Contractor:
                EMB.getInstance().HIO(FDO.insert, (HI) var2);
        }

    }

    public <_T extends LW> void HJU(ELZ var1, _T var2) throws FFK {

        this.HKM(var1, var2.getClass());
        LU var3 = LU.getByType(var2.getClass());
        switch (var3) {
            case UserData:
                EMB.getInstance().HHY(FDO.insert, (LY) var2);
                break;
            case ConfigurationProperties:
                EMB.getInstance().ROK(FDO.insert, (LP) var2, false);
                break;
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
        }

    }

    public <_T extends IL> void HKB(ELZ var1, _T var2) throws FFK, FFO {

        this.HKM(var1, var2.getClass());
        II var3 = II.getByType(var2.getClass());
        switch (var3) {
            case InvoiceSell:
            case InvoiceSellCorrection:
            case InvoicePurchase:
            case AggregatePurchase:
                EMB.getInstance().HIA(FDO.update, (HN) var2);
                break;
            case InvoiceOtherSell:
            case InvoiceOtherPurchase:
                EMB.getInstance().RON(FDO.update, (QSG) var2);
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
                EMB.getInstance().HIE(FDO.update, (IN) var2);
                break;
            case SettlementVat:
                EMB.getInstance().HIH(FDO.update, (JF) var2);
                break;
            case DeclarationJPK_EWP:
            case DeclarationJPK_FA:
            case DeclarationJPK_KR:
            case DeclarationJPK_MAG:
            case DeclarationJPK_PKPIR:
            case DeclarationJPK_VAT:
            case DeclarationJPK_WB:
            case DeclarationJPK_STATUSTRACKER:
                EMB.getInstance().HIK(FDO.update, (HJ) var2, null);
                break;
            case Contractor:
                EMB.getInstance().HIO(FDO.update, (HI) var2);
        }

    }

    public <_T extends LW> void HJV(ELZ var1, _T var2) throws FFK {

        this.HKM(var1, var2.getClass());
        LU var3 = LU.getByType(var2.getClass());
        switch (var3) {
            case UserData:
                EMB.getInstance().HHY(FDO.update, (LY) var2);
                break;
            case ConfigurationProperties:
                EMB.getInstance().ROK(FDO.update, (LP) var2, false);
                break;
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
        }

    }

    public <_T extends IL> void HKC(ELZ var1, _T var2) throws FFK, FFO {

        this.HKM(var1, var2.getClass());
        II var3 = II.getByType(var2.getClass());
        switch (var3) {
            case InvoiceSell:
            case InvoiceSellCorrection:
            case InvoicePurchase:
            case AggregatePurchase:
                EMB.getInstance().HIA(FDO.delete, (HN) var2);
                break;
            case InvoiceOtherSell:
            case InvoiceOtherPurchase:
                EMB.getInstance().RON(FDO.delete, (QSG) var2);
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
                EMB.getInstance().HIE(FDO.delete, (IN) var2);
                break;
            case SettlementVat:
                EMB.getInstance().HIH(FDO.delete, (JF) var2);
                break;
            case DeclarationJPK_EWP:
            case DeclarationJPK_FA:
            case DeclarationJPK_KR:
            case DeclarationJPK_MAG:
            case DeclarationJPK_PKPIR:
            case DeclarationJPK_VAT:
            case DeclarationJPK_WB:
            case DeclarationJPK_STATUSTRACKER:
                EMB.getInstance().HIK(FDO.delete, (HJ) var2, null);
                break;
            case Contractor:
                EMB.getInstance().HIO(FDO.delete, (HI) var2);
        }

    }

    public <_T extends LW> void HJW(ELZ var1, _T var2) throws FFK {

        this.HKM(var1, var2.getClass());
        LU var3 = LU.getByType(var2.getClass());
        switch (var3) {
            case UserData:
                EMB.getInstance().HHY(FDO.delete, (LY) var2);
                break;
            case ConfigurationProperties:
                EMB.getInstance().ROK(FDO.delete, (LP) var2, false);
                break;
            default:
                throw new FFI("Unexpected type [" + var3 + "]!");
        }

    }

    public <_T extends IL> Integer getMaxDocumentIndex(ELZ var1, Class<_T> var2, JN var3, Enum<?> var4, Enum<?> var5) throws FFK, FFO {

        this.HKM(var1, var2);
        II var6 = II.getByType(var2);
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
                var7 = EMB.getInstance().getMaxDocumentIndexForDeclarations(var3, (HM) var4, (AGWW) var5);
                return var7;
            case InvoiceRecord:
            case InvoiceRecordSell:
            case InvoiceRecordPurchase:
                var7 = EMB.getInstance().getMaxDocumentIndexForInvoiceRecords(var3, (IH) var4);
                return var7;
            default:
                throw new FFI("Unexpected type [" + var6 + "]!");
        }
    }

    public <_T extends IJE> void HKF(ELZ var1, _T var2) throws FFK, FFO {

        this.HKM(var1, var2.getClass());
        EMB.getInstance().HIV(FDO.insert, var2);

    }

    public <_T extends IJE> void HKG(ELZ var1, _T var2) throws FFK, FFO {

        this.HKM(var1, var2.getClass());
        EMB.getInstance().HIV(FDO.update, var2);

    }

    public <_T extends IJE> void HKH(ELZ var1, _T var2) throws FFK, FFO {

        this.HKM(var1, var2.getClass());
        EMB.getInstance().HIV(FDO.delete, var2);

    }

    public <_R extends IJE, _S extends List<_R>> _S HKI(ELZ var1, String var2, String var3) throws FFK, FFO {

        List var4;
        this.HKM(var1, IJE.class);
        var4 = EMB.getInstance().HIX(var2, var3);

        return (_S) var4;
    }

    public void HKL(ELZ var1) throws FFK {

        EMB.getInstance().HIY();

    }

    public void resetData(ELZ var1) throws FFK {

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

    public Map<String, Map<JN, Integer>> getSequences() throws FFK {

        Map var1;
        var1 = EMB.getInstance().getSequences();

        return var1;
    }

    public void ROJ(JN var1, String var2, Integer var3, Integer var4) throws FFK {

        EMB.getInstance().ROR(var1, var2, var3, var4);

    }

    public <_T extends IL, _Q extends IW<_T>, _R extends EDF<_T>, _S extends List<_R>> TwoValueBox<Integer, _S> HKE(ELZ var1, _Q var2) throws FFK, FFO {
        return null;
    }
}
