package com.phonecard.dao;

import com.phonecard.bean.AboutUs;

public interface AboutUsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AboutUs record);

    int insertSelective(AboutUs record);

    AboutUs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AboutUs record);

    int updateByPrimaryKeyWithBLOBs(AboutUs record);
}