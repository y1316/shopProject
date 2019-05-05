package com.shop.ssm.sys.me.mapper;

import com.shop.ssm.sys.me.model.MeShare;

public interface MeShareMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(MeShare record);

    int insertSelective(MeShare record);

    MeShare selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(MeShare record);

    int updateByPrimaryKey(MeShare record);
}