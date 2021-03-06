package com.phonecard.dao;

import com.phonecard.bean.CouponBind;

public interface CouponBindMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponBind record);

    int insertSelective(CouponBind record);

    CouponBind selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CouponBind record);

    int updateByPrimaryKey(CouponBind record);
}