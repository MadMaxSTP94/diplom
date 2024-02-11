package com.liiga.hockeysite.model.stats.teamstats;

import com.liiga.hockeysite.model.game.Game;
import com.liiga.hockeysite.model.season.Season;
import com.liiga.hockeysite.model.stats.teamstats.enums.GameResultStatus;
import com.liiga.hockeysite.model.team.Team;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "team_stats")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class TeamStats {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn(name = "game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    @Enumerated(EnumType.STRING)
    private GameResultStatus gameResultStatus;
    private int goalsFor;
    private int goalsAgainst;
    private int ppAttempts;
    private int pkAttempts;
    private int ppGoals;
    private int pkGoals;
}
