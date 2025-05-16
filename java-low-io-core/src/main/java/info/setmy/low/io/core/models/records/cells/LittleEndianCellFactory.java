package info.setmy.low.io.core.models.records.cells;

public class LittleEndianCellFactory implements CellFactory {

    private final static LittleEndianCellFactory INSTANCE = new LittleEndianCellFactory();

    public static LittleEndianCellFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public ByteCell newByteCell() {
        return ByteCell.newLittleEndianCell();
    }

    @Override
    public CharacterCell newCharacterCell() {
        return CharacterCell.newLittleEndianCell();
    }

    @Override
    public IntegerCell newIntegerCell() {
        return IntegerCell.newLittleEndianCell();
    }

    @Override
    public ShortCell newShortCell() {
        return ShortCell.newLittleEndianCell();
    }

    //TODO: other types
}
