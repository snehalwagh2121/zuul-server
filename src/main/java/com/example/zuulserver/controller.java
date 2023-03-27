package com.example.zuulserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "hello!";
    }
}
