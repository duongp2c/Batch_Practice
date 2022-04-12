package com.example.demo_batch_alejandro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DemoBatchAlejandroApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBatchAlejandroApplication.class, args);
    }

}
