package info.setmy.io.lib.models;

import lombok.Builder;

@Builder(toBuilder = true)
public record ServerConfig(String host, int port, String protocolName) {
}
