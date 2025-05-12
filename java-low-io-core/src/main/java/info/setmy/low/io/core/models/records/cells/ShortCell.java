package info.setmy.low.io.core.models.records.cells;

public class ShortCell extends Cell<Short> {

    public ShortCell(final Short value) {
        super(value);
    }

    @Override
    public int size() {
        return 2;
    }
}
