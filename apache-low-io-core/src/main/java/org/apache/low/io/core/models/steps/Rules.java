package org.apache.low.io.core.models.steps;

import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@SuperBuilder
@RequiredArgsConstructor
public class Rules {

    private final List<Rule> flowRules = new ArrayList<>();
}
