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
    @Resource(name = "restTemplate")
    RestTemplate restTemplate;
    @Resource(name = "restTemplateRibbon")
    RestTemplate restTemplateRibbon;

    //从配置文件获取服务提供者的url信息，而不用在这里写死
    @Value("${provider.providerServiceUrl}")
    private String providerServiceUrl;

    //测试此微服务能不能调通服务提供者
    @GetMapping("/orderjumping")
    public String jump() {
        // return restTemplate.getForObject("http://localhost:8001/jumping", String.class);
        String url = providerServiceUrl + "jumping";
        System.out.println("===" + url);
        return restTemplate.getForObject(url, String.class);
    }

    //测试此微服务是否能访问
    @GetMapping("/hello")
    public String hello() {
        return "hello consumer service!";
    }

    @GetMapping("/ribbonClient")
    public String ribbon() {
        //CLOUD-PROVIDER-SERVICE 是注册到eureka server的服务名称，写死成某个ip是不行的
        String url = "http://CLOUD-PROVIDER-SERVICE" + "/ribbonS";
        System.out.println("===" + url);
        return restTemplateRibbon.getForObject(url, String.class);
    }
}
