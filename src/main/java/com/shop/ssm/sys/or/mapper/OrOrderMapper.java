package com.shop.ssm.sys.or.mapper;

import com.shop.ssm.sys.or.model.OrOrder;

public interface OrOrderMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(OrOrder record);

    int insertSelective(OrOrder record);

    OrOrder selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(OrOrder record);

    int updateByPrimaryKey(OrOrder record);
}