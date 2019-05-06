package com.shop.ssm.sys.ia.service;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ia.model.IaNews;

import java.util.List;

public interface IiaNewsService {

    int deleteByPrimaryKey(IaNews iaNews);

    int insert(IaNews record);

    int insertSelective(IaNews record);

    IaNews selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(IaNews record);

    int updateByPrimaryKey(IaNews record);

    List<IaNews> list(IaNews iaNews, PageBean pageBean);
}
