package info.setmy.low.io.core.models.records.cells;

import info.setmy.low.io.core.io.OrderedInputOutputStream;

import static info.setmy.low.io.core.io.SelectedInputOutputStream.BIG_ENDIAN;
import static info.setmy.low.io.core.io.SelectedInputOutputStream.LITTLE_ENDIAN;


public class CharacterCell extends Cell<Character> {

    //TODO: by protocol endianness allocation class/methods/lambdas?
    public static CharacterCell newBigEndianCell() {
        return new CharacterCell(BIG_ENDIAN.characterOrderedInputOutputStream());
    }

    public static CharacterCell newLittleEndianCell() {
        return new CharacterCell(LITTLE_ENDIAN.characterOrderedInputOutputStream());
    }

    private CharacterCell(OrderedInputOutputStream<Character> stream) {
        super(stream);
    }

    @Override
    public int size() {
        return 2;
    }
}
