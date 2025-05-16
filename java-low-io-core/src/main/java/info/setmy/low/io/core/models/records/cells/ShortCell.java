package info.setmy.low.io.core.models.records.cells;

import info.setmy.low.io.core.io.OrderedInputOutputStream;

import static info.setmy.low.io.core.io.SelectedInputOutputStream.BIG_ENDIAN;
import static info.setmy.low.io.core.io.SelectedInputOutputStream.LITTLE_ENDIAN;

public class ShortCell extends Cell<Short> {

    //TODO: by protocol endianness allocation class/methods/lambdas?
    public static ShortCell newBigEndianCell() {
        return new ShortCell(BIG_ENDIAN.shortOrderedInputOutputStream());
    }

    public static ShortCell newLittleEndianCell() {
        return new ShortCell(LITTLE_ENDIAN.shortOrderedInputOutputStream());
    }

    private ShortCell(OrderedInputOutputStream<Short> stream) {
        super(stream);
    }

    @Override
    public int size() {
        return 2;
    }
}
