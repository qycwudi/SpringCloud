package com.qyc.service;

import com.qyc.entity.Order;
import com.qyc.repository.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author qyc
 * @time 2020/4/23 - 15:21
 */
@Service
public class PayService {
    @Resource
    private OrderRepository repository;
    public Optional<Order> findById(int id){
        return repository.findById(id);
    }
}
