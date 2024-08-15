package com.ezsoft.mag.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class MagSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    return http
        .authorizeHttpRequests(request -> request.requestMatchers(new AntPathRequestMatcher("/actuator/**")).permitAll()
            .anyRequest().authenticated())
            .formLogin(Customizer.withDefaults())
        .build();
    }
}
