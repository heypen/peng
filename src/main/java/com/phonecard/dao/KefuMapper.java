package com.phonecard.dao;

import com.phonecard.bean.Kefu;
import com.phonecard.util.PageObject;

import java.util.List;

public interface KefuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Kefu record);

    int insertSelective(Kefu record);

    Kefu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Kefu record);

    int updateByPrimaryKey(Kefu record);

    int getCountKefuSum();

    List<Kefu> getKefuList(PageObject pageObject);
}