package edu.lakerhacks.LakerHacks_Backend_Workshop.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Comment {
    User commentor;
    String content;

    /**
     * Empty constructor needed for retrieving the POJO (plain old java object)
     */
    public Comment(){}
}
