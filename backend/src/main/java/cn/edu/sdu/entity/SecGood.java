package cn.edu.sdu.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class SecGood {

    private Long id;
    private int product_id;
    private int goods_stock;  //秒杀商品库存
    private BigDecimal seckill_price;  //秒杀价
    private Date start_date;
    private Date end_date;
    private Product detail;  //商品详情

}
