package com.shop.ssm.sys.ia.mapper;

import com.shop.ssm.sys.ia.model.IaType;

public interface IaTypeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(IaType record);

    int insertSelective(IaType record);

    IaType selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(IaType record);

    int updateByPrimaryKey(IaType record);
}