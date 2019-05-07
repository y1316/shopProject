package com.shop.ssm.sys.pd.mapper;

import com.shop.ssm.sys.pd.model.PdProduce;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PdProduceMapper {
    int deleteByPrimaryKey(Integer prid);

    int insert(PdProduce record);

    int insertSelective(PdProduce record);

    PdProduce selectByPrimaryKey(Integer prid);

    int updateByPrimaryKeySelective(PdProduce record);

    int updateByPrimaryKey(PdProduce record);

    List<PdProduce> list(PdProduce pdProduce);
}