package com.sudoku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Main Spring Boot application class for Sudoku game backend
 */
@SpringBootApplication
public class SudokuApplication {
    public static void main(String[] args) {
        SpringApplication.run(SudokuApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/sudoku/**")
                        .allowedOrigins("https://gorgeous-granita-2eff9a.netlify.app")
                        .allowedMethods("*");
            }
        };
    }
}