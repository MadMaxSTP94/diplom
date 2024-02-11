package com.liiga.hockeysite.model.position.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PositionName {
    POSITION_NAME_CENTER("C"),
    POSITION_NAME_RIGHT_WINGER("RW"),
    POSITION_NAME_LEFT_WINGER("LW"),
    POSITION_NAME_DEFENSE("D"),
    POSITION_NAME_GOALIE("G");
    private final String name;
}
