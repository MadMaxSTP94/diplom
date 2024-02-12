package com.liiga.hockeysite.repositories.stats.teamstats;

import com.liiga.hockeysite.model.stats.teamstats.TeamStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamStatsRepository extends JpaRepository<TeamStats, Long> {
}
