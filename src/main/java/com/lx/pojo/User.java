package com.lx.pojo;

import io.swagger.annotations.ApiModelProperty;

public class User {

    @ApiModelProperty(value = "user表的主键", example = "1")
    private int id;

    @ApiModelProperty(value = "手机号")
    private String phoneNumber;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "名字")
    private String name;

    @ApiModelProperty(value = "头像链接")
    private String pictureUrl;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "对商品的评价")
    private String appraise;

    @ApiModelProperty(value = "对商品评价的图片")
    private String appraiseImg;

    @ApiModelProperty(value = "和pet表关联的字段", example = "1")
    private int petId;

    @ApiModelProperty(value = "宠物的名字")
    private String petName;

    @ApiModelProperty(value = "对应商店的Id", example = "1")
    private int storeId;

    @ApiModelProperty(value = "和address表关联的字段", example = "1")
    private int shopId;

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", address='" + address + '\'' +
                ", appraise='" + appraise + '\'' +
                ", appraiseImg='" + appraiseImg + '\'' +
                ", petId=" + petId +
                ", petName='" + petName + '\'' +
                ", storeId='" + storeId + '\'' +
                '}';
    }
}
