package info.setmy.low.io.core.models;

import info.setmy.low.io.core.models.steps.Step;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Builder(toBuilder = true)
public class Protocol {

    private final List<Step> steps = new ArrayList<>();
    private final String startStepName;

    public Protocol step(final Step step) {
        step.setProtocol(this);
        steps.add(step);
        return this;
    }

    public Step getStartStep() {
        return findStep(startStepName).orElseThrow(() -> new RuntimeException("Start step not found"));
    }

    public Optional<Step> getStartStepOptional() {
        return findStep(startStepName);
    }

    public Optional<Step> findStep(final String name) {
        return steps.stream()
            .filter(step -> step.getName().equals(name))
            .findFirst();
    }
}
