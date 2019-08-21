package com.phonecard.bean;

import java.util.Date;

public class Feedback {
    private Integer id;

    private String openId;

    private Date feedCreateTime;

    private String feedPhone;

    private String feedImg;

    private String feedQuestion;

    private Short feedType;

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

    public Date getFeedCreateTime() {
        return feedCreateTime;
    }

    public void setFeedCreateTime(Date feedCreateTime) {
        this.feedCreateTime = feedCreateTime;
    }

    public String getFeedPhone() {
        return feedPhone;
    }

    public void setFeedPhone(String feedPhone) {
        this.feedPhone = feedPhone == null ? null : feedPhone.trim();
    }

    public String getFeedImg() {
        return feedImg;
    }

    public void setFeedImg(String feedImg) {
        this.feedImg = feedImg == null ? null : feedImg.trim();
    }

    public String getFeedQuestion() {
        return feedQuestion;
    }

    public void setFeedQuestion(String feedQuestion) {
        this.feedQuestion = feedQuestion == null ? null : feedQuestion.trim();
    }

    public Short getFeedType() {
        return feedType;
    }

    public void setFeedType(Short feedType) {
        this.feedType = feedType;
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