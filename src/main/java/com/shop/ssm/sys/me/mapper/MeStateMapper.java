package com.shop.ssm.sys.me.mapper;

import com.shop.ssm.sys.me.model.MeState;

public interface MeStateMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(MeState record);

    int insertSelective(MeState record);

    MeState selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(MeState record);

    int updateByPrimaryKey(MeState record);
}