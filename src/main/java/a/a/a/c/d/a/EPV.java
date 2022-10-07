package a.a.a.c.d.a;

import a.a.a.c.d.a.a.EPP;
import a.a.a.c.e.a.d.EWD;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.AHEQ;
import a.a.a.c.f.a.c.a.AHDJ;
import a.a.a.c.f.a.c.a.AHDW;
import a.a.a.c.f.a.c.a.c.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.OutputStream;
import java.util.*;

public class EPV extends DefaultHandler {
    private final OutputStream FUM;
    final EWD<Integer> FUN;
    private final String FUO;
    private final AHDW FUP;
    private final Stack<Map<String, AHEQ>> FUQ;
    private final Stack<AHDR> FUR;
    private final Stack<AHDU> FUS;
    private AHDR FUT = null;

    public EPV(OutputStream var1, EWD<Integer> var2, String var3, AHDW var4) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("outputStream " + var1);
        EXF.getInstance().ICK("counter " + var2);
        EXF.getInstance().ICK("separator " + var3);
        EXF.getInstance().ICK("rulesConfiguration " + var4);

        try {
            this.FUM = var1;
            this.FUN = var2;
            this.FUO = var3;
            this.FUP = var4;
            this.FUQ = new Stack();
            this.FUR = new Stack();
            this.FUS = new Stack();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void startElement(String var1, String var2, String var3, Attributes var4) throws SAXException {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("uri " + var1);
        EXF.getInstance().ICK("localName " + var2);
        EXF.getInstance().ICK("qName " + var3);
        EXF.getInstance().ICK("attributes " + var4);

        try {
            HashMap var5 = new HashMap();

            for (int var6 = 0; var6 < var4.getLength(); ++var6) {
                if (AHEQ.AIDW(var4.getValue(var6))) {
                    var5.put(var4.getQName(var6).replaceFirst("xmlns", "").replaceFirst(":", ""), AHEQ.getByValue(var4.getValue(var6)));
                }
            }

            this.FUQ.push(var5);
            String var7;
            String var8;
            if (var3.contains(":")) {
                var8 = var3.split(":")[0];
                var7 = var3.split(":")[1];
            } else {
                var8 = "";
                var7 = var3;
            }

            AHEQ var9 = this.HOV(var8);
            ArrayList var10 = new ArrayList();

            for (int var11 = 0; var11 < var4.getLength(); ++var11) {
                String var12 = var4.getQName(var11);
                if (!var12.startsWith("xmlns")) {
                    String var13;
                    String var14;
                    if (var12.contains(":")) {
                        var14 = var12.split(":")[0];
                        var13 = var12.split(":")[1];
                    } else {
                        var14 = var8;
                        var13 = var12;
                    }

                    AHDP var15 = new AHDP(this.HOV(var14), var13, var4.getValue(var11));
                    var10.add(var15);
                }
            }

            this.FUT = new AHDR(var9, var7, var10);
            Object var20 = this.FUR.push(this.FUT);
            Iterator var21 = this.FUP.getRulesPackages().iterator();

            while (var21.hasNext()) {
                AHDJ var22 = (AHDJ) var21.next();
                Iterator var23 = var22.getParentFields().iterator();

                while (var23.hasNext()) {
                    AHDU var24 = (AHDU) var23.next();
                    boolean var16 = this.HOU(var24.getFieldType());
                    if (var16) {
                        var24.executeReset();
                        this.FUS.push(var24);
                    }
                }
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void endElement(String var1, String var2, String var3) throws SAXException {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("uri " + var1);
        EXF.getInstance().ICK("localName " + var2);
        EXF.getInstance().ICK("qName " + var3);

        try {
            Object var4 = this.FUQ.pop();
            Iterator var5 = this.FUP.getRulesPackages().iterator();

            while (true) {
                while (true) {
                    do {
                        if (!var5.hasNext()) {
                            AHDR var15 = this.FUR.pop();
                            if (!var15.equals(this.FUT)) {
                                throw new EPP("Popped element was NOT the current element!");
                            }

                            if (!this.FUR.empty()) {
                                this.FUT = this.FUR.peek();
                            } else {
                                this.FUT = null;
                            }

                            return;
                        }

                        AHDJ var6 = (AHDJ) var5.next();
                        Iterator var7 = var6.getSelectedFields().iterator();

                        while (var7.hasNext()) {
                            AHDV var8 = (AHDV) var7.next();
                            boolean var9 = this.HOU(var8.getFieldType());
                            if (var9) {
                                var8.setValue(this.FUT.getValue());
                                var8.AIDN();
                                var8.AIDO(this.FUM, this.FUN, this.FUO);
                            }
                        }
                    } while (this.FUS.empty());

                    AHDU var16 = this.FUS.peek();
                    boolean var17 = this.HOU(var16.getFieldType());
                    if (var17) {
                        AHDU var19 = this.FUS.pop();
                        var19.AIDJ();
                        var19.AIDK();
                        var19.AIDL(this.FUM, this.FUN, this.FUO);
                        var19.executeReset();
                    } else {
                        Iterator var18 = var16.getChildFields().iterator();

                        while (var18.hasNext()) {
                            AHDO var10 = (AHDO) var18.next();
                            boolean var11 = this.HOU(var10.getFieldType());
                            if (var11) {
                                var10.setValue(this.FUT.getValue());
                            }
                        }
                    }
                }
            }
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public void characters(char[] var1, int var2, int var3) throws SAXException {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("start " + var2);
        EXF.getInstance().ICK("length " + var3);

        try {
            StringBuilder var4 = new StringBuilder();

            for (int var5 = 0; var5 < var3; ++var5) {
                var4.append(var1[var2 + var5]);
            }

            EXF.getInstance().ICK("stringBuilder " + var4);
            this.FUT.setValue(var4.toString());
        } finally {
            EXF.getInstance().ICP();
        }
    }

    private boolean HOU(AHDS var1) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("declaredFieldType " + var1);

        boolean var12;
        try {
            Iterator var2 = this.FUR.iterator();
            AHDQ[] var3 = var1.getElementChain();
            boolean var4 = true;
            int var5 = -1;

            while (var2.hasNext()) {
                ++var5;
                AHDR var6 = (AHDR) var2.next();
                if (var3.length < var5 + 1) {
                    var4 = false;
                    break;
                }

                if (!var6.equals(var3[var5])) {
                    var4 = false;
                    break;
                }
            }

            if (var3.length > var5 + 1) {
                if (var3.length == var5 + 2 && var3[var5 + 1] instanceof AHDP) {
                    var12 = false;
                    Iterator var7 = this.FUT.getAttributes().iterator();

                    while (var7.hasNext()) {
                        AHDP var8 = (AHDP) var7.next();
                        if (var8.equals(var3[var5 + 1])) {
                            var12 = true;
                            break;
                        }
                    }

                    if (!var12) {
                        var4 = false;
                    }
                } else {
                    var4 = false;
                }
            }

            EXF.getInstance().ICK("match " + var4);
            var12 = var4;
        } finally {
            EXF.getInstance().ICP();
        }

        return var12;
    }

    private AHEQ HOV(String var1) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("namespacePrefix" + var1);

        try {
            Iterator var2 = this.FUQ.iterator();

            Map var3;
            do {
                if (!var2.hasNext()) {
                    throw new EPP("namespace prefix [" + var1 + "] not found!");
                }

                var3 = (Map) var2.next();
            } while (!var3.containsKey(var1));

            AHEQ var4 = (AHEQ) var3.get(var1);
            return var4;
        } finally {
            EXF.getInstance().ICP();
        }
    }
}
