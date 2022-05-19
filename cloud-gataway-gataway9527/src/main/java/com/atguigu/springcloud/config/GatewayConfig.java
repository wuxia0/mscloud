package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: wuxia
 * @Date: 2020/05/17/18:53
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customerLocator(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route("path_route_atguigu",r -> r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .build();
    }
}
