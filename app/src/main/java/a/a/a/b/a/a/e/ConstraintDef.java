package a.a.a.b.a.a.e;

import a.a.a.b.a.a.d.Copyable;

public interface ConstraintDef extends Copyable {
    SqlColumnKeyword getConstraintType();

    ConstraintDef copy();
}
