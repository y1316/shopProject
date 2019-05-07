package com.shop.ssm.sys.ad.mapper;

import com.shop.ssm.sys.ad.model.AdAdmin;
import com.shop.ssm.sys.ad.model.AdAdminRole;
import com.shop.ssm.sys.ad.model.AdRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdAdminRoleMapper {
    int deleteByPrimaryKey(Integer urid);

    int insert(AdAdminRole record);

    int insertSelective(AdAdminRole record);

    AdAdminRole selectByPrimaryKey(Integer urid);

    int updateByPrimaryKeySelective(AdAdminRole record);

    int updateByPrimaryKey(AdAdminRole record);

    List<AdAdmin> adminOfRole(AdAdmin adAdmin);

    List<AdRole> roleOfAdmin(AdRole adRole);
}