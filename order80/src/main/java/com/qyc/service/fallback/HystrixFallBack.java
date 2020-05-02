package com.qyc.service.fallback;

import com.qyc.bean.Order;
import com.qyc.service.HystrixService;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author qyc
 * @time 2020/5/3 - 1:42
 */
@Component  //服务降级处理，用于服务端宕机
public class HystrixFallBack implements HystrixService {
    @Override
    public Optional<Order> select_ok(int id) {
        Order order = new Order(3,"服务端宕机");
        return Optional.of(order);
    }

    @Override
    public Optional<Order> select_no(int id) throws InterruptedException {
        return Optional.empty();
    }


}
