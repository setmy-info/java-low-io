package info.setmy.low.io.core.io.littleendian;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.io.OrderedInputOutputStream;
import info.setmy.low.io.core.models.records.cells.Cell;
import lombok.NoArgsConstructor;

import java.nio.ByteBuffer;

import static java.nio.ByteBuffer.wrap;
import static java.nio.ByteOrder.LITTLE_ENDIAN;

@NoArgsConstructor
public class ShortOrderedInputOutputStream extends OrderedInputOutputStream<Short> {

    public static final ShortOrderedInputOutputStream INSTANCE = new ShortOrderedInputOutputStream();

    @Override
    public void read(Cell<Short> data, InputOutputStream ios) {
        data.setValue(wrap(read(new byte[2], ios.in())).order(LITTLE_ENDIAN).getShort());
    }

    @Override
    public void write(Cell<Short> data, InputOutputStream inputOutputStream) {
        write(
            ByteBuffer.allocate(data.size()).order(LITTLE_ENDIAN).putShort(data.getValue()).array(),
            inputOutputStream.out()
        );
    }
}
