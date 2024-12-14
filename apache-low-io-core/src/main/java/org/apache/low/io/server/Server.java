package org.apache.low.io.server;

import lombok.RequiredArgsConstructor;
import org.apache.low.io.core.ProtocolFactory;
import org.apache.low.io.core.models.instances.ProtocolInstance;

@RequiredArgsConstructor
public class Server {

    private final ServerConfig serverConfig;
    private final ProtocolFactory protocolFactory;

    public void start() {
        // TODO : a many things for waiting connection. Connected client gets new server protocol instance and protocol will be started
        ProtocolInstance protocol = newProtocolInstance();
        protocol.run();
    }

    private ProtocolInstance newProtocolInstance() {
        return protocolFactory.newProtocolInstance(serverConfig.protocolName())
            .orElseThrow(() -> new RuntimeException("No server instance found"));
    }
}
