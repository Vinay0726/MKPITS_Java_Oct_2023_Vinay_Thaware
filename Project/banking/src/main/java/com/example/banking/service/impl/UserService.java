package com.example.banking.service.impl;

import com.example.banking.dto.request.AccountsRequestDto;
import com.example.banking.dto.request.TransferRequest;
import com.example.banking.dto.request.UserRequestDto;
import com.example.banking.dto.response.AccountsGetResponse;
import com.example.banking.dto.response.TransferResponse;
import com.example.banking.dto.response.UserGetResponseDto;
import com.example.banking.dto.response.UserPostResponseDto;
import com.example.banking.exception.InsufficientBalanceException;
import com.example.banking.model.Accounts;
import com.example.banking.model.User;
import com.example.banking.repository.AccountRepository;
import com.example.banking.repository.UserRepository;
import com.example.banking.service.IUserServices;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserServices {
    @Autowired
    UserRepository userRepository;

    @Autowired
    AccountRepository accountRepository;

    //create user logic
    @Override
    @Transactional
    public UserPostResponseDto createUser(UserRequestDto userRequestDto) {
        // Below code saves data in users table
        User user = new User();
        convertUserDtoToUserModel(userRequestDto, user);
        user.setCreatedBy(1);
        user.setCreatedAt(LocalDateTime.now());
        user = userRepository.save(user);

        // Below code saves data in user_credentials table
        Accounts accounts = new Accounts();
        accounts.setUserId(user.getId());
        accounts.setName(userRequestDto.getName());
        accounts.setType(userRequestDto.getType());
        accounts.setRateOfInterest(userRequestDto.getRateOfInterest());
        accounts.setBalance(userRequestDto.getBalance());
        accounts.setCreatedBy(1);
        accounts.setCreatedAt(LocalDateTime.now());
        accounts.setUpdatedBy(1);
        accounts.setUpdatedAt(LocalDateTime.now());

        accountRepository.save(accounts);

        UserPostResponseDto userPostResponseDto = new UserPostResponseDto();
        userPostResponseDto.setId(user.getId());
        userPostResponseDto.setFullName(user.getFullName());
        userPostResponseDto.setType(accounts.getType());
        userPostResponseDto.setBalance(accounts.getBalance());
        return userPostResponseDto;
    }

    //get user by id logic
    @Override
    public UserGetResponseDto getUserById(Integer id) {
        Optional<User> user = userRepository.findById(id);

        UserGetResponseDto userGetResponseDto = new UserGetResponseDto();
        if(user.isPresent()) {
            userGetResponseDto =  convertUserModelToUserDtoGetResponse(user.get());
        }
        return userGetResponseDto;
    }

    //get all user by id
    @Override
    public List<UserGetResponseDto> getAllUsers() {
        List<User> userList = (List<User>) userRepository.findAll();

        List<UserGetResponseDto> userRequestDtoList = new ArrayList<>();
        for(User user : userList){
            UserGetResponseDto userGetResponseDto = convertUserModelToUserDtoGetResponse(user);
            userRequestDtoList.add(userGetResponseDto);
        }
        return userRequestDtoList;
    }

    @Override
    public UserGetResponseDto deleteUserById(Integer id) {
        Optional<User> user = userRepository.findById(id);

        if(user.isEmpty()) {
            System.out.println("User Data with id " + id + "not found");
            return null;
        }
        else {
            userRepository.deleteById(id);
            System.out.println("User Data with id "+id+" deleted successfully");
            return convertUserModelToUserDtoGetResponse(user.get());
        }
    }

    @Override
    public UserRequestDto updateUser(UserRequestDto userRequestDto) {
        Optional<User> userModelOptional = userRepository.findById(userRequestDto.getId());
        if(userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
        } else {
            User user = convertUserDtoToUserModel(userRequestDto, userModelOptional.get());
            user.setId(userRequestDto.getId());
            user = userRepository.save(user);
            return convertUserModelToUserDto(user);
        }
        return userRequestDto;
    }

    //get Accounts detail by id
    @Override
    public AccountsGetResponse getAccountDetailsById(Integer userId) {
        Optional<Accounts> accounts = accountRepository.findByUserId(userId);

        AccountsGetResponse accountsGetResponse = new AccountsGetResponse();
        if(accounts.isPresent()) {
            accountsGetResponse =  convertAccountModelToUserDtoGetResponse(accounts.get());
        }
        return accountsGetResponse;
    }

    //get all accounts
    @Override
    public List<AccountsGetResponse> getAllAccounts() {
        List<Accounts> accountsList = (List<Accounts>) accountRepository.findAll();

        List<AccountsGetResponse> accountsGetResponseList = new ArrayList<>();
        for(Accounts accounts : accountsList){
            AccountsGetResponse accountsGetResponse = convertAccountModelToUserDtoGetResponse(accounts);
            accountsGetResponseList.add(accountsGetResponse);
        }
        return accountsGetResponseList;
    }

    //delete accounts details
    @Override
    public AccountsGetResponse deleteAccountsById(Integer id) {
        Optional<Accounts> accounts = accountRepository.findById(id);

        if(accounts.isEmpty()) {
            System.out.println("User Data with id " + id + "not found");
            return null;
        }
        else {
            accountRepository.deleteById(id);
            System.out.println("User Data with id "+id+" deleted successfully");
            return convertAccountModelToUserDtoGetResponse(accounts.get());
        }
    }

    @Override
    public AccountsRequestDto updateAccounts(AccountsRequestDto accountsRequestDto) {
        Optional<Accounts> accountsOptional = accountRepository.findById(accountsRequestDto.getId());
        if(accountsOptional.isEmpty()) {
            System.out.println("User data with id: " + accountsRequestDto.getId() + " not found");
        } else {
            Accounts accounts = convertAccountsDtoToUserModel(accountsRequestDto, accountsOptional.get());
            accounts.setId(accountsRequestDto.getId());
            accounts = accountRepository.save(accounts);
            return convertAccountsModelToUserDto(accounts);
        }
        return accountsRequestDto;
    }

    @Override
    public TransferResponse amountTransfer(TransferRequest transferRequest, Integer senderUserId) {
        // Retrieve sender and receiver user information
        Optional<User> senderUserOpt = userRepository.findById(senderUserId);
        Optional<Accounts> senderAccountOpt = accountRepository.findByUserId(senderUserId);
        Optional<Accounts> receiverAccountOpt = accountRepository.findByUserId(transferRequest.getReceiverUserId());

        if (senderUserOpt.isEmpty() || senderAccountOpt.isEmpty() || receiverAccountOpt.isEmpty()) {
            throw new RuntimeException("One or both id not found");
        }

        Accounts senderAccount = senderAccountOpt.get();
        Accounts receiverAccount = receiverAccountOpt.get();

        // Check if the sender has sufficient balance
        if (senderAccount.getBalance() < transferRequest.getAmount()) {
            throw new InsufficientBalanceException("Sender has insufficient balance");
        }

        // Perform the balance transfer
        senderAccount.setBalance(senderAccount.getBalance() - transferRequest.getAmount());
        receiverAccount.setBalance(receiverAccount.getBalance() + transferRequest.getAmount());

        // Save the updated account balances
        accountRepository.save(senderAccount);
        accountRepository.save(receiverAccount);

        // Create the transfer response
        TransferResponse transferResponse = new TransferResponse();
        transferResponse.setSenderId(senderAccount.getUserId());
        transferResponse.setReceiverId(receiverAccount.getUserId());
        transferResponse.setTransferredAmount(transferRequest.getAmount());
        transferResponse.setSenderBalance(senderAccount.getBalance());
        transferResponse.setReceiverBalance(receiverAccount.getBalance());

        return transferResponse;
    }

    private AccountsRequestDto convertAccountsModelToUserDto(Accounts accounts) {

        AccountsRequestDto accountsRequestDto=new AccountsRequestDto();
        accountsRequestDto.setId(accounts.getId());
        accountsRequestDto.setName(accounts.getName());
        accountsRequestDto.setType(accounts.getType());
        accountsRequestDto.setRateOfInterest(accounts.getRateOfInterest());
        accountsRequestDto.setBalance(accounts.getBalance());
        return accountsRequestDto;
    }

    private Accounts convertAccountsDtoToUserModel(AccountsRequestDto accountsRequestDto, Accounts accounts) {
   accounts.setName(accountsRequestDto.getName());
   accounts.setType(accountsRequestDto.getType());
   accounts.setRateOfInterest(accountsRequestDto.getRateOfInterest());
   accounts.setBalance(accountsRequestDto.getBalance());
        accounts.setUpdatedBy(1);
        accounts.setUpdatedAt(LocalDateTime.now());
   return accounts;
    }

    //get response Accounts
    private AccountsGetResponse convertAccountModelToUserDtoGetResponse(Accounts accounts) {
        AccountsGetResponse accountsGetResponse=new AccountsGetResponse();
        accountsGetResponse.setUserId(accounts.getUserId());
        accountsGetResponse.setName(accounts.getName());
        accountsGetResponse.setType(accounts.getType());
        accountsGetResponse.setRateOfInterest(accounts.getRateOfInterest());
        accountsGetResponse.setBalance(accounts.getBalance());

        return accountsGetResponse;


    }


    private User convertUserDtoToUserModel(UserRequestDto userRequestDto, User user) {
        user.setUserName(userRequestDto.getUserName());
        user.setFullName(userRequestDto.getFullName());
        user.setGender(userRequestDto.getGender());
        user.setDateOfBirth(userRequestDto.getDateOfBirth());
        user.setUpdatedBy(1);
        user.setUpdatedAt(LocalDateTime.now());
        return user;
    }
    private UserRequestDto convertUserModelToUserDto(User user) {

        UserRequestDto userRequestDto=new UserRequestDto();
        userRequestDto.setId(user.getId());
        userRequestDto.setUserName(user.getUserName());
        userRequestDto.setFullName(user.getFullName());
        userRequestDto.setGender(user.getGender());
        userRequestDto.setDateOfBirth(user.getDateOfBirth());
        return userRequestDto;
    }

//get response user
    private UserGetResponseDto convertUserModelToUserDtoGetResponse(User user) {
        UserGetResponseDto userGetResponseDto=new UserGetResponseDto();
        userGetResponseDto.setId(user.getId());
        userGetResponseDto.setUserName(user.getUserName());
        userGetResponseDto.setFullName(user.getFullName());
        userGetResponseDto.setGender(user.getGender());
        userGetResponseDto.setDateOfBirth(user.getDateOfBirth());
      return userGetResponseDto;
    }


}
