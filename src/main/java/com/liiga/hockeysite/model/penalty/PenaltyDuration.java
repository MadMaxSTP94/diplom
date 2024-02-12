package com.liiga.hockeysite.model.penalty;

import com.liiga.hockeysite.model.penalty.enums.PenaltyDurationValue;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "penalty_durations")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class PenaltyDuration {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "penalty_duration_value")
    @Enumerated(EnumType.STRING)
    private PenaltyDurationValue penaltyDurationValue;
}
