package com.tms.lessons47.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AuthorizationController {
    @GetMapping("/authority")
    public String authorityPage() {
        return "authority";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }
}
