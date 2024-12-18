package info.setmy.low.io.core.models.steps;

import info.setmy.low.io.core.models.Protocol;
import lombok.Getter;

@Getter
public class ReadStep extends Step {

    private final ReadStepConfig readStepConfig;

    public ReadStep(
        final String name,
        final Rules rules,
        final Protocol protocol,
        final ReadStepConfig readStepConfig
    ) {
        super(name, rules, protocol);
        this.readStepConfig = readStepConfig;
    }

    @Override
    public Step withProtocol(final Protocol protocol) {
        return new ReadStep(getName(), getRules(), protocol, readStepConfig);
    }
}
