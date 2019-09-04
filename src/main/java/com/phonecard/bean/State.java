package com.phonecard.bean;

public class State {
    private Integer id;

    private String stateName;

    private Short isHot;

    private String stateSort;

    private Short isDelete;

    private Short isRecommend;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName == null ? null : stateName.trim();
    }

    public Short getIsHot() {
        return isHot;
    }

    public void setIsHot(Short isHot) {
        this.isHot = isHot;
    }

    public String getStateSort() {
        return stateSort;
    }

    public void setStateSort(String stateSort) {
        this.stateSort = stateSort == null ? null : stateSort.trim();
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    public Short getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Short isRecommend) {
        this.isRecommend = isRecommend;
    }
}