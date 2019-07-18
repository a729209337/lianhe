package com.lx.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Cat {

    @ApiModelProperty(value = "cat表的主键")
    private int id;

    @ApiModelProperty(value = "cat的名字")
    private String catName;

    @ApiModelProperty(value = "cat的价格")
    private String catPrice;

    @ApiModelProperty(value = "cat的性别")
    private String catSex;

    @ApiModelProperty(value = "cat的品种id")
    private int catVariety;

    @ApiModelProperty(value = "cat的图片地址")
    private String catImage;

    @ApiModelProperty(value = "cat的所属地区")
    private String catArea;

    @ApiModelProperty(value = "cat的来源")
    private String catSource;

    @ApiModelProperty(value = "cat的介绍")
    private String Detail;

    @ApiModelProperty(value = "和store关联的字段")
    private int sid;

    @ApiModelProperty(value = "catSort表中的狗的具体种类")
    private String catSort;

    @ApiModelProperty(value = "catSort表中的狗的种类的图片")
    private String catSortImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcatName() {
        return catName;
    }

    public void setcatName(String catName) {
        this.catName = catName;
    }

    public String getcatPrice() {
        return catPrice;
    }

    public void setcatPrice(String catPrice) {
        this.catPrice = catPrice;
    }

    public String getcatSex() {
        return catSex;
    }

    public void setcatSex(String catSex) {
        this.catSex = catSex;
    }

    public int getCatVariety() {
        return catVariety;
    }

    public void setCatVariety(int variety) {
        catVariety = catVariety;
    }

    public String getcatImage() {
        return catImage;
    }

    public void setcatImage(String catImage) {
        this.catImage = catImage;
    }

    public String getcatArea() {
        return catArea;
    }

    public void setcatArea(String catArea) {
        this.catArea = catArea;
    }

    public String getcatSource() {
        return catSource;
    }

    public void setcatSource(String catSource) {
        this.catSource = catSource;
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

    public String getcatSort() {
        return catSort;
    }

    public void setcatSort(String catSort) {
        this.catSort = catSort;
    }

    public String getcatSortImage() {
        return catSortImage;
    }

    public void setcatSortImage(String catSortImage) {
        this.catSortImage = catSortImage;
    }

    @Override
    public String toString() {
        return "cat{" +
                "id=" + id +
                ", catName='" + catName + '\'' +
                ", catPrice='" + catPrice + '\'' +
                ", catSex='" + catSex + '\'' +
                ", catVariety=" + catVariety +
                ", catImage='" + catImage + '\'' +
                ", catArea='" + catArea + '\'' +
                ", catSource='" + catSource + '\'' +
                ", Detail='" + Detail + '\'' +
                ", sid=" + sid +
                ", catSort='" + catSort + '\'' +
                ", catSortImage='" + catSortImage + '\'' +
                '}';
    }
}
