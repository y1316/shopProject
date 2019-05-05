package com.shop.ssm.sys.me.mapper;

import com.shop.ssm.sys.me.model.MeBowse;

public interface MeBowseMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(MeBowse record);

    int insertSelective(MeBowse record);

    MeBowse selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(MeBowse record);

    int updateByPrimaryKey(MeBowse record);
}