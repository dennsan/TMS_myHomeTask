package com.tms.lessons43store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.tms.lessons43store.client")
public class Lessons43StoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lessons43StoreApplication.class, args);
    }

}
