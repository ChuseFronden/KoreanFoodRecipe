package com.fronden.koreanfoodrecipes.recipe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	@GetMapping()
	public List<Recipe> getRecipes() {
		return recipeRepository.findAll();
	}
	
	@PostMapping()
	public Recipe setRecipe(@RequestBody Recipe recipe) {
		return recipeRepository.save(recipe);
	}
	
	@DeleteMapping("/{id}")
	public void deleteRecipe(@PathVariable String id) {
		recipeRepository.deleteById(id);
	}

}
