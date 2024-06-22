package com.example.banking.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountsDto {
    private Integer id;
    private String accountType;
    private double rateOfInterest;
    private double balance;
}