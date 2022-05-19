package springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: wuxia
 * @Date: 2022/05/18 22:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private T data;
    private Integer code;
    private String message;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

