package org.example.socialmediaproject.repository;

import org.example.socialmediaproject.model.PostModel;
import org.example.socialmediaproject.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<PostModel, UUID> {
    PostModel findAllByUser (UserModel userModel);
}
