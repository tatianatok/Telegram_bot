package com.example.t_okbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TOkbotApplication {

    public static void main(String[] args) {
        SpringApplication.run(TOkbotApplication.class, args);
    }

}
