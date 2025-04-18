package edu.lakerhacks.LakerHacks_Backend_Workshop.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//Add lombok Data annotation, getter, and setter
//Indicate the document collection
@Getter
@Setter
@Data
@Document(collection = "users")
public class User {
    @Id
    String username;
    String email;
    String name;

    /**
     * Empty constructor needed for retrieving the POJO (plain old java object)
     */
    public User(){}

    public User(String username, String email, String name){
        this.username = username;
        this.email = email;
        this.name = name;
    }
}
