package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Auther: wuxia
 * @Date: 2020/05/11/22:43
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back paymentInfo_OK ，o(╥﹏╥)o";
    }

    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back paymentInfo_TimeOut ，o(╥﹏╥)o";
    }
}
