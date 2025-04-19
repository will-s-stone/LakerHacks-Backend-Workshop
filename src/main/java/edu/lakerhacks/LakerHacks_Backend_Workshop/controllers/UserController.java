package edu.lakerhacks.LakerHacks_Backend_Workshop.controllers;


import edu.lakerhacks.LakerHacks_Backend_Workshop.models.User;
import edu.lakerhacks.LakerHacks_Backend_Workshop.services.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("add-user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userService.addUser(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping("get-user")
    public ResponseEntity<User> getUser(@RequestBody String username) {
        User user = userService.getUserByUsername(username);
        return ResponseEntity.ok(user);
    }

}
