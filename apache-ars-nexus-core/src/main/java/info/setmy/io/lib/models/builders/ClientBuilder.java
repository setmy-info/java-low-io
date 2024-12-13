package info.setmy.io.lib.models.builders;

import info.setmy.io.lib.models.Protocol;
import info.setmy.io.lib.models.instances.ClientProtocolInstance;
import info.setmy.io.lib.models.instances.ProtocolInstance;
import info.setmy.io.lib.models.steps.ReadStep;
import info.setmy.io.lib.models.steps.WriteStep;

public class ClientBuilder implements ProtocolBuilder {
    @Override
    public ProtocolInstance build() {
        Protocol protocol = Protocol.builder()
            .startStepName("read")
            .build();
        protocol
            .add(ReadStep.builder().name("read").build())
            .add(WriteStep.builder().name("write").build());
        ClientProtocolInstance protocolInstance = ClientProtocolInstance.builder()
            .protocol(protocol)
            .build();
        return protocolInstance;
    }
}
