package info.setmy.io.lib.models;

import info.setmy.io.lib.models.builders.ClientBuilder;
import info.setmy.io.lib.models.builders.ProtocolBuilder;
import info.setmy.io.lib.models.builders.ServerBuilder;
import info.setmy.io.lib.models.instances.ProtocolInstance;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;
import static org.apache.commons.lang3.StringUtils.isBlank;

public final class ProtocolFactory {

    // Just demo. Registered builders for creating instances.
    private final static Map<String, ProtocolBuilder> protocolBuilders;

    static {
        protocolBuilders = new HashMap<>();
        protocolBuilders.put("server", new ServerBuilder());
        protocolBuilders.put("client", new ClientBuilder());
    }

    public static Optional<ProtocolInstance> newInstance(final String protocolName) {
        if (isBlank(protocolName)) {
            return empty();
        }
        return of(protocolBuilders.get(protocolName).build());
    }
}
