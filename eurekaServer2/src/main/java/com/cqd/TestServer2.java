package com.cqd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TestServer2 {
    public static void main(String[] args) {
        SpringApplication.run(TestServer2.class);
    }
}
