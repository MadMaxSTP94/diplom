package com.liiga.hockeysite.repositories.position;

import com.liiga.hockeysite.model.position.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Integer> {
}
