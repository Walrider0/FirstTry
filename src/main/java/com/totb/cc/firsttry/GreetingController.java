package com.totb.cc.firsttry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("message", "Welcome to our website!");
        return "index"; // Refers to index.html in templates folder
    }
}
