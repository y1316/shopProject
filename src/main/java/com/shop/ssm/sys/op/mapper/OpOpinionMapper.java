package com.shop.ssm.sys.op.mapper;

import com.shop.ssm.sys.op.model.OpOpinion;

public interface OpOpinionMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(OpOpinion record);

    int insertSelective(OpOpinion record);

    OpOpinion selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(OpOpinion record);

    int updateByPrimaryKey(OpOpinion record);
}