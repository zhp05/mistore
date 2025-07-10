package cn.edu.sdu.dao;

import cn.edu.sdu.entity.Carousel;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ResourceDao {

    @Select("select * from carousel")
    List<Carousel> getCarousel();

}
