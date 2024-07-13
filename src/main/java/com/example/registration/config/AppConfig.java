package com.example.registration.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${jwt.secret:eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTcyMDkwNjM1NiwiaWF0IjoxNzIwOTA2MzU2fQ.ySGypfDwu-jrAbhZGEh6fUO-dg3iXJX5FYP2RqdDSj0}")
    private String jwtSecret;

    @PostConstruct
    public void init() {
        System.out.println("JWT Secret Key: " + jwtSecret);
    }
}

