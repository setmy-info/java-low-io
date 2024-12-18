package info.setmy.low.io.core.models.records.cells;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Cell<T> {

    private final T value;
}
