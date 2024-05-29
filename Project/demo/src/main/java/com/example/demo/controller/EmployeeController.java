package com.example.demo.controller;


import com.example.demo.dto.AddressDto;
import com.example.demo.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

@GetMapping("/employee")
    public  ResponseEntity<Object> getEmployee(){
        EmployeeDto employeeDto=new EmployeeDto();
        employeeDto.setName("Vinay Thaware");
        employeeDto.setDepartment("IT");
        employeeDto.setDesignation("Software Engineer");


    AddressDto addressDto1 = new AddressDto();
    addressDto1.setAddressType('c');
    addressDto1.setStreet("132 Main Street");
    addressDto1.setCity("Nagpur");
    addressDto1.setState("Maharashtra");
    addressDto1.setCountry("India");

    AddressDto addressDto2 = new AddressDto();
    addressDto2.setAddressType('p');
    addressDto2.setStreet("142 Main Street");
    addressDto2.setCity("Pune");
    addressDto2.setState("Maharashtra");
    addressDto2.setCountry("India");

    AddressDto addressDto3 = new AddressDto();
    addressDto3.setAddressType('o');
    addressDto3.setStreet("1843 Main Street");
    addressDto3.setCity("London");
    addressDto3.setState("IL");
    addressDto3.setCountry("USA");

    List<AddressDto> addresses = new ArrayList<>();
    addresses.add(addressDto1);
    addresses.add(addressDto2);
    addresses.add(addressDto3);

    employeeDto.setAddress(addresses);

        return ResponseEntity.ok(employeeDto);
    }

}
