package com.example.demo.mysql.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UserModel {


        @Id
        @GeneratedValue(strategy =GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;

//        @Column(name = "username")
//        private String username;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name="dateofbirth")
        private LocalDate dateOfBirth;
        @Column(name = "mobile")
        private String mobile;

        @Column(name = "email")
        private String email;

        @Column(name = "created_by")
        private Integer createdBy;

        @Column(name = "created_at")
        private LocalDateTime createdAt;

        @Column(name = "updated_by")
        private Integer updatedBy;

        @Column(name = "updated_at")
        private LocalDateTime updatedAt;
}
