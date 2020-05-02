package com.qyc.repository;

import com.qyc.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qyc
 * @time 2020/4/23 - 15:12
 */
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
