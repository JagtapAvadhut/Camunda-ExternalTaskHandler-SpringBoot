//package com.camunda;
//import org.camunda.bpm.client.ExternalTaskClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class CamundaClientConfig {
//
//    @Bean
//    public ExternalTaskClient externalTaskClient() {
//        return ExternalTaskClient.create()
//                .baseUrl("http://localhost:8090/engine-rest")
//                .workerId("camunda-worker-1")
//                .lockDuration(10000) // 10 seconds
//                .build();
//    }
//}
