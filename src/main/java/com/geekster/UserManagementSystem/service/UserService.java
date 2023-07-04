package com.geekster.UserManagementSystem.service;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo repo;

    public List<User> getAllUsers() {
        return repo.getUsers();
    }

    public String addUsers(List<User> users) {
        repo.add(users);
        return "Users are added to the list";
    }


    public User getUserById(Integer id) {
        List<User> userList = getAllUsers();
        for(User user : userList){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public String updateUserInfo(Integer userId, String name, String phoneNum) {
        List<User> userList = getAllUsers();
        for(User user:userList){
            if(user.getUserId().equals(userId)){
                user.setFullName(name);
                user.setPhoneNumber(phoneNum);
                return "UserInfo Updated Successfully";
            }
        }
        return "userId :"+userId+" Not Found";
    }

    public String removeUser(Integer id) {
        List<User> userList = getAllUsers();
        for(User user:userList){
            if(user.getUserId().equals(id)){
                repo.remove(user);
                return "UserInfo deleted Successfully";
            }
        }
        return "userId :"+id+" Not Found";
    }
}
