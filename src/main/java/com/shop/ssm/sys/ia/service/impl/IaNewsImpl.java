package com.shop.ssm.sys.ia.service.impl;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.ia.mapper.IaNewsMapper;
import com.shop.ssm.sys.ia.model.IaNews;
import com.shop.ssm.sys.ia.service.IiaNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IaNewsImpl implements IiaNewsService {
    @Autowired
    private IaNewsMapper iaNewsMapper;

    @Override
    public int deleteByPrimaryKey(IaNews iaNews) {
        return iaNewsMapper.deleteByPrimaryKey(iaNews.getNid());
    }
    @Override
    public int insert(IaNews record) {
        return iaNewsMapper.insert(record);
    }

    @Override
    public int insertSelective(IaNews record) {
        return 0;
    }

    @Override
    public IaNews selectByPrimaryKey(IaNews iaNews) {
        return iaNewsMapper.selectByPrimaryKey(iaNews.getNid());
    }

    @Override
    public int updateByPrimaryKeySelective(IaNews record) {
        return iaNewsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IaNews record) {
        return iaNewsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<IaNews> list(IaNews iaNews, PageBean pageBean) {
        return iaNewsMapper.list(iaNews);
    }
}
