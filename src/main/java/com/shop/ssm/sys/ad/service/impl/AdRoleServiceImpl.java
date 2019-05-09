package com.shop.ssm.sys.ad.service.impl;

import com.shop.ssm.sys.ad.mapper.AdRoleMapper;
import com.shop.ssm.sys.ad.model.AdRole;
import com.shop.ssm.sys.ad.service.IAdRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AdRoleServiceImpl implements IAdRoleService {
    @Autowired
    private AdRoleMapper adRoleMapper;
    @Override
    public int deleteByPrimaryKey(Integer rid) {
        return 0;
    }

    @Override
    public int insert(AdRole record) {
        return 0;
    }

    @Override
    public int insertSelective(AdRole record) {
        return adRoleMapper.insertSelective(record);
    }

    @Override
    public AdRole selectByPrimaryKey(Integer rid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(AdRole record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AdRole record) {
        return 0;
    }

    @Override
    public List<AdRole> list(AdRole adRole) {
        return null;
    }
}
