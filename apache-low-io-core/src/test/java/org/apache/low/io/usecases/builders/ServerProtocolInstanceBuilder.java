package org.apache.low.io.usecases.builders;

import org.apache.low.io.core.ProtocolInstanceBuilder;
import org.apache.low.io.core.models.Protocol;
import org.apache.low.io.core.models.instances.ProtocolInstance;
import org.apache.low.io.core.models.instances.ServerProtocolInstance;
import org.apache.low.io.core.models.steps.*;

import java.util.ArrayList;
import java.util.List;

public record ServerProtocolInstanceBuilder(String name) implements ProtocolInstanceBuilder {

    @Override
    public ProtocolInstance build() {
        final List<Rule> writeRules = new ArrayList<>();
        final List<Rule> readRules = new ArrayList<>();

        final Protocol protocol = Protocol.builder()
            .startStepName("read")
            .build();
        protocol
            .step(ReadStep.builder()
                .name("read")
                .config(ReadStepConfig.builder()
                    .build()
                )
                .flowRules(readRules)
                .build()
            )
            .step(WriteStep.builder()
                .name("write")
                .config(WriteStepConfig.builder()
                    .build()
                )
                .flowRules(writeRules)
                .build()
            );
        final ServerProtocolInstance protocolInstance = ServerProtocolInstance.builder()
            .protocol(protocol)
            .build();
        return protocolInstance;
    }
}
