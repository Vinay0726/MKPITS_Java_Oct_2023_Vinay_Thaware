package com.example.banking.controller;

import com.example.banking.dto.request.AccountsRequestDto;
import com.example.banking.dto.request.TransferRequest;
import com.example.banking.dto.request.UserRequestDto;
import com.example.banking.dto.response.*;
import com.example.banking.service.IUserServices;
import com.example.banking.validator.UserValidator;
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
    IUserServices userService;
    @Autowired
    UserValidator userValidator;

   //get user by id
    @GetMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        UserGetResponseDto userGetResponseDto = userService.getUserById(id);
        return ResponseEntity.ok(userGetResponseDto);

    }
    //get all user
    @GetMapping(path = "/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllUsers() {
        List<UserGetResponseDto> userGetResponseDtoList = userService.getAllUsers();
        return ResponseEntity.ok(userGetResponseDtoList);

    }
    //delete user
    @DeleteMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id) {
        UserGetResponseDto userGetResponseDto = userService.deleteUserById(id);
        if(userGetResponseDto !=null){
            return new ResponseEntity<>("User with ID "+id +"deleted successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("User with ID "+id +"Not Found", HttpStatus.NOT_FOUND);
        }

    }
    //create user
    @PostMapping(path = "/v1/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody UserRequestDto userRequestDto) {
        boolean isValidAge = userValidator.validateAge(userRequestDto.getDateOfBirth());
        if(!isValidAge) {
            ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
                    .errorMessage("Age should be greater than 18 yrs")
                    .httStatusCode(HttpStatus.BAD_REQUEST.value())
                    .build();
            return ResponseEntity.badRequest().body(errorResponseDto);
        }
        UserPostResponseDto userPostResponseDto = userService.createUser(userRequestDto);
        return ResponseEntity.created(URI.create("/v1/users/" + userPostResponseDto.getId())).body(userPostResponseDto);
    }

    //update user
    @PutMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userDtoReturn = userService.updateUser(userRequestDto);
        return ResponseEntity.ok(userRequestDto);
    }


}
