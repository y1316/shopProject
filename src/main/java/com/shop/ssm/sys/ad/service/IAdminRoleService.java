package com.shop.ssm.sys.ad.service;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ad.model.AdAdmin;
import com.shop.ssm.sys.ad.model.AdRole;

import java.util.List;

public interface IAdminRoleService {
    List<AdAdmin> adminOfRole(AdAdmin adAdmin, PageBean pageBean);

    List<AdRole> roleOfAdmin(AdRole adRole, PageBean pageBean);
}
