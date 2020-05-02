package com.qyc.hystrix.service;

import com.qyc.hystrix.bean.Order;
import com.qyc.hystrix.repository.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author qyc
 * @time 2020/5/2 - 22:57
 */
@Service
public class OrderService {
    @Resource
    private OrderRepository orderRepository;

    public Optional<Order> selectById(Integer id){
        return orderRepository.findById(id);
    }
}
