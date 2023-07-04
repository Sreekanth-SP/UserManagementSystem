package com.geekster.UserManagementSystem.userconfiguration;

import com.geekster.UserManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
class BeanFactory {
    @Bean
    public List<User> getFirstList(){
        User firstUser =  new User(1,"Mark Zukerburk","markzuk","1897 WestLand California","0073425456");
        List<User> firstList = new ArrayList<>();
        firstList.add(firstUser);
        return firstList;
    }
}
