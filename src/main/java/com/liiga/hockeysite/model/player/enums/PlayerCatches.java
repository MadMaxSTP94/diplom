package com.liiga.hockeysite.model.player.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PlayerCatches {
    PLAYER_CATCHES_RIGHT("RIGHT"),
    PLAYER_CATCHES_LEFT("LEFT");
    private final String value;
}
