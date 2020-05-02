package com.qyc.controller;

import com.qyc.entity.Order;
import com.qyc.result.CommonResult;
import com.qyc.service.Payservice;
import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @author qyc
 * @time 2020/4/22 - 17:19
 */
@RestController
public class PayController {
    @Resource
    private Payservice payservice;

    @Value("${server.port}")
    private String port;
    @PostMapping("/add")
    public CommonResult<Order> add(Order order){
        int i = payservice.addOrder(order);
        if(i==1){
            return new CommonResult<Order>(i,"成功", order);
        }
       else return new CommonResult<Order>(i,"失败", order);
    }
//
    @PostMapping("/select")
    public CommonResult select(@RequestBody Order order) {

        Optional<Order> order1 = payservice.select(order.getId());
        CommonResult commonResult = new CommonResult();
        if(null!=order){
            commonResult.setCode(200);
            commonResult.setMessage("成功 "+port);
            commonResult.setData(order1);
        }else {
            commonResult.setCode(400);
            commonResult.setMessage("失败");
            commonResult.setData(null);
        }
        return commonResult;
    }

    @PostMapping("timeout")
    public String timeoutTest() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);  //睡三秒  ribbon默认等待1秒
        return port;
    }
}
