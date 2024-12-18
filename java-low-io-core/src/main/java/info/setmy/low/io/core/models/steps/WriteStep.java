package info.setmy.low.io.core.models.steps;

import info.setmy.low.io.core.models.Protocol;
import lombok.Getter;

@Getter
public class WriteStep extends Step {

    private final WriteStepConfig writeStepConfig;

    public WriteStep(
        final String name,
        final Rules rules,
        final Protocol protocol,
        final WriteStepConfig writeStepConfig
    ) {
        super(name, rules, protocol);
        this.writeStepConfig = writeStepConfig;
    }

    @Override
    public Step withProtocol(final Protocol protocol) {
        return new WriteStep(getName(), getRules(), protocol, writeStepConfig);
    }
}
