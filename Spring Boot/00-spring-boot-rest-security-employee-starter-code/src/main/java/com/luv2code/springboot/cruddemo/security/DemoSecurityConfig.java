package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.net.http.HttpRequest;

@Configuration
public class DemoSecurityConfig {


    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails neha= User.builder().username("neha").password("{noop}nehamn").roles("EMPLOYEE").build();
        UserDetails safi= User.builder().username("safi").password("{noop}safi").roles("MANAGER").build();
        UserDetails zoya= User.builder().username("zoya").password("{noop}zoya").roles("AdMIN").build();
        return new InMemoryUserDetailsManager(neha,safi,zoya);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(configurer -> {
            configurer
                    .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE")
                    .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
                    .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
                    .requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER")
                    .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN");
            });

        http.httpBasic(Customizer.withDefaults());

        http.csrf( csrf -> csrf.disable());

        return http.build();

    }
}
