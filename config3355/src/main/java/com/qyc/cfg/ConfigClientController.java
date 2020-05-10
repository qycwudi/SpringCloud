package com.qyc.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qyc
 * @time 2020/5/10 - 23:38
 */
@RestController
@RefreshScope   //刷新post   http://localhost:3355/actuator/refresh
public class ConfigClientController {
    @Value("${server.port}")
    private String port;

    @Value("${config.info}")
    private String info;

    @GetMapping("/configInfo")
    public String test01(){
        return info;
    }
}
