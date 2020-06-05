package com.fronden.koreanfoodrecipes.recipe;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface RecipeRepository extends CrudRepository <Recipe, String> {
	List<Recipe> findAll();
}
