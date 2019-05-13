package com.shop.ssm.sys.pd.service;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.pd.model.PdBrand;

import java.util.List;

public interface IPdBrandService {

    int deleteByPrimaryKey(PdBrand pdBrand);

    int insert(PdBrand record);

    int insertSelective(PdBrand record);

    PdBrand selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(PdBrand record);

    int updateByPrimaryKey(PdBrand record);

    List<PdBrand> list(PdBrand pdBrand, PageBean pageBean);
}
