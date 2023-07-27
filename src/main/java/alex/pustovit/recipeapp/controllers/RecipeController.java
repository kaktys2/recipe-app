package alex.pustovit.recipeapp.controllers;

import alex.pustovit.recipeapp.services.RecipeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/recipe/show/{id}")
    public String showById(@PathVariable String id, Model model){
        Long searchId = Long.parseLong(id);
        model.addAttribute("recipe", recipeService.findById(searchId));

        return "/recipe/show";
    }
}
