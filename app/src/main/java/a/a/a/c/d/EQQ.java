package a.a.a.c.d;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.b.EDF;
import a.a.a.c.d.f.*;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.II;
import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.a.e.InvoicePurchase;
import a.a.a.c.f.a.e.InvoiceSell;
import a.a.a.c.f.a.e.HY;
import a.a.a.c.f.a.e.a.*;
import a.a.a.c.f.a.f.a.ReceiptRecord;
import a.a.a.c.f.a.f.a.IP;
import a.a.a.c.f.a.f.a.ReceiptRecordVat;
import a.a.a.c.f.a.n.InvoiceOther;
import a.a.a.c.f.a.n.InvoiceOtherPurchase;
import a.a.a.c.f.a.n.InvoiceOtherSell;
import a.a.a.c.f.a.n.QSQ;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.b.c.a.KM;
import a.a.a.c.f.c.b.UserData;

import java.math.BigDecimal;
import java.util.*;

public class EQQ {
    public EQQ() {
    }

    public static Set<InvoiceRecord> RHZ(Period var0, UserData var1, List<EDF<Invoice<?>>> var2, List<EDF<ReceiptRecord>> var3, List<EDF<InvoiceOther<?>>> var4) throws FFK {

        HashSet var5 = new HashSet();
        Period var6 = var0.DDN();
        InvoiceRecordSell var7 = new InvoiceRecordSell();
        var7.setPeriod(var6);
        var7.setUserDataVersion(var1.getVersion());
        var5.add(var7);
        InvoiceRecordPurchase var8 = new InvoiceRecordPurchase();
        var8.setPeriod(var6);
        var8.setUserDataVersion(var1.getVersion());
        var5.add(var8);
        Iterator var9 = var2.iterator();

        EDF var10;
        while (var9.hasNext()) {
            var10 = (EDF) var9.next();
            Invoice var11 = (Invoice) var10.getModelBaseElementWithIdObject();
            HQY(var11, var7, var8);
        }

        var9 = var3.iterator();

        while (var9.hasNext()) {
            var10 = (EDF) var9.next();
            HQZ(var7, HQX((ReceiptRecord) var10.getModelBaseElementWithIdObject()));
        }

        var9 = var4.iterator();

        while (var9.hasNext()) {
            var10 = (EDF) var9.next();
            RIA((InvoiceOther) var10.getModelBaseElementWithIdObject(), var7, var8);
        }

        HashSet var15 = var5;
        return var15;
    }

    private static InvoiceRecordElement HQX(ReceiptRecord var0) {
        if (!(var0 instanceof ReceiptRecordVat var1)) {
            throw new UnsupportedOperationException();
        } else {
            InvoiceRecordElement var2 = new InvoiceRecordElement();
            var2.setDate(var1.getCreationDate());
            var2.setRefId(var1.getRefId());
            var2.setNet(var1.getNet());
            var2.setVat(var1.getVat());
            var2.setGross(var1.getGross());
            HashMap var3 = new HashMap();
            KL[] var4 = ReceiptRecord.AMJ;
            int var5 = var4.length;

            for (int var6 = 0; var6 < var5; ++var6) {
                KL var7 = var4[var6];
                ValueContainer2 var8 = new ValueContainer2();
                var8.setFirstValue(new JR());
                var8.setSecondValue(new JR());
                var3.put(var7, var8);
            }

            Iterator var11 = var1.getReceiptRecordElements().iterator();

            while (var11.hasNext()) {
                IP var12 = (IP) var11.next();
                ValueContainer2 var13 = (ValueContainer2) var3.get(var12.getTaxRate().getValue());
                BigDecimal var14 = var12.DCF().getValue();
                BigDecimal var15 = var12.DCG().getValue();
                BigDecimal var9 = ((JR) var13.getFirstValue()).getValue();
                BigDecimal var10 = ((JR) var13.getSecondValue()).getValue();
                if (!BigDecimal.ZERO.equals(var14)) {
                    if (var9 == null) {
                        var9 = BigDecimal.ZERO;
                        var10 = BigDecimal.ZERO;
                    }

                    var9 = var9.add(var14);
                    var10 = var10.add(var15);
                }

                ((JR) var13.getFirstValue()).setValue(var9);
                ((JR) var13.getSecondValue()).setValue(var10);
            }

            var2.setVat23((ValueContainer2) var3.get(KL.RATE_23));
            var2.setVat8((ValueContainer2) var3.get(KL.RATE_8));
            var2.setVat5((ValueContainer2) var3.get(KL.RATE_5));
            var2.setVat4((ValueContainer2) var3.get(KL.RATE_4));
            var2.setVat0((ValueContainer2) var3.get(KL.RATE_0));
            var2.setVatNp((ValueContainer2) var3.get(KL.NP));
            var2.setVatZw((ValueContainer2) var3.get(KL.ZW));
            return var2;
        }
    }

