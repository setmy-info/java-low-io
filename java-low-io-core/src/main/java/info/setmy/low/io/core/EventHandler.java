package info.setmy.low.io.core;

import info.setmy.low.io.core.models.EventData;

public interface EventHandler {

    void handleEvent(final EventData eventData);
}
