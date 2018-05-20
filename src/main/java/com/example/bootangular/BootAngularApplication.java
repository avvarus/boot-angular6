package com.example.bootangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.example.bootangular")
public class BootAngularApplication {

    public static void main (String[] args) {
        SpringApplication.run (BootAngularApplication.class, args);
    }
}
