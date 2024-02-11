package com.liiga.hockeysite.model.season;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "seasons")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Season {
    @Id
    @GeneratedValue
    private Integer id;
    private String value;
}
