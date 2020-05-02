package com.qyc.service;

import com.qyc.entity.Order;
import com.qyc.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author qyc
 * @time 2020/4/22 - 17:19
 */
@Service
public class Payservice {
    @Autowired
    private OrderRepository repository;
    public int addOrder(Order order){
        Order order1 = repository.save(order);
        if(null!=order1){
            return 1;
        }
        return 0;
    }

    public Optional<Order> select(Integer id){

        return repository.findById(id);
    }
//    public Optional<Order> select(Integer id){
//        List<Order> list = repository.findAll();
//        for (Order o :
//                list) {
//            System.out.println(o.toString());
//        }
//        return null;
//    }
}
