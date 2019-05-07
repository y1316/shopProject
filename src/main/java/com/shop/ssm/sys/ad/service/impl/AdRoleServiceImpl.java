package com.shop.ssm.sys.ad.service.impl;

import com.shop.ssm.sys.ad.model.AdRole;
import com.shop.ssm.sys.ad.service.IAdRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AdRoleServiceImpl implements IAdRoleService {
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
        return 0;
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
