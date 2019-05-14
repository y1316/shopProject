package com.shop.ssm.sys.or.service.impl;

import com.shop.ssm.sys.ia.service.BaseTestCase;
import com.shop.ssm.sys.or.model.OrItem;
import com.shop.ssm.sys.or.service.IOrOrderService;
import com.shop.ssm.sys.pd.model.PdProduce;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

import static org.junit.Assert.*;

public class OrOrderServiceImplTest extends BaseTestCase {

    @Autowired
   private IOrOrderService orOrderService;

    private OrItem orItem;

    @Override
    public void before() {
        super.before();
        orItem=new OrItem();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        orItem.setPid(1);
        orItem.setCreatedate(new Date(System.currentTimeMillis()));
        orItem.setIcount(10);
        orItem.setIcount(100);
        orOrderService.insert(orItem);
    }

    @Test
    public void selectByPrimaryKey() {
        orItem.setIid(1);
        OrItem o = orOrderService.selectByPrimaryKey(this.orItem);
        System.out.println(o);
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void listOrItem() {

    }
}