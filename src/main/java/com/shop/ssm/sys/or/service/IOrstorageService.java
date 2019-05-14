package com.shop.ssm.sys.or.service;


import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.or.model.Orstorage;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
public interface IOrstorageService {


    int deleteByPrimaryKey(Orstorage orstorage);

    int insert(Orstorage record);

    int insertSelective(Orstorage record);

    Orstorage selectByPrimaryKey(Orstorage orstorage);

    int updateByPrimaryKeySelective(Orstorage record);

    int updateByPrimaryKey(Orstorage record);

    List<Orstorage> listOrstorage(Orstorage orstorage, PageBean pageBean);

}
