package org.example.socialmediaproject.reprository;

import org.example.socialmediaproject.model.PostModel;
import org.example.socialmediaproject.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostModel, Long> {
    PostModel findAllByUser (UserModel id);
}
