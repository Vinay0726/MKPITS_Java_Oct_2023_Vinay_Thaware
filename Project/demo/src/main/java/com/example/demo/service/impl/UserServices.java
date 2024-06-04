package com.example.demo.service.impl;
import com.example.demo.dto.UsersDto;
import com.example.demo.mysql.model.UserModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServices implements IUserServices {

    @Autowired
    UserRepository userRepository;

    public UsersDto getUserById(Integer id) {
        Optional<UserModel> userModel = userRepository.findById(id);
        UsersDto userDto = new UsersDto();
        if(userModel.isPresent()) {
            userDto =  convertUserModelToUserDto(userModel.get());
        }
        return userDto;
    }

    @Override
    public UsersDto createUser(UsersDto usersDto) {
       UserModel userModel=convertUserDtoToUserModel(usersDto);
       userModel=userRepository.save(userModel);
        return convertUserModelToUserDto(userModel);
    }

    private UserModel convertUserDtoToUserModel(UsersDto usersDto) {
   UserModel userModel=new UserModel();
        userModel.setUsername(usersDto.getUsername());
        userModel.setFirstName(usersDto.getFirstName());
        userModel.setLastName(usersDto.getLastName());
        userModel.setMobile(usersDto.getMobile());
        userModel.setEmail(usersDto.getEmail());
        userModel.setCreatedBy(1);
        userModel.setCreatedAt(LocalDateTime.now());
        userModel.setUpdatedBy(1);
        userModel.setUpdatedAt(LocalDateTime.now());
        return userModel;

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