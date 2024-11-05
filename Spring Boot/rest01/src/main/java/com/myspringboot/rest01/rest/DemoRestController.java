package com.myspringboot.rest01.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {


    @GetMapping("hello")
    public String greeting(){
        return "HELLO NEHA";
    }
}
