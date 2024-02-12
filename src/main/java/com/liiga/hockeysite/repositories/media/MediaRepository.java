package com.liiga.hockeysite.repositories.media;

import com.liiga.hockeysite.model.media.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository extends JpaRepository<Media, Long> {
}
