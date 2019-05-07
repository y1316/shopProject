package com.shop.ssm.sys.ad.service;

import com.shop.ssm.sys.ad.model.AdRole;

import java.util.List;

public interface IAdRoleService {
    int deleteByPrimaryKey(Integer rid);

    int insert(AdRole record);

    int insertSelective(AdRole record);

    AdRole selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(AdRole record);

    int updateByPrimaryKey(AdRole record);

    List<AdRole> list(AdRole adRole);
}
