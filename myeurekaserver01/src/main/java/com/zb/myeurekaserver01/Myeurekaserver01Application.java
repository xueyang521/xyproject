package com.zb.myeurekaserver01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication 
@EnableEurekaServer
public class Myeurekaserver01Application {
    public static void main(String[] args) {
        SpringApplication.run(Myeurekaserver01Application.class, args);
    }

}













