package com.example.demo.service;

import com.example.demo.dto.AddressDto;
import com.example.demo.dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {


   public EmployeeDto getAllEmployees(){
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

       List<AddressDto> addressesDtoList = new ArrayList<>();
       addressesDtoList.add(addressDto1);
       addressesDtoList.add(addressDto2);
       addressesDtoList.add(addressDto3);

       employeeDto.setAddress(addressesDtoList);

       return employeeDto;
   }
}
