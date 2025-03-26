package com.antonio.first_spring_app.controller;

import com.antonio.first_spring_app.Service.HelloWorldService;
import com.antonio.first_spring_app.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/{id}")
    public String helloWorldPost (@PathVariable("id") String id,@RequestParam(value="filter",defaultValue = "nenhum") String filter, @RequestBody User body){
        return "Hello World Post" + filter;
        //return "Hello World Post" + body.getUser() + id;
    }
}
