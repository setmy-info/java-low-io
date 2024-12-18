package org.apache.low.io.usecases.handlers;

import lombok.extern.slf4j.Slf4j;
import org.apache.low.io.core.EventHandler;
import org.apache.low.io.core.models.EventData;

@Slf4j
public class ExampleHandler implements EventHandler {

    @Override
    public void handleEvent(final EventData eventData) {
        log.info(eventData.toString());
    }
}
