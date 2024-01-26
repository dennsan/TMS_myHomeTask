package com.tms.lessons47.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PermissionController {
    @GetMapping("/write")
    public String writePage() {
        return "write";
    }
}
