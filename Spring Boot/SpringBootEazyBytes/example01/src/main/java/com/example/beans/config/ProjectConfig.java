package com.example.beans.config;


import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class ProjectConfig {


    @Bean
    Vehicle vehicle1(){
        var vehicle = new Vehicle();
        vehicle.setName("i20");
        return vehicle;
    }

    @Bean(name = "Creta")
    Vehicle vehicle2(){
        var vehicle = new Vehicle();
        vehicle.setName("Creta");
        return vehicle;
    }

    @Primary
    @Bean(value = "Taigun")
    Vehicle vehicle3(){
        var vehicle = new Vehicle();
        vehicle.setName("Taigun");
        return vehicle;
    }

    @Bean
    String sayHello(){
        return "Hello World";
    }

    @Bean
    Integer number(){
        return 10;
    }


}
