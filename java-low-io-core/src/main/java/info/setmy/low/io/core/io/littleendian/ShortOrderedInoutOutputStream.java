package info.setmy.low.io.core.io.littleendian;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.io.OrderedInputOutputStream;
import info.setmy.low.io.core.models.records.cells.Cell;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ShortOrderedInoutOutputStream extends OrderedInputOutputStream<Short> {

    @Override
    public Cell<Short> read(InputOutputStream ios) {
        // TODO: reading
        return null;
    }

    @Override
    public void write(Cell<Short> data, InputOutputStream toInputOutputStream) {
        // TODO: writing
    }
}
