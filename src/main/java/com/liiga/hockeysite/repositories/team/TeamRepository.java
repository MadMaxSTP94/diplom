package com.liiga.hockeysite.repositories.team;

import com.liiga.hockeysite.model.team.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
