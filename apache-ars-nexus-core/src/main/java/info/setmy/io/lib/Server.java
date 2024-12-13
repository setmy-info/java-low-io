package info.setmy.io.lib;

import info.setmy.io.lib.models.ServerConfig;
import info.setmy.io.lib.models.instances.ProtocolInstance;
import lombok.RequiredArgsConstructor;

import static info.setmy.io.lib.models.ProtocolFactory.newInstance;

@RequiredArgsConstructor
public class Server {

    private final ServerConfig serverConfig;

    public static Server newServer(final ServerConfig serverConfig) {
        return new Server(serverConfig);
    }

    private ProtocolInstance newProtocolInstance() {
        return newInstance(serverConfig.protocolName())
            .orElseThrow(() -> new RuntimeException("No server instance found"));
    }

    public void start() {
        // TODO : a many things for waiting connection. Connected client gets new server protocol instance and protocol will be started
        ProtocolInstance protocol = newProtocolInstance();
        protocol.run();
    }
}
