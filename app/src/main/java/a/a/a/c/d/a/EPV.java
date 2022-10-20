package a.a.a.c.d.a;

import a.a.a.c.d.a.a.EPP;
import a.a.a.c.e.a.d.ValueContainer1;
import a.a.a.c.f.a.c.AHEQ;
import a.a.a.c.f.a.c.a.ConfigurationPackage;
import a.a.a.c.f.a.c.a.MainConfiguration;
import a.a.a.c.f.a.c.a.c.*;
import lombok.extern.slf4j.Slf4j;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.OutputStream;
import java.util.*;

@Slf4j
public class EPV extends DefaultHandler {
    private final OutputStream FUM;
    final ValueContainer1<Integer> FUN;
    private final String FUO;
    private final MainConfiguration FUP;
    private final Stack<Map<String, AHEQ>> FUQ;
    private final Stack<DeclaredFieldElementNS> FUR;
    private final Stack<ParentField> FUS;
    private DeclaredFieldElementNS FUT = null;

    public EPV(OutputStream var1, ValueContainer1<Integer> var2, String var3, MainConfiguration var4) {

        log.debug("outputStream " + var1);
        log.debug("counter " + var2);
        log.debug("separator " + var3);
        log.debug("rulesConfiguration " + var4);

        this.FUM = var1;
        this.FUN = var2;
        this.FUO = var3;
        this.FUP = var4;
        this.FUQ = new Stack();
        this.FUR = new Stack();
        this.FUS = new Stack();

    }

    public void startElement(String var1, String var2, String var3, Attributes var4) throws SAXException {

        log.debug("uri " + var1);
        log.debug("localName " + var2);
        log.debug("qName " + var3);
        log.debug("attributes " + var4);

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

        this.FUT = new DeclaredFieldElementNS(var9, var7, var10);
        Object var20 = this.FUR.push(this.FUT);
        Iterator var21 = this.FUP.getRulesPackages().iterator();

        while (var21.hasNext()) {
            ConfigurationPackage var22 = (ConfigurationPackage) var21.next();
            Iterator var23 = var22.getParentFields().iterator();

            while (var23.hasNext()) {
                ParentField var24 = (ParentField) var23.next();
                boolean var16 = this.HOU(var24.getFieldType());
                if (var16) {
                    var24.executeReset();
                    this.FUS.push(var24);
                }
            }
        }

    }

    public void endElement(String var1, String var2, String var3) throws SAXException {

        log.debug("uri " + var1);
        log.debug("localName " + var2);
        log.debug("qName " + var3);

        Object var4 = this.FUQ.pop();
        Iterator var5 = this.FUP.getRulesPackages().iterator();

        while (true) {
            while (true) {
                do {
                    if (!var5.hasNext()) {
                        DeclaredFieldElementNS var15 = this.FUR.pop();
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

                    ConfigurationPackage var6 = (ConfigurationPackage) var5.next();
                    Iterator var7 = var6.getSelectedFields().iterator();

                    while (var7.hasNext()) {
                        SelectedField var8 = (SelectedField) var7.next();
                        boolean var9 = this.HOU(var8.getFieldType());
                        if (var9) {
                            var8.setValue(this.FUT.getValue());
                            var8.AIDN();
                            var8.AIDO(this.FUM, this.FUN, this.FUO);
                        }
                    }
                } while (this.FUS.empty());

                ParentField var16 = this.FUS.peek();
                boolean var17 = this.HOU(var16.getFieldType());
                if (var17) {
                    ParentField var19 = this.FUS.pop();
                    var19.AIDJ();
                    var19.AIDK();
                    var19.AIDL(this.FUM, this.FUN, this.FUO);
                    var19.executeReset();
                } else {
                    Iterator var18 = var16.getChildFields().iterator();

                    while (var18.hasNext()) {
                        Field var10 = (Field) var18.next();
                        boolean var11 = this.HOU(var10.getFieldType());
                        if (var11) {
                            var10.setValue(this.FUT.getValue());
                        }
                    }
                }
            }
        }
    }

    public void characters(char[] var1, int var2, int var3) throws SAXException {

        log.debug("start " + var2);
        log.debug("length " + var3);

        StringBuilder var4 = new StringBuilder();

        for (int var5 = 0; var5 < var3; ++var5) {
            var4.append(var1[var2 + var5]);
        }

        log.debug("stringBuilder " + var4);
        this.FUT.setValue(var4.toString());
    }

    private boolean HOU(FieldType var1) {

        log.debug("declaredFieldType " + var1);

        boolean var12;
        Iterator var2 = this.FUR.iterator();
        DeclaredFieldBaseNS[] var3 = var1.getElementChain();
        boolean var4 = true;
        int var5 = -1;

        while (var2.hasNext()) {
            ++var5;
            DeclaredFieldElementNS var6 = (DeclaredFieldElementNS) var2.next();
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

        log.debug("match " + var4);
        var12 = var4;

        return var12;
    }

    private AHEQ HOV(String var1) {

        log.debug("namespacePrefix" + var1);

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
    }
}
