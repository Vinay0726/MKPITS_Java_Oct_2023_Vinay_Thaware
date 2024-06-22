package com.example.banking.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserGetResponseDto {
    private Integer id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userName;
    private String fullName;
    private String gender;
    private LocalDate dateOfBirth;
    private List<AccountsDto> accounts;
}
