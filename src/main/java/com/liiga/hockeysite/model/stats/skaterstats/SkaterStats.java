package com.liiga.hockeysite.model.stats.skaterstats;

import com.liiga.hockeysite.model.stats.playerstats.PlayerStats;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Table(name = "skater_stats")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class SkaterStats {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn(name = "player_stats_id")
    private PlayerStats playerStats;
    private int goals;
    private int assists;
    @Column(name = "penalty_minutes")
    private int penaltyMinutes;
    @Column(name = "plus_minus")
    private int plusMinus;
    @Column(name = "short_handed_goals")
    private int shortHandedGoals;
    @Column(name = "power_play_goals")
    private int powerPlayGoals;
    @Column(name = "face_offs_count")
    private int faceOffsCount;
    @Column(name = "face_offs_wins")
    private int faceOffsWins;
    @Column(name = "shot_top_speed")
    private float shotTopSpeed;
    @Column(name = "skating_top_speed")
    private float skatingTopSpeed;
    @Column(name = "time_on_the_ice")
    private LocalTime timeOnTheIce;
    @Column(name = "total_distance")
    private int totalDistance;
}
