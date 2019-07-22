package com.lx.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Appraise {

    @ApiModelProperty(value = "appraise表的主键", example = "1")
    private int id;

    @ApiModelProperty(value = "对宠物的评价")
    private String appraise;

    @ApiModelProperty(value = "评价的图片")
    private String appraiseImg;

    @ApiModelProperty(value = "和user表关联的字段", example = "1")
    private int uid;

    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "用户头像")
    private String pictureUrl;

    @ApiModelProperty(value = "用户地址")
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppraise() {
        return appraise;
    }

    public void setAppraise(String appraise) {
        this.appraise = appraise;
    }

    public String getAppraiseImg() {
        return appraiseImg;
    }

    public void setAppraiseImg(String appraiseImg) {
        this.appraiseImg = appraiseImg;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
