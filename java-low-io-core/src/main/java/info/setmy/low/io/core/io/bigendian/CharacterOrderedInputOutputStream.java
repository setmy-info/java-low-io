package info.setmy.low.io.core.io.bigendian;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.io.OrderedInputOutputStream;
import info.setmy.low.io.core.models.records.cells.Cell;
import info.setmy.low.io.core.models.records.cells.CharacterCell;
import lombok.NoArgsConstructor;

import java.nio.ByteBuffer;

import static java.nio.ByteBuffer.wrap;

@NoArgsConstructor
public class CharacterOrderedInputOutputStream extends OrderedInputOutputStream<Character> {

    @Override
    public Cell<Character> read(InputOutputStream ios) {
        return new CharacterCell(
            wrap(read(new byte[2], ios.in())).getChar()
        );
    }

    @Override
    public void write(Cell<Character> data, InputOutputStream inputOutputStream) {
        write(
            ByteBuffer.allocate(data.size()).putChar(data.getValue()).array(),
            inputOutputStream.out()
        );
    }
}
