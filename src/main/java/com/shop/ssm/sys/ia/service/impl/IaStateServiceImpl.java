package com.shop.ssm.sys.ia.service.impl;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ia.mapper.IaStateMapper;
import com.shop.ssm.sys.ia.model.IaState;
import com.shop.ssm.sys.ia.service.IaStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class IaStateServiceImpl implements IaStateService {
    @Autowired
    private  IaStateMapper iaStateMapper;

    @Override
    public int deleteByPrimaryKey(IaState iaState) {
        return iaStateMapper.deleteByPrimaryKey(iaState.getSid());
    }

    @Override
    public int insert(IaState record) {
        return iaStateMapper.insert(record);
    }

    @Override
    public int insertSelective(IaState record) {
        return 0;
    }

    @Override
    public IaState selectByPrimaryKey(IaState iaState) {
        return iaStateMapper.selectByPrimaryKey(iaState.getSid());
    }

    @Override
    public int updateByPrimaryKeySelective(IaState record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(IaState record) {
        return 0;
    }

    @Override
    public List<IaState> list(IaState iaState) {
        return iaStateMapper.list(iaState);
    }
}
