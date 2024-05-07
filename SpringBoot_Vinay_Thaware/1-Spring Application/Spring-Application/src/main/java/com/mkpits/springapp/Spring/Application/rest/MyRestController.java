package com.mkpits.springapp.Spring.Application.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;





@RestController

public class MyRestController {

	 @GetMapping("/")
	    public String method1() {
	        return "This is method from vinay";
	    }
	 
	 @GetMapping("/n")
	 public String getName() {
	 	return "vinay";
	 }
	 

	 

	    
	   
	
	
}
