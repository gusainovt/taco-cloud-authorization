package com.example.tacocloudauthorization.config;

import com.example.tacocloudauthorization.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(
                auth -> auth.anyRequest().authenticated()
        ).formLogin(form -> form
                        .loginPage("/login").permitAll())
                .logout(LogoutConfigurer::permitAll)
                .build();
    }

    @Bean
    public UserDetailsService userDetailsService(UserService userService) {
        return username -> userService.getUserByUsername(username);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
