package alex.pustovit.recipeapp.services;

import alex.pustovit.recipeapp.domain.Recipe;
import alex.pustovit.recipeapp.repositories.RecipeRepository;
import jakarta.persistence.Entity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("Hello from log");
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }

    @Override
    public Recipe findById(Long l) {
        Optional<Recipe> recipe = recipeRepository.findById(l);
        if (!recipe.isPresent()){
            throw new RuntimeException("No recipe found");
        }
        return recipe.get();
    }

}
