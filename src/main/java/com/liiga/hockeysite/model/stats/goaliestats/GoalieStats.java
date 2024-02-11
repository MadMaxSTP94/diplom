package com.liiga.hockeysite.model.stats.goaliestats;

import com.liiga.hockeysite.model.stats.playerstats.PlayerStats;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "goalie_stats")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class GoalieStats {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn(name = "player_stats_id")
    private PlayerStats playerStats;
    private int savesCount;
    private int shotsFaced;
    private int goalsAgainst;
}
