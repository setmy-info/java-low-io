package org.apache.low.io.core.models.steps;

import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.apache.low.io.core.models.Protocol;

@Setter
@SuperBuilder(toBuilder = true)
public abstract class Step {

    private final String name;
    private final StepConfig stepConfig;
    private Protocol protocol;
}
