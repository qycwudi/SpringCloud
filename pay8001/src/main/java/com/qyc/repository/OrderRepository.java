package com.qyc.repository;

import com.qyc.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qyc
 * @time 2020/4/22 - 17:33
 */
public interface OrderRepository extends JpaRepository<Order,Integer> {
    public Order findByNumber(String number);
}
