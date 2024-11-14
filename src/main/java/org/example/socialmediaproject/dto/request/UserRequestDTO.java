package org.example.socialmediaproject.dto.request;

import lombok.Data;
import org.example.socialmediaproject.model.PostModel;

import java.util.Set;


@Data
public class UserRequestDTO {
    private Long id;
    private String username;
    private String password;
    private Set<PostModel> post;
}