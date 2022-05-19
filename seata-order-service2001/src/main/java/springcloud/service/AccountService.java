package springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springcloud.domain.CommonResult;

import java.math.BigDecimal;

/**
 * @Auther: wuxia
 * @Date: 2022/05/18 23:15
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId")Long userId,
                          @RequestParam("money") BigDecimal money);
}
