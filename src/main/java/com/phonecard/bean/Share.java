package com.phonecard.bean;

import java.util.Date;

public class Share {
    private Integer id;

    private String openId;

    private String oneOpenId;

    private Date createTime;

    private Short inType;

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

    public String getOneOpenId() {
        return oneOpenId;
    }

    public void setOneOpenId(String oneOpenId) {
        this.oneOpenId = oneOpenId == null ? null : oneOpenId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getInType() {
        return inType;
    }

    public void setInType(Short inType) {
        this.inType = inType;
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