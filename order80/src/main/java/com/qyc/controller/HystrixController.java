package com.qyc.controller;


import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.qyc.bean.Order;
import com.qyc.service.HystrixService;
import javafx.beans.DefaultProperty;
import org.springframework.cloud.openfeign.support.FallbackCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Optional;

/**
 * @author qyc
 * @time 2020/5/2 - 23:20
 */
@RestController

public class HystrixController {
    @Resource
    private HystrixService hystrixService;

    @HystrixCommand(fallbackMethod = "defaultsss" ,commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="10000")
    })
    @PostMapping("hystrix/ok/{id}")
    public Optional<Order> ok(@PathVariable("id") Integer id){

        return hystrixService.select_ok(id);
    }

    @PostMapping("hystrix/no/{id}")

    @HystrixCommand(fallbackMethod = "errors",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="10000")
    })
    public Optional<Order> no(@PathVariable("id") Integer id) throws InterruptedException {

        return hystrixService.select_no(id);
    }
    public Optional<Order> errors(@PathVariable("id") Integer id) throws InterruptedException {
        Order order = new Order(2,"80错误");

        return Optional.of(order);
    }



    public Optional<Order> defaultsss(@PathVariable("id") Integer id){
        Order order = new Order(2,"80 defaults 错误");

        return Optional.of(order);
    }





}
