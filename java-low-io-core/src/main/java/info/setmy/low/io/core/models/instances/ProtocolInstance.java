package info.setmy.low.io.core.models.instances;

import info.setmy.low.io.core.models.Protocol;
import info.setmy.low.io.core.models.steps.Rules;
import info.setmy.low.io.core.models.steps.Step;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 * Protocol runner and instance object.
 * */
@Slf4j
@SuperBuilder(toBuilder = true)
public abstract class ProtocolInstance {

    private final Protocol protocol;
    private final Map<String, Objects> variables = new HashMap<>();

    public void run() {
        log.info("ProtocolInstance running");
        Step step = protocol.getStartStep();
        Rules rules = step.getRules();
        log.info("TODO : run steps running");
    }
}
