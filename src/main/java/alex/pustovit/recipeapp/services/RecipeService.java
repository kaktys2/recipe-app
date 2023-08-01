package alex.pustovit.recipeapp.services;

import alex.pustovit.recipeapp.commands.RecipeCommand;
import alex.pustovit.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(Long l);
}
