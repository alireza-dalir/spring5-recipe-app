package guru.springframework.spring5recipeapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping({"","/index.html","/","/index"})
    public String IndexController(){


        return "index";
    }

}
