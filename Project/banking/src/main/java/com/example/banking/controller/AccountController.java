package com.example.banking.controller;

import com.example.banking.dto.request.AccountPostRequest;
import com.example.banking.dto.request.AccountsRequestDto;
import com.example.banking.dto.request.TransferRequest;
import com.example.banking.dto.request.UserRequestDto;
import com.example.banking.dto.response.*;
import com.example.banking.exception.AccountLimitExceededException;
import com.example.banking.model.Accounts;
import com.example.banking.service.IUserServices;
import com.example.banking.validator.UserValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
@RestController
public class AccountController {
    @Autowired
    IUserServices userService;
    @Autowired
    UserValidator userValidator;

    //get accounts  by id
    @GetMapping(path = "/v1/accounts/{id}")
    public ResponseEntity<Object> getAccountDetails(@PathVariable("id") Integer id) {
        UserGetResponseDto userGetResponseDto = userService.getAccountDetailsById(id);
        return ResponseEntity.ok(userGetResponseDto);
    }




    //get all accounts
    @GetMapping(path = "/v1/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllAccountsData() {
        List<AccountsGetResponse> accountsGetResponseList= userService.getAllAccounts();
        return ResponseEntity.ok(accountsGetResponseList);

    }
    //delete account details
    @DeleteMapping(path = "/v1/accounts/{id}")
    public ResponseEntity<Object> deleteAccountsDetails(@PathVariable("id") Integer id) {
        AccountsGetResponse accountsGetResponse = userService.deleteAccountsById(id);
        if(accountsGetResponse !=null){
            return new ResponseEntity<>("User with ID "+id +"deleted successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("User with ID "+id +"Not Found", HttpStatus.NOT_FOUND);
        }
    }
    //update Accounts Details
    @PutMapping(path = "/v1/accounts/{id}")
    public ResponseEntity<Object> updateAccounts(@PathVariable("id") Integer id, @RequestBody AccountsRequestDto accountsRequestDto) {
        accountsRequestDto.setId(id);
        AccountsRequestDto accountsDtoReturn = userService.updateAccounts(accountsRequestDto);
        return ResponseEntity.ok(accountsDtoReturn);
    }


    //post accounts details
    @PostMapping(path = "/v1/accounts")
    public ResponseEntity<Object> createAccounts(@Valid @RequestBody AccountPostRequest accountPostRequest) {

        AccountPostGetResponse accountPostGetResponse = userService.createAccounts(accountPostRequest);
        return ResponseEntity.created(URI.create("/v1/users/" + accountPostGetResponse.getUserId())).body(accountPostGetResponse);
    }
    @ExceptionHandler(AccountLimitExceededException.class)
    public ResponseEntity<String> handleAccountLimitExceededException(AccountLimitExceededException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }


    //post account amount transfer from one user id to another
    @PostMapping(path = "/v1/accounts/users/{id}")
    public ResponseEntity<Object> transferAmount(@Valid @PathVariable("id") Integer id, @RequestBody TransferRequest transferRequest) {
        TransferResponse transferResponse = userService.amountTransfer(transferRequest,id);
        return ResponseEntity.created(URI.create("/v1/accounts/users/" + transferResponse.getSenderId())).body(transferResponse);
    }

}
