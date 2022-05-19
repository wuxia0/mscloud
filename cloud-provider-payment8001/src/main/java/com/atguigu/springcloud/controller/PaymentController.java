package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wuxia
 * @Date: 2022/05/03 14:59
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }
    @GetMapping("/payment/get/{id}")//get 请求
    public String jumping1() {
        return "jumping1 from " + serverPort + " service";
    }
}

