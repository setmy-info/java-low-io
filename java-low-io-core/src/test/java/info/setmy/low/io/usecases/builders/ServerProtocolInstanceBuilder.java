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
            .step(new ReadStep(
                    "read",
                    readRules,
                    null,
                    ReadStepConfig.builder().build()
                )
            )
            .step(new WriteStep(
                    "write",
                    writeRules,
                    null,
                    WriteStepConfig.builder().build()
                )
            );
        final ServerProtocolInstance protocolInstance = ServerProtocolInstance.builder()
            .protocol(protocol)
            .build();
        return protocolInstance;
    }
}
