package com.shop.ssm.sys.ad.service.impl;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ad.mapper.AdPermissionsMapper;
import com.shop.ssm.sys.ad.model.AdPermissions;
import com.shop.ssm.sys.ad.service.IAdPermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdPermissionsServiceImpl implements IAdPermissionsService {
    @Autowired
    private AdPermissionsMapper adPermissionsMapper;

    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return adPermissionsMapper.deleteByPrimaryKey(pid);
    }

    @Override
    public int insert(AdPermissions record) {
        return adPermissionsMapper.insert(record);
    }

    @Override
    public int insertSelective(AdPermissions record) {
        return 0;
    }

    @Override
    public AdPermissions selectByPrimaryKey(Integer pid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(AdPermissions record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AdPermissions record) {
        return 0;
    }

    @Override
    public List<AdPermissions> list(AdPermissions adPermissions, PageBean pageBean) {
        return adPermissionsMapper.list(adPermissions);
    }
}
