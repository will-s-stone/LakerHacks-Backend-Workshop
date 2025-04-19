package edu.lakerhacks.LakerHacks_Backend_Workshop.controllers;

import edu.lakerhacks.LakerHacks_Backend_Workshop.models.Comment;
import edu.lakerhacks.LakerHacks_Backend_Workshop.models.Post;
import edu.lakerhacks.LakerHacks_Backend_Workshop.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("add-post")
    public ResponseEntity<Post> addPost(@RequestBody Post post) {
        postService.addPost(post);
        return ResponseEntity.ok(post);
    }


    @GetMapping("get-post")
    public ResponseEntity<Post> getPostById(@RequestParam String id) {
        Post post = postService.getPost(id);
        return ResponseEntity.ok(post);
    }

    @PostMapping("add-comment")
    public ResponseEntity<Comment> addComment(@RequestParam String postid, @RequestBody Comment comment){
        postService.addComment(postid, comment);
        return ResponseEntity.ok(comment);
    }

}
