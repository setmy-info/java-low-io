package org.apache.low.io.core.models.instances;

import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.low.io.core.models.Protocol;

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
