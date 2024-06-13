package com.example.demo.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequestDto {

    private Integer id;

    @NotNull(message = "'username' cannot be null")
    @Size(min = 6, max = 45, message = "'username' can be minimum 6 character and maximum 45 characters")
    @Pattern(regexp = "^[a-zA-Z0-9]{6,12}$", message = "username must be of 6 to 12 length with no special characters")
    private String username;

    @NotNull(message = "'username' cannot be null")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,20}$+")
    private String password;

    @NotNull(message = "'username' cannot be null")
    @Pattern(regexp = "[a-zA-Z]+", message = "'firstName' can only contain alphabets")
    @Size(min = 3, max = 45, message = "'firstname' can be minimum 6 character and maximum 45 characters")
    private String firstName;

    @NotNull(message = "'username' cannot be null")
    @Pattern(regexp = "[a-zA-Z]+", message = "'firstName' can only contain alphabets")
    @Size(min = 3, max = 45, message = "'lastname' can be minimum 6 character and maximum 45 characters")
    private String lastName;

  @NotNull(message = "'username' cannot be null")
    private LocalDate dateOfBirth;
    @NotNull(message = "'username' cannot be null")
    @Pattern(regexp = "^[0-9]+", message = "'mobile number' can only contain number")
    @Size(min=10, max=10,message = "'mobile number' should be 10 digit")
    private String mobile;

    @NotNull(message = "'username' cannot be null")
    @Email
    @Size(min = 10, max = 25, message = "'email' can be minimum 10 character and maximum 26 characters")
    private String email;
}


