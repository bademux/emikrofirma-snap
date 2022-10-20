package a.a.a.c.d.b;

import a.a.a.b.b.FEJ;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.b.f.a.FFM;
import a.a.a.b.g.FFP;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.AGXA;
import a.a.a.c.g.c.FCX;
import a.a.a.c.g.c.FCZ;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EQM {
    public static final String FXD = "[a-zA-Z0-9_\\.\\-]{5,55}";
    public static final String FXE = "[a-zA-Z0-9_\\.\\-]{5,51}";

    public EQM() {
    }

    public boolean HQL(File var1) {
        EXF.getInstance().ICO();

        boolean var2;
        try {
            if (var1 != null) {
                var2 = var1.getName().matches("[a-zA-Z0-9_\\.\\-]{5,55}");
                return var2;
            }

            var2 = false;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public boolean HQM(File var1) {
        EXF.getInstance().ICO();

        boolean var2;
        try {
            if (var1 == null) {
                var2 = false;
                return var2;
            }

            var2 = var1.getName().matches("[a-zA-Z0-9_\\.\\-]{5,51}");
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public AGXA HQN(File var1) throws FFO, FFK {
        EXF.getInstance().ICO();
        int var2 = 0;
        InputStream var3 = null;
        BufferedReader var4 = null;

        try {
            EXF.getInstance().ICK("inputFile " + var1);
            FFP var5 = new FFP(EPX.FVI, EPX.FVJ);
            var3 = FEJ.getFileInputStreamSkipBOM(var1);
            var4 = new BufferedReader(new InputStreamReader(var3, EPX.FVK));
            List var6 = null;
            String var7 = null;

            while (true) {
                label219:
                {
                    if ((var7 = var4.readLine()) != null) {
                        EXF.getInstance().ICK("line " + var7);
                        if (var7.length() <= 0) {
                            break label219;
                        }

                        List var8 = var5.ILL(var7);
                        if (var2 == 0) {
                            var6 = var8;
                            if (var8.size() <= 4) {
                                throw FCZ.getInstance().IHY();
                            }
                            break label219;
                        }

                        if (var2 == 1) {
                            EXF.getInstance().ICK("KodFormularza " + var6.get(0) + " " + "KodFormularza".equals(var6.get(0)));
                            EXF.getInstance().ICK(var6.get(0));
                            EXF.getInstance().ICK(((String) var6.get(0)).length());
                            EXF.getInstance().ICK("KodFormularza".length());
                            EXF.getInstance().ICK("kodSystemowy " + var6.get(1) + " " + "kodSystemowy".equals(var6.get(1)));
                            EXF.getInstance().ICK("wersjaSchemy " + var6.get(2) + " " + "wersjaSchemy".equals(var6.get(2)));
                            EXF.getInstance().ICK("WariantFormularza " + var6.get(3) + " " + "WariantFormularza".equals(var6.get(3)));
                            if (!"KodFormularza".equals(var6.get(0)) || !"kodSystemowy".equals(var6.get(1)) || !"wersjaSchemy".equals(var6.get(2)) || !"WariantFormularza".equals(var6.get(3))) {
                                throw FCZ.getInstance().IHV("KodFormularza, kodSystemowy, wersjaSchemy, WariantFormularza", var6.get(0) + ", " + var6.get(1) + ", " + var6.get(2) + ", " + var6.get(3));
                            }

                            if (var8.size() <= 4) {
                                throw FCZ.getInstance().IHZ("line[1].size <= 4");
                            }

                            Iterator var9 = EQL.getInstance().getJpkSchemaFilesMap().values().iterator();

                            AGXA var10;
                            do {
                                if (!var9.hasNext()) {
                                    break label219;
                                }

                                var10 = (AGXA) var9.next();
                            } while (!var10.getKodFormularza().equals(var8.get(0)) || !var10.getKodSystemowy().equals(var8.get(1)) || !var10.getWersjaSchemy().equals(var8.get(2)) || !var10.getWariantFormularza().equals(var8.get(3)));

                            AGXA var11 = var10;
                            return var11;
                        }
                    }

                    if (var6 != null && var6.size() > 4) {
                        throw FCZ.getInstance().IHZ(var6.get(0) + " " + var6.get(1) + " " + var6.get(2) + " " + var6.get(3));
                    }

                    throw FCZ.getInstance().IHY();
                }

                ++var2;
            }
        } catch (IOException | FFP.FFQ var23) {
            EXF.getInstance().ICA(var23);
            throw new FFO(var23);
        } finally {
            if (var4 != null) {
                try {
                    var4.close();
                } catch (IOException var22) {
                    EXF.getInstance().ICA(var22);
                }
            }

            if (var3 != null) {
                try {
                    var3.close();
                } catch (IOException var21) {
                    EXF.getInstance().ICA(var21);
                }
            }

            EXF.getInstance().ICP();
        }
    }

    public EVZ<AGXA, String> HQO(File var1) throws FFO, FFK {
        EXF.getInstance().ICO();
        FileInputStream var2 = null;

        try {
            SAXParserFactory var3 = SAXParserFactory.newInstance();
            SAXParser var4 = var3.newSAXParser();
            XMLReader var5 = var4.getXMLReader();
            EQN var6 = new EQN();
            var5.setContentHandler(var6);
            final FFM var7 = new FFM();
            var5.setErrorHandler(new ErrorHandler() {
                public void warning(SAXParseException var1) throws SAXException {
                    var7.ILJ(new FCX(FCX.FCY.WARNING, var1));
                }

                public void fatalError(SAXParseException var1) throws SAXException {
                    var7.ILJ(new FCX(FCX.FCY.FATALERROR, var1));
                }

                public void error(SAXParseException var1) throws SAXException {
                    var7.ILJ(new FCX(FCX.FCY.ERROR, var1));
                }
            });
            var2 = new FileInputStream(var1);
            InputSource var8 = new InputSource(var2);

            try {
                var5.parse(var8);
            } catch (EQO var21) {
            }

            if (var7.getThrowables().size() > 0) {
                StringBuilder var24 = new StringBuilder();
                Iterator var25 = var7.getThrowables().iterator();

                while (var25.hasNext()) {
                    Throwable var26 = (Throwable) var25.next();
                    var24.append(var26.getLocalizedMessage());
                    var24.append(System.lineSeparator());
                }

                throw new FFO(var24.toString());
            } else {
                EXF.getInstance().ICK("nodeCounter " + var6.getNodeCounter());
                EXF.getInstance().ICK("xmlValue_tnsJPK " + var6.getXmlValue_tnsJPK());
                EXF.getInstance().ICK("xmlValue_KodFormularza " + var6.getXmlValue_KodFormularza());
                EXF.getInstance().ICK("xmlValue_kodSystemowy " + var6.getXmlValue_kodSystemowy());
                EXF.getInstance().ICK("xmlValue_wersjaSchemy " + var6.getXmlValue_wersjaSchemy());
                EXF.getInstance().ICK("xmlValue_wariantFormularza " + var6.getXmlValue_wariantFormularza());
                EXF.getInstance().ICK("xmlValue_celZlozenia " + var6.getXmlValue_celZlozenia());
                Iterator var9 = EQL.getInstance().getJpkSchemaFilesMap().values().iterator();

                AGXA var10;
                do {
                    if (!var9.hasNext()) {
                        throw FCZ.getInstance().IIA(var6.getXmlValue_tnsJPK() + " " + var6.getXmlValue_KodFormularza() + " " + var6.getXmlValue_kodSystemowy() + " " + var6.getXmlValue_wersjaSchemy());
                    }

                    var10 = (AGXA) var9.next();
                } while (!var10.getTns().equals(var6.getXmlValue_tnsJPK()) || !var10.getKodFormularza().equals(var6.getXmlValue_KodFormularza()) || !var10.getKodSystemowy().equals(var6.getXmlValue_kodSystemowy()) || !var10.getWersjaSchemy().equals(var6.getXmlValue_wersjaSchemy()) || !var10.getWariantFormularza().equals(var6.getXmlValue_wariantFormularza()));

                EVZ var11 = new EVZ(var10, var6.getXmlValue_celZlozenia());
                return var11;
            }
        } catch (IOException | ParserConfigurationException | SAXException var22) {
            EXF.getInstance().ICA(var22);
            throw new FFO(var22);
        } finally {
            if (var2 != null) {
                try {
                    var2.close();
                } catch (IOException var20) {
                    EXF.getInstance().ICA(var20);
                }
            }

            EXF.getInstance().ICP();
        }
    }

    public List<AGXA> HQP(String var1) throws FFK {
        EXF.getInstance().ICO();

        try {
            ArrayList var2 = new ArrayList();
            Iterator var3 = EQL.getInstance().getJpkSchemaFilesMap().values().iterator();

            while (var3.hasNext()) {
                AGXA var4 = (AGXA) var3.next();
                if (var4.getKodFormularza().equals(var1)) {
                    var2.add(var4);
                }
            }

            ArrayList var8 = var2;
            return var8;
        } finally {
            EXF.getInstance().ICP();
        }
    }

    private static class EQO extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public EQO(String var1) {
            super(var1);
        }
    }

    private static class EQN extends DefaultHandler {
        private static final int FWQ = 50;
        private String FWR;
        private String FWS;
        private String FWT;
        private String FWU;
        private String FWV;
        private String FWW;
        private int FWX;
        boolean FWY;
        String FWZ;
        boolean FXA;
        boolean FXB;
        boolean FXC;

        private EQN() {
            this.FWR = null;
            this.FWS = null;
            this.FWT = null;
            this.FWU = null;
            this.FWV = null;
            this.FWW = null;
            this.FWX = 0;
            this.FWY = true;
            this.FWZ = null;
            this.FXA = false;
            this.FXB = false;
            this.FXC = false;
        }

        public void startElement(String var1, String var2, String var3, Attributes var4) throws SAXException {
            try {
                ++this.FWX;
                if (this.FWX > 50) {
                    throw FCZ.getInstance().IIB(50);
                } else {
                    int var5;
                    if (this.FWY) {
                        this.FWY = false;

                        label67:
                        for (var5 = 0; var5 < var4.getLength(); ++var5) {
                            Iterator var6 = EQL.getInstance().getJpkSchemaFilesMap().values().iterator();

                            while (var6.hasNext()) {
                                AGXA var7 = (AGXA) var6.next();
                                if (var7.getTns().equals(var4.getValue(var5))) {
                                    this.FWR = var4.getValue(var5);
                                    EXF.getInstance().ICK("attributes.QName " + var4.getQName(var5));
                                    String[] var8 = var4.getQName(var5).split(":");
                                    if (var8.length == 1) {
                                        this.FWZ = "";
                                    } else {
                                        if (var8.length != 2) {
                                            throw FCZ.getInstance().IIC(var4.getQName(var5));
                                        }

                                        this.FWZ = var8[1] + ":";
                                    }
                                    break label67;
                                }
                            }
                        }

                        EXF.getInstance().ICK("tnsPrefixJPK " + this.FWZ);
                        if (this.FWZ == null) {
                            throw FCZ.getInstance().IID();
                        }
                    }

                    if ((this.FWZ + "KodFormularza").equals(var3)) {
                        this.FXA = true;

                        for (var5 = 0; var5 < var4.getLength(); ++var5) {
                            if ("kodSystemowy".equals(var4.getQName(var5))) {
                                this.FWT = var4.getValue(var5);
                            } else if ("wersjaSchemy".equals(var4.getQName(var5))) {
                                this.FWU = var4.getValue(var5);
                            }
                        }
                    }

                    if ((this.FWZ + "WariantFormularza").equals(var3)) {
                        this.FXB = true;
                    }

                    if ((this.FWZ + "CelZlozenia").equals(var3)) {
                        this.FXC = true;
                    }

                }
            } catch (FFK var9) {
                throw FCZ.getInstance().IIE(var9.getLocalizedMessage());
            }
        }

        public void endElement(String var1, String var2, String var3) throws SAXException {
            if ((this.FWZ + "KodFormularza").equals(var3)) {
                this.FXA = false;
            }

            if ((this.FWZ + "WariantFormularza").equals(var3)) {
                this.FXB = false;
            }

            if ((this.FWZ + "CelZlozenia").equals(var3)) {
                this.FXC = false;
            }

            if (this.FWS != null && this.FWV != null && this.FWW != null) {
                throw new EQO("No need to parse further..");
            }
        }

        public void characters(char[] var1, int var2, int var3) throws SAXException {
            StringBuilder var4;
            int var5;
            if (this.FXA) {
                var4 = new StringBuilder();

                for (var5 = 0; var5 < var3; ++var5) {
                    var4.append(var1[var2 + var5]);
                }

                this.FWS = var4.toString();
            }

            if (this.FXB) {
                var4 = new StringBuilder();

                for (var5 = 0; var5 < var3; ++var5) {
                    var4.append(var1[var2 + var5]);
                }

                this.FWV = var4.toString();
            }

            if (this.FXC) {
                var4 = new StringBuilder();

                for (var5 = 0; var5 < var3; ++var5) {
                    var4.append(var1[var2 + var5]);
                }

                this.FWW = var4.toString();
            }

        }

        public int getNodeCounter() {
            return this.FWX;
        }

        public String getXmlValue_tnsJPK() {
            return this.FWR;
        }

        public String getXmlValue_KodFormularza() {
            return this.FWS;
        }

        public String getXmlValue_kodSystemowy() {
            return this.FWT;
        }

        public String getXmlValue_wersjaSchemy() {
            return this.FWU;
        }

        public String getXmlValue_wariantFormularza() {
            return this.FWV;
        }

        public String getXmlValue_celZlozenia() {
            return this.FWW;
        }
    }
}
