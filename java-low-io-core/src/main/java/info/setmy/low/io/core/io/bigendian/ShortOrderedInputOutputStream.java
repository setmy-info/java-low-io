package info.setmy.low.io.core.io.bigendian;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.io.OrderedInputOutputStream;
import info.setmy.low.io.core.models.records.cells.Cell;
import info.setmy.low.io.core.models.records.cells.ShortCell;
import lombok.NoArgsConstructor;

import java.nio.ByteBuffer;

import static java.nio.ByteBuffer.wrap;

@NoArgsConstructor
public class ShortOrderedInputOutputStream extends OrderedInputOutputStream<Short> {

    @Override
    public Cell<Short> read(InputOutputStream ios) {
        return new ShortCell(
            wrap(read(new byte[2], ios.in())).getShort()
        );
    }

    @Override
    public void write(Cell<Short> data, InputOutputStream inputOutputStream) {
        write(
            ByteBuffer.allocate(data.size()).putShort(data.getValue()).array(),
            inputOutputStream.out()
        );
    }
}
