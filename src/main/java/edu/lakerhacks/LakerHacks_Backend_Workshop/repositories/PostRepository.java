package edu.lakerhacks.LakerHacks_Backend_Workshop.repositories;

import edu.lakerhacks.LakerHacks_Backend_Workshop.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
