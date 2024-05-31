package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.impl.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

UserService userServiceConstructor=new UserService();
UserService userServiceSetter=new UserService();

    public UserController(UserService userServiceConstructor) {
        this.userServiceConstructor = userServiceConstructor;
    }

    public void setUserServiceSetter(UserService userServiceSetter) {
        this.userServiceSetter = userServiceSetter;
    }

    @RequestMapping("/v1/user/constructor")
    public ResponseEntity<Object> getUserFromConstructor(){
        UserDto userDto=userServiceConstructor.getAllUser();
        System.out.println("Constructor Service : "+userServiceConstructor.hashCode());
        return ResponseEntity.ok(userDto);
    }

    @RequestMapping("/v1/user/setter")
    public ResponseEntity<Object> getUserFromSetter(){

        UserDto userDto1=userServiceSetter.getAllUser();
        System.out.println("Setter Service : "+userServiceSetter.hashCode());
        return ResponseEntity.ok(userDto1);
    }
}
