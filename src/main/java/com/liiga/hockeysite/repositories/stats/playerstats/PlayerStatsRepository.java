package com.liiga.hockeysite.repositories.stats.playerstats;

import com.liiga.hockeysite.model.stats.playerstats.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerStatsRepository extends JpaRepository<PlayerStats, Long> {
}
