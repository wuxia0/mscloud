package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: wuxia
 * @Date: 2020/05/07/22:38
 */
@Configuration
public class ApplicationContextConfig {
    @Bean("restTemplate")
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean("restTemplateRibbon")
    @LoadBalanced//表示开启负载均衡，默认是轮询
    public RestTemplate getRestTemplateRibbon() {
        return new RestTemplate();
    }
}
