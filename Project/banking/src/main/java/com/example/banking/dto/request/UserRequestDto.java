package com.example.banking.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequestDto {

    private Integer id;

    @NotNull(message = "'username' cannot be null")
    @Size(min = 6, max = 12, message = "'username' can be minimum 6 character and maximum 45 characters")
    @Pattern(regexp = "^[a-zA-Z0-9]{6,12}$", message = "username must be of 6 to 12 length with no special characters")
   private String userName;

    @NotNull(message = "'fullName' cannot be null")
    @Pattern(regexp = "^[a-zA-Z]+([\\s'-][a-zA-Z]+)*$", message = "Invalid full name. Only alphabetic characters, spaces, hyphens, and apostrophes are allowed.")
    @Size(min = 10, max = 100, message = "'fullname' can be minimum 6 character and maximum 100 characters")
    private String fullName;

    @NotNull(message = "'gender' cannot be null")
    @Pattern(regexp = "^(male|female)$", message = "Invalid gender. Only 'male' or 'female' are allowed.")
    private String gender;
    @NotNull(message = "dateOfBirth' cannot be null")
    private LocalDate dateOfBirth;

//    @NotNull(message = "'name' cannot be null")
//    @Pattern(regexp = "[a-zA-Z]+", message = "'firstName' can only contain alphabets")
//    @Size(min = 5, max = 100, message = "'name' can be minimum 5 character and maximum 45 characters")
//    private String name;

    @NotNull(message = "'type' cannot be null")
    @Pattern(regexp = "^(savings|salary|current)$", message = "Invalid account type. Allowed values are 'savings', 'salary', or 'current'.")
    private String type;

    @NotNull(message = "'rateOfInterest' cannot be null")
    @DecimalMin(value = "0.0", inclusive = true, message = "Rate of interest must be equal or greater than 0.0")
    @DecimalMax(value = "100.0", inclusive = true, message = "Rate of interest must be equal or less than 100.0")
    private double rateOfInterest;

    @NotNull(message = "'balance' cannot be null")
    @DecimalMin(value = "0.0", inclusive = true, message = "Balance must be equal or greater than 0.0")
    @DecimalMax(value = "1000000.0", inclusive = true, message = "Balance must be equal or less than 1000000.0")
    private double balance;




}
