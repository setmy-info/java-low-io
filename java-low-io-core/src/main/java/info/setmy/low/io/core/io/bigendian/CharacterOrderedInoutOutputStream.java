package info.setmy.low.io.core.io.bigendian;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.io.OrderedInputOutputStream;
import info.setmy.low.io.core.models.records.cells.Cell;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CharacterOrderedInoutOutputStream extends OrderedInputOutputStream<Character> {

    @Override
    public Cell<Character> read(InputOutputStream ios) {
        // TODO: reading
        return null;
    }

    @Override
    public void write(Cell<Character> data, InputOutputStream toInputOutputStream) {
        // TODO: writing
    }
}
