package com.liiga.hockeysite.model.team;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "teams")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Team {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String logoUrl;
    private String infoUrl;
}
