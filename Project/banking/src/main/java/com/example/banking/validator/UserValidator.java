package com.example.banking.validator;

import com.example.banking.exception.BusinessException;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserValidator {
    public boolean validateAge(LocalDate dateOfBirth) {
        if (dateOfBirth == null) {
            throw new BusinessException("Date of birth cannot be null!!!!");
        } else {
            LocalDate currentDate = LocalDate.now();
            int age = currentDate.getYear() - dateOfBirth.getYear();
            if(age > 18) {
                return true;
            } else {
                return false;
            }
        }

    }
}
