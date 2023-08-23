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

        //Admin filter
        http
                .authorizeHttpRequests((authz) -> authz
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .anyRequest().authenticated()
                );

        //User filter
        http
                .authorizeHttpRequests((authz) -> authz
                        .requestMatchers("/user/**").hasAnyRole("ADMIN", "USER")
                        .anyRequest().authenticated()
                );

        //Anonym User filter
        http
                .authorizeHttpRequests((authz) -> authz
                        .requestMatchers(
                                "/index"
                        ).permitAll().anyRequest().authenticated()
                );

        //Custom login
        http
                .formLogin(form -> form
                        .loginPage("/login")
                        .permitAll()
                );


        //Custom logout
        http
                .authorizeHttpRequests((authorize) -> authorize
                                .requestMatchers("/my/success/endpoint").permitAll()
                        // ...
                )
                .logout((logout) -> logout.logoutSuccessUrl("/my/success/endpoint"));


        //Configured filter returned
        return http.build();

    }

}
