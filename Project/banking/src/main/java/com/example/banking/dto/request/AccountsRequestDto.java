package com.example.banking.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountsRequestDto {

    private Integer id;

//    @NotNull(message = "'account' cannot be null")
//    @Size(min = 12, max = 12, message = "'firstname' maximum 12 digits")
//    private String accountNumber;

    @NotNull(message = "'type' cannot be null")
    @Pattern(regexp = "^(savings|salary|current)$", message = "Invalid account type. Allowed values are 'savings', 'salary', or 'current'.")
    private String type;

    @NotNull(message = "'rateOfInterest' cannot be null")
    @DecimalMin(value = "0.0", inclusive = true, message = "Rate of interest must be equal or greater than 0.0")
    @DecimalMax(value = "100.0", inclusive = true, message = "Rate of interest must be equal or less than 100.0")
    private double rateOfInterest;

    @NotNull(message = "'balance' cannot be null")
    @DecimalMin(value = "0.0", inclusive = true, message = "Balance must be equal or greater than 0.0")
    @DecimalMax(value = "1000000.0", inclusive = true, message = "Balance must be equal or less than 1000000.0")
    private double balance;

}
