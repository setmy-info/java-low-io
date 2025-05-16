package info.setmy.low.io.core.models.records.cells;

public class BigEndianCellFactory implements CellFactory {

    private final static BigEndianCellFactory INSTANCE = new BigEndianCellFactory();

    public static BigEndianCellFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public ByteCell newByteCell() {
        return ByteCell.newBigEndianCell();
    }

    @Override
    public CharacterCell newCharacterCell() {
        return CharacterCell.newBigEndianCell();
    }

    @Override
    public IntegerCell newIntegerCell() {
        return IntegerCell.newBigEndianCell();
    }

    @Override
    public ShortCell newShortCell() {
        return ShortCell.newBigEndianCell();
    }

    //TODO: other types
}
