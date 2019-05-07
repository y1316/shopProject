package com.shop.ssm.sys.ad.mapper;

import com.shop.ssm.sys.ad.model.PsState;
import org.springframework.stereotype.Repository;

@Repository
public interface PsStateMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(PsState record);

    int insertSelective(PsState record);

    PsState selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(PsState record);

    int updateByPrimaryKey(PsState record);
}