package com.myrepo.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("Inside cricketCoach Constructor: "+getClass().getSimpleName().toUpperCase());
    }

    @PostConstruct
    public void doMyStartUpstuff(){
        System.out.println("Doing My Stuff after starting");
    }

    @PreDestroy
    public void doMyCleanUpstuff(){
        System.out.println("Doing My Stuff before destroying");
    }
    @Override
    public String getDailyWorkout(){
        System.out.println("Inside cricketCoach Method: "+getClass().getSimpleName().toUpperCase());
        return getClass().getSimpleName().toUpperCase()+": Practise bowling for 15 minutes!!!!!! :0";
    }
}
