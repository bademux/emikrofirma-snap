package a.a.a.c.c.d.h;

import a.a.a.b.f.FFK;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.e.HQ;
import a.a.a.c.f.a.e.HU;
import a.a.a.c.f.b.c.a.KI;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.b.c.a.QSV;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.g.c.FCZ;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.URI;
import java.time.ZoneId;
import java.util.Base64;
import java.util.Iterator;
import java.util.ResourceBundle;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.avalon.framework.configuration.Configuration;
import org.apache.avalon.framework.configuration.ConfigurationException;
import org.apache.avalon.framework.configuration.DefaultConfigurationBuilder;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.FopFactoryBuilder;
import org.apache.xmlgraphics.io.Resource;
import org.apache.xmlgraphics.io.ResourceResolver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class EPE extends EPL {
   private final HU FPN;
   private final LY FPO;

   public EPE(ResourceBundle var1, HU var2, LY var3, File var4) {
      super(var1, var4);
      this.FPN = var2;
      this.FPO = var3;
   }

   public void HOF() throws FFK {
      EXF.getInstance().ICO();

      try {
         Document var1 = this.HOO();
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         DOMSource var3 = new DOMSource(var1);
         StreamResult var4 = new StreamResult(var2);
         TransformerFactory.newInstance().newTransformer().transform(var3, var4);
         ByteArrayInputStream var5 = new ByteArrayInputStream(var2.toByteArray());
         FopFactoryBuilder var6 = new FopFactoryBuilder((new File(".")).toURI(), new ResourceResolver() {
            public Resource getResource(URI var1) throws IOException {
               return new Resource(this.getClass().getResourceAsStream(var1.getPath()));
            }

            public OutputStream getOutputStream(URI var1) throws IOException {
               return new FileOutputStream(new File(var1));
            }
         });
         FileOutputStream var7 = null;
         var7 = new FileOutputStream(this.FPP);
         InputStream var8 = null;
         var8 = EPE.class.getResourceAsStream("/fop/jpkFont.xsl");
         DefaultConfigurationBuilder var9 = new DefaultConfigurationBuilder();
         Configuration var10 = var9.build(var8);
         var6.setConfiguration(var10);
         FopFactory var11 = var6.build();
         FOUserAgent var12 = var11.newFOUserAgent();
         Fop var13 = var11.newFop("application/pdf", var12, var7);
         TransformerFactory var14 = TransformerFactory.newInstance();
         Transformer var15 = var14.newTransformer(new StreamSource(EPE.class.getResourceAsStream("/fop/invoice_sale.xsl")));
         byte[] var16 = this.FPO.DFM().getValue();
         String var17;
         if (var16 != null && var16.length > 0) {
            var17 = new String(Base64.getEncoder().encode(var16), "UTF-8");
            var15.setParameter("image", var17);
         }

         var15.setParameter("ref_id", this.HOL((String)this.FPN.getRefId().getValue(), 18));
         var15.setParameter("creation_date", this.FPN.getCreationDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
         var17 = this.HOL((String)this.FPN.getCreationPlace().getValue(), 34);
         if (var17 != null && var17.trim().length() > 0) {
            var15.setParameter("creation_place", ", " + var17);
         }

         var15.setParameter("transaction_date", this.FPN.getTransactionDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
         var15.setParameter("seller_name", this.HOL((String)this.FPO.DFH().getValue(), 25));
         var15.setParameter("seller_street", this.HOL((String)this.FPO.DFN().DDA().getValue(), 25));
         var15.setParameter("seller_house_number", this.FPO.DFN().DDB().getValue());
         String var18 = (String)this.FPO.DFN().DDC().getValue();
         if (var18 != null && var18.trim().length() > 0) {
            var15.setParameter("seller_apartment_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.ApartmentNumber") + " " + var18);
         }

         var15.setParameter("seller_zip", this.FPO.DFN().getPostalCode().getValue());
         var15.setParameter("seller_city", this.HOL((String)this.FPO.DFN().DCZ().getValue(), 25));
         var15.setParameter("seller_nip", this.FPO.DFF().getValue());
         String var19 = (String)this.FPO.DFO().getValue();
         if (var19 != null && var19.trim().length() > 0) {
            var15.setParameter("seller_account_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.AccountNumber") + " " + var19);
         }

         String var20 = (String)this.FPO.DFK().getValue();
         if (var20 != null && var20.trim().length() > 0) {
            var15.setParameter("seller_phone_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.PhoneNumber") + " " + var20);
         }

         var15.setParameter("buyer_name", this.HOL((String)this.FPN.getContractor().DAI().getValue(), 25));
         var15.setParameter("buyer_street", this.HOL((String)this.FPN.getContractor().DAM().getStreet().getValue(), 25));
         var15.setParameter("buyer_house_number", this.FPN.getContractor().DAM().DDB().getValue());
         String var21 = (String)this.FPN.getContractor().DAM().DDC().getValue();
         if (var21 != null && var21.trim().length() > 0) {
            var15.setParameter("buyer_apartment_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.ApartmentNumber") + " " + var21);
         }

         var15.setParameter("buyer_zip", this.FPN.getContractor().DAM().DDD().getValue());
         var15.setParameter("buyer_city", this.HOL((String)this.FPN.getContractor().DAM().DCZ().getValue(), 25));
         var15.setParameter("buyer_nip", this.FPN.getContractor().DAJ().getValue());
         var15.setParameter("to_pay", this.FQJ.format(this.FPN.getAmountSummaryWithTax().getValue()));
         var15.setParameter("to_pay_words", this.HOK((BigDecimal)this.FPN.getAmountSummaryWithTax().getValue()));
         var15.setParameter("payment_type", ((KI)this.FPN.getPaymentMethod().getValue()).getDescription());
         var15.setParameter("summary", this.FPQ.getString("micro.process.invoice_sale_new.Print.All"));
         var15.setParameter("sum_net", this.HOI((BigDecimal)this.FPN.getAmountSummaryWithoutTax().getValue()));
         var15.setParameter("sum_tax", this.HOI((BigDecimal)this.FPN.getAmountTax().getValue()));
         var15.setParameter("sum_brut", this.HOI((BigDecimal)this.FPN.getAmountSummaryWithTax().getValue()));
         var15.setParameter("is_cancelled", this.FPN.getState() != null && this.FPN.getState().equals(QSW.CANCELED));
         boolean var22 = false;
         if (this.FPN.DBA().getValue() != null) {
            var22 = (Boolean)this.FPN.DBA().getValue();
         }

         boolean var23 = false;
         if (this.FPN.QOP().getValue() != null) {
            var23 = (Boolean)this.FPN.QOP().getValue();
         }

         if (var22) {
            var15.setParameter("payment_date_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.PayedDate"));
            var15.setParameter("payment_date", this.FPN.getCreationDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
         } else if (var23) {
            var15.setParameter("payment_date_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.PaymentDate"));
            var15.setParameter("payment_date", this.FPQ.getString("micro.process.invoice_sale_new.Print.PaymentDateByDeal"));
         } else {
            var15.setParameter("payment_date_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.PaymentDate"));
            if (this.FPN.getPaymentDate().getValueDate() != null) {
               var15.setParameter("payment_date", this.FPN.getPaymentDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
            } else {
               var15.setParameter("payment_date", "");
            }
         }

         String var24 = (String)this.FPN.QOQ().getValue();
         if (var24 != null) {
            var15.setParameter("exempt_reason", this.HOL(var24, 100));
         }

         String var25 = (String)this.FPN.DBB().getValue();
         if (var25 != null) {
            var15.setParameter("remarks", this.HOL(var25, 63));
         }

         if (this.FPN.getInvoiceElements() != null && this.FPN.getInvoiceElements().size() != 0 && ((HQ)this.FPN.getInvoiceElements().get(0)).RIG().getValue() != null && ((QSV)((HQ)this.FPN.getInvoiceElements().get(0)).RIG().getValue()).equals(QSV.GROSS)) {
            var15.setParameter("unit_price", this.FPQ.getString("micro.process.invoice_sale_new.Print.InvoiceElementBrutPrice"));
         } else {
            var15.setParameter("unit_price", this.FPQ.getString("micro.process.invoice_sale_new.Print.InvoiceElementNetPrice"));
         }

         SAXResult var26 = new SAXResult(var13.getDefaultHandler());
         var15.transform(new StreamSource(var5), var26);
         var7.flush();
         var7.close();
      } catch (FileNotFoundException var31) {
         EXF.getInstance().ICA((Throwable)var31);
         throw FCZ.getInstance().IHI(this.FPP);
      } catch (TransformerException | TransformerFactoryConfigurationError | IOException | ConfigurationException | SAXException | ParserConfigurationException var32) {
         EXF.getInstance().ICA((Throwable)var32);
         throw FCZ.getInstance().IHL();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected Document HOO() throws ParserConfigurationException {
      EPM var1 = new EPM("invoiceSell");
      short var3 = 0;
      Iterator var4 = this.FPN.getInvoiceElements().iterator();

      Element var2;
      while(var4.hasNext()) {
         HQ var5 = (HQ)var4.next();
         ++var3;
         var2 = var1.getDocument().createElement("invoiceSellElements");
         var1.HOR("nr", String.valueOf(var3), var2);
         var1.HOR("name", this.HOL((String)var5.getName().getValue(), 20), var2);
         var1.HOR("unit", this.HOL((String)var5.getUnit().getValue(), 5), var2);
         if (var5.RIG().getValue() != null && ((QSV)var5.RIG().getValue()).equals(QSV.GROSS)) {
            var1.HOR("unitPrice", this.HOI((BigDecimal)var5.getGrossPriceForUnit().getValue()), var2);
         } else {
            var1.HOR("unitPrice", this.HOI((BigDecimal)var5.getNetPriceForUnit().getValue()), var2);
         }

         var1.HOR("quantity", this.HOI((BigDecimal)var5.getQuantity().getValue()), var2);
         var1.HOR("taxrate", ((KL)var5.getTaxRate().getValue()).getDescription(), var2);
         var1.HOR("sumNet", this.HOI((BigDecimal)var5.getNetPriceForAll().getValue()), var2);
         var1.HOR("sumTax", this.HOI((BigDecimal)var5.getTaxValueForAll().getValue()), var2);
         var1.HOR("sumBrut", this.HOI((BigDecimal)var5.getGrossValueForAll().getValue()), var2);
         var1.HOR("description", this.HOL((String)var5.getDescription().getValue(), 20), var2);
         var1.getRoot().appendChild(var2);
      }

      var4 = this.FPN.getSumOfAmountsDividedByTaxRate().iterator();
      Iterator var10 = this.FPN.getAmountOfTaxDividedByTaxRate().iterator();
      Iterator var6 = this.FPN.getSumOfGrossAmountsDividedByTaxRate().iterator();

      while(var4.hasNext()) {
         EVZ var7 = (EVZ)var4.next();
         EVZ var8 = (EVZ)var10.next();
         EVZ var9 = (EVZ)var6.next();
         var2 = var1.getDocument().createElement("summaryTable");
         var1.HOR("taxRate", ((KL)var7.getFirstValue()).getDescription(), var2);
         var1.HOR("netSum", this.HOI((BigDecimal)var7.getSecondValue()), var2);
         var1.HOR("taxSum", this.HOI((BigDecimal)var8.getSecondValue()), var2);
         var1.HOR("brutSum", this.HOI((BigDecimal)var9.getSecondValue()), var2);
         var1.getRoot().appendChild(var2);
      }

      return var1.getDocument();
   }

   protected void HOG() throws FFK {
   }
}
