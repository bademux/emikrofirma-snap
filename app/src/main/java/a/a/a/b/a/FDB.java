package a.a.a.b.a;

import a.a.a.b.a.a.FDK;
import a.a.a.b.a.a.a.*;
import a.a.a.b.a.a.b.FDJ;
import a.a.a.b.a.a.c.FDN;
import a.a.a.b.a.a.d.*;
import a.a.a.b.a.a.e.FED;
import a.a.a.b.a.a.e.FEE;
import a.a.a.b.a.a.e.FEF;
import a.a.a.b.a.a.e.FEH;
import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.sql.*;
import java.util.Date;
import java.util.*;

@Slf4j
public class FDB {
    public static final String QHF = "_purg";
    public static final FDR QHG;
    public static final FDR QHH;

    public FDB() {
    }

    public static Connection IIG(File var0, String var1) throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");
        if (!var0.isDirectory()) {
            throw new RuntimeException("Path [" + var0 + "] is not a directory!");
        }

        return DriverManager.getConnection("jdbc:sqlite:" + var0.getAbsolutePath() + "/" + var1);
    }

    public static void IIH(Connection var0, FDD var1) throws SQLException {

        PreparedStatement var2 = null;

        try {
            StringBuilder var3 = new StringBuilder();
            var3.append("CREATE ");
            if (var1.IJE()) {
                var3.append("TEMPORARY ");
            }

            var3.append("TABLE ");
            if (!var1.IJF()) {
                var3.append("IF NOT EXISTS ");
            }

            if (var1.getSchema() != null && var1.getSchema().length() > 0) {
                var3.append(var1.getSchema()).append(".");
            }

            var3.append(var1.getName());
            var3.append(" (");
            boolean var4 = true;
            Iterator var5 = var1.getColumns().iterator();

            while (var5.hasNext()) {
                FDW var6 = (FDW) var5.next();
                if (var4) {
                    var4 = false;
                } else {
                    var3.append(", ");
                }

                var3.append(var6.getName());
                var3.append(" ");
                var3.append(var6.getType().name());
                var3.append(" ");
                if (var6.IJX()) {
                    var3.append("UNIQUE ");
                }

                if (!var6.IJW()) {
                    var3.append("NOT NULL ");
                }

                if (var6.IJY()) {
                    var3.append("DEFAULT ");
                    var3.append(var6.getDefault_());
                    var3.append(" ");
                }
            }

            var5 = var1.getConstraints().iterator();

            while (true) {
                while (var5.hasNext()) {
                    FEF var16 = (FEF) var5.next();
                    boolean var7;
                    StringBuilder var9;
                    Iterator var10;
                    String var11;
                    switch (var16.getConstraintType()) {
                        case UNIQUE:
                        case PRIMARY:
                            var7 = true;
                            FEH var17 = (FEH) var16;
                            var9 = new StringBuilder();
                            var9.append(var16.getConstraintType().getKeyWord());
                            var9.append(" (");
                            var10 = var17.getColumns().iterator();

                            for (; var10.hasNext(); var9.append(var11)) {
                                var11 = (String) var10.next();
                                if (var7) {
                                    var7 = false;
                                } else {
                                    var9.append(", ");
                                }
                            }

                            var9.append(")");
                            if (var4) {
                                var4 = false;
                            } else {
                                var3.append(", ");
                            }

                            var3.append(var9);
                            break;
                        case FOREIGN:
                            var7 = true;
                            FED var8 = (FED) var16;
                            var9 = new StringBuilder();
                            var9.append(var16.getConstraintType().getKeyWord());
                            var9.append(" (");

                            for (var10 = var8.getColumns().iterator(); var10.hasNext(); var9.append(var11)) {
                                var11 = (String) var10.next();
                                if (var7) {
                                    var7 = false;
                                } else {
                                    var9.append(", ");
                                }
                            }

                            var9.append(") REFERENCES ");
                            var9.append(var8.getRefTableName());
                            var9.append(" (");
                            var7 = true;

                            for (var10 = var8.getRefColumns().iterator(); var10.hasNext(); var9.append(var11)) {
                                var11 = (String) var10.next();
                                if (var7) {
                                    var7 = false;
                                } else {
                                    var9.append(", ");
                                }
                            }

                            var9.append(")");
                            if (var4) {
                                var4 = false;
                            } else {
                                var3.append(", ");
                            }

                            var3.append(var9);
                    }
                }

                var3.append(") ");
                var2 = var0.prepareStatement(var3.toString());
                int var15 = var2.executeUpdate();
                log.debug("result " + var15);
                return;
            }
        } finally {
            if (var2 != null) {
                var2.close();
            }

        }
    }

    public static void QIO(Connection var0, FDD var1) throws SQLException {

        QIP(var0, var1, false);

    }

    public static void QIP(Connection var0, FDD var1, boolean var2) throws SQLException {

        PreparedStatement var3 = null;

        try {
            FDD var4 = null;
            if (!var2) {
                var4 = var1.IJG(var1.getName() + QHF);
                var4.getColumns().add(new FDW(QHG, true, false));
                var4.getColumns().add(new FDW(QHH, true, false));
            } else {
                var4 = var1;
            }

            StringBuilder var5 = new StringBuilder();
            var5.append("CREATE ");
            var5.append("TABLE ");
            if (!var4.IJF()) {
                var5.append("IF NOT EXISTS ");
            }

            if (var4.getSchema() != null && var4.getSchema().length() > 0) {
                var5.append(var4.getSchema()).append(".");
            }

            var5.append(var4.getName());
            var5.append(" (");
            boolean var6 = true;
            Iterator var7 = var4.getColumns().iterator();

            while (var7.hasNext()) {
                FDW var8 = (FDW) var7.next();
                if (var6) {
                    var6 = false;
                } else {
                    var5.append(", ");
                }

                var5.append(var8.getName());
                var5.append(" ");
                var5.append(var8.getType().name());
                var5.append(" ");
            }

            var5.append(") ");
            var3 = var0.prepareStatement(var5.toString());
            int var12 = var3.executeUpdate();
            log.debug("result " + var12);
        } finally {
            if (var3 != null) {
                var3.close();
            }

        }

    }

    public static boolean III(Connection var0, String var1, String var2) throws SQLException {

        boolean var19;
        Object var3 = null;
        Object var4 = null;
        DatabaseMetaData var5 = var0.getMetaData();
        ResultSet var6 = var5.getIndexInfo((String) var3, (String) var4, var1, true, false);
        HashMap var7 = new HashMap();

        while (var6.next()) {
            String var8 = var6.getString("TABLE_NAME");
            String var9 = var6.getString("INDEX_NAME");
            Integer var10 = var6.getInt("ORDINAL_POSITION");
            String var11 = var6.getString("COLUMN_NAME");
            if (!var7.containsKey(var8)) {
                var7.put(var8, new HashMap());
            }

            Map var12 = (Map) var7.get(var8);
            if (!var12.containsKey(var9)) {
                var12.put(var9, new HashMap());
            }

            Map var13 = (Map) var12.get(var9);
            var13.put(var10, var11);
        }

        Iterator var18 = var7.entrySet().iterator();

        label128:
        while (var18.hasNext()) {
            Map.Entry var20 = (Map.Entry) var18.next();
            Iterator var21 = ((Map) var20.getValue()).entrySet().iterator();

            while (true) {
                Map.Entry var22;
                do {
                    if (!var21.hasNext()) {
                        continue label128;
                    }

                    var22 = (Map.Entry) var21.next();
                } while (((Map) var22.getValue()).entrySet().size() != 1);

                Iterator var23 = ((Map) var22.getValue()).entrySet().iterator();

                while (var23.hasNext()) {
                    Map.Entry var24 = (Map.Entry) var23.next();
                    if (var24.getValue().equals(var2)) {
                        boolean var14 = true;
                        return var14;
                    }
                }
            }
        }

        var19 = false;

        return var19;
    }

    public static void IIJ(Connection var0, FDD var1) throws SQLException {

        HashSet var2 = new HashSet();
        HashMap var3 = new HashMap();
        Iterator var4 = var1.getColumns().iterator();

        while (var4.hasNext()) {
            FDW var5 = (FDW) var4.next();
            var3.put(new FDR(var5), new EVZ(false, var5));
        }

        DatabaseMetaData var71 = var0.getMetaData();
        ResultSet var72 = var71.getColumns(null, var1.getSchema(), var1.getName(), null);

        while (true) {
            String var7;
            while (var72.next()) {
                String var6 = var72.getString("COLUMN_NAME");
                var7 = var72.getString("TYPE_NAME");
                short var8 = var72.getShort("NULLABLE");
                boolean var9 = true;
                if (1 == var8) {
                    var9 = true;
                } else if (0 == var8) {
                    var9 = false;
                } else {
                    log.warn("COLUMN NULLABLE UNKNOWN");
                }

                FDV var10 = FDV.valueOf(var7);
                boolean var11 = III(var0, var1.getName(), var6);
                FDR var12 = new FDR(var6, var10);
                if (var3.containsKey(var12) && ((FDW) ((EVZ) var3.get(var12)).getSecondValue()).IJW() == var9 && ((FDW) ((EVZ) var3.get(var12)).getSecondValue()).IJX() == var11) {
                    ((EVZ) var3.get(var12)).setFirstValue(true);
                } else {
                    var2.add(var12);
                }
            }

            boolean var73 = var2.isEmpty();
            Iterator var74 = var2.iterator();

            while (var74.hasNext()) {
                FDR var75 = (FDR) var74.next();
                log.info("Table [" + var1.getName() + "] column [" + var75.getName() + "] will be removed.");
            }

            if (var73) {
                var74 = var3.entrySet().iterator();

                while (var74.hasNext()) {
                    Map.Entry var76 = (Map.Entry) var74.next();
                    if (!(Boolean) ((EVZ) var76.getValue()).getFirstValue()) {
                        var73 = false;
                        break;
                    }
                }
            }

            if (!var73) {
                var7 = var1.getAlias();
                String var77 = "";
                String var78 = "";
                if (var7 != null && var7.length() > 0) {
                    var77 = " " + var7;
                    var78 = var7 + ".";
                }

                FDD var79 = var1.IJG(var1.getName() + "_" + System.nanoTime());
                IIH(var0, var79);
                HashSet var80 = new HashSet();
                HashSet var81 = new HashSet();
                StringBuilder var13 = new StringBuilder();
                var13.append("INSERT INTO ");
                if (var79.getSchema() != null && var79.getSchema().length() > 0) {
                    var13.append(var79.getSchema()).append(".");
                }

                var13.append(var79.getName());
                var13.append(" (");
                StringBuilder var14 = new StringBuilder();
                StringBuilder var15 = new StringBuilder();
                boolean var16 = true;
                Iterator var17 = var3.entrySet().iterator();

                while (var17.hasNext()) {
                    Map.Entry var18 = (Map.Entry) var17.next();
                    if ((Boolean) ((EVZ) var18.getValue()).getFirstValue()) {
                        if (var16) {
                            var16 = false;
                        } else {
                            var14.append(", ");
                            var15.append(", ");
                        }

                        var14.append(var78);
                        var14.append(((FDR) var18.getKey()).getName());
                        var15.append(((FDR) var18.getKey()).getName());
                    } else {
                        FDW var19 = (FDW) ((EVZ) var18.getValue()).getSecondValue();
                        if (var19 instanceof FDS var20) {
                            if (var20.getInitScript() != null && var20.getInitScript().length() > 0) {
                                if (var16) {
                                    var16 = false;
                                } else {
                                    var14.append(", ");
                                    var15.append(", ");
                                }

                                var14.append("(");
                                var14.append(var20.getInitScript());
                                var14.append(")");
                                var15.append(((FDR) var18.getKey()).getName());
                            }
                        } else if (var19 instanceof QJR var89) {
                            var80.add(var89);
                            var81.addAll(var89.getContextColumns());
                        }
                    }
                }

                var13.append(var15);
                var13.append(") SELECT ");
                var13.append(var14);
                var13.append(" FROM ");
                var13.append(var1.getName());
                var13.append(var77);
                PreparedStatement var82 = null;

                try {
                    var82 = var0.prepareStatement(var13.toString());
                    int var83 = var82.executeUpdate();
                    log.debug("result " + var83);
                } finally {
                    if (var82 != null) {
                        var82.close();
                    }

                }

                Iterator var21;
                if (!var80.isEmpty()) {
                    FDE var84 = new FDE(var79.getSchema(), var79.getName());
                    ArrayList var86 = new ArrayList();
                    HashSet var90 = new HashSet();
                    var21 = var79.getConstraints().iterator();

                    Iterator var24;
                    label1587:
                    while (var21.hasNext()) {
                        FEF var22 = (FEF) var21.next();
                        if (FEE.class.isAssignableFrom(var22.getClass())) {
                            FEE var23 = (FEE) var22;
                            var24 = var23.getColumns().iterator();

                            while (true) {
                                if (!var24.hasNext()) {
                                    break label1587;
                                }

                                String var25 = (String) var24.next();
                                var90.add(var25);
                                var86.add(new FDX(var25));
                            }
                        }
                    }

                    if (var90.isEmpty()) {
                        throw new FFI("Table [" + var79.getSchema() + "." + var79.getName() + "] has no PK!");
                    }

                    var21 = var81.iterator();

                    while (var21.hasNext()) {
                        FDY var94 = (FDY) var21.next();
                        var86.add(new FDX(var94));
                    }

                    var84.IJI(var86);
                    IIO(var0, var84);
                    var21 = var84.getResults().iterator();

                    while (var21.hasNext()) {
                        Map var95 = (Map) var21.next();
                        ArrayList var97 = new ArrayList();
                        var24 = var95.values().iterator();

                        while (true) {
                            while (var24.hasNext()) {
                                FDU var98 = (FDU) var24.next();
                                Iterator var26 = var90.iterator();

                                while (var26.hasNext()) {
                                    String var27 = (String) var26.next();
                                    if (var27.equals(var98.getName())) {
                                        var97.add(new FDU(var98.getName(), var98.getType(), var98.getValue(), FDK.EQUALS));
                                        break;
                                    }
                                }
                            }

                            var24 = var80.iterator();

                            while (var24.hasNext()) {
                                QJR var99 = (QJR) var24.next();
                                HashSet var100 = new HashSet();
                                var100.addAll(var95.values());
                                Object var101 = var99.getMigration().QNW(var100);
                                FDG var28 = new FDG(var79.getSchema(), var79.getName());
                                var28.IJQ(new FDU[]{new FDU(var99, var101)});
                                var28.IJC(var97);
                                IIM(var0, var28);
                                synchronized (var0) {
                                    var0.commit();
                                }
                            }
                            break;
                        }
                    }
                }

                String var85 = "ALTER TABLE " + var1.getName() + " RENAME TO " + var1.getName() + "_old";

                try {
                    var82 = var0.prepareStatement(var85);
                    int var87 = var82.executeUpdate();
                    log.debug("result " + var87);
                } finally {
                    if (var82 != null) {
                        var82.close();
                    }

                }

                String var88 = "ALTER TABLE " + var79.getName() + " RENAME TO " + var1.getName();

                try {
                    var82 = var0.prepareStatement(var88);
                    int var91 = var82.executeUpdate();
                    log.debug("result " + var91);
                } finally {
                    if (var82 != null) {
                        var82.close();
                    }

                }

                String var92 = "DROP TABLE " + var1.getName() + "_old";

                try {
                    var82 = var0.prepareStatement(var92);
                    int var93 = var82.executeUpdate();
                    log.debug("result " + var93);
                } finally {
                    if (var82 != null) {
                        var82.close();
                    }

                }

                if (!var80.isEmpty()) {
                    var21 = var80.iterator();

                    while (var21.hasNext()) {
                        QJR var96 = (QJR) var21.next();
                        if (var96.getPostAction() != null) {
                            var96.getPostAction().QNX();
                        }
                    }
                }
            }
            break;
        }

    }

    public static void QIQ(Connection var0, FDD var1) throws SQLException {

        FDD var2 = var1.IJG(var1.getName() + QHF);
        var2.getColumns().add(new FDW(QHG, true, false));
        var2.getColumns().add(new FDW(QHH, true, false));
        HashSet var3 = new HashSet();
        HashMap var4 = new HashMap();
        Iterator var5 = var2.getColumns().iterator();

        while (var5.hasNext()) {
            FDW var6 = (FDW) var5.next();
            var4.put(new FDR(var6), new EVZ(false, var6));
        }

        DatabaseMetaData var53 = var0.getMetaData();
        ResultSet var54 = var53.getColumns(null, var2.getSchema(), var2.getName(), null);

        String var8;
        while (var54.next()) {
            String var7 = var54.getString("COLUMN_NAME");
            var8 = var54.getString("TYPE_NAME");
            FDV var9 = FDV.valueOf(var8);
            FDR var10 = new FDR(var7, var9);
            if (var4.containsKey(var10)) {
                ((EVZ) var4.get(var10)).setFirstValue(true);
            } else {
                var3.add(var10);
            }
        }

        boolean var55 = var3.isEmpty();
        Iterator var56 = var3.iterator();

        while (var56.hasNext()) {
            FDR var57 = (FDR) var56.next();
            log.info("Table [" + var2.getName() + "] column [" + var57.getName() + "] will be removed.");
        }

        if (var55) {
            var56 = var4.entrySet().iterator();

            while (var56.hasNext()) {
                Map.Entry var58 = (Map.Entry) var56.next();
                if (!(Boolean) ((EVZ) var58.getValue()).getFirstValue()) {
                    var55 = false;
                    break;
                }
            }
        }

        if (!var55) {
            var8 = var2.getAlias();
            String var59 = "";
            String var60 = "";
            if (var8 != null && var8.length() > 0) {
                var59 = " " + var8;
                var60 = var8 + ".";
            }

            FDD var11 = var2.IJG(var2.getName() + "_" + System.nanoTime());
            QIP(var0, var11, true);
            StringBuilder var12 = new StringBuilder();
            var12.append("INSERT INTO ");
            if (var11.getSchema() != null && var11.getSchema().length() > 0) {
                var12.append(var11.getSchema()).append(".");
            }

            var12.append(var11.getName());
            var12.append(" (");
            StringBuilder var13 = new StringBuilder();
            StringBuilder var14 = new StringBuilder();
            boolean var15 = true;
            Iterator var16 = var4.entrySet().iterator();

            while (var16.hasNext()) {
                Map.Entry var17 = (Map.Entry) var16.next();
                if ((Boolean) ((EVZ) var17.getValue()).getFirstValue()) {
                    if (var15) {
                        var15 = false;
                    } else {
                        var13.append(", ");
                        var14.append(", ");
                    }

                    var13.append(var60);
                    var13.append(((FDR) var17.getKey()).getName());
                    var14.append(((FDR) var17.getKey()).getName());
                }
            }

            var12.append(var14);
            var12.append(") SELECT ");
            var12.append(var13);
            var12.append(" FROM ");
            var12.append(var2.getName());
            var12.append(var59);
            PreparedStatement var61 = null;

            try {
                var61 = var0.prepareStatement(var12.toString());
                int var62 = var61.executeUpdate();
                log.debug("result " + var62);
            } finally {
                if (var61 != null) {
                    var61.close();
                }

            }

            String var63 = "ALTER TABLE " + var2.getName() + " RENAME TO " + var2.getName() + "_old";

            try {
                var61 = var0.prepareStatement(var63);
                int var18 = var61.executeUpdate();
                log.debug("result " + var18);
            } finally {
                if (var61 != null) {
                    var61.close();
                }

            }

            String var64 = "ALTER TABLE " + var11.getName() + " RENAME TO " + var2.getName();

            try {
                var61 = var0.prepareStatement(var64);
                int var19 = var61.executeUpdate();
                log.debug("result " + var19);
            } finally {
                if (var61 != null) {
                    var61.close();
                }

            }

            String var65 = "DROP TABLE " + var2.getName() + "_old";

            try {
                var61 = var0.prepareStatement(var65);
                int var20 = var61.executeUpdate();
                log.debug("result " + var20);
            } finally {
                if (var61 != null) {
                    var61.close();
                }

            }
        }

    }

    public static void QIR(Connection var0, FDD var1, FDR var2, String var3, String var4) throws SQLException {

        DatabaseMetaData var5 = var0.getMetaData();
        ResultSet var6 = var5.getColumns(null, var1.getSchema(), var1.getName(), null);
        HashSet var7 = new HashSet();

        String var8;
        String var9;
        while (var6.next()) {
            var8 = var6.getString("COLUMN_NAME");
            var9 = var6.getString("TYPE_NAME");
            FDV var10 = FDV.valueOf(var9);
            FDR var11 = new FDR(var8, var10);
            var7.add(var11);
        }

        var8 = "src";
        var9 = " " + var8;
        String var32 = var8 + ".";
        StringBuilder var33 = new StringBuilder();
        var33.append("INSERT INTO ");
        if (var1.getSchema() != null && var1.getSchema().length() > 0) {
            var33.append(var1.getSchema()).append(".");
        }

        var33.append(var1.getName() + QHF);
        var33.append(" (");
        StringBuilder var12 = new StringBuilder();
        StringBuilder var13 = new StringBuilder();
        boolean var14 = true;
        Iterator var15 = var7.iterator();

        while (var15.hasNext()) {
            FDR var16 = (FDR) var15.next();
            if (var14) {
                var14 = false;
            } else {
                var12.append(", ");
                var13.append(", ");
            }

            var12.append(var32);
            var12.append(var16.getName());
            var13.append(var16.getName());
        }

        if (!var14) {
            var12.append(", ");
            var13.append(", ");
        }

        var12.append("?, ?");
        var13.append(QHG.getName());
        var13.append(", ");
        var13.append(QHH.getName());
        var33.append(var13);
        var33.append(") SELECT ");
        var33.append(var12);
        var33.append(" FROM ");
        var33.append(var1.getName());
        var33.append(var9);
        var33.append(" WHERE ");
        var33.append(var2.getName());
        var33.append(" = ? ");
        PreparedStatement var34 = null;

        try {
            var34 = var0.prepareStatement(var33.toString());
            var34.setObject(1, new Date(), QHG.getType().getSqlType());
            var34.setObject(2, var4, QHH.getType().getSqlType());
            var34.setObject(3, var3, var2.getType().getSqlType());
            int var35 = var34.executeUpdate();
            log.debug("result " + var35);
        } finally {
            if (var34 != null) {
                var34.close();
            }

        }

        StringBuilder var36 = new StringBuilder();
        var36.append("DELETE FROM ");
        var36.append(var1.getName());
        var36.append(" WHERE ");
        var36.append(var2.getName());
        var36.append(" = ? ");

        try {
            var34 = var0.prepareStatement(var36.toString());
            var34.setObject(1, var3, var2.getType().getSqlType());
            int var17 = var34.executeUpdate();
            log.debug("result " + var17);
        } finally {
            if (var34 != null) {
                var34.close();
            }

        }

    }

    public static void IIK(Connection var0, FDN var1) throws SQLException {

        PreparedStatement var2 = null;

        try {
            StringBuilder var3 = new StringBuilder();
            var3.append("CREATE ");
            if (var1.IJT()) {
                var3.append("TEMPORARY ");
            }

            var3.append("VIEW ");
            if (!var1.IJU()) {
                var3.append("IF NOT EXISTS ");
            }

            if (var1.getSchema() != null && var1.getSchema().length() > 0) {
                var3.append(var1.getSchema()).append(".");
            }

            var3.append(var1.getName());
            var3.append(" ");
            if (var1.getColumns().size() > 0) {
                var3.append("(");
                boolean var4 = true;
                Iterator var5 = var1.getColumns().iterator();

                while (var5.hasNext()) {
                    FDY var6 = (FDY) var5.next();
                    if (var4) {
                        var4 = false;
                    } else {
                        var3.append(", ");
                    }

                    var3.append(var6.getName());
                    var3.append(" ");
                }

                var3.append(") ");
            }

            var3.append("as ");
            var3.append(var1.getDefinition());
            var2 = var0.prepareStatement(var3.toString());
            int var10 = var2.executeUpdate();
            log.debug("result " + var10);
        } finally {
            if (var2 != null) {
                var2.close();
            }

        }

    }

    public static void IIL(Connection var0, FDF var1) throws SQLException {

        String var2 = IIS(var1);
        Iterator var3 = var1.getValues().iterator();

        while (var3.hasNext()) {
            Map var4 = (Map) var3.next();
            PreparedStatement var5 = null;

            try {
                var5 = var0.prepareStatement(var2);
                IIX(var5, var1.getParameters(), var4);
                int var6 = var5.executeUpdate();
                log.debug("result " + var6);
            } finally {
                if (var5 != null) {
                    var5.close();
                }

            }
        }

    }

    public static void IIM(Connection var0, FDG var1) throws SQLException {

        PreparedStatement var2 = null;

        try {
            String var4 = IIQ(var1) +
                    IIT(var1);
            var2 = var0.prepareStatement(var4);
            int var5 = IIX(var2, var1.getValues(), var1.getValues());
            IIY(var5, var2, var1);
            int var6 = var2.executeUpdate();
            log.debug("result " + var6);
        } finally {
            if (var2 != null) {
                var2.close();
            }

        }

    }

    public static void IIN(Connection var0, FDC var1) throws SQLException {

        PreparedStatement var2 = null;

        try {
            String var4 = IIR(var1) +
                    IIT(var1);
            var2 = var0.prepareStatement(var4);
            IIY(0, var2, var1);
            int var5 = var2.executeUpdate();
            log.debug("result " + var5);
        } finally {
            if (var2 != null) {
                var2.close();
            }

        }

    }

    public static void IIO(Connection var0, FDE... var1) throws SQLException {

        IIO(var0, null, null, var1);

    }

    public static void IIO(Connection var0, Integer var1, Integer var2, FDE... var3) throws SQLException {

        PreparedStatement var4 = null;
        ResultSet var5 = null;

        try {
            String var7 = IIP(var3) +
                    IIT(var3) +
                    IIU(var3) +
                    IIV(var1, var2);
            var4 = var0.prepareStatement(var7);
            IIY(0, var4, var3);
            var5 = var4.executeQuery();
            IIZ(var5, var3);
        } finally {
            if (var5 != null) {
                var5.close();
            }

            if (var4 != null) {
                var4.close();
            }

        }

    }

    private static String IIP(FDE... var0) {

        String var18;
        StringBuilder var1 = new StringBuilder();
        var1.append("SELECT ");
        StringBuilder var2 = new StringBuilder();
        var2.append(" FROM ");
        boolean var3 = true;
        boolean var4 = true;
        FDE[] var5 = var0;
        int var6 = var0.length;

        for (int var7 = 0; var7 < var6; ++var7) {
            FDE var8 = var5[var7];
            String var9 = var8.getAlias();
            String var10 = "";
            String var11 = "";
            if (var9 != null && var9.length() > 0) {
                var10 = " " + var9;
                var11 = var9 + ".";
            }

            if (var0.length == 1 && var8.getParameters().isEmpty()) {
                log.debug("Query for all columns.");
                var8.IJH(new FDX("*"));
            }

            Iterator var12 = var8.getParameters().iterator();

            while (var12.hasNext()) {
                FDX var13 = (FDX) var12.next();
                if (var3) {
                    var3 = false;
                } else {
                    var1.append(", ");
                }

                switch (var13.getAggregateType()) {
                    case MAX:
                    case MIN:
                    case SUM:
                    case COUNT:
                    case COALESCE_0_MAX_PLUS_1:
                        var1.append(var13.getAggregateType().getPrefix());
                    case NONE:
                    default:
                        var1.append(var11);
                        var1.append(var13.getName());
                        switch (var13.getAggregateType()) {
                            case MAX:
                            case MIN:
                            case SUM:
                            case COUNT:
                            case COALESCE_0_MAX_PLUS_1:
                                var1.append(var13.getAggregateType().getSuffix());
                            case NONE:
                            default:
                                if (var13.getAlias() != null && var13.getAlias().length() > 0) {
                                    var1.append(" ");
                                    var1.append(var13.getAlias());
                                }
                        }
                }
            }

            boolean var19 = false;
            if (var4) {
                var4 = false;
                if (var8.getJoins() != null) {
                    throw new RuntimeException("First select cannot be a join!");
                }
            } else if (var8.getJoins() != null) {
                var19 = true;
                var2.append(" ");
                var2.append(var8.getJoins().getFirstValue());
                var2.append(" ");
            } else {
                var2.append(", ");
            }

            if (var8.getSchema() != null && var8.getSchema().length() > 0) {
                var2.append(var8.getSchema()).append(".");
            }

            var2.append(var8.getName());
            var2.append(var10);
            if (var19) {
                var2.append(IIW(var8));
            }
        }

        String var17 = var1.toString() + var2;
        log.debug("result " + var17);
        var18 = var17;

        return var18;
    }

    private static String IIQ(FDG var0) {

        String var1 = var0.getAlias();
        String var2 = "";
        String var3 = "";
        if (var1 != null && var1.length() > 0) {
            var2 = " " + var1;
            var3 = var1 + ".";
        }

        StringBuilder var4 = new StringBuilder();
        var4.append("UPDATE ");
        if (var0.getSchema() != null && var0.getSchema().length() > 0) {
            var4.append(var0.getSchema()).append(".");
        }

        var4.append(var0.getName());
        var4.append(var2);
        var4.append(" set ");
        boolean var5 = true;
        Iterator var6 = var0.getValues().iterator();

        while (var6.hasNext()) {
            FDU var7 = (FDU) var6.next();
            if (var5) {
                var5 = false;
            } else {
                var4.append(", ");
            }

            var4.append(var3);
            var4.append(var7.getName());
            var4.append(" = ?");
        }

        String var11 = var4.toString();
        log.debug("result " + var11);
        String var12 = var11;
        return var12;
    }

    private static String IIR(FDC var0) {

        String var5;
        String var1 = var0.getAlias();
        String var2 = "";
        if (var1 != null && var1.length() > 0) {
            var2 = " " + var1;
        }

        StringBuilder var3 = new StringBuilder();
        var3.append("DELETE FROM ");
        if (var0.getSchema() != null && var0.getSchema().length() > 0) {
            var3.append(var0.getSchema()).append(".");
        }

        var3.append(var0.getName());
        var3.append(var2);
        String var4 = var3.toString();
        log.debug("result " + var4);
        var5 = var4;

        return var5;
    }

    private static String IIS(FDF var0) {

        String var13;
        String var1 = var0.getAlias();
        String var2 = "";
        String var3 = "";
        if (var1 != null && var1.length() > 0) {
            var2 = " " + var1;
            var3 = var1 + ".";
        }

        StringBuilder var4 = new StringBuilder();
        var4.append("INSERT INTO ");
        if (var0.getSchema() != null && var0.getSchema().length() > 0) {
            var4.append(var0.getSchema()).append(".");
        }

        var4.append(var0.getName());
        var4.append(var2);
        var4.append(" (");
        boolean var5 = true;
        Iterator var6 = var0.getParameters().iterator();

        while (var6.hasNext()) {
            FDY var7 = (FDY) var6.next();
            if (var5) {
                var5 = false;
            } else {
                var4.append(", ");
            }

            var4.append(var3);
            var4.append(var7.getName());
        }

        var4.append(") VALUES (");
        var5 = true;

        for (int var11 = 0; var11 < var0.getParameters().size(); ++var11) {
            if (var5) {
                var5 = false;
            } else {
                var4.append(", ");
            }

            var4.append("?");
        }

        var4.append(") ");
        String var12 = var4.toString();
        log.debug("result " + var12);
        var13 = var12;

        return var13;
    }

    private static String IIT(FDI... var0) {

        String var17;
        StringBuilder var1 = new StringBuilder();
        var1.append(" WHERE ");
        var1.append("1=1");
        FDI[] var2 = var0;
        int var3 = var0.length;

        label186:
        for (int var4 = 0; var4 < var3; ++var4) {
            FDI var5 = var2[var4];
            String var6 = var5.getAlias();
            String var7 = "";
            if (var6 != null && var6.length() > 0) {
                var7 = var6 + ".";
            }

            Iterator var8 = var5.getKeys().iterator();

            while (var8.hasNext()) {
                FDP var9 = (FDP) var8.next();
                var1.append(" and ");
                var1.append(var7);
                var1.append(var9.getName());
                if (var9 instanceof FDU var10) {
                    if (var10.getValue() != null) {
                        var1.append(var9.getCondition().getSqlRepresentation());
                        var1.append("?");
                    } else {
                        var1.append(" is null");
                    }
                } else {
                    if (!(var9 instanceof FDT var19)) {
                        throw new RuntimeException("Unexcpected type of cell [" + var9.getClass() + "]!");
                    }

                    if (var19.getRefCell() != null) {
                        String var11 = var19.getRefTable().getAlias();
                        String var12 = "";
                        if (var11 != null && var11.length() > 0) {
                            var12 = var11 + ".";
                        }

                        var1.append(var9.getCondition().getSqlRepresentation());
                        var1.append(var12);
                        var1.append(var19.getRefCell().getName());
                    } else {
                        var1.append(" is null");
                    }
                }
            }

            var8 = var5.getExpressions().iterator();

            while (true) {
                FDJ var18;
                do {
                    do {
                        if (!var8.hasNext()) {
                            continue label186;
                        }

                        var18 = (FDJ) var8.next();
                    } while (var18.getKeys() == null);
                } while (var18.getKeys().size() <= 0);

                var1.append(" and (");
                boolean var20 = true;
                Iterator var21 = var18.getKeys().iterator();

                while (var21.hasNext()) {
                    FDU var22 = (FDU) var21.next();
                    if (var20) {
                        var20 = false;
                    } else {
                        var1.append(" ");
                        var1.append(var18.getOperator());
                        var1.append(" ");
                    }

                    var1.append(var7);
                    var1.append(var22.getName());
                    if (var22.getValue() != null) {
                        var1.append(var22.getCondition().getSqlRepresentation());
                        var1.append("?");
                    } else {
                        var1.append(" is null");
                    }
                }

                var1.append(")");
            }
        }

        String var16 = var1.toString();
        log.debug("result " + var16);
        var17 = var16;

        return var17;
    }

    private static String IIU(FDE... var0) {

        String var16;
        StringBuilder var1 = new StringBuilder();
        var1.append(" ORDER BY ");
        boolean var2 = true;
        FDE[] var4 = var0;
        int var5 = var0.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            FDE var7 = var4[var6];
            String var8 = var7.getAlias();
            String var9 = "";
            if (var8 != null && var8.length() > 0) {
                var9 = var8 + ".";
            }

            Iterator var10 = var7.getOrder().iterator();

            while (var10.hasNext()) {
                FEA var11 = (FEA) var10.next();
                String var3;
                if (var2) {
                    var2 = false;
                    var3 = "";
                } else {
                    var3 = ", ";
                }

                var1.append(var3);
                var1.append(var9);
                var1.append(var11.getName());
                var1.append(" ");
                var1.append(var11.getOrderType().getKeyWord());
            }
        }

        var4 = null;
        String var15;
        if (var2) {
            var15 = "";
        } else {
            var15 = var1.toString();
        }

        log.debug("result " + var15);
        var16 = var15;

        return var16;
    }

    private static String IIV(Integer var0, Integer var1) {

        String var4;
        String var2 = null;
        StringBuilder var3 = new StringBuilder();
        var3.append(" LIMIT ");
        if (var0 != null) {
            if (var1 != null) {
                var3.append(var1);
            } else {
                var3.append(0);
            }

            var3.append(", ");
            var3.append(var0);
            var2 = var3.toString();
        } else {
            var2 = "";
        }

        log.debug("result " + var2);
        var4 = var2;

        return var4;
    }

    private static String IIW(FDE var0) {

        StringBuilder var1 = new StringBuilder();
        var1.append(" ON ");
        var1.append("1=1");
        String var2 = var0.getAlias();
        String var3 = "";
        if (var2 != null && var2.length() > 0) {
            var3 = var2 + ".";
        }

        Iterator var4 = ((Set) var0.getJoins().getSecondValue()).iterator();

        while (var4.hasNext()) {
            FDT var5 = (FDT) var4.next();
            var1.append(" and ");
            var1.append(var3);
            var1.append(var5.getName());
            if (var5.getRefCell() != null) {
                String var6 = var5.getRefTable().getAlias();
                String var7 = "";
                if (var6 != null && var6.length() > 0) {
                    var7 = var6 + ".";
                }

                var1.append(var5.getCondition().getSqlRepresentation());
                var1.append(var7);
                var1.append(var5.getRefCell().getName());
            } else {
                var1.append(" is null");
            }
        }

        String var11 = var1.toString();
        log.debug("result " + var11);
        String var12 = var11;
        return var12;
    }

    private static Integer IIX(PreparedStatement var0, List<? extends FDY> var1, List<FDU<?>> var2) throws SQLException {

        HashMap var3 = new HashMap();
        Iterator var4 = var2.iterator();

        while (var4.hasNext()) {
            FDU var5 = (FDU) var4.next();
            var3.put(var5.getName(), var5);
        }

        Integer var9 = IIX(var0, var1, var3);
        return var9;
    }

    private static Integer IIX(PreparedStatement var0, List<? extends FDY> var1, Map<String, FDU<?>> var2) throws SQLException {

        int var3 = 0;
        Iterator var4 = var1.iterator();

        while (var4.hasNext()) {
            FDY var5 = (FDY) var4.next();
            FDU var6 = var2.get(var5.getName());
            ++var3;
            Object var7 = var6.getValue();
            FDV var8 = var6.getType();
            if (var7 != null) {
                var0.setObject(var3, var7, var8.getSqlType());
            } else {
                var0.setNull(var3, var8.getSqlType());
            }
        }

        Integer var12 = var3;
        return var12;
    }

    private static Integer IIY(int var0, PreparedStatement var1, FDI... var2) throws SQLException {

        if (var0 < 0) {
            throw new RuntimeException("Start index cannot be less than 0!");
        } else {
            int var3 = var0;
            FDI[] var4 = var2;
            int var5 = var2.length;
            int var6 = 0;

            label139:
            while (var6 < var5) {
                FDI var7 = var4[var6];
                Iterator var8 = var7.getKeys().iterator();

                while (var8.hasNext()) {
                    FDR var9 = (FDR) var8.next();
                    if (var9 instanceof FDU var10) {
                        Object var11 = var10.getValue();
                        FDV var12 = var9.getType();
                        if (var11 != null) {
                            ++var3;
                            var1.setObject(var3, var11, var12.getSqlType());
                        }
                    } else {
                        if (!(var9 instanceof FDT)) {
                            throw new RuntimeException("Unexcpected type of cell [" + var9.getClass() + "]!");
                        }

                        log.warn("Skipped cell [" + var9.getClass() + "]");
                    }
                }

                var8 = var7.getExpressions().iterator();

                while (true) {
                    FDJ var18;
                    do {
                        do {
                            if (!var8.hasNext()) {
                                ++var6;
                                continue label139;
                            }

                            var18 = (FDJ) var8.next();
                        } while (var18.getKeys() == null);
                    } while (var18.getKeys().size() <= 0);

                    Iterator var19 = var18.getKeys().iterator();

                    while (var19.hasNext()) {
                        FDU var20 = (FDU) var19.next();
                        Object var21 = var20.getValue();
                        FDV var13 = var20.getType();
                        if (var21 != null) {
                            ++var3;
                            var1.setObject(var3, var21, var13.getSqlType());
                        }
                    }
                }
            }

            Integer var17 = var3;
            return var17;
        }
    }

    private static void IIZ(ResultSet var0, FDE... var1) throws SQLException {

        while (var0.next()) {
            FDE[] var2 = var1;
            int var3 = var1.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                FDE var5 = var2[var4];
                HashMap var6 = new HashMap();

                for (int var7 = 1; var7 <= var0.getMetaData().getColumnCount(); ++var7) {
                    int var8 = var0.getMetaData().getColumnType(var7);
                    FDV var9 = FDV.getCellDataTypeType(var8);
                    String var10 = var0.getMetaData().getColumnName(var7);
                    String var11 = var0.getMetaData().getColumnLabel(var7);
                    Object var12 = var0.getObject(var7);
                    if (var0.wasNull()) {
                        var12 = null;
                    }

                    var6.put(var11, new FDU(var10, var9, var12));
                }

                var5.getResults().add(var6);
            }
        }

    }

    static {
        QHG = new FDR("audit_ts", FDV.TIMESTAMP);
        QHH = new FDR("audit_reason", FDV.TEXT);
    }
}
