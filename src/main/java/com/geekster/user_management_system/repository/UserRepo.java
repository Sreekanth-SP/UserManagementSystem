package com.geekster.user_management_system.repository;

import com.geekster.user_management_system.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public class UserRepo {
    @Autowired
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }
    public void addUser(User user){
        userList.add(user);
    }

    public void deleteUser(User user){
        userList.remove(user);
    }

}
