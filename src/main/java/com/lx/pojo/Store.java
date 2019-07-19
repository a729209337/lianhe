package com.lx.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Store {

    @ApiModelProperty(value = "store表的主键",example = "123")
    private int id;

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
        return "Store{" +
                "id=" + id +
                ", storeName='" + storeName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storeLogo='" + storeLogo + '\'' +
                '}';
    }
}
