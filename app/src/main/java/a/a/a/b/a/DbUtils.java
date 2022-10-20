package a.a.a.b.a;

import a.a.a.b.a.a.Condition;
import a.a.a.b.a.a.a.*;
import a.a.a.b.a.a.b.Expression;
import a.a.a.b.a.a.c.ViewDef;
import a.a.a.b.a.a.d.*;
import a.a.a.b.a.a.e.ConstraintFOREIGNDef;
import a.a.a.b.a.a.e.ConstraintPRIMARYDef;
import a.a.a.b.a.a.e.ConstraintDef;
import a.a.a.b.a.a.e.ConstraintBase;
import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.sql.*;
import java.util.Date;
import java.util.*;

@Slf4j
public class DbUtils {
    public static final String PURGE_PREFIX = "_purg";

    public static final CellTyped auditTsCell = new CellTyped("audit_ts", CellType.TIMESTAMP);
    public static final CellTyped auditReasonCell = new CellTyped("audit_reason", CellType.TEXT);
    public static final String DB_FILE_EXT = ".db";

    public static Connection getConnection(File baseDir, String dbName) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        assert baseDir.isDirectory() : "Path [" + baseDir + "] is not a directory!";
        return DriverManager.getConnection("jdbc:sqlite:%s/%s".formatted(baseDir.getAbsolutePath(), dbName));
    }

    public static void IIH(Connection var0, TableDef var1) throws SQLException {

        PreparedStatement var2 = null;

        try {
            StringBuilder var3 = new StringBuilder();
            var3.append("CREATE ");
            if (var1.isTemporary()) {
                var3.append("TEMPORARY ");
            }

            var3.append("TABLE ");
            if (!var1.isFailOnExisting()) {
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
                CellDef var6 = (CellDef) var5.next();
                if (var4) {
                    var4 = false;
                } else {
                    var3.append(", ");
                }

                var3.append(var6.getName());
                var3.append(" ");
                var3.append(var6.getType().name());
                var3.append(" ");
                if (var6.isUnique()) {
                    var3.append("UNIQUE ");
                }

                if (!var6.isNullable()) {
                    var3.append("NOT NULL ");
                }

                if (var6.hasDefault()) {
                    var3.append("DEFAULT ");
                    var3.append(var6.getDefault_());
                    var3.append(" ");
                }
            }

            var5 = var1.getConstraints().iterator();

            while (true) {
                while (var5.hasNext()) {
                    ConstraintDef var16 = (ConstraintDef) var5.next();
                    boolean var7;
                    StringBuilder var9;
                    Iterator var10;
                    String var11;
                    switch (var16.getConstraintType()) {
                        case UNIQUE:
                        case PRIMARY:
                            var7 = true;
                            ConstraintBase var17 = (ConstraintBase) var16;
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
                            ConstraintFOREIGNDef var8 = (ConstraintFOREIGNDef) var16;
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

    public static void createTable(Connection var0, TableDef v) throws SQLException {
        createTable(var0, v, false);

    }

    public static void createTable(Connection var0, TableDef tableDef, boolean shouldBackup) throws SQLException {

        PreparedStatement var3 = null;

        try {
            TableDef def = null;
            if (shouldBackup) {
                def = tableDef;
            } else {
                def = tableDef.createFor(tableDef.getName() + PURGE_PREFIX);
                def.getColumns().add(new CellDef(auditTsCell, true, false));
                def.getColumns().add(new CellDef(auditReasonCell, true, false));
            }

            StringBuilder var5 = new StringBuilder();
            var5.append("CREATE ");
            var5.append("TABLE ");
            if (!def.isFailOnExisting()) {
                var5.append("IF NOT EXISTS ");
            }

            if (def.getSchema() != null && def.getSchema().length() > 0) {
                var5.append(def.getSchema()).append(".");
            }

            var5.append(def.getName());
            var5.append(" (");
            boolean var6 = true;
            Iterator var7 = def.getColumns().iterator();

            while (var7.hasNext()) {
                CellDef var8 = (CellDef) var7.next();
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

    public static boolean isUnique(Connection connection, String tableName, String columnName) throws SQLException {

        ResultSet var6 = connection.getMetaData().getIndexInfo(null, null, tableName, true, false);
        var tables = new HashMap<String, Map<String, Map<Integer, String>>>();

        while (var6.next()) {
            String tName = var6.getString("TABLE_NAME");
            String indexName = var6.getString("INDEX_NAME");
            Integer ordinalPosition = var6.getInt("ORDINAL_POSITION");
            String cName = var6.getString("COLUMN_NAME");
            if (!tables.containsKey(tName)) {
                tables.put(tName, new HashMap());
            }

            var indices = tables.get(tName);
            if (!indices.containsKey(indexName)) {
                indices.put(indexName, new HashMap());
            }

            var ordinals = indices.get(indexName);
            ordinals.put(ordinalPosition, cName);
        }

        var it = tables.entrySet().iterator();

        label128:
        while (it.hasNext()) {
            var var21 = it.next().getValue().entrySet().iterator();
            while (true) {
                Map.Entry<String, Map<Integer, String>> entry;
                do {
                    if (!var21.hasNext()) {
                        continue label128;
                    }

                    entry = var21.next();
                } while (((Map) entry.getValue()).entrySet().size() != 1);

                var var23 = entry.getValue().entrySet().iterator();

                while (var23.hasNext()) {
                    if (var23.next().getValue().equals(columnName)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void IIJ(Connection connection, TableDef tableDef) throws SQLException {

        var columnsToBeRemoved = new HashSet<CellTyped>();
        var resut = prepareCellTypes(tableDef);

        ResultSet metaDataResult = connection.getMetaData().getColumns(null, tableDef.getSchema(), tableDef.getName(), null);

        while (true) {

            while (metaDataResult.next()) {
                String columnName = metaDataResult.getString("COLUMN_NAME");
                boolean isNullable = getNullable(metaDataResult);

                CellType cellType = CellType.valueOf(metaDataResult.getString("TYPE_NAME"));
                CellTyped cellTyped = new CellTyped(columnName, cellType);
                boolean isUnique = isUnique(connection, tableDef.getName(), columnName);
                var twoValueBox = resut.get(cellTyped);
                if (twoValueBox != null && twoValueBox.getSecondValue().isNullable() == isNullable && twoValueBox.getSecondValue().isUnique() == isUnique) {
                    twoValueBox.setFirstValue(true);
                } else {
                    columnsToBeRemoved.add(cellTyped);
                }
            }

            logToBeRemoved(tableDef, columnsToBeRemoved);


            boolean hasColumns = columnsToBeRemoved.isEmpty();
            if (hasColumns) {
                Iterator var74 = resut.entrySet().iterator();

                while (var74.hasNext()) {
                    Map.Entry var76 = (Map.Entry) var74.next();
                    if (!(Boolean) ((ValueContainer2) var76.getValue()).getFirstValue()) {
                        hasColumns = false;
                        break;
                    }
                }
            }

            if (!hasColumns) {
                String columnType = tableDef.getAlias();
                String var77 = "";
                String var78 = "";
                if (columnType != null && columnType.length() > 0) {
                    var77 = " " + columnType;
                    var78 = columnType + ".";
                }

                TableDef tmpTableDef = tableDef.createFor(tableDef.getName() + "_" + System.nanoTime());
                IIH(connection, tmpTableDef);
                HashSet var80 = new HashSet();
                HashSet var81 = new HashSet();
                StringBuilder insertInto = new StringBuilder();
                insertInto.append("INSERT INTO ");
                if (tmpTableDef.getSchema() != null && tmpTableDef.getSchema().length() > 0) {
                    insertInto.append(tmpTableDef.getSchema()).append(".");
                }

                insertInto.append(tmpTableDef.getName());
                insertInto.append(" (");
                StringBuilder var14 = new StringBuilder();
                StringBuilder var15 = new StringBuilder();
                boolean var16 = true;
                Iterator var17 = resut.entrySet().iterator();

                while (var17.hasNext()) {
                    Map.Entry var18 = (Map.Entry) var17.next();
                    if ((Boolean) ((ValueContainer2) var18.getValue()).getFirstValue()) {
                        if (var16) {
                            var16 = false;
                        } else {
                            var14.append(", ");
                            var15.append(", ");
                        }

                        var14.append(var78);
                        var14.append(((CellTyped) var18.getKey()).getName());
                        var15.append(((CellTyped) var18.getKey()).getName());
                    } else {
                        CellDef var19 = (CellDef) ((ValueContainer2) var18.getValue()).getSecondValue();
                        if (var19 instanceof InitScriptCell var20) {
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
                                var15.append(((CellTyped) var18.getKey()).getName());
                            }
                        } else if (var19 instanceof MigrationCell var89) {
                            var80.add(var89);
                            var81.addAll(var89.getContextColumns());
                        }
                    }
                }

                insertInto.append(var15);
                insertInto.append(") SELECT ");
                insertInto.append(var14);
                insertInto.append(" FROM ");
                insertInto.append(tableDef.getName());
                insertInto.append(var77);

                try (var pstm = connection.prepareStatement(insertInto.toString());) {

                    int var83 = pstm.executeUpdate();
                    log.debug("result " + var83);
                }

                Iterator var21;
                if (!var80.isEmpty()) {
                    TableValuesSelect var84 = new TableValuesSelect(tmpTableDef.getSchema(), tmpTableDef.getName());
                    ArrayList var86 = new ArrayList();
                    HashSet var90 = new HashSet();
                    var21 = tmpTableDef.getConstraints().iterator();

                    Iterator var24;
                    label1587:
                    while (var21.hasNext()) {
                        ConstraintDef var22 = (ConstraintDef) var21.next();
                        if (ConstraintPRIMARYDef.class.isAssignableFrom(var22.getClass())) {
                            ConstraintPRIMARYDef var23 = (ConstraintPRIMARYDef) var22;
                            var24 = var23.getColumns().iterator();

                            while (true) {
                                if (!var24.hasNext()) {
                                    break label1587;
                                }

                                String var25 = (String) var24.next();
                                var90.add(var25);
                                var86.add(new CellQuery(var25));
                            }
                        }
                    }

                    if (var90.isEmpty()) {
                        throw new FFI("Table [" + tmpTableDef.getSchema() + "." + tmpTableDef.getName() + "] has no PK!");
                    }

                    var21 = var81.iterator();

                    while (var21.hasNext()) {
                        CellNamed var94 = (CellNamed) var21.next();
                        var86.add(new CellQuery(var94));
                    }

                    var84.IJI(var86);
                    IIO(connection, var84);
                    var21 = var84.getResults().iterator();

                    while (var21.hasNext()) {
                        Map var95 = (Map) var21.next();
                        ArrayList var97 = new ArrayList();
                        var24 = var95.values().iterator();

                        while (true) {
                            while (var24.hasNext()) {
                                CellValue var98 = (CellValue) var24.next();
                                Iterator var26 = var90.iterator();

                                while (var26.hasNext()) {
                                    String var27 = (String) var26.next();
                                    if (var27.equals(var98.getName())) {
                                        var97.add(new CellValue(var98.getName(), var98.getType(), var98.getValue(), Condition.EQUALS));
                                        break;
                                    }
                                }
                            }

                            var24 = var80.iterator();

                            while (var24.hasNext()) {
                                MigrationCell var99 = (MigrationCell) var24.next();
                                HashSet var100 = new HashSet();
                                var100.addAll(var95.values());
                                Object var101 = var99.getMigration().action(var100);
                                TableValuesUpdate var28 = new TableValuesUpdate(tmpTableDef.getSchema(), tmpTableDef.getName());
                                var28.IJQ(new CellValue[]{new CellValue(var99, var101)});
                                var28.IJC(var97);
                                IIM(connection, var28);
                                synchronized (connection) {
                                    connection.commit();
                                }
                            }
                            break;
                        }
                    }
                }

                try (var pstm = connection.prepareStatement("ALTER TABLE " + tableDef.getName() + " RENAME TO " + tableDef.getName() + "_old")) {
                    log.trace("result {}", pstm.executeUpdate());
                }

                try (var pstm = connection.prepareStatement("ALTER TABLE " + tmpTableDef.getName() + " RENAME TO " + tableDef.getName())) {
                    log.trace("result {}", pstm.executeUpdate());
                }

                try (var pstm = connection.prepareStatement("DROP TABLE " + tableDef.getName() + "_old")) {
                    log.trace("result {}", pstm.executeUpdate());
                }

                if (!var80.isEmpty()) {
                    var21 = var80.iterator();

                    while (var21.hasNext()) {
                        MigrationCell var96 = (MigrationCell) var21.next();
                        if (var96.getPostAction() != null) {
                            var96.getPostAction().run();
                        }
                    }
                }
            }
            break;
        }

    }

    private static boolean getNullable(ResultSet metaDataResult) throws SQLException {
        short nullable = metaDataResult.getShort("NULLABLE");
        boolean isNullable = true;
        if (1 == nullable) {
            isNullable = true;
        } else if (0 == nullable) {
            isNullable = false;
        } else {
            log.warn("COLUMN NULLABLE UNKNOWN");
        }
        return isNullable;
    }

    private static void logToBeRemoved(TableDef tableDef, Set<CellTyped> var2) {
        for (CellTyped cellTyped : var2) {
            log.info("Table [{}] column [{}] will be removed.", tableDef.getName(), cellTyped.getName());
        }
    }

    public static void QIQ(Connection connection, TableDef def) throws SQLException {

        TableDef tableDef = def.createFor(def.getName() + PURGE_PREFIX);
        tableDef.getColumns().add(new CellDef(auditTsCell, true, false));
        tableDef.getColumns().add(new CellDef(auditReasonCell, true, false));

        var metaDataResult = connection.getMetaData().getColumns(null, tableDef.getSchema(), tableDef.getName(), null);
        var result = prepareCellTypes(tableDef);
        Set<CellTyped> columnsToBeRemoved = parseColumns(result, metaDataResult);
        logToBeRemoved(tableDef, columnsToBeRemoved);

        boolean hasColumns = columnsToBeRemoved.isEmpty();

        if (hasColumns) {
            for (var entry : result.entrySet()) {
                if (!(Boolean) entry.getValue().getFirstValue()) {
                    hasColumns = false;
                    break;
                }
            }
        }

        if (hasColumns) {
            return;
        }
        String alias = tableDef.getAlias();
        String prefixedAlias = "";
        String dotedAlias = "";
        if (alias != null && alias.length() > 0) {
            prefixedAlias = " " + alias;
            dotedAlias = alias + ".";
        }

        TableDef defBackup = tableDef.createFor(tableDef.getName() + "_" + System.nanoTime());
        createTable(connection, defBackup, true);
        StringBuilder insertStmt = new StringBuilder();
        insertStmt.append("INSERT INTO ");
        if (defBackup.getSchema() != null && defBackup.getSchema().length() > 0) {
            insertStmt.append(defBackup.getSchema()).append(".");
        }

        insertStmt.append(defBackup.getName());
        insertStmt.append(" (");
        StringBuilder var13 = new StringBuilder();
        StringBuilder var14 = new StringBuilder();
        boolean var15 = true;
        Iterator var16 = result.entrySet().iterator();

        while (var16.hasNext()) {
            Map.Entry var17 = (Map.Entry) var16.next();
            if ((Boolean) ((ValueContainer2) var17.getValue()).getFirstValue()) {
                if (var15) {
                    var15 = false;
                } else {
                    var13.append(", ");
                    var14.append(", ");
                }

                var13.append(dotedAlias);
                var13.append(((CellTyped) var17.getKey()).getName());
                var14.append(((CellTyped) var17.getKey()).getName());
            }
        }

        insertStmt.append(var14);
        insertStmt.append(") SELECT ");
        insertStmt.append(var13);
        insertStmt.append(" FROM ");
        insertStmt.append(tableDef.getName());
        insertStmt.append(prefixedAlias);

        try(var pstmt = connection.prepareStatement(insertStmt.toString());) {
            log.trace("result {}", pstmt.executeUpdate());
        }

        try(var pstmt = connection.prepareStatement("ALTER TABLE " + tableDef.getName() + " RENAME TO " + tableDef.getName() + "_old")) {
            log.trace("result {}", pstmt.executeUpdate());
        }

        try(var pstmt = connection.prepareStatement("ALTER TABLE " + defBackup.getName() + " RENAME TO " + tableDef.getName())) {
            log.trace("result {}", pstmt.executeUpdate());
        }

        try(var pstmt = connection.prepareStatement("DROP TABLE " + tableDef.getName() + "_old")) {
            log.debug("result {}", pstmt.executeUpdate());
        }

    }

    private static HashMap<CellTyped, ValueContainer2<Boolean, CellDef>> prepareCellTypes(TableDef tableDef) {
        var result = new HashMap<CellTyped, ValueContainer2<Boolean, CellDef>>();
        for (CellDef column : tableDef.getColumns()) {
            result.put(new CellTyped(column), new ValueContainer2(false, column));
        }
        return result;
    }

    private static HashSet<CellTyped> parseColumns(HashMap<CellTyped, ValueContainer2<Boolean, CellDef>> result, ResultSet metaDataResult) throws SQLException {
        var columns = new HashSet<CellTyped>();
        try (metaDataResult) {
            while (metaDataResult.next()) {
                CellTyped cellTyped = new CellTyped(metaDataResult.getString("COLUMN_NAME"), CellType.valueOf(metaDataResult.getString("TYPE_NAME")));
                var twoValueBox = result.get(cellTyped);
                if (twoValueBox != null) {
                    twoValueBox.setFirstValue(true);
                    continue;
                }
                columns.add(cellTyped);
            }
        }
        return columns;
    }

    public static void QIR(Connection var0, TableDef var1, CellTyped var2, String var3, String var4) throws SQLException {

        DatabaseMetaData var5 = var0.getMetaData();
        ResultSet var6 = var5.getColumns(null, var1.getSchema(), var1.getName(), null);
        HashSet var7 = new HashSet();

        String var8;
        String var9;
        while (var6.next()) {
            var8 = var6.getString("COLUMN_NAME");
            var9 = var6.getString("TYPE_NAME");
            CellType var10 = CellType.valueOf(var9);
            CellTyped var11 = new CellTyped(var8, var10);
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

        var33.append(var1.getName() + PURGE_PREFIX);
        var33.append(" (");
        StringBuilder var12 = new StringBuilder();
        StringBuilder var13 = new StringBuilder();
        boolean var14 = true;
        Iterator var15 = var7.iterator();

        while (var15.hasNext()) {
            CellTyped var16 = (CellTyped) var15.next();
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
        var13.append(auditTsCell.getName());
        var13.append(", ");
        var13.append(auditReasonCell.getName());
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
            var34.setObject(1, new Date(), auditTsCell.getType().getSqlType());
            var34.setObject(2, var4, auditReasonCell.getType().getSqlType());
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

    public static void IIK(Connection var0, ViewDef var1) throws SQLException {

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
                    CellNamed var6 = (CellNamed) var5.next();
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

    public static void IIL(Connection var0, TableValuesInsert var1) throws SQLException {

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

    public static void IIM(Connection var0, TableValuesUpdate var1) throws SQLException {

        PreparedStatement var2 = null;

        try {
            String var4 = IIQ(var1) + IIT(var1);
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

    public static void IIN(Connection var0, TableValuesDelete var1) throws SQLException {

        PreparedStatement var2 = null;

        try {
            String var4 = IIR(var1) + IIT(var1);
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

    public static void IIO(Connection var0, TableValuesSelect... var1) throws SQLException {

        IIO(var0, null, null, var1);

    }

    public static void IIO(Connection var0, Integer var1, Integer var2, TableValuesSelect... var3) throws SQLException {

        PreparedStatement var4 = null;
        ResultSet var5 = null;

        try {
            String var7 = IIP(var3) + IIT(var3) + IIU(var3) + IIV(var1, var2);
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

    private static String IIP(TableValuesSelect... var0) {

        String var18;
        StringBuilder var1 = new StringBuilder();
        var1.append("SELECT ");
        StringBuilder var2 = new StringBuilder();
        var2.append(" FROM ");
        boolean var3 = true;
        boolean var4 = true;
        TableValuesSelect[] var5 = var0;
        int var6 = var0.length;

        for (int var7 = 0; var7 < var6; ++var7) {
            TableValuesSelect var8 = var5[var7];
            String var9 = var8.getAlias();
            String var10 = "";
            String var11 = "";
            if (var9 != null && var9.length() > 0) {
                var10 = " " + var9;
                var11 = var9 + ".";
            }

            if (var0.length == 1 && var8.getParameters().isEmpty()) {
                log.debug("Query for all columns.");
                var8.IJH(new CellQuery("*"));
            }

            Iterator var12 = var8.getParameters().iterator();

            while (var12.hasNext()) {
                CellQuery var13 = (CellQuery) var12.next();
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

    private static String IIQ(TableValuesUpdate var0) {

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
            CellValue var7 = (CellValue) var6.next();
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

    private static String IIR(TableValuesDelete var0) {

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

    private static String IIS(TableValuesInsert var0) {

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
            CellNamed var7 = (CellNamed) var6.next();
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

    private static String IIT(TableValuesQuery... var0) {

        String var17;
        StringBuilder var1 = new StringBuilder();
        var1.append(" WHERE ");
        var1.append("1=1");
        TableValuesQuery[] var2 = var0;
        int var3 = var0.length;

        label186:
        for (int var4 = 0; var4 < var3; ++var4) {
            TableValuesQuery var5 = var2[var4];
            String var6 = var5.getAlias();
            String var7 = "";
            if (var6 != null && var6.length() > 0) {
                var7 = var6 + ".";
            }

            Iterator var8 = var5.getKeys().iterator();

            while (var8.hasNext()) {
                CellConditioned var9 = (CellConditioned) var8.next();
                var1.append(" and ");
                var1.append(var7);
                var1.append(var9.getName());
                if (var9 instanceof CellValue var10) {
                    if (var10.getValue() != null) {
                        var1.append(var9.getCondition().getSqlRepresentation());
                        var1.append("?");
                    } else {
                        var1.append(" is null");
                    }
                } else {
                    if (!(var9 instanceof CellJoin var19)) {
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
                Expression var18;
                do {
                    do {
                        if (!var8.hasNext()) {
                            continue label186;
                        }

                        var18 = (Expression) var8.next();
                    } while (var18.getKeys() == null);
                } while (var18.getKeys().size() <= 0);

                var1.append(" and (");
                boolean var20 = true;
                Iterator var21 = var18.getKeys().iterator();

                while (var21.hasNext()) {
                    CellValue var22 = (CellValue) var21.next();
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

    private static String IIU(TableValuesSelect... var0) {

        String var16;
        StringBuilder var1 = new StringBuilder();
        var1.append(" ORDER BY ");
        boolean var2 = true;
        TableValuesSelect[] var4 = var0;
        int var5 = var0.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            TableValuesSelect var7 = var4[var6];
            String var8 = var7.getAlias();
            String var9 = "";
            if (var8 != null && var8.length() > 0) {
                var9 = var8 + ".";
            }

            Iterator var10 = var7.getOrder().iterator();

            while (var10.hasNext()) {
                CellOrder var11 = (CellOrder) var10.next();
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

    private static String IIW(TableValuesSelect var0) {

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
            CellJoin var5 = (CellJoin) var4.next();
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

    private static Integer IIX(PreparedStatement var0, List<? extends CellNamed> var1, List<CellValue<?>> var2) throws SQLException {

        HashMap var3 = new HashMap();
        Iterator var4 = var2.iterator();

        while (var4.hasNext()) {
            CellValue var5 = (CellValue) var4.next();
            var3.put(var5.getName(), var5);
        }

        Integer var9 = IIX(var0, var1, var3);
        return var9;
    }

    private static Integer IIX(PreparedStatement var0, List<? extends CellNamed> var1, Map<String, CellValue<?>> var2) throws SQLException {

        int var3 = 0;
        Iterator var4 = var1.iterator();

        while (var4.hasNext()) {
            CellNamed var5 = (CellNamed) var4.next();
            CellValue var6 = var2.get(var5.getName());
            ++var3;
            Object var7 = var6.getValue();
            CellType var8 = var6.getType();
            if (var7 != null) {
                var0.setObject(var3, var7, var8.getSqlType());
            } else {
                var0.setNull(var3, var8.getSqlType());
            }
        }

        Integer var12 = var3;
        return var12;
    }

    private static Integer IIY(int var0, PreparedStatement var1, TableValuesQuery... var2) throws SQLException {

        if (var0 < 0) {
            throw new RuntimeException("Start index cannot be less than 0!");
        } else {
            int var3 = var0;
            TableValuesQuery[] var4 = var2;
            int var5 = var2.length;
            int var6 = 0;

            label139:
            while (var6 < var5) {
                TableValuesQuery var7 = var4[var6];
                Iterator var8 = var7.getKeys().iterator();

                while (var8.hasNext()) {
                    CellTyped var9 = (CellTyped) var8.next();
                    if (var9 instanceof CellValue var10) {
                        Object var11 = var10.getValue();
                        CellType var12 = var9.getType();
                        if (var11 != null) {
                            ++var3;
                            var1.setObject(var3, var11, var12.getSqlType());
                        }
                    } else {
                        if (!(var9 instanceof CellJoin)) {
                            throw new RuntimeException("Unexcpected type of cell [" + var9.getClass() + "]!");
                        }

                        log.warn("Skipped cell [" + var9.getClass() + "]");
                    }
                }

                var8 = var7.getExpressions().iterator();

                while (true) {
                    Expression var18;
                    do {
                        do {
                            if (!var8.hasNext()) {
                                ++var6;
                                continue label139;
                            }

                            var18 = (Expression) var8.next();
                        } while (var18.getKeys() == null);
                    } while (var18.getKeys().size() <= 0);

                    Iterator var19 = var18.getKeys().iterator();

                    while (var19.hasNext()) {
                        CellValue var20 = (CellValue) var19.next();
                        Object var21 = var20.getValue();
                        CellType var13 = var20.getType();
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

    private static void IIZ(ResultSet var0, TableValuesSelect... var1) throws SQLException {

        while (var0.next()) {
            TableValuesSelect[] var2 = var1;
            int var3 = var1.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                TableValuesSelect var5 = var2[var4];
                HashMap var6 = new HashMap();

                for (int var7 = 1; var7 <= var0.getMetaData().getColumnCount(); ++var7) {
                    int var8 = var0.getMetaData().getColumnType(var7);
                    CellType var9 = CellType.getCellDataTypeType(var8);
                    String var10 = var0.getMetaData().getColumnName(var7);
                    String var11 = var0.getMetaData().getColumnLabel(var7);
                    Object var12 = var0.getObject(var7);
                    if (var0.wasNull()) {
                        var12 = null;
                    }

                    var6.put(var11, new CellValue(var10, var9, var12));
                }

                var5.getResults().add(var6);
            }
        }

    }

}
