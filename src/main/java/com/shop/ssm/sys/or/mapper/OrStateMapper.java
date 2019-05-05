package com.shop.ssm.sys.or.mapper;

import com.shop.ssm.sys.or.model.OrState;

public interface OrStateMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(OrState record);

    int insertSelective(OrState record);

    OrState selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(OrState record);

    int updateByPrimaryKey(OrState record);
}