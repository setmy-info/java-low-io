package info.setmy.io.lib.models.instances;

import info.setmy.io.lib.models.Protocol;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

/*
 * Protocol runner and instance object.
 * */
@Slf4j
@SuperBuilder(toBuilder = true)
public abstract class ProtocolInstance {

    private final Protocol protocol;

    public void run() {
        log.info("ProtocolInstance running");
        log.info("TODO : run steps running");
    }
}
