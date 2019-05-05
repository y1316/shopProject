package com.shop.ssm.sys.ad.mapper;

import com.shop.ssm.sys.ad.model.AdAdmin;

public interface AdAdminMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(AdAdmin record);

    int insertSelective(AdAdmin record);

    AdAdmin selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(AdAdmin record);

    int updateByPrimaryKey(AdAdmin record);
}