package org.apache.low.io.core.models.steps;

import lombok.Builder.Default;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.apache.low.io.core.models.Protocol;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@SuperBuilder(toBuilder = true)
public abstract class Step {

    private final String name;
    private final StepConfig config;
    @Default
    private final List<Rule> flowRules = new ArrayList<>();
    private Protocol protocol;

    /*
    public Step rule(final Rule rule) {
        flowRules.add(rule);
        return this;
    }

    public Step rules(final List<Rule> rules) {
        flowRules.addAll(rules);
        return this;
    }
    */
}
