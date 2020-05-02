package com.qyc.hystrex.repository;

import com.qyc.hystrex.bean.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qyc
 * @time 2020/5/2 - 22:56
 */
public interface OrderRepository extends JpaRepository<Order,Integer> {

}
