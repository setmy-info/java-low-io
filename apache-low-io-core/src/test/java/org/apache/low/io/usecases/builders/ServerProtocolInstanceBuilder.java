package org.apache.low.io.usecases.builders;

import org.apache.low.io.core.ProtocolInstanceBuilder;
import org.apache.low.io.core.models.Protocol;
import org.apache.low.io.core.models.instances.ProtocolInstance;
import org.apache.low.io.core.models.instances.ServerProtocolInstance;
import org.apache.low.io.core.models.steps.ReadStep;
import org.apache.low.io.core.models.steps.WriteStep;

public record ServerProtocolInstanceBuilder(String name) implements ProtocolInstanceBuilder {

    @Override
    public ProtocolInstance build() {
        final Protocol protocol = Protocol.builder()
            .startStepName("write")
            .build();
        protocol
            .add(WriteStep.builder().name("write").build())
            .add(ReadStep.builder().name("read").build());
        final ServerProtocolInstance protocolInstance = ServerProtocolInstance.builder()
            .protocol(protocol)
            .build();
        return protocolInstance;
    }
}
