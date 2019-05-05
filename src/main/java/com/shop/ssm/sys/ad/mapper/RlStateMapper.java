package com.shop.ssm.sys.ad.mapper;

import com.shop.ssm.sys.ad.model.RlState;

public interface RlStateMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(RlState record);

    int insertSelective(RlState record);

    RlState selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(RlState record);

    int updateByPrimaryKey(RlState record);
}