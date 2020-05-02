package com.qyc.cfg;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qyc
 * @time 2020/5/2 - 20:49
 */
@Configuration
public class Loggingcfg {
    @Bean
    Logger.Level feignLoggerLevel(){
        return  Logger.Level.FULL;   //开启日志
    }
}
