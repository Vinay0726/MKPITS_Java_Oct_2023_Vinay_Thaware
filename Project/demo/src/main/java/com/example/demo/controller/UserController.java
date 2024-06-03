package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UsersDto;
import com.example.demo.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
 @Autowired
    UserServices userServices;
    @RequestMapping("/v1/users")
    public ResponseEntity<Object> getUser(){
        UsersDto userDto=userServices.getAllUsers();
        System.out.println("Constructor Service : "+userServices.hashCode());
        return ResponseEntity.ok(userDto);
    }


}
