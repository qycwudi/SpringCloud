package com.qyc.cfg;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author qyc
 * @time 2020/5/11 - 1:19
 */

//不是service

@EnableBinding(Source.class)  //定义消息推送管道
public class CfgImpl implements Cfg{

    @Resource
    private MessageChannel output;  //发送管道
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("**********"+serial);
        return null;
    }
}
