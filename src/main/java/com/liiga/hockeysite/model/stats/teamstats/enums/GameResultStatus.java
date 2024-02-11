package com.liiga.hockeysite.model.stats.teamstats.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GameResultStatus {
    GAME_STATUS_WIN("WIN"),
    GAME_STATUS_LOSE("LOSE"),
    GAME_STATUS_OT_WIN("OT_WIN"),
    GAME_STATUS_OT_LOSE("OT_LOSE"),
    GAME_STATUS_SO_WIN("SO_WIN"),
    GAME_STATUS_SO_LOSE("SO_LOSE");
    private final String value;
}