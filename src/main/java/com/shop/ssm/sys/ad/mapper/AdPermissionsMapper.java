package com.shop.ssm.sys.ad.mapper;

import com.shop.ssm.sys.ad.model.AdPermissions;

public interface AdPermissionsMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(AdPermissions record);

    int insertSelective(AdPermissions record);

    AdPermissions selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(AdPermissions record);

    int updateByPrimaryKey(AdPermissions record);
}