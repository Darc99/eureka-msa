package com.darc.eurekamsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMsaApplication.class, args);
    }

}
