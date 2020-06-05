package com.fronden.koreanfoodrecipes.recipe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idRecipe;
	
	private String title;
	private String description;
	private String steps;
		
	public Recipe() {
	}

	public Recipe(String title, String description, String steps) {
		super();
		this.title = title;
		this.description = description;
		this.steps = steps;
	}

	public long getIdRecipe() {
		return idRecipe;
	}

	public void setIdRecipe(long idRecipe) {
		this.idRecipe = idRecipe;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSteps() {
		return steps;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}
	
	

}

