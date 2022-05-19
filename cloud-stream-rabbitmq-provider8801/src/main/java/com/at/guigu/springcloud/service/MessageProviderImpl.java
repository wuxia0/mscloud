package com.at.guigu.springcloud.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import javax.xml.transform.Source;
import java.util.UUID;

/**
 * @Auther: wuxia
 * @Date: 2022/05/05 14:19
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider{
    @Resource
    private MessageChannel output;//消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("**********serial:" + serial);
        return null;
    }
}

