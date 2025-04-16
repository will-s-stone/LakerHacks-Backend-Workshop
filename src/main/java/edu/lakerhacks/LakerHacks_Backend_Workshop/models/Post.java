package edu.lakerhacks.LakerHacks_Backend_Workshop.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Data
public class Post {
    String postBody;
    String date;
}
