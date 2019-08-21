package com.phonecard.dao;

import com.phonecard.bean.ActivityGoods;

public interface ActivityGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityGoods record);

    int insertSelective(ActivityGoods record);

    ActivityGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActivityGoods record);

    int updateByPrimaryKey(ActivityGoods record);
}