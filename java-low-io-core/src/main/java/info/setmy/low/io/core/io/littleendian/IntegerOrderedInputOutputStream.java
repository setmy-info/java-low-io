package info.setmy.low.io.core.io.littleendian;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.io.OrderedInputOutputStream;
import info.setmy.low.io.core.models.records.cells.Cell;
import info.setmy.low.io.core.models.records.cells.IntegerCell;
import lombok.NoArgsConstructor;

import java.nio.ByteBuffer;

import static java.nio.ByteBuffer.wrap;
import static java.nio.ByteOrder.LITTLE_ENDIAN;

@NoArgsConstructor
public class IntegerOrderedInputOutputStream extends OrderedInputOutputStream<Integer> {

    @Override
    public Cell<Integer> read(InputOutputStream ios) {
        return new IntegerCell(
            wrap(read(new byte[4], ios.in())).order(LITTLE_ENDIAN).getInt()
        );
    }

    @Override
    public void write(Cell<Integer> data, InputOutputStream inputOutputStream) {
        write(
            ByteBuffer.allocate(data.size()).order(LITTLE_ENDIAN).putInt(data.getValue()).array(),
            inputOutputStream.out()
        );
    }
}
