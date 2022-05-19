package springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.domain.CommonResult;
import springcloud.domain.Order;
import springcloud.service.OrderService;

import javax.annotation.Resource;

/**
 * @Auther: wuxia
 * @Date: 2022/05/18 23:28
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}

