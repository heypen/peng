package com.phonecard.dao;

import com.phonecard.bean.Address;
import com.phonecard.bean.AddressSelf;
import com.phonecard.util.PageObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    List<AddressSelf> findAllAddress();

    List<AddressSelf> getAddressList(@Param("pageObject") PageObject pageObject);

    int getCountAddressSum();

    int checkAirportIsExist(AddressSelf addressSelf);
}