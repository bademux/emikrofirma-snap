package a.a.a.c.f.c.b;

import a.a.a.c.f.b.c.PrivtePerson;
import a.a.a.c.f.b.c.Bytes;
import a.a.a.c.f.b.c.JZ;
import a.a.a.c.f.b.c.Text;
import a.a.a.c.f.c.LW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "simpleUserData"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class SimpleUserData extends LW {
    private Text AQK;
    private JZ AQL;
    private PrivtePerson AQM;
    private Bytes AQN;
    private Bytes AQO;
    private Integer FGC;

    public SimpleUserData() {

    }

    public SimpleUserData(Text var1, JZ var2, PrivtePerson var3, Bytes var4, Bytes var5, Boolean var6) {
        this();

        this.AQK = var1;
        this.AQL = var2;
        this.AQM = var3;
        this.AQN = var4;
        this.AQO = var5;
        this.setPasswordChanged(var6);

    }

    public Text getUsername() {
        return this.AQK;
    }

    public Text DEZ() {
        if (this.AQK == null) {
            this.AQK = new Text();
        }

        return this.AQK;
    }

    public void setUsername(Text var1) {
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

    public PrivtePerson getUsePassword() {
        return this.AQM;
    }

    public PrivtePerson DFB() {
        if (this.AQM == null) {
            this.AQM = new PrivtePerson();
        }

        return this.AQM;
    }

    public void setUsePassword(PrivtePerson var1) {
        this.AQM = var1;
    }

    public Bytes getPassword() {
        return this.AQO;
    }

    public Bytes DFC() {
        if (this.AQO == null) {
            this.AQO = new Bytes();
        }

        return this.AQO;
    }

    public void setPassword(Bytes var1) {
        this.AQO = var1;
    }

    public Bytes getSalt() {
        return this.AQN;
    }

    public Bytes DFD() {
        if (this.AQN == null) {
            this.AQN = new Bytes();
        }

        return this.AQN;
    }

    public void setSalt(Bytes var1) {
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
