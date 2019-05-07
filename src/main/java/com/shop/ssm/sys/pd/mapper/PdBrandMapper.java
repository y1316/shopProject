package com.shop.ssm.sys.pd.mapper;

import com.shop.ssm.sys.pd.model.PdBrand;
import com.shop.ssm.sys.pd.model.PdProduce;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PdBrandMapper{
    int deleteByPrimaryKey(Integer bid);

    int insert(PdBrand record);

    int insertSelective(PdBrand record);

    PdBrand selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(PdBrand record);

    int updateByPrimaryKey(PdBrand record);

    List<PdBrand> list(PdBrand pdBrand);
}