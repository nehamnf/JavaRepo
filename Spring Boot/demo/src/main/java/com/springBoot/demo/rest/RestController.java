package com.springBoot.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello Hi There Neha";
    }

    @GetMapping("/test")
    public String test(){
        return "Testing new Endpoint";
    }

    @GetMapping("/Example")
    public String Example(){
        return "Testing Example";
    }

    @Value("${test.key}")
    private String customKey;

    @GetMapping("/getKey")
    public String custKey(){
        return customKey;
    }
}
