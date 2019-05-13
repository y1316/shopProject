package com.shop.ssm.sys.pd.service.impl;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.pd.mapper.PdProduceMapper;
import com.shop.ssm.sys.pd.model.PdProduce;
import com.shop.ssm.sys.pd.service.IPdProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PdProduceServiceImpl implements IPdProduceService {

    @Autowired
    private PdProduceMapper pdProduceMapper;

    @Override
    public int deleteByPrimaryKey(PdProduce pdProduce) {
        return pdProduceMapper.deleteByPrimaryKey(pdProduce.getPrid());
    }

    @Override
    public int insert(PdProduce record) {
        return pdProduceMapper.insert(record);
    }

    @Override
    public List<PdProduce> list(PdProduce pdProduce, PageBean pageBean) {
        return pdProduceMapper.list(pdProduce);
    }

    @Override
    public int insertSelective(PdProduce record) {
        return pdProduceMapper.insertSelective(record);
    }

    @Override
    @Transactional(readOnly = true)
    public PdProduce selectByPrimaryKey(Integer prid) {
        return pdProduceMapper.selectByPrimaryKey(prid);
    }

    @Override
    public int updateByPrimaryKeySelective(PdProduce record) {
        return pdProduceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdProduce record) {
        return pdProduceMapper.updateByPrimaryKey(record);
    }


}
