package com.tw.nodocker.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("/hello/")
    public String sayHello() {
        return "Hello world, welcome to no docker demo";
    }
}
