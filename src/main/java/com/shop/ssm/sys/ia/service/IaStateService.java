package com.shop.ssm.sys.ia.service;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ia.model.IaState;

import java.util.List;

public interface IaStateService {
    int deleteByPrimaryKey(IaState iaState);

    int insert(IaState record);

    int insertSelective(IaState record);

    IaState selectByPrimaryKey(IaState iaState);

    int updateByPrimaryKeySelective(IaState record);

    int updateByPrimaryKey(IaState record);

    List<IaState> list(IaState iaState);
}
