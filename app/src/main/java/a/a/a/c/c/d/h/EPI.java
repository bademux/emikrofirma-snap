package a.a.a.c.c.d.h;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.g.EOZ;
import a.a.a.c.d.e.EQY;
import a.a.a.c.e.a.d.ValueContainer3;
import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.a.e.HQ;
import a.a.a.c.f.a.e.HU;
import a.a.a.c.f.a.e.HV;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.b.c.a.QSV;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.c.FCZ;
import com.github.bademux.emk.utils.FopUtils;
import org.apache.fop.configuration.ConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.ZoneId;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;

public class EPI extends EPL {
    private final HV FQF;
    private final HU FQG;
    private final Invoice<HQ> FQH;
    private final UserData FQI;

    public EPI(ResourceBundle var1, HV var2, UserData var3, File var4) throws FFO {
        super(var1, var4);
        this.FQF = var2;
        this.FQI = var3;
        this.FQG = EOZ.getOriginalInvoice(var2);
        this.FQH = (Invoice<HQ>) var2.getParentInvoiceOnlyActive();
    }

    public void HOF() throws FFK {

        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer(new StreamSource(EPE.class.getResourceAsStream("/fop/invoice_sale_correction.xsl")));
            byte[] var16 = this.FQI.DFM().getValue();
            String var17;
            if (var16 != null && var16.length > 0) {
                var17 = new String(Base64.getEncoder().encode(var16), StandardCharsets.UTF_8);
                transformer.setParameter("image", var17);
            }

            transformer.setParameter("ref_id", this.HOL(this.FQF.getRefId().getValue(), 18));
            transformer.setParameter("creation_date", this.FQF.getCreationDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
            var17 = this.HOL(this.FQG.getCreationPlace().getValue(), 34);
            if (var17 != null && var17.trim().length() > 0) {
                transformer.setParameter("creation_place", ", " + var17);
            }

            transformer.setParameter("transaction_date", this.FQG.getTransactionDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
            transformer.setParameter("seller_name", this.HOL(this.FQI.DFH().getValue(), 25));
            transformer.setParameter("seller_street", this.HOL(this.FQI.DFN().DDA().getValue(), 25));
            transformer.setParameter("seller_house_number", this.FQI.DFN().DDB().getValue());
            String var18 = this.FQI.DFN().DDC().getValue();
            if (var18 != null && var18.trim().length() > 0) {
                transformer.setParameter("seller_apartment_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.ApartmentNumber") + " " + var18);
            }

            transformer.setParameter("seller_zip", this.FQI.DFN().getPostalCode().getValue());
            transformer.setParameter("seller_city", this.HOL(this.FQI.DFN().DCZ().getValue(), 25));
            transformer.setParameter("seller_nip", this.FQI.DFF().getValue());
            String var19 = this.FQI.DFO().getValue();
            if (var19 != null && var19.trim().length() > 0) {
                transformer.setParameter("seller_account_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.AccountNumber") + " " + var19);
            }

            String var20 = this.FQI.DFK().getValue();
            if (var20 != null && var20.trim().length() > 0) {
                transformer.setParameter("seller_phone_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.PhoneNumber") + " " + var20);
            }

