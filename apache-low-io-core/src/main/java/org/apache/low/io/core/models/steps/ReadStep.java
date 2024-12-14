package org.apache.low.io.core.models.steps;

import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
public class ReadStep extends Step {

    public ReadStepConfig getReadStepConfig() {
        return (ReadStepConfig) getConfig();
    }
}
