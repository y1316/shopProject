package com.shop.ssm.sys.or.service.impl;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.or.mapper.OrItemMapper;
import com.shop.ssm.sys.or.model.OrItem;
import com.shop.ssm.sys.or.service.IOrOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class OrOrderServiceImpl implements IOrOrderService {

    @Autowired
    private OrItemMapper orItemMapper;

    @Override
    public int deleteByPrimaryKey(OrItem orItem) {
        return orItemMapper.deleteByPrimaryKey(orItem.getIid());
    }

    @Override
    public int insert(OrItem record) {
        return orItemMapper.insert(record);
    }

    @Override
    public int insertSelective(OrItem record) {
        return 0;
    }

    @Override
    public OrItem selectByPrimaryKey(OrItem orItem) {
        return orItemMapper.selectByPrimaryKey(orItem.getIid());
    }

    @Override
    public int updateByPrimaryKeySelective(OrItem record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(OrItem record) {
        return orItemMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<OrItem> listOrItem(OrItem orItem, PageBean pageBean) {
        return orItemMapper.listOrItem(orItem);
    }
}
