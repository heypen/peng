package com.phonecard.bean;

import java.util.Date;

public class Turnover {
    private Integer id;

    private String openId;

    private Short turnoverType;

    private Double turnoverMon;

    private Date turnoverTime;

    private Short inType;

    private String orderUuid;

    private Date endTime;

    private String reserve;

    private Short isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Short getTurnoverType() {
        return turnoverType;
    }

    public void setTurnoverType(Short turnoverType) {
        this.turnoverType = turnoverType;
    }

    public Double getTurnoverMon() {
        return turnoverMon;
    }

    public void setTurnoverMon(Double turnoverMon) {
        this.turnoverMon = turnoverMon;
    }

    public Date getTurnoverTime() {
        return turnoverTime;
    }

    public void setTurnoverTime(Date turnoverTime) {
        this.turnoverTime = turnoverTime;
    }

    public Short getInType() {
        return inType;
    }

    public void setInType(Short inType) {
        this.inType = inType;
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid == null ? null : orderUuid.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve == null ? null : reserve.trim();
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }
}