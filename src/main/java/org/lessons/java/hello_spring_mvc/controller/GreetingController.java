package org.lessons.java.hello_spring_mvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class GreetingController {

    @GetMapping("/greetings")
    public String getMethodName(@RequestParam String name, String email, Model model ) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("time", LocalDateTime.now());

        return "greetings";
    }
    

}
