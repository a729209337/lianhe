package com.lx.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Pet {

    @ApiModelProperty(value = "pet表的主键",example = "123")
    private int id;

    @ApiModelProperty(value = "pet的名字")
    private String petName;

    @ApiModelProperty(value = "pet的价格")
    private String petPrice;

    @ApiModelProperty(value = "pet的品种id")
    private int petSort;

    @ApiModelProperty(value = "pet的图片地址")
    private String petImage;

    @ApiModelProperty(value = "pet的所属地区")
    private String petArea;

    @ApiModelProperty(value = "pet的来源")
    private String petSource;

    @ApiModelProperty(value = "pet的介绍")
    private String petDetail;

    @ApiModelProperty(value = "pid的值：1为狗、2为猫")
    private int pid;

    @ApiModelProperty(value = "和store关联的字段")
    private String storeId;

    @ApiModelProperty(value = "商店的名字")
    private String storeName;

    @ApiModelProperty(value = "商店的地址")
    private String storeAddress;

    @ApiModelProperty(value = "商店的图标")
    private String storeLogo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetPrice() {
        return petPrice;
    }

    public void setPetPrice(String petPrice) {
        this.petPrice = petPrice;
    }

    public int getPetSort() {
        return petSort;
    }

    public void setPetSort(int petSort) {
        this.petSort = petSort;
    }

    public String getPetImage() {
        return petImage;
    }

    public void setPetImage(String petImage) {
        this.petImage = petImage;
    }

    public String getPetArea() {
        return petArea;
    }

    public void setPetArea(String petArea) {
        this.petArea = petArea;
    }

    public String getPetSource() {
        return petSource;
    }

    public void setPetSource(String petSource) {
        this.petSource = petSource;
    }

    public String getPetDetail() {
        return petDetail;
    }

    public void setPetDetail(String petDetail) {
        this.petDetail = petDetail;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreLogo() {
        return storeLogo;
    }

    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", petName='" + petName + '\'' +
                ", petPrice='" + petPrice + '\'' +
                ", petSort=" + petSort +
                ", petImage='" + petImage + '\'' +
                ", petArea='" + petArea + '\'' +
                ", petSource='" + petSource + '\'' +
                ", petDetail='" + petDetail + '\'' +
                ", pid=" + pid +
                ", storeId='" + storeId + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storeLogo='" + storeLogo + '\'' +
                '}';
    }
}
