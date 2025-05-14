package info.setmy.low.io.core.io.littleendian;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.io.OrderedInputOutputStream;
import info.setmy.low.io.core.models.records.cells.Cell;
import lombok.NoArgsConstructor;

import java.nio.ByteBuffer;

import static java.nio.ByteBuffer.wrap;

@NoArgsConstructor
public class ByteOrderedInputOutputStream extends OrderedInputOutputStream<Byte> {

    public static final ByteOrderedInputOutputStream INSTANCE = new ByteOrderedInputOutputStream();

    @Override
    public void read(Cell<Byte> data, InputOutputStream ios) {
        data.setValue(wrap(read(new byte[1], ios.in())).get());
    }

    @Override
    public void write(Cell<Byte> data, InputOutputStream inputOutputStream) {
        write(
            ByteBuffer.allocate(data.size()).put(data.getValue()).array(),
            inputOutputStream.out()
        );
    }
}
