package info.setmy.low.io.core.models.records.cells;

public class ByteCell extends Cell<Byte> {

    protected ByteCell(final Byte value) {
        super(value);
    }

    @Override
    public int size() {
        return 1;
    }
}
