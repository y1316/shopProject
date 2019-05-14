package com.shop.ssm.sys.or.service;

import com.shop.ssm.base.utils.PageBean;
import com.shop.ssm.sys.or.model.OrItem;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
public interface IOrOrderService {

    int deleteByPrimaryKey(OrItem orItem);

    int insert(OrItem record);

    int insertSelective(OrItem record);

    OrItem selectByPrimaryKey(OrItem orItem);

    int updateByPrimaryKeySelective(OrItem record);

    int updateByPrimaryKey(OrItem record);

    List<OrItem> listOrItem(OrItem orItem, PageBean pageBean);
}
