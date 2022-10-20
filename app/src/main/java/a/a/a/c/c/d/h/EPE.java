package a.a.a.c.c.d.h;

import a.a.a.b.f.FFK;
import a.a.a.c.e.a.d.TwoValueBox;
import a.a.a.c.f.a.e.HQ;
import a.a.a.c.f.a.e.HU;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.b.c.a.QSV;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.f.c.b.LY;
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
import java.util.ResourceBundle;

public class EPE extends EPL {

    private final HU FPN;
    private final LY FPO;

    public EPE(ResourceBundle var1, HU var2, LY var3, File var4) {
        super(var1, var4);
        this.FPN = var2;
        this.FPO = var3;
    }

    public void HOF() throws FFK {

        try {

            Transformer transformer = TransformerFactory.newInstance().newTransformer(new StreamSource(EPE.class.getResourceAsStream("/fop/invoice_sale.xsl")));
            byte[] var16 = this.FPO.DFM().getValue();
            String var17;
            if (var16 != null && var16.length > 0) {
                var17 = new String(Base64.getEncoder().encode(var16), StandardCharsets.UTF_8);
                transformer.setParameter("image", var17);
            }

            transformer.setParameter("ref_id", this.HOL(this.FPN.getRefId().getValue(), 18));
            transformer.setParameter("creation_date", this.FPN.getCreationDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
            var17 = this.HOL(this.FPN.getCreationPlace().getValue(), 34);
            if (var17 != null && var17.trim().length() > 0) {
                transformer.setParameter("creation_place", ", " + var17);
            }

            transformer.setParameter("transaction_date", this.FPN.getTransactionDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
            transformer.setParameter("seller_name", this.HOL(this.FPO.DFH().getValue(), 25));
            transformer.setParameter("seller_street", this.HOL(this.FPO.DFN().DDA().getValue(), 25));
            transformer.setParameter("seller_house_number", this.FPO.DFN().DDB().getValue());
            String var18 = this.FPO.DFN().DDC().getValue();
            if (var18 != null && var18.trim().length() > 0) {
                transformer.setParameter("seller_apartment_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.ApartmentNumber") + " " + var18);
            }

            transformer.setParameter("seller_zip", this.FPO.DFN().getPostalCode().getValue());
            transformer.setParameter("seller_city", this.HOL(this.FPO.DFN().DCZ().getValue(), 25));
            transformer.setParameter("seller_nip", this.FPO.DFF().getValue());
            String var19 = this.FPO.DFO().getValue();
            if (var19 != null && var19.trim().length() > 0) {
                transformer.setParameter("seller_account_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.AccountNumber") + " " + var19);
            }

            String var20 = this.FPO.DFK().getValue();
            if (var20 != null && var20.trim().length() > 0) {
                transformer.setParameter("seller_phone_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.PhoneNumber") + " " + var20);
            }

            transformer.setParameter("buyer_name", this.HOL(this.FPN.getContractor().DAI().getValue(), 25));
            transformer.setParameter("buyer_street", this.HOL(this.FPN.getContractor().DAM().getStreet().getValue(), 25));
            transformer.setParameter("buyer_house_number", this.FPN.getContractor().DAM().DDB().getValue());
            String var21 = this.FPN.getContractor().DAM().DDC().getValue();
            if (var21 != null && var21.trim().length() > 0) {
                transformer.setParameter("buyer_apartment_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.ApartmentNumber") + " " + var21);
            }

            transformer.setParameter("buyer_zip", this.FPN.getContractor().DAM().DDD().getValue());
            transformer.setParameter("buyer_city", this.HOL(this.FPN.getContractor().DAM().DCZ().getValue(), 25));
            transformer.setParameter("buyer_nip", this.FPN.getContractor().DAJ().getValue());
            transformer.setParameter("to_pay", this.FQJ.format(this.FPN.getAmountSummaryWithTax().getValue()));
            transformer.setParameter("to_pay_words", this.HOK(this.FPN.getAmountSummaryWithTax().getValue()));
            transformer.setParameter("payment_type", this.FPN.getPaymentMethod().getValue().getDescription());
            transformer.setParameter("summary", this.FPQ.getString("micro.process.invoice_sale_new.Print.All"));
            transformer.setParameter("sum_net", this.HOI(this.FPN.getAmountSummaryWithoutTax().getValue()));
            transformer.setParameter("sum_tax", this.HOI(this.FPN.getAmountTax().getValue()));
            transformer.setParameter("sum_brut", this.HOI(this.FPN.getAmountSummaryWithTax().getValue()));
            transformer.setParameter("is_cancelled", this.FPN.getState() != null && this.FPN.getState().equals(QSW.CANCELED));
            boolean var22 = false;
            if (this.FPN.DBA().getValue() != null) {
                var22 = this.FPN.DBA().getValue();
            }

