package com.qyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qyc
 * @time 2020/5/11 - 2:30
 */
@SpringBootApplication
@EnableEurekaClient
public class Main8803 {
    public static void main(String[] args) {
        SpringApplication.run(Main8803.class,args);
    }
}
