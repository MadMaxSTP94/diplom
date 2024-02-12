package com.liiga.hockeysite.model.roster;

import com.liiga.hockeysite.model.player.Player;
import com.liiga.hockeysite.model.roster.enums.GameLineName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "team_line")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class TeamLine {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToMany
    @JoinTable(name = "team_line_players",
            joinColumns = @JoinColumn(name = "line_id"),
            inverseJoinColumns = @JoinColumn(name = "player_id"))
    private List<Player> players;
    @Column(name = "game_line")
    @Enumerated(EnumType.STRING)
    private GameLineName gameLine;
}
