package org.example.socialmediaproject.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.socialmediaproject.dto.response.FeedResponseDTO;
import org.example.socialmediaproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedService {

    @Autowired
    PostRepository postRepository;

    private static final Logger LOGGER = LogManager.getLogger();

    public List<FeedResponseDTO> feed(){
        LOGGER.info("Loading feed...");
        return postRepository.findAll().stream().map(FeedResponseDTO::new).toList();
    }
}
