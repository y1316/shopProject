package com.shop.ssm.sys.pd.service.impl;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.pd.mapper.PdBrandMapper;
import com.shop.ssm.sys.pd.model.PdBrand;
import com.shop.ssm.sys.pd.service.IPdBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PdBrandServiceImpl implements IPdBrandService {

    @Autowired
    private PdBrandMapper pdBrandMapper;

    @Override
    public int deleteByPrimaryKey(PdBrand pdBrand) {
        return pdBrandMapper.deleteByPrimaryKey(pdBrand.getBid());
    }

    @Override
    public int insert(PdBrand record) {
        return pdBrandMapper.insert(record);
    }

    @Override
    public List<PdBrand> list(PdBrand pdBrand, PageBean pageBean) {
        return pdBrandMapper.list(pdBrand);
    }

    @Override
    public int insertSelective(PdBrand record) {
        return 0;
    }

    @Override
    @Transactional(readOnly = true)
    public PdBrand selectByPrimaryKey(Integer bid) {
        return pdBrandMapper.selectByPrimaryKey(bid);
    }

    @Override
    public int updateByPrimaryKeySelective(PdBrand record) {
        return pdBrandMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdBrand record) {
        return pdBrandMapper.updateByPrimaryKey(record);
    }


}
