package com.example.banking.dto.response;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AccountsGetResponse {
    private Integer userId;
    private String name;
    private String type;
    private double rateOfInterest;
    private double balance;
}
