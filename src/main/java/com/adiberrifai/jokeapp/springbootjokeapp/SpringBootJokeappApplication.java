package com.adiberrifai.jokeapp.springbootjokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringBootJokeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJokeappApplication.class, args);
    }

}

