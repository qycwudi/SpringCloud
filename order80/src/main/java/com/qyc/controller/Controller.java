package com.qyc.controller;

//import com.netflix.discovery.DiscoveryClient;
import com.qyc.bean.CommonResult;
import com.qyc.bean.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

/**
 * @author qyc
 * @time 2020/4/23 - 0:23
 */
@RestController
public class Controller {
//    String path = "http://localhost:8001";  单个服务
    String path = "http://PAY-SERVICE";
    @Resource
    private RestTemplate restTemplate;
    @PostMapping("/pay/{id}")
    public CommonResult<Order> test01(@PathVariable("id") int id){
        Order order = new Order(id,null);
        return restTemplate.postForObject(path+"/select",order,CommonResult.class);
    }

    @Resource
    private DiscoveryClient discoveryClient;
    @GetMapping("/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element:
             services) {
            System.out.println(element);
        }
        List<ServiceInstance> instances =  discoveryClient.getInstances("PAY-SERVICE");
        for (ServiceInstance i:
             instances) {
            System.out.println(i.getServiceId()+"  "+i.getHost()+"  "+i.getPort()+"  "+i.getUri());
        }
        return this.discoveryClient;
    }

}
