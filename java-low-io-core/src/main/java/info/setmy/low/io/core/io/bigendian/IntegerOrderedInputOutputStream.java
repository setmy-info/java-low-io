package info.setmy.low.io.core.io.bigendian;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.io.OrderedInputOutputStream;
import info.setmy.low.io.core.models.records.cells.Cell;
import info.setmy.low.io.core.models.records.cells.IntegerCell;
import lombok.NoArgsConstructor;

import java.nio.ByteBuffer;

import static java.nio.ByteBuffer.wrap;

@NoArgsConstructor
public class IntegerOrderedInputOutputStream extends OrderedInputOutputStream<Integer> {

    @Override
    public Cell<Integer> read(InputOutputStream ios) {
        return new IntegerCell(
            wrap(read(new byte[4], ios.in())).getInt()
        );
    }

    @Override
    public void write(Cell<Integer> data, InputOutputStream inputOutputStream) {
        write(
            ByteBuffer.allocate(data.size()).putInt(data.getValue()).array(),
            inputOutputStream.out()
        );
    }
}
