package com.example.bootangular.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping(value = "/user")
    public String getUser(){ return "Soon you will get the list !!!"; }
}
