package com.example.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfig {
    @Bean
    InMemoryUserDetailsManager users(){
        return new InMemoryUserDetailsManager(
            User.withUsername("user")
            .password("{noop}12345678")
            .roles("USER")
            .build(),
            User.withUsername("admin")
            .password("{noop}123456")
            .roles("ADMIN","USER")
            .build()
            
            
        );
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        return http
              .authorizeHttpRequests((authz)->authz
              .anyRequest().authenticated())
            .formLogin(Customizer.withDefaults())
            .logout().permitAll()
            .and()
            .build();
    }

    
}
