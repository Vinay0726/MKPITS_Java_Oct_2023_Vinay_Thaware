package com.example.demo.controller;
import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.UserResponseDto;
import com.example.demo.service.IUserServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {
 @Autowired
 IUserServices userServices;
//    @RequestMapping(value="/v1/users/{id}",method= RequestMethod.GET)
    @GetMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        UserRequestDto userRequestDto = userServices.getUserById(id);
        return ResponseEntity.ok(userRequestDto);

    }
//    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PUT)
    @PutMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userDtoReturn = userServices.updateUser(userRequestDto);
        return ResponseEntity.ok(userRequestDto);
    }
    @DeleteMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id) {
        UserRequestDto userRequestDto = userServices.deleteUserById(id);
        if(userRequestDto !=null){
            return new ResponseEntity<>("User with ID "+id +"deleted successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("User with ID "+id +"Not Found", HttpStatus.NOT_FOUND);
        }

    }
//    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PATCH)
    @PatchMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updatePartialUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userDtoReturn = userServices.updatePartialUser(userRequestDto);
        return ResponseEntity.ok(userRequestDto);
    }


//    @RequestMapping(value = "/v1/users", method = RequestMethod.GET)
    @GetMapping(path = "/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllUsers() {
        List<UserRequestDto> userRequestDtoList = userServices.getAllUsers();
        return ResponseEntity.ok(userRequestDtoList);

    }

//    @RequestMapping(value="/v1/users",method= RequestMethod.POST)
@PostMapping(path = "/v1/users")
public ResponseEntity<Object> createUser(@Valid @RequestBody UserRequestDto userRequestDto) {
    UserResponseDto userResponseDto = userServices.createUser(userRequestDto);
    return ResponseEntity.created(URI.create("/v1/users/" + userResponseDto.getId())).body(userResponseDto);
}
}
