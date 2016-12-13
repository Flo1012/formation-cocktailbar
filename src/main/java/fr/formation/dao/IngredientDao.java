package fr.formation.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import fr.formation.entity.Ingredient;

@Component
public class IngredientDao {

	public List<Ingredient> readAll() {
		return Arrays.asList(new Ingredient("Rhum", 0),
				new Ingredient("Tequila", 0), new Ingredient("Whiskey", 0),
				new Ingredient("Ice cubes", 1), new Ingredient("Sugar", 1),
				new Ingredient("CO2", 2));
	}
}
