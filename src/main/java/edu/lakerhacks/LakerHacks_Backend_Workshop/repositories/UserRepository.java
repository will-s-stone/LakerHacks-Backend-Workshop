package edu.lakerhacks.LakerHacks_Backend_Workshop.repositories;

import edu.lakerhacks.LakerHacks_Backend_Workshop.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
