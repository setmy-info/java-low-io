package info.setmy.low.io.core.models.records.cells;

public interface CellFactory {

    ByteCell newByteCell();

    CharacterCell newCharacterCell();

    IntegerCell newIntegerCell();

    ShortCell newShortCell();
}
