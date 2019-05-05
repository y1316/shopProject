package com.shop.ssm.sys.ia.mapper;

import com.shop.ssm.sys.ia.model.IaNews;

public interface IaNewsMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(IaNews record);

    int insertSelective(IaNews record);

    IaNews selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(IaNews record);

    int updateByPrimaryKey(IaNews record);
}