package com.qyc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.PrimitiveIterator;

/**
 * @author qyc
 * @time 2020/5/11 - 0:33
 */
@RestController
@RefreshScope
public class CfgController {
    @Value("${server.port}")
    private String port;

    @Value("${config.info}")
    private String info;

    @GetMapping("/configInfo")
    public String test01(){
        return info;
    }
}
