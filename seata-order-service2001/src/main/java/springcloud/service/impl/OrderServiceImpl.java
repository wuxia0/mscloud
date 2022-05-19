package springcloud.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import springcloud.dao.OrderDao;
import springcloud.domain.Order;
import springcloud.service.AccountService;
import springcloud.service.OrderService;
import springcloud.service.StorageService;

import javax.annotation.Resource;

/**
 * @Auther: wuxia
 * @Date: 2022/05/18 23:13
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource(name = "orderDao")
    private OrderDao orderDao;
    @Resource
    private AccountService accountService;
    @Resource
    private StorageService storageService;

    @Override
    public void create(Order order) {
        log.info("----》开始创建订单");
        orderDao.create(order);

        log.info("----》订单服务开始调库存，做扣减count -start");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("----》订单服务开始调库存，做扣减end");

        log.info("----》订单服务开始调账户，做扣减money -start");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("----》订单服务开始调账户，做扣减end");

        log.info("----》修改订单状态start");
        orderDao.update(order.getUserId(),0);
        log.info("----》修改订单状态end");
    }
}

