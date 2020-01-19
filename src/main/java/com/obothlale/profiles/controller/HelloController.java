package com.obothlale.profiles.controller;

import com.obothlale.profiles.client.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloWorld helloWorld;

    @GetMapping("/hello")
    public String greetings(){
        return helloWorld.greetings();
    }
}
