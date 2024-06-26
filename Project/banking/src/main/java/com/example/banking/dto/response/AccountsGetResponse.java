package com.example.banking.dto.response;

import jakarta.persistence.Column;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AccountsGetResponse {
    private Integer userId;
    private String accountNumber;
    private String type;
    private double rateOfInterest;
    private double balance;

}
