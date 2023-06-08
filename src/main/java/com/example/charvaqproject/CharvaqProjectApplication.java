package com.example.charvaqproject;

import com.example.charvaqproject.config.OpenApiProperties;
import com.example.charvaqproject.config.ServerProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({
        OpenApiProperties.class,
        ServerProperties.class
})


@SpringBootApplication
public class CharvaqProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharvaqProjectApplication.class, args);
    }

}
