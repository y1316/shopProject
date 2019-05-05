package com.shop.ssm.sys.pd.mapper;

import com.shop.ssm.sys.pd.model.PdState;

public interface PdStateMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(PdState record);

    int insertSelective(PdState record);

    PdState selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(PdState record);

    int updateByPrimaryKey(PdState record);
}