package info.setmy.low.io.core.models.records.cells;

public class IntegerCell extends Cell<Integer> {

    protected IntegerCell(final Integer value) {
        super(value);
    }

    @Override
    public int size() {
        return 4;
    }
}
