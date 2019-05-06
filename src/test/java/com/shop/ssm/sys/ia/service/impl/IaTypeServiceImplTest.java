package com.shop.ssm.sys.ia.service.impl;

import com.shop.ssm.sys.ia.model.IaType;
import com.shop.ssm.sys.ia.service.BaseTestCase;
import com.shop.ssm.sys.ia.service.IaStateService;
import com.shop.ssm.sys.ia.service.IaTypeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class IaTypeServiceImplTest extends BaseTestCase {

    @Autowired
    private IaTypeService iaTypeService;
    private IaType iaType;
    @Override
    public void before() {
        super.before();
        iaType=new IaType();
    }

    @Test
    public void deleteByPrimaryKey() {
        iaType.setTid(4);
        iaTypeService.deleteByPrimaryKey(iaType);
    }

    @Test
    public void insert() {
        iaType.setTname("搞笑");
        iaType.setTnote("萨瓦迪卡");
        iaTypeService.insert(iaType);
    }

    @Test
    public void selectByPrimaryKey() {
        iaType.setTid(1);
        iaTypeService.selectByPrimaryKey(iaType);
    }

    @Test
    public void list() {
        List<IaType> list = iaTypeService.list(iaType);
        System.out.println(list);
    }
}