            boolean var23 = false;
            if (this.FPN.QOP().getValue() != null) {
                var23 = this.FPN.QOP().getValue();
            }

            if (var22) {
                transformer.setParameter("payment_date_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.PayedDate"));
                transformer.setParameter("payment_date", this.FPN.getCreationDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
            } else if (var23) {
                transformer.setParameter("payment_date_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.PaymentDate"));
                transformer.setParameter("payment_date", this.FPQ.getString("micro.process.invoice_sale_new.Print.PaymentDateByDeal"));
            } else {
                transformer.setParameter("payment_date_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.PaymentDate"));
                if (this.FPN.getPaymentDate().getValueDate() != null) {
                    transformer.setParameter("payment_date", this.FPN.getPaymentDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
                } else {
                    transformer.setParameter("payment_date", "");
                }
            }

            String var24 = this.FPN.QOQ().getValue();
            if (var24 != null) {
                transformer.setParameter("exempt_reason", this.HOL(var24, 100));
            }

            String var25 = this.FPN.DBB().getValue();
            if (var25 != null) {
                transformer.setParameter("remarks", this.HOL(var25, 63));
            }

            if (this.FPN.getInvoiceElements() != null && this.FPN.getInvoiceElements().size() != 0 && this.FPN.getInvoiceElements().get(0).RIG().getValue() != null && this.FPN.getInvoiceElements().get(0).RIG().getValue().equals(QSV.GROSS)) {
                transformer.setParameter("unit_price", this.FPQ.getString("micro.process.invoice_sale_new.Print.InvoiceElementBrutPrice"));
            } else {
                transformer.setParameter("unit_price", this.FPQ.getString("micro.process.invoice_sale_new.Print.InvoiceElementNetPrice"));
            }
            try (var fos = new FileOutputStream(this.FPP)) {
                transformer.transform(new DOMSource(this.HOO()), new SAXResult(FopUtils.createFopHandler(fos)));
                fos.flush();
            }
        } catch (FileNotFoundException var31) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var31);
            throw FCZ.getInstance().IHI(this.FPP);
        } catch (TransformerException | TransformerFactoryConfigurationError | IOException | ConfigurationException |
                 SAXException | ParserConfigurationException var32) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var32);
            throw FCZ.getInstance().IHL();
        }

    }

    protected Document HOO() throws ParserConfigurationException {
        EPM var1 = new EPM("invoiceSell");
        short var3 = 0;
        Iterator var4 = this.FPN.getInvoiceElements().iterator();

        Element var2;
        while (var4.hasNext()) {
            HQ var5 = (HQ) var4.next();
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

        var4 = this.FPN.getSumOfAmountsDividedByTaxRate().iterator();
        Iterator var10 = this.FPN.getAmountOfTaxDividedByTaxRate().iterator();
        Iterator var6 = this.FPN.getSumOfGrossAmountsDividedByTaxRate().iterator();

        while (var4.hasNext()) {
            TwoValueBox var7 = (TwoValueBox) var4.next();
            TwoValueBox var8 = (TwoValueBox) var10.next();
            TwoValueBox var9 = (TwoValueBox) var6.next();
            var2 = var1.getDocument().createElement("summaryTable");
            var1.HOR("taxRate", ((KL) var7.getFirstValue()).getDescription(), var2);
            var1.HOR("netSum", this.HOI((BigDecimal) var7.getSecondValue()), var2);
            var1.HOR("taxSum", this.HOI((BigDecimal) var8.getSecondValue()), var2);
            var1.HOR("brutSum", this.HOI((BigDecimal) var9.getSecondValue()), var2);
            var1.getRoot().appendChild(var2);
        }

        return var1.getDocument();
    }

    protected void HOG() throws FFK {
    }
}
