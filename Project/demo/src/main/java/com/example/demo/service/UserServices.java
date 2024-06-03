package com.example.demo.service;
import com.example.demo.dto.UsersDto;
import com.example.demo.mysql.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;

    public UsersDto getAllUsers() {
        Optional<UserModel> userModel = userRepository.findById(1);
        UsersDto userDto = new UsersDto();
        if(userModel.isPresent()) {
            userDto =  convertUserModelToUserDto(userModel.get());
        }
        return userDto;
    }

    private UsersDto convertUserModelToUserDto(UserModel userModel) {
        UsersDto userDto = new UsersDto();
        userDto.setId(userModel.getId());
        userDto.setUsername(userModel.getUsername());
        userDto.setFirstName(userModel.getFirstName());
        userDto.setLastName(userModel.getLastName());
        userDto.setMobile(userModel.getMobile());
        userDto.setEmail(userModel.getEmail());
        return userDto;
    }
}