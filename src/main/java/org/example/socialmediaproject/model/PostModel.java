package org.example.socialmediaproject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_post")
@Data
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private UserModel user;

    @Column(name = "content")
    private String content;

    @Column(name = "postedAt")
    private LocalDateTime postedAt = LocalDateTime.now();
}
