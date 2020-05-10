package com.qyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qyc
 * @time 2020/5/11 - 2:12
 */
@SpringBootApplication
@EnableEurekaClient
public class Main8802 {
    public static void main(String[] args) {
        SpringApplication.run(Main8802.class,args);
    }
}
