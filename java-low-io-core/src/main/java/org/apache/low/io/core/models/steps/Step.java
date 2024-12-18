package org.apache.low.io.core.models.steps;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.apache.low.io.core.models.Protocol;

@Setter
@Getter
@SuperBuilder(toBuilder = true)
public abstract class Step {

    private final String name;
    private final Rules rules;
    private Protocol protocol;
}
