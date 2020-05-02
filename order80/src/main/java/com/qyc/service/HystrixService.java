package com.qyc.service;

import com.qyc.bean.Order;
import com.qyc.service.fallback.HystrixFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

/**
 * @author qyc
 * @time 2020/5/2 - 23:17
 */
@Component
//@FeignClient(value = "Hystrex",fallback = HystrixFallBack.class)
@FeignClient(value = "Hystrex")
public interface HystrixService {
    @PostMapping("hystrix/select_ok")
    public Optional<Order> select_ok(@RequestBody int id);

    @PostMapping("hystrix/select_no")
    public Optional<Order> select_no(@RequestBody int id) throws InterruptedException ;
}
