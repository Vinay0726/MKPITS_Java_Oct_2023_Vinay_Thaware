package com.example.banking.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountPostGetResponse {
    private Integer id;
    private Integer userId;
    private String accountNumber;
    private String type;
    private double rateOfInterest;
    private double balance;
}
