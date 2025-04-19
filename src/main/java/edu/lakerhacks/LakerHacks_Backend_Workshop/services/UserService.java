package edu.lakerhacks.LakerHacks_Backend_Workshop.services;

import edu.lakerhacks.LakerHacks_Backend_Workshop.models.User;
import edu.lakerhacks.LakerHacks_Backend_Workshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user){
        if (userRepository.existsById(user.getUsername())){
            userRepository.save(user);
        }
        return user;
    }

}
