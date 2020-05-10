package com.qyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author qyc
 * @time 2020/5/11 - 1:19
 */
@SpringBootApplication
@EnableEurekaClient
public class Main8801 {
    public static void main(String[] args) {
        SpringApplication.run(Main8801.class,args);
    }
}
