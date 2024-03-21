package com.example.try1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("com.example.try1.models")
public class Try1Application {
    public static void main(String[] args) {
        SpringApplication.run(Try1Application.class, args);
    }
}