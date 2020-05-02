package com.qyc;


import com.MySelfRole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qyc
 * @time 2020/4/22 - 17:54
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //发现服务
@EnableFeignClients     //开启feign   使用 @feignClient
@RibbonClient(name="PAY-SERVICE",configuration = MySelfRole.class)   //自定义负载均衡
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
