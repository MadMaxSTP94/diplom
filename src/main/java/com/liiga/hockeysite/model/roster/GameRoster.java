package com.liiga.hockeysite.model.roster;

import com.liiga.hockeysite.model.game.Game;
import com.liiga.hockeysite.model.team.Team;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "game_rosters")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class GameRoster {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    @ManyToMany
    @JoinTable(name = "game_roster_lines",
            joinColumns = @JoinColumn(name = "roster_id"),
            inverseJoinColumns = @JoinColumn(name = "line_id"))
    private List<TeamLine> gameLines;
}
