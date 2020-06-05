package com.fronden.koreanfoodrecipes;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KoreanFoodRecipesController {
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
