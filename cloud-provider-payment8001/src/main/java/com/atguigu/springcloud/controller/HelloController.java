package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: wuxia
 * @Date: 2020/05/07/21:50
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private String serverPort;
    @Resource
    private DiscoveryClient discoveryClient;


    @PostMapping("/hello")//post请求
    public String hello() {
        return "hello";
    }

    @GetMapping("/jumping")//get 请求
    public String jumping() {
        return "jumping from " + serverPort + " service";
    }

    @GetMapping("/ribbonS")
    public String ribbon() {
        return "ribbon from " + serverPort;
    }

    //通过服务发现，获取服务列表
    //对外暴露这个访问地址，就能知道eureka上有哪些服务
    @GetMapping("/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            if (service != null) {
                System.out.println(service);
            }
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-SERVICE");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort());
        }
        return services;
    }

    @GetMapping("/jumping2/lb")//get 请求
    public String jumping2() {
        return "jumping2 from " + serverPort + " service->payment/lb";
    }
}
