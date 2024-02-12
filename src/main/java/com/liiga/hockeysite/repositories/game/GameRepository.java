package com.liiga.hockeysite.repositories.game;

import com.liiga.hockeysite.model.game.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
