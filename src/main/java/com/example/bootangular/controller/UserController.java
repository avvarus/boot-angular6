package com.example.bootangular.controller;


import com.example.bootangular.model.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UserController {


    @GetMapping(value = "/user")
    public String getUser(){ return "Soon you will get the list !!!"; }

    @GetMapping("/resource")
    @ResponseBody
    public Map<String, Object> home() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("id", 101);
        model.put("content", "Hello World");
        return model;
    }


    @GetMapping(value = "/user1")
    @ResponseBody
    public List<Topic> values() {

        List<Topic> liveList = new ArrayList<>();

        Topic t1 = new Topic("101", "ID", "Investigation Discovery");
        Topic t2 = new Topic("102", "CN", "Cartoon Network");
        Topic t3 = new Topic("103", "Channel 5", "Channel 5");

        liveList.add(t1);
        liveList.add(t2);
        liveList.add(t3);

        return liveList;
    }
}
