package com.example.demo.validator;

import com.example.demo.exception.BusinessException;
import com.example.demo.exception.NotFoundException;
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
    public boolean validateId(Integer id) {
        if (id == null) {
            throw new NotFoundException("id not found!!!!");
        } else {
                return true;
            }
        }

    }

