package a.a.a.c.c.e.a.a.c;

import a.a.a.c.c.e.a.a.a.ERG;
import a.a.a.c.c.e.a.a.b.ERI;
import a.a.a.c.c.e.a.a.b.ERJ;
import a.a.a.c.f.c.c.TextFieldRequired;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Region;

import java.util.ArrayList;
import java.util.Iterator;

public class ERQ {
    public ERQ() {
    }

    public static void setupNode(Region var0, ERR var1, ElementType var2) {
        var0.setOnDragDetected(new ERJ(var1, var2, TransferMode.COPY));
        var0.setOnDragDone(new ERI(var1));
    }

    public static String HSE(ObservableList<Node> var0) {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = var0.iterator();

        while (var2.hasNext()) {
            Node var3 = (Node) var2.next();
            ElementType var4 = ElementType.valueOf(var3.getId());
            switch (var4) {
                case text:
                    TextField var5 = (TextField) var3;
                    var1.append("#%string" + var5.getText() + "string%#");
                    break;
                case separator_slash:
                case separator_backslash:
                case separator_underscore:
                case separator_minus:
                case const_F:
                case const_FVAT:
                case const_F_VAT:
                case const_FV:
                case const_FA:
                case const_FK:
                case const_KOR:
                    var1.append(var4.getLiteral());
                    break;
                case year:
                    var1.append("#%yyyy%#");
                    break;
                case month:
                    var1.append("#%MM%#");
                    break;
                case day:
                    var1.append("#%dd%#");
                    break;
                case sequence1:
                    var1.append("#%sequence1%#");
                    break;
                case sequence2:
                    var1.append("#%sequence2%#");
                    break;
                case sequence3:
                    var1.append("#%sequence3%#");
                    break;
                case ysequence1:
                case ysequence2:
                case hsequence1:
                case hsequence2:
                case qsequence1:
                case qsequence2:
                    var1.append("#%" + var4.name() + "%#");
            }
        }

        return var1.toString();
    }

    public static void HSF(ElementType var0, String var1, ERR var2, ObservableList<Node> var3, StringProperty var4, boolean var5) {
        if (var1 == null) {
            var1 = "";
        }

        Object var6 = null;
        Label var8;
        switch (var0) {
            case text:
                TextFieldRequired var7 = new TextFieldRequired(var1);
                var7.setMaxLength(10);
                var7.textProperty().addListener(new ERG(var3, var4));
                var6 = var7;
                break;
            case separator_slash:
            case separator_backslash:
            case separator_underscore:
            case separator_minus:
            case const_F:
            case const_FVAT:
            case const_F_VAT:
            case const_FV:
            case const_FA:
            case const_FK:
            case const_KOR:
                var8 = new Label(var0.getLiteral());
                var8.setAlignment(Pos.CENTER);
                var6 = var8;
                break;
            case year:
            case month:
            case day:
                var8 = new Label(var0.getDescription());
                var8.setAlignment(Pos.CENTER);
                var6 = var8;
                break;
            case sequence1:
            case sequence2:
            case sequence3:
            case ysequence1:
            case ysequence2:
            case hsequence1:
            case hsequence2:
            case qsequence1:
            case qsequence2:
                var8 = new Label(var0.getDescription());
                var8.getStylesheets().add("/css/configuration.css");
                var8.getStyleClass().add("counter");
                var8.setAlignment(Pos.CENTER);
                var6 = var8;
        }

        if (var6 != null) {
            ((Region) var6).setId(var0.name());
            ((Region) var6).setOnDragDetected(new ERJ(var2, var0, TransferMode.MOVE));
            ((Region) var6).setOnDragDone(new ERI(var2));
            if (var5) {
                ArrayList var11 = new ArrayList();
                boolean var12 = false;
                Iterator var9 = var3.iterator();

                while (var9.hasNext()) {
                    Node var10 = (Node) var9.next();
                    if (var10.equals(var2.getImageView())) {
                        var12 = true;
                        var11.add(var6);
                    } else {
                        var11.add(var10);
                    }
                }

                if (!var12) {
                    var11.add(var6);
                }

                var3.removeAll(var3);
                var3.addAll(var11);
            } else {
                var3.add((Node) var6);
            }
        }

    }
}
