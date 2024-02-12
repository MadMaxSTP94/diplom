package com.liiga.hockeysite.repositories.stats.skaterstats;

import com.liiga.hockeysite.model.stats.skaterstats.SkaterStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkaterStatsRepository extends JpaRepository<SkaterStats, Long> {
}
