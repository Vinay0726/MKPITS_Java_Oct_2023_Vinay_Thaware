package com.example.banking.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransferRequest {
    @NotNull(message = "'id' cannot be null")
    private int senderUserId;
    private String senderAccountNumber;
    @NotNull(message = "'id' cannot be null")
    private int receiverUserId;
    private String receiverAccountNumber;
    @NotNull(message = "'balance' cannot be null")
    @DecimalMin(value = "0.0", inclusive = true, message = "Balance must be equal or greater than 0.0")
    @DecimalMax(value = "40000.0", inclusive = true, message = "Balance must be equal or less than 40000.0")
    private double amount;

}
