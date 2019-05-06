package com.shop.ssm.sys.ia.service.impl;

import com.shop.ssm.sys.ia.model.IaState;
import com.shop.ssm.sys.ia.service.BaseTestCase;
import com.shop.ssm.sys.ia.service.IaStateService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class IaStateServiceImplTest extends BaseTestCase {

    @Autowired
    private IaStateService iaStateService;
    private IaState iaState;

    @Override
    public void before() {
        super.before();
        iaState=new IaState();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        iaState.setSname("扎随时");
        iaStateService.insert(iaState);
    }

    @Test
    public void selectByPrimaryKey() {
        iaState.setSid(1);
        iaStateService.selectByPrimaryKey(iaState);
    }

    @Test
    public void list() {
        List<IaState> list = iaStateService.list(iaState);
            System.out.println(list);

    }
}