package info.setmy.low.io.core.models.records.cells;

import info.setmy.low.io.core.io.InputOutputStream;
import info.setmy.low.io.core.io.OrderedInputOutputStream;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import static lombok.AccessLevel.PROTECTED;

@Getter
@Setter
@RequiredArgsConstructor(access = PROTECTED)
public abstract class Cell<T> {

    private final OrderedInputOutputStream<T> orderedInputOutputStream;

    private T value;

    public abstract int size();

    public void read(InputOutputStream inputOutputStream) {
        orderedInputOutputStream.read(this, inputOutputStream);
    }

    public void write(InputOutputStream inputOutputStream) {
        orderedInputOutputStream.write(this, inputOutputStream);
    }
}
