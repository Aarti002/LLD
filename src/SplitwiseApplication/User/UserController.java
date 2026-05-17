package SplitwiseApplication.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> allUsers;

    public UserController() {
        this.allUsers = new ArrayList<>();
    }

    public void createUser(String name) {
        User user = new User(allUsers.size(), name);
        allUsers.add(user);
    }

    public User getUser(int id) {
        for(User u:allUsers) {
            if (u.getId() == id){
                return u;
            }
        }
        System.out.println("User not found.");
        return null;
    }

    public List<User> getUsers() {
        return allUsers;
    }
}
