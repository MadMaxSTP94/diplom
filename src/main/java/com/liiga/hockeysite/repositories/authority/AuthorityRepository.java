package com.liiga.hockeysite.repositories.authority;

import com.liiga.hockeysite.model.authority.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
