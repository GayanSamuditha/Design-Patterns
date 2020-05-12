package PrototypePattern;

import java.util.List;

/**
 * @author Gayan Samuditha
 * @created 12/05/2020 - 8:05 PM
 */
public class UserHandlerApplication {
    public static void main(String[] args) {
        UserDetails users = new UserDetails();
        users.getUsers();

        // Use the clone method to get the Employee object
        UserDetails usersNew;
        try {
            usersNew = (UserDetails) users.clone();
            UserDetails usersNew1 = (UserDetails) users.clone();
            List list = usersNew.getUsersList();
            list.add(new User("Tim", "tim@gmail.com"));
            List list1 = usersNew1.getUsersList();
            list1.remove(new User("steve", "steve@gmail.com"));

            System.out.println("users List: " + users.getUsersList());
            System.out.println("usersNew List: " + list);
            System.out.println("usersNew1 List: " + list1);
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
