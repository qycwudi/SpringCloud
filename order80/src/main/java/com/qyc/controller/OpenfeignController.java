package com.qyc.controller;

import com.qyc.bean.CommonResult;
import com.qyc.bean.Order;
import com.qyc.service.Payservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qyc
 * @time 2020/5/2 - 19:40
 */
@RestController
public class OpenfeignController {
    @Resource
    private Payservice payservice;
    @PostMapping("/openfeign/pay/{id}")
    public CommonResult<Order> test01(@PathVariable("id") int id){
        Order order = new Order(id,null);
        return payservice.select(order);
    }

    @PostMapping("/openfeign/timeout")
    public String test01(){

        return payservice.timeoutTest();
    }
}
