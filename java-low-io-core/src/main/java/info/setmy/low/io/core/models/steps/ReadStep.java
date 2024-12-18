package info.setmy.low.io.core.models.steps;

import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
public class ReadStep extends Step {

    private final ReadStepConfig readStepConfig;
}
