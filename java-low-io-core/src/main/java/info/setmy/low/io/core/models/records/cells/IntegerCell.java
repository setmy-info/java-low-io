package info.setmy.low.io.core.models.records.cells;

import info.setmy.low.io.core.io.OrderedInputOutputStream;

import static info.setmy.low.io.core.io.SelectedInputOutputStream.BIG_ENDIAN;
import static info.setmy.low.io.core.io.SelectedInputOutputStream.LITTLE_ENDIAN;


public class IntegerCell extends Cell<Integer> {

    public static IntegerCell newBigEndianCell() {
        return new IntegerCell(BIG_ENDIAN.integerOrderedInputOutputStream());
    }

    public static IntegerCell newLittleEndianCell() {
        return new IntegerCell(LITTLE_ENDIAN.integerOrderedInputOutputStream());
    }

    private IntegerCell(OrderedInputOutputStream<Integer> stream) {
        super(stream);
    }

    @Override
    public int size() {
        return 4;
    }
}
