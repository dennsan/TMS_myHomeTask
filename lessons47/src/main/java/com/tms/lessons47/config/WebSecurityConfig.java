package com.tms.lessons47.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(request -> {
            request
                    .requestMatchers("/public", "/login", "/registration", "/logout", "/out", "/error").permitAll()
                    .requestMatchers("/authority").authenticated()
                    .requestMatchers("/write").hasAnyAuthority("write")
                    .requestMatchers("/user").hasAnyRole("USER");
        });
        http.formLogin(cust -> {
            cust
                    .loginPage("/public")
                    .loginProcessingUrl("/login")
                    .usernameParameter("login")
                    .passwordParameter("cred")
                    .successHandler((request, response, authentication) -> response.sendRedirect("/user"))
                    .failureHandler((request, response, exception) -> response.sendRedirect("/error"));
        });
        http.logout(cust -> {
            cust
                    .logoutUrl("/logout")
                    .logoutSuccessUrl("/out")
                    .invalidateHttpSession(true)
                    .clearAuthentication(true);
        });
        http.cors(AbstractHttpConfigurer::disable);
        http.csrf(AbstractHttpConfigurer::disable);

        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
