package com.shop.ssm.sys.or.service.impl;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.or.mapper.OrstorageMapper;
import com.shop.ssm.sys.or.model.Orstorage;
import com.shop.ssm.sys.or.service.IOrstorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrstorageServiceImpl implements IOrstorageService {

    @Autowired
   private  OrstorageMapper orstorageMapper;

    @Override
    public int deleteByPrimaryKey(Orstorage orstorage) {
        return orstorageMapper.deleteByPrimaryKey(orstorage.getStkId());
    }

    @Override
    public int insert(Orstorage record) {
        return orstorageMapper.insert(record);
    }

    @Override
    public int insertSelective(Orstorage record) {
        return 0;
    }

    @Override
    public Orstorage selectByPrimaryKey(Orstorage orstorage) {
        return orstorageMapper.selectByPrimaryKey(orstorage.getStkId());
    }

    @Override
    public int updateByPrimaryKeySelective(Orstorage record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Orstorage record) {
        return orstorageMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Orstorage> listOrstorage(Orstorage orstorage, PageBean pageBean) {
        return orstorageMapper.listOrstorage(orstorage);
    }
}
