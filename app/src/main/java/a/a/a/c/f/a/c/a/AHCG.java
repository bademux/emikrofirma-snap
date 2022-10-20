package a.a.a.c.f.a.c.a;

import a.a.a.c.g.b.FCW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

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

        this.AHTY = null;
        this.AHTZ = null;

    }

    public AHCG(AHCJ var1, String var2) {

        this.AHTY = var1;
        this.AHTZ = var2;

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
