package springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import springcloud.domain.Order;

/**
 * @Auther: wuxia
 * @Date: 2022/05/18 22:46
 */
@Mapper
public interface OrderDao {
    void create(Order order);

    void update(@Param("userId")Long userId,@Param("status")Integer status);
}
