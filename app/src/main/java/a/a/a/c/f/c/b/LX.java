package a.a.a.c.f.c.b;

import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.JT;
import a.a.a.c.f.b.c.JZ;
import a.a.a.c.f.b.c.KO;
import a.a.a.c.f.c.LW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "simpleUserData"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class LX extends LW {
    private KO AQK;
    private JZ AQL;
    private JS AQM;
    private JT AQN;
    private JT AQO;
    private Integer FGC;

    public LX() {

    }

    public LX(KO var1, JZ var2, JS var3, JT var4, JT var5, Boolean var6) {
        this();

        this.AQK = var1;
        this.AQL = var2;
        this.AQM = var3;
        this.AQN = var4;
        this.AQO = var5;
        this.setPasswordChanged(var6);

    }

    public KO getUsername() {
        return this.AQK;
    }

    public KO DEZ() {
        if (this.AQK == null) {
            this.AQK = new KO();
        }

        return this.AQK;
    }

    public void setUsername(KO var1) {
        this.AQK = var1;
    }

    public JZ getLoginType() {
        return this.AQL;
    }

    public JZ DFA() {
        if (this.AQL == null) {
            this.AQL = new JZ();
        }

        return this.AQL;
    }

    public void setLoginType(JZ var1) {
        this.AQL = var1;
    }

    public JS getUsePassword() {
        return this.AQM;
    }

    public JS DFB() {
        if (this.AQM == null) {
            this.AQM = new JS();
        }

        return this.AQM;
    }

    public void setUsePassword(JS var1) {
        this.AQM = var1;
    }

    public JT getPassword() {
        return this.AQO;
    }

    public JT DFC() {
        if (this.AQO == null) {
            this.AQO = new JT();
        }

        return this.AQO;
    }

    public void setPassword(JT var1) {
        this.AQO = var1;
    }

    public JT getSalt() {
        return this.AQN;
    }

    public JT DFD() {
        if (this.AQN == null) {
            this.AQN = new JT();
        }

        return this.AQN;
    }

    public void setSalt(JT var1) {
        this.AQN = var1;
    }

    public Integer getPasswordChanged() {
        return this.FGC;
    }

    public Integer HHA() {
        if (this.FGC == null) {
            this.FGC = 0;
        }

        return this.FGC;
    }

    public void setPasswordChanged(Boolean var1) {
        if (var1) {
            this.FGC = 1;
        } else {
            this.FGC = 0;
        }

    }

    public String toString() {
        return "SimpleUserData [username=" + this.AQK + ", loginType=" + this.AQL + ", toString()=" + super.toString() + "]";
    }
}
