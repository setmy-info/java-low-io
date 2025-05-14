package info.setmy.low.io.core.io.littleendian;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.io.OrderedInputOutputStream;
import info.setmy.low.io.core.models.records.cells.Cell;
import lombok.NoArgsConstructor;

import java.nio.ByteBuffer;

import static java.nio.ByteBuffer.wrap;
import static java.nio.ByteOrder.LITTLE_ENDIAN;

@NoArgsConstructor
public class CharacterOrderedInputOutputStream extends OrderedInputOutputStream<Character> {

    public static final CharacterOrderedInputOutputStream INSTANCE = new CharacterOrderedInputOutputStream();

    @Override
    public void read(Cell<Character> data, InputOutputStream ios) {
        data.setValue(wrap(read(new byte[data.size()], ios.in())).order(LITTLE_ENDIAN).getChar());
    }

    @Override
    public void write(Cell<Character> data, InputOutputStream inputOutputStream) {
        write(
            ByteBuffer.allocate(data.size()).order(LITTLE_ENDIAN).putChar(data.getValue()).array(),
            inputOutputStream.out()
        );
    }
}
