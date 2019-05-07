package com.shop.ssm.sys.ad.service;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ad.model.AdPermissions;

import java.util.List;

public interface IAdPermissionsService {
    int deleteByPrimaryKey(Integer pid);

    int insert(AdPermissions record);

    int insertSelective(AdPermissions record);

    AdPermissions selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(AdPermissions record);

    int updateByPrimaryKey(AdPermissions record);

    List<AdPermissions> list(AdPermissions adPermissions, PageBean pageBean);
}
