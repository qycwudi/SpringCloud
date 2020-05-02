package com.qyc.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author qyc
 * @time 2020/5/2 - 22:29
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker   //开启降级 fallback
public class H8001 {
    public static void main(String[] args) {
        SpringApplication.run(H8001.class,args);
    }
}
