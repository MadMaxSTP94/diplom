package com.liiga.hockeysite.model.authority;

import com.liiga.hockeysite.model.authority.enums.AuthorityName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "authority")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Authority {
    @Id
    @GeneratedValue
    private Integer id;
    @Enumerated(EnumType.STRING)
    private AuthorityName name;
}
