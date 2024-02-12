package com.liiga.hockeysite.model.roster.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GameLineName {
    GAME_LINE_1ST(1),
    GAME_LINE_2ND(2),
    GAME_LINE_3RD(3),
    GAME_LINE_4TH(4),
    GAME_LINE_GOALIES(5);
    private final int value;
}
