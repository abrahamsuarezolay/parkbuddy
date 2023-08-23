package com.parkbuddy.ParkBuddy.security;

import com.parkbuddy.ParkBuddy.service.ServiceUserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    ServiceUserImpl serviceUser;

    @Bean
    public BCryptPasswordEncoder encrypt() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        //Autenticate user
        http.getSharedObject(AuthenticationManagerBuilder.class).userDetailsService(serviceUser)
                .passwordEncoder(encrypt());

        //Basic filter
        http
                .authorizeHttpRequests((authz) -> authz
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/user/**").hasAnyRole("ADMIN", "USER")
                        .anyRequest().authenticated()
                );

        //Custom login
        http
                .formLogin(form -> form
                                .loginPage("/login")
                                .permitAll());

        //Custom logout
        http
                .logout((logout) -> logout.logoutSuccessUrl("/my/success/endpoint"));

        //Configured filter returned
        return http.build();

    }

}
