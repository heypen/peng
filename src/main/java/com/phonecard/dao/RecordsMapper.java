package com.phonecard.dao;

import com.phonecard.bean.Records;

public interface RecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Records record);

    int insertSelective(Records record);

    Records selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Records record);

    int updateByPrimaryKey(Records record);
}