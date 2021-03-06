package com.shop.ssm.sys.ad.mapper;

import com.shop.ssm.sys.ad.model.AdRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdRoleMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(AdRole record);

    int insertSelective(AdRole record);

    AdRole selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(AdRole record);

    int updateByPrimaryKey(AdRole record);

    List<AdRole> list(AdRole adRole);
}