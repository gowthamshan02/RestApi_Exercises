package com.example.demo.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class name {
	private String studentName = "Gowtham";
	@RequestMapping("/")
	public String getName()
	{
		return "Welcome "+studentName+"!";
	}
}
