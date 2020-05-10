package com.qyc.cfg;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qyc
 * @time 2020/5/10 - 17:58
 */
//@Configuration
public class GetWayConfig {
    @Bean
    RouteLocator custom(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        return routes.build();
    }
}
