package com.example.springbootth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class SpringBootThApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootThApplication.class, args);
    }

}
