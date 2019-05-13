package com.shop.ssm.sys.pd.service.impl;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.pd.mapper.PdTypeMapper;
import com.shop.ssm.sys.pd.model.PdType;
import com.shop.ssm.sys.pd.service.IPdTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PdTypeServiceImpl implements IPdTypeService {

    @Autowired
    private PdTypeMapper pdTypeMapper;

    @Override
    public int deleteByPrimaryKey(PdType pdType) {
        return pdTypeMapper.deleteByPrimaryKey(pdType.getTid());
    }

    @Override
    public int insert(PdType record) {
        return pdTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(PdType record) {
        return 0;
    }

    @Override
    @Transactional(readOnly = true)
    public PdType selectByPrimaryKey(PdType pdType) {
        return pdTypeMapper.selectByPrimaryKey(pdType.getTid());
    }

    @Override
    public int updateByPrimaryKeySelective(PdType record) {
        return pdTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdType record) {
        return pdTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<PdType> list(PdType pdType, PageBean pageBean) {
        return pdTypeMapper.list(pdType);
    }
}
