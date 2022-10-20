package a.a.a.c.f.a.c.a.a;

import a.a.a.c.g.b.FCW;

public enum ConditionType {
    EQUALS(FCW.getInstance().getMessageForKey("micro.rules.condition.equals")),
    NOT_EQUALS(FCW.getInstance().getMessageForKey("micro.rules.condition.not_equals")),
    EQUALS_IGNORE_CASE(FCW.getInstance().getMessageForKey("micro.rules.condition.equals_ignore_case")),
    GREATER(FCW.getInstance().getMessageForKey("micro.rules.condition.greater")),
    GREATER_OR_EQUAL(FCW.getInstance().getMessageForKey("micro.rules.condition.greater_or_equal")),
    LESSER(FCW.getInstance().getMessageForKey("micro.rules.condition.lesser")),
    LESSER_OR_EQUAL(FCW.getInstance().getMessageForKey("micro.rules.condition.lesser_or_equal")),
    CONTAINS(FCW.getInstance().getMessageForKey("micro.rules.condition.contains")),
    MATCHES(FCW.getInstance().getMessageForKey("micro.rules.condition.matches")),
    ISSET(FCW.getInstance().getMessageForKey("micro.rules.condition.isset")),
    ISNOTSET(FCW.getInstance().getMessageForKey("micro.rules.condition.isnotset"));

    private final String AHVI;

    ConditionType(String var3) {
        this.AHVI = var3;
    }

    public String getDescription() {
        return this.AHVI;
    }
}
