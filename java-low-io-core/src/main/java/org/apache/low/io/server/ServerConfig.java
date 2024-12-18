package org.apache.low.io.server;

import lombok.Builder;

@Builder(toBuilder = true)
public record ServerConfig(String host, int port, String protocolName) {
}
