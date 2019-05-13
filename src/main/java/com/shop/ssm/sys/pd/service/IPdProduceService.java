package com.shop.ssm.sys.pd.service;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.pd.model.PdProduce;

import java.util.List;

public interface IPdProduceService {

    int deleteByPrimaryKey(PdProduce pdProduce);

    int insert(PdProduce record);

    int insertSelective(PdProduce record);

    PdProduce selectByPrimaryKey(Integer prid);

    int updateByPrimaryKeySelective(PdProduce record);

    int updateByPrimaryKey(PdProduce record);

    List<PdProduce> list(PdProduce pdProduce, PageBean pageBean);
}
