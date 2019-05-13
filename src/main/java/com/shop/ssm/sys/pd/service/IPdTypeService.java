package com.shop.ssm.sys.pd.service;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.pd.model.PdType;

import java.util.List;

public interface IPdTypeService {

    int deleteByPrimaryKey(PdType pdType);

    int insert(PdType record);

    int insertSelective(PdType record);

    PdType selectByPrimaryKey(PdType pdType);

    int updateByPrimaryKeySelective(PdType record);

    int updateByPrimaryKey(PdType record);

    List<PdType> list(PdType pdType, PageBean pageBean);
}
