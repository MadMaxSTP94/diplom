package com.liiga.hockeysite.model.event.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EventName {
    EVENT_NAME_PENALTY("PENALTY"),
    EVENT_NAME_PLAYER_BLOCKED("PLAYER_BLOCKED"),
    EVENT_NAME_MISSED_SHOT("MISSED_SHOT"),
    EVENT_NAME_GOAL("GOAL"),
    EVENT_NAME_GOALIE_SAVED("GOALIE_SAVED"),
    EVENT_NAME_GOALIE_OUT("GOALIE_OUT");
    private final String eventName;
}
