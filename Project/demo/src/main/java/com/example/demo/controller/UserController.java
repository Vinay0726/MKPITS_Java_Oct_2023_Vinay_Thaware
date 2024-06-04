package com.example.demo.controller;

import com.example.demo.dto.UsersDto;
import com.example.demo.service.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
 @Autowired
 IUserServices userServices;
    @RequestMapping(value="/v1/users/{id}",method= RequestMethod.GET)
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id){
        UsersDto userDto=userServices.getUserById(id);
        System.out.println("Constructor Service : "+userServices.hashCode());
        return ResponseEntity.ok(userDto);
    }
    @RequestMapping(value="/v1/users",method= RequestMethod.POST)
    public ResponseEntity<Object> createUser(@RequestBody UsersDto usersDto){
        UsersDto userDtoReturn=userServices.createUser(usersDto);
        return ResponseEntity.ok(userDtoReturn);
    }


}
