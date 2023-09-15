package com.geekster.user_management_system.service;

import com.geekster.user_management_system.model.User;
import com.geekster.user_management_system.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public String createUser(User user) {
        userRepo.addUser(user);
        return "user added";
    }

    public List<User> getAllUsers() {
        return userRepo.getUserList();
    }
    public User getUserById(Integer id) {
//        List<User> userList = userRepo.getUserList();
//        for(User user : userList){
//            if(user.getUserId().equals(id)){
//                return user;
//            }
//        }
//        return null;
        return (User) getAllUsers()
                .stream()
                .filter(user->user.getUserId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public String deleteUser(Integer id) {
        List<User> userList = userRepo.getUserList();
        for(User user : userList){
            if(user.getUserId().equals(id)){
                userRepo.deleteUser(user);
                return "Deleted";
            }
        }
        return "Id not found";
    }
    public String updateUserInfo(Integer id,String name,String address,String phoneNumber) {
        List<User> userList = userRepo.getUserList();
        for(User user : userList){
            if(user.getUserId().equals(id)){
                user.setName(name);
                user.setAddress(address);
                user.setPhoneNumber(phoneNumber);
                userList.add(user);
                return "Updated";
            }
        }
        return "Id not found";
    }
}
