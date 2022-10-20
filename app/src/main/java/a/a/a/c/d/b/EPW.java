package a.a.a.c.d.b;

import a.a.a.b.b.FEJ;
import a.a.a.b.d.FEO;
import a.a.a.b.d.FEP;
import a.a.a.b.e.a.FEQ;
import a.a.a.b.e.a.FEX;
import a.a.a.b.e.a.a.FEU;
import a.a.a.b.e.a.a.FEV;
import a.a.a.b.e.c.FFC;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFN;
import a.a.a.b.f.FFO;
import a.a.a.b.f.a.FFL;
import a.a.a.b.f.a.FFM;
import a.a.a.c.b.EDF;
import a.a.a.c.d.a.EPV;
import a.a.a.c.d.a.a.EPP;
import a.a.a.c.d.d.EQX;
import a.a.a.c.e.EXK;
import a.a.a.c.e.a.d.EWD;
import a.a.a.c.e.a.g.EWW;
import a.a.a.c.e.a.g.EWX;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHDJ;
import a.a.a.c.f.a.c.a.AHDW;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.a.e.HY;
import a.a.a.c.f.a.e.a.IC;
import a.a.a.c.f.a.e.a.IF;
import a.a.a.c.f.a.e.a.IG;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JT;
import a.a.a.c.f.b.c.KO;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.b.FCW;
import a.a.a.c.g.c.FCX;
import a.a.a.c.g.c.FCZ;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.Holder;
import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.*;
import pl.akmf.apps.micro.jaxb.initupload.*;
import pl.akmf.apps.micro.jaxb.pz.type.*;
import pl.akmf.apps.micro.ws.pz.PodpisPZ;
import pl.akmf.apps.micro.ws.pz.PodpisPZ_Service;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stax.StAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.*;
import java.time.LocalDate;
import java.util.*;

@Slf4j
public class EPW {
    private static final String FUU = "MD5";
    private static final String FUV = "SHA-256";
    private static final String FUW = ",";
    private static final String FUX = "01.02.01.20160617";
    private static final String FUY = "RSA";
    private static final String FUZ = "ECB";
    private static final String FVA = "PKCS#1";
    private static final String FVB = "Base64";
    private static final long FVC = 5248000L;
    private static final long FVD = 20992000L;

    public EPW() {
    }

    public static byte[] HOW(EWX var0, File var1, JN var2, Integer var3, LY var4, List<EDF<IC>> var5) throws FFK {

        try {
            log.info("About to generate [JPK_VAT] declaration for " + var2 + ", reason [" + var3 + "] into file [" + var1 + "]");
            if (var1 == null) {
                throw new FFI("No output file definition!");
            } else {
                IG var6 = null;
                IF var7 = null;
                Iterator var8 = var5.iterator();

                while (var8.hasNext()) {
                    Object var9 = var8.next();
                    EDF var10 = (EDF) var9;
                    IC var11 = (IC) var10.getModelBaseElementWithIdObject();
                    Class var12 = var11.getClass();
                    if (IG.class.isAssignableFrom(var12)) {
                        var6 = (IG) var11;
                    } else if (IF.class.isAssignableFrom(var12)) {
                        var7 = (IF) var11;
                    }
                }

                EWX.IBJ(var0, 0.01, 0L, 0L);
                byte[] var18 = EQF.HQD(var0, "MD5", var1, String.valueOf(var3), var2, var4, var6, var7);
                EWX.IBJ(var0, 1.0, 0L, 0L);
                log.info("Declaration [JPK_VAT] for " + var2 + ", reason [" + var3 + "] generated.");
                byte[] var19 = var18;
                return var19;
            }
        } catch (Exception var16) {
            log.error("Something bad happened", var16);
            throw new FFK(var16);
        } finally {
            EWX.IBJ(var0, 1.0, 0L, 0L);

        }
    }

    public static byte[] QOL(EWX var0, File var1, LocalDate var2, LocalDate var3, LY var4, List<HY> var5) throws FFK {

        byte[] var7;
        try {
            log.info("About to generate [JPK_FA] declaration from " + var2.toString() + " to " + var3.toString() + ", into file [" + var1 + "]");
            if (var1 == null) {
                throw new FFI("No output file definition!");
            }

            EWX.IBJ(var0, 0.01, 0L, 0L);
            byte[] var6 = EQF.RPC(var0, "MD5", var1, var2, var3, var4, var5);
            EWX.IBJ(var0, 1.0, 0L, 0L);
            log.info("Declaration [JPK_FA] from " + var2 + " to " + var3 + ",  generated.");
            var7 = var6;
        } catch (Exception var11) {
            log.error("Something bad happened", var11);
            throw new FFK(var11);
        } finally {
            EWX.IBJ(var0, 1.0, 0L, 0L);

        }

        return var7;
    }

    public static byte[] HOX(EWX var0, File var1) throws FFK {

        FileInputStream var2 = null;

        try {
            log.info("About to calculate file [" + var1 + "] checksum");
            Object var3 = null;
            if (var1 == null) {
                throw new FFI("No input file definition!");
            } else {
                MessageDigest var4 = MessageDigest.getInstance("MD5");
                var2 = new FileInputStream(var1);
                DigestInputStream var5 = new DigestInputStream(var2, var4);
                EWW var6 = new EWW(var5, var1.length(), var0);
                int var7 = 1048576;
                byte[] var8 = new byte[var7];

                while (var6.read(var8) != -1) {
                }

                var6.close();
                byte[] var18 = var4.digest();
                log.info("File [" + var1 + "] checksum calculated. " + (new JT(var18)).getValueHexString());
                byte[] var19 = var18;
                return var19;
            }
        } catch (Exception var16) {
            log.error("Something bad happened", var16);
            throw new FFK(var16);
        } finally {
            EWX.IBJ(var0, 1.0, 0L, 0L);
            if (var2 != null) {
                try {
                    var2.close();
                } catch (IOException var15) {
                    log.error("Something bad happened", var15);
                }
            }

        }
    }

