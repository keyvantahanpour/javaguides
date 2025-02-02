package com.test.javaguides;

import com.test.javaguides.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.test.javaguides")
public class JavaguidesApplication {



    public static void main(String[] args) {
        SpringApplication.run(JavaguidesApplication.class, args);
    }

}
