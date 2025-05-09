package info.setmy.low.io.core.models.records.cells;

public class CharacterCell extends Cell<Character> {

    protected CharacterCell(final Character value) {
        super(value);
    }

    @Override
    public int size() {
        return 2;
    }
}