    public static AGXC HOY() throws FFK {

        AGXC var4;
        try {
            log.info("About to generate AES256 key and InitialisationVector");
            SecretKey var0 = EQP.HQQ();
            Random var1 = new Random(System.nanoTime());
            byte[] var2 = new byte[16];
            var1.nextBytes(var2);
            AGXC var3 = new AGXC();
            var3.setInitialisationVector(new JT(var2));
            var3.setSecretKeyBytes(new JT(var0.getEncoded()));
            var3.setSecretKeyAlgorithm(new KO(var0.getAlgorithm()));
            var3.setSecretKeyFormat(new KO(var0.getFormat()));
            log.info("AES256 key and InitialisationVector generated");
            var4 = var3;
        } catch (Exception var8) {
            log.error("Something bad happened", var8);
            throw new FFI(var8);
        }

        return var4;
    }

    public static boolean HOZ(EWX var0, AGWN var1) throws FFK {

        FileInputStream var2 = null;

        boolean var22;
        try {
            String var3 = AHDJ.AIDF(",", true);
            File var4 = var1.getDeclarationFile();
            log.debug("declarationInputFile " + var4);
            log.info("About to validate the declaration input file [" + var4.getAbsolutePath() + "]");
            AGXA var5 = var1.getDeclarationFileSchema();
            log.debug("jpkSchemaType " + var5);
            URL var6 = var5.getUrl();
            log.debug("schemaFileURL " + var6);
            File var7 = new File(var1.getContextDir(), var1.getDeclarationFileName() + "_validationReport.log");
            final FileOutputStream var8 = new FileOutputStream(var7);
            var8.write(var3.getBytes(StandardCharsets.UTF_8));
            var8.flush();
            final EWD var9 = new EWD(0);

            try {
                MessageDigest var55 = MessageDigest.getInstance("MD5");
                var2 = new FileInputStream(var4);
                DigestInputStream var56 = new DigestInputStream(var2, var55);
                EWW var57 = new EWW(var56, var4.length(), var0);
                XMLInputFactory var13 = XMLInputFactory.newInstance();
                XMLStreamReader var14 = var13.createXMLStreamReader(var57);
                StAXSource var15 = new StAXSource(var14);
                SchemaFactory var16 = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
                Schema var17 = var16.newSchema(var6);
                Validator var18 = var17.newValidator();
                var18.setErrorHandler(new ErrorHandler() {
                    public void warning(SAXParseException var1) throws SAXException {
                        this.handle(FCX.FCY.WARNING, var1);
                    }

                    public void fatalError(SAXParseException var1) throws SAXException {
                        this.handle(FCX.FCY.FATALERROR, var1);
                    }

                    public void error(SAXParseException var1) throws SAXException {
                        this.handle(FCX.FCY.ERROR, var1);
                    }

                    private void handle(FCX.FCY var1, SAXParseException var2) {

                        try {
                            var9.setFirstValue((Integer) var9.getFirstValue() + 1);
                            String var3 = var9.getFirstValue() + "," + var1.name() + "," + var1.getDescription() + "," + var2.getLocalizedMessage() + System.lineSeparator();
                            var8.write(var3.getBytes(StandardCharsets.UTF_8));
                            var8.flush();
                        } catch (IOException var7) {
                            log.error("Something bad happened", var7);
                        }

                    }
                });
                var18.validate(var15);
                var57.close();
                byte[] var19 = var55.digest();
                boolean var20 = Arrays.equals(var19, var1.getDeclarationFileCheckSumMD5().getValue());
                FFL var21 = new FFL(var7, (Integer) var9.getFirstValue(), var3);
                if (!var20 || (Integer) var9.getFirstValue() != 0) {
                    var1.setDeclarationFileValid(false);
                    if (!var20) {
                        FCR.IGL(FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.exception.title"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.exception.inputfilediffer"), var4, false);
                    }

                    if ((Integer) var9.getFirstValue() > 0) {
                        var1.setDeclarationFileValidationReportFileContainer(var21);
                        FCR.IGL(FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.exception.title"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.exception.validation"), var7, false);
                    }

                    var22 = false;
                    return var22;
                }

                var1.setDeclarationFileValid(true);
                log.info("Input file [" + var1.getDeclarationFile() + "] validation successful");
                var22 = true;
            } catch (IOException | XMLStreamException | SAXException var51) {
                SAXException var10 = (SAXException) var51;
                log.error("Something bad happened", var51);

                try {
                    FCX.FCY var11 = FCX.FCY.ERROR;
                    var9.setFirstValue((Integer) var9.getFirstValue() + 1);
                    String var12 = var9.getFirstValue() + "," + var11.name() + "," + var11.getDescription() + "," + var10.getLocalizedMessage() + System.lineSeparator();
                    var8.write(var12.getBytes(StandardCharsets.UTF_8));
                    var8.flush();
                } catch (IOException var50) {
                    log.error("Something bad happened", var51);
                }

                var1.setDeclarationFileValid(false);
                throw new FFK(var51);
            } finally {
                EWX.IBJ(var0, 1.0, 0L, 0L);
                if (var8 != null) {
                    try {
                        var8.close();
                    } catch (IOException var49) {
                        log.error("Something bad happened", var49);
                    }
                }

            }
        } catch (Exception var53) {
            log.error("Something bad happened", var53);
            throw new FFK(var53);
        } finally {
            EWX.IBJ(var0, 1.0, 0L, 0L);
            if (var2 != null) {
                try {
                    var2.close();
                } catch (IOException var48) {
                    log.error("Something bad happened", var48);
                }
            }

        }

        return var22;
    }

    public static boolean HPA(EWX var0, AGWN var1) throws FFK {

        Object var2 = null;

        try {
            String var3 = AHDJ.AIDG(",", true);
            File var4 = var1.getDeclarationFile();
            log.info("About to validate the declaration input file [" + var4.getAbsolutePath() + "]");
            AGXA var5 = var1.getDeclarationFileSchema();
            log.debug("jpkSchemaType " + var5);
            URL var6 = var5.getUrl();
            log.debug("schemaFileURL " + var6);
            if (AGXA.AHSV.getKodFormularza().equals(var5.getKodFormularza()) && AGXA.AHSV.getKodSystemowy().equals(var5.getKodSystemowy()) && AGXA.AHSV.getWersjaSchemy().equals(var5.getWersjaSchemy()) && AGXA.AHSV.getWariantFormularza().equals(var5.getWariantFormularza())) {
                HK var54 = (HK) var1;
                if (var54.AICF()) {
                    log.info("About to verify the input file [" + var4.getAbsolutePath() + "]");
                    FileInputStream var55 = null;
                    File var9 = new File(var1.getContextDir(), var1.getDeclarationFileName() + "_verificationReport.log");
                    final FileOutputStream var10 = new FileOutputStream(var9);
                    var10.write(var3.getBytes(StandardCharsets.UTF_8));
                    var10.flush();
                    final EWD var11 = new EWD(0);

                    try {
                        MessageDigest var56 = MessageDigest.getInstance("MD5");
                        var55 = new FileInputStream(var4);
                        DigestInputStream var57 = new DigestInputStream(var55, var56);
                        EWW var58 = new EWW(var57, var4.length(), var0);
                        InputStream var15 = EPW.class.getResourceAsStream("/rules/rulesConfiguration.xml");
                        FEP var16 = new FEP(AHDW.class);
                        AHDW var17 = var16.IKV(var15, AHDW.class);
                        SAXParserFactory var18 = SAXParserFactory.newInstance();
                        SAXParser var19 = var18.newSAXParser();
                        XMLReader var20 = var19.getXMLReader();
                        EPV var21 = new EPV(var10, var11, ",", var17);
                        var20.setContentHandler(var21);
                        var20.setErrorHandler(new ErrorHandler() {
                            public void warning(SAXParseException var1) throws SAXException {
                                this.handle(FCX.FCY.WARNING, var1);
                            }

                            public void fatalError(SAXParseException var1) throws SAXException {
                                this.handle(FCX.FCY.FATALERROR, var1);
                            }

                            public void error(SAXParseException var1) throws SAXException {
                                this.handle(FCX.FCY.ERROR, var1);
                            }

                            private void handle(FCX.FCY var1, SAXParseException var2) {

                                try {
                                    var11.setFirstValue((Integer) var11.getFirstValue() + 1);
                                    String var3 = var11.getFirstValue() + "," + var1.name() + "," + var1.getDescription() + "," + var2.getLocalizedMessage() + System.lineSeparator();
                                    var10.write(var3.getBytes(StandardCharsets.UTF_8));
                                    var10.flush();
                                } catch (IOException var7) {
                                    log.error("Something bad happened", var7);
                                }

                            }
                        });
                        InputSource var22 = new InputSource(var58);
                        var20.parse(var22);
                        Iterator var23 = var17.getRulesPackages().iterator();

                        while (var23.hasNext()) {
                            AHDJ var24 = (AHDJ) var23.next();
                            var24.AIDD(var10, var11, ",");
                        }

                        var58.close();
                        byte[] var59 = var56.digest();
                        boolean var60 = Arrays.equals(var59, var1.getDeclarationFileCheckSumMD5().getValue());
                        FFL var25 = new FFL(var9, (Integer) var11.getFirstValue(), var3);
                        AHCI var26;
                        if (var60 && (Integer) var11.getFirstValue() == 0) {
                            log.info("Input file [" + var1.getDeclarationFile() + "] validation successful");
                            var26 = var17.getFinalActionResult();
                            switch (var26) {
                                case SUCCESS:
                                    var1.setDeclarationFileVerificationResult(AHCI.SUCCESS);
                                    break;
                                case WARNING:
                                    var1.setDeclarationFileVerificationResult(AHCI.WARNING);
                                    var1.setDeclarationFileVerificationReportFileContainer(var25);
                                    break;
                                case ERROR:
                                    var1.setDeclarationFileVerificationResult(AHCI.ERROR);
                                    var1.setDeclarationFileVerificationReportFileContainer(var25);
                                    break;
                                default:
                                    throw new EPP("Invalid actionResult [" + var26 + "]!");
                            }

                            switch (var26) {
                                case WARNING:
                                case ERROR:
                                    FCR.IGL(FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.information.title"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.information.verification").replaceFirst("##STATUS##", var26.getDescription()), var9, false);
                                case SUCCESS:
                                    log.info("Input successfully file verified for file [" + var4.getAbsolutePath() + "] with result [" + var26 + "]");
                                    boolean var27 = true;
                                    return var27;
                                default:
                                    throw new EPP("Invalid actionResult [" + var26 + "]!");
                            }
                        } else {
                            var1.setDeclarationFileVerificationResult(AHCI.ERROR);
                            if (!var60) {
                                FCR.IGL(FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.exception.title"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.exception.inputfilediffer"), var4, false);
                            }

                            if ((Integer) var11.getFirstValue() > 0) {
                                var1.setDeclarationFileVerificationReportFileContainer(var25);
                                FCR.IGL(FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.exception.title"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.exception.verification"), var9, false);
                            }
                            return false;
                        }
                    } catch (ParserConfigurationException | JAXBException var50) {
                        Exception var12 = var50;
                        log.error("Something bad happened id {}", var1.getId(), var50);
                        try {
                            FCX.FCY var13 = FCX.FCY.ERROR;
                            var11.setFirstValue((Integer) var11.getFirstValue() + 1);
                            String var14 = var11.getFirstValue() + "," + var13.name() + "," + var13.getDescription() + "," + var12.getLocalizedMessage() + System.lineSeparator();
                            var10.write(var14.getBytes(StandardCharsets.UTF_8));
                            var10.flush();
                        } catch (IOException var49) {
                            log.error("Something bad happened", var50);
                        }

                        var1.setDeclarationFileVerificationResult(AHCI.ERROR);
                        throw new FFK(var50);
                    } finally {
                        EWX.IBJ(var0, 1.0, 0L, 0L);
                        if (var55 != null) {
                            var55.close();
                        }

                        if (var10 != null) {
                            var10.close();
                        }

                    }
                } else {
                    boolean var8 = true;
                    return var8;
                }
            } else {
                boolean var7 = true;
                return var7;
            }
        } catch (Exception var52) {
            log.error("Something bad happened", var52);
            throw new FFK(var52);
        } finally {
            EWX.IBJ(var0, 1.0, 0L, 0L);
            if (var2 != null) {
                try {
                    ((InputStream) var2).close();
                } catch (IOException var48) {
                    log.error("Something bad happened", var48);
                }
            }

        }
    }

    public static boolean HPB(EWX var0, AGWN var1) throws FFK, FFO {

        FileInputStream var2 = null;

        boolean var14;
        try {
            File var3 = var1.getDeclarationFile();
            log.info("Generate input file SHA256 checksum of file [" + var3.getAbsolutePath() + "]");
            MessageDigest var4 = MessageDigest.getInstance("MD5");
            MessageDigest var5 = MessageDigest.getInstance("SHA-256");
            var2 = new FileInputStream(var3);
            DigestInputStream var6 = new DigestInputStream(var2, var4);
            DigestInputStream var7 = new DigestInputStream(var6, var5);
            EWW var8 = new EWW(var7, var3.length(), var0);
            int var9 = 1048576;
            byte[] var10 = new byte[var9];

            while (var8.read(var10) != -1) {
            }

            byte[] var11 = var4.digest();
            byte[] var12 = var5.digest();
            var1.setDeclarationFileSHA256CheckSum(new JT(var12));
            boolean var13 = Arrays.equals(var11, var1.getDeclarationFileCheckSumMD5().getValue());
            if (!var13) {
                FCR.IGL(FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.exception.title"), FCW.getInstance().getMessageForKey("micro.jpk.sendout.dialog.processing.exception.inputfilediffer"), var3, false);
                var14 = false;
                return var14;
            }

            log.info("Input file SHA256 checksum generated for file [" + var1.getDeclarationFile() + "]");
            var14 = true;
        } catch (NoSuchAlgorithmException | IOException var24) {
            throw new FFK(var24);
        } finally {
            EWX.IBJ(var0, 1.0, 0L, 0L);
            if (var2 != null) {
                try {
                    var2.close();
                } catch (IOException var23) {
                    log.error("Something bad happened", var23);
                }
            }

        }

        return var14;
    }

    public static void HPC(AGWN var0) throws FFK {

        try {
            log.info("About to compress input file [" + var0.getDeclarationFile() + "]");
            File var1 = var0.getDeclarationFile();
            String var2 = "zippedFile_" + System.nanoTime() + ".zip";
            File var3 = null;
            var3 = new File(var0.getContextDir(), var2);
            FEJ.IKC(false, var3, var1);
            var0.setZipFile(var3);
            log.info("Input compressed for file [" + var0.getDeclarationFile() + "]");
        } catch (IOException var7) {
            throw new FFK(var7);
        }

    }

    public static void HPD(AGWN var0) throws FFK {

        try {
            log.info("About to split compressed input file [" + var0.getZipFile().getAbsolutePath() + "]");
            File var1 = var0.getZipFile();
            List var2 = FEJ.IKD(var1, var0.getContextDir(), 62914560L);
            Iterator var3 = var2.iterator();

            while (var3.hasNext()) {
                File var4 = (File) var3.next();
                AGXD var5 = new AGXD(var4, null, null, null);
                var0.getZipFileList().add(var5);
            }

            log.info("Compressed input splitted for file [" + var0.getZipFile().getAbsolutePath() + "]");
        } catch (IOException var9) {
            throw new FFK(var9);
        }
    }

    public static void HPE(AGXC var0, AGWN var1) throws FFK, FFN {

        ArrayList var2 = new ArrayList();
        var2.add(var1);
        HPE(var0, var2);

    }

    public static void HPE(AGXC var0, List<AGWN> var1) throws FFK, FFN {

        try {
            IvParameterSpec var2 = new IvParameterSpec(var0.getInitialisationVector().getValue());
            Cipher var3 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            var3.init(1, new SecretKeySpec(var0.getSecretKeyBytes().getValue(), var0.getSecretKeyAlgorithm().getValue()), var2);
            Iterator var4 = var1.iterator();

            while (var4.hasNext()) {
                AGWN var5 = (AGWN) var4.next();
                HPF(var3, var5);
            }
        } catch (NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException |
                 NoSuchAlgorithmException var9) {
            throw new FFK(var9);
        }

    }

    private static void HPF(Cipher var0, AGWN var1) throws FFK {

        try {
            log.info("About to encrypt all parts of splitted compressed file [" + var1.getZipFile().getAbsolutePath() + "]");
            Iterator var2 = var1.getZipFileList().iterator();

            while (var2.hasNext()) {
                AGXD var3 = (AGXD) var2.next();
                FileInputStream var4 = null;
                FileOutputStream var5 = null;

                try {
                    File var6 = var3.getSplitFile();
                    File var7 = new File(var1.getContextDir(), var6.getName() + ".aes");
                    var4 = new FileInputStream(var6);
                    CipherInputStream var8 = new CipherInputStream(var4, var0);
                    var5 = new FileOutputStream(var7);
                    byte[] var9 = new byte[1024];

                    int var10;
                    while ((var10 = var8.read(var9)) != -1) {
                        var5.write(var9, 0, var10);
                        var5.flush();
                    }

                    var8.close();
                    var5.flush();
                    var5.close();
                    var3.setSplitFileEncrypted(var7);
                } finally {
                    if (var4 != null) {
                        try {
                            var4.close();
                        } catch (IOException var29) {
                        }
                    }

                    if (var5 != null) {
                        try {
                            var5.close();
                        } catch (IOException var28) {
                        }
                    }

                }
            }

            log.info("All parts of splitted compressed file encrypted for file [" + var1.getZipFile().getAbsolutePath() + "]");
        } catch (IOException var31) {
            throw new FFK(var31);
        }
    }

    public static void HPG(AGXC var0, AGWN var1, Certificate var2) throws FFN, FFK {

        ArrayList var3 = new ArrayList();
        var3.add(var1);
        HPG(var0, var3, var2);

    }

    public static void HPG(AGXC var0, List<AGWN> var1, Certificate var2) throws FFN, FFK {

        String var3 = EQP.HQU(var0.getSecretKeyBytes().getValue(), var2);
        Iterator var4 = var1.iterator();

        while (var4.hasNext()) {
            AGWN var5 = (AGWN) var4.next();
            HPH(var3, var0.getInitialisationVector(), var5);
        }

    }

    private static void HPH(String var0, JT var1, AGWN var2) throws FFK {

        try {
            log.info("About to create InitUpload file for input file [" + var2.getDeclarationFile() + "]");
            ObjectFactory var3 = new ObjectFactory();
            File var4 = var2.getDeclarationFile();
            AGXA var5 = var2.getDeclarationFileSchema();
            List var6 = var2.getZipFileList();
            JT var7 = new JT();
            InitUploadType var8 = var3.createInitUploadType();
            var8.setDocumentType(var2.getInitUploadDocumentType().name());
            var8.setVersion("01.02.01.20160617");
            InitUploadType.EncryptionKey var9 = var3.createInitUploadTypeEncryptionKey();
            var9.setAlgorithm("RSA");
            var9.setMode("ECB");
            var9.setPadding("PKCS#1");
            var9.setEncoding("Base64");
            var9.setValue(var0);
            var8.setEncryptionKey(var9);
            ArrayOfDocumentType var10 = var3.createArrayOfDocumentType();
            ArrayOfDocumentType.Document var11 = var3.createArrayOfDocumentTypeDocument();
            DocumentType.FormCode var12 = var3.createDocumentTypeFormCode();
            var12.setSystemCode(var5.getKodSystemowy());
            var12.setSchemaVersion(var5.getWersjaSchemy());
            var12.setValue(var5.getKodFormularza());
            var11.setFormCode(var12);
            var11.setFileName(var4.getName());
            var11.setContentLength(var4.length());
            DocumentType.HashValue var13 = var3.createDocumentTypeHashValue();
            var13.setAlgorithm("SHA-256");
            var13.setEncoding("Base64");
            var13.setValue(var2.getDeclarationFileSHA256CheckSum().getValueBase64String());
            var11.setHashValue(var13);
            DocumentType.FileSignatureList var14 = var3.createDocumentTypeFileSignatureList();
            var14.setFilesNumber(var6.size());
            ArrayOfFileSignatureType.Packaging var15 = var3.createArrayOfFileSignatureTypePackaging();
            ArrayOfFileSignatureType.Packaging.SplitZip var16 = var3.createArrayOfFileSignatureTypePackagingSplitZip();
            var16.setType("split");
            var16.setMode("zip");
            var15.setSplitZip(var16);
            var14.setPackaging(var15);
            ArrayOfFileSignatureType.Encryption var17 = var3.createArrayOfFileSignatureTypeEncryption();
            ArrayOfFileSignatureType.Encryption.AES var18 = var3.createArrayOfFileSignatureTypeEncryptionAES();
            var18.setSize(256);
            var18.setBlock(16);
            var18.setMode("CBC");
            var18.setPadding("PKCS#7");
            ArrayOfFileSignatureType.Encryption.AES.IV var19 = var3.createArrayOfFileSignatureTypeEncryptionAESIV();
            var19.setBytes("16");
            var19.setEncoding("Base64");
            var19.setValue(var1.getValueBase64String());
            var18.setIV(var19);
            var17.setAES(var18);
            var14.setEncryption(var17);
            int var20 = 0;
            Iterator var21 = var6.iterator();

            while (var21.hasNext()) {
                AGXD var22 = (AGXD) var21.next();
                File var23 = var22.getSplitFileEncrypted();
                ++var20;
                byte[] var24 = FEJ.IKM(var23);
                String var25 = Base64.getEncoder().encodeToString(var24);
                FileSignatureType var26 = var3.createFileSignatureType();
                var26.setOrdinalNumber(var20);
                var26.setFileName(var23.getName());
                var26.setContentLength(Long.valueOf(var23.length()).intValue());
                FileSignatureType.HashValue var27 = var3.createFileSignatureTypeHashValue();
                var27.setAlgorithm("MD5");
                var27.setEncoding("Base64");
                var27.setValue(var25);
                var26.setHashValue(var27);
                var14.getFileSignature().add(var26);
                var11.setFileSignatureList(var14);
            }

            var10.getDocument().add(var11);
            var8.setDocumentList(var10);
            FEO var33 = new FEO(false, false, StandardCharsets.UTF_8, InitUploadType.class);
            byte[] var34 = var33.IKU(var3.createInitUpload(var8));
            var7.setValue(var34);
            var2.setInitUploadSignedFile(var7);
            log.info("InitUpload file created for input file [" + var2.getDeclarationFile() + "]");
        } catch (JAXBException | NoSuchAlgorithmException | IOException var31) {
            throw new FFK(var31);
        }
    }

    public static boolean HPI(EWX var0, AGWN var1) throws FFK {

        boolean var24;
        try {
            log.info("About to valida InitUploadFile of input file [" + var1.getDeclarationFile() + "]");
            JT var2 = var1.getInitUploadSignedFile();
            boolean var3 = false;

            final FFM var5;
            try {
                EWW var23 = new EWW(new ByteArrayInputStream(var2.getValue()), var2.getValue().length, var0);
                var5 = new FFM();
                XMLInputFactory var6 = XMLInputFactory.newInstance();
                XMLStreamReader var7 = var6.createXMLStreamReader(var23);
                StAXSource var8 = new StAXSource(var7);
                SchemaFactory var9 = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
                Schema var10 = var9.newSchema(EQL.getInstance().getInitUploadXsd());
                Validator var11 = var10.newValidator();
                var11.setErrorHandler(new ErrorHandler() {
                    public void warning(SAXParseException var1) throws SAXException {
                        var5.ILJ(new FCX(FCX.FCY.WARNING, var1));
                    }

                    public void fatalError(SAXParseException var1) throws SAXException {
                        var5.ILJ(new FCX(FCX.FCY.FATALERROR, var1));
                    }

                    public void error(SAXParseException var1) throws SAXException {
                        var5.ILJ(new FCX(FCX.FCY.ERROR, var1));
                    }
                });
                var11.validate(var8);
                var1.setInitUploadSignedFileValid(true);
                var23.close();
                var1.setExceptions(var5);
                var3 = var5.getThrowables().size() <= 0;
            } catch (IOException | XMLStreamException | SAXException var20) {
                var1.setInitUploadSignedFileValid(false);
                FFM var51 = new FFM();
                var51.ILJ(var20);
                var1.setExceptions(var51);
                throw new FFK(var20);
            }

            log.info("InitUpload file validated for the input file [" + var1.getDeclarationFile() + "]");
            var24 = var3;
        } finally {
            EWX.IBJ(var0, 1.0, 0L, 0L);

        }

        return var24;
    }

    private static synchronized byte[] HPJ(String var0, String var1, String var2, X509Certificate var3) throws FFK {

        byte[] var28;
        try {
            log.info("About to create UqalifyingProperties for signature [" + var0 + "]");
            Document var4 = null;
            var4 = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element var5 = var4.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:QualifyingProperties");
            var4.appendChild(var5);
            var5.setAttribute("Target", "#" + var0);
            Element var6 = var4.createElement("xades:SignedProperties");
            var5.appendChild(var6);
            var6.setAttribute("ID", var2);
            var6.setIdAttribute("ID", true);
            Element var7 = var4.createElement("xades:SignedSignatureProperties");
            var6.appendChild(var7);
            Element var8 = var4.createElement("xades:SigningTime");
            var7.appendChild(var8);
            var8.setTextContent(EQL.getCurrentDateSigningTimeString());
            Element var9 = var4.createElement("xades:SigningCertificate");
            var7.appendChild(var9);
            Element var10 = var4.createElement("xades:Cert");
            var9.appendChild(var10);
            Element var11 = var4.createElement("xades:CertDigest");
            var10.appendChild(var11);
            Element var12 = var4.createElementNS("http://www.w3.org/2000/09/xmldsig#", "ds:DigestMethod");
            var11.appendChild(var12);
            var12.setAttribute("Algorithm", "http://www.w3.org/2000/09/xmldsig#sha1");
            Element var13 = var4.createElementNS("http://www.w3.org/2000/09/xmldsig#", "ds:DigestValue");
            var11.appendChild(var13);
            MessageDigest var14 = MessageDigest.getInstance("SHA-1");
            var14.reset();
            var14.update(var3.getEncoded());
            byte[] var15 = var14.digest();
            var13.setTextContent(Base64.getEncoder().encodeToString(var15));
            Element var16 = var4.createElement("xades:IssuerSerial");
            var10.appendChild(var16);
            Element var17 = var4.createElementNS("http://www.w3.org/2000/09/xmldsig#", "ds:X509IssuerName");
            var16.appendChild(var17);
            var17.setTextContent(var3.getIssuerDN().toString());
            Element var18 = var4.createElementNS("http://www.w3.org/2000/09/xmldsig#", "ds:X509SerialNumber");
            var16.appendChild(var18);
            var18.setTextContent(var3.getSerialNumber().toString());
            Element var19 = var4.createElement("xades:SignedDataObjectProperties");
            var6.appendChild(var19);
            Element var20 = var4.createElement("xades:DataObjectFormat");
            var19.appendChild(var20);
            var20.setAttribute("ObjectReference", "#" + var1);
            Element var21 = var4.createElement("xades:MimeType");
            var20.appendChild(var21);
            var21.setTextContent("text/xml");
            ByteArrayOutputStream var27 = new ByteArrayOutputStream();
            TransformerFactory.newInstance().newTransformer().transform(new DOMSource(var4), new StreamResult(var27));
            log.info("QualifyingProperties created for the signature [" + var0 + "]");
            var28 = var27.toByteArray();
        } catch (NoSuchAlgorithmException | CertificateEncodingException | TransformerException |
                 TransformerFactoryConfigurationError | ParserConfigurationException e) {
            log.error("Something bad happened {}", var0, e);
            throw new FFK(e);
        }

        return var28;
    }

    public static void HPK(AGWN var0, FFC var1, X509Certificate var2) throws Exception {

        ArrayList var3 = new ArrayList();
        var3.add(var0);
        HPK(var3, var1, var2);

    }

    public static void HPK(List<AGWN> var0, FFC var1, X509Certificate var2) throws FFN {
        throw new UnsupportedOperationException("reimplement without sun.security");
    }

    public static boolean HPL(AGWN var0) throws FFN, FFO {

        boolean var2;
        ArrayList var1 = new ArrayList();
        var1.add(var0);
        var2 = HPL(var1);

        return var2;
    }

    public static boolean HPL(List<AGWN> var0) throws FFN, FFO {

        FFM var1 = new FFM();

        String var2 = "#" + System.nanoTime();
        long var3 = 0L;
        Iterator var5 = var0.iterator();

        while (var5.hasNext()) {
            AGWN var6 = (AGWN) var5.next();
            JT var7 = var6.getInitUploadSignedFile();
            var3 += var7.getValue().length;
            if ((long) var7.getValue().length > 5248000L) {
                throw FCZ.getInstance().IHS(String.valueOf(5248000L), String.valueOf(var7.getValue().length), var6.getDeclarationFileName());
            }
        }

        if (var3 > 20992000L) {
            throw FCZ.getInstance().IHR(String.valueOf(20992000L), String.valueOf(var3));
        } else {
            try {
                PodpisPZ_Service var49 = new PodpisPZ_Service(PodpisPZ_Service.WSDL_LOCATION, PodpisPZ_Service.SERVICE);
                PodpisPZ var51 = var49.getPodpisPZSOAP();
                BindingProvider var53 = (BindingProvider) var51;
                URL var8 = new URL((String) var53.getRequestContext().get("jakarta.xml.ws.service.endpoint.address"));
                final String var9 = var8.getHost();
                var53.getRequestContext().put("com.sun.xml.internal.ws.transport.https.client.hostname.verifier", new HostnameVerifier() {
                    public boolean verify(String var1, SSLSession var2) {
                        return var9.equals(var1);
                    }
                });
                var53.getRequestContext().put("com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory", getSSLSocketFactory());
                ArrayList var10 = new ArrayList();
                var10.add(new EQX("jpk_podpis_pz", "3ger}97DDx"));
                var53.getBinding().setHandlerChain(var10);
                Holder var11 = new Holder();
                Holder var12 = new Holder();
                Holder var13 = new Holder();
                String var14 = "JPKM " + var2;
                log.info("opisZadania " + var14);
                ListaDokumentowType var15 = new ListaDokumentowType();

                Object var19;
                Object var20;
                for (int var16 = 0; var16 < var0.size(); ++var16) {
                    AGWN var17 = var0.get(var16);
                    var17.setSignatureType(EHK.PZ);
                    JT var18 = var17.getInitUploadSignedFile();
                    var19 = var17.getDeclarationFileName();
                    log.info("inputFileName " + var19);
                    log.info("documentId " + var16);
                    var20 = new DokumentZadanieType();
                    ((DokumentZadanieType) var20).setIdDokumentu(var16);
                    ((DokumentZadanieType) var20).setOpis((String) var19);
                    ((DokumentZadanieType) var20).setZawartosc(var18.getValue());
                    var15.getDokument().add((DokumentZadanieType) var20);
                }

                log.info("About to execute podpisPZ.zadaniePodpisu");

                try {
                    var51.zadaniePodpisu(var14, var15, var11, var12, var13);
                } catch (Exception var42) {
                    log.error("Something bad happened", var42);
                    File log = new File(EXK.GPW + "/reports/emk.log");
                    String var57 = var42.getLocalizedMessage();
                    if (var57 == null) {
                        var57 = "";
                    }

                    FCR.IGJ(FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.header").replaceFirst("##SESSIONID##", var2), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.errorGoodLooking") + " ", log, false);
                    var19 = false;
                    return (boolean) var19;
                }

                log.info("podpisPZ.zadaniePodpisu executed");
                log.info("wynik " + var11.value);
                log.info("adresZadania " + var12.value);
                StringBuilder var54 = new StringBuilder();
                var54.append((String) var11.value).append(System.lineSeparator());
                boolean var56 = true;
                if ("200: OK".equalsIgnoreCase((String) var11.value)) {
                    Iterator var58 = ((ListaDokWynikType) var13.value).getDokument().iterator();

                    while (var58.hasNext()) {
                        var19 = var58.next();
                        if (!"200: OK".equalsIgnoreCase(((DokumentWynikType) var19).getWynik())) {
                            var56 = false;
                            var54.append(((DokumentWynikType) var19).getIdDokumentu()).append(" ").append(((DokumentWynikType) var19).getWynik()).append(System.lineSeparator());
                        }
                    }
                } else {
                    var56 = false;
                }

                if (var56) {
                    boolean var59;
                    do {
                        var59 = true;
                        var19 = FCR.getConfirmPZDialog(FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.title"), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.header").replaceFirst("##SESSIONID##", var2), 300.0, 100.0, FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.query"), (String) var12.value, FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.context"));
                        if (!Boolean.TRUE.equals(var19)) {
                            return false;
                        }

                        var20 = new Holder();
                        Holder var21 = new Holder();
                        ListaDokDoPobraniaType var22 = new ListaDokDoPobraniaType();
                        Iterator var23 = ((ListaDokWynikType) var13.value).getDokument().iterator();

                        while (var23.hasNext()) {
                            DokumentWynikType var24 = (DokumentWynikType) var23.next();
                            DokumentType var25 = new DokumentType();
                            var25.setIdDokumentu(var24.getIdDokumentu());
                            var22.getDokument().add(var25);
                        }

                        log.info("About to execute podpisPZ.pobierzDokumenty");

                        int var26;
                        try {
                            var51.pobierzDokumenty((String) var12.value, var22, (Holder) var20, var21);
                        } catch (Exception var43) {
                            log.error("Something bad happened", var43);
                            File log = new File(EXK.GPW + "/reports/emk.log");
                            String var63 = var43.getLocalizedMessage();
                            if (var63 == null) {
                                var63 = "";
                            }

                            FCR.IGJ(FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.header").replaceFirst("##SESSIONID##", var2), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.errorGoodLooking") + " ", log, false);
                            return false;
                        }

                        log.info("podpisPZ.pobierzDokumenty executed");
                        log.info("wynik " + ((Holder) var20).value);
                        StringBuilder var60 = new StringBuilder();
                        if ("200: OK".equalsIgnoreCase((String) ((Holder) var20).value)) {
                            Iterator var62 = ((ListaDokPodpisaneType) var21.value).getDokument().iterator();

                            while (var62.hasNext()) {
                                DokumentPodpisanyType var64 = (DokumentPodpisanyType) var62.next();
                                if ("200: OK".equalsIgnoreCase(var64.getWynik())) {
                                    for (var26 = 0; var26 < var0.size(); ++var26) {
                                        if ((long) var26 == var64.getIdDokumentu()) {
                                            AGWN var27 = var0.get(var26);
                                            var27.setInitUploadSignedEnvelopedFile(new JT(var64.getPodpisanaZawartosc()));
                                            break;
                                        }
                                    }
                                } else {
                                    var59 = false;
                                    var60.append(var64.getIdDokumentu()).append(" ").append(var64.getWynik()).append(System.lineSeparator());
                                }
                            }
                        } else {
                            var59 = false;
                        }

                        if (var59) {
                            FCR.IGF(FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.title"), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.header").replaceFirst("##SESSIONID##", var2), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.success").replaceFirst("##MESSAGE##", var60.toString()), false, 400.0, 100.0);
                        } else {
                            FCR.IGK(FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.header").replaceFirst("##SESSIONID##", var2), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.error").replaceFirst("##MESSAGE##", var60.toString()), false);
                        }
                    } while (!var59);

                    var19 = true;
                    return (boolean) var19;
                }

                FCR.IGK(FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.header").replaceFirst("##SESSIONID##", var2), FCW.getInstance().getMessageForKey("micro.tableview.cell.initupload.sign.pz.message.error").replaceFirst("##MESSAGE##", var54.toString()), false);
            } catch (FFO var44) {
                log.error("Something bad happened", var44);
                throw var44;
            } catch (Exception var45) {
                log.error("Something bad happened", var45);
                var1.ILJ(var45);
            }

            if (var1.getThrowables().size() > 0) {
                var5 = var1.getThrowables().iterator();

                while (var5.hasNext()) {
                    Throwable var52 = (Throwable) var5.next();
                    log.error("Something bad happened", var52);
                }

                throw new FFN(var1.getThrowables());
            } else {
                boolean var50 = false;
                return var50;
            }
        }
    }

    private static SSLSocketFactory getSSLSocketFactory() throws Exception {
        return getSSLContext().getSocketFactory();
    }

    private static SSLContext getSSLContext() throws NoSuchAlgorithmException, KeyManagementException, CertificateException, IOException {

        InputStream var0 = null;

        SSLContext var4;
        try {
            CertificateFactory var1 = CertificateFactory.getInstance("X.509");
            var0 = EPW.class.getResourceAsStream("/cert/mf_pz.pem");
            final X509Certificate var2 = (X509Certificate) var1.generateCertificate(var0);
            SSLContext var3 = SSLContext.getInstance("TLS");
            var3.init(null, new X509TrustManager[]{new X509TrustManager() {
                public void checkClientTrusted(X509Certificate[] var1, String var2x) throws CertificateException {
                    throw new CertificateException("Not implemented!");
                }

                public void checkServerTrusted(X509Certificate[] var1, String var2x) throws CertificateException {
                    boolean var3 = false;
                    if (var2 != null) {
                        for (int var4 = 0; var4 < var1.length; ++var4) {
                            X509Certificate var5 = var1[var4];
                            if (var5 != null && Arrays.equals(var2.getEncoded(), var5.getEncoded())) {
                                var3 = true;
                                break;
                            }
                        }
                    }

                    if (!var3) {
                        throw new CertificateException("Certificate not valid!");
                    }
                }

                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[]{var2};
                }
            }}, new SecureRandom());
            var4 = var3;
        } finally {
            if (var0 != null) {
                var0.close();
            }

        }

        return var4;
    }

    public static void HPM(AGWN var0, FFC var1, X509Certificate var2) throws FFK {

        try {
            log.info("About to sign InitUpload file for input file [" + var0.getDeclarationFile() + "]");
            JT var3 = var0.getInitUploadSignedFile();
            JT var4 = new JT();
            String var5 = "sigId_" + System.nanoTime();
            String var6 = "sigValId_" + System.nanoTime();
            String var7 = "mainRefId_" + System.nanoTime();
            String var8 = "sigPropId_" + System.nanoTime();
            byte[] var9 = FEX.IKZ(var1, var2, var3.getValue(), HPJ(var5, var7, var8, var2), var5, var6, var7, var8);
            var4.setValue(var9);
            var0.setInitUploadSignedEnvelopedFile(var4);
            log.info("InitUpload file signed for input file [" + var0.getDeclarationFile() + "]");
        } catch (FEV var13) {
            throw new FFK(var13);
        }

    }

    public static void HPN(AGWN var0) throws FFO {

        try {
            log.info("About to validate signature of the InitUpload file of the input file [" + var0.getDeclarationFile() + "]");
            JT var1 = var0.getInitUploadSignedEnvelopedFile();
            log.debug("signedEnvelopedFile " + var1);
            if (var1 != null) {
                FEQ.IKY(var1.getValue());
                var0.setInitUploadSignedEnvelopedFileValid(true);
            }

            log.info("Signature of the InitUpload file validated for the input file [" + var0.getDeclarationFile() + "]");
        } catch (FEU var5) {
            var0.setInitUploadSignedEnvelopedFileValid(false);
            throw new FFO(var5);
        }

    }

    public static void step_10_setSignedEnvelopedFile(AGWN var0, File var1) throws FFK {

        try {
            log.info("About to load externally signed file as signed InitUpload file for input file [" + var0.getDeclarationFile() + "]");
            byte[] var2 = FEJ.IKP(var1);
            var0.setInitUploadSignedEnvelopedFile(new JT(var2));
            log.info("Externally signed file loaded as signed InitUpload file for input file [" + var0.getDeclarationFile() + "]");
        } catch (IOException var6) {
            throw new FFK(var6);
        }

    }

    public static EQB.EQC HPO(EWX var0, AGWN var1) {

        EQB.EQC var3;
        try {
            log.info("About to start sendout for declaration [" + var1.getId() + "]");
            EQB var2 = new EQB(var0, var1);
            var3 = var2.HPW();
        } finally {
            EWX.IBJ(var0, 1.0, 0L, 0L);

        }

        return var3;
    }

    public static EQB.EQC MWZ(EWX var0, AGWN var1) {

        EQB.EQC var3;
        try {
            log.info("About to start KD sendout for declaration [" + var1.getId() + "]");
            EQB var2 = new EQB(var0, var1);
            var3 = var2.MXA();
        } finally {
            EWX.IBJ(var0, 1.0, 0L, 0L);

        }

        return var3;
    }
}
