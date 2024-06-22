package com.example.banking.service;

import com.example.banking.dto.request.AccountPostRequest;
import com.example.banking.dto.request.AccountsRequestDto;
import com.example.banking.dto.request.TransferRequest;
import com.example.banking.dto.request.UserRequestDto;
import com.example.banking.dto.response.*;

import java.util.List;

public interface IUserServices {

    //user part
    public UserPostResponseDto createUser(UserRequestDto userRequestDto) ;

    public UserGetResponseDto getUserById(Integer id);

   public List<UserGetResponseDto> getAllUsers();

   public UserGetResponseDto deleteUserById(Integer id);

    public UserRequestDto updateUser(UserRequestDto userRequestDto);



    //accounts part
   public UserGetResponseDto getAccountDetailsById(Integer id);

   public List<AccountsGetResponse> getAllAccounts();

   public AccountsGetResponse deleteAccountsById(Integer id);

   public AccountsRequestDto updateAccounts(AccountsRequestDto accountsRequestDto);

   public TransferResponse amountTransfer(TransferRequest transferRequest,Integer id);

   public AccountPostGetResponse createAccounts(AccountPostRequest accountPostRequest);


}
