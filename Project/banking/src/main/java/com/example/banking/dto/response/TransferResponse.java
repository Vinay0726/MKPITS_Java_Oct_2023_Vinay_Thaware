package com.example.banking.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class TransferResponse {

    private int senderId;
    private int receiverId;
    private double transferredAmount;
    private double senderBalance;
    private double receiverBalance;
}
