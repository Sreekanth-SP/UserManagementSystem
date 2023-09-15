package com.geekster.user_management_system.controller;

import com.geekster.user_management_system.model.User;
import com.geekster.user_management_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //addUser
    @PostMapping("user")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    //getUser/{userid}
    @GetMapping("user/id/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    //getAllUser
    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    //updateUserInfo
    @PutMapping("user/id/{id}/data")
    public String updateUserInfo(@PathVariable Integer id ,@RequestParam(defaultValue = "") String name,@RequestParam(defaultValue = "") String address, @RequestParam(defaultValue = "") String phoneNumber){
        return userService.updateUserInfo(id,name,address,phoneNumber);
    }


    //deleteUser
    @DeleteMapping("user/id/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }
}
