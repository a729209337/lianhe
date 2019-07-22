package com.lx.pojo;

import io.swagger.annotations.ApiModelProperty;

public class ShopAddress {
    private int id;

    @ApiModelProperty(value = "收货人的名字")
    private String shopName;

    @ApiModelProperty(value = "收货人的电话")
    private String shopPhone;

    @ApiModelProperty(value = "收货人的地区")
    private String shopArea;

    @ApiModelProperty(value = "收货人的详细地址")
    private String shopAddress;

    @ApiModelProperty(value = "收货人的邮编")
    private String shopCode;

    @ApiModelProperty(value = "和user表关联的字段", example = "1")
    private String phoneNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public String getShopArea() {
        return shopArea;
    }

    public void setShopArea(String shopArea) {
        this.shopArea = shopArea;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getphoneNum() {
        return phoneNum;
    }

    public void setphoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "ShopAddress{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", shopPhone='" + shopPhone + '\'' +
                ", shopArea='" + shopArea + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", shopCode='" + shopCode + '\'' +
                ", phoneNumber=" + phoneNum +
                '}';
    }
}
