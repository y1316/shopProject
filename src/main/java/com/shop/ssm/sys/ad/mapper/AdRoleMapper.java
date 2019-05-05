package com.shop.ssm.sys.ad.mapper;

import com.shop.ssm.sys.ad.model.AdRole;

public interface AdRoleMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(AdRole record);

    int insertSelective(AdRole record);

    AdRole selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(AdRole record);

    int updateByPrimaryKey(AdRole record);
}