package com.fronden.koreanfoodrecipes;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fronden.koreanfoodrecipes.recipe.Recipe;
import com.fronden.koreanfoodrecipes.recipe.RecipeRepository;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

}
	@Bean
	public String init(RecipeRepository recipeRepository) {
		recipeRepository.save(new Recipe("Kimchi", "red", "water"));
		return "";
	}
	
}