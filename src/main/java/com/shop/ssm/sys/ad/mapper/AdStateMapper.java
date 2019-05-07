package com.shop.ssm.sys.ad.mapper;

import com.shop.ssm.sys.ad.model.AdState;
import org.springframework.stereotype.Repository;

@Repository
public interface AdStateMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(AdState record);

    int insertSelective(AdState record);

    AdState selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(AdState record);

    int updateByPrimaryKey(AdState record);
}