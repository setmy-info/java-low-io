package org.apache.low.io.usecases.builders;

import org.apache.low.io.core.ProtocolInstanceBuilder;
import org.apache.low.io.core.models.Protocol;
import org.apache.low.io.core.models.instances.ClientProtocolInstance;
import org.apache.low.io.core.models.instances.ProtocolInstance;
import org.apache.low.io.core.models.steps.ReadStep;
import org.apache.low.io.core.models.steps.WriteStep;


public record ClientProtocolInstanceBuilder(String name) implements ProtocolInstanceBuilder {

    @Override
    public ProtocolInstance build() {
        final Protocol protocol = Protocol.builder()
            .startStepName("read")
            .build();
        protocol
            .add(ReadStep.builder().name("read").build())
            .add(WriteStep.builder().name("write").build());
        final ClientProtocolInstance protocolInstance = ClientProtocolInstance.builder()
            .protocol(protocol)
            .build();
        return protocolInstance;
    }
}
