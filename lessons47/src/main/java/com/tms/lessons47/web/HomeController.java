package com.tms.lessons47.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping("/public")
    public String publicPage() {
        return "public";
    }

    @GetMapping("/out")
    public String out() {
        return "out";
    }
}
