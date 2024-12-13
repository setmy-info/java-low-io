package info.setmy.io.lib.models.steps;

import info.setmy.io.lib.models.Protocol;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@SuperBuilder(toBuilder = true)
public abstract class Step {

    private final String name;
    private final StepConfig stepConfig;
    private Protocol protocol;
}
