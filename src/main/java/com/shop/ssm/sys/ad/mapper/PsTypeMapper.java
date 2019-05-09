package com.shop.ssm.sys.ad.mapper;

import com.shop.ssm.sys.ad.model.PsType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PsTypeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(PsType record);

    int insertSelective(PsType record);

    PsType selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(PsType record);

    int updateByPrimaryKey(PsType record);

    List<PsType> list(PsType psType);
}