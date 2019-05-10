package com.shop.ssm.sys.ad.service;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ad.model.PsType;

import java.util.List;

public interface IPsTypeService {
    List<PsType> list(PsType psType);
}
