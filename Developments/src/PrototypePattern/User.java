package PrototypePattern;

/**
 * @author Gayan Samuditha
 * @created 12/05/2020 - 8:04 PM
 */

public class User {
    String name;
    String email;

    public User(String name,String email) {
        this.name= name;
        this.email = email;
    }

    public String toString() {
        return "Name of user:"+this.name+"\nEmail of User:"+this.email;
    }
}