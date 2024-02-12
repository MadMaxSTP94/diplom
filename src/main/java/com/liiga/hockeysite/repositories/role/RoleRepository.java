package com.liiga.hockeysite.repositories.role;

import com.liiga.hockeysite.model.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
