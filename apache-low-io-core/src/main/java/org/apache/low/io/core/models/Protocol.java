package org.apache.low.io.core.models;

import lombok.Builder;
import org.apache.low.io.core.models.steps.Step;

import java.util.*;

@Builder(toBuilder = true)
public class Protocol {

    private final List<Step> steps = new ArrayList<>();
    private final Map<String, Objects> variables = new HashMap<>();
    private final String startStepName;

    public Protocol step(final Step step) {
        step.setProtocol(this);
        steps.add(step);
        return this;
    }
}
