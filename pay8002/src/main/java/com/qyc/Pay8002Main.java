package com.qyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qyc
 * @time 2020/4/23 - 14:54
 */
@SpringBootApplication
@EnableEurekaClient
public class Pay8002Main {
    public static void main(String[] args) {
        SpringApplication.run(Pay8002Main.class,args);
    }
}
