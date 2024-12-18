package info.setmy.low.io.usecases.builders;

import info.setmy.low.io.core.ProtocolInstanceBuilder;
import info.setmy.low.io.core.models.Protocol;
import info.setmy.low.io.core.models.instances.ClientProtocolInstance;
import info.setmy.low.io.core.models.instances.ProtocolInstance;
import info.setmy.low.io.core.models.steps.*;

public class ClientProtocolInstanceBuilder implements ProtocolInstanceBuilder {

    public String getName() {
        return "client";
    }

    @Override
    public ProtocolInstance build() {
        final Rules writeRules = new Rules();
        final Rules readRules = new Rules();

        final Protocol protocol = Protocol.builder()
            .startStepName("write")
            .build();
        protocol
            .step(WriteStep.builder()
                .name("write")
                .writeStepConfig(WriteStepConfig.builder()
                    .build()
                )
                .rules(writeRules)
                .build()
            )
            .step(ReadStep.builder()
                .name("read")
                .readStepConfig(ReadStepConfig.builder()
                    .build()
                )
                .rules(readRules)
                .build()
            );
        final ClientProtocolInstance protocolInstance = ClientProtocolInstance.builder()
            .protocol(protocol)
            .build();
        return protocolInstance;
    }
}
