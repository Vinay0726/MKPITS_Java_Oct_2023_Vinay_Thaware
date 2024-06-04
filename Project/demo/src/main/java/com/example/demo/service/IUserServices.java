package com.example.demo.service;

import com.example.demo.dto.UsersDto;

public interface IUserServices {

    public UsersDto  getUserById(Integer id);
    public UsersDto createUser(UsersDto usersDto);
}
