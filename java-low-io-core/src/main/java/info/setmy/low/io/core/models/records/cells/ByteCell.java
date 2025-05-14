package info.setmy.low.io.core.models.records.cells;

import info.setmy.low.io.core.io.OrderedInputOutputStream;

import static info.setmy.low.io.core.io.SelectedInputOutputStream.BIG_ENDIAN;
import static info.setmy.low.io.core.io.SelectedInputOutputStream.LITTLE_ENDIAN;

public class ByteCell extends Cell<Byte> {

    //TODO: by protocol endiannes allocation class/methods/lambdas?
    public static ByteCell newBigEndianCell() {
        return new ByteCell(BIG_ENDIAN.byteOrderedInputOutputStream());
    }

    public static ByteCell newLittleEndianCell() {
        return new ByteCell(LITTLE_ENDIAN.byteOrderedInputOutputStream());
    }

    private ByteCell(OrderedInputOutputStream<Byte> stream) {
        super(stream);
    }

    @Override
    public int size() {
        return 1;
    }
}
