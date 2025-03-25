package com.antonio.first_spring_app.controller;

import com.antonio.first_spring_app.Service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

   /* public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }*/
    @GetMapping
    public  String helloWorld(){
        return helloWorldService.helloWorld("Antonio");
    }
}
