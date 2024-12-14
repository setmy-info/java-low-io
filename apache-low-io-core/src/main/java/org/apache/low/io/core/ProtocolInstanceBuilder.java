package org.apache.low.io.core;

import org.apache.low.io.core.models.instances.ProtocolInstance;

public interface ProtocolInstanceBuilder {

    String name();

    ProtocolInstance build();
}
