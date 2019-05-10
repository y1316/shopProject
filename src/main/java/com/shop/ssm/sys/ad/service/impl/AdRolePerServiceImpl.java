package com.shop.ssm.sys.ad.service.impl;

import com.shop.ssm.sys.ad.mapper.AdRolePermissionMapper;
import com.shop.ssm.sys.ad.model.AdRole;
import com.shop.ssm.sys.ad.service.IAdRolePerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdRolePerServiceImpl implements IAdRolePerService {
    @Autowired
    private AdRolePermissionMapper adRolePermissionMapper;
    @Override
    public int insertRole(AdRole adRole) {
        return adRolePermissionMapper.insertRole(adRole);
    }
}
