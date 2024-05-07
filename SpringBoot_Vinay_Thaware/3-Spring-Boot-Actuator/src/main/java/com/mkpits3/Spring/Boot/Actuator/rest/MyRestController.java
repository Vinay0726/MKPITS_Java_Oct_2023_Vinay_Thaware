package com.mkpits3.Spring.Boot.Actuator.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyRestController {
	@GetMapping("/")
	public String getName() {
		return "hello i am vinay";
	}
	
	@GetMapping("/mkpits")
	public String getMkpits() {
		return "hello from Mkpits";
	}
	@GetMapping("/sound")
	public String getSound() {
		return "wroooooooomWrooooooom";
	}
}
