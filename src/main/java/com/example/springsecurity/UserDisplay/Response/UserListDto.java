package com.example.springsecurity.UserDisplay.Response;

import lombok.Data;

@Data
public class UserListDto {
    private int id;
    private String username;
    private String password;
}
