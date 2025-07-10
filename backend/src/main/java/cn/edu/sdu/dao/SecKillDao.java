package cn.edu.sdu.dao;

import cn.edu.sdu.entity.SecGood;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface SecKillDao {

    /*获得生效的秒杀商品信息*/
    @Select("select * from secgoods where status=1")
    @Results(id="getSecGoods",value = {
            @Result(property = "id",column = "id"),@Result(property = "product_id",column = "product_id"),
            @Result(property = "start_date",column = "start_date"),@Result(property = "end_date",column = "end_date"),
            @Result(property = "goods_stock",column = "goods_stock"),@Result(property = "seckill_price",column = "seckill_price"),
            @Result(property = "detail",column = "product_id",
                    one=@One(select="cn.edu.sdu.dao.ProductDao.getProductByID",fetchType = FetchType.EAGER))
    })
    List<SecGood> getSecGoods();

    @Select("select product_id from secgoods where id=#{secgood_id}")
    int getProductIdById(int secgood_id);

    /*获得单个秒杀商品信息*/
    @Select("select * from secgoods where status=1 and product_id=#{product_id}")
    @Results(id="getSecGood",value = {
            @Result(property = "id",column = "id"),@Result(property = "product_id",column = "product_id"),
            @Result(property = "start_date",column = "start_date"),@Result(property = "end_date",column = "end_date"),
            @Result(property = "goods_stock",column = "goods_stock"),@Result(property = "seckill_price",column = "seckill_price"),
            @Result(property = "detail",column = "product_id",
                    one=@One(select="cn.edu.sdu.dao.ProductDao.getProductByID",fetchType = FetchType.EAGER))
    })
    SecGood getSecGood(Integer product_id);

    @Select("select id from secgoods where product_id=#{product_id} limit 1")
    Integer getSecId(int product_id);

    /*是否已抢购*/
    @Select("select count(1) from secorder where user_id=#{user_id} and product_id=#{product_id} and secgoods_id=#{secgoods_id}")
    int findSecKillOrder(Integer user_id, Integer product_id,Integer secgoods_id);

    /*减少秒杀商品库存*/
    @Update("update secgoods set goods_stock=goods_stock-1 where id=#{secgoods_id} and status=1 and goods_stock>0;")
    int decreaseSecGoodsStock(int secgoods_id);

    @Select("select seckill_price from secgoods where id=#{secgoods_id} and status=1 and now()>start_date and now()<end_date")
    BigDecimal findSecGoodPrice(int secgoods_id);

    /*生成秒杀订单*/
    @Insert("insert into secorder(secgoods_id,order_id,user_id,product_id,order_time) values(#{secgoods_id},#{order_id},#{user_id},#{product_id},now())")
    void addSecKillOrder(int secgoods_id, Long order_id, int user_id, int product_id);
}
