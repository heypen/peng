package com.phonecard.dao;

import com.phonecard.bean.RelationGoodsAddress;

public interface RelationGoodsAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationGoodsAddress record);

    int insertSelective(RelationGoodsAddress record);

    RelationGoodsAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelationGoodsAddress record);

    int updateByPrimaryKey(RelationGoodsAddress record);
}