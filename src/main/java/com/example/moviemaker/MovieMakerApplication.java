package com.example.moviemaker;

import com.example.moviemaker.Services.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MovieMakerApplication {


    public static void main(String[] args) {
        SpringApplication.run(MovieMakerApplication.class, args);
        }

    }
