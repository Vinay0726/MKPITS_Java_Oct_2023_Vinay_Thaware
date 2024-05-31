package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerAutowire {
    @Autowired
    IUserService userService;

    @RequestMapping("/v1/user/autowire")
    public ResponseEntity<Object> getUserFromConstructor(){
        UserDto userDtoAutowire=userService.getAllUser();
        System.out.println("Autowired Service :"+userService.hashCode());
        return ResponseEntity.ok(userDtoAutowire);
    }

}
