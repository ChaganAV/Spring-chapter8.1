package com.example.chapter7;

//import com.example.chapter7.models.Model;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
    @RequestMapping("/home")
    public String home(Model page){
        page.addAttribute("username", "Katy");
        page.addAttribute("color", "red");
        return "home.html";
    }
    @RequestMapping("/test")
    public String test(@RequestParam(required = false) String color,
                       @RequestParam(required = false) String name, Model page){
        page.addAttribute("username", name);
        page.addAttribute("color",color);
        return "test.html";
    }
    @RequestMapping("/test/{color}")
    public String test(@PathVariable String color,
                       Model page){
        page.addAttribute("username","Katy");
        page.addAttribute("color", color);
        return "test.html";
    }
}
