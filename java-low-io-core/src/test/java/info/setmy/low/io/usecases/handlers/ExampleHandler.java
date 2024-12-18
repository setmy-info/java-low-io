package info.setmy.low.io.usecases.handlers;

import info.setmy.low.io.core.EventHandler;
import info.setmy.low.io.core.models.EventData;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExampleHandler implements EventHandler {

    @Override
    public void handleEvent(final EventData eventData) {
        log.info(eventData.toString());
    }
}
