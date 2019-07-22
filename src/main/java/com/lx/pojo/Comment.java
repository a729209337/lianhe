package com.lx.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Comment {
    @ApiModelProperty(value = "comment表的主键", example = "1")
    private int id;

    @ApiModelProperty(value = "评论的一句话")
    private String comment;

    @ApiModelProperty(value = "评论的图片")
    private String commentImg;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentImg() {
        return commentImg;
    }

    public void setCommentImg(String commentImg) {
        this.commentImg = commentImg;
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

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", commentImg='" + commentImg + '\'' +
                ", uid=" + uid +
                ", name='" + name + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
