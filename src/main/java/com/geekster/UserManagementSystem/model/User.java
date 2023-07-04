package com.geekster.UserManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Integer userId;
    private String fullName;
    private String userName;
    private String address;
    private String phoneNumber;

}
