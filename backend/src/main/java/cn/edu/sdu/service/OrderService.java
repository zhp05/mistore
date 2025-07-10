package cn.edu.sdu.service;

import cn.edu.sdu.entity.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
@Component
public interface OrderService {

    void addOrder(Long order_id,int user_id, int product_id, int product_num, BigDecimal product_price);

    void addOrderNoPay(Long order_id,int user_id, int product_id, int product_num, BigDecimal product_price);

    List<Order> getOrders(Long order_id);

    List<Long> getOrderIdByUser(int user_id);

    Long getOrderId();

    int orderPay(Integer user_id, Long order_id);
}
