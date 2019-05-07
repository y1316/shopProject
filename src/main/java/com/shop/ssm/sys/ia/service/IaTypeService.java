package com.shop.ssm.sys.ia.service;

import com.shop.ssm.sys.ia.model.IaType;

import java.util.List;

public interface IaTypeService {

    int deleteByPrimaryKey(IaType iaType);

    int insert(IaType record);

    int insertSelective(IaType record);

    IaType selectByPrimaryKey(IaType iaType);

    int updateByPrimaryKeySelective(IaType record);

    int updateByPrimaryKey(IaType record);

    List<IaType> list(IaType iaType);
}
