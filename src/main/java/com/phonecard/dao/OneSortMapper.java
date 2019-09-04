package com.phonecard.dao;

import com.phonecard.bean.OneSort;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OneSortMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OneSort record);

    int insertSelective(OneSort record);

    OneSort selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OneSort record);

    int updateByPrimaryKey(OneSort record);

    List<OneSort> findOneSort();

}