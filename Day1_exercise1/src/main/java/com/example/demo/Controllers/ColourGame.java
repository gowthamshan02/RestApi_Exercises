package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColourGame {
	private String yourFavColor = "Blue";
	@GetMapping("/color")
	public String getMyFav()
	{
		return "My favourite color is "+yourFavColor;
	}
}
