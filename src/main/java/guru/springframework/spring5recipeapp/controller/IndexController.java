package guru.springframework.spring5recipeapp.controller;


import guru.springframework.spring5recipeapp.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    private  final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/index.html","/","/index"})
    public String IndexController(Model  model){

        model.addAttribute("recipes",recipeService.getRecipes());

        return "index";
    }

}
