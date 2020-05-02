package com.qyc.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.qyc.hystrix.bean.Order;
import com.qyc.hystrix.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
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
//    @HystrixCommand(fallbackMethod = "error",commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")  //超时时间
//    }
//    )
    public Optional<Order> select_no(@RequestBody int id) throws InterruptedException {
//        int a = 10/0;
        TimeUnit.SECONDS.sleep(5);
        Optional<Order> order = orderService.selectById(id);
        order.get().setNumber(port);
        return order;
    }
    public Optional<Order> error(@RequestBody int id)  {
        Optional<Order> order = orderService.selectById(id);
        order.get().setNumber("错误");
        return order;
    }
}
