package com.liiga.hockeysite.model.event;

import com.liiga.hockeysite.model.event.enums.EventName;
import com.liiga.hockeysite.model.player.Player;

import java.time.LocalTime;

public class Event {
    private Long id;
    private EventName name;
    private LocalTime time;
    private Player player;
}
