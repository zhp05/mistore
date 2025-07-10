package cn.edu.sdu.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class Carousel implements Serializable {

    private int carousel_id;
    private int product_id;
    private String imgPath;
    private String describes;

}
