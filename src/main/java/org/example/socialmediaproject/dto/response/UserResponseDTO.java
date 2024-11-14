package org.example.socialmediaproject.dto.response;

import lombok.Data;
import org.example.socialmediaproject.model.PostModel;

import java.util.List;

@Data
public class UserResponseDTO {
    private Long id;
    private String username;
    private List<PostModel> userPosts;
}
