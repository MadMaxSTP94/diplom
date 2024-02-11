package com.liiga.hockeysite.model.role;

import com.liiga.hockeysite.model.authority.Authority;
import com.liiga.hockeysite.model.role.enums.RoleName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Role {
    @Id
    @GeneratedValue
    private int id;
    @Enumerated(EnumType.STRING)
    private RoleName name;
    @ManyToMany
    @JoinTable(name = "rolesAuthorities",
              joinColumns = @JoinColumn(name = "role_id"),
              inverseJoinColumns = @JoinColumn(name = "authority_id"))
    private List<Authority> authorityList;
}
