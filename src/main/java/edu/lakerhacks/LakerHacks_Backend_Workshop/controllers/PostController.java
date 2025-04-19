package edu.lakerhacks.LakerHacks_Backend_Workshop.controllers;

import edu.lakerhacks.LakerHacks_Backend_Workshop.models.Comment;
import edu.lakerhacks.LakerHacks_Backend_Workshop.models.Post;
import edu.lakerhacks.LakerHacks_Backend_Workshop.models.User;
import edu.lakerhacks.LakerHacks_Backend_Workshop.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("add-post")
    public ResponseEntity<Post> addUser(@RequestBody Post post) {
        postService.addPost(post);
        return ResponseEntity.ok(post);
    }

    @PostMapping("add-comment")
    public ResponseEntity<Comment> addComment(@RequestBody Post post, Comment comment){
        postService.addComment(post, comment);
        return ResponseEntity.ok(comment);
    }

}
