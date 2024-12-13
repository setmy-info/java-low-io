package info.setmy.io.lib.models.instances;

import info.setmy.io.lib.Server;
import info.setmy.io.lib.models.ServerConfig;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static info.setmy.io.lib.models.ProtocolFactory.newInstance;

class ProtocolInstanceTest {

    Server server;
    Optional<ProtocolInstance> clientProtocolInstance;

    @Test
    void testProtocol() {
        server = Server.newServer(
            ServerConfig.builder()
                .protocolName("server")
                .host("localhost")
                .port(4231)
                .build()
        );

        clientProtocolInstance = newInstance("client");

        server.start();
    }
}