    private static void HQY(Invoice<?> var0, InvoiceRecord var1, InvoiceRecord var2) {
        II var3 = II.getByType(var0.getClass());
        EQZ var4 = null;
        InvoiceRecordElement var11;
        switch (var3) {
            case InvoiceSell:
                var11 = new InvoiceRecordElement();
                var11.HGZ().setValue(false);
                ERA var10 = new ERA(var0);
                var11.setRefId(var0.getRefId());
                var11.setCreationDate(var0.DAT().DEF());
                var11.setTransactionDate(var0.DAU().DEF());
                var11.setDate(((HY) var0).getInvoicingDate());
                var11.setContractor(((InvoiceSell) var0).getContractor());
                setBasicVatPricesForInvoiceRecordElement(var11, var10.getForAll());
                if (var10.HRL()) {
                    var11.setVatOo23(new ValueContainer2(new JR(var10.getForAll().getVatOo23Amount()), new JR(var10.getForAll().getVatOo23Amount() != null ? BigDecimal.ZERO : null)));
                    var11.setVatOo8(new ValueContainer2(new JR(var10.getForAll().getVatOo8Amount()), new JR(var10.getForAll().getVatOo8Amount() != null ? BigDecimal.ZERO : null)));
                }

                HQZ(var1, var11);
                break;
            case InvoiceSellCorrection:
                var11 = new InvoiceRecordElement();
                var11.HGZ().setValue(false);
                ERE var9 = new ERE(var0);
                var11.setRefId(var0.getRefId());

                Invoice var12;
                for (var12 = var0; var12.getParentInvoiceOnlyActive() != null; var12 = var12.getParentInvoiceOnlyActive()) {
                }

                var11.setCreationDate(var0.DAT().DEF());
                var11.setTransactionDate(var12.DAU().DEF());
                var11.setDate(((HY) var0).getInvoicingDate());
                var11.setContractor(((InvoiceSell) var12).getContractor());
                setBasicVatPricesForInvoiceRecordElement(var11, var9.getForAll());
                if (var9.HRL()) {
                    var11.setVatOo23(new ValueContainer2(new JR(var9.getForAll().getVatOo23Amount()), new JR(var9.getForAll().getVatOo23Amount() != null ? BigDecimal.ZERO : null)));
                    var11.setVatOo8(new ValueContainer2(new JR(var9.getForAll().getVatOo8Amount()), new JR(var9.getForAll().getVatOo8Amount() != null ? BigDecimal.ZERO : null)));
                }

                HQZ(var1, var11);
                break;
            case InvoicePurchase:
            case AggregatePurchase:
                InvoiceRecordElementPurchase var5 = new InvoiceRecordElementPurchase();
                var5.HGZ().setValue(false);
                var4 = new EQZ(var0);
                var5.setRefId(var0.getRefId());
                InvoicePurchase var6 = (InvoicePurchase) var0;
                var5.setTransactionDate(var0.getTransactionDate().DEF());
                var5.setReceiveDate(var6.getReceiveDate().DEF());
                var5.setCreationDate(var0.getCreationDate().DEF());
                InvoiceRecordElementPurchase var7 = new InvoiceRecordElementPurchase();
                var7.setRefId(var0.getRefId());
                var7.setTransactionDate(var0.getTransactionDate().DEF());
                var7.setReceiveDate(var6.getReceiveDate().DEF());
                var7.setCreationDate(var0.getCreationDate().DEF());
                if (var6.getIsAggregatePurchase() != null && var6.getIsAggregatePurchase()) {
                    var5.setIsAggregatePurchase(true);
                    var7.setIsAggregatePurchase(true);
                } else {
                    var5.setIsAggregatePurchase(false);
                    var7.setIsAggregatePurchase(false);
                }

                EQZ var8 = var4;
                if (!var8.HRN()) {
                    HRB(var5, var4, var8.getForGeneralGoods(), var0, KM.acquisition_of_general_goods);
                    HQZ(var2, var5);
                    if (var8.getForGeneralGoods().getInvoiceIsOo()) {
                        HQZ(var1, HRA(var5));
                    }
                }

                if (!var8.isForFixedAssetsEmpty()) {
                    HRB(var7, var4, var8.getForFixedAssets(), var0, KM.acquisition_of_fixed_assets);
                    HQZ(var2, var7);
                    if (var8.getForFixedAssets().getInvoiceIsOo()) {
                        HQZ(var1, HRA(var7));
                    }
                }
                break;
            default:
                throw new FFI("Unimplemented type [" + var3 + "]!");
        }

    }

