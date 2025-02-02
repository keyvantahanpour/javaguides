package com.test.javaguides.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AppConfig {

    @Bean
    public CommandLineRunner printProperties(Environment env) {
        return args -> {
            System.out.println("spring.kafka.bootstrap-servers: " + env.getProperty("spring.kafka.bootstrap-servers"));
            System.out.println("spring.kafka.consumer.bootstrap-servers: " + env.getProperty("spring.kafka.consumer.bootstrap-servers"));
            System.out.println("spring.kafka.producer.bootstrap-servers: " + env.getProperty("spring.kafka.producer.bootstrap-servers"));
        };
    }
}
