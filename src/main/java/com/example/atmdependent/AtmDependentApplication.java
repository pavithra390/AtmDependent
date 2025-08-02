package com.example.atmdependent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AtmDependentApplication {

    public static void main(String[] args) {

        SpringApplication.run(AtmDependentApplication.class, args);
    }
    @Bean
    public RestTemplate rt(){
        return new RestTemplate();
    }

}
