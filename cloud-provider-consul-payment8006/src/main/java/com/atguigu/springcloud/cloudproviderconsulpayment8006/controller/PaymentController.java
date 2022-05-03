package com.atguigu.springcloud.cloudproviderconsulpayment8006.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Auther: wuxia
 * @Date: 2020/05/10/21:43
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String paymentconsul() {
        return "Springcloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
