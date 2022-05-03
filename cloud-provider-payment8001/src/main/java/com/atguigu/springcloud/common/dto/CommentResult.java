package com.atguigu.springcloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: wuxia
 * @Date: 2022/05/02 15:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentResult<T> {
    private String code;
    private String message;
    private T data;

    public CommentResult(String code, String message) {
        this.code = code;
        this.message = message;
    }
}

