package cn.edu.sdu.service;

import cn.edu.sdu.entity.SecGood;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface SecKillService {

    List<SecGood> getSecGoods();

    SecGood getSecGood(Integer secgood_id);

    int addSecKillOrder(Integer user_id,Integer product_id,Integer secgoods_id);

    /*是否在秒杀期间*/
    boolean isInSecKill(int secgoods_id);

    Map getSecResult(int user_id, int secgoods_id);

    int decreaseSecGoodsStock(int secgoods_id, int user_id, int product_id);

}
