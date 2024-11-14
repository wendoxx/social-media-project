package org.example.socialmediaproject.dto.request;

import lombok.Data;
import org.example.socialmediaproject.model.UserModel;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class PostRequestDTO {
    private UUID id;
    private UserModel user;
    private String content;
    private LocalDateTime postedAt;
}
