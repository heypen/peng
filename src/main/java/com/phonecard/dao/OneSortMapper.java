package com.phonecard.dao;

import com.phonecard.bean.OneSort;

public interface OneSortMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OneSort record);

    int insertSelective(OneSort record);

    OneSort selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OneSort record);

    int updateByPrimaryKey(OneSort record);
}