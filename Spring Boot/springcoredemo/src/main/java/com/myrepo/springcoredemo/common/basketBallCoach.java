package com.myrepo.springcoredemo.common;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class basketBallCoach implements Coach{

    public basketBallCoach(){
        System.out.println("Inside basketBallCoach Constructor: "+getClass().getSimpleName().toUpperCase());
    }
    @Override
    public String getDailyWorkout(){
        System.out.println("Inside basketBallCoach Method: "+getClass().getSimpleName().toUpperCase());
        return getClass().getSimpleName().toUpperCase()+":  Practise throwing for 30 minutes";
    }
}
