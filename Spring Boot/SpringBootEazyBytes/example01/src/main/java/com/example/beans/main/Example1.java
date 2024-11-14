package com.example.beans.main;

import com.example.beans.Vehicle;
import com.example.beans.config.ProjectConfig;

public class Example1 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi 8");
        System.out.println("Vehicle name from non-spring context is: "+vehicle.getName());

        var context = new org.springframework.context.annotation.AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+vehicle1.getName());


        Vehicle vehicle2 = context.getBean("Creta",Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+vehicle2.getName());


        Vehicle vehicle3 = context.getBean("Taigun",Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+vehicle3.getName());


        Vehicle vehicle4 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+vehicle4.getName());
        Integer integer = context.getBean(Integer.class);
        System.out.println("Integer value from spring context is: "+integer);

        String str=context.getBean(String.class);
        System.out.println("String value from spring context is: "+str);
    }
}
