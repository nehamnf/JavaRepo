package com.mysprigboot.thymeleafdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showform")
    public String showForm(){
        return "helloworldform";
    }


    @RequestMapping("/processForm")
    public String processForm(){
        return "processForm";
    }
}