    private static void HQZ(InvoiceRecord var0, InvoiceRecordElement var1) {
        var0.setGross(new JR(var0.QQR().getValue().add(var1.QRG().getValue())));
        var0.setNet(new JR(var0.QQS().getValue().add(var1.QRH().getValue())));
        var0.setVat(new JR(var0.QQT().getValue().add(var1.QRI().getValue())));
        var0.setVat23(ERD.HRV(var0.QQU(), var1.QRJ()));
        var0.setVat8(ERD.HRV(var0.QQV(), var1.QRK()));
        var0.setVat5(ERD.HRV(var0.QQW(), var1.QRL()));
        var0.setVat4(ERD.HRV(var0.QQX(), var1.QRM()));
        var0.setVat0(ERD.HRV(var0.QQY(), var1.QRN()));
        var0.setVatZw(ERD.HRV(var0.QQZ(), var1.QRO()));
        var0.setVatNp(ERD.HRV(var0.QRA(), var1.QRP()));
        var0.setVatOo23(ERD.HRV(var0.QRB(), var1.QRQ()));
        var0.setVatOo8(ERD.HRV(var0.QRC(), var1.QRR()));
        var0.getInvoiceRecordElements().add(var1);
    }

    private static InvoiceRecordElement HRA(InvoiceRecordElement var0) {
        InvoiceRecordElement var1 = new InvoiceRecordElement();
        var1.HGZ().setValue(true);
        var1.setContractor(var0.getContractor());
        var1.setDate(var0.QRF());
        var1.setCreationDate(var0.AICN());
        var1.setTransactionDate(var0.AICO());
        var1.setReceiveDate(var0.AICP());
        var1.setRefId(var0.HGX());
        BigDecimal var2 = Optional.ofNullable(var0.QRQ().getFirstValue().getValue()).orElse(BigDecimal.ZERO);
        BigDecimal var3 = Optional.ofNullable(var0.QRQ().getSecondValue().getValue()).orElse(BigDecimal.ZERO);
        var2 = var2.add(Optional.ofNullable(var0.QRR().getFirstValue().getValue()).orElse(BigDecimal.ZERO));
        var3 = var3.add(Optional.ofNullable(var0.QRR().getSecondValue().getValue()).orElse(BigDecimal.ZERO));
        var1.setNet(new JR(var2));
        var1.setGross(new JR(var2.add(var3)));
        var1.setVat(new JR(var3));
        var1.setVat23(new ValueContainer2(new JR(), new JR()));
        var1.setVat8(new ValueContainer2(new JR(), new JR()));
        var1.setVat5(new ValueContainer2(new JR(), new JR()));
        var1.setVat4(new ValueContainer2(new JR(), new JR()));
        var1.setVat0(new ValueContainer2(new JR(), new JR()));
        var1.setVatZw(new ValueContainer2(new JR(), new JR()));
        var1.setVatNp(new ValueContainer2(new JR(), new JR()));
        var1.setVatOo23(var0.QRQ());
        var1.setVatOo8(var0.QRR());
        return var1;
    }

    private static void HRB(InvoiceRecordElement var0, EQZ var1, ERB var2, Invoice<?> var3, KM var4) {
        setBasicVatPricesForInvoiceRecordElement(var0, var2);
        var0.setDate(((InvoicePurchase) var3).getInvoicingDate());
        if (var0 instanceof InvoiceRecordElementPurchase) {
            ((InvoiceRecordElementPurchase) var0).DCD().setValue(var4);
        }

        var0.setContractor(((InvoicePurchase) var3).getContractor());
        if (var1.HRL()) {
            BigDecimal var5 = null;
            BigDecimal var6 = null;
            if (var1 instanceof EQZ && KM.acquisition_of_general_goods.equals(var4)) {
                var5 = var1.getForGeneralGoods().getVatOo23Amount();
                var6 = var1.getForGeneralGoods().getVatOo8Amount();
            } else {
                var5 = var1.getForFixedAssets().getVatOo23Amount();
                var6 = var1.getForFixedAssets().getVatOo8Amount();
            }

            var0.setVatOo23(new ValueContainer2(new JR(var5), new JR(var2.getVatOo23Tax())));
            var0.setVatOo8(new ValueContainer2(new JR(var6), new JR(var2.getVatOo8Tax())));
        }

    }

