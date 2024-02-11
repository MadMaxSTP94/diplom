package com.liiga.hockeysite.model.user;

import com.liiga.hockeysite.model.role.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String username;
    private String email;
    private String password;
    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
