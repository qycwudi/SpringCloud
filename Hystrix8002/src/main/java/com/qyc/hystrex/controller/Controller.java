package com.qyc.hystrex.controller;

import com.qyc.hystrex.bean.Order;
import com.qyc.hystrex.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @author qyc
 * @time 2020/5/2 - 22:59
 */
@RestController
public class Controller {
    @Value("${server.port}")
    private String port;
    @Resource
    private OrderService orderService;

    @PostMapping("hystrix/select_ok")
    public Optional<Order> select_ok(@RequestBody int id){

        Optional<Order> order = orderService.selectById(id);
        order.get().setNumber(port);
        return order;
    }
    @PostMapping("hystrix/select_no")
    public Optional<Order> select_no(@RequestBody int id) throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        Optional<Order> order = orderService.selectById(id);
        order.get().setNumber(port);
        return order;
    }
}
