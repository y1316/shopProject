package com.shop.ssm.sys.st.mapper;

import com.shop.ssm.sys.st.model.StColumn;

public interface StColumnMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(StColumn record);

    int insertSelective(StColumn record);

    StColumn selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(StColumn record);

    int updateByPrimaryKey(StColumn record);
}