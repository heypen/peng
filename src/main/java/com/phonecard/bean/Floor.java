package com.phonecard.bean;

import java.util.Date;

public class Floor {
    private Integer id;

    private String floorImg;

    private String floorTitle;

    private Integer sort;

    private Short isIndex;

    private Short isDelete;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFloorImg() {
        return floorImg;
    }

    public void setFloorImg(String floorImg) {
        this.floorImg = floorImg == null ? null : floorImg.trim();
    }

    public String getFloorTitle() {
        return floorTitle;
    }

    public void setFloorTitle(String floorTitle) {
        this.floorTitle = floorTitle == null ? null : floorTitle.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Short getIsIndex() {
        return isIndex;
    }

    public void setIsIndex(Short isIndex) {
        this.isIndex = isIndex;
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}