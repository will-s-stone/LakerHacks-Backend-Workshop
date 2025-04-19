package edu.lakerhacks.LakerHacks_Backend_Workshop.services;

import edu.lakerhacks.LakerHacks_Backend_Workshop.models.Comment;
import edu.lakerhacks.LakerHacks_Backend_Workshop.models.Post;
import edu.lakerhacks.LakerHacks_Backend_Workshop.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public Post addPost(Post post){
        postRepository.save(post);
        return post;
    }

    public Post getPost(String id){
        return postRepository.findById(id).get();
    }

    public Post addComment(String postId, Comment comment) {
        if (postRepository.existsById(postId)) {
            Post existingPost = postRepository.findById(postId).get();
            existingPost.getComments().add(comment);
            postRepository.save(existingPost);
            return existingPost;
        } else {
            return null;
        }
    }

    public Post addComment(Post post, Comment comment){
        if(postRepository.existsById(post.getId())){
            Post existingPost = postRepository.findById(post.getId()).get();
            existingPost.getComments().add(comment);
            postRepository.save(existingPost);
            return post;
        } else {
            return null;
        }
    }

}
