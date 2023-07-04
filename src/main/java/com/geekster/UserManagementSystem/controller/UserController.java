package com.geekster.UserManagementSystem.controller;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    UserService userService;
    //getAllUser
    @GetMapping("users")
     List<User> getAllUser(){
        return userService.getAllUsers();
    }

//    addUser
    @PostMapping("users")
    public String addUsers(@RequestBody List<User> users){
        return userService.addUsers(users);
    }
//    getUser/{userid}
    @GetMapping("users/id/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

//    updateUserInfo
    @PutMapping("users/id/{userId}/name/{name}/phoneNumber/{phoneNum}")
    public String updateUserInfo(@PathVariable Integer userId,@PathVariable String name,@PathVariable String phoneNum){
        return userService.updateUserInfo(userId,name,phoneNum);
    }
//    deleteUser
    @DeleteMapping("user/id/{id}")
    public String removeUser(@PathVariable Integer id){
        return userService.removeUser(id);
    }
}
