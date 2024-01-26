package com.tms.lessons47.web;

import com.tms.lessons47.model.UserDto;
import lombok.RequiredArgsConstructor;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping
public class UserController {
    private final JdbcUserDetailsManager manager;
    private final PasswordEncoder encoder;

    @PostMapping("/registration")
    public String save(UserDto user) {
        manager
                .createUser(User.builder()
                        .username(user.getUsername())
                        .password(encoder.encode(user.getPassword()))
                        .roles("USER")
                        .build());
        return "public";
    }
}
