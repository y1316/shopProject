package com.shop.ssm.sys.or.mapper;

import com.shop.ssm.sys.or.model.OrItem;

import java.util.List;

public interface OrItemMapper {
    int deleteByPrimaryKey(Integer iid);

    int insert(OrItem record);

    int insertSelective(OrItem record);

    OrItem selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(OrItem record);

    int updateByPrimaryKey(OrItem record);

    List<OrItem>listOrItem(OrItem orItem);
}