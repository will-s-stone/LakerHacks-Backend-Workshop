package edu.lakerhacks.LakerHacks_Backend_Workshop.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Comment {
    String username;
    String content;

    /**
     * Empty constructor needed for retrieving the POJO (plain old java object)
     */
    public Comment(){}

    public Comment(String username, String content){
        this.username = username;
        this.content = content;
    }
}
