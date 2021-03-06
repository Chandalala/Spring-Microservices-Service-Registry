package com.chandalalatinashe.spring.microservices.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringMicroservicesServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesServiceRegistryApplication.class, args);
    }

}
