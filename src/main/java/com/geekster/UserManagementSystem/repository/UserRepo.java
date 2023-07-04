package com.geekster.UserManagementSystem.repository;

import com.geekster.UserManagementSystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    private List<User> userList;
    public List<User> getUsers(){
        return userList;
    }


    public void add(List<User> users) {
        userList.addAll(users);
    }

    public void remove(User user) {
        userList.remove(user);
    }
}
