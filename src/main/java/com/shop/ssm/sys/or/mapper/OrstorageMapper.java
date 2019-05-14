package com.shop.ssm.sys.or.mapper;

import com.shop.ssm.sys.or.model.Orstorage;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface OrstorageMapper {
    int deleteByPrimaryKey(Integer stkId);

    int insert(Orstorage record);

    int insertSelective(Orstorage record);

    Orstorage selectByPrimaryKey(Integer stkId);

    int updateByPrimaryKeySelective(Orstorage record);

    int updateByPrimaryKey(Orstorage record);

    List<Orstorage>listOrstorage(Orstorage orstorage);

}