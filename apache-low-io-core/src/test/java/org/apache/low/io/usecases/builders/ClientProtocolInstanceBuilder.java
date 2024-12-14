package org.apache.low.io.usecases.builders;

import org.apache.low.io.core.ProtocolInstanceBuilder;
import org.apache.low.io.core.models.Protocol;
import org.apache.low.io.core.models.instances.ClientProtocolInstance;
import org.apache.low.io.core.models.instances.ProtocolInstance;
import org.apache.low.io.core.models.steps.*;

import java.util.ArrayList;
import java.util.List;


public record ClientProtocolInstanceBuilder(String name) implements ProtocolInstanceBuilder {

    @Override
    public ProtocolInstance build() {
        final List<Rule> writeRules = new ArrayList<>();
        final List<Rule> readRules = new ArrayList<>();

        final Protocol protocol = Protocol.builder()
            .startStepName("write")
            .build();
        protocol
            .step(WriteStep.builder()
                .name("write")
                .config(WriteStepConfig.builder()
                    .build()
                )
                .flowRules(writeRules)
                .build()
            )
            .step(ReadStep.builder()
                .name("read")
                .config(ReadStepConfig.builder()
                    .build()
                )
                .flowRules(readRules)
                .build()
            );
        final ClientProtocolInstance protocolInstance = ClientProtocolInstance.builder()
            .protocol(protocol)
            .build();
        return protocolInstance;
    }
}
