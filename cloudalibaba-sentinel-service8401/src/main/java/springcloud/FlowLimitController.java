package springcloud;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import feign.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wuxia
 * @Date: 2022/05/17 16:48
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    @SentinelResource
    public String testA() {
        System.out.println("testA");
        return "----------testA";
    }

    @SentinelResource(value = "testB")
    @GetMapping("/testB")
    public String testB() {
        System.out.println("testB");
        return "----------testB";
    }

    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey",fallback = "fallback_testHotKey")
    @GetMapping("/testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2) {
        return "--------testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception) {
        return "--------deal_testHotKey ,o(π_π)o----";
    }

    public String fallback_testHotKey(String p1, String p2, BlockException exception) {
        return "--------fallback_testHotKey ,o(π_π)o----";
    }
}

