package info.setmy.io.lib.models;

import info.setmy.io.lib.models.steps.Step;
import lombok.Builder;

import java.util.*;

@Builder(toBuilder = true)
public class Protocol {

    private final List<Step> steps = new ArrayList<>();
    private final Map<String, Objects> variables = new HashMap<>();
    private final String startStepName;

    public Protocol add(final Step step) {
        step.setProtocol(this);
        steps.add(step);
        return this;
    }
}
