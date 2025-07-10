package cn.edu.sdu.service;

import cn.edu.sdu.entity.Carousel;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ResourceService {

    List<Carousel> getCarousel();

}
