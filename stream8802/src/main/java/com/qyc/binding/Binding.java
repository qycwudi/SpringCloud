package com.qyc.binding;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author qyc
 * @time 2020/5/11 - 2:16
 */
@Component
@EnableBinding(Sink.class)
public class Binding {

    @Value("${server.port}")
    private String port;
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("端口："+port+"  "+message.getPayload());
    }
}
