package com.camunda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Camunda2Application {

    public static void main(String[] args) {
        SpringApplication.run(Camunda2Application.class, args);
    }
//docker run --name camunda -d -p 8090:8080 camunda/camunda-bpm-platform:run-latest
}
