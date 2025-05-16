package info.setmy.low.io.core.models.records;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.models.records.cells.Cell;
import lombok.Getter;

@Getter
public class VariableValue<T> extends Named {

    private final Cell<T> value;

    public VariableValue(final String name, final Cell<T> value) {
        super(name);
        this.value = value;
    }

    public void read(InputOutputStream inputOutputStream) {
        value.read(inputOutputStream);
    }

    public void write(InputOutputStream inputOutputStream) {
        value.write(inputOutputStream);
    }
}
