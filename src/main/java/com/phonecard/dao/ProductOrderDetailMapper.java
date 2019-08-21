package com.phonecard.dao;

import com.phonecard.bean.ProductOrderDetail;

public interface ProductOrderDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductOrderDetail record);

    int insertSelective(ProductOrderDetail record);

    ProductOrderDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductOrderDetail record);

    int updateByPrimaryKey(ProductOrderDetail record);
}