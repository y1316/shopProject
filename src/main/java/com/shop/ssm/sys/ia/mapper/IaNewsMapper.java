package com.shop.ssm.sys.ia.mapper;

import com.shop.ssm.sys.ia.model.IaNews;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IaNewsMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(IaNews record);

    int insertSelective(IaNews record);

    IaNews selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(IaNews record);

    int updateByPrimaryKey(IaNews record);

    List<IaNews>list(IaNews iaNews);
}