package info.setmy.low.io.core.models.steps;

import info.setmy.low.io.core.models.Protocol;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder(toBuilder = true)
public abstract class Step {

    private final String name;
    private final Rules rules;
    private Protocol protocol;
}
