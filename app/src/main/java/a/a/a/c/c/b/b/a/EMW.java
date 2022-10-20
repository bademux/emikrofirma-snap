package a.a.a.c.c.b.b.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.a.EMA;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.b.b.EMU;
import a.a.a.c.c.c.ENG;

import java.util.*;

public class EMW implements EMT {
    private final EMU FIE;
    private final Map<String, List<ELV>> FIF;

    public EMW() {

        this.FIE = new EMV();
        this.FIF = new HashMap();
        Set var1 = ENG.getInstance().HNI();
        Iterator var2 = var1.iterator();

        while (var2.hasNext()) {
            String var3 = (String) var2.next();
            this.FIF.put(var3, new ArrayList());
        }

    }

    public ELV HJR(String var1) throws FFK, FFO {

        ELV var15;
        try {
            synchronized (this.FIF) {
                ELV var3 = this.HKN(var1, false);
                if (var3 != null) {
                    var3.HHK();
                } else {
                    Map var4 = ENG.getInstance().getProcessDefinition(var1);
                    ELZ var5 = (ELZ) var4.get("definition");
                    Class var6 = var5.getProcessImplementationClass();
                    var3 = (ELV) var6.newInstance();
                    var3.setParentDefinition(var5);
                    var3.setModelManager(this.FIE);
                    this.FIF.get(var1).add(var3);
                    var3.HHK();
                }

                var15 = var3;
            }
        } catch (IllegalAccessException | InstantiationException var13) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var13);
            throw new FFK(var13);
        }

        return var15;
    }

    public void HJS(String var1) throws FFK, FFO {

        synchronized (this.FIF) {
            ELV var3 = this.HKN(var1, true);
            var3.HHL();
        }

    }

    public void resetAndCleanUpProcess(String var1) throws FFK, FFO {

        synchronized (this.FIF) {
            ELV var3 = this.HKN(var1, true);
            var3.resetAndCleanUpProcess();
        }

    }

    public EMA getMainStatus(String var1) throws FFK, FFO {

        EMA var4;
        synchronized (this.FIF) {
            ELV var3 = this.HKN(var1, true);
            var4 = var3.getMainStatus();
        }

        return var4;
    }

    private ELV HKN(String var1, boolean var2) throws FFK, FFO {

        ELV var3;
        if (!this.FIF.containsKey(var1)) {
            throw new FFK("Process [" + var1 + "] is not registered!");
        }

        if (this.FIF.get(var1).size() == 0) {
            if (var2) {
                throw new FFK("Process does not exists!");
            }

            var3 = null;
            return var3;
        }

        if (this.FIF.get(var1).size() != 1) {
            throw new FFK("Process has more than one instance!");
        }

        var3 = (ELV) ((List) this.FIF.get(var1)).get(0);

        return var3;
    }
}
