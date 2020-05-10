package com.qyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qyc
 * @time 2020/5/10 - 23:13
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Main3344 {
    public static void main(String[] args) {
        SpringApplication.run(Main3344.class,args);
    }
}
