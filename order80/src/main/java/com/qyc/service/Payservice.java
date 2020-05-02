package com.qyc.service;

import com.qyc.bean.CommonResult;
import com.qyc.bean.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author qyc
 * @time 2020/5/2 - 19:34
 */
@Component
@FeignClient(value = "PAY-SERVICE")   //使用feign
public interface Payservice {   //与8001 8002 controller匹配
    @PostMapping("/select")
    public CommonResult select(@RequestBody Order order) ;

    @PostMapping("timeout")
    public String timeoutTest();
}
