package cn.edu.sdu.controller;

import cn.edu.sdu.entity.Carousel;
import cn.edu.sdu.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping(value = "/resources")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @RequestMapping(value = "/carousel")
    public Map getCarousel(){
        List<Carousel> carousel = resourceService.getCarousel();
        HashMap<String, Object> map = new HashMap<>();
        map.put("code","001");
        map.put("carousel",carousel);
        return map;
    }

}
