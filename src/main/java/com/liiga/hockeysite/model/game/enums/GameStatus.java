package com.liiga.hockeysite.model.game.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GameStatus {
    GAME_STATUS_1ST("1ST"),
    GAME_STATUS_2ND("2ND"),
    GAME_STATUS_3RD("3RD"),
    GAME_STATUS_OT("OT"),
    GAME_STATUS_SO("SO");
    private final String value;
}
