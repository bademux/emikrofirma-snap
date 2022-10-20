package a.a.a.b.a.a.a;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@RequiredArgsConstructor
public abstract class BaseTable {

    protected final String schema;
    protected final String alias;
    protected final String name;

}
