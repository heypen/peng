package com.phonecard.bean;

import java.util.Date;

public class ProductOrder {
    private Integer id;

    private String uuid;

    private Date createTime;

    private Integer isDelete;

    private String openId;

    private String oneOpenId;

    private Double orderPrice;

    private Double actualPrice;

    private Integer orderStatus;

    private Integer orderStatusPrefix;

    private String payRecordUuid;

    private Date tradeSuccessfulTime;

    private Integer payType;

    private String remark;

    private Integer isPrint;

    private Integer isAffirm;

    private Integer todayOn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getOneOpenId() {
        return oneOpenId;
    }

    public void setOneOpenId(String oneOpenId) {
        this.oneOpenId = oneOpenId == null ? null : oneOpenId.trim();
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderStatusPrefix() {
        return orderStatusPrefix;
    }

    public void setOrderStatusPrefix(Integer orderStatusPrefix) {
        this.orderStatusPrefix = orderStatusPrefix;
    }

    public String getPayRecordUuid() {
        return payRecordUuid;
    }

    public void setPayRecordUuid(String payRecordUuid) {
        this.payRecordUuid = payRecordUuid == null ? null : payRecordUuid.trim();
    }

    public Date getTradeSuccessfulTime() {
        return tradeSuccessfulTime;
    }

    public void setTradeSuccessfulTime(Date tradeSuccessfulTime) {
        this.tradeSuccessfulTime = tradeSuccessfulTime;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getIsPrint() {
        return isPrint;
    }

    public void setIsPrint(Integer isPrint) {
        this.isPrint = isPrint;
    }

    public Integer getIsAffirm() {
        return isAffirm;
    }

    public void setIsAffirm(Integer isAffirm) {
        this.isAffirm = isAffirm;
    }

    public Integer getTodayOn() {
        return todayOn;
    }

    public void setTodayOn(Integer todayOn) {
        this.todayOn = todayOn;
    }
}