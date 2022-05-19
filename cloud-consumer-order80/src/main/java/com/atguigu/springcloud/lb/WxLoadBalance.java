package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Auther: wuxia
 * @Date: 2022/05/03 15:04
 * 手写负载均衡
 */
public interface WxLoadBalance {
    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);
}
