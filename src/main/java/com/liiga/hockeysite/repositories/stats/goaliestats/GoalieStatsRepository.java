package com.liiga.hockeysite.repositories.stats.goaliestats;

import com.liiga.hockeysite.model.stats.goaliestats.GoalieStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalieStatsRepository extends JpaRepository<GoalieStats, Long> {
}
