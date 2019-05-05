package com.shop.ssm.sys.ia.mapper;

import com.shop.ssm.sys.ia.model.IaState;

public interface IaStateMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(IaState record);

    int insertSelective(IaState record);

    IaState selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(IaState record);

    int updateByPrimaryKey(IaState record);
}