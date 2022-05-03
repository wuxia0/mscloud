package com.atguigu.springcloud.entites;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: wuxia
 * @Date: 2022/05/02 14:56
 */
@Data
public class Payment implements Serializable {
    private String serial;
    private String id;


}

