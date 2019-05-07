package com.shop.ssm.sys.ia.service.impl;

import com.shop.ssm.sys.ia.mapper.IaTypeMapper;
import com.shop.ssm.sys.ia.model.IaType;
import com.shop.ssm.sys.ia.service.IaTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IaTypeServiceImpl implements IaTypeService {

    @Autowired
    private IaTypeMapper iaTypeMapper;

    @Override
    public int deleteByPrimaryKey(IaType iaType) {
        return iaTypeMapper.deleteByPrimaryKey(iaType.getTid());
    }

    @Override
    public int insert(IaType record) {
        return iaTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(IaType record) {
        return 0;
    }

    @Override
    public IaType selectByPrimaryKey(IaType iaType) {
        return iaTypeMapper.selectByPrimaryKey(iaType.getTid());
    }

    @Override
    public int updateByPrimaryKeySelective(IaType record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(IaType record) {
        return 0;
    }

    @Override
    public List<IaType> list(IaType iaType) {
        return iaTypeMapper.list(iaType);
    }
}
