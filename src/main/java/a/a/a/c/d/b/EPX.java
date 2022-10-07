package a.a.a.c.d.b;

import a.a.a.b.b.FEJ;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.b.g.FFP;
import a.a.a.c.e.a.g.EWW;
import a.a.a.c.e.a.g.EWX;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.AGXA;
import a.a.a.c.g.c.FCZ;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Pattern;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class EPX {
   public static final Character FVI = '"';
   public static final Character FVJ = ';';
   public static final Charset FVK;
   private static final String FVL = "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2016/01/25/eD/DefinicjeTypy/";
   private static final String FVM = "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/";
   private static final String FVN = "http://www.w3.org/2001/XMLSchema-instance";

   public EPX() {
   }

   public static void HPQ(EWX var0, File var1, File var2) throws FFO {
      EXF.getInstance().ICO();
      int var3 = 0;
      InputStream var4 = null;
      FileOutputStream var5 = null;
      BufferedReader var6 = null;

      try {
         EXF.getInstance().ICK("progressReporter " + var0);
         EXF.getInstance().ICK("inputFile " + var1);
         EXF.getInstance().ICK("outputFile " + var2);
         EQA var7 = new EQA();
         FFP var8 = new FFP(FVI, FVJ);
         var5 = new FileOutputStream(var2);
         XMLOutputFactory var9 = XMLOutputFactory.newInstance();
         XMLStreamWriter var10 = var9.createXMLStreamWriter(var5, FVK.name());
         var4 = FEJ.getFileInputStreamSkipBOM(var1);
         EWW var11 = new EWW(var4, var1.length(), var0);
         Double var12 = null;
         var6 = new BufferedReader(new InputStreamReader(var11, FVK));
         var10.writeStartDocument(FVK.name(), "1.0");
         var10.writeStartElement("tns", "JPK", "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/");
         var10.writeNamespace("etd", "http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2016/01/25/eD/DefinicjeTypy/");
         var10.writeNamespace("tns", "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/");
         var10.writeNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
         List var13 = null;
         String var14 = null;

         long var15;
         for(var15 = System.currentTimeMillis(); (var14 = var6.readLine()) != null; ++var3) {
            if (var14.length() > 0) {
               List var17 = var8.ILL(var14);
               if (var3 == 0) {
                  var13 = var17;
               } else if (var3 == 1) {
                  var10.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "Naglowek");
                  if (!"KodFormularza".equals(var13.get(0)) || !"kodSystemowy".equals(var13.get(1)) || !"wersjaSchemy".equals(var13.get(2))) {
                     throw FCZ.getInstance().IHV("KodFormularza, kodSystemowy, wersjaSchemy", (String)var13.get(0) + ", " + (String)var13.get(1) + ", " + (String)var13.get(2));
                  }

                  if (!AGXA.AHSV.getKodSystemowy().equals(var17.get(1)) || !AGXA.AHSV.getWersjaSchemy().equals(var17.get(2))) {
                     throw FCZ.getInstance().IHV(AGXA.AHSV.getKodSystemowy() + "," + AGXA.AHSV.getWersjaSchemy(), (String)var17.get(1) + ", " + (String)var17.get(2));
                  }

                  HPT(var10, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "KodFormularza", (String)var17.get(0), new EPY("kodSystemowy", (String)var17.get(1)), new EPY("wersjaSchemy", (String)var17.get(2)));
                  if ("WariantFormularza".equals(var13.get(3))) {
                     if (!AGXA.AHSV.getWariantFormularza().equals(var17.get(3))) {
                        throw FCZ.getInstance().IHV("WariantFormularza", (String)var13.get(3));
                     }

                     HPR(var10, var13, var17, 3, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "WariantFormularza");
                  }

                  HPR(var10, var13, var17, 4, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "CelZlozenia");
                  HPR(var10, var13, var17, 5, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataWytworzeniaJPK");
                  HPR(var10, var13, var17, 6, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataOd");
                  HPR(var10, var13, var17, 7, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataDo");
                  HPR(var10, var13, var17, 8, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NazwaSystemu");
                  var10.writeEndElement();
               } else if (var3 == 2) {
                  var10.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "Podmiot1");
                  HPR(var10, var13, var17, 9, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NIP");
                  HPR(var10, var13, var17, 10, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "PelnaNazwa");
                  HPR(var10, var13, var17, 11, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "Email");
                  var10.writeEndElement();
               } else if (var3 != 3 && var3 > 3) {
                  if (var17.get(12) != null && ((String)var17.get(12)).length() > 0) {
                     var10.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "SprzedazWiersz");
                     HPR(var10, var13, var17, 12, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "LpSprzedazy");
                     HPR(var10, var13, var17, 13, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NrKontrahenta");
                     HPR(var10, var13, var17, 14, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NazwaKontrahenta");
                     HPR(var10, var13, var17, 15, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "AdresKontrahenta");
                     HPR(var10, var13, var17, 16, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DowodSprzedazy");
                     HPR(var10, var13, var17, 17, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataWystawienia");
                     HPR(var10, var13, var17, 18, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataSprzedazy");
                     HPS(var10, var13, var17, 19, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_10", var7);
                     HPS(var10, var13, var17, 20, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_11", var7);
                     HPS(var10, var13, var17, 21, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_12", var7);
                     HPS(var10, var13, var17, 22, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_13", var7);
                     HPS(var10, var13, var17, 23, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_14", var7);
                     HPS(var10, var13, var17, 24, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_15", var7);
                     HPS(var10, var13, var17, 25, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_16", var7);
                     HPS(var10, var13, var17, 26, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_17", var7);
                     HPS(var10, var13, var17, 27, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_18", var7);
                     HPS(var10, var13, var17, 28, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_19", var7);
                     HPS(var10, var13, var17, 29, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_20", var7);
                     HPS(var10, var13, var17, 30, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_21", var7);
                     HPS(var10, var13, var17, 31, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_22", var7);
                     HPS(var10, var13, var17, 32, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_23", var7);
                     HPS(var10, var13, var17, 33, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_24", var7);
                     HPS(var10, var13, var17, 34, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_25", var7);
                     HPS(var10, var13, var17, 35, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_26", var7);
                     HPS(var10, var13, var17, 36, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_27", var7);
                     HPS(var10, var13, var17, 37, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_28", var7);
                     HPS(var10, var13, var17, 38, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_29", var7);
                     HPS(var10, var13, var17, 39, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_30", var7);
                     HPS(var10, var13, var17, 40, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_31", var7);
                     HPS(var10, var13, var17, 41, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_32", var7);
                     HPS(var10, var13, var17, 42, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_33", var7);
                     HPS(var10, var13, var17, 43, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_34", var7);
                     HPS(var10, var13, var17, 44, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_35", var7);
                     HPS(var10, var13, var17, 45, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_36", var7);
                     HPS(var10, var13, var17, 46, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_37", var7);
                     HPS(var10, var13, var17, 47, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_38", var7);
                     HPS(var10, var13, var17, 48, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_39", var7);
                     var10.writeEndElement();
                  } else if (var17.get(49) != null && ((String)var17.get(49)).length() > 0) {
                     var10.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "SprzedazCtrl");
                     HPR(var10, var13, var17, 49, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "LiczbaWierszySprzedazy");
                     HPS(var10, var13, var17, 50, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "PodatekNalezny", var7);
                     var10.writeEndElement();
                  } else if (var17.get(51) != null && ((String)var17.get(51)).length() > 0) {
                     var10.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "ZakupWiersz");
                     HPR(var10, var13, var17, 51, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "LpZakupu");
                     HPR(var10, var13, var17, 52, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NrDostawcy");
                     HPR(var10, var13, var17, 53, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "NazwaDostawcy");
                     HPR(var10, var13, var17, 54, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "AdresDostawcy");
                     HPR(var10, var13, var17, 55, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DowodZakupu");
                     HPR(var10, var13, var17, 56, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataZakupu");
                     HPR(var10, var13, var17, 57, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "DataWplywu");
                     HPS(var10, var13, var17, 58, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_43", var7);
                     HPS(var10, var13, var17, 59, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_44", var7);
                     HPS(var10, var13, var17, 60, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_45", var7);
                     HPS(var10, var13, var17, 61, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_46", var7);
                     HPS(var10, var13, var17, 62, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_47", var7);
                     HPS(var10, var13, var17, 63, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_48", var7);
                     HPS(var10, var13, var17, 64, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_49", var7);
                     HPS(var10, var13, var17, 65, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "K_50", var7);
                     var10.writeEndElement();
                  } else if (var17.get(66) != null && ((String)var17.get(66)).length() > 0) {
                     var10.writeStartElement("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "ZakupCtrl");
                     HPR(var10, var13, var17, 66, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "LiczbaWierszyZakupow");
                     HPS(var10, var13, var17, 67, "http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "PodatekNaliczony", var7);
                     var10.writeEndElement();
                  }
               }
            } else {
               EXF.getInstance().ICI("Empty line [" + var3 + "]");
            }
         }

         var10.writeEndElement();
         var6.close();
         var11.close();
         var10.close();
         long var34 = System.currentTimeMillis() - var15;
         if (var34 > 0L) {
            var12 = (double)var1.length() * 1000.0 / (double)(var34 * 1024L * 1024L);
         }

         EXF.getInstance().ICK("actualTimeStart " + var15);
         EXF.getInstance().ICK("actualTimeElapsed " + var34);
         EXF.getInstance().ICK("actualTimeAvgSpeed " + var12);
      } catch (Exception var32) {
         EXF.getInstance().IBZ("Exception in line [" + var3 + "]", var32);
         throw FCZ.getInstance().IHW(var3, var32);
      } finally {
         if (var1 != null) {
            try {
               var4.close();
            } catch (IOException var31) {
               EXF.getInstance().ICA((Throwable)var31);
            }
         }

         if (var5 != null) {
            try {
               var5.close();
            } catch (IOException var30) {
               EXF.getInstance().ICA((Throwable)var30);
            }
         }

         if (var6 != null) {
            try {
               var6.close();
            } catch (IOException var29) {
               EXF.getInstance().ICA((Throwable)var29);
            }
         }

         EXF.getInstance().ICP();
      }
   }

   private static void HPR(XMLStreamWriter var0, List<String> var1, List<String> var2, int var3, String var4, String var5) throws FFK, FFO {
      HPS(var0, var1, var2, var3, var4, var5, (EPZ)null);
   }

   private static void HPS(XMLStreamWriter var0, List<String> var1, List<String> var2, int var3, String var4, String var5, EPZ var6) throws FFK, FFO {
      if (var5.equals(var1.get(var3))) {
         String var7 = (String)var2.get(var3);
         if (var7 != null && var7.length() > 0) {
            HPT(var0, var4, var5, var7, var6);
         }

      } else {
         throw FCZ.getInstance().IHV((String)var1.get(var3), var5);
      }
   }

   private static void HPT(XMLStreamWriter var0, String var1, String var2, String var3, EPY... var4) throws FFK, FFO {
      HPT(var0, var1, var2, var3, (EPZ)null, var4);
   }

   private static void HPT(XMLStreamWriter var0, String var1, String var2, String var3, EPZ var4, EPY... var5) throws FFK, FFO {
      try {
         var0.writeStartElement(var1, var2);
         EPY[] var6 = var5;
         int var7 = var5.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            EPY var9 = var6[var8];
            var0.writeAttribute(var9.getAttributeName(), var9.getAttributeValue());
         }

         if (var4 != null) {
            var0.writeCharacters(var4.HPP(var3));
         } else {
            var0.writeCharacters(var3);
         }

         var0.writeEndElement();
      } catch (XMLStreamException var13) {
         throw new FFK(var13);
      } finally {
         ;
      }
   }

   static {
      FVK = StandardCharsets.UTF_8;
   }

   private static class EQA implements EPZ {
      private static final String FVG = "-{0,1}\\d+([,.]{1}(\\d)+){0,1}";
      private static final Pattern FVH = Pattern.compile("-{0,1}\\d+([,.]{1}(\\d)+){0,1}");

      private EQA() {
      }

      public String HPP(String var1) throws FFO {
         if (FVH.matcher(var1).matches()) {
            return var1.replaceFirst(",", "\\.");
         } else {
            throw new FFO("Value [" + var1 + "] does not mathc pattern [" + "-{0,1}\\d+([,.]{1}(\\d)+){0,1}" + "]!");
         }
      }
   }

   private interface EPZ {
      String HPP(String var1) throws FFO;
   }

   private static class EPY {
      String FVE;
      String FVF;

      public EPY(String var1, String var2) {
         this.FVE = var1;
         this.FVF = var2;
      }

      public String getAttributeName() {
         return this.FVE;
      }

      public String getAttributeValue() {
         return this.FVF;
      }
   }
}
