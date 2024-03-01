package com.tms.lessons49.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class UserController {
    @PostMapping("/home")
    public String homePage(){
        return "home";
    }
    @PostMapping("/private")
    public String adminPage(){
        return "private";
    }
}
