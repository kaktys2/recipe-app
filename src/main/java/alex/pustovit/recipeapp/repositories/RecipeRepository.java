package alex.pustovit.recipeapp.repositories;

import alex.pustovit.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
