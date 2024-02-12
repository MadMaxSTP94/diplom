package com.liiga.hockeysite.model.penalty.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PenaltyDurationValue {
    PENALTY_DURATION_MINOR(2),
    PENALTY_DURATION_DOUBLE_MINOR(4),
    PENALTY_DURATION_MAJOR(5),
    PENALTY_DURATION_DISCIPLINE(10),
    PENALTY_DURATION_MATCH(25);
    private final Integer duration;
}
