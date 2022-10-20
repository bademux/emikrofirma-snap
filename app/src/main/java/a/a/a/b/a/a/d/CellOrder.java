package a.a.a.b.a.a.d;

import a.a.a.b.a.a.OrderType;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CellOrder extends CellNamed {

    protected final OrderType orderType;

    public CellOrder(CellNamed cellNamed, OrderType orderType) {
        super(cellNamed.name);
        this.orderType = orderType;
    }

}
