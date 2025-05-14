package info.setmy.low.io.core.models.records;

import info.setmy.low.io.core.models.records.cells.Cell;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Record {

    private final List<Cell> cells = new ArrayList<>();

    public boolean addCell(final Cell cell) {
        return cells.add(cell);
    }
}
