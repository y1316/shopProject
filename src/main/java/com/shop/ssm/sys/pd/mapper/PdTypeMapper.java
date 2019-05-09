package com.shop.ssm.sys.pd.mapper;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.pd.model.PdType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PdTypeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(PdType record);

    int insertSelective(PdType record);

    PdType selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(PdType record);

    int updateByPrimaryKey(PdType record);

    List<PdType> list(PdType pdType);
}