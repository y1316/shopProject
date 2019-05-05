package com.shop.ssm.sys.st.mapper;

import com.shop.ssm.sys.st.model.RcDistrict;

public interface RcDistrictMapper {
    int deleteByPrimaryKey(Short id);

    int insert(RcDistrict record);

    int insertSelective(RcDistrict record);

    RcDistrict selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(RcDistrict record);

    int updateByPrimaryKey(RcDistrict record);
}