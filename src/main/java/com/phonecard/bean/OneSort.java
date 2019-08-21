package com.phonecard.bean;

public class OneSort {
    private Integer id;

    private String oneSortImg;

    private String oneSortName;

    private Short isIndex;

    private Integer sort;

    private Short isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOneSortImg() {
        return oneSortImg;
    }

    public void setOneSortImg(String oneSortImg) {
        this.oneSortImg = oneSortImg == null ? null : oneSortImg.trim();
    }

    public String getOneSortName() {
        return oneSortName;
    }

    public void setOneSortName(String oneSortName) {
        this.oneSortName = oneSortName == null ? null : oneSortName.trim();
    }

    public Short getIsIndex() {
        return isIndex;
    }

    public void setIsIndex(Short isIndex) {
        this.isIndex = isIndex;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }
}