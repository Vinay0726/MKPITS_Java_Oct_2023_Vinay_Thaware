package com.mkpits2.Spring.Boot.Dev.Tool.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
