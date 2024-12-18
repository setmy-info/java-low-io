package info.setmy.low.io.usecases.builders;

import info.setmy.low.io.core.ProtocolInstanceBuilder;
import info.setmy.low.io.core.models.Protocol;
import info.setmy.low.io.core.models.instances.ProtocolInstance;
import info.setmy.low.io.core.models.instances.ServerProtocolInstance;
import info.setmy.low.io.core.models.steps.*;

public class ServerProtocolInstanceBuilder implements ProtocolInstanceBuilder {

    public String getName() {
        return "server";
    }

    @Override
    public ProtocolInstance build() {
        final Rules writeRules = new Rules();
        final Rules readRules = new Rules();

        final Protocol protocol = Protocol.builder()
            .startStepName("read")
            .build();
        protocol
            .step(ReadStep.builder()
                .name("read")
                .readStepConfig(ReadStepConfig.builder()
                    .build()
                )
                .rules(readRules)
                .build()
            )
            .step(WriteStep.builder()
                .name("write")
                .writeStepConfig(WriteStepConfig.builder()
                    .build()
                )
                .rules(writeRules)
                .build()
            );
        final ServerProtocolInstance protocolInstance = ServerProtocolInstance.builder()
            .protocol(protocol)
            .build();
        return protocolInstance;
    }
}
