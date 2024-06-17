package com.example.banking.dto.response;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserGetResponseDto {
    private Integer id;
    private String userName;
    private String fullName;
    private String gender;
    private LocalDate dateOfBirth;
}
