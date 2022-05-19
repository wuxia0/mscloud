package springcloud;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wuxia
 * @Date: 2022/05/18 14:30
 */
@RestController
public class RateLimitController {

    @SentinelResource(value = "byResource", blockHandler = "handlerException")
    @GetMapping("/byResource")
    public String byResource() {
        return "按资源名称限流成功";
    }

    public String handlerException() {
        return "服务不可用";
    }
}

