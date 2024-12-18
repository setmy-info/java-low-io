package info.setmy.low.io.core;

import info.setmy.low.io.core.models.instances.ProtocolInstance;

public interface ProtocolInstanceBuilder {

    String getName();

    ProtocolInstance build();
}
