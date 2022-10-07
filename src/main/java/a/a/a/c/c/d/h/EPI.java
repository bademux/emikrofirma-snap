package a.a.a.c.c.d.h;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.g.EOZ;
import a.a.a.c.d.e.EQY;
import a.a.a.c.e.a.d.EWC;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.a.e.HQ;
import a.a.a.c.f.a.e.HU;
import a.a.a.c.f.a.e.HV;
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
import java.util.Map;
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

public class EPI extends EPL {
   private final HV FQF;
   private final HU FQG;
   private final HN<HQ> FQH;
   private final LY FQI;

   public EPI(ResourceBundle var1, HV var2, LY var3, File var4) throws FFO {
      super(var1, var4);
      this.FQF = var2;
      this.FQI = var3;
      this.FQG = EOZ.getOriginalInvoice(var2);
      this.FQH = (HN<HQ>) var2.getParentInvoiceOnlyActive();
   }

   public void HOF() throws FFK {
      EXF.getInstance().ICO();

      try {
         Document var1 = this.HOP();
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
         Transformer var15 = var14.newTransformer(new StreamSource(EPE.class.getResourceAsStream("/fop/invoice_sale_correction.xsl")));
         byte[] var16 = this.FQI.DFM().getValue();
         String var17;
         if (var16 != null && var16.length > 0) {
            var17 = new String(Base64.getEncoder().encode(var16), "UTF-8");
            var15.setParameter("image", var17);
         }

         var15.setParameter("ref_id", this.HOL((String)this.FQF.getRefId().getValue(), 18));
         var15.setParameter("creation_date", this.FQF.getCreationDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
         var17 = this.HOL((String)this.FQG.getCreationPlace().getValue(), 34);
         if (var17 != null && var17.trim().length() > 0) {
            var15.setParameter("creation_place", ", " + var17);
         }

         var15.setParameter("transaction_date", this.FQG.getTransactionDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
         var15.setParameter("seller_name", this.HOL((String)this.FQI.DFH().getValue(), 25));
         var15.setParameter("seller_street", this.HOL((String)this.FQI.DFN().DDA().getValue(), 25));
         var15.setParameter("seller_house_number", this.FQI.DFN().DDB().getValue());
         String var18 = (String)this.FQI.DFN().DDC().getValue();
         if (var18 != null && var18.trim().length() > 0) {
            var15.setParameter("seller_apartment_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.ApartmentNumber") + " " + var18);
         }

         var15.setParameter("seller_zip", this.FQI.DFN().getPostalCode().getValue());
         var15.setParameter("seller_city", this.HOL((String)this.FQI.DFN().DCZ().getValue(), 25));
         var15.setParameter("seller_nip", this.FQI.DFF().getValue());
         String var19 = (String)this.FQI.DFO().getValue();
         if (var19 != null && var19.trim().length() > 0) {
            var15.setParameter("seller_account_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.AccountNumber") + " " + var19);
         }

         String var20 = (String)this.FQI.DFK().getValue();
         if (var20 != null && var20.trim().length() > 0) {
            var15.setParameter("seller_phone_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.PhoneNumber") + " " + var20);
         }

         var15.setParameter("buyer_name", this.HOL((String)this.FQG.getContractor().DAI().getValue(), 25));
         var15.setParameter("buyer_street", this.HOL((String)this.FQG.getContractor().DAM().getStreet().getValue(), 25));
         var15.setParameter("buyer_house_number", this.FQG.getContractor().DAM().DDB().getValue());
         String var21 = (String)this.FQG.getContractor().DAM().DDC().getValue();
         if (var21 != null && var21.trim().length() > 0) {
            var15.setParameter("buyer_apartment_number", this.FPQ.getString("micro.process.invoice_sale_new.Print.ApartmentNumber") + " " + var21);
         }

         var15.setParameter("buyer_zip", this.FQG.getContractor().DAM().DDD().getValue());
         var15.setParameter("buyer_city", this.HOL((String)this.FQG.getContractor().DAM().DCZ().getValue(), 25));
         var15.setParameter("buyer_nip", this.FQG.getContractor().DAJ().getValue());
         BigDecimal var22 = EQY.HRJ((BigDecimal)this.FQF.DAV().getValue(), (BigDecimal)this.FQH.DAV().getValue());
         if (var22.compareTo(BigDecimal.ZERO) >= 0) {
            var15.setParameter("to_pay_or_to_return_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.ToPayPlus"));
         } else {
            var15.setParameter("to_pay_or_to_return_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.ToPayMinus"));
         }

         var15.setParameter("to_pay", this.FQJ.format(var22.abs()));
         var15.setParameter("to_pay_words", this.HOK(var22.abs()));
         var15.setParameter("payment_type", ((KI)this.FQF.getPaymentMethod().getValue()).getDescription());
         var15.setParameter("summary", this.FPQ.getString("micro.process.invoice_sale_new.Print.All"));
         var15.setParameter("sum_net", this.HOI((BigDecimal)this.FQF.getAmountSummaryWithoutTax().getValue()));
         var15.setParameter("sum_tax", this.HOI((BigDecimal)this.FQF.getAmountTax().getValue()));
         var15.setParameter("sum_brut", this.HOI((BigDecimal)this.FQF.getAmountSummaryWithTax().getValue()));
         var15.setParameter("is_cancelled", this.FQF.getState() != null && this.FQF.getState().equals(QSW.CANCELED));
         boolean var23 = false;
         if (this.FQF.DBA().getValue() != null) {
            var23 = (Boolean)this.FQF.DBA().getValue();
         }

         boolean var24 = false;
         if (this.FQF.QOP().getValue() != null) {
            var24 = (Boolean)this.FQF.QOP().getValue();
         }

         if (var23) {
            var15.setParameter("payment_date_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.PayedDate"));
            var15.setParameter("payment_date", this.FQF.getCreationDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
         } else if (var24) {
            var15.setParameter("payment_date_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.PaymentDate"));
            var15.setParameter("payment_date", this.FPQ.getString("micro.process.invoice_sale_new.Print.PaymentDateByDeal"));
         } else {
            var15.setParameter("payment_date_name", this.FPQ.getString("micro.process.invoice_sale_new.Print.PaymentDate"));
            var15.setParameter("payment_date", this.FQF.getPaymentDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
         }

         String var25 = (String)this.FQF.QOQ().getValue();
         if (var25 != null) {
            var15.setParameter("exempt_reason", this.HOL(var25, 100));
         }

         String var26 = (String)this.FQF.DBB().getValue();
         if (var26 != null) {
            var15.setParameter("remarks", this.HOL(var26, 63));
         }

         var15.setParameter("sum_net_before_correction", this.FQJ.format(this.FQH.DAW().getValue()));
         var15.setParameter("sum_tax_before_correction", this.FQJ.format(this.FQH.DAX().getValue()));
         var15.setParameter("sum_brut_before_correction", this.FQJ.format(this.FQH.DAV().getValue()));
         var15.setParameter("correction_reason", this.HOL((String)this.FQF.getCorrectionReason().getValue(), 34));
         var15.setParameter("ref_id_old", this.FQG.DAS().getValue());
         var15.setParameter("creation_date_old", this.FQG.DAT().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
         var15.setParameter("diff_sum_net", this.FQJ.format(EQY.HRJ((BigDecimal)this.FQF.DAW().getValue(), (BigDecimal)this.FQH.DAW().getValue())));
         var15.setParameter("diff_sum_tax", this.FQJ.format(EQY.HRJ((BigDecimal)this.FQF.DAX().getValue(), (BigDecimal)this.FQH.DAX().getValue())));
         var15.setParameter("diff_sum_brut", this.FQJ.format(EQY.HRJ((BigDecimal)this.FQF.DAV().getValue(), (BigDecimal)this.FQH.DAV().getValue())));
         if (this.FQH.getInvoiceElements() != null && this.FQH.getInvoiceElements().size() != 0 && ((HQ)this.FQH.getInvoiceElements().get(0)).RIG().getValue() != null && ((QSV)((HQ)this.FQH.getInvoiceElements().get(0)).RIG().getValue()).equals(QSV.GROSS)) {
            var15.setParameter("unit_price_before_correction", this.FPQ.getString("micro.process.invoice_sale_new.Print.InvoiceElementBrutPrice"));
         } else {
            var15.setParameter("unit_price_before_correction", this.FPQ.getString("micro.process.invoice_sale_new.Print.InvoiceElementNetPrice"));
         }

         if (this.FQF.getInvoiceElements() != null && this.FQF.getInvoiceElements().size() != 0 && ((HQ)this.FQF.getInvoiceElements().get(0)).RIG().getValue() != null && ((QSV)((HQ)this.FQF.getInvoiceElements().get(0)).RIG().getValue()).equals(QSV.GROSS)) {
            var15.setParameter("unit_price", this.FPQ.getString("micro.process.invoice_sale_new.Print.InvoiceElementBrutPrice"));
         } else {
            var15.setParameter("unit_price", this.FPQ.getString("micro.process.invoice_sale_new.Print.InvoiceElementNetPrice"));
         }

         SAXResult var27 = new SAXResult(var13.getDefaultHandler());
         var15.transform(new StreamSource(var5), var27);
         var7.flush();
         var7.close();
      } catch (FileNotFoundException var32) {
         EXF.getInstance().ICA((Throwable)var32);
         throw FCZ.getInstance().IHI(this.FPP);
      } catch (TransformerException | TransformerFactoryConfigurationError | IOException | ConfigurationException | SAXException | ParserConfigurationException var33) {
         EXF.getInstance().ICA((Throwable)var33);
         throw FCZ.getInstance().IHL();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected Document HOP() throws ParserConfigurationException {
      EPM var1 = new EPM("invoiceSell");
      short var3 = 0;
      Iterator var4 = this.FQF.getInvoiceElements().iterator();

      Element var2;
      HQ var5;
      while(var4.hasNext()) {
         var5 = (HQ)var4.next();
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

      var3 = 0;
      var4 = this.FQH.getInvoiceElements().iterator();

      while(var4.hasNext()) {
         var5 = (HQ)var4.next();
         ++var3;
         var2 = var1.getDocument().createElement("invoiceSellElementsBeforeCorrection");
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

      Map var7 = EOZ.getTaxRateSummaryDiffForCorrection(this.FQF);
      Iterator var8 = var7.entrySet().iterator();

      while(var8.hasNext()) {
         Map.Entry var6 = (Map.Entry)var8.next();
         var2 = var1.getDocument().createElement("summaryTable");
         var1.HOR("taxRate", ((KL)var6.getKey()).getDescription(), var2);
         var1.HOR("netSum", this.HOI((BigDecimal)((EWC)var6.getValue()).getFirstValue()), var2);
         var1.HOR("taxSum", this.HOI((BigDecimal)((EWC)var6.getValue()).getSecondValue()), var2);
         var1.HOR("brutSum", this.HOI((BigDecimal)((EWC)var6.getValue()).getThirdValue()), var2);
         var1.getRoot().appendChild(var2);
      }

      return var1.getDocument();
   }

   protected void HOG() throws FFK {
   }
}
