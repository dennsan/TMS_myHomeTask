package com.tms.lessons47.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(request -> {
            request
                    .requestMatchers("/public").permitAll()
                    .requestMatchers("/authority").authenticated()
                    .requestMatchers("/write").hasAnyAuthority("write");
        });
        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public UserDetailsManager userDetailsManager() {

        UserDetails user1 = User.builder()
                .username("user1")
                .password("pass1")
                .authorities("write")
                .build();
        UserDetails user2 = User
                .builder()
                .username("user2")
                .password("pass2")
                .build();
        return new InMemoryUserDetailsManager(user1, user2);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
