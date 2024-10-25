package com.myrepo.springcoredemo.rest;

import com.myrepo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController

public class RestControllerDemo {

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public RestControllerDemo(Coach myCoach, Coach anotherCoach){
        this.myCoach=myCoach;
        this.anotherCoach=anotherCoach;
        System.out.println("Inside rest controller Constructor : "+getClass().getSimpleName().toUpperCase());
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }

    @GetMapping("/check")
    public boolean checkBeanScope(){
        return myCoach==anotherCoach;
    }


//    @Autowired
//    public void setMyCoach(@Qualifier("basketBallCoach") Coach myCoach){
//        this.myCoach=myCoach;
//    }

//    @Autowired
//    public void setMyCoach(Coach myCoach){
//        this.myCoach=myCoach;
//    }
}
