package com.liiga.hockeysite.model.penalty;

import com.liiga.hockeysite.model.penalty.enums.PenaltyName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "penalties")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Penalty {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "penalty_name")
    @Enumerated(EnumType.STRING)
    private PenaltyName penaltyName;
    @ManyToMany
    @JoinTable(name = "penalty_durations_joint",
               joinColumns = @JoinColumn(name = "penalty_id"),
               inverseJoinColumns = @JoinColumn(name = "duration_id"))
    private List<PenaltyDuration> penaltyDurationValue;
}
