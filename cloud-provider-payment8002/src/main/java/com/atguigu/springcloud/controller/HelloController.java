package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wuxia
 * @Date: 2020/05/07/21:50
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private String serverPort;

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

}
