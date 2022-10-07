package a.a.a.c.e.a.b;

import a.a.a.c.e.a.k.a.EXF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EVO {
    private final List<EVV> GPM;

    public EVO() {
        EXF.getInstance().ICO();

        try {
            this.GPM = new ArrayList();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public EVT HZN(boolean var1, String var2) {
        EXF.getInstance().ICO();

        EVT var4;
        try {
            EVT var3 = new EVT(var1, var2);
            this.GPM.add(var3);
            var4 = var3;
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }

    public EVQ HZO(boolean var1, String var2) {
        EXF.getInstance().ICO();

        EVQ var4;
        try {
            EVQ var3 = new EVQ(var1, var2);
            this.GPM.add(var3);
            var4 = var3;
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }

    public EVS HZP(boolean var1, String var2) {
        EXF.getInstance().ICO();

        EVS var4;
        try {
            EVS var3 = new EVS(var1, var2);
            this.GPM.add(var3);
            var4 = var3;
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }

    public void HZQ(String[] var1) {
        EXF.getInstance().ICO();

        try {
            String[] var2 = var1;
            int var3 = var1.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                String var5 = var2[var4];
                if (var5 != null && var5.length() > 0 && var5.contains("=")) {
                    Iterator var6 = this.GPM.iterator();

                    while (var6.hasNext()) {
                        EVV var7 = (EVV) var6.next();
                        if (var7 instanceof EVT) {
                            if (var5.startsWith("-" + var7.getName() + "=")) {
                                EVT var8 = (EVT) var7;
                                var8.setValue(var5.replaceFirst("-" + var7.getName() + "=", ""));
                            }
                        } else {
                            Pattern var9;
                            Matcher var10;
                            String var12;
                            String var13;
                            String var17;
                            if (var7 instanceof EVQ) {
                                var17 = "-" + var7.getName() + "\\[(\\S+)\\]=";
                                var9 = Pattern.compile(var17 + ".*");
                                var10 = var9.matcher(var5);
                                if (var10.matches()) {
                                    EVQ var11 = (EVQ) var7;
                                    var12 = var10.group(1);
                                    var13 = var5.replaceFirst(var17, "");
                                    var11.HZW(var12, var13);
                                }
                            } else if (var7 instanceof EVS) {
                                var17 = "-" + var7.getName() + "\\[(\\S+)\\]=";
                                var9 = Pattern.compile(var17 + ".*");
                                var10 = var9.matcher(var5);
                                if (var10.matches()) {
                                    EVS var18 = (EVS) var7;
                                    var12 = var10.group(1);
                                    var13 = var5.replaceFirst(var17, "");
                                    var18.HZX(var12, var13);
                                }
                            } else {
                                EXF.getInstance().ICA("Invalid attribute type (" + var7.getClass() + ")!");
                            }
                        }
                    }
                } else {
                    EXF.getInstance().ICA("Invalid attribute (" + var5 + ")!");
                }
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public boolean HZR() {
        EXF.getInstance().ICO();

        boolean var7;
        try {
            Iterator var1 = this.GPM.iterator();

            while (var1.hasNext()) {
                EVV var2 = (EVV) var1.next();
                if (var2.HZT() && !var2.HZU()) {
                    boolean var3 = false;
                    return var3;
                }
            }

            var7 = true;
        } finally {
            EXF.getInstance().ICP();
        }

        return var7;
    }

    public EVV getArgument(String var1) {
        EXF.getInstance().ICO();

        EVV var4;
        try {
            Iterator var2 = this.GPM.iterator();

            EVV var3;
            do {
                if (!var2.hasNext()) {
                    return null;
                }

                var3 = (EVV) var2.next();
            } while (!var3.getName().equalsIgnoreCase(var1));

            var4 = var3;
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }

    public String getArgumentsString() {
        EXF.getInstance().ICO();

        String var7;
        try {
            StringBuilder var1 = new StringBuilder();
            Iterator var2 = this.GPM.iterator();

            while (var2.hasNext()) {
                EVV var3 = (EVV) var2.next();
                var1.append(System.lineSeparator()).append(var3.getName()).append(" (").append(var3.HZT() ? "mandatory" : "optional").append(") ").append(var3.HZV());
            }

            var7 = var1.toString();
        } finally {
            EXF.getInstance().ICP();
        }

        return var7;
    }

    public String getUsageString(Class<?> var1) {
        EXF.getInstance().ICO();

        try {
            StringBuilder var2 = new StringBuilder();
            var2.append(System.lineSeparator());
            var2.append(var1.getCanonicalName()).append(System.lineSeparator());
            Iterator var3 = this.GPM.iterator();

            while (var3.hasNext()) {
                EVV var4 = (EVV) var3.next();
                var2.append("-").append(var4.getName()).append("=<").append(var4.getName()).append(">").append(System.lineSeparator());
            }

            String var8 = var2.toString();
            return var8;
        } finally {
            EXF.getInstance().ICP();
        }
    }
}
