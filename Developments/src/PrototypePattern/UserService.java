package PrototypePattern;

import java.util.ArrayList;

/**
 * @author Gayan Samuditha
 * @created 12/05/2020 - 8:04 PM
 */

public class UserService {
    ArrayList users;

    public UserService() {
        users = new ArrayList();
        users.add(new User("Albert","albert@gmail.com"));
        users.add(new User("Bob","bob@gmail.com"));
        users.add(new User("Gary","gary@gmail.com"));
        users.add(new User("Geno","geno@gmail.com"));
    }
    public ArrayList getUsers(){
        return users;
    }
}
