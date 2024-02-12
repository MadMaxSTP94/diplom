package com.liiga.hockeysite.repositories.season;

import com.liiga.hockeysite.model.season.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository<Season, Integer> {
}
