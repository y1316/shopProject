package com.shop.ssm.sys.me.mapper;

import com.shop.ssm.sys.me.model.MeUser;

public interface MeUserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(MeUser record);

    int insertSelective(MeUser record);

    MeUser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(MeUser record);

    int updateByPrimaryKey(MeUser record);
}