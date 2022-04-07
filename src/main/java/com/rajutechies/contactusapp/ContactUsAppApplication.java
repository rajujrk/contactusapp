package com.rajutechies.contactusapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ContactUsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContactUsAppApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/contactservice").allowedOrigins("*");
            }
        };
    }

}
