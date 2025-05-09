package info.setmy.low.io.core.io.bigendian;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.io.OrderedInputOutputStream;
import info.setmy.low.io.core.models.records.cells.Cell;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ByteOrderedInoutOutputStream extends OrderedInputOutputStream<Byte> {

    @Override
    public Cell<Byte> read(InputOutputStream ios) {
        // TODO: reading
        return null;
    }

    @Override
    public void write(Cell<Byte> data, InputOutputStream toInputOutputStream) {
        // TODO: writing
    }
}
