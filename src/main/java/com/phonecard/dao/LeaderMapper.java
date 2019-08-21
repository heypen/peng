package com.phonecard.dao;

import com.phonecard.bean.Leader;

public interface LeaderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Leader record);

    int insertSelective(Leader record);

    Leader selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Leader record);

    int updateByPrimaryKey(Leader record);
}