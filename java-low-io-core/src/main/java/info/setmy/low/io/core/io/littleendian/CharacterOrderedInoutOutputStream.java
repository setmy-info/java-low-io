package info.setmy.low.io.core.io.littleendian;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.io.OrderedInputOutputStream;
import info.setmy.low.io.core.models.records.cells.Cell;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CharacterOrderedInoutOutputStream extends OrderedInputOutputStream<Character> {

    @Override
    public Cell<Character> read(InputOutputStream ios) {
        /*
        public static Bytes ofLE(char value) {
            return new Bytes(ByteBuffer.allocate(2).order(LITTLE_ENDIAN).putChar(value).array());
        }
        */
        // TODO: reading
        return null;
    }

    @Override
    public void write(Cell<Character> data, InputOutputStream toInputOutputStream) {
        // TODO: writing
    }
}
