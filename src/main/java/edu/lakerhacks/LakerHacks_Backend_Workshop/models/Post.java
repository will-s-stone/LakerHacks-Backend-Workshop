package edu.lakerhacks.LakerHacks_Backend_Workshop.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
public class Post {
    @Id
    String id;
    User author;
    String content;
    String date;
    List<Comment> comments;

    /**
     * Empty constructor needed for retrieving the POJO (plain old java object)
     */
    public Post(){}

}
