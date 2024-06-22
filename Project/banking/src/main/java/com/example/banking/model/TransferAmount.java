package com.example.banking.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transaction_history")
public class TransferAmount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "sender_id")
    private int senderId;
    @Column(name = "sender_account_number")
    private String senderAccountNumber;
    @Column(name = "receiver_id")
    private int receiverId;
    @Column(name = "receiver_account_number")
    private String receiverAccountNumber;
    @Column(name = "transfer_amount")
    private double transferredAmount;
    @Column(name = "sender_balance")
    private double senderBalance;
    @Column(name = "receiver_balance")
    private double receiverBalance;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_by")
    private Integer updatedBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
