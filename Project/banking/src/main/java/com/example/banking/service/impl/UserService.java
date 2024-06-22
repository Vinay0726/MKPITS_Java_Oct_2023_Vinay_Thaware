package com.example.banking.service.impl;

import com.example.banking.dto.request.AccountPostRequest;
import com.example.banking.dto.request.AccountsRequestDto;
import com.example.banking.dto.request.TransferRequest;
import com.example.banking.dto.request.UserRequestDto;
import com.example.banking.dto.response.*;
import com.example.banking.exception.AccountLimitExceededException;
import com.example.banking.exception.InsufficientBalanceException;
import com.example.banking.model.Accounts;
import com.example.banking.model.TransferAmount;
import com.example.banking.model.User;
import com.example.banking.repository.AccountRepository;
import com.example.banking.repository.AccountRepositoryJpa;
import com.example.banking.repository.TransferAmountRepository;
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

    @Autowired
    AccountRepositoryJpa accountRepositoryJpa;

    @Autowired
    TransferAmountRepository transferAmountRepository;

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




        // Below code saves data in Accounts table
        Accounts accounts = new Accounts();
        accounts.setUser(user);  // Set user entity
        accounts.setAccountNumber(generateRandomAccountNumber());
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

    //generate random Account number 12 digit
    private String generateRandomAccountNumber() {
        long number = (long) (Math.random() * 1000000000000L);
        return String.format("%012d", number);
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
    public UserGetResponseDto getAccountDetailsById(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isEmpty()) {
            throw new RuntimeException("User not found");
        }

        User user = userOptional.get();
        List<Accounts> accounts = accountRepositoryJpa.findByUserId(id);

        List<AccountsDto> accountsDtos = new ArrayList<>();
        for (Accounts account : accounts) {
            AccountsDto accountsDto = new AccountsDto();
            accountsDto.setId(account.getId());
            accountsDto.setAccountType(account.getType());
            accountsDto.setRateOfInterest(account.getRateOfInterest());
            accountsDto.setBalance(account.getBalance());
            accountsDtos.add(accountsDto);
        }

        UserGetResponseDto userGetResponseDto = new UserGetResponseDto();
        userGetResponseDto.setId(user.getId());
        userGetResponseDto.setFullName(user.getFullName());
        userGetResponseDto.setGender(user.getGender());
        userGetResponseDto.setDateOfBirth(user.getDateOfBirth());
        userGetResponseDto.setAccounts(accountsDtos);

        return userGetResponseDto;


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
        Optional<Accounts> senderAccountOpt = accountRepositoryJpa.findFirstByUserId(senderUserId);
        Optional<Accounts> receiverAccountOpt = accountRepositoryJpa.findFirstByUserId(transferRequest.getReceiverUserId());

        // Retrieve sender and receiver Account Number
        Optional<Accounts> senderAccountNoOpt = accountRepositoryJpa.findByAccountNumber(transferRequest.getSenderAccountNumber());
        Optional<Accounts> receiverAccountNoOpt = accountRepositoryJpa.findByAccountNumber(transferRequest.getReceiverAccountNumber());

        // For sender and receiver user id
        if (senderUserOpt.isEmpty() || senderAccountOpt.isEmpty() || receiverAccountOpt.isEmpty()) {
            throw new RuntimeException("One or both id not found");
        }

        Accounts senderAccount = senderAccountOpt.get();
        Accounts receiverAccount = receiverAccountOpt.get();

        // For sender and receiver account number
        if (senderAccountNoOpt.isEmpty() || receiverAccountNoOpt.isEmpty()) {
            throw new RuntimeException("One or both account numbers not found");
        }
        Accounts senderAccountNo = senderAccountNoOpt.get();
        Accounts receiverAccountNo = receiverAccountNoOpt.get();

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

        // For transaction save in db
        TransferAmount transferAmount = new TransferAmount();
        transferAmount.setSenderId(senderAccount.getUserId());
        transferAmount.setSenderAccountNumber(senderAccountNo.getAccountNumber());
        transferAmount.setReceiverId(receiverAccount.getUserId());
        transferAmount.setReceiverAccountNumber(receiverAccountNo.getAccountNumber());
        transferAmount.setTransferredAmount(transferRequest.getAmount());
        transferAmount.setSenderBalance(senderAccount.getBalance());
        transferAmount.setReceiverBalance(receiverAccount.getBalance());
        transferAmount.setCreatedBy(1);
        transferAmount.setCreatedAt(LocalDateTime.now());
        transferAmount.setUpdatedBy(1);
        transferAmount.setUpdatedAt(LocalDateTime.now());
        transferAmountRepository.save(transferAmount);

        // Create the transfer response
        TransferResponse transferResponse = new TransferResponse();
        transferResponse.setSenderId(senderAccount.getUserId());
        transferResponse.setSenderAccountNumber(transferRequest.getSenderAccountNumber());
        transferResponse.setReceiverId(receiverAccount.getUserId());
        transferResponse.setReceiverAccountNumber(transferRequest.getReceiverAccountNumber());
        transferResponse.setTransferredAmount(transferRequest.getAmount());
        transferResponse.setSenderBalance(senderAccount.getBalance());
        transferResponse.setReceiverBalance(receiverAccount.getBalance());

        return transferResponse;
    }
    //create accounts
    @Override
    public AccountPostGetResponse createAccounts(AccountPostRequest accountPostRequest) {
        // Check constraints before saving
        long currentCount = accountRepositoryJpa.countByType("current");
        long savingCount = accountRepositoryJpa.countByType("saving");
        long fdCount = accountRepositoryJpa.countByType("fixed deposit");
        long rdCount = accountRepositoryJpa.countByType("recurring deposit");

        String accountType = accountPostRequest.getType().toLowerCase();
        if ((accountType.equals("current") && currentCount >= 1) ||
                (accountType.equals("saving") && savingCount >= 1) ||
                (accountType.equals("fixed deposit") && fdCount >= 5) ||
                (accountType.equals("recurring deposit") && rdCount >= 5)) {
            throw new AccountLimitExceededException("Account limit exceeded for type: " + accountType);
        }


        // Below code saves data in users table
        Accounts accounts = new Accounts();
        convertAccountsPostDtoToUserModel(accountPostRequest, accounts);
        accounts.setCreatedBy(1);
        accounts.setCreatedAt(LocalDateTime.now());

        accounts = accountRepository.save(accounts);


        accountRepository.save(accounts);

        AccountPostGetResponse accountPostGetResponse = new AccountPostGetResponse();
        accountPostGetResponse.setId(accounts.getId());
        accountPostGetResponse.setUserId(accounts.getUserId());
        accountPostGetResponse.setAccountNumber(accounts.getAccountNumber());
        accountPostGetResponse.setType(accounts.getType());
        accountPostGetResponse.setRateOfInterest(accounts.getRateOfInterest());
        accountPostGetResponse.setBalance(accounts.getBalance());
        return accountPostGetResponse;
    }




    private Accounts convertAccountsPostDtoToUserModel(AccountPostRequest accountPostRequest, Accounts accounts) {
        accounts.setUserId(accountPostRequest.getUserId());
//        accounts.setName(accountPostRequest.getName());
        accounts.setType(accountPostRequest.getType());
        accounts.setRateOfInterest(accountPostRequest.getRateOfInterest());
        accounts.setBalance(accountPostRequest.getBalance());
        accounts.setUpdatedBy(1);
        accounts.setUpdatedAt(LocalDateTime.now());
        return  accounts;

    }


    private AccountsRequestDto convertAccountsModelToUserDto(Accounts accounts) {

        AccountsRequestDto accountsRequestDto=new AccountsRequestDto();
        accountsRequestDto.setId(accounts.getId());
//        accountsRequestDto.setName(accounts.getName());
        accountsRequestDto.setType(accounts.getType());
        accountsRequestDto.setRateOfInterest(accounts.getRateOfInterest());
        accountsRequestDto.setBalance(accounts.getBalance());
        return accountsRequestDto;
    }

    private Accounts convertAccountsDtoToUserModel(AccountsRequestDto accountsRequestDto, Accounts accounts) {
//   accounts.setAccountNumber(accountsRequestDto.getAccountNumber());
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
        accountsGetResponse.setAccountNumber(accounts.getAccountNumber());
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
