package com.qyc.cfg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qyc
 * @time 2020/5/11 - 1:24
 */
@RestController
public class Controller {
    @Resource
    private Cfg cfg;

    @GetMapping("/sendMessage")
    public String test01(){
        return cfg.send();
    }
}
