package org.apache.low.io.core.models.steps;

import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
public class WriteStep extends Step {

    public WriteStepConfig getWriteStepConfig() {
        return (WriteStepConfig) getConfig();
    }
}
