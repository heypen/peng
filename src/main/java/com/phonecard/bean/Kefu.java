package com.phonecard.bean;

import java.util.Date;

public class Kefu {
    private Integer id;

    private String kefuPhone;

    private String kefuWechat;

    private Date kefuCreateTime;

    private Short isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKefuPhone() {
        return kefuPhone;
    }

    public void setKefuPhone(String kefuPhone) {
        this.kefuPhone = kefuPhone == null ? null : kefuPhone.trim();
    }

    public String getKefuWechat() {
        return kefuWechat;
    }

    public void setKefuWechat(String kefuWechat) {
        this.kefuWechat = kefuWechat == null ? null : kefuWechat.trim();
    }

    public Date getKefuCreateTime() {
        return kefuCreateTime;
    }

    public void setKefuCreateTime(Date kefuCreateTime) {
        this.kefuCreateTime = kefuCreateTime;
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }
}