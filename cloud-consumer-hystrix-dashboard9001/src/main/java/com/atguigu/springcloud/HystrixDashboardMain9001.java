package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Auther: wuxia
 * @Date: 2020/05/11/23:40
 * 在地址栏输入：
 * http://localhost:9001/hystrix
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class, args);
    }
}
