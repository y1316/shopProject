package com.shop.ssm.sys.ad.mapper;

import com.shop.ssm.sys.ad.model.AdRole;
import com.shop.ssm.sys.ad.model.AdRolePermission;
import org.springframework.stereotype.Repository;

@Repository
public interface AdRolePermissionMapper {
    int deleteByPrimaryKey(Integer rpid);

    int insert(AdRolePermission record);

    int insertSelective(AdRolePermission record);

    AdRolePermission selectByPrimaryKey(Integer rpid);

    int updateByPrimaryKeySelective(AdRolePermission record);

    int updateByPrimaryKey(AdRolePermission record);

    int insertRole(AdRole adRole);
}