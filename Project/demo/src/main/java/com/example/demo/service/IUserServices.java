package com.example.demo.service;

import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.UserPostResponseDto;

import java.util.List;

public interface IUserServices {

    public UserRequestDto getUserById(Integer id);
    public UserPostResponseDto createUser(UserRequestDto userRequestDto);

    public UserRequestDto updateUser(UserRequestDto userRequestDto);

  public  List<UserRequestDto> getAllUsers();

  public  UserRequestDto updatePartialUser(UserRequestDto userRequestDto);


  public  UserRequestDto deleteUserById(Integer id);
}
