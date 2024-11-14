package org.example.socialmediaproject.dto.response;

import lombok.Data;
import org.example.socialmediaproject.model.UserModel;

import java.util.UUID;

@Data
public class PostResponseDTO {
    private UUID id;
    private String user;
    private String content;

    public PostResponseDTO(UUID id, UserModel user, String content){
        this.id = id;
        this.user = user.getUsername();
        this.content = content;
    }
}
