package com.qyc.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

/**
 * @author qyc
 * @time 2020/4/23 - 0:28
 */
@Configuration
public class RestTemplatecfg {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
