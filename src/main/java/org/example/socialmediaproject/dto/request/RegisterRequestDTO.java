package org.example.socialmediaproject.dto.request;

import lombok.Data;
import org.example.socialmediaproject.role.Role;

@Data
public class RegisterRequestDTO {
    private String username;
    private String password;
    private Role role;
}
