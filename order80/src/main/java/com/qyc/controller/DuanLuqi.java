package com.qyc.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author qyc
 * @time 2020/5/3 - 3:10
 */
@RestController
public class DuanLuqi {

    @PostMapping("/duanluqi/test/{id}")
    @HystrixCommand(fallbackMethod = "errorss",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled",value = "true"),  //开启熔断
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "5"), //请求数
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "10000"),  //窗口时间
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "50")  //错误率
    })
    public String test1(@PathVariable("id") Integer id){
        if(id<0){
            throw new RuntimeException();
        }
        return "成功  "+ UUID.randomUUID().toString();
    }
    public String errorss(@PathVariable("id") Integer id){

        return "失败***"+ UUID.randomUUID().toString();
    }
}
