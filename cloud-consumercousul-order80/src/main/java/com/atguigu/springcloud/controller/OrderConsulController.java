package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Auther: wuxia
 * @Date: 2020/05/10/22:55
 */
@RestController
public class OrderConsulController {
    @Resource
    private RestTemplate restTemplate;
    public static final String INVOKE_URL = "http://cloud-provider-service";

    @GetMapping("/consumer/consul")
    public String paymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return result;
    }
}
