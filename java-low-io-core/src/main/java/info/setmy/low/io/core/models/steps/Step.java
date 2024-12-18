package info.setmy.low.io.core.models.steps;

import info.setmy.low.io.core.models.Protocol;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public abstract class Step {

    private final String name;
    private final Rules rules;
    private final Protocol protocol;

    public abstract Step withProtocol(final Protocol protocol);
}
