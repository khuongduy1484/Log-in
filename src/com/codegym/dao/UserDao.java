package com.codegym.dao;

import com.codegym.model.User;
import com.codegym.model.Login;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>users;
    static {
        users = new ArrayList<>();
        User user = new User();
        user.setAccount("join");
        user.setAge(25);
        user.setEmail("khuongduy1484@gmail.com");
        user.setPassword("123456");
        user.setName("duy");
        users.add(user);
        User user2 = new User();
        user2.setAccount("ha");
        user2.setAge(25);
        user2.setEmail("ngolan");
        user2.setPassword("123456");
        user2.setName("lan");
        users.add(user2);
    }
    public static User ckeckLogin(Login login){
        for (User u:users) {
            if (u.getAccount().equals(login.getAccount())
                   && u.getPassword().equals(login.getPassword())){
                return u;
            }
            
        }
        return null;

    }
}