            transformer.setParameter("buyer_name", this.HOL(this.FQG.getContractor().DAI().getValue(), 25));
            transformer.setParameter("buyer_street", this.HOL(this.FQG.getContractor().DAM().getStreet().getValue(), 25));
            transformer.setParameter("buyer_house_number", this.FQG.getContractor().DAM().DDB().getValue());
            String var21 = this.FQG.getContractor().DAM().DDC().getValue();
            if (var21 != null && var21.trim().length() > 0) {
                transformer.setParameter("buyer_apartment_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.ApartmentNumber") + " " + var21);
            }

            transformer.setParameter("buyer_zip", this.FQG.getContractor().DAM().DDD().getValue());
            transformer.setParameter("buyer_city", this.HOL(this.FQG.getContractor().DAM().DCZ().getValue(), 25));
            transformer.setParameter("buyer_nip", this.FQG.getContractor().DAJ().getValue());
            BigDecimal var22 = EQY.HRJ(this.FQF.DAV().getValue(), this.FQH.DAV().getValue());
            if (var22.compareTo(BigDecimal.ZERO) >= 0) {
                transformer.setParameter("to_pay_or_to_return_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.ToPayPlus"));
            } else {
                transformer.setParameter("to_pay_or_to_return_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.ToPayMinus"));
            }

            transformer.setParameter("to_pay", this.FQJ.format(var22.abs()));
            transformer.setParameter("to_pay_words", this.HOK(var22.abs()));
            transformer.setParameter("payment_type", this.FQF.getPaymentMethod().getValue().getDescription());
            transformer.setParameter("summary", this.FPQ.getString("micro.process.invoice_sale_new.Print.All"));
            transformer.setParameter("sum_net", this.HOI(this.FQF.getAmountSummaryWithoutTax().getValue()));
            transformer.setParameter("sum_tax", this.HOI(this.FQF.getAmountTax().getValue()));
            transformer.setParameter("sum_brut", this.HOI(this.FQF.getAmountSummaryWithTax().getValue()));
            transformer.setParameter("is_cancelled", this.FQF.getState() != null && this.FQF.getState().equals(QSW.CANCELED));
            boolean var23 = false;
            if (this.FQF.DBA().getValue() != null) {
                var23 = this.FQF.DBA().getValue();
            }

            boolean var24 = false;
            if (this.FQF.QOP().getValue() != null) {
                var24 = this.FQF.QOP().getValue();
            }

            if (var23) {
                transformer.setParameter("payment_date_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.PayedDate"));
                transformer.setParameter("payment_date", this.FQF.getCreationDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
            } else if (var24) {
                transformer.setParameter("payment_date_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.PaymentDate"));
                transformer.setParameter("payment_date", this.FPQ.getString("micro.process.invoice_sale_new.Print.PaymentDateByDeal"));
            } else {
                transformer.setParameter("payment_date_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.PaymentDate"));
                transformer.setParameter("payment_date", this.FQF.getPaymentDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
            }

            String var25 = this.FQF.QOQ().getValue();
            if (var25 != null) {
                transformer.setParameter("exempt_reason", this.HOL(var25, 100));
            }

            String var26 = this.FQF.DBB().getValue();
            if (var26 != null) {
                transformer.setParameter("remarks", this.HOL(var26, 63));
            }

            transformer.setParameter("sum_net_before_correction", this.FQJ.format(this.FQH.DAW().getValue()));
            transformer.setParameter("sum_tax_before_correction", this.FQJ.format(this.FQH.DAX().getValue()));
            transformer.setParameter("sum_brut_before_correction", this.FQJ.format(this.FQH.DAV().getValue()));
            transformer.setParameter("correction_reason", this.HOL(this.FQF.getCorrectionReason().getValue(), 34));
            transformer.setParameter("ref_id_old", this.FQG.DAS().getValue());
            transformer.setParameter("creation_date_old", this.FQG.DAT().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
            transformer.setParameter("diff_sum_net", this.FQJ.format(EQY.HRJ(this.FQF.DAW().getValue(), this.FQH.DAW().getValue())));
            transformer.setParameter("diff_sum_tax", this.FQJ.format(EQY.HRJ(this.FQF.DAX().getValue(), this.FQH.DAX().getValue())));
            transformer.setParameter("diff_sum_brut", this.FQJ.format(EQY.HRJ(this.FQF.DAV().getValue(), this.FQH.DAV().getValue())));
            if (this.FQH.getInvoiceElements() != null && this.FQH.getInvoiceElements().size() != 0 && this.FQH.getInvoiceElements().get(0).RIG().getValue() != null && this.FQH.getInvoiceElements().get(0).RIG().getValue().equals(QSV.GROSS)) {
                transformer.setParameter("unit_price_before_correction", this.FPQ.getString("micro.process.invoice_sale_new.Print.InvoiceElementBrutPrice"));
            } else {
                transformer.setParameter("unit_price_before_correction", this.FPQ.getString("micro.process.invoice_sale_new.Print.InvoiceElementNetPrice"));
            }

            if (this.FQF.getInvoiceElements() != null && this.FQF.getInvoiceElements().size() != 0 && this.FQF.getInvoiceElements().get(0).RIG().getValue() != null && this.FQF.getInvoiceElements().get(0).RIG().getValue().equals(QSV.GROSS)) {
                transformer.setParameter("unit_price", this.FPQ.getString("micro.process.invoice_sale_new.Print.InvoiceElementBrutPrice"));
            } else {
                transformer.setParameter("unit_price", this.FPQ.getString("micro.process.invoice_sale_new.Print.InvoiceElementNetPrice"));
            }

            try (var fos = new FileOutputStream(this.FPP)) {
                transformer.transform(new DOMSource(this.HOP()), new SAXResult(FopUtils.createFopHandler(fos)));
                fos.flush();
            }
        } catch (FileNotFoundException var32) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var32);
            throw FCZ.getInstance().IHI(this.FPP);
        } catch (TransformerException | TransformerFactoryConfigurationError | IOException | ConfigurationException |
                 SAXException | ParserConfigurationException var33) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var33);
            throw FCZ.getInstance().IHL();
        }

    }

    protected Document HOP() throws ParserConfigurationException {
        EPM var1 = new EPM("invoiceSell");
        short var3 = 0;
        Iterator var4 = this.FQF.getInvoiceElements().iterator();

        Element var2;
        HQ var5;
        while (var4.hasNext()) {
            var5 = (HQ) var4.next();
            ++var3;
            var2 = var1.getDocument().createElement("invoiceSellElements");
            var1.HOR("nr", String.valueOf(var3), var2);
            var1.HOR("name", this.HOL(var5.getName().getValue(), 20), var2);
            var1.HOR("unit", this.HOL(var5.getUnit().getValue(), 5), var2);
            if (var5.RIG().getValue() != null && var5.RIG().getValue().equals(QSV.GROSS)) {
                var1.HOR("unitPrice", this.HOI(var5.getGrossPriceForUnit().getValue()), var2);
            } else {
                var1.HOR("unitPrice", this.HOI(var5.getNetPriceForUnit().getValue()), var2);
            }

            var1.HOR("quantity", this.HOI(var5.getQuantity().getValue()), var2);
            var1.HOR("taxrate", var5.getTaxRate().getValue().getDescription(), var2);
            var1.HOR("sumNet", this.HOI(var5.getNetPriceForAll().getValue()), var2);
            var1.HOR("sumTax", this.HOI(var5.getTaxValueForAll().getValue()), var2);
            var1.HOR("sumBrut", this.HOI(var5.getGrossValueForAll().getValue()), var2);
            var1.HOR("description", this.HOL(var5.getDescription().getValue(), 20), var2);
            var1.getRoot().appendChild(var2);
        }

        var3 = 0;
        var4 = this.FQH.getInvoiceElements().iterator();

        while (var4.hasNext()) {
            var5 = (HQ) var4.next();
            ++var3;
            var2 = var1.getDocument().createElement("invoiceSellElementsBeforeCorrection");
            var1.HOR("nr", String.valueOf(var3), var2);
            var1.HOR("name", this.HOL(var5.getName().getValue(), 20), var2);
            var1.HOR("unit", this.HOL(var5.getUnit().getValue(), 5), var2);
            if (var5.RIG().getValue() != null && var5.RIG().getValue().equals(QSV.GROSS)) {
                var1.HOR("unitPrice", this.HOI(var5.getGrossPriceForUnit().getValue()), var2);
            } else {
                var1.HOR("unitPrice", this.HOI(var5.getNetPriceForUnit().getValue()), var2);
            }

            var1.HOR("quantity", this.HOI(var5.getQuantity().getValue()), var2);
            var1.HOR("taxrate", var5.getTaxRate().getValue().getDescription(), var2);
            var1.HOR("sumNet", this.HOI(var5.getNetPriceForAll().getValue()), var2);
            var1.HOR("sumTax", this.HOI(var5.getTaxValueForAll().getValue()), var2);
            var1.HOR("sumBrut", this.HOI(var5.getGrossValueForAll().getValue()), var2);
            var1.HOR("description", this.HOL(var5.getDescription().getValue(), 20), var2);
            var1.getRoot().appendChild(var2);
        }

        Map var7 = EOZ.getTaxRateSummaryDiffForCorrection(this.FQF);
        Iterator var8 = var7.entrySet().iterator();

        while (var8.hasNext()) {
            Map.Entry var6 = (Map.Entry) var8.next();
            var2 = var1.getDocument().createElement("summaryTable");
            var1.HOR("taxRate", ((KL) var6.getKey()).getDescription(), var2);
            var1.HOR("netSum", this.HOI((BigDecimal) ((ValueContainer3) var6.getValue()).getFirstValue()), var2);
            var1.HOR("taxSum", this.HOI((BigDecimal) ((ValueContainer3) var6.getValue()).getSecondValue()), var2);
            var1.HOR("brutSum", this.HOI((BigDecimal) ((ValueContainer3) var6.getValue()).getThirdValue()), var2);
            var1.getRoot().appendChild(var2);
        }

        return var1.getDocument();
    }

    protected void HOG() throws FFK {
    }
}
