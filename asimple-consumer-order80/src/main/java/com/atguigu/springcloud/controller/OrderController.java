package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Auther: wuxia
 * @Date: 2020/05/07/22:17
 */
@RestController
public class OrderController {
    @Resource
    RestTemplate restTemplate;

    //从配置文件获取服务提供者的url信息，而不用在这里写死
    @Value("${provider.providerServiceUrl}")
    private String providerServiceUrl;

    @GetMapping("/orderjumping11")
    public String jump() {
        return restTemplate.getForObject("http://localhost:8001/jumping", String.class);
        // String url = providerServiceUrl+"jumping";
        //System.out.println("==="+url);
        // return restTemplate.getForObject(url, String.class);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello consumer service!";
    }
}
