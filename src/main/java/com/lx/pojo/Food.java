package com.lx.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Food {

    @ApiModelProperty(value = "food表的主键", example = "1")
    private int id;

    @ApiModelProperty(value = "food的名字")
    private String foodName;

    @ApiModelProperty(value = "food的图片地址")
    private String foodImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", foodImage='" + foodImage + '\'' +
                '}';
    }
}
