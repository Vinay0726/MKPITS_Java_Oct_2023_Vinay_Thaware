package com.example.banking.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
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
   private String userName;
    private String fullName;
    private String gender;
    private LocalDate dateOfBirth;
    private String name;
    private String type;
    private double rateOfInterest;
    private double balance;




}
