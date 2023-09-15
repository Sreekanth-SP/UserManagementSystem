package com.geekster.user_management_system.repository;

import com.geekster.user_management_system.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BeanFactory {
    @Bean
    ArrayList<User> getAllLists(){
        return new ArrayList<>();
    }

}
