package com.shop.ssm.sys.ad.service.impl;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ad.mapper.PsTypeMapper;
import com.shop.ssm.sys.ad.model.PsType;
import com.shop.ssm.sys.ad.service.IPsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PsTypeServiceImpl implements IPsTypeService {
    @Autowired
    private PsTypeMapper psTypeMapper;

    @Override
    public List<PsType> list(PsType psType) {
        return psTypeMapper.list(psType);
    }
}
