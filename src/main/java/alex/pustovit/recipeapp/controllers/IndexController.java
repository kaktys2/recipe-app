package alex.pustovit.recipeapp.controllers;

import alex.pustovit.recipeapp.domain.Category;
import alex.pustovit.recipeapp.domain.UnitOfMeasure;
import alex.pustovit.recipeapp.repositories.CategoryRepository;
import alex.pustovit.recipeapp.repositories.UnitOfMeasureRepository;
import alex.pustovit.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
