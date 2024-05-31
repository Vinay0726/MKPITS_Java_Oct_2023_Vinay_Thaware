package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    public UserDto getAllUser(){
        UserDto userDto=new UserDto();
        userDto.setId(11);
        userDto.setUsername("user2");
        userDto.setAge(25);
        return userDto;
    }
}
