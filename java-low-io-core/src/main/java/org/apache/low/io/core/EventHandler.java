package org.apache.low.io.core;

import org.apache.low.io.core.models.EventData;

public interface EventHandler {

    void handleEvent(final EventData eventData);
}
