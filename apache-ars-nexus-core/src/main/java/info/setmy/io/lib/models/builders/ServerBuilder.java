package info.setmy.io.lib.models.builders;

import info.setmy.io.lib.models.Protocol;
import info.setmy.io.lib.models.instances.ProtocolInstance;
import info.setmy.io.lib.models.instances.ServerProtocolInstance;
import info.setmy.io.lib.models.steps.ReadStep;
import info.setmy.io.lib.models.steps.WriteStep;

public class ServerBuilder implements ProtocolBuilder {

    @Override
    public ProtocolInstance build() {
        Protocol protocol = Protocol.builder()
            .startStepName("write")
            .build();
        protocol
            .add(WriteStep.builder().name("write").build())
            .add(ReadStep.builder().name("read").build());
        ServerProtocolInstance protocolInstance = ServerProtocolInstance.builder()
            .protocol(protocol)
            .build();
        return protocolInstance;
    }
}
