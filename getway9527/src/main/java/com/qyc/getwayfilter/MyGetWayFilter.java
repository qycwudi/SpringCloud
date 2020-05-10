package com.qyc.getwayfilter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerRequest;


/**
 * @author qyc
 * @time 2020/5/10 - 18:27
 */
//@Component
public  class MyGetWayFilter implements GlobalFilter, Ordered {

    //全局日志记录，统一网关鉴权
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {


//        String name = exchange.getRequest().getQueryParams().getFirst("id");
//        System.out.println(name);
//        if(name==null){
//            System.out.println("用户名不能为空");
//            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
//            return  exchange.getResponse().setComplete();
//        }
        System.out.println("通过");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
