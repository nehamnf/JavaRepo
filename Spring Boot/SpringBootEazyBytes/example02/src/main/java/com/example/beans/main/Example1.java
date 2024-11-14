package com.example.beans.main;

import com.example.beans.Vehicle;
import com.example.beans.config.ProjectConfig;

public class Example1 {

    public static void main(String[] args) {



        var context = new org.springframework.context.annotation.AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+vehicle1.getName());
        vehicle1.printHello();


        Integer integer = context.getBean(Integer.class);
        System.out.println("Integer value from spring context is: "+integer);

        String str=context.getBean(String.class);
        System.out.println("String value from spring context is: "+str);
    }
}
