package info.setmy.low.io.core.io;

import info.setmy.low.io.core.models.records.cells.Cell;
import lombok.Builder;

@Builder(toBuilder = true)
public abstract class OrderedInputOutputStream<T> {

    public abstract Cell<T> read(InputOutputStream ios);

    public abstract void write(Cell<T> data, InputOutputStream toInputOutputStream);
}
