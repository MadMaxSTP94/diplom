package com.liiga.hockeysite.model.player;

import com.liiga.hockeysite.model.player.enums.PlayerCatches;
import com.liiga.hockeysite.model.player.enums.PlayerNationality;
import com.liiga.hockeysite.model.position.Position;
import com.liiga.hockeysite.model.team.Team;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "players")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    private String name;
    private String surname;
    @Enumerated(EnumType.STRING)
    private PlayerNationality nationality;
    @Column(name = "photo_url")
    private String photoUrl;
    @Column(name = "jersey_number")
    private int jerseyNumber;
    @Column(name = "date_of_birth")
    private LocalDateTime dateOfBirth;
    @Enumerated(EnumType.STRING)
    private PlayerCatches catches;
    @ManyToMany
    @JoinTable(name = "players_positions",
               joinColumns = @JoinColumn(name = "player_id"),
               inverseJoinColumns = @JoinColumn(name = "position_id"))
    private List<Position> positions;
    private int height;
    private int weight;

}
