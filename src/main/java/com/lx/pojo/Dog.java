package com.lx.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Dog {

    @ApiModelProperty(value = "dog表的主键",example = "123")
    private int id;

    @ApiModelProperty(value = "dog的名字")
    private String dogName;

    @ApiModelProperty(value = "dog的价格")
    private String dogPrice;

    @ApiModelProperty(value = "dog的性别")
    private String dogSex;

    @ApiModelProperty(value = "dog的品种id")
    private int dogVariety;

    @ApiModelProperty(value = "dog的图片地址")
    private String dogImage;

    @ApiModelProperty(value = "dog的所属地区")
    private String dogArea;

    @ApiModelProperty(value = "dog的来源")
    private String dogSource;

    @ApiModelProperty(value = "dog的介绍")
    private String Detail;

    @ApiModelProperty(value = "和store关联的字段")
    private int sid;

    @ApiModelProperty(value = "dogSort表中的狗的具体种类")
    private String dogSort;

    @ApiModelProperty(value = "dogSort表中的狗的种类的图片")
    private String dogSortImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogPrice() {
        return dogPrice;
    }

    public void setDogPrice(String dogPrice) {
        this.dogPrice = dogPrice;
    }

    public String getDogSex() {
        return dogSex;
    }

    public void setDogSex(String dogSex) {
        this.dogSex = dogSex;
    }

    public int getDogVariety() {
        return dogVariety;
    }

    public void setDogVariety(int dogVariety) {
        this.dogVariety = dogVariety;
    }

    public String getDogImage() {
        return dogImage;
    }

    public void setDogImage(String dogImage) {
        this.dogImage = dogImage;
    }

    public String getDogArea() {
        return dogArea;
    }

    public void setDogArea(String dogArea) {
        this.dogArea = dogArea;
    }

    public String getDogSource() {
        return dogSource;
    }

    public void setDogSource(String dogSource) {
        this.dogSource = dogSource;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getDogSort() {
        return dogSort;
    }

    public void setDogSort(String dogSort) {
        this.dogSort = dogSort;
    }

    public String getDogSortImage() {
        return dogSortImage;
    }

    public void setDogSortImage(String dogSortImage) {
        this.dogSortImage = dogSortImage;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", dogName='" + dogName + '\'' +
                ", dogPrice='" + dogPrice + '\'' +
                ", dogSex='" + dogSex + '\'' +
                ", dogVariety=" + dogVariety +
                ", dogImage='" + dogImage + '\'' +
                ", dogArea='" + dogArea + '\'' +
                ", dogSource='" + dogSource + '\'' +
                ", Detail='" + Detail + '\'' +
                ", sid=" + sid +
                ", dogSort='" + dogSort + '\'' +
                ", dogSortImage='" + dogSortImage + '\'' +
                '}';
    }
}
