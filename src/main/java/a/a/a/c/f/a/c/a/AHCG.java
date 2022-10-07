package a.a.a.c.f.a.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.g.b.FCW;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHCG extends AHDI {
    @XmlElement(
            name = "actionType"
    )
    protected final AHCJ AHTY;
    @XmlElement(
            name = "messageOnError"
    )
    private final String AHTZ;

    protected AHCG() {
        EXF.getInstance().ICO();

        try {
            this.AHTY = null;
            this.AHTZ = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCG(AHCJ var1, String var2) {
        EXF.getInstance().ICO();

        try {
            this.AHTY = var1;
            this.AHTZ = var2;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCJ getActionType() {
        return this.AHTY;
    }

    private String getMessageOnError() {
        return this.AHTZ.startsWith("%") ? FCW.getInstance().getMessageForKey(this.AHTZ.substring(1)) : this.AHTZ;
    }

    public String toString() {
        return "ActionOnObject [actionType=" + this.AHTY + ", messageOnError=" + this.AHTZ + "]";
    }

    protected String AICW(String var1) {
        return this.getMessageOnError().replaceAll("##ACTION_TYPE##", Matcher.quoteReplacement(this.AHTY.getDescription())).replaceAll("##CONTEXT_STRING##", Matcher.quoteReplacement(var1));
    }
}
