package a.a.a.b.a.a.d;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class CellNamed implements Copyable {

    protected final String name;

    public CellNamed(CellNamed cellNamed) {
        this(cellNamed.name);
    }

    public Copyable copy() {
        return new CellNamed(this.name);
    }
}
