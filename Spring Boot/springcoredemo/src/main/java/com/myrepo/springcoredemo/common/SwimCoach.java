package com.myrepo.springcoredemo.common;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

public class SwimCoach  implements Coach{
    public SwimCoach(){
        System.out.println("Inside SwimCoach Constructor: "+getClass().getSimpleName().toUpperCase());
    }

    @Override
    public String getDailyWorkout(){
        System.out.println("Inside SwimCoach Method: "+getClass().getSimpleName().toUpperCase());
        return getClass().getSimpleName().toUpperCase()+":  Practise swimming for 45  Per day";
    }
}
