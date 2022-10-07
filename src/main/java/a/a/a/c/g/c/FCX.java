package a.a.a.c.g.c;

import a.a.a.c.g.b.FCW;

public class FCX extends Exception {
    private static final long serialVersionUID = 1L;
    private final FCY HBJ;

    public FCX(FCY var1, String var2, Throwable var3) {
        super(var2, var3);
        this.HBJ = var1;
    }

    public FCX(FCY var1, String var2) {
        super(var2);
        this.HBJ = var1;
    }

    public FCX(FCY var1, Throwable var2) {
        super(var2);
        this.HBJ = var1;
    }

    public FCY getType() {
        return this.HBJ;
    }

    public String getLocalizedMessage() {
        return this.HBJ.getDescription() + " " + super.getLocalizedMessage();
    }

    public enum FCY {
        WARNING(FCW.getInstance().getMessageForKey("micro.parse.exception.type.warning")),
        FATALERROR(FCW.getInstance().getMessageForKey("micro.parse.exception.type.fatalerror")),
        ERROR(FCW.getInstance().getMessageForKey("micro.parse.exception.type.error"));

        private final String HBI;

        FCY(String var3) {
            this.HBI = var3;
        }

        public String getDescription() {
            return this.HBI;
        }
    }
}
