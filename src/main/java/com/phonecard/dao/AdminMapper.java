package com.phonecard.dao;

import com.phonecard.bean.Admin;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.phonecard.util.PageObject;

@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    Admin getAdmin(Admin admin);

    int getChangPassWord(@Param("id")Integer id, @Param("password")String passWord);

    int getchangeStop(Admin admin);

    int updataDelete(@Param("id")Integer id);

    int findAdminName(@Param("account")String account);

    List<Admin> getAdminList(@Param("pageObject")PageObject pageObject);

    public int getCountAdminSum();
}