package com.liiga.hockeysite.model.game.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Tournament {
    TOURNAMENT_REGULAR_SEASON("REGULAR"),
    TOURNAMENT_PLAYOFFS("PLAYOFFS");
    private final String value;
}
