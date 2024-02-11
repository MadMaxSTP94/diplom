package com.liiga.hockeysite.model.position;

import com.liiga.hockeysite.model.position.enums.PositionName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "positions")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Position {
    @Id
    @GeneratedValue
    private Integer id;
    @Enumerated(EnumType.STRING)
    private PositionName name;
}
