package com.example.demo.controller;
import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.ErrorResponseDto;
import com.example.demo.dto.response.UserGetResponseDto;
import com.example.demo.dto.response.UserPostResponseDto;
import com.example.demo.service.IUserServices;
import com.example.demo.validator.UserValidator;
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
    @Autowired
    UserValidator userValidator;

//    @RequestMapping(value="/v1/users/{id}",method= RequestMethod.GET)
    @CrossOrigin
    @GetMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {


        UserGetResponseDto userGetResponseDto = userServices.getUserById(id);
        boolean isNotFound = userValidator.validateId(userGetResponseDto.getId());
        return ResponseEntity.ok(userGetResponseDto);

    }
//    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PUT)
    @CrossOrigin
    @PutMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userDtoReturn = userServices.updateUser(userRequestDto);
        return ResponseEntity.ok(userRequestDto);
    }
    @CrossOrigin
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
    @CrossOrigin
    @PatchMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updatePartialUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userDtoReturn = userServices.updatePartialUser(userRequestDto);
        return ResponseEntity.ok(userRequestDto);
    }


//    @RequestMapping(value = "/v1/users", method = RequestMethod.GET)
    @CrossOrigin
    @GetMapping(path = "/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllUsers() {
        List<UserGetResponseDto> userGetResponseDtoList = userServices.getAllUsers();
        return ResponseEntity.ok(userGetResponseDtoList);

    }

//    @RequestMapping(value="/v1/users",method= RequestMethod.POST)
    @CrossOrigin
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
    UserPostResponseDto userPostResponseDto = userServices.createUser(userRequestDto);
    return ResponseEntity.created(URI.create("/v1/users/" + userPostResponseDto.getId())).body(userPostResponseDto);
}
}
