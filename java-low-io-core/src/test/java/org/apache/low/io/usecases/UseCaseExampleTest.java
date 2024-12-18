package org.apache.low.io.server;

import org.apache.low.io.core.ProtocolFactory;
import org.apache.low.io.core.models.instances.ProtocolInstance;
import org.apache.low.io.usecases.builders.ClientProtocolInstanceBuilder;
import org.apache.low.io.usecases.builders.ServerProtocolInstanceBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class UseCaseExampleTest {

    Server server;
    ProtocolFactory protocolFactory;
    Optional<ProtocolInstance> clientProtocolInstance;

    @BeforeEach
    void setUp() {
        protocolFactory = ProtocolFactory.getInstance();
        protocolFactory.register(new ServerProtocolInstanceBuilder());
        protocolFactory.register(new ClientProtocolInstanceBuilder());

        server = new Server(
            ServerConfig.builder()
                .protocolName("server")
                .host("localhost")
                .port(4231)
                .build(),
            protocolFactory
        );
    }

    @Test
    void testProtocol() {
        server.start();

        clientProtocolInstance = protocolFactory.newProtocolInstance("client");
        clientProtocolInstance.ifPresent(protocolInstance -> {
            protocolInstance.run();
        });
    }
}