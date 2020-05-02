package com.qyc.hystrex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author qyc
 * @time 2020/5/2 - 22:51
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableHystrix
public class H8002 {
    public static void main(String[] args) {
        SpringApplication.run(H8002.class,args);
    }
}
