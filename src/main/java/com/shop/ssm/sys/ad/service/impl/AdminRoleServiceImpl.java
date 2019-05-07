package com.shop.ssm.sys.ad.service.impl;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ad.mapper.AdAdminRoleMapper;
import com.shop.ssm.sys.ad.model.AdAdmin;
import com.shop.ssm.sys.ad.model.AdRole;
import com.shop.ssm.sys.ad.service.IAdminRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminRoleServiceImpl implements IAdminRoleService {
    @Autowired
    private AdAdminRoleMapper adAdminRoleMapper;

    @Override
    public List<AdAdmin> adminOfRole(AdAdmin adAdmin, PageBean pageBean) {
        return adAdminRoleMapper.adminOfRole(adAdmin);
    }

    @Override
    public List<AdRole> roleOfAdmin(AdRole adRole, PageBean pageBean) {
        return adAdminRoleMapper.roleOfAdmin(adRole);
    }
}
