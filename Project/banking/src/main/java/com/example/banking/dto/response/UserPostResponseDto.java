package com.example.banking.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPostResponseDto {
    private Integer id;
    private String fullName;
    private String type;
    private double balance;
}
