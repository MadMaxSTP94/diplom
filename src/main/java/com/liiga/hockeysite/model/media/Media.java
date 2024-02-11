package com.liiga.hockeysite.model.media;

import com.liiga.hockeysite.model.media.enums.MediaType;
import com.liiga.hockeysite.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "medias")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Media {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "body_url")
    private String bodyURL;
    @Column(name = "poster_url")
    private String posterURL;
    private String header;
    @Column(name = "creation_date")
    private LocalDateTime creationDate;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User createdBy;
    @Enumerated(EnumType.STRING)
    private MediaType mediaType;
}
