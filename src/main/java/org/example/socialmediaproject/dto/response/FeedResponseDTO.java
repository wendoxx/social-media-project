package org.example.socialmediaproject.dto.response;

import lombok.Data;
import org.example.socialmediaproject.model.PostModel;

import java.util.List;

@Data
public class FeedResponseDTO {
    private List<PostModel> posts;
}