    private static void setBasicVatPricesForInvoiceRecordElement(InvoiceRecordElement var0, ERB var1) {
        var0.setNet(new JR(var1.getNetPrice()));
        if (var1.getInvoiceIsOo() && !(var0 instanceof InvoiceRecordElementPurchase)) {
            BigDecimal var2 = BigDecimal.ZERO;
            BigDecimal var3 = BigDecimal.ZERO;
            BigDecimal var4 = BigDecimal.ZERO;
            if (var1.getVatPrice() != null) {
                var2 = var1.getVatPrice();
            }

            if (var1.getVatOo23Tax() != null) {
                var3 = var1.getVatOo23Tax();
            }

            if (var1.getVatOo8Tax() != null) {
                var4 = var1.getVatOo8Tax();
            }

            BigDecimal var5 = var3.add(var4);
            var0.setGross(new JR(var1.getGrossPrice().subtract(var5)));
            var0.setVat(new JR(var2.subtract(var5)));
        } else {
            var0.setGross(new JR(var1.getGrossPrice()));
            var0.setVat(new JR(var1.getVatPrice()));
        }

        var0.setVat23(new ValueContainer2(new JR(var1.getVat23Amount()), new JR(var1.getVat23Tax())));
        var0.setVat8(new ValueContainer2(new JR(var1.getVat8Amount()), new JR(var1.getVat8Tax())));
        var0.setVat5(new ValueContainer2(new JR(var1.getVat5Amount()), new JR(var1.getVat5Tax())));
        var0.setVat4(new ValueContainer2(new JR(var1.getVat4Amount()), new JR(var1.getVat4Tax())));
        var0.setVat0(new ValueContainer2(new JR(var1.getVat0Amount()), new JR(var1.getVat0Tax())));
        var0.setVatZw(new ValueContainer2(new JR(var1.getVatZwAmount()), new JR(var1.getVatZwTax())));
        var0.setVatNp(new ValueContainer2(new JR(var1.getVatNpAmount()), new JR(var1.getProperVatNpTax())));
    }

    private static void RIA(InvoiceOther<?> var0, InvoiceRecord var1, InvoiceRecord var2) {

        EQZ var3 = null;
        switch (var0.getInvoiceOtherSubType()) {
            case SELL_REASON_1:
            case SELL_REASON_2:
            case SELL_REASON_3:
            case SELL_REASON_4:
                InvoiceRecordElement var9 = new InvoiceRecordElement();
                var9.setInvoiceOtherSubType(var0.getInvoiceOtherSubType());
                var9.HGZ().setValue(false);
                ERA var8 = new ERA(var0);
                var9.setRefId(var0.getRefId());
                if (var0.getInvoiceOtherSubType().equals(QSQ.SELL_REASON_3)) {
                    var9.RIK().setValue(true);
                } else if (var0.getInvoiceOtherSubType().equals(QSQ.SELL_REASON_4)) {
                    var9.RIL().setValue(true);
                } else if (var0.getInvoiceOtherSubType().equals(QSQ.SELL_REASON_1)) {
                    var9.RII().setValue(true);
                } else if (var0.getInvoiceOtherSubType().equals(QSQ.SELL_REASON_2)) {
                    var9.RIJ().setValue(true);
                }

                var9.setCreationDate(var0.RIS().DEF());
                var9.setTransactionDate(null);
                var9.setDate(((InvoiceOtherSell) var0).getInvoicingDate());
                var9.setContractor(((InvoiceOtherSell) var0).getContractor());
                setBasicVatPricesForInvoiceRecordElement(var9, var8.getForAll());
                HQZ(var1, var9);
                break;
            case PURCHASE_REASON_1:
            case PURCHASE_REASON_2:
            case PURCHASE_REASON_3:
            case PURCHASE_REASON_4:
                InvoiceRecordElementPurchase var4 = new InvoiceRecordElementPurchase();
                var4.setInvoiceOtherSubType(var0.getInvoiceOtherSubType());
                var4.HGZ().setValue(false);
                var3 = new EQZ(var0);
                var4.setRefId(var0.getRefId());
                if (var0.getInvoiceOtherSubType().equals(QSQ.PURCHASE_REASON_1)) {
                    var4.RIM().setValue(true);
                } else if (var0.getInvoiceOtherSubType().equals(QSQ.PURCHASE_REASON_2)) {
                    var4.RIN().setValue(true);
                } else if (var0.getInvoiceOtherSubType().equals(QSQ.PURCHASE_REASON_3)) {
                    var4.RIO().setValue(true);
                } else if (var0.getInvoiceOtherSubType().equals(QSQ.PURCHASE_REASON_4)) {
                    var4.RIP().setValue(true);
                }

                var4.setCreationDate(var0.RIS().DEF());
                var4.setTransactionDate(null);
                var4.setDate(((InvoiceOtherPurchase) var0).getInvoicingDate());
                var4.setContractor(((InvoiceOtherPurchase) var0).getContractor());
                setBasicVatPricesForInvoiceRecordElement(var4, var3.getForAll());
                HQZ(var2, var4);
        }

    }
}
