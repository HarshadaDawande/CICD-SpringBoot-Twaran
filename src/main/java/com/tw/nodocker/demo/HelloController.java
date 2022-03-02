package com.tw.nodocker.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("/hello-twaran/")
    public String sayHelloTwaran() {
        return "Hello Twaran 2, welcome to no docker demo";
    }
    @GetMapping("/hello/")
    public String sayHello() {
        return "Hello world, welcome to no docker demo";
    }
}
