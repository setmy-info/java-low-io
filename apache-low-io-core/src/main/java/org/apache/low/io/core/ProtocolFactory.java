package org.apache.low.io.core;

import org.apache.low.io.core.models.instances.ProtocolInstance;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;
import static org.apache.commons.lang3.StringUtils.isBlank;

public final class ProtocolFactory {

    private static final ProtocolFactory INSTANCE = new ProtocolFactory();

    // Just demo. Registered builders for creating instances.
    private final Map<String, ProtocolInstanceBuilder> protocolBuilders = new HashMap<>();

    public static ProtocolFactory getInstance() {
        return INSTANCE;
    }

    public void register(final ProtocolInstanceBuilder builder) {
        protocolBuilders.put(builder.name(), builder);
    }

    public Optional<ProtocolInstance> newProtocolInstance(final String protocolName) {
        if (isBlank(protocolName)) {
            return empty();
        }
        return of(protocolBuilders.get(protocolName).build());
    }
}
