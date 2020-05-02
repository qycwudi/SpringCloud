package com.qyc.controller;

import com.qyc.entity.Order;
import com.qyc.result.CommonResult;
import com.qyc.service.PayService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author qyc
 * @time 2020/4/23 - 15:14
 */
@RestController
public class PayController {
    @Resource
    private PayService service;

    @Value("${server.port}")
    private String port;
    @PostMapping("/select")
//    public CommonResult<Order> test01(@PathVariable("id") int num){
    public CommonResult<Order> test01(@RequestBody Order order1){
        Optional<Order> order = service.findById(order1.getId());
        CommonResult commonResult = new CommonResult();
        if(null!=order){
            commonResult.setCore(200);
            commonResult.setMessage("成功 "+port);
            commonResult.setData(order);
        }else {
            commonResult.setCore(400);
            commonResult.setMessage("失败");
            commonResult.setData(null);
        }
        return commonResult;
    }

    @PostMapping("timeout")
    public String timeoutTest(){
        return port;
    }
}
