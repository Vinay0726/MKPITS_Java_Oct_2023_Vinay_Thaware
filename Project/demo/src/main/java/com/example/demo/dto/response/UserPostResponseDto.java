package com.example.demo.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPostResponseDto {
    private Integer id;
    private String username;
    private String firstName;
}