package com.myrepo.springcoredemo.config;

import com.myrepo.springcoredemo.common.Coach;
import com.myrepo.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class sportConfig {

    @Bean
    @Primary
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
