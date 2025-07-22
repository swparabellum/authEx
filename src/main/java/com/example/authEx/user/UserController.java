package com.example.authEx.user;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/home")
    public String mainPage(){
        return "mainPage";
    }

    @GetMapping("/login")
    public String login(){return "login";}


}
