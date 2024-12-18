package info.setmy.low.io.core.models.steps;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder(toBuilder = true)
public class WriteStep extends Step {

    private final WriteStepConfig writeStepConfig;
}
