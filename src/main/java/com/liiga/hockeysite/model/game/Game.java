package com.liiga.hockeysite.model.game;

import com.liiga.hockeysite.model.game.enums.GameStatus;
import com.liiga.hockeysite.model.game.enums.Tournament;
import com.liiga.hockeysite.model.season.Season;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "games")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Game {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime date;
    private LocalDateTime time;
    private int attendance;
    @OneToOne
    @JoinColumn(name = "season_id")
    private Season season;
    @Enumerated(EnumType.STRING)
    private GameStatus status;
    @Enumerated(EnumType.STRING)
    private Tournament tournament;

}
