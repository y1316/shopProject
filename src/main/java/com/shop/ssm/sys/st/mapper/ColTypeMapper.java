package com.shop.ssm.sys.st.mapper;

import com.shop.ssm.sys.st.model.ColType;

public interface ColTypeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(ColType record);

    int insertSelective(ColType record);

    ColType selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(ColType record);

    int updateByPrimaryKey(ColType record);
}