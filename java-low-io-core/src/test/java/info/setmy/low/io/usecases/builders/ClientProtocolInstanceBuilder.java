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
            .step(new WriteStep(
                    "write",
                    writeRules,
                    null,
                    WriteStepConfig.builder().build()
                )
            )
            .step(new ReadStep(
                    "read",
                    readRules,
                    null,
                    ReadStepConfig.builder().build()
                )
            );
        final ClientProtocolInstance protocolInstance = ClientProtocolInstance.builder()
            .protocol(protocol)
            .build();
        return protocolInstance;
    }
}
