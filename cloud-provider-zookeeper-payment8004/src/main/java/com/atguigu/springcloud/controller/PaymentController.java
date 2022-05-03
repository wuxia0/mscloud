package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Auther: wuxia
 * @Date: 2020/05/10/15:46
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String servertPort;

    @GetMapping("/payment/zk")
    public String paymentzk() {
        return "Springcloud with zookeeper:" + servertPort + "\t" + UUID.randomUUID().toString();
    }
}
