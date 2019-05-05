package com.shop.ssm.sys.pd.mapper;

import com.shop.ssm.sys.pd.model.PdProduce;

public interface PdProduceMapper {
    int deleteByPrimaryKey(Integer prid);

    int insert(PdProduce record);

    int insertSelective(PdProduce record);

    PdProduce selectByPrimaryKey(Integer prid);

    int updateByPrimaryKeySelective(PdProduce record);

    int updateByPrimaryKey(PdProduce record);
}