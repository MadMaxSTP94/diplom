package com.liiga.hockeysite.repositories.player;

import com.liiga.hockeysite.model.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
