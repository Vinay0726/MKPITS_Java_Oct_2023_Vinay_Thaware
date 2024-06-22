package com.example.banking.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountPostRequest {
    private Integer id;
    private Integer userId;
    private String name;
    private String type;
    private double rateOfInterest;
    private double balance;
}
