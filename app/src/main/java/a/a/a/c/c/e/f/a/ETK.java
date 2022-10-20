package a.a.a.c.c.e.f.a;

import a.a.a.b.f.FFK;
import a.a.a.c.c.d.d.b.EOC;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.e.a.InvoiceRecord;
import a.a.a.c.f.a.e.a.InvoiceRecordElement;
import a.a.a.c.f.a.e.a.InvoiceRecordElementPurchase;
import a.a.a.c.f.b.c.Amount;
import a.a.a.c.f.b.c.InvoicingDate;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.b.FCW;
import com.github.bademux.emk.utils.FopUtils;
import org.apache.fop.configuration.ConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.*;

import static com.github.bademux.emk.utils.LocaleUtils.LOCALE;

public class ETK {
    private UserData GHI;
    private UserData GHJ;
    private InvoiceRecord GHK;
    private InvoiceRecord GHL;
    private final ResourceBundle GHM;

    public ETK(ResourceBundle var1) {
        this.GHM = var1;
    }

    public void HVH(File var1) throws FFK, SAXException {
        this.HVJ(false, var1);
    }

    public void HVI(File var1) throws FFK, SAXException {
        this.HVJ(true, var1);
    }

    private void HVJ(boolean var1, final File file) throws FFK {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [print sales] clicked");
            InvoiceRecord var4 = this.GHK;
            if (var1) {
                var4 = this.GHL;
            }

            Transformer transformer = TransformerFactory.newInstance().newTransformer(new StreamSource(ETJ.class.getResourceAsStream("/fop/invoices_records.xsl")));
            ETI.setResources(this.GHM);
            transformer.setParameter("month", Month.of(var4.getPeriod().getMonth().getValue()).getDisplayName(TextStyle.FULL_STANDALONE, LOCALE));
            transformer.setParameter("year", var4.getPeriod().getYear().getValue());
            transformer.setParameter("isPurchase", var1);
            this.HVK(transformer, var1);
            try (var fos = new FileOutputStream(file)) {
                transformer.transform(new DOMSource(this.HVL(var4, var1)), new SAXResult(FopUtils.createFopHandler(fos)));
                fos.flush();
            }
            if (Desktop.isDesktopSupported()) {
                (new EVN() {
                    public void HZI() {
                        try {
                            Desktop.getDesktop().open(file);
                        } catch (IOException var2x) {
                            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var2x);
                        }

                    }
                }).start();
            }
        } catch (IOException | ParserConfigurationException | ConfigurationException | SAXException |
                 TransformerException var24) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var24);
            throw new FFK(var24);
        }

    }

    private void HVK(Transformer var1, boolean var2) {
        UserData var3;
        if (var2) {
            var3 = this.GHJ;
        } else {
            var3 = this.GHI;
        }

        var1.setParameter("contractorName", Optional.ofNullable(var3.getCompanyName().getValue()).orElse(""));
        var1.setParameter("contractorNIP", Optional.ofNullable(var3.getNip().getValue()).orElse(""));
        var1.setParameter("contractorFirstName", Optional.ofNullable(var3.getFirstName().getValue()).orElse(""));
        var1.setParameter("contractorSurname", Optional.ofNullable(var3.getSurname().getValue()).orElse(""));
        var1.setParameter("contractorStreet", Optional.ofNullable(var3.getAddress().getStreet().getValue()).orElse(""));
        var1.setParameter("contractorHouseNumber", Optional.ofNullable(var3.getAddress().getHouseNumber().getValue()).orElse(""));
        var1.setParameter("contractorApartmentNumber", Optional.ofNullable(var3.getAddress().getApartmentNumber().getValue()).orElse("").trim());
        var1.setParameter("contractorPostalCode", Optional.ofNullable(var3.getAddress().getPostalCode().getValue()).orElse(""));
        var1.setParameter("contractorCity", Optional.ofNullable(var3.getAddress().getCity().getValue()).orElse(""));
    }

    private Document HVL(InvoiceRecord var1, boolean var2) throws FFK, ParserConfigurationException {
        DocumentBuilderFactory var3 = DocumentBuilderFactory.newInstance();
        DocumentBuilder var4 = var3.newDocumentBuilder();
        Document var5 = var4.newDocument();
        Element var6 = var5.createElement("invoiceRecord");
        var5.appendChild(var6);
        this.HVM(var5, "gross", EOC.HNN(var1.QQR().getValue()), var6);
        this.HVM(var5, "net", EOC.HNN(var1.QQS().getValue()), var6);
        this.HVM(var5, "vat", EOC.HNN(var1.QQT().getValue()), var6);
        this.HVM(var5, "vat23Amount", this.getValue(var1.QQU(), true), var6);
        this.HVM(var5, "vat8Amount", this.getValue(var1.QQV(), true), var6);
        this.HVM(var5, "vat5Amount", this.getValue(var1.QQW(), true), var6);
        this.HVM(var5, "vat4Amount", this.getValue(var1.QQX(), true), var6);
        this.HVM(var5, "vat0Amount", this.getValue(var1.QQY(), true), var6);
        this.HVM(var5, "vatZwAmount", this.getValue(var1.QQZ(), true), var6);
        this.HVM(var5, "vatNpAmount", this.getValue(var1.QRA(), true), var6);
        this.HVM(var5, "vatOo23Amount", this.getValue(var1.QRB(), true), var6);
        this.HVM(var5, "vatOo8Amount", this.getValue(var1.QRC(), true), var6);
        this.HVM(var5, "vat23Tax", this.getValue(var1.QQU(), false), var6);
        this.HVM(var5, "vat8Tax", this.getValue(var1.QQV(), false), var6);
        this.HVM(var5, "vat5Tax", this.getValue(var1.QQW(), false), var6);
        this.HVM(var5, "vat4Tax", this.getValue(var1.QQX(), false), var6);
        this.HVM(var5, "vat0Tax", this.getValue(var1.QQY(), false), var6);
        this.HVM(var5, "vatZwTax", this.getValue(var1.QQZ(), false), var6);
        this.HVM(var5, "vatNpTax", this.getValue(var1.QRA(), false), var6);
        this.HVM(var5, "vatOo23Tax", this.getValue(var1.QRB(), false), var6);
        this.HVM(var5, "vatOo8Tax", this.getValue(var1.QRC(), false), var6);
        Iterator var7 = var1.getInvoiceRecordElements().iterator();

        while (var7.hasNext()) {
            InvoiceRecordElement var8 = (InvoiceRecordElement) var7.next();
            byte var9 = 8;
            byte var10 = 13;
            byte var11 = 13;
            if (var2) {
                var9 = 7;
                var10 = 11;
                var11 = 12;
            }

            Element var12 = var5.createElement("invoiceRecordElement");
            if (var8.QRF().getValue() != null) {
                this.HVM(var5, "date", var8.QRF().DDZ(), var12);
            } else {
                this.HVM(var5, "date", (new InvoicingDate(new Date())).DDZ(), var12);
            }

            if (var8.HGX().getValue() != null) {
                this.HVN(var5, "refId", var8.HGX().getValue(), var12, Integer.valueOf(var9));
            } else {
                this.HVN(var5, "refId", "", var12, Integer.valueOf(var9));
            }

            this.HVP(var5, "contractor", var8.getContractor(), var12, var10, var11);
            if (var8.getInvoiceOtherSubType() != null) {
                this.HVM(var5, "taxReason", var8.getInvoiceOtherSubType().getDescription(), var12);
            } else if (var2 && ((InvoiceRecordElementPurchase) var8).DCD().getValue() != null) {
                this.HVM(var5, "taxReason", ((InvoiceRecordElementPurchase) var8).getTaxReason().getValue().getDescription(), var12);
            } else if (!var2) {
                this.HVM(var5, "taxReason", FCW.getInstance().getMessageForKey("micro.process.invoices_records.reason.sell"), var12);
            } else {
                this.HVM(var5, "taxReason", "", var12);
            }

            this.HVM(var5, "gross", EOC.HNN(var8.QRG().getValue()), var12);
            this.HVM(var5, "net", EOC.HNN(var8.QRH().getValue()), var12);
            this.HVM(var5, "vat", EOC.HNN(var8.QRI().getValue()), var12);
            this.HVM(var5, "vat23Amount", this.getValue(var8.QRJ(), true), var12);
            this.HVM(var5, "vat8Amount", this.getValue(var8.QRK(), true), var12);
            this.HVM(var5, "vat5Amount", this.getValue(var8.QRL(), true), var12);
            this.HVM(var5, "vat4Amount", this.getValue(var8.QRM(), true), var12);
            this.HVM(var5, "vat0Amount", this.getValue(var8.QRN(), true), var12);
            this.HVM(var5, "vatZwAmount", this.getValue(var8.QRO(), true), var12);
            this.HVM(var5, "vatNpAmount", this.getValue(var8.QRP(), true), var12);
            this.HVM(var5, "vatOo23Amount", this.getValue(var8.QRQ(), true), var12);
            this.HVM(var5, "vatOo8Amount", this.getValue(var8.QRR(), true), var12);
            this.HVM(var5, "vat23Tax", this.getValue(var8.QRJ(), false), var12);
            this.HVM(var5, "vat8Tax", this.getValue(var8.QRK(), false), var12);
            this.HVM(var5, "vat5Tax", this.getValue(var8.QRL(), false), var12);
            this.HVM(var5, "vat4Tax", this.getValue(var8.QRM(), false), var12);
            this.HVM(var5, "vat0Tax", this.getValue(var8.QRN(), false), var12);
            this.HVM(var5, "vatZwTax", this.getValue(var8.QRO(), false), var12);
            this.HVM(var5, "vatNpTax", this.getValue(var8.QRP(), false), var12);
            this.HVM(var5, "vatOo23Tax", this.getValue(var8.QRQ(), false), var12);
            this.HVM(var5, "vatOo8Tax", this.getValue(var8.QRR(), false), var12);
            var6.appendChild(var12);
        }

        return var5;
    }

    private void HVM(Document var1, String var2, String var3, Element var4) {
        this.HVN(var1, var2, var3, var4, null);
    }

    private void HVN(Document var1, String var2, String var3, Element var4, Integer var5) {
        Element var6 = var1.createElement(var2);
        var6.setTextContent(this.HVO(var3, var5));
        var4.appendChild(var6);
    }

    private String HVO(String var1, Integer var2) {
        if (var1 != null && var1.length() > 0) {
            String[] var3 = var1.split(" ");
            if (var2 == null) {
                return var1.replace(" ", " ").trim();
            } else {
                ArrayList var4 = new ArrayList();
                String[] var5 = var3;
                int var6 = var3.length;

                for (int var7 = 0; var7 < var6; ++var7) {
                    String var8 = var5[var7];
                    if (var8.length() <= var2) {
                        var4.add(var8);
                    } else {
                        StringBuilder var9 = new StringBuilder(var8);
                        int var10 = 0;

                        for (int var11 = var2; var11 < var8.length(); var11 += var2) {
                            var9.insert(var11 + var10++, "\u200b");
                        }

                        var4.add(var9.toString());
                    }
                }

                return String.join(" ", var4).replace(" ", " ").trim();
            }
        } else {
            return "";
        }
    }

    private void HVP(Document var1, String var2, Contractor var3, Element var4, int var5, int var6) {
        Element var7 = var1.createElement(var2);
        var4.appendChild(var7);
        if (var3 != null) {
            this.HVN(var1, "name", Optional.ofNullable(var3.getName().getValue()).orElse(""), var7, var5);
            this.HVN(var1, "nip", Optional.ofNullable(var3.getNip().getValue()).orElse(""), var7, var5);
            Element var8 = var1.createElement("address");
            var7.appendChild(var8);
            this.HVN(var1, "street", Optional.ofNullable(var3.getAddress().getStreet().getValue()).orElse(""), var8, var6);
            this.HVN(var1, "houseNumber", Optional.ofNullable(var3.getAddress().getHouseNumber().getValue()).orElse(""), var8, var6);
            this.HVN(var1, "apartmentNumber", Optional.ofNullable(var3.getAddress().getApartmentNumber().getValue()).orElse("").trim(), var8, var6);
            this.HVN(var1, "postalCode", Optional.ofNullable(var3.getAddress().getPostalCode().getValue()).orElse(""), var8, var6);
            this.HVN(var1, "city", Optional.ofNullable(var3.getAddress().getCity().getValue()).orElse(""), var8, var6);
        }

    }

    private String getValue(ValueContainer2<Amount, Amount> var1, boolean var2) {
        if (var1 != null) {
            if (var2 && var1.getFirstValue() != null && var1.getFirstValue().getValue() != null) {
                return EOC.HNN(var1.getFirstValue().getValue());
            }

            if (var1.getSecondValue() != null && var1.getSecondValue().getValue() != null) {
                return EOC.HNN(var1.getSecondValue().getValue());
            }
        }

        return "";
    }

    public void setSalesRegister(InvoiceRecord var1, UserData var2) {
        this.GHK = var1;
        this.GHI = var2;
    }

    public void setPurchasesRegister(InvoiceRecord var1, UserData var2) {
        this.GHL = var1;
        this.GHJ = var2;
    }
}
