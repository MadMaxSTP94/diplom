package com.liiga.hockeysite.model.stats.playerstats;

import com.liiga.hockeysite.model.game.Game;
import com.liiga.hockeysite.model.penalty.Penalty;
import com.liiga.hockeysite.model.player.Player;
import com.liiga.hockeysite.model.position.Position;
import com.liiga.hockeysite.model.season.Season;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "player_stats")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class PlayerStats {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
    @OneToOne
    @JoinColumn(name = "game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;
    @OneToOne
    @JoinColumn(name = "position_id")
    private Position position;
    @Column(name = "ice_time")
    private LocalTime iceTime;
    @ManyToMany
    @JoinTable(name = "players_penalties",
               joinColumns = @JoinColumn(name = "player_stat_id"),
               inverseJoinColumns = @JoinColumn(name = "penalty_id"))
    private List<Penalty> penaltyList;
}
