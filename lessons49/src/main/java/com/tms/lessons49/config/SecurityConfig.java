package com.tms.lessons49.config;

import com.tms.lessons49.filter.TokenGenerationFilter;
import com.tms.lessons49.filter.TokenValidationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter;

@Configuration
public class SecurityConfig {
    @Autowired
    private TokenGenerationFilter tokenGenerationFilter;
    @Autowired
    private TokenValidationFilter tokenValidationFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(cust -> {
            cust
                    .requestMatchers("/home").permitAll()
                    .requestMatchers("/private").hasRole("ADMIN");
        });

        http.addFilterAfter(tokenGenerationFilter, LogoutFilter.class);
        http.addFilterBefore(tokenValidationFilter, SecurityContextHolderAwareRequestFilter.class);

        http.cors(AbstractHttpConfigurer::disable);
        http.csrf(AbstractHttpConfigurer::disable);
        return http.build();
    }
}
