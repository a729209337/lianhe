package com.lx.pojo;

import io.swagger.annotations.ApiModelProperty;

public class User {
    @ApiModelProperty(value = "user表的主键")
    private int id;

    @ApiModelProperty(value = "手机号")
    private String phoneNumber;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "名字")
    private String name;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "对商品的评价")
    private String apprise;

    @ApiModelProperty(value = "对商品评价的图片")
    private String appriseImg;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getApprise() {
        return apprise;
    }

    public void setApprise(String apprise) {
        this.apprise = apprise;
    }

    public String getAppriseImg() {
        return appriseImg;
    }

    public void setAppriseImg(String appriseImg) {
        this.appriseImg = appriseImg;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", apprise='" + apprise + '\'' +
                ", appriseImg='" + appriseImg + '\'' +
                '}';
    }
}
