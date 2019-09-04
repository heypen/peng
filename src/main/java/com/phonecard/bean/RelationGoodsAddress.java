package com.phonecard.bean;

public class RelationGoodsAddress {
    private Integer id;

    private String goodsUuid;

    private Integer cityId;

    private Integer addressSelfId;

    private Short isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsUuid() {
        return goodsUuid;
    }

    public void setGoodsUuid(String goodsUuid) {
        this.goodsUuid = goodsUuid == null ? null : goodsUuid.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAddressSelfId() {
        return addressSelfId;
    }

    public void setAddressSelfId(Integer addressSelfId) {
        this.addressSelfId = addressSelfId;
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }
}