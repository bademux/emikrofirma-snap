package a.a.a.c.d.b;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.d.e.EQY;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.d.EWC;
import a.a.a.c.e.a.g.EWX;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.d.AGXA;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.e.a.ID;
import a.a.a.c.f.a.e.a.IE;
import a.a.a.c.f.a.e.a.IF;
import a.a.a.c.f.a.e.a.IG;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.JV;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.b.c.a.QSV;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.g.b.FCW;
import a.a.a.c.g.c.FCZ;
import lombok.extern.slf4j.Slf4j;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.Pattern;

import static com.github.bademux.emk.utils.LocaleUtils.LOCALE;

@Slf4j
public class EQF {
    public static final Charset FVZ;
    private static final String FWA = "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2016/01/25/eD/DefinicjeTypy/";
    private static final String FWB = "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/";
    private static final String FWC = "http://www.w3.org/2001/XMLSchema-instance";
    private static final String ROW = "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/";
    private static final String QLD = "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/";
    private static final String QLE = "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2013/05/23/eD/KodyCECHKRAJOW/";
    private static final EQH<String> FWD;
    private static final EQH<BigDecimal> FWE;
    private static final EQH<Boolean> QLF;

    public EQF() {
    }

    public static byte[] RPC(EWX var0, String var1, File var2, LocalDate var3, LocalDate var4, LY var5, List<HY> var6) throws FFO {
        byte var7 = 0;
        FileOutputStream var8 = null;

        try {
            log.debug("outputFile " + var2);
            EWX.IBJ(var0, 0.05, 0L, 0L);
            MessageDigest var9 = MessageDigest.getInstance(var1);
            var8 = new FileOutputStream(var2);
            DigestOutputStream var10 = new DigestOutputStream(var8, var9);
            XMLOutputFactory var11 = XMLOutputFactory.newInstance();
            XMLStreamWriter var12 = var11.createXMLStreamWriter(var10, FVZ.name());
            var12.writeStartDocument(FVZ.name(), "1.0");
            var12.writeStartElement("tns", "JPK", "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/");
            var12.writeNamespace("etd", "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/");
            var12.writeNamespace("kck", "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2013/05/23/eD/KodyCECHKRAJOW/");
            var12.writeNamespace("tns", "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/");
            var12.writeNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
            var12.writeStartElement("http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "Naglowek");
            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "KodFormularza", AGXA.QLP.getKodFormularza(), new EQG("kodSystemowy", AGXA.QLP.getKodSystemowy()), new EQG("wersjaSchemy", AGXA.QLP.getWersjaSchemy()));
            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "WariantFormularza", AGXA.QLP.getWariantFormularza());
            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "CelZlozenia", "1");
            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "DataWytworzeniaJPK", (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX")).format(new Date()));
            String var13 = var3.toString();
            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "DataOd", var13);
            String var14 = var4.toString();
            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "DataDo", var14);
            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "KodUrzedu", var5.DFQ().getValue().getKey());
            var12.writeEndElement();
            var12.writeStartElement("http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "Podmiot1");
            var12.writeStartElement("http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "IdentyfikatorPodmiotu");
            HQE(var12, "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/", "NIP", var5.DFF().getValue());
            HQE(var12, "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/", "PelnaNazwa", var5.DFH().getValue());
            var12.writeEndElement();
            var12.writeStartElement("http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "AdresPodmiotu");
            HQE(var12, "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/", "KodKraju", var5.DFN().DCV().getValue());
            HQE(var12, "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/", "Wojewodztwo", var5.DFN().DCW().getValueAsString());
            HQE(var12, "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/", "Powiat", var5.DFN().DCX().getValue());
            HQE(var12, "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/", "Gmina", var5.DFN().DCY().getValue());
            HQE(var12, "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/", "Ulica", var5.DFN().DDA().getValue());
            HQE(var12, "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/", "NrDomu", var5.DFN().DDB().getValue());
            if (var5.DFN().DDC().getValue() != null && var5.DFN().DDC().getValue().length() > 0) {
                HQE(var12, "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/", "NrLokalu", var5.DFN().DDC().getValue());
            }

            HQE(var12, "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/", "Miejscowosc", var5.DFN().DCZ().getValue());
            HQE(var12, "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2018/08/24/eD/DefinicjeTypy/", "KodPocztowy", var5.DFN().DDD().getValue());
            var12.writeEndElement();
            var12.writeEndElement();
            BigDecimal var15 = BigDecimal.ZERO;

            for (Iterator var16 = var6.iterator(); var16.hasNext(); var12.writeEndElement()) {
                HY var17 = (HY) var16.next();
                var12.writeStartElement("http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "Faktura");
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "KodWaluty", "PLN");
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_1", var17.DAT().DDZ());
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_2A", var17.DAS().getValue());
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_3A", getContractorFromInvoiceSellType(var17).DAI().getValue());
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_3B", getContractorFromInvoiceSellType(var17).DAM().AICQ());
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_3C", var5.DFH().getValue());
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_3D", var5.DFN().AICQ());
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_4B", var5.DFF().getValue());
                if (!getContractorFromInvoiceSellType(var17).DAJ().getValue().equalsIgnoreCase("brak")) {
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_5B", getContractorFromInvoiceSellType(var17).DAJ().getValue());
                }

                JV var18 = null;
                if (var17.getInvoiceSubType().equals(IA.CORRECTION)) {
                    var18 = getOriginalInvoice((HV) var17).DAU();
                } else {
                    var18 = var17.DAU();
                }

                if (!var17.DAT().DDZ().equals(var18.DDZ())) {
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_6", var18.DDZ());
                }

                EVZ var19;
                EVZ var20;
                EVZ var21;
                EVZ var22;
                EVZ var23;
                EVZ var24;
                EVZ var25;
                EVZ var26;
                EVZ var27;
                if (var17.getInvoiceSubType().equals(IA.CORRECTION)) {
                    Map var28 = getTaxRateSummaryDiffForCorrection((HV) var17);
                    if (var28.get(KL.RATE_23) != null) {
                        var19 = new EVZ(((EWC) var28.get(KL.RATE_23)).getFirstValue(), ((EWC) var28.get(KL.RATE_23)).getSecondValue());
                    } else {
                        var19 = new EVZ(BigDecimal.ZERO, BigDecimal.ZERO);
                    }

                    if (var28.get(KL.RATE_8) != null) {
                        var20 = new EVZ(((EWC) var28.get(KL.RATE_8)).getFirstValue(), ((EWC) var28.get(KL.RATE_8)).getSecondValue());
                    } else {
                        var20 = new EVZ(BigDecimal.ZERO, BigDecimal.ZERO);
                    }

                    if (var28.get(KL.RATE_5) != null) {
                        var21 = new EVZ(((EWC) var28.get(KL.RATE_5)).getFirstValue(), ((EWC) var28.get(KL.RATE_5)).getSecondValue());
                    } else {
                        var21 = new EVZ(BigDecimal.ZERO, BigDecimal.ZERO);
                    }

                    if (var28.get(KL.RATE_4) != null) {
                        var22 = new EVZ(((EWC) var28.get(KL.RATE_4)).getFirstValue(), ((EWC) var28.get(KL.RATE_4)).getSecondValue());
                    } else {
                        var22 = new EVZ(BigDecimal.ZERO, BigDecimal.ZERO);
                    }

                    if (var28.get(KL.RATE_0) != null) {
                        var23 = new EVZ(((EWC) var28.get(KL.RATE_0)).getFirstValue(), ((EWC) var28.get(KL.RATE_0)).getSecondValue());
                    } else {
                        var23 = new EVZ(BigDecimal.ZERO, BigDecimal.ZERO);
                    }

                    if (var28.get(KL.ZW) != null) {
                        var24 = new EVZ(((EWC) var28.get(KL.ZW)).getFirstValue(), ((EWC) var28.get(KL.ZW)).getSecondValue());
                    } else {
                        var24 = new EVZ(BigDecimal.ZERO, BigDecimal.ZERO);
                    }

                    if (var28.get(KL.OO_23) != null) {
                        var25 = new EVZ(((EWC) var28.get(KL.OO_23)).getFirstValue(), ((EWC) var28.get(KL.OO_23)).getSecondValue());
                    } else {
                        var25 = new EVZ(BigDecimal.ZERO, BigDecimal.ZERO);
                    }

                    if (var28.get(KL.OO_8) != null) {
                        var26 = new EVZ(((EWC) var28.get(KL.OO_8)).getFirstValue(), ((EWC) var28.get(KL.OO_8)).getSecondValue());
                    } else {
                        var26 = new EVZ(BigDecimal.ZERO, BigDecimal.ZERO);
                    }

                    if (var28.get(KL.NP) != null) {
                        var27 = new EVZ(((EWC) var28.get(KL.NP)).getFirstValue(), ((EWC) var28.get(KL.NP)).getSecondValue());
                    } else {
                        var27 = new EVZ(BigDecimal.ZERO, BigDecimal.ZERO);
                    }
                } else {
                    var19 = var17.getNetAndTaxForTaxRate(KL.RATE_23);
                    var20 = var17.getNetAndTaxForTaxRate(KL.RATE_8);
                    var21 = var17.getNetAndTaxForTaxRate(KL.RATE_5);
                    var22 = var17.getNetAndTaxForTaxRate(KL.RATE_4);
                    var23 = var17.getNetAndTaxForTaxRate(KL.RATE_0);
                    var24 = var17.getNetAndTaxForTaxRate(KL.ZW);
                    var25 = var17.getNetAndTaxForTaxRate(KL.OO_23);
                    var26 = var17.getNetAndTaxForTaxRate(KL.OO_8);
                    var27 = var17.getNetAndTaxForTaxRate(KL.NP);
                }

                if (var17.getInvoiceSubType().equals(IA.CORRECTION)) {
                    var15 = var15.add(((HV) var17).DBZ().getValue());
                } else {
                    var15 = var15.add(var17.DAV().getValue());
                }

                if (!var19.getFirstValue().equals(BigDecimal.ZERO) || !var19.getSecondValue().equals(BigDecimal.ZERO) || !var25.getFirstValue().equals(BigDecimal.ZERO)) {
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_13_1", (EQH) FWE, var19.getFirstValue());
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_14_1", (EQH) FWE, var19.getSecondValue());
                }

                if (!var20.getFirstValue().equals(BigDecimal.ZERO) || !var20.getSecondValue().equals(BigDecimal.ZERO) || !var26.getFirstValue().equals(BigDecimal.ZERO)) {
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_13_2", (EQH) FWE, var20.getFirstValue());
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_14_2", (EQH) FWE, var20.getSecondValue());
                }

                if (!var21.getFirstValue().equals(BigDecimal.ZERO) || !var21.getSecondValue().equals(BigDecimal.ZERO)) {
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_13_3", (EQH) FWE, var21.getFirstValue());
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_14_3", (EQH) FWE, var21.getSecondValue());
                }

                BigDecimal var53 = getBigDecimalSum((BigDecimal) var22.getFirstValue(), (BigDecimal) var25.getFirstValue(), (BigDecimal) var26.getFirstValue());
                BigDecimal var29 = (BigDecimal) var22.getSecondValue();
                if (!var53.equals(BigDecimal.ZERO) || !var29.equals(BigDecimal.ZERO)) {
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_13_4", FWE, var53);
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_14_4", FWE, var29);
                }

                if (!var27.getFirstValue().equals(BigDecimal.ZERO)) {
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_13_5", (EQH) FWE, var27.getFirstValue());
                }

                if (!var23.getFirstValue().equals(BigDecimal.ZERO) || !var23.getSecondValue().equals(BigDecimal.ZERO)) {
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_13_6", (EQH) FWE, var23.getFirstValue());
                }

                if (!var24.getFirstValue().equals(BigDecimal.ZERO) || !var24.getSecondValue().equals(BigDecimal.ZERO)) {
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_13_7", (EQH) FWE, var24.getFirstValue());
                }

                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_15", FWE, getBigDecimalSum((BigDecimal) var19.getFirstValue(), (BigDecimal) var20.getFirstValue(), (BigDecimal) var21.getFirstValue(), var53, (BigDecimal) var27.getFirstValue(), (BigDecimal) var23.getFirstValue(), (BigDecimal) var24.getFirstValue(), (BigDecimal) var19.getSecondValue(), (BigDecimal) var20.getSecondValue(), (BigDecimal) var21.getSecondValue(), var29, BigDecimal.ZERO));
                boolean var30 = !var25.getFirstValue().equals(BigDecimal.ZERO) || !var26.getFirstValue().equals(BigDecimal.ZERO);

                boolean var31 = !var24.getFirstValue().equals(BigDecimal.ZERO);

                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_16", QLF, false);
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_17", QLF, false);
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_18", QLF, var30);
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_18A", QLF, var17.getMpp().getValue());
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_19", QLF, var31);
                if (var31) {
                    if (var17.QOQ().getValue() != null) {
                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_19A", var17.QOQ().getValue());
                    } else {
                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_19A", "");
                    }
                }

                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_20", QLF, false);
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_21", QLF, false);
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_22", "");
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_23", QLF, false);
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_106E_2", QLF, false);
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_106E_3", QLF, false);
                HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "RodzajFaktury", var17.getInvoiceSubType().getJpkName());
                if (var17.getInvoiceSubType().equals(IA.CORRECTION)) {
                    HV var32 = (HV) var17;
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "PrzyczynaKorekty", var32.DBX().getValue());
                    HU var33 = getOriginalInvoice(var32);
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "NrFaKorygowanej", var33.DAS().getValue());
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "OkresFaKorygowanej", var33.IYZ().DDZ());
                }
            }

            var12.writeStartElement("http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "FakturaCtrl");
            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "LiczbaFaktur", String.valueOf(var6.size()));
            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "WartoscFaktur", FWE, var15);
            var12.writeEndElement();
            int var43 = 0;
            BigDecimal var44 = BigDecimal.ZERO;
            Iterator var45 = var6.iterator();

            while (var45.hasNext()) {
                HY var47 = (HY) var45.next();
                if (var47.getInvoiceSubType().equals(IA.CORRECTION)) {
                    HN var48 = var47.getParentInvoiceOnlyActive();

                    for (Iterator var50 = ((HY) var48).getInvoiceElements().iterator(); var50.hasNext(); var12.writeEndElement()) {
                        HQ var52 = (HQ) var50.next();
                        ++var43;
                        var12.writeStartElement("http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "FakturaWiersz");
                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_2B", var47.DAS().getValue());
                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_7", var52.DBE().getValue());
                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_8A", var52.DBH().getValue());
                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_8B", FWE, var52.DBG().getValue());
                        if (var52.RIG().getValue() == null) {
                            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_9A", FWE, BigDecimal.ZERO.subtract(var52.DBI().getValue()));
                        } else if (var52.RIG().getValue().equals(QSV.NET)) {
                            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_9A", FWE, BigDecimal.ZERO.subtract(var52.DBI().getValue()));
                        } else if (var52.RIG().getValue().equals(QSV.GROSS)) {
                            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_9B", FWE, BigDecimal.ZERO.subtract(var52.RIF().getValue()));
                        }

                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_11", FWE, BigDecimal.ZERO.subtract(var52.DBK().getValue()));
                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_11A", FWE, BigDecimal.ZERO.subtract(var52.DBM().getValue()));
                        var44 = var44.add(BigDecimal.ZERO.subtract(var52.DBK().getValue()));
                        if (var52.DBN().getValue().DEQ()) {
                            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_12", "oo");
                        } else {
                            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_12", var52.DBN().getValue().getJpkName().toLowerCase());
                        }
                    }
                }

                for (Iterator var49 = var47.getInvoiceElements().iterator(); var49.hasNext(); var12.writeEndElement()) {
                    HQ var51 = (HQ) var49.next();
                    ++var43;
                    var12.writeStartElement("http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "FakturaWiersz");
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_2B", var47.DAS().getValue());
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_7", var51.DBE().getValue());
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_8A", var51.DBH().getValue());
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_8B", FWE, var51.DBG().getValue());
                    if (var51.RIG().getValue() == null) {
                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_9A", FWE, var51.DBI().getValue());
                    } else if (var51.RIG().getValue().equals(QSV.NET)) {
                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_9A", FWE, var51.DBI().getValue());
                    } else if (var51.RIG().getValue().equals(QSV.GROSS)) {
                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_9B", FWE, var51.RIF().getValue());
                    }

                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_11", FWE, var51.DBK().getValue());
                    HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_11A", FWE, var51.DBM().getValue());
                    var44 = var44.add(var51.DBK().getValue());
                    if (var51.DBN().getValue().DEQ()) {
                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_12", "oo");
                    } else {
                        HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "P_12", var51.DBN().getValue().getJpkName().toLowerCase());
                    }
                }
            }

            var12.writeStartElement("http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "FakturaWierszCtrl");
            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "LiczbaWierszyFaktur", String.valueOf(var43));
            HQE(var12, "http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "WartoscWierszyFaktur", FWE, var44);
            var12.writeEndElement();
            var12.writeEndElement();
            EWX.IBJ(var0, 0.99, 0L, 0L);
            var12.close();
            byte[] var46 = var9.digest();
            return var46;
        } catch (Exception e) {
            log.error("Something bad happened", e);
            throw FCZ.getInstance().IHW(var7, e);
        } finally {
            if (var8 != null) {
                try {
                    var8.close();
                } catch (IOException e) {
                    log.error("Something bad happened", e);
                }
            }

        }
    }

    public static Map<KL, EWC<BigDecimal, BigDecimal, BigDecimal>> getTaxRateSummaryDiffForCorrection(HV var0) {

        HN var1 = var0.getParentInvoiceOnlyActive();
        HashMap var2 = new HashMap();
        Iterator var3 = var0.getSumOfAmountsDividedByTaxRate().iterator();
        Iterator var4 = var0.getAmountOfTaxDividedByTaxRate().iterator();
        Iterator var5 = var0.getSumOfGrossAmountsDividedByTaxRate().iterator();

        EVZ var6;
        EVZ var7;
        EVZ var8;
        while (var3.hasNext()) {
            var6 = (EVZ) var3.next();
            var7 = (EVZ) var4.next();
            var8 = (EVZ) var5.next();
            var2.put(var6.getFirstValue(), new EWC(var6.getSecondValue(), var7.getSecondValue(), var8.getSecondValue()));
        }

        var3 = var1.getSumOfAmountsDividedByTaxRate().iterator();
        var4 = var1.getAmountOfTaxDividedByTaxRate().iterator();
        var5 = var1.getSumOfGrossAmountsDividedByTaxRate().iterator();

        while (var3.hasNext()) {
            var6 = (EVZ) var3.next();
            var7 = (EVZ) var4.next();
            var8 = (EVZ) var5.next();
            if (var2.get(var6.getFirstValue()) == null) {
                var2.put(var6.getFirstValue(), new EWC(EQY.HRJ(BigDecimal.ZERO, (BigDecimal) var6.getSecondValue()), EQY.HRJ(BigDecimal.ZERO, (BigDecimal) var7.getSecondValue()), EQY.HRJ(BigDecimal.ZERO, (BigDecimal) var8.getSecondValue())));
            } else {
                ((EWC) var2.get(var6.getFirstValue())).setFirstValue(EQY.HRJ((BigDecimal) ((EWC) var2.get(var6.getFirstValue())).getFirstValue(), (BigDecimal) var6.getSecondValue()));
                ((EWC) var2.get(var6.getFirstValue())).setSecondValue(EQY.HRJ((BigDecimal) ((EWC) var2.get(var6.getFirstValue())).getSecondValue(), (BigDecimal) var7.getSecondValue()));
                ((EWC) var2.get(var6.getFirstValue())).setThirdValue(EQY.HRJ((BigDecimal) ((EWC) var2.get(var6.getFirstValue())).getThirdValue(), (BigDecimal) var8.getSecondValue()));
            }
        }

        HashMap var12 = var2;
        return var12;
    }

    public static HI getContractorFromInvoiceSellType(HY var0) {

        HI var1;
        switch (var0.getInvoiceSubType()) {
            case INVOICE:
            case AGGREGATE:
                var1 = ((HU) var0).DBV();
                return var1;
            case CORRECTION:
                var1 = getOriginalInvoice((HV) var0).DBV();
                return var1;
            default:
                throw new FFI("unknown invoice subtype");
        }
    }

    public static HU getOriginalInvoice(HV var0) {

        Object var1;
        for (var1 = var0; ((HN) var1).getParentInvoiceOnlyActive() != null; var1 = ((HN) var1).getParentInvoiceOnlyActive()) {
        }

        HU var2 = (HU) var1;
        return var2;
    }

    public static byte[] HQD(EWX var0, String var1, File var2, String var3, JN var4, LY var5, IG var6, IF var7) throws FFO {

        byte var8 = 0;
        FileOutputStream var9 = null;

        byte[] var67;
        try {
            log.debug("outputFile " + var2);
            EWX.IBJ(var0, 0.05, 0L, 0L);
            MessageDigest var10 = MessageDigest.getInstance(var1);
            var9 = new FileOutputStream(var2);
            DigestOutputStream var11 = new DigestOutputStream(var9, var10);
            XMLOutputFactory var12 = XMLOutputFactory.newInstance();
            XMLStreamWriter var13 = var12.createXMLStreamWriter(var11, FVZ.name());
            var13.writeStartDocument(FVZ.name(), "1.0");
            var13.writeStartElement("tns", "JPK", "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/");
            var13.writeNamespace("etd", "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2016/01/25/eD/DefinicjeTypy/");
            var13.writeNamespace("tns", "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/");
            var13.writeNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
            var13.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "Naglowek");
            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "KodFormularza", AGXA.AHSV.getKodFormularza(), new EQG("kodSystemowy", AGXA.AHSV.getKodSystemowy()), new EQG("wersjaSchemy", AGXA.AHSV.getWersjaSchemy()));
            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "WariantFormularza", AGXA.AHSV.getWariantFormularza());
            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "CelZlozenia", var3);
            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataWytworzeniaJPK", (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX")).format(new Date()));
            String var14 = var4.DDJ().getValueAsString() + "-" + String.format("%02d", var4.DDK().getValue()) + "-";
            String var15 = var14 + "01";
            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataOd", var15);
            Date var16 = (new SimpleDateFormat("yyyy-MM-dd")).parse(var15);
            GregorianCalendar var17 = new GregorianCalendar();
            var17.setTime(var16);
            String var18 = var14 + String.format("%02d", var17.getActualMaximum(5));
            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataDo", var18);
            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NazwaSystemu", "e-mikrofirma");
            var13.writeEndElement();
            Calendar.getInstance().getActualMaximum(5);
            var13.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "Podmiot1");
            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NIP", var5.DFF().getValue());
            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "PelnaNazwa", var5.DFH().getValue());
            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "Email", var5.DFL().getValue());
            var13.writeEndElement();
            EWX.IBJ(var0, 0.1, 0L, 0L);
            int var19;
            int var20;
            BigDecimal var29;
            BigDecimal var30;
            BigDecimal var31;
            BigDecimal var32;
            if (var6 != null) {
                var19 = var6.getInvoiceRecordElements().size();
                var20 = 0;
                HashSet var21 = new HashSet();
                boolean var22 = false;
                String var23 = "BRAK";
                String var24 = "BRAK";
                String var25 = "BRAK";
                String var26 = "Sprzedaż na rzecz osoby prywatnej";
                JV var27 = new JV("2006-01-01");
                JV var28 = new JV("2006-01-01");
                var29 = null;
                var30 = null;
                var31 = null;
                var32 = null;
                BigDecimal var33 = null;
                BigDecimal var34 = null;
                BigDecimal var35 = null;
                BigDecimal var36 = null;
                BigDecimal var37 = null;
                BigDecimal var38 = null;
                BigDecimal var39 = null;
                BigDecimal var40 = BigDecimal.ZERO;
                Iterator var41 = var6.getInvoiceRecordElements().iterator();

                label1557:
                while (true) {
                    ID var42;
                    BigDecimal var46;
                    BigDecimal var47;
                    String var50;
                    ID var52;
                    String var53;
                    String var54;
                    boolean var80;
                    boolean var82;
                    BigDecimal var85;
                    BigDecimal var87;
                    BigDecimal var90;
                    Iterator var91;
                    BigDecimal var93;
                    do {
                        do {
                            do {
                                if (!var41.hasNext()) {
                                    BigDecimal var77 = BigDecimal.ZERO;
                                    if (var22) {
                                        ++var20;
                                        var13.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "SprzedazWiersz");
                                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "LpSprzedazy", String.valueOf(var20));
                                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NrKontrahenta", var23);
                                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NazwaKontrahenta", var24);
                                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "AdresKontrahenta", var25);
                                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DowodSprzedazy", var26);
                                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataWystawienia", var27.DDZ());
                                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataSprzedazy", var28.DDZ());
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_10", FWE, var29);
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_13", FWE, var30);
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_15", FWE, var31);
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_16", FWE, var32);
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_17", FWE, var33);
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_18", FWE, var34);
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_19", FWE, var35);
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_20", FWE, var36);
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_31", FWE, var37);
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_34", FWE, var38);
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_35", FWE, var39);
                                        var13.writeEndElement();
                                        var77 = getBigDecimalSum(var77, var40);
                                    }

                                    Iterator var78 = var6.getInvoiceRecordElements().iterator();

                                    while (true) {
                                        ID var79;
                                        do {
                                            if (!var78.hasNext()) {
                                                if (var20 > 0) {
                                                    var13.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "SprzedazCtrl");
                                                    HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "LiczbaWierszySprzedazy", String.valueOf(var20));
                                                    HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "PodatekNalezny", FWE, var77);
                                                    var13.writeEndElement();
                                                }
                                                break label1557;
                                            }

                                            var79 = (ID) var78.next();
                                        } while (var21.contains(var79));

                                        ++var20;
                                        EWX.IBJ(var0, 0.15 + 0.4 * ((double) var20 / (double) var19), 0L, 0L);
                                        var13.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "SprzedazWiersz");
                                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "LpSprzedazy", String.valueOf(var20));
                                        if (var79.getContractor() == null) {
                                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NrKontrahenta", FCW.getInstance().getMessageForKey("micro.process.general.nip.null"));
                                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NazwaKontrahenta", FCW.getInstance().getMessageForKey("micro.process.general.contractorname.null"));
                                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "AdresKontrahenta", FCW.getInstance().getMessageForKey("micro.process.general.address.null"));
                                        } else {
                                            if (var79.getContractor().getNip() != null && var79.getContractor().getNip().getValue() != null && var79.getContractor().getNip().getValue().trim().length() != 0) {
                                                HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NrKontrahenta", var79.getContractor().getNip().getValue());
                                            } else {
                                                HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NrKontrahenta", FCW.getInstance().getMessageForKey("micro.process.general.nip.null"));
                                            }

                                            if (var79.getContractor().getName() != null && var79.getContractor().getName().getValue() != null && var79.getContractor().getName().getValue().trim().length() != 0) {
                                                HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NazwaKontrahenta", var79.getContractor().getName().getValue());
                                            } else {
                                                HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NazwaKontrahenta", FCW.getInstance().getMessageForKey("micro.process.general.contractorname.null"));
                                            }

                                            if (var79.getContractor().getAddress() != null) {
                                                String var81 = var79.getContractor().getAddress().AICQ();
                                                if (var81 != null && var81.trim().length() != 0) {
                                                    HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "AdresKontrahenta", var79.getContractor().getAddress().AICQ());
                                                } else {
                                                    HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "AdresKontrahenta", FCW.getInstance().getMessageForKey("micro.process.general.address.null"));
                                                }
                                            } else {
                                                HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "AdresKontrahenta", FCW.getInstance().getMessageForKey("micro.process.general.address.null"));
                                            }
                                        }
                                        var80 = var79.RII().getValue() != null && var79.RII().getValue() || var79.RIJ().getValue() != null && var79.RIJ().getValue();
                                        var82 = var79.RIK().getValue() != null && var79.RIK().getValue() || var79.RIL().getValue() != null && var79.RIL().getValue();

                                        if (var79.HGX().getValue() != null) {
                                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DowodSprzedazy", var79.HGX().getValue());
                                        }

                                        if (!var80 && !var82) {
                                            if (var79.AICN().getValue() != null && !var82) {
                                                HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataWystawienia", var79.AICN().DDZ());
                                            }

                                            if (var79.AICO().getValue() != null) {
                                                HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataSprzedazy", var79.AICO().DDZ());
                                            }
                                        } else if (var80) {
                                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataWystawienia", var79.AICN().DDZ());
                                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataSprzedazy", var79.QRF().DDZ());
                                        } else if (var82) {
                                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataWystawienia", var79.QRF().DDZ());
                                        }

                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_10", FWE, getBigDecimalValue(var79.QRO().getFirstValue()));
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_13", FWE, getBigDecimalValue(var79.QRN().getFirstValue()));
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_15", FWE, getBigDecimalValue(var79.QRL().getFirstValue()));
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_16", FWE, getBigDecimalValue(var79.QRL().getSecondValue()));
                                        if (var79.getVat4() != null && var79.getVat4().getFirstValue() != null && var79.getVat4().getFirstValue().getValue() != null || var79.getVat8() != null && var79.getVat8().getFirstValue() != null && var79.getVat8().getFirstValue().getValue() != null) {
                                            HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_17", FWE, getBigDecimalValue(var79.QRT().getFirstValue()));
                                            HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_18", FWE, getBigDecimalValue(var79.QRT().getSecondValue()));
                                        }

                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_19", FWE, getBigDecimalValue(var79.QRJ().getFirstValue()));
                                        HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_20", FWE, getBigDecimalValue(var79.QRJ().getSecondValue()));
                                        var46 = BigDecimal.ZERO;
                                        if (var79.getFromPurchase() != null) {
                                            if (!(Boolean) var79.getFromPurchase().getValue() && (var79.getVatOo23() != null && var79.getVatOo23().getFirstValue() != null && var79.getVatOo23().getFirstValue().getValue() != null || var79.getVatOo8() != null && var79.getVatOo8().getFirstValue() != null && var79.getVatOo8().getFirstValue().getValue() != null)) {
                                                HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_31", FWE, getBigDecimalValueSum(var79.QRQ().getFirstValue(), var79.QRR().getFirstValue()));
                                            }

                                            if (var79.getFromPurchase().getValue()) {
                                                var47 = BigDecimal.ZERO;
                                                var85 = BigDecimal.ZERO;
                                                var87 = BigDecimal.ZERO;
                                                var90 = BigDecimal.ZERO;
                                                var47 = getBigDecimalValueOrZero(var79.QRR().getFirstValue());
                                                var85 = getBigDecimalValueOrZero(var79.QRR().getSecondValue());
                                                var87 = getBigDecimalValueOrZero(var79.QRQ().getFirstValue());
                                                var90 = getBigDecimalValueOrZero(var79.QRQ().getSecondValue());
                                                HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_34", FWE, getBigDecimalSum(var47, var87));
                                                var46 = getBigDecimalSum(var85, var90);
                                                HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_35", FWE, var46);
                                            }
                                        } else if ((QQP(BigDecimal.ZERO, var79.QRQ().getFirstValue()) < 0 || QQP(BigDecimal.ZERO, var79.QRR().getFirstValue()) < 0) && var7 != null) {
                                            boolean var86 = false;
                                            boolean var89 = false;
                                            String var92 = var79.HGX().getValue();
                                            var50 = var79.HGY().DAJ().getValue();
                                            if (var92 == null || var50 == null) {
                                                throw new FFI("InvoiceRecordElement refId, or contractors nip is null!");
                                            }

                                            var91 = var7.getInvoiceRecordElements().iterator();

                                            while (var91.hasNext()) {
                                                var52 = (ID) var91.next();
                                                var53 = var52.HGX().getValue();
                                                var54 = var52.HGY().DAJ().getValue();
                                                if (var92.equals(var53) && var50.equals(var54)) {
                                                    var86 = true;
                                                    break;
                                                }
                                            }

                                            BigDecimal var94;
                                            if (var86) {
                                                var93 = null;
                                                var94 = null;
                                                if (QQP(BigDecimal.ZERO, var79.QRR().getFirstValue()) < 0) {
                                                    var93 = getBigDecimalValueOrZero(var79.QRR().getSecondValue());
                                                }

                                                if (QQP(BigDecimal.ZERO, var79.QRQ().getFirstValue()) < 0) {
                                                    var94 = getBigDecimalValueOrZero(var79.QRQ().getSecondValue());
                                                }

                                                if (QQQ(BigDecimal.ZERO, var93) >= 0 && QQQ(BigDecimal.ZERO, var94) >= 0) {
                                                    int var95 = 0;
                                                    Iterator var97 = var6.getInvoiceRecordElements().iterator();

                                                    while (var97.hasNext()) {
                                                        ID var55 = (ID) var97.next();
                                                        String var56 = var55.HGX().getValue();
                                                        String var57 = var55.HGY().DAJ().getValue();
                                                        if (var92.equals(var56) && var50.equals(var57)) {
                                                            ++var95;
                                                        }
                                                    }

                                                    if (var95 == 1) {
                                                        var89 = true;
                                                    }

                                                    if (var95 > 1) {
                                                        throw new FFI("Identical minimal values in sale and purchase!");
                                                    }
                                                } else {
                                                    var89 = true;
                                                }
                                            }

                                            if (!var89 && (var79.getVatOo23() != null && var79.getVatOo23().getFirstValue() != null && var79.getVatOo23().getFirstValue().getValue() != null || var79.getVatOo8() != null && var79.getVatOo8().getFirstValue() != null && var79.getVatOo8().getFirstValue().getValue() != null)) {
                                                HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_31", FWE, getBigDecimalValueSum(var79.QRQ().getFirstValue(), var79.QRR().getFirstValue()));
                                            }

                                            if (var89) {
                                                var93 = BigDecimal.ZERO;
                                                var94 = BigDecimal.ZERO;
                                                BigDecimal var96 = BigDecimal.ZERO;
                                                BigDecimal var98 = BigDecimal.ZERO;
                                                var93 = getBigDecimalValueOrZero(var79.QRR().getFirstValue());
                                                var94 = getBigDecimalValueOrZero(var79.QRR().getSecondValue());
                                                var96 = getBigDecimalValueOrZero(var79.QRQ().getFirstValue());
                                                var98 = getBigDecimalValueOrZero(var79.QRQ().getSecondValue());
                                                HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_34", FWE, getBigDecimalSum(var93, var96));
                                                var46 = getBigDecimalSum(var94, var98);
                                                HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_35", FWE, var46);
                                            }
                                        }

                                        var47 = BigDecimal.ZERO;
                                        var85 = BigDecimal.ZERO;
                                        if (var79.RIK().getValue() != null && var79.RIK().getValue()) {
                                            var47 = var79.QRI().getValue();
                                            HQE(var13, false, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_36", FWE, var47);
                                        }

                                        if (var79.RIL().getValue() != null && var79.RIL().getValue()) {
                                            var85 = var79.QRI().getValue();
                                            HQE(var13, false, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_37", FWE, var85);
                                        }

                                        var13.writeEndElement();
                                        var77 = getBigDecimalValueSum(var77, var79.QRL().getSecondValue(), var79.QRT().getSecondValue(), var79.QRJ().getSecondValue(), new JR(var46), new JR(var47), new JR(var85));
                                    }
                                }

                                var42 = (ID) var41.next();
                            } while (var42.getContractor() == null);
                        } while (var42.getContractor().getNip() == null);
                    } while (!"BRAK".equals(var42.getContractor().getNip().getValue()));

                    var21.add(var42);
                    var22 = true;
                    if (var42.AICN().compareTo(var27) < 0) {
                        var27 = var42.AICN();
                    }

                    if (var42.AICO().compareTo(var28) < 0) {
                        var28 = var42.AICO();
                    }

                    if (var42.getVatZw() != null && var42.getVatZw().getFirstValue() != null && var42.getVatZw().getFirstValue().getValue() != null) {
                        var29 = getBigDecimalValueSum(var29, var42.QRO().getFirstValue());
                    }

                    if (var42.getVat0() != null && var42.getVat0().getFirstValue() != null && var42.getVat0().getFirstValue().getValue() != null) {
                        var30 = getBigDecimalValueSum(var30, var42.QRN().getFirstValue());
                    }

                    if (var42.getVat5() != null && (var42.getVat5().getFirstValue() != null && var42.getVat5().getFirstValue().getValue() != null || var42.getVat5().getSecondValue() != null && var42.getVat5().getSecondValue().getValue() != null)) {
                        var31 = getBigDecimalValueSum(var31, var42.QRL().getFirstValue());
                        var32 = getBigDecimalValueSum(var32, var42.QRL().getSecondValue());
                    }

                    if (var42.getVat4() != null && var42.getVat4().getFirstValue() != null && var42.getVat4().getFirstValue().getValue() != null || var42.getVat8() != null && var42.getVat8().getFirstValue() != null && var42.getVat8().getFirstValue().getValue() != null) {
                        var33 = getBigDecimalValueSum(var33, var42.QRT().getFirstValue());
                        var34 = getBigDecimalValueSum(var34, var42.QRT().getSecondValue());
                    }

                    if (var42.getVat23() != null && (var42.getVat23().getFirstValue() != null && var42.getVat23().getFirstValue().getValue() != null || var42.getVat23().getSecondValue() != null && var42.getVat23().getSecondValue().getValue() != null)) {
                        var35 = getBigDecimalValueSum(var35, var42.QRJ().getFirstValue());
                        var36 = getBigDecimalValueSum(var36, var42.QRJ().getSecondValue());
                    }

                    BigDecimal var43 = BigDecimal.ZERO;
                    if (var42.getFromPurchase() != null) {
                        if (!(Boolean) var42.getFromPurchase().getValue() && (var42.getVatOo23() != null && var42.getVatOo23().getFirstValue() != null && var42.getVatOo23().getFirstValue().getValue() != null || var42.getVatOo8() != null && var42.getVatOo8().getFirstValue() != null && var42.getVatOo8().getFirstValue().getValue() != null)) {
                            var37 = getBigDecimalValueSum(var37, var42.QRQ().getFirstValue(), var42.QRR().getFirstValue());
                        }

                        if (var42.getFromPurchase().getValue() && (var42.getVatOo23() != null && var42.getVatOo23().getFirstValue() != null && var42.getVatOo23().getFirstValue().getValue() != null || var42.getVatOo8() != null && var42.getVatOo8().getFirstValue() != null && var42.getVatOo8().getFirstValue().getValue() != null)) {
                            BigDecimal var44 = BigDecimal.ZERO;
                            BigDecimal var45 = BigDecimal.ZERO;
                            var46 = BigDecimal.ZERO;
                            var47 = BigDecimal.ZERO;
                            var44 = getBigDecimalValueOrZero(var42.QRR().getFirstValue());
                            var45 = getBigDecimalValueOrZero(var42.QRR().getSecondValue());
                            var46 = getBigDecimalValueOrZero(var42.QRQ().getFirstValue());
                            var47 = getBigDecimalValueOrZero(var42.QRQ().getSecondValue());
                            var38 = getBigDecimalSum(var38, var44, var46);
                            var43 = getBigDecimalSum(var45, var47);
                            var39 = getBigDecimalSum(var39, var43);
                        }
                    } else if ((QQP(BigDecimal.ZERO, var42.QRQ().getFirstValue()) < 0 || QQP(BigDecimal.ZERO, var42.QRR().getFirstValue()) < 0) && var7 != null) {
                        var80 = false;
                        var82 = false;
                        String var83 = var42.HGX().getValue();
                        String var84 = var42.HGY().DAJ().getValue();
                        if (var83 == null || var84 == null) {
                            throw new FFI("InvoiceRecordElement refId, or contractors nip is null!");
                        }

                        Iterator var48 = var7.getInvoiceRecordElements().iterator();

                        while (var48.hasNext()) {
                            ID var49 = (ID) var48.next();
                            var50 = var49.HGX().getValue();
                            String var51 = var49.HGY().DAJ().getValue();
                            if (var83.equals(var50) && var84.equals(var51)) {
                                var80 = true;
                                break;
                            }
                        }

                        if (var80) {
                            var85 = BigDecimal.ZERO;
                            var87 = BigDecimal.ZERO;
                            if (QQP(BigDecimal.ZERO, var42.QRR().getFirstValue()) < 0) {
                                var85 = getBigDecimalValueOrZero(var42.QRR().getSecondValue());
                            }

                            if (QQP(BigDecimal.ZERO, var42.QRQ().getFirstValue()) < 0) {
                                var87 = getBigDecimalValueOrZero(var42.QRQ().getSecondValue());
                            }

                            if (QQQ(BigDecimal.ZERO, var85) >= 0 && QQQ(BigDecimal.ZERO, var87) >= 0) {
                                int var88 = 0;
                                var91 = var6.getInvoiceRecordElements().iterator();

                                while (var91.hasNext()) {
                                    var52 = (ID) var91.next();
                                    var53 = var52.HGX().getValue();
                                    var54 = var52.HGY().DAJ().getValue();
                                    if (var83.equals(var53) && var84.equals(var54)) {
                                        ++var88;
                                    }
                                }

                                if (var88 == 1) {
                                    var82 = true;
                                }

                                if (var88 > 1) {
                                    throw new FFI("Identical minimal values in sale and purchase!");
                                }
                            } else {
                                var82 = true;
                            }
                        }

                        if (!var82 && (var42.getVatOo23() != null && var42.getVatOo23().getFirstValue() != null && var42.getVatOo23().getFirstValue().getValue() != null || var42.getVatOo8() != null && var42.getVatOo8().getFirstValue() != null && var42.getVatOo8().getFirstValue().getValue() != null)) {
                            var37 = getBigDecimalValueSum(var37, var42.QRQ().getFirstValue(), var42.QRR().getFirstValue());
                        }

                        if (var82 && (var42.getVatOo23() != null && var42.getVatOo23().getFirstValue() != null && var42.getVatOo23().getFirstValue().getValue() != null || var42.getVatOo8() != null && var42.getVatOo8().getFirstValue() != null && var42.getVatOo8().getFirstValue().getValue() != null)) {
                            var85 = BigDecimal.ZERO;
                            var87 = BigDecimal.ZERO;
                            var90 = BigDecimal.ZERO;
                            var93 = BigDecimal.ZERO;
                            var85 = getBigDecimalValueOrZero(var42.QRR().getFirstValue());
                            var87 = getBigDecimalValueOrZero(var42.QRR().getSecondValue());
                            var90 = getBigDecimalValueOrZero(var42.QRQ().getFirstValue());
                            var93 = getBigDecimalValueOrZero(var42.QRQ().getSecondValue());
                            var38 = getBigDecimalSum(var38, var85, var90);
                            var43 = getBigDecimalSum(var87, var93);
                            var39 = getBigDecimalSum(var39, var43);
                        }
                    }

                    var40 = getBigDecimalValueSum(var40, var42.QRM().getSecondValue(), var42.QRL().getSecondValue(), var42.QRK().getSecondValue(), var42.QRJ().getSecondValue(), new JR(var43));
                }
            }

            if (var7 != null) {
                var19 = var6.getInvoiceRecordElements().size();
                var20 = 0;
                BigDecimal var68 = BigDecimal.ZERO;
                Iterator var69 = var7.getInvoiceRecordElements().iterator();

                while (var69.hasNext()) {
                    ID var70 = (ID) var69.next();
                    IE var71 = (IE) var70;
                    ++var20;
                    EWX.IBJ(var0, 0.55 + 0.4 * ((double) var20 / (double) var19), 0L, 0L);
                    var13.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "ZakupWiersz");
                    HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "LpZakupu", String.valueOf(var20));
                    if (var70.getContractor() == null) {
                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NrDostawcy", FCW.getInstance().getMessageForKey("micro.process.general.nip.null"));
                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NazwaDostawcy", FCW.getInstance().getMessageForKey("micro.process.general.contractorname.null"));
                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "AdresDostawcy", FCW.getInstance().getMessageForKey("micro.process.general.address.null"));
                    } else {
                        if (var70.getContractor().getNip() != null && var70.getContractor().getNip().getValue() != null && var70.getContractor().getNip().getValue().trim().length() != 0) {
                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NrDostawcy", var70.getContractor().getNip().getValue());
                        } else {
                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NrDostawcy", FCW.getInstance().getMessageForKey("micro.process.general.nip.null"));
                        }

                        if (var70.getContractor().getName() != null && var70.getContractor().getName().getValue() != null && var70.getContractor().getName().getValue().trim().length() != 0) {
                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NazwaDostawcy", var70.getContractor().getName().getValue());
                        } else {
                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NazwaDostawcy", FCW.getInstance().getMessageForKey("micro.process.general.contractorname.null"));
                        }

                        if (var70.getContractor().getAddress() != null && var70.getContractor().getAddress().AICQ() != null && var70.getContractor().getAddress().AICQ().trim().length() != 0) {
                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "AdresDostawcy", var70.getContractor().getAddress().AICQ());
                        } else {
                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "AdresDostawcy", FCW.getInstance().getMessageForKey("micro.process.general.address.null"));
                        }
                    }

                    if (var70.HGX().getValue() != null) {
                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DowodZakupu", var70.HGX().getValue());
                    }

                    boolean var72 = var70.RIM().getValue() != null && var70.RIM().getValue() || var70.RIN().getValue() != null && var70.RIN().getValue();

                    boolean var73 = var70.RIO().getValue() != null && var70.RIO().getValue() || var70.RIP().getValue() != null && var70.RIP().getValue();

                    if (!var72 && !var73) {
                        if (var70.AICN().getValue() != null) {
                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataZakupu", var70.AICN().DDZ());
                        } else {
                            HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataZakupu", var70.AICO().DDZ());
                        }

                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataWplywu", var70.AICP().DDZ());
                    } else if (var72) {
                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataZakupu", var70.AICN().DDZ());
                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataWplywu", var70.QRF().DDZ());
                    } else if (var73) {
                        HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataZakupu", var70.QRF().DDZ());
                    }

                    BigDecimal var74 = null;
                    BigDecimal var75 = null;
                    if (var71.getTaxReason() != null) {
                        switch (var71.getTaxReason().getValue()) {
                            case acquisition_of_fixed_assets:
                                HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_43", FWE, var71.getIsAggregatePurchase() != null && var71.getIsAggregatePurchase() ? var71.getNet().getValue() : getBigDecimalValueSum(var70.QRJ().getFirstValue(), var70.QRK().getFirstValue(), var70.QRL().getFirstValue(), var70.QRM().getFirstValue(), var70.QRN().getFirstValue(), var70.QRO().getFirstValue(), var70.QRQ().getFirstValue(), var70.QRR().getFirstValue()));
                                var74 = getBigDecimalValueSum(var70.QRJ().getSecondValue(), var70.QRK().getSecondValue(), var70.QRL().getSecondValue(), var70.QRM().getSecondValue(), var70.QRN().getSecondValue(), var70.QRO().getSecondValue(), var70.QRQ().getSecondValue(), var70.QRR().getSecondValue());
                                HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_44", FWE, var71.getIsAggregatePurchase() != null && var71.getIsAggregatePurchase() ? var71.getVat().getValue() : var74);
                                break;
                            case acquisition_of_general_goods:
                                HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_45", FWE, var71.getIsAggregatePurchase() != null && var71.getIsAggregatePurchase() ? var71.getNet().getValue() : getBigDecimalValueSum(var70.QRJ().getFirstValue(), var70.QRK().getFirstValue(), var70.QRL().getFirstValue(), var70.QRM().getFirstValue(), var70.QRN().getFirstValue(), var70.QRO().getFirstValue(), var70.QRQ().getFirstValue(), var70.QRR().getFirstValue()));
                                var75 = getBigDecimalValueSum(var70.QRJ().getSecondValue(), var70.QRK().getSecondValue(), var70.QRL().getSecondValue(), var70.QRM().getSecondValue(), var70.QRN().getSecondValue(), var70.QRO().getSecondValue(), var70.QRQ().getSecondValue(), var70.QRR().getSecondValue());
                                HQE(var13, true, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_46", FWE, var71.getIsAggregatePurchase() != null && var71.getIsAggregatePurchase() ? var71.getVat().getValue() : var75);
                        }
                    }

                    var29 = BigDecimal.ZERO;
                    var30 = BigDecimal.ZERO;
                    var31 = BigDecimal.ZERO;
                    var32 = BigDecimal.ZERO;
                    if (var70.RIM().getValue() != null && var70.RIM().getValue()) {
                        var29 = var70.QRI().getValue();
                        HQE(var13, false, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_49", FWE, var29);
                    } else if (var70.RIN().getValue() != null && var70.RIN().getValue()) {
                        var30 = var70.QRI().getValue();
                        HQE(var13, false, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_50", FWE, var30);
                    } else if (var70.RIO().getValue() != null && var70.RIO().getValue()) {
                        var31 = var70.QRI().getValue();
                        HQE(var13, false, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_47", FWE, var31);
                    } else if (var70.RIP().getValue() != null && var70.RIP().getValue()) {
                        var32 = var70.QRI().getValue();
                        HQE(var13, false, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_48", FWE, var32);
                    }

                    boolean var76 = false;
                    if (var71.getIsAggregatePurchase() != null) {
                        var76 = var71.getIsAggregatePurchase();
                    }

                    var68 = var76 ? getBigDecimalSum(var68, var71.getVat().getValue()) : getBigDecimalSum(var68, var74, var75, var29, var30, var31, var32);
                    var13.writeEndElement();
                }

                if (var20 > 0) {
                    var13.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "ZakupCtrl");
                    HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "LiczbaWierszyZakupow", String.valueOf(var20));
                    HQE(var13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "PodatekNaliczony", FWE, var68);
                    var13.writeEndElement();
                }
            }

            var13.writeEndElement();
            EWX.IBJ(var0, 0.99, 0L, 0L);
            var13.close();
            var67 = var10.digest();
        } catch (Exception var65) {
            log.error("Something bad happened", var65);
            throw FCZ.getInstance().IHW(var8, var65);
        } finally {
            if (var9 != null) {
                try {
                    var9.close();
                } catch (IOException var64) {
                    log.error("Something bad happened", var64);
                }
            }

        }

        return var67;
    }

    private static BigDecimal getBigDecimalValue(JR var0) {
        return var0 != null ? var0.getValue() : null;
    }

    private static BigDecimal getBigDecimalValueSum(JR... var0) {
        return getBigDecimalValueSum(BigDecimal.ZERO, var0);
    }

    private static BigDecimal getBigDecimalValueSum(BigDecimal var0, JR... var1) {
        BigDecimal var2;
        if (var0 != null) {
            var2 = var0;
        } else {
            var2 = BigDecimal.ZERO;
        }

        if (var1 != null) {
            JR[] var3 = var1;
            int var4 = var1.length;

            for (int var5 = 0; var5 < var4; ++var5) {
                JR var6 = var3[var5];
                if (var6 != null && var6.getValue() != null) {
                    var2 = var2.add(var6.getValue()).setScale(EQY.FYD, EQY.FYE);
                }
            }
        }

        return var2;
    }

    private static BigDecimal getBigDecimalSum(BigDecimal... var0) {
        BigDecimal var1 = BigDecimal.ZERO;
        if (var0 != null) {
            BigDecimal[] var2 = var0;
            int var3 = var0.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                BigDecimal var5 = var2[var4];
                if (var5 != null) {
                    var1 = var1.add(var5).setScale(EQY.FYD, EQY.FYE);
                }
            }
        }

        return var1;
    }

    private static void HQE(XMLStreamWriter var0, String var1, String var2, String var3, EQG... var4) throws FFK, FFO {
        HQE(var0, var1, var2, FWD, var3, var4);
    }

    private static <_T> void HQE(XMLStreamWriter var0, String var1, String var2, EQH<_T> var3, _T var4, EQG... var5) throws FFK, FFO {
        HQE(var0, false, var1, var2, var3, var4, var5);
    }

    private static <_T> void HQE(XMLStreamWriter var0, boolean var1, String var2, String var3, EQH<_T> var4, _T var5, EQG... var6) throws FFK, FFO {
        try {
            if (var4 == null) {
                throw new FFK("ValueConverter cannot be null!");
            } else {
                String var7 = var4.HQC(var5);
                if (!var1 || var7 != null && var7.length() != 0) {
                    var0.writeStartElement(var2, var3);
                    EQG[] var8 = var6;
                    int var9 = var6.length;

                    for (int var10 = 0; var10 < var9; ++var10) {
                        EQG var11 = var8[var10];
                        var0.writeAttribute(var11.getAttributeName(), var11.getAttributeValue());
                    }

                    if (var7 != null && var7.length() > 0) {
                        var0.writeCharacters(var4.HQB(var7));
                    }

                    var0.writeEndElement();
                }

            }
        } catch (XMLStreamException var15) {
            throw new FFK(var15);
        }
    }

    private static BigDecimal getBigDecimalValueOrZero(JR var0) {
        return var0 != null && var0.getValue() != null ? var0.getValue() : BigDecimal.ZERO;
    }

    private static int QQP(BigDecimal var0, JR var1) {
        BigDecimal var2 = null;
        if (var1 != null) {
            var2 = var1.getValue();
        }

        return QQQ(var0, var2);
    }

    private static int QQQ(BigDecimal var0, BigDecimal var1) {
        BigDecimal var2 = BigDecimal.ZERO;
        BigDecimal var3 = BigDecimal.ZERO;
        if (var0 != null) {
            var2 = var0;
        }

        if (var1 != null) {
            var3 = var1;
        }

        return var2.compareTo(var3);
    }

    static {
        FVZ = StandardCharsets.UTF_8;
        FWD = new EQJ();
        FWE = new EQI();
        QLF = new QJV();
    }

    private static class QJV implements EQH<Boolean> {
        private QJV() {
        }

        public String HQB(String var1) throws FFO {
            return var1;
        }

        public String HQC(Boolean var1) {
            if (var1 == null) {
                throw new FFI("Boolean value null");
            } else {
                return var1 ? "true" : "false";
            }
        }
    }

    private static class EQJ implements EQH<String> {
        private EQJ() {
        }

        public String HQB(String var1) throws FFO {
            return var1;
        }

        public String HQC(String var1) {
            return var1;
        }
    }

    private static class EQI implements EQH<BigDecimal> {
        private static final String FVV = "-{0,1}\\d+([,.]{1}(\\d)+){0,1}";
        private static final Pattern FVW = Pattern.compile("-{0,1}\\d+([,.]{1}(\\d)+){0,1}");
        private final DecimalFormat FVX = (DecimalFormat) DecimalFormat.getInstance(LOCALE);

        public EQI() {
            this.FVX.setMinimumFractionDigits(EQY.FYD);
            this.FVX.setMaximumFractionDigits(EQY.FYD);
            this.FVX.setRoundingMode(RoundingMode.valueOf(EQY.FYE));
            this.FVX.setGroupingUsed(false);
        }

        public String HQB(String var1) throws FFO {
            if (FVW.matcher(var1).matches()) {
                return var1.replaceFirst(",", "\\.");
            } else {
                throw new FFO("Value [" + var1 + "] does not mathc pattern [" + "-{0,1}\\d+([,.]{1}(\\d)+){0,1}" + "]!");
            }
        }

        public String HQC(BigDecimal var1) {
            return var1 != null ? this.FVX.format(var1) : null;
        }
    }

    private interface EQH<_T> {
        String HQB(String var1) throws FFO;

        String HQC(_T var1);
    }

    private static class EQG {
        String FVT;
        String FVU;

        public EQG(String var1, String var2) {
            this.FVT = var1;
            this.FVU = var2;
        }

        public String getAttributeName() {
            return this.FVT;
        }

        public String getAttributeValue() {
            return this.FVU;
        }
    }
}
