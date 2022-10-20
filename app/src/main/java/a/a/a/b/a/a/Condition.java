package a.a.a.b.a.a;

public enum Condition {
    EQUALS("="),
    NOT_EQUALS("!="),
    LESS_THAN("<"),
    LESS_THAN_OR_EQUALS("<="),
    GREATER_THAN(">"),
    GREATER_THAN_OR_EQUALS(">="),
    LIKE("LIKE");

    private final String HDP;

    Condition(String var3) {
        this.HDP = var3;
    }

    public String getSqlRepresentation() {
        return " " + this.HDP + " ";
    }
